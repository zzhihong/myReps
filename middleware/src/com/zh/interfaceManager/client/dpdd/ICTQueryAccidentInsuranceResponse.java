
package com.zh.interfaceManager.client.dpdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_QueryAccidentInsuranceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_QueryAccidentInsuranceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://TRSForCustomerSupportCenterServices2Service}ictInsuranceRRT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_QueryAccidentInsuranceResponse", propOrder = {
    "_return"
})
public class ICTQueryAccidentInsuranceResponse {

    @XmlElement(name = "return")
    protected IctInsuranceRRT _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link IctInsuranceRRT }
     *     
     */
    public IctInsuranceRRT getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link IctInsuranceRRT }
     *     
     */
    public void setReturn(IctInsuranceRRT value) {
        this._return = value;
    }

}
