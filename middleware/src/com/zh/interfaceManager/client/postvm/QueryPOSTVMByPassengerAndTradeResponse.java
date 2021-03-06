
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryPOSTVMByPassengerAndTradeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryPOSTVMByPassengerAndTradeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}ictQueryPOSTVMTransactionInfoByTicketInfoRes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryPOSTVMByPassengerAndTradeResponse", propOrder = {
    "_return"
})
public class QueryPOSTVMByPassengerAndTradeResponse {

    @XmlElement(name = "return")
    protected IctQueryPOSTVMTransactionInfoByTicketInfoRes _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link IctQueryPOSTVMTransactionInfoByTicketInfoRes }
     *     
     */
    public IctQueryPOSTVMTransactionInfoByTicketInfoRes getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link IctQueryPOSTVMTransactionInfoByTicketInfoRes }
     *     
     */
    public void setReturn(IctQueryPOSTVMTransactionInfoByTicketInfoRes value) {
        this._return = value;
    }

}
