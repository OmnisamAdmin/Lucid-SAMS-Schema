
package za.co.sfy.sams;

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
 *         &lt;element name="LearnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SortNo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="NscCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NscInstrument" minOccurs="0"&gt;
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
    "examYear",
    "learnerId",
    "officialSubjectID",
    "sortNo",
    "nscCode",
    "subjName",
    "nscInstrument"
})
@XmlRootElement(name = "LearnerExamRegistrationSubjects")
public class LearnerExamRegistrationSubjects {

    @XmlElement(name = "ExamYear")
    protected Integer examYear;
    @XmlElement(name = "LearnerId")
    protected Integer learnerId;
    @XmlElement(name = "OfficialSubjectID")
    protected Integer officialSubjectID;
    @XmlElement(name = "SortNo")
    @XmlSchemaType(name = "unsignedByte")
    protected Short sortNo;
    @XmlElement(name = "NscCode")
    protected String nscCode;
    @XmlElement(name = "SubjName")
    protected String subjName;
    @XmlElement(name = "NscInstrument")
    protected String nscInstrument;

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
     * Gets the value of the learnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerId() {
        return learnerId;
    }

    /**
     * Sets the value of the learnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerId(Integer value) {
        this.learnerId = value;
    }

    /**
     * Gets the value of the officialSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfficialSubjectID() {
        return officialSubjectID;
    }

    /**
     * Sets the value of the officialSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfficialSubjectID(Integer value) {
        this.officialSubjectID = value;
    }

    /**
     * Gets the value of the sortNo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSortNo() {
        return sortNo;
    }

    /**
     * Sets the value of the sortNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSortNo(Short value) {
        this.sortNo = value;
    }

    /**
     * Gets the value of the nscCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNscCode() {
        return nscCode;
    }

    /**
     * Sets the value of the nscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNscCode(String value) {
        this.nscCode = value;
    }

    /**
     * Gets the value of the subjName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjName() {
        return subjName;
    }

    /**
     * Sets the value of the subjName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjName(String value) {
        this.subjName = value;
    }

    /**
     * Gets the value of the nscInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNscInstrument() {
        return nscInstrument;
    }

    /**
     * Sets the value of the nscInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNscInstrument(String value) {
        this.nscInstrument = value;
    }

}
