
package za.co.sfy.sams;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Lang_HL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lang_FAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lang_Math" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EvalVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mark_HL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mark_FAL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mark_Math" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="TSTransactionCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReportStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSSentFileName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TSLastUpdatedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecErr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
    "id",
    "dataYear",
    "grade",
    "classID",
    "learnerID",
    "langHL",
    "langFAL",
    "langMath",
    "evalVer",
    "markHL",
    "markFAL",
    "markMath",
    "status",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "tsSentFileName",
    "dateLastUpdate",
    "tsLastUpdatedBy",
    "recErr"
})
@XmlRootElement(name = "Ana2012FinalMarks")
public class Ana2012FinalMarks {

    protected int id;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Grade")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grade;
    @XmlElement(name = "ClassID")
    protected Integer classID;
    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "Lang_HL")
    protected String langHL;
    @XmlElement(name = "Lang_FAL")
    protected String langFAL;
    @XmlElement(name = "Lang_Math")
    protected String langMath;
    @XmlElement(name = "EvalVer")
    protected Integer evalVer;
    @XmlElement(name = "Mark_HL")
    protected Integer markHL;
    @XmlElement(name = "Mark_FAL")
    protected Integer markFAL;
    @XmlElement(name = "Mark_Math")
    protected Integer markMath;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "unsignedByte")
    protected Short status;
    @XmlElement(name = "TSTransactionCategory")
    protected Integer tsTransactionCategory;
    @XmlElement(name = "TSStatusFlag")
    protected Integer tsStatusFlag;
    @XmlElement(name = "TSReportStatusFlag")
    protected Integer tsReportStatusFlag;
    @XmlElement(name = "TSReasonCode")
    protected Integer tsReasonCode;
    @XmlElement(name = "TSSentFileName")
    protected String tsSentFileName;
    @XmlElement(name = "DateLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastUpdate;
    @XmlElement(name = "TSLastUpdatedBy")
    protected String tsLastUpdatedBy;
    @XmlElement(name = "RecErr")
    protected String recErr;

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
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrade(Short value) {
        this.grade = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassID(Integer value) {
        this.classID = value;
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
     * Gets the value of the langHL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangHL() {
        return langHL;
    }

    /**
     * Sets the value of the langHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangHL(String value) {
        this.langHL = value;
    }

    /**
     * Gets the value of the langFAL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangFAL() {
        return langFAL;
    }

    /**
     * Sets the value of the langFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangFAL(String value) {
        this.langFAL = value;
    }

    /**
     * Gets the value of the langMath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangMath() {
        return langMath;
    }

    /**
     * Sets the value of the langMath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangMath(String value) {
        this.langMath = value;
    }

    /**
     * Gets the value of the evalVer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEvalVer() {
        return evalVer;
    }

    /**
     * Sets the value of the evalVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEvalVer(Integer value) {
        this.evalVer = value;
    }

    /**
     * Gets the value of the markHL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkHL() {
        return markHL;
    }

    /**
     * Sets the value of the markHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkHL(Integer value) {
        this.markHL = value;
    }

    /**
     * Gets the value of the markFAL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkFAL() {
        return markFAL;
    }

    /**
     * Sets the value of the markFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkFAL(Integer value) {
        this.markFAL = value;
    }

    /**
     * Gets the value of the markMath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkMath() {
        return markMath;
    }

    /**
     * Sets the value of the markMath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkMath(Integer value) {
        this.markMath = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the tsTransactionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSTransactionCategory() {
        return tsTransactionCategory;
    }

    /**
     * Sets the value of the tsTransactionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSTransactionCategory(Integer value) {
        this.tsTransactionCategory = value;
    }

    /**
     * Gets the value of the tsStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSStatusFlag() {
        return tsStatusFlag;
    }

    /**
     * Sets the value of the tsStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSStatusFlag(Integer value) {
        this.tsStatusFlag = value;
    }

    /**
     * Gets the value of the tsReportStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSReportStatusFlag() {
        return tsReportStatusFlag;
    }

    /**
     * Sets the value of the tsReportStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSReportStatusFlag(Integer value) {
        this.tsReportStatusFlag = value;
    }

    /**
     * Gets the value of the tsReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSReasonCode() {
        return tsReasonCode;
    }

    /**
     * Sets the value of the tsReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSReasonCode(Integer value) {
        this.tsReasonCode = value;
    }

    /**
     * Gets the value of the tsSentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSentFileName() {
        return tsSentFileName;
    }

    /**
     * Sets the value of the tsSentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSentFileName(String value) {
        this.tsSentFileName = value;
    }

    /**
     * Gets the value of the dateLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastUpdate() {
        return dateLastUpdate;
    }

    /**
     * Sets the value of the dateLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastUpdate(XMLGregorianCalendar value) {
        this.dateLastUpdate = value;
    }

    /**
     * Gets the value of the tsLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLastUpdatedBy() {
        return tsLastUpdatedBy;
    }

    /**
     * Sets the value of the tsLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLastUpdatedBy(String value) {
        this.tsLastUpdatedBy = value;
    }

    /**
     * Gets the value of the recErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecErr() {
        return recErr;
    }

    /**
     * Sets the value of the recErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecErr(String value) {
        this.recErr = value;
    }

}
