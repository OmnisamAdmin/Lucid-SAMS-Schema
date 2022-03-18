
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
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExamYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExamName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExamType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImmigrationStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CandidateReferenceNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RegistrationIDType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
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
 *         &lt;element name="EndorsementType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CertificateLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpecialNeed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NSCSpecialNeed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WrittenRsa" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryWritten" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaperLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
    "learnerID",
    "examYear",
    "registrationType",
    "examName",
    "examType",
    "immigrationStatus",
    "candidateReferenceNumber",
    "registrationIDType",
    "postalAddress1",
    "postalAddress2",
    "postalAddress3",
    "postalAddress4",
    "postalCode",
    "endorsementType",
    "certificateLanguage",
    "specialNeed",
    "nscSpecialNeed",
    "writtenRsa",
    "countryWritten",
    "paperLanguage"
})
@XmlRootElement(name = "LearnerExamRegistration")
public class LearnerExamRegistration {

    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "ExamYear")
    protected Integer examYear;
    @XmlElement(name = "RegistrationType")
    protected String registrationType;
    @XmlElement(name = "ExamName")
    protected String examName;
    @XmlElement(name = "ExamType")
    protected String examType;
    @XmlElement(name = "ImmigrationStatus")
    protected String immigrationStatus;
    @XmlElement(name = "CandidateReferenceNumber")
    protected String candidateReferenceNumber;
    @XmlElement(name = "RegistrationIDType")
    protected String registrationIDType;
    @XmlElement(name = "PostalAddress1")
    protected String postalAddress1;
    @XmlElement(name = "PostalAddress2")
    protected String postalAddress2;
    @XmlElement(name = "PostalAddress3")
    protected String postalAddress3;
    @XmlElement(name = "PostalAddress4")
    protected String postalAddress4;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "EndorsementType")
    protected String endorsementType;
    @XmlElement(name = "CertificateLanguage")
    protected Integer certificateLanguage;
    @XmlElement(name = "SpecialNeed")
    protected String specialNeed;
    @XmlElement(name = "NSCSpecialNeed")
    protected String nscSpecialNeed;
    @XmlElement(name = "WrittenRsa")
    protected String writtenRsa;
    @XmlElement(name = "CountryWritten")
    protected String countryWritten;
    @XmlElement(name = "PaperLanguage")
    protected String paperLanguage;

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
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the examName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamName() {
        return examName;
    }

    /**
     * Sets the value of the examName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamName(String value) {
        this.examName = value;
    }

    /**
     * Gets the value of the examType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamType() {
        return examType;
    }

    /**
     * Sets the value of the examType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamType(String value) {
        this.examType = value;
    }

    /**
     * Gets the value of the immigrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrationStatus() {
        return immigrationStatus;
    }

    /**
     * Sets the value of the immigrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrationStatus(String value) {
        this.immigrationStatus = value;
    }

    /**
     * Gets the value of the candidateReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCandidateReferenceNumber() {
        return candidateReferenceNumber;
    }

    /**
     * Sets the value of the candidateReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCandidateReferenceNumber(String value) {
        this.candidateReferenceNumber = value;
    }

    /**
     * Gets the value of the registrationIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIDType() {
        return registrationIDType;
    }

    /**
     * Sets the value of the registrationIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIDType(String value) {
        this.registrationIDType = value;
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
     * Gets the value of the postalAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress4() {
        return postalAddress4;
    }

    /**
     * Sets the value of the postalAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress4(String value) {
        this.postalAddress4 = value;
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

    /**
     * Gets the value of the endorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementType() {
        return endorsementType;
    }

    /**
     * Sets the value of the endorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementType(String value) {
        this.endorsementType = value;
    }

    /**
     * Gets the value of the certificateLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificateLanguage() {
        return certificateLanguage;
    }

    /**
     * Sets the value of the certificateLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificateLanguage(Integer value) {
        this.certificateLanguage = value;
    }

    /**
     * Gets the value of the specialNeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeed() {
        return specialNeed;
    }

    /**
     * Sets the value of the specialNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeed(String value) {
        this.specialNeed = value;
    }

    /**
     * Gets the value of the nscSpecialNeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCSpecialNeed() {
        return nscSpecialNeed;
    }

    /**
     * Sets the value of the nscSpecialNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSCSpecialNeed(String value) {
        this.nscSpecialNeed = value;
    }

    /**
     * Gets the value of the writtenRsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenRsa() {
        return writtenRsa;
    }

    /**
     * Sets the value of the writtenRsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenRsa(String value) {
        this.writtenRsa = value;
    }

    /**
     * Gets the value of the countryWritten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryWritten() {
        return countryWritten;
    }

    /**
     * Sets the value of the countryWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryWritten(String value) {
        this.countryWritten = value;
    }

    /**
     * Gets the value of the paperLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperLanguage() {
        return paperLanguage;
    }

    /**
     * Sets the value of the paperLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperLanguage(String value) {
        this.paperLanguage = value;
    }

}
