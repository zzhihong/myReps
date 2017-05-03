package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;
import com.zh.interfaceManager.client.realname.RegisterUser;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月9日上午11:13:24
 *@version: V1.0
 *@Description:
 */
@SuppressWarnings("serial")
public class POQueryUserInfo implements Serializable{
	
	private CommonHeader commonHeader;
	private RegisterUser registerUser;
	private String tranData;
	
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public RegisterUser getRegisterUser() {
		return registerUser;
	}
	public void setRegisterUser(RegisterUser registerUser) {
		this.registerUser = registerUser;
	}
	public String getTranData() {
		return tranData;
	}
	public void setTranData(String tranData) {
		this.tranData = tranData;
	}
	
}
