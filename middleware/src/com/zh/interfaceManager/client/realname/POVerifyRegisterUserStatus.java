package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:12:36
 *@version: V1.0
 *@Description:
 */
public class POVerifyRegisterUserStatus implements Serializable{
	private static final long serialVersionUID = 1L;
	private CommonHeader commonHeader;
	private String registerIdNo;
	private String registerName;
	private String realName;
	private String idType;
	private String idNo;
	private String countryCode;
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public String getRegisterIdNo() {
		return registerIdNo;
	}
	public void setRegisterIdNo(String registerIdNo) {
		this.registerIdNo = registerIdNo;
	}
	public String getRegisterName() {
		return registerName;
	}
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
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
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
