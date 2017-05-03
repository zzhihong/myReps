
package com.zh.interfaceManager.client.postvm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bodyICTQueryPOSTVMTransactionInfoByTicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyICTQueryPOSTVMTransactionInfoByTicketInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}baseDomainObject">
 *       &lt;sequence>
 *         &lt;element name="listPOSTVMTransactionInfo" type="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}boICTQueryPOSTVMTransactionInfoByTicketInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyICTQueryPOSTVMTransactionInfoByTicketInfo", propOrder = {
    "listPOSTVMTransactionInfo"
})
public class BodyICTQueryPOSTVMTransactionInfoByTicketInfo
    extends BaseDomainObject
{

    @XmlElement(nillable = true)
    protected List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> listPOSTVMTransactionInfo;

    /**
     * Gets the value of the listPOSTVMTransactionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPOSTVMTransactionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPOSTVMTransactionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoICTQueryPOSTVMTransactionInfoByTicketInfo }
     * 
     * 
     */
    public List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> getListPOSTVMTransactionInfo() {
        if (listPOSTVMTransactionInfo == null) {
            listPOSTVMTransactionInfo = new ArrayList<BoICTQueryPOSTVMTransactionInfoByTicketInfo>();
        }
        return this.listPOSTVMTransactionInfo;
    }

}
