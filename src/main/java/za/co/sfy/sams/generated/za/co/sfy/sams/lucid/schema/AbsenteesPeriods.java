
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="AbsentID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WeekId" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AbsentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AbsentPeriodNo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="AbsentReason" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
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
    "absentID",
    "learnerID",
    "grade",
    "clazz",
    "weekId",
    "absentDate",
    "absentPeriodNo",
    "absentReason",
    "subjectID",
    "dataYear"
})
@XmlRootElement(name = "AbsenteesPeriods")
public class AbsenteesPeriods {

    @XmlElement(name = "AbsentID")
    protected int absentID;
    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Class")
    protected Integer clazz;
    @XmlElement(name = "WeekId")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weekId;
    @XmlElement(name = "AbsentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absentDate;
    @XmlElement(name = "AbsentPeriodNo")
    @XmlSchemaType(name = "unsignedByte")
    protected Short absentPeriodNo;
    @XmlElement(name = "AbsentReason")
    protected String absentReason;
    @XmlElement(name = "SubjectID")
    protected Integer subjectID;
    @XmlElement(name = "DataYear")
    protected String dataYear;

    /**
     * Gets the value of the absentID property.
     * 
     */
    public int getAbsentID() {
        return absentID;
    }

    /**
     * Sets the value of the absentID property.
     * 
     */
    public void setAbsentID(int value) {
        this.absentID = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClazz(Integer value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the weekId property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeekId() {
        return weekId;
    }

    /**
     * Sets the value of the weekId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeekId(XMLGregorianCalendar value) {
        this.weekId = value;
    }

    /**
     * Gets the value of the absentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsentDate() {
        return absentDate;
    }

    /**
     * Sets the value of the absentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsentDate(XMLGregorianCalendar value) {
        this.absentDate = value;
    }

    /**
     * Gets the value of the absentPeriodNo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAbsentPeriodNo() {
        return absentPeriodNo;
    }

    /**
     * Sets the value of the absentPeriodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAbsentPeriodNo(Short value) {
        this.absentPeriodNo = value;
    }

    /**
     * Gets the value of the absentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsentReason() {
        return absentReason;
    }

    /**
     * Sets the value of the absentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsentReason(String value) {
        this.absentReason = value;
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

}
