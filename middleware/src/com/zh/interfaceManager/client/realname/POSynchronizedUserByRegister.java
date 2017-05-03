package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:21:59
 *@version: V1.0
 *@Description:
 */
public class POSynchronizedUserByRegister implements Serializable{
	private static final long serialVersionUID = 1L;
	private CommonHeader commonHeader;
	private String idType;
	private String idNo;
	private String phone;
	private String registerUserName;
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegisterUserName() {
		return registerUserName;
	}
	public void setRegisterUserName(String registerUserName) {
		this.registerUserName = registerUserName;
	}
}
