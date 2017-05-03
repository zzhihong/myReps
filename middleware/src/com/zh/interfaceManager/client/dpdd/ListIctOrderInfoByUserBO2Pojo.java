package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;
import java.util.List;

import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserBO2;



/**
 *@author: zzh
 *@createtime: 2016-3-11下午2:32:58
 *@version: V1.0
 *@Description:
 */
public class ListIctOrderInfoByUserBO2Pojo implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<IctOrderInfoByUserBO2> listIctOrderInfoByUserBO2;
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public List<IctOrderInfoByUserBO2> getListIctOrderInfoByUserBO2() {
		return listIctOrderInfoByUserBO2;
	}
	public void setListIctOrderInfoByUserBO2(
			List<IctOrderInfoByUserBO2> listIctOrderInfoByUserBO2) {
		this.listIctOrderInfoByUserBO2 = listIctOrderInfoByUserBO2;
	}
	@Override
	public String toString() {
		return "ListIctOrderInfoByUserBO2Pojo [listIctOrderInfoByUserBO2="
				+ listIctOrderInfoByUserBO2 + ", header=" + header + "]";
	}

}

