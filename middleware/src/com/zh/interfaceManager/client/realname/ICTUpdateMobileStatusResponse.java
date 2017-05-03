
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_UpdateMobileStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_UpdateMobileStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ManageUserInfoWebServiceWS}responseEntityVerifyMobile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_UpdateMobileStatusResponse", propOrder = {
    "_return"
})
public class ICTUpdateMobileStatusResponse  implements Serializable{

    @XmlElement(name = "return")
    protected ResponseEntityVerifyMobile _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEntityVerifyMobile }
     *     
     */
    public ResponseEntityVerifyMobile getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEntityVerifyMobile }
     *     
     */
    public void setReturn(ResponseEntityVerifyMobile value) {
        this._return = value;
    }

}
