
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
 *         &lt;element name="DataYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EdID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StandardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SelfEvaluation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DSG_Score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DSG1_Score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FinalScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Strengths" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DevelopmentRecommendation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContextualFactorsNotes" minOccurs="0"&gt;
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
    "dataYear",
    "edID",
    "standardID",
    "criteriaID",
    "selfEvaluation",
    "dsgScore",
    "dsg1Score",
    "finalScore",
    "strengths",
    "developmentRecommendation",
    "contextualFactorsNotes"
})
@XmlRootElement(name = "IQMS_Educator_Appraisal")
public class IQMSEducatorAppraisal {

    @XmlElement(name = "DataYear")
    protected Integer dataYear;
    @XmlElement(name = "EdID")
    protected Integer edID;
    @XmlElement(name = "StandardID")
    protected Integer standardID;
    @XmlElement(name = "CriteriaID")
    protected Integer criteriaID;
    @XmlElement(name = "SelfEvaluation")
    protected Integer selfEvaluation;
    @XmlElement(name = "DSG_Score")
    protected Integer dsgScore;
    @XmlElement(name = "DSG1_Score")
    protected Integer dsg1Score;
    @XmlElement(name = "FinalScore")
    protected Integer finalScore;
    @XmlElement(name = "Strengths")
    protected String strengths;
    @XmlElement(name = "DevelopmentRecommendation")
    protected String developmentRecommendation;
    @XmlElement(name = "ContextualFactorsNotes")
    protected String contextualFactorsNotes;

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
     * Gets the value of the edID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdID() {
        return edID;
    }

    /**
     * Sets the value of the edID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdID(Integer value) {
        this.edID = value;
    }

    /**
     * Gets the value of the standardID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandardID() {
        return standardID;
    }

    /**
     * Sets the value of the standardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandardID(Integer value) {
        this.standardID = value;
    }

    /**
     * Gets the value of the criteriaID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriteriaID() {
        return criteriaID;
    }

    /**
     * Sets the value of the criteriaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriteriaID(Integer value) {
        this.criteriaID = value;
    }

    /**
     * Gets the value of the selfEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelfEvaluation() {
        return selfEvaluation;
    }

    /**
     * Sets the value of the selfEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelfEvaluation(Integer value) {
        this.selfEvaluation = value;
    }

    /**
     * Gets the value of the dsgScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDSGScore() {
        return dsgScore;
    }

    /**
     * Sets the value of the dsgScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDSGScore(Integer value) {
        this.dsgScore = value;
    }

    /**
     * Gets the value of the dsg1Score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDSG1Score() {
        return dsg1Score;
    }

    /**
     * Sets the value of the dsg1Score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDSG1Score(Integer value) {
        this.dsg1Score = value;
    }

    /**
     * Gets the value of the finalScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinalScore() {
        return finalScore;
    }

    /**
     * Sets the value of the finalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinalScore(Integer value) {
        this.finalScore = value;
    }

    /**
     * Gets the value of the strengths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrengths() {
        return strengths;
    }

    /**
     * Sets the value of the strengths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrengths(String value) {
        this.strengths = value;
    }

    /**
     * Gets the value of the developmentRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentRecommendation() {
        return developmentRecommendation;
    }

    /**
     * Sets the value of the developmentRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentRecommendation(String value) {
        this.developmentRecommendation = value;
    }

    /**
     * Gets the value of the contextualFactorsNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextualFactorsNotes() {
        return contextualFactorsNotes;
    }

    /**
     * Sets the value of the contextualFactorsNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextualFactorsNotes(String value) {
        this.contextualFactorsNotes = value;
    }

}
