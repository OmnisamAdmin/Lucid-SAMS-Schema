
package za.co.sfy.sams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolicyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GovType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateOriginated" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatePresented" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Approved" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateAmended" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateSubmitted" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateApproved" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyId",
    "govType",
    "dateOriginated",
    "datePresented",
    "approved",
    "dateAmended",
    "dateSubmitted",
    "dateApproved"
})
@XmlRootElement(name = "GovPoliciesRecords")
public class GovPoliciesRecords {

    @XmlElement(name = "PolicyId")
    protected Integer policyId;
    @XmlElement(name = "GovType")
    protected String govType;
    @XmlElement(name = "DateOriginated")
    protected String dateOriginated;
    @XmlElement(name = "DatePresented")
    protected String datePresented;
    @XmlElement(name = "Approved")
    protected String approved;
    @XmlElement(name = "DateAmended")
    protected String dateAmended;
    @XmlElement(name = "DateSubmitted")
    protected String dateSubmitted;
    @XmlElement(name = "DateApproved")
    protected String dateApproved;

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyId(Integer value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the govType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovType() {
        return govType;
    }

    /**
     * Sets the value of the govType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovType(String value) {
        this.govType = value;
    }

    /**
     * Gets the value of the dateOriginated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOriginated() {
        return dateOriginated;
    }

    /**
     * Sets the value of the dateOriginated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOriginated(String value) {
        this.dateOriginated = value;
    }

    /**
     * Gets the value of the datePresented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePresented() {
        return datePresented;
    }

    /**
     * Sets the value of the datePresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePresented(String value) {
        this.datePresented = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproved(String value) {
        this.approved = value;
    }

    /**
     * Gets the value of the dateAmended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAmended() {
        return dateAmended;
    }

    /**
     * Sets the value of the dateAmended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAmended(String value) {
        this.dateAmended = value;
    }

    /**
     * Gets the value of the dateSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Sets the value of the dateSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSubmitted(String value) {
        this.dateSubmitted = value;
    }

    /**
     * Gets the value of the dateApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateApproved() {
        return dateApproved;
    }

    /**
     * Sets the value of the dateApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateApproved(String value) {
        this.dateApproved = value;
    }

}
