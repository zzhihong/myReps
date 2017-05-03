package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import com.zh.interfaceManager.client.common.Header;

/**
 *@author: zzh
 *@createtime: 2016-3-15下午3:49:28
 *@version: V1.0
 *@Description:
 */
public class IctOrderInfoByUserRS2Pojo implements Serializable{
	private static final long serialVersionUID = 1L;
	private IctOrderInfoByUserRS2 ictOrderInfoByUserRS2;
	private Header header;
	public IctOrderInfoByUserRS2 getIctOrderInfoByUserRS2() {
		return ictOrderInfoByUserRS2;
	}
	public void setIctOrderInfoByUserRS2(IctOrderInfoByUserRS2 ictOrderInfoByUserRS2) {
		this.ictOrderInfoByUserRS2 = ictOrderInfoByUserRS2;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	@Override
	public String toString() {
		return "IctOrderInfoByUserRS2Pojo [ictOrderInfoByUserRS2="
				+ ictOrderInfoByUserRS2 + ", header=" + header + "]";
	}
}

