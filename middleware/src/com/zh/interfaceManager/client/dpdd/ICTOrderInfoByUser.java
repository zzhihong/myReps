
package com.zh.interfaceManager.client.dpdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_OrderInfoByUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_OrderInfoByUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iCT_OrderInfoByUserRQ2" type="{http://TRSForCustomerSupportCenterServices2Service}ictOrderInfoByUserRQ2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_OrderInfoByUser", propOrder = {
    "ictOrderInfoByUserRQ2"
})
public class ICTOrderInfoByUser {

    @XmlElement(name = "iCT_OrderInfoByUserRQ2")
    protected IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ2;

    /**
     * Gets the value of the ictOrderInfoByUserRQ2 property.
     * 
     * @return
     *     possible object is
     *     {@link IctOrderInfoByUserRQ2 }
     *     
     */
    public IctOrderInfoByUserRQ2 getICTOrderInfoByUserRQ2() {
        return ictOrderInfoByUserRQ2;
    }

    /**
     * Sets the value of the ictOrderInfoByUserRQ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IctOrderInfoByUserRQ2 }
     *     
     */
    public void setICTOrderInfoByUserRQ2(IctOrderInfoByUserRQ2 value) {
        this.ictOrderInfoByUserRQ2 = value;
    }

}
