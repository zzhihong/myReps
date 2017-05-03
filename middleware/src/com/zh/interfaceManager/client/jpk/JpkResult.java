package com.zh.interfaceManager.client.jpk;

import java.io.Serializable;
import java.util.List;


import com.zh.interfaceManager.client.common.Header;






public class JpkResult implements Serializable{
	
	public List<Wb10TrainPlatform> getList() {
		return list;
	}
	public void setList(List<Wb10TrainPlatform> list2) {
		this.list = list2;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	private static final long serialVersionUID = 1L;
	private List<Wb10TrainPlatform> list;
	private Header header;
	@Override
	public String toString() {
		return "JpkResult [list=" + list + ", header=" + header + "]";
	}
	
}
