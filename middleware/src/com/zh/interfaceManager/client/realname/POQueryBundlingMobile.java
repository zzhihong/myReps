package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.CommonHeader;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月11日上午10:37:22
 *@version: V1.0
 *@Description:
 */
public class POQueryBundlingMobile implements Serializable{

	private static final long serialVersionUID = 1L;
	private CommonHeader commonHeader;
	private String complaintIdType;
	private String complaintIdNo;
	private String phone;
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public String getComplaintIdType() {
		return complaintIdType;
	}
	public void setComplaintIdType(String complaintIdType) {
		this.complaintIdType = complaintIdType;
	}
	public String getComplaintIdNo() {
		return complaintIdNo;
	}
	public void setComplaintIdNo(String complaintIdNo) {
		this.complaintIdNo = complaintIdNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
