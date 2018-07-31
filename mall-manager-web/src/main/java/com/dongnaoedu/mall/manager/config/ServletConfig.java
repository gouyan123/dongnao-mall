package com.dongnaoedu.mall.manager.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ServletConfig {
	
	@Autowired
	InternalResourceViewResolver resolver;
	
	@Value("${fdfs_url}")
    private String fdfsUrl;
	
	// Spring 初始化的时候加载配置
    @PostConstruct
	public void setConfigure() {
    	Map<String, String> map = new HashMap<>();
    	map.put("fdfsUrl", fdfsUrl);
    	resolver.setAttributesMap(map);
		System.out.println(fdfsUrl + " 加载fastdfs服务地址");
	}
}
