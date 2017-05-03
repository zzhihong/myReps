package com.zh.interfaceManager.service.dpdd.impl;

import com.zh.interfaceManager.client.dpdd.CommonHeader;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRQ2;
import com.zh.interfaceManager.client.dpdd.InsurancePojo;
import com.zh.interfaceManager.client.dpdd.InsuranceRRTPojo;
import com.zh.interfaceManager.client.dpdd.ListIctOrderInfoByUserBO2Pojo;
import com.zh.interfaceManager.client.dpdd.ListInsuranceRRTPojo;


/**
 *@author: zzh
 *@createtime: 2016-3-11上午9:36:37
 *@version: V1.0
 *@Description:
 */
public class Test {
	public static void main(String[] args) {
		CommonHeader commonHeader = new CommonHeader();
		commonHeader.setBureauCode("P");
		commonHeader.setOperatorNo("10000");
		commonHeader.setSrcIP("10.1.126.155");
		String saleStartDate="20160203";
		String saleEndDate="20160210";
		String insureIdType="1";
		String insureIdNo="350302199110101612";
		String insuranceNo="";
		String sequenceNo="";
		String loginName="";
		
		InsurancePojo insurancePojo=new InsurancePojo(commonHeader, saleStartDate, saleEndDate, insureIdType, insureIdNo, insuranceNo, sequenceNo, loginName);
		
		DPDD dpdd = DPDD.getInstance();
		ListInsuranceRRTPojo listInsuranceRRTPojo = dpdd.getInsuranceWebService(insurancePojo);
		System.out.println(listInsuranceRRTPojo);
		InsuranceRRTPojo ictInsuranceRRT = dpdd.getIctInsuranceRRT(insurancePojo);
		System.out.println(ictInsuranceRRT);
		
		String passengerIDType="1";
	    String passengerIdNo="350302199110101612";
	    String platSequenceNo="";
	    String reserveTimeFrom="20151101";
	    String reserveTimeTo="20151230";
	    String reserverIDType="";
	    String reserverIdNo="";
	    String saleMode="9";
	    String trainDate="";
	    IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ2 = new IctOrderInfoByUserRQ2();
	    ictOrderInfoByUserRQ2.setPassengerIdNo(passengerIdNo);
	    ictOrderInfoByUserRQ2.setPassengerIDType(passengerIDType);
	    ictOrderInfoByUserRQ2.setPlatSequenceNo(platSequenceNo);
	    ictOrderInfoByUserRQ2.setReserverIdNo(reserverIdNo);
	    ictOrderInfoByUserRQ2.setReserverIDType(reserverIDType);
	    ictOrderInfoByUserRQ2.setReserveTimeFrom(reserveTimeFrom);
	    ictOrderInfoByUserRQ2.setReserveTimeTo(reserveTimeTo);
	    ictOrderInfoByUserRQ2.setSaleMode(saleMode);
	    ictOrderInfoByUserRQ2.setSequenceNo(sequenceNo);
	    ictOrderInfoByUserRQ2.setTrainDate(trainDate);
	    ListIctOrderInfoByUserBO2Pojo wwwZhcxFromWebService = dpdd.getWWWZhcxFromWebService(ictOrderInfoByUserRQ2);
	    System.out.println(wwwZhcxFromWebService);
	}
}

