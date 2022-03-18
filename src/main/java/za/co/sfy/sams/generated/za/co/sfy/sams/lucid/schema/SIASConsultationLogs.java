
package za.co.sfy.sams.lucid.schema;

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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Consultation_Date" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Consultation_Purpose" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Consultation_Outcome" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Consultation_Views_by_parent" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Signed_by_Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Designation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Date_Signed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "id",
    "learnerID",
    "consultationDate",
    "consultationPurpose",
    "consultationOutcome",
    "consultationViewsByParent",
    "signedByName",
    "designation",
    "signature",
    "dateSigned",
    "dataYear"
})
@XmlRootElement(name = "SIAS_Consultation_Logs")
public class SIASConsultationLogs {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Consultation_Date")
    protected String consultationDate;
    @XmlElement(name = "Consultation_Purpose")
    protected String consultationPurpose;
    @XmlElement(name = "Consultation_Outcome")
    protected String consultationOutcome;
    @XmlElement(name = "Consultation_Views_by_parent")
    protected String consultationViewsByParent;
    @XmlElement(name = "Signed_by_Name")
    protected String signedByName;
    @XmlElement(name = "Designation")
    protected String designation;
    @XmlElement(name = "Signature")
    protected boolean signature;
    @XmlElement(name = "Date_Signed")
    protected String dateSigned;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerID(String value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the consultationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationDate() {
        return consultationDate;
    }

    /**
     * Sets the value of the consultationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationDate(String value) {
        this.consultationDate = value;
    }

    /**
     * Gets the value of the consultationPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationPurpose() {
        return consultationPurpose;
    }

    /**
     * Sets the value of the consultationPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationPurpose(String value) {
        this.consultationPurpose = value;
    }

    /**
     * Gets the value of the consultationOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationOutcome() {
        return consultationOutcome;
    }

    /**
     * Sets the value of the consultationOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationOutcome(String value) {
        this.consultationOutcome = value;
    }

    /**
     * Gets the value of the consultationViewsByParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultationViewsByParent() {
        return consultationViewsByParent;
    }

    /**
     * Sets the value of the consultationViewsByParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultationViewsByParent(String value) {
        this.consultationViewsByParent = value;
    }

    /**
     * Gets the value of the signedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedByName() {
        return signedByName;
    }

    /**
     * Sets the value of the signedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedByName(String value) {
        this.signedByName = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     */
    public boolean isSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     */
    public void setSignature(boolean value) {
        this.signature = value;
    }

    /**
     * Gets the value of the dateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSigned() {
        return dateSigned;
    }

    /**
     * Sets the value of the dateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSigned(String value) {
        this.dateSigned = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

}
