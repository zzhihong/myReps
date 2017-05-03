package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.config.ExceptionMes;
import com.zh.interfaceManager.client.realname.ResponseEntityPhoneVerificationCode;


/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:29:00
 *@version: V1.0
 *@Description:
 */
public class ReResponseEntityPhoneVerificationCode implements Serializable{
	private static final long serialVersionUID = 1L;
	private ResponseEntityPhoneVerificationCode re;
	public ResponseEntityPhoneVerificationCode getRe() {
		return re;
	}
	public void setRe(ResponseEntityPhoneVerificationCode re) {
		this.re = re;
	}
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
}
