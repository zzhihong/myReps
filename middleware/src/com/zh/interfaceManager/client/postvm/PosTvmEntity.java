package com.zh.interfaceManager.client.postvm;

import java.io.Serializable;

public class PosTvmEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String saleDateFrom;
	private String saleDataTo;
	private String tradeNo;
	private String idType;
	private String idNo;
	
	

	public PosTvmEntity(String saleDateFrom, String saleDataTo, String tradeNo,
			String idType, String idNo) {
		super();
		this.saleDateFrom = saleDateFrom;
		this.saleDataTo = saleDataTo;
		this.tradeNo = tradeNo;
		this.idType = idType;
		this.idNo = idNo;
	}

	public String getSaleDateFrom() {
		return saleDateFrom;
	}

	public void setSaleDateFrom(String saleDateFrom) {
		this.saleDateFrom = saleDateFrom;
	}

	public String getSaleDataTo() {
		return saleDataTo;
	}

	public void setSaleDataTo(String saleDataTo) {
		this.saleDataTo = saleDataTo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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

	@Override
	public String toString() {
		return "PosTvmEntity [saleDateFrom=" + saleDateFrom + ", saleDataTo="
				+ saleDataTo + ", tradeNo=" + tradeNo + ", idType=" + idType
				+ ", idNo=" + idNo + "]";
	}

}
