
package com.zh.interfaceManager.client.pym;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.zh.interfaceManager.client.common.Header;



public class ObjRsInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	protected RsInfo rsinfo;
    
    private Header header;

	public ObjRsInfo(RsInfo rsinfo, Header header) {
		super();
		this.rsinfo = rsinfo;
		this.header = header;
	}

	public RsInfo getRsinfo() {
		return rsinfo;
	}

	public void setRsinfo(RsInfo rsinfo) {
		this.rsinfo = rsinfo;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	@Override
	public String toString() {
		return "ObjRsInfo [rsinfo=" + rsinfo + ", header=" + header + "]";
	}

	public ObjRsInfo() {
		super();
	}
    

    
   
}
