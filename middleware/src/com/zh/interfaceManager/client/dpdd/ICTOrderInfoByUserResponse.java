
package com.zh.interfaceManager.client.dpdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_OrderInfoByUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_OrderInfoByUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://TRSForCustomerSupportCenterServices2Service}ictOrderInfoByUserRS2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_OrderInfoByUserResponse", propOrder = {
    "_return"
})
public class ICTOrderInfoByUserResponse {

    @XmlElement(name = "return")
    protected IctOrderInfoByUserRS2 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link IctOrderInfoByUserRS2 }
     *     
     */
    public IctOrderInfoByUserRS2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link IctOrderInfoByUserRS2 }
     *     
     */
    public void setReturn(IctOrderInfoByUserRS2 value) {
        this._return = value;
    }

}
