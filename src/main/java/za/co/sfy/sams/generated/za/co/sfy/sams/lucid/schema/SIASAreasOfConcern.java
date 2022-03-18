
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AreaOfConcern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateDetected" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HowDetected" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="How_is_Learner_Affected" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Diagnosed_Disability" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Health_care_Proffessional" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date_Of_Assessment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Summary_Result" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "areaOfConcern",
    "dateDetected",
    "howDetected",
    "howIsLearnerAffected",
    "diagnosedDisability",
    "healthCareProffessional",
    "dateOfAssessment",
    "summaryResult",
    "dataYear"
})
@XmlRootElement(name = "SIAS_Areas_Of_Concern")
public class SIASAreasOfConcern {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "AreaOfConcern")
    protected String areaOfConcern;
    @XmlElement(name = "DateDetected")
    protected String dateDetected;
    @XmlElement(name = "HowDetected")
    protected String howDetected;
    @XmlElement(name = "How_is_Learner_Affected")
    protected String howIsLearnerAffected;
    @XmlElement(name = "Diagnosed_Disability")
    protected String diagnosedDisability;
    @XmlElement(name = "Health_care_Proffessional")
    protected String healthCareProffessional;
    @XmlElement(name = "Date_Of_Assessment")
    protected String dateOfAssessment;
    @XmlElement(name = "Summary_Result")
    protected String summaryResult;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;

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
     * Gets the value of the areaOfConcern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaOfConcern() {
        return areaOfConcern;
    }

    /**
     * Sets the value of the areaOfConcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaOfConcern(String value) {
        this.areaOfConcern = value;
    }

    /**
     * Gets the value of the dateDetected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDetected() {
        return dateDetected;
    }

    /**
     * Sets the value of the dateDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDetected(String value) {
        this.dateDetected = value;
    }

    /**
     * Gets the value of the howDetected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowDetected() {
        return howDetected;
    }

    /**
     * Sets the value of the howDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowDetected(String value) {
        this.howDetected = value;
    }

    /**
     * Gets the value of the howIsLearnerAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowIsLearnerAffected() {
        return howIsLearnerAffected;
    }

    /**
     * Sets the value of the howIsLearnerAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowIsLearnerAffected(String value) {
        this.howIsLearnerAffected = value;
    }

    /**
     * Gets the value of the diagnosedDisability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosedDisability() {
        return diagnosedDisability;
    }

    /**
     * Sets the value of the diagnosedDisability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosedDisability(String value) {
        this.diagnosedDisability = value;
    }

    /**
     * Gets the value of the healthCareProffessional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCareProffessional() {
        return healthCareProffessional;
    }

    /**
     * Sets the value of the healthCareProffessional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCareProffessional(String value) {
        this.healthCareProffessional = value;
    }

    /**
     * Gets the value of the dateOfAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfAssessment() {
        return dateOfAssessment;
    }

    /**
     * Sets the value of the dateOfAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfAssessment(String value) {
        this.dateOfAssessment = value;
    }

    /**
     * Gets the value of the summaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryResult() {
        return summaryResult;
    }

    /**
     * Sets the value of the summaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryResult(String value) {
        this.summaryResult = value;
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

}
