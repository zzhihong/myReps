package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;
import java.util.List;

import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.dpdd.InsuranceRRT;

/**
 *@author: zzh
 *@createtime: 2016-3-10下午5:22:49
 *@version: V1.0
 *@Description:
 */
public class ListInsuranceRRTPojo implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<InsuranceRRT> listInsuranceRRT;
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public List<InsuranceRRT> getListInsuranceRRT() {
		return listInsuranceRRT;
	}
	public void setListInsuranceRRT(List<InsuranceRRT> listInsuranceRRT) {
		this.listInsuranceRRT = listInsuranceRRT;
	}
	@Override
	public String toString() {
		return "ListInsuranceRRTPojo [listInsuranceRRT=" + listInsuranceRRT
				+ ", header=" + header + "]";
	}

}

