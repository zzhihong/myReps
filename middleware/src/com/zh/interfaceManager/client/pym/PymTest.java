package com.zh.interfaceManager.client.pym;

import java.io.Serializable;

public class PymTest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pym;

	public PymTest(String pym) {
		super();
		this.pym = pym;
	}

	public String getPym() {
		return pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

}
