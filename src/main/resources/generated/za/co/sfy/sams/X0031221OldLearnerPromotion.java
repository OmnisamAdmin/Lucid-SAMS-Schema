
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
 *         &lt;element name="LearnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PromotionDecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerAverage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LearnerScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TSTransactionCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReportStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportComment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
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
    "learnerId",
    "reportId",
    "promotionDecision",
    "dataYear",
    "grade",
    "learnerAverage",
    "learnerScore",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "reportComment"
})
@XmlRootElement(name = "_x0031_2_2_1_Old_LearnerPromotion")
public class X0031221OldLearnerPromotion {

    @XmlElement(name = "LearnerId")
    protected Integer learnerId;
    @XmlElement(name = "ReportId")
    protected Integer reportId;
    @XmlElement(name = "PromotionDecision")
    protected Integer promotionDecision;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "LearnerAverage")
    protected Double learnerAverage;
    @XmlElement(name = "LearnerScore")
    protected Double learnerScore;
    @XmlElement(name = "TSTransactionCategory")
    protected Integer tsTransactionCategory;
    @XmlElement(name = "TSStatusFlag")
    protected Integer tsStatusFlag;
    @XmlElement(name = "TSReportStatusFlag")
    protected Integer tsReportStatusFlag;
    @XmlElement(name = "TSReasonCode")
    protected Integer tsReasonCode;
    @XmlElement(name = "ReportComment")
    protected String reportComment;

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
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportId(Integer value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the promotionDecision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionDecision() {
        return promotionDecision;
    }

    /**
     * Sets the value of the promotionDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionDecision(Integer value) {
        this.promotionDecision = value;
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
     * Gets the value of the learnerAverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLearnerAverage() {
        return learnerAverage;
    }

    /**
     * Sets the value of the learnerAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLearnerAverage(Double value) {
        this.learnerAverage = value;
    }

    /**
     * Gets the value of the learnerScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLearnerScore() {
        return learnerScore;
    }

    /**
     * Sets the value of the learnerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLearnerScore(Double value) {
        this.learnerScore = value;
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
     * Gets the value of the reportComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportComment() {
        return reportComment;
    }

    /**
     * Sets the value of the reportComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportComment(String value) {
        this.reportComment = value;
    }

}
