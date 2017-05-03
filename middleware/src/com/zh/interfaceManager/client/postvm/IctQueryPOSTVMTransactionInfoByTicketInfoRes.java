
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictQueryPOSTVMTransactionInfoByTicketInfoRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictQueryPOSTVMTransactionInfoByTicketInfoRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}baseDomainObject">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}bodyICTQueryPOSTVMTransactionInfoByTicketInfo" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}ictHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictQueryPOSTVMTransactionInfoByTicketInfoRes", propOrder = {
    "body",
    "header"
})
public class IctQueryPOSTVMTransactionInfoByTicketInfoRes
    extends BaseDomainObject
{

    protected BodyICTQueryPOSTVMTransactionInfoByTicketInfo body;
    protected IctHeader header;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BodyICTQueryPOSTVMTransactionInfoByTicketInfo }
     *     
     */
    public BodyICTQueryPOSTVMTransactionInfoByTicketInfo getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyICTQueryPOSTVMTransactionInfoByTicketInfo }
     *     
     */
    public void setBody(BodyICTQueryPOSTVMTransactionInfoByTicketInfo value) {
        this.body = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link IctHeader }
     *     
     */
    public IctHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link IctHeader }
     *     
     */
    public void setHeader(IctHeader value) {
        this.header = value;
    }

}
