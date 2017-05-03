package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月11日上午10:45:53
 *@version: V1.0
 *@Description:
 */
public class POUnbundlMobile implements Serializable{

	private static final long serialVersionUID = 1L;
	private CommonHeader commonHeader;
	private String idType;
	private String idNo;
	private String phone;
	private String tranData;
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
	public String getTranData() {
		return tranData;
	}
	public void setTranData(String tranData) {
		this.tranData = tranData;
	}
	
}
