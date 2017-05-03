
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictOrderInfoByUserRS2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictOrderInfoByUserRS2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://TRSForCustomerSupportCenterServices2Service}ictOrderInfoByUserBO2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://TRSForCustomerSupportCenterServices2Service}serviceHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictOrderInfoByUserRS2", propOrder = {
    "body",
    "header"
})
public class IctOrderInfoByUserRS2 implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(nillable = true)
    protected List<IctOrderInfoByUserBO2> body;
    protected ServiceHeader header;

    @Override
	public String toString() {
		return "IctOrderInfoByUserRS2 [body=" + body + ", header=" + header
				+ "]";
	}

	/**
     * Gets the value of the body property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the body property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IctOrderInfoByUserBO2 }
     * 
     * 
     */
    public List<IctOrderInfoByUserBO2> getBody() {
        if (body == null) {
            body = new ArrayList<IctOrderInfoByUserBO2>();
        }
        return this.body;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setHeader(ServiceHeader value) {
        this.header = value;
    }

}
