
package com.zh.interfaceManager.client.pym;

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
@WebService(name = "DictService", targetNamespace = "http://dict.railway.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DictService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.zh.interfaceManager.client.pym.RsInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryStationNamesByPym", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryStationNamesByPym")
    @ResponseWrapper(localName = "queryStationNamesByPymResponse", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryStationNamesByPymResponse")
    public RsInfo queryStationNamesByPym(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.zh.interfaceManager.client.pym.RsInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryBureauCodeByStationName", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryBureauCodeByStationName")
    @ResponseWrapper(localName = "queryBureauCodeByStationNameResponse", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryBureauCodeByStationNameResponse")
    public RsInfo queryBureauCodeByStationName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.zh.interfaceManager.client.pym.RsInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryStationNamesJsonByPym", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryStationNamesJsonByPym")
    @ResponseWrapper(localName = "queryStationNamesJsonByPymResponse", targetNamespace = "http://dict.railway.com/", className = "com.zh.interfaceManager.client.pym.QueryStationNamesJsonByPymResponse")
    public RsInfo queryStationNamesJsonByPym(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
