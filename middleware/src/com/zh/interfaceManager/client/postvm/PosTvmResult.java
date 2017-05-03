package com.zh.interfaceManager.client.postvm;

import java.io.Serializable;
import java.util.List;

import com.zh.interfaceManager.client.common.Header;

public class PosTvmResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> list;
	private Header header;
	public List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> getList() {
		return list;
	}
	public void setList(List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> list) {
		this.list = list;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}

}
