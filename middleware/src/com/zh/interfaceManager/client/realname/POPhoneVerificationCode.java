package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:27:38
 *@version: V1.0
 *@Description:
 */
public class POPhoneVerificationCode implements Serializable{
	private static final long serialVersionUID = 1L;
	private CommonHeader commonHeader;
	private String phone;
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
