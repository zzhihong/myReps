package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import com.zh.interfaceManager.client.dpdd.CommonHeader;

/**
 *@author: zzh
 *@createtime: 2016-3-10下午4:33:24
 *@version: V1.0
 *@Description:保险参数类
 */
public class InsurancePojo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private CommonHeader commonHeader;
	private String saleStartDate;
	private String saleEndDate;
	private String insureIdType;
	private String insureIdNo;
	private String insuranceNo;
	private String sequenceNo;
	private String loginName;
	public CommonHeader getCommonHeader() {
		return commonHeader;
	}
	public void setCommonHeader(CommonHeader commonHeader) {
		this.commonHeader = commonHeader;
	}
	public String getSaleStartDate() {
		return saleStartDate;
	}
	public void setSaleStartDate(String saleStartDate) {
		this.saleStartDate = saleStartDate;
	}
	public String getSaleEndDate() {
		return saleEndDate;
	}
	public void setSaleEndDate(String saleEndDate) {
		this.saleEndDate = saleEndDate;
	}
	public String getInsureIdType() {
		return insureIdType;
	}
	public void setInsureIdType(String insureIdType) {
		this.insureIdType = insureIdType;
	}
	public String getInsureIdNo() {
		return insureIdNo;
	}
	public void setInsureIdNo(String insureIdNo) {
		this.insureIdNo = insureIdNo;
	}
	public String getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public InsurancePojo(CommonHeader commonHeader, String saleStartDate,
			String saleEndDate, String insureIdType, String insureIdNo,
			String insuranceNo, String sequenceNo, String loginName) {
		super();
		this.commonHeader = commonHeader;
		this.saleStartDate = saleStartDate;
		this.saleEndDate = saleEndDate;
		this.insureIdType = insureIdType;
		this.insureIdNo = insureIdNo;
		this.insuranceNo = insuranceNo;
		this.sequenceNo = sequenceNo;
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "InsurancePojo [commonHeader=" + commonHeader
				+ ", saleStartDate=" + saleStartDate + ", saleEndDate="
				+ saleEndDate + ", insureIdType=" + insureIdType
				+ ", insureIdNo=" + insureIdNo + ", insuranceNo=" + insuranceNo
				+ ", sequenceNo=" + sequenceNo + ", loginName=" + loginName
				+ "]";
	}

}

