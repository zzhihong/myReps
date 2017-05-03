package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.dpdd.IctInsuranceRRT;

/**
 *@author: zzh
 *@createtime: 2016-3-11上午10:27:24
 *@version: V1.0
 *@Description:
 */
public class InsuranceRRTPojo implements Serializable{
	private static final long serialVersionUID = 1L;
	private IctInsuranceRRT ictInsuranceRRT;
	private Header header;
	public IctInsuranceRRT getIctInsuranceRRT() {
		return ictInsuranceRRT;
	}
	public void setIctInsuranceRRT(IctInsuranceRRT ictInsuranceRRT) {
		this.ictInsuranceRRT = ictInsuranceRRT;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	@Override
	public String toString() {
		return "InsuranceRRTPojo [ictInsuranceRRT=" + ictInsuranceRRT
				+ ", header=" + header + "]";
	}
	
}

