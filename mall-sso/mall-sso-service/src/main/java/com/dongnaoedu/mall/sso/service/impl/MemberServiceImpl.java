package com.dongnaoedu.mall.sso.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.dongnaoedu.mall.common.exception.XmallException;
import com.dongnaoedu.mall.common.fastdfs.FastDFSClient;
import com.dongnaoedu.mall.common.fastdfs.FastDFSFile;
import com.dongnaoedu.mall.common.jedis.JedisClient;
import com.dongnaoedu.mall.common.utils.FileUtil;
import com.dongnaoedu.mall.manager.dto.front.Member;
import com.dongnaoedu.mall.manager.mapper.TbMemberMapper;
import com.dongnaoedu.mall.manager.pojo.TbMember;
import com.dongnaoedu.mall.sso.service.LoginService;
import com.dongnaoedu.mall.sso.service.MemberService;
import com.esotericsoftware.minlog.Log;
import com.google.gson.Gson;

/**
 * @author allen
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private LoginService loginService;
	@Autowired
	private TbMemberMapper tbMemberMapper;
	@Autowired
	private JedisClient jedisClient;
	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	@Override
	public String imageUpload(Long userId, String token, String imgData) {

		// 过滤data:URL
		String base64 = FileUtil.base64Data(imgData);
		byte[] bs = Base64Utils.decodeFromString(base64);
		
		FastDFSFile file = new FastDFSFile(UUID.randomUUID() + "", bs, "png");
		String[] fileAbsolutePath = FastDFSClient.upload(file);
		
		if (fileAbsolutePath == null) {
			Log.error("upload file failed,please upload again!");
			throw new XmallException("上传头像失败");
		}
		String imgPath = fileAbsolutePath[0] + "/" + fileAbsolutePath[1];

		TbMember tbMember = tbMemberMapper.selectByPrimaryKey(userId);
		if (tbMember == null) {
			throw new XmallException("通过id获取用户失败");
		}
		tbMember.setFile(imgPath);
		if (tbMemberMapper.updateByPrimaryKey(tbMember) != 1) {
			throw new XmallException("更新用户头像失败");
		}

		// 更新缓存
		Member member = loginService.getUserByToken(token);
		member.setFile(imgPath);
		jedisClient.set("SESSION:" + token, new Gson().toJson(member));
		return imgPath;
	}
}
