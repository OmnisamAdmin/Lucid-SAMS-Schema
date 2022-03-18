
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Impairment_Type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Comments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Medical_Record_Viewed" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Medical_Record_Attached" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
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
    "impairmentType",
    "comments",
    "dataYear",
    "learnerID",
    "medicalRecordViewed",
    "medicalRecordAttached"
})
@XmlRootElement(name = "SIAS_Health_Professional_Report")
public class SIASHealthProfessionalReport {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Impairment_Type")
    protected String impairmentType;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Medical_Record_Viewed")
    @XmlSchemaType(name = "unsignedByte")
    protected Short medicalRecordViewed;
    @XmlElement(name = "Medical_Record_Attached")
    @XmlSchemaType(name = "unsignedByte")
    protected Short medicalRecordAttached;

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
     * Gets the value of the impairmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpairmentType() {
        return impairmentType;
    }

    /**
     * Sets the value of the impairmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpairmentType(String value) {
        this.impairmentType = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the medicalRecordViewed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMedicalRecordViewed() {
        return medicalRecordViewed;
    }

    /**
     * Sets the value of the medicalRecordViewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMedicalRecordViewed(Short value) {
        this.medicalRecordViewed = value;
    }

    /**
     * Gets the value of the medicalRecordAttached property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMedicalRecordAttached() {
        return medicalRecordAttached;
    }

    /**
     * Sets the value of the medicalRecordAttached property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMedicalRecordAttached(Short value) {
        this.medicalRecordAttached = value;
    }

}
