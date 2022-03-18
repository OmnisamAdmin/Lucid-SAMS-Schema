
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
 *         &lt;element name="ExamYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="NoFeeCandidate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNEAccommodationConcession" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecialNeedsCodes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalCode" minOccurs="0"&gt;
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
    "examYear",
    "learnerID",
    "registrationType",
    "noFeeCandidate",
    "sneAccommodationConcession",
    "specialNeedsCodes",
    "postalAddress1",
    "postalAddress2",
    "postalAddress3",
    "postalCode"
})
@XmlRootElement(name = "LearnerExamRegistrationV2")
public class LearnerExamRegistrationV2 {

    @XmlElement(name = "ExamYear")
    protected Integer examYear;
    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "RegistrationType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short registrationType;
    @XmlElement(name = "NoFeeCandidate")
    protected String noFeeCandidate;
    @XmlElement(name = "SNEAccommodationConcession")
    protected String sneAccommodationConcession;
    @XmlElement(name = "SpecialNeedsCodes")
    protected String specialNeedsCodes;
    @XmlElement(name = "PostalAddress1")
    protected String postalAddress1;
    @XmlElement(name = "PostalAddress2")
    protected String postalAddress2;
    @XmlElement(name = "PostalAddress3")
    protected String postalAddress3;
    @XmlElement(name = "PostalCode")
    protected String postalCode;

    /**
     * Gets the value of the examYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExamYear() {
        return examYear;
    }

    /**
     * Sets the value of the examYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExamYear(Integer value) {
        this.examYear = value;
    }

    /**
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerID(Integer value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegistrationType(Short value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the noFeeCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFeeCandidate() {
        return noFeeCandidate;
    }

    /**
     * Sets the value of the noFeeCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFeeCandidate(String value) {
        this.noFeeCandidate = value;
    }

    /**
     * Gets the value of the sneAccommodationConcession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNEAccommodationConcession() {
        return sneAccommodationConcession;
    }

    /**
     * Sets the value of the sneAccommodationConcession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNEAccommodationConcession(String value) {
        this.sneAccommodationConcession = value;
    }

    /**
     * Gets the value of the specialNeedsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeedsCodes() {
        return specialNeedsCodes;
    }

    /**
     * Sets the value of the specialNeedsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeedsCodes(String value) {
        this.specialNeedsCodes = value;
    }

    /**
     * Gets the value of the postalAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress1() {
        return postalAddress1;
    }

    /**
     * Sets the value of the postalAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress1(String value) {
        this.postalAddress1 = value;
    }

    /**
     * Gets the value of the postalAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress2() {
        return postalAddress2;
    }

    /**
     * Sets the value of the postalAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress2(String value) {
        this.postalAddress2 = value;
    }

    /**
     * Gets the value of the postalAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress3() {
        return postalAddress3;
    }

    /**
     * Sets the value of the postalAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress3(String value) {
        this.postalAddress3 = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
