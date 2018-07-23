package com.dongnaoedu.mall.common.exception;

/**
 * 文件上次全局异常处理
 * 
 * @author allen
 */
public class XmallUploadException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String msg;

	public XmallUploadException(String msg) {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
