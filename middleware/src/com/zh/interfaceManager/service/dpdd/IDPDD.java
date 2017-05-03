package com.zh.interfaceManager.service.dpdd;


import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRQ2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRS2Pojo;
import com.zh.interfaceManager.client.dpdd.InsurancePojo;
import com.zh.interfaceManager.client.dpdd.InsuranceRRTPojo;
import com.zh.interfaceManager.client.dpdd.ListIctOrderInfoByUserBO2Pojo;
import com.zh.interfaceManager.client.dpdd.ListInsuranceRRTPojo;



/**
 *@author: zzh
 *@createtime: 2016-3-10下午4:25:13
 *@version: V1.0
 *@Description:订票订单查询，保险查询
 */
public interface IDPDD {
	//获取订票订单数据
	public ListIctOrderInfoByUserBO2Pojo getWWWZhcxFromWebService(IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ);
	//多条保险订单查询
	public ListInsuranceRRTPojo getInsuranceWebService(InsurancePojo insurancePojo);
	//单条保险订单查询
	public InsuranceRRTPojo getIctInsuranceRRT(InsurancePojo insurancePojo);
	//交易信息
	public IctOrderInfoByUserRS2Pojo getDealInfoWebService(IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ);
}

