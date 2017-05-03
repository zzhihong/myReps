
package com.zh.interfaceManager.client.postvm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICTPOSTVMQueryServiceEndPoint", targetNamespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICTPOSTVMQueryServiceEndPoint {


    /**
     * 
     * @param idNo
     * @param returnDateFrom
     * @param idType
     * @param returnDateTo
     * @param queryType
     * @param trainCode
     * @param saleOffice
     * @param saleDateFrom
     * @param tradeNo
     * @param saleDataTo
     * @param ticket21Info
     * @param saleMode
     * @param ticketNo
     * @param saleStation
     * @param returnStation
     * @param seatNo
     * @param toStationName
     * @param coachNo
     * @param trainDate
     * @param fromStationName
     * @return
     *     returns com.zh.interfaceManager.client.postvm.IctQueryPOSTVMTransactionInfoByTicketInfoRes
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryPOSTVM", targetNamespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", className = "com.zh.interfaceManager.client.postvm.QueryPOSTVM")
    @ResponseWrapper(localName = "queryPOSTVMResponse", targetNamespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", className = "com.zh.interfaceManager.client.postvm.QueryPOSTVMResponse")
    public IctQueryPOSTVMTransactionInfoByTicketInfoRes queryPOSTVM(
        @WebParam(name = "saleDateFrom", targetNamespace = "")
        String saleDateFrom,
        @WebParam(name = "saleDataTo", targetNamespace = "")
        String saleDataTo,
        @WebParam(name = "saleStation", targetNamespace = "")
        String saleStation,
        @WebParam(name = "returnDateFrom", targetNamespace = "")
        String returnDateFrom,
        @WebParam(name = "returnDateTo", targetNamespace = "")
        String returnDateTo,
        @WebParam(name = "returnStation", targetNamespace = "")
        String returnStation,
        @WebParam(name = "saleMode", targetNamespace = "")
        String saleMode,
        @WebParam(name = "queryType", targetNamespace = "")
        String queryType,
        @WebParam(name = "tradeNo", targetNamespace = "")
        String tradeNo,
        @WebParam(name = "ticket21info", targetNamespace = "")
        String ticket21Info,
        @WebParam(name = "trainDate", targetNamespace = "")
        String trainDate,
        @WebParam(name = "trainCode", targetNamespace = "")
        String trainCode,
        @WebParam(name = "fromStationName", targetNamespace = "")
        String fromStationName,
        @WebParam(name = "toStationName", targetNamespace = "")
        String toStationName,
        @WebParam(name = "coachNo", targetNamespace = "")
        String coachNo,
        @WebParam(name = "seatNo", targetNamespace = "")
        String seatNo,
        @WebParam(name = "ticketNo", targetNamespace = "")
        String ticketNo,
        @WebParam(name = "saleOffice", targetNamespace = "")
        String saleOffice,
        @WebParam(name = "idType", targetNamespace = "")
        String idType,
        @WebParam(name = "idNo", targetNamespace = "")
        String idNo);

    /**
     * 
     * @param idNo
     * @param idType
     * @param tradeNo
     * @param saleDateFrom
     * @param saleDataTo
     * @return
     *     returns com.zh.interfaceManager.client.postvm.IctQueryPOSTVMTransactionInfoByTicketInfoRes
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryPOSTVMByPassengerAndTrade", targetNamespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", className = "com.zh.interfaceManager.client.postvm.QueryPOSTVMByPassengerAndTrade")
    @ResponseWrapper(localName = "queryPOSTVMByPassengerAndTradeResponse", targetNamespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", className = "com.zh.interfaceManager.client.postvm.QueryPOSTVMByPassengerAndTradeResponse")
    public IctQueryPOSTVMTransactionInfoByTicketInfoRes queryPOSTVMByPassengerAndTrade(
        @WebParam(name = "saleDateFrom", targetNamespace = "")
        String saleDateFrom,
        @WebParam(name = "saleDataTo", targetNamespace = "")
        String saleDataTo,
        @WebParam(name = "idType", targetNamespace = "")
        String idType,
        @WebParam(name = "idNo", targetNamespace = "")
        String idNo,
        @WebParam(name = "tradeNo", targetNamespace = "")
        String tradeNo);

}
