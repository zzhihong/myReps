
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictInsuranceRRT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictInsuranceRRT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://TRSForCustomerSupportCenterServices2Service}exceptionEntity" minOccurs="0"/>
 *         &lt;element name="insuranceRRTList" type="{http://TRSForCustomerSupportCenterServices2Service}insuranceRRT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictInsuranceRRT", propOrder = {
    "header",
    "insuranceRRTList"
})
public class IctInsuranceRRT implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "IctInsuranceRRT [header=" + header + ", insuranceRRTList="
				+ insuranceRRTList + "]";
	}

	protected ExceptionEntity header;
    @XmlElement(nillable = true)
    protected List<InsuranceRRT> insuranceRRTList;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionEntity }
     *     
     */
    public ExceptionEntity getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionEntity }
     *     
     */
    public void setHeader(ExceptionEntity value) {
        this.header = value;
    }

    /**
     * Gets the value of the insuranceRRTList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceRRTList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceRRTList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceRRT }
     * 
     * 
     */
    public List<InsuranceRRT> getInsuranceRRTList() {
        if (insuranceRRTList == null) {
            insuranceRRTList = new ArrayList<InsuranceRRT>();
        }
        return this.insuranceRRTList;
    }

}
