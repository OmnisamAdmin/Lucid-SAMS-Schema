
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
 *         &lt;element name="EducatorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmisNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Examinable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QtyLearners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Qtyperiods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Phase" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Teachingyrs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Trainingyrs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Minutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "educatorId",
    "dataYear",
    "emisNumber",
    "subjectId",
    "subjectCode",
    "examinable",
    "qtyLearners",
    "qtyperiods",
    "phase",
    "teachingyrs",
    "trainingyrs",
    "grade",
    "hours",
    "minutes",
    "confidenceLevel"
})
@XmlRootElement(name = "EducatorSubjectsTaught")
public class EducatorSubjectsTaught {

    @XmlElement(name = "EducatorId")
    protected Integer educatorId;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "SubjectId")
    protected Integer subjectId;
    @XmlElement(name = "SubjectCode")
    protected String subjectCode;
    @XmlElement(name = "Examinable")
    protected String examinable;
    @XmlElement(name = "QtyLearners")
    protected Integer qtyLearners;
    @XmlElement(name = "Qtyperiods")
    protected Integer qtyperiods;
    @XmlElement(name = "Phase")
    protected String phase;
    @XmlElement(name = "Teachingyrs")
    protected Integer teachingyrs;
    @XmlElement(name = "Trainingyrs")
    protected Integer trainingyrs;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Hours")
    protected Integer hours;
    @XmlElement(name = "Minutes")
    protected Integer minutes;
    @XmlElement(name = "ConfidenceLevel")
    protected Integer confidenceLevel;

    /**
     * Gets the value of the educatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEducatorId() {
        return educatorId;
    }

    /**
     * Sets the value of the educatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEducatorId(Integer value) {
        this.educatorId = value;
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
     * Gets the value of the emisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmisNumber() {
        return emisNumber;
    }

    /**
     * Sets the value of the emisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmisNumber(Double value) {
        this.emisNumber = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectId(Integer value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the subjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets the value of the subjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCode(String value) {
        this.subjectCode = value;
    }

    /**
     * Gets the value of the examinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminable() {
        return examinable;
    }

    /**
     * Sets the value of the examinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminable(String value) {
        this.examinable = value;
    }

    /**
     * Gets the value of the qtyLearners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyLearners() {
        return qtyLearners;
    }

    /**
     * Sets the value of the qtyLearners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyLearners(Integer value) {
        this.qtyLearners = value;
    }

    /**
     * Gets the value of the qtyperiods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyperiods() {
        return qtyperiods;
    }

    /**
     * Sets the value of the qtyperiods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyperiods(Integer value) {
        this.qtyperiods = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the teachingyrs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeachingyrs() {
        return teachingyrs;
    }

    /**
     * Sets the value of the teachingyrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeachingyrs(Integer value) {
        this.teachingyrs = value;
    }

    /**
     * Gets the value of the trainingyrs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainingyrs() {
        return trainingyrs;
    }

    /**
     * Sets the value of the trainingyrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainingyrs(Integer value) {
        this.trainingyrs = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrade(Integer value) {
        this.grade = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHours(Integer value) {
        this.hours = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceLevel(Integer value) {
        this.confidenceLevel = value;
    }

}
