
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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutcomeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term1RatingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term1Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="term1Mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Term2RatingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term2Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term2Mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Term3RatingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term3Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term3Mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Term4RatingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term4Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Term4Mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
    "subjectID",
    "reportID",
    "outcomeID",
    "dataYear",
    "term1RatingCode",
    "term1Comment",
    "term1Mark",
    "term2RatingCode",
    "term2Comment",
    "term2Mark",
    "term3RatingCode",
    "term3Comment",
    "term3Mark",
    "term4RatingCode",
    "term4Comment",
    "term4Mark"
})
@XmlRootElement(name = "ReportOutcomeMarks")
public class ReportOutcomeMarks {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "SubjectID")
    protected Integer subjectID;
    @XmlElement(name = "ReportID")
    protected Integer reportID;
    @XmlElement(name = "OutcomeID")
    protected Integer outcomeID;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Term1RatingCode")
    protected String term1RatingCode;
    @XmlElement(name = "Term1Comment")
    protected String term1Comment;
    protected Double term1Mark;
    @XmlElement(name = "Term2RatingCode")
    protected String term2RatingCode;
    @XmlElement(name = "Term2Comment")
    protected String term2Comment;
    @XmlElement(name = "Term2Mark")
    protected Double term2Mark;
    @XmlElement(name = "Term3RatingCode")
    protected String term3RatingCode;
    @XmlElement(name = "Term3Comment")
    protected String term3Comment;
    @XmlElement(name = "Term3Mark")
    protected Double term3Mark;
    @XmlElement(name = "Term4RatingCode")
    protected String term4RatingCode;
    @XmlElement(name = "Term4Comment")
    protected String term4Comment;
    @XmlElement(name = "Term4Mark")
    protected Double term4Mark;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectID(Integer value) {
        this.subjectID = value;
    }

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportID(Integer value) {
        this.reportID = value;
    }

    /**
     * Gets the value of the outcomeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutcomeID() {
        return outcomeID;
    }

    /**
     * Sets the value of the outcomeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutcomeID(Integer value) {
        this.outcomeID = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataYear(String value) {
        this.dataYear = value;
    }

    /**
     * Gets the value of the term1RatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm1RatingCode() {
        return term1RatingCode;
    }

    /**
     * Sets the value of the term1RatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm1RatingCode(String value) {
        this.term1RatingCode = value;
    }

    /**
     * Gets the value of the term1Comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm1Comment() {
        return term1Comment;
    }

    /**
     * Sets the value of the term1Comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm1Comment(String value) {
        this.term1Comment = value;
    }

    /**
     * Gets the value of the term1Mark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm1Mark() {
        return term1Mark;
    }

    /**
     * Sets the value of the term1Mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm1Mark(Double value) {
        this.term1Mark = value;
    }

    /**
     * Gets the value of the term2RatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm2RatingCode() {
        return term2RatingCode;
    }

    /**
     * Sets the value of the term2RatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm2RatingCode(String value) {
        this.term2RatingCode = value;
    }

    /**
     * Gets the value of the term2Comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm2Comment() {
        return term2Comment;
    }

    /**
     * Sets the value of the term2Comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm2Comment(String value) {
        this.term2Comment = value;
    }

    /**
     * Gets the value of the term2Mark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm2Mark() {
        return term2Mark;
    }

    /**
     * Sets the value of the term2Mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm2Mark(Double value) {
        this.term2Mark = value;
    }

    /**
     * Gets the value of the term3RatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm3RatingCode() {
        return term3RatingCode;
    }

    /**
     * Sets the value of the term3RatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm3RatingCode(String value) {
        this.term3RatingCode = value;
    }

    /**
     * Gets the value of the term3Comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm3Comment() {
        return term3Comment;
    }

    /**
     * Sets the value of the term3Comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm3Comment(String value) {
        this.term3Comment = value;
    }

    /**
     * Gets the value of the term3Mark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm3Mark() {
        return term3Mark;
    }

    /**
     * Sets the value of the term3Mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm3Mark(Double value) {
        this.term3Mark = value;
    }

    /**
     * Gets the value of the term4RatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm4RatingCode() {
        return term4RatingCode;
    }

    /**
     * Sets the value of the term4RatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm4RatingCode(String value) {
        this.term4RatingCode = value;
    }

    /**
     * Gets the value of the term4Comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm4Comment() {
        return term4Comment;
    }

    /**
     * Sets the value of the term4Comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm4Comment(String value) {
        this.term4Comment = value;
    }

    /**
     * Gets the value of the term4Mark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm4Mark() {
        return term4Mark;
    }

    /**
     * Sets the value of the term4Mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm4Mark(Double value) {
        this.term4Mark = value;
    }

}
