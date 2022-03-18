
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Roadtoheath_Shown" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Growth_Progress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreOrPost_Natal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Immunisation_record" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hospital_admissions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="developmental_problems" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chronic_condition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Screening_result" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Roadtoheath_Shown_Number" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Growth_Progress_remarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreOrPost_Natal_remarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Immunisation_record_remarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hospital_admissions_remarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="developmental_problems_remarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chronic_condition_remarks" minOccurs="0"&gt;
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
    "id",
    "learnerID",
    "roadtoheathShown",
    "growthProgress",
    "preOrPostNatal",
    "immunisationRecord",
    "hospitalAdmissions",
    "developmentalProblems",
    "chronicCondition",
    "screeningResult",
    "dataYear",
    "roadtoheathShownNumber",
    "growthProgressRemarks",
    "preOrPostNatalRemarks",
    "immunisationRecordRemarks",
    "hospitalAdmissionsRemarks",
    "developmentalProblemsRemarks",
    "chronicConditionRemarks"
})
@XmlRootElement(name = "SIAS_Learner_Background_Info")
public class SIASLearnerBackgroundInfo {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Roadtoheath_Shown")
    protected String roadtoheathShown;
    @XmlElement(name = "Growth_Progress")
    protected String growthProgress;
    @XmlElement(name = "PreOrPost_Natal")
    protected String preOrPostNatal;
    @XmlElement(name = "Immunisation_record")
    protected String immunisationRecord;
    @XmlElement(name = "Hospital_admissions")
    protected String hospitalAdmissions;
    @XmlElement(name = "developmental_problems")
    protected String developmentalProblems;
    @XmlElement(name = "chronic_condition")
    protected String chronicCondition;
    @XmlElement(name = "Screening_result")
    protected String screeningResult;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;
    @XmlElement(name = "Roadtoheath_Shown_Number")
    protected String roadtoheathShownNumber;
    @XmlElement(name = "Growth_Progress_remarks")
    protected String growthProgressRemarks;
    @XmlElement(name = "PreOrPost_Natal_remarks")
    protected String preOrPostNatalRemarks;
    @XmlElement(name = "Immunisation_record_remarks")
    protected String immunisationRecordRemarks;
    @XmlElement(name = "Hospital_admissions_remarks")
    protected String hospitalAdmissionsRemarks;
    @XmlElement(name = "developmental_problems_remarks")
    protected String developmentalProblemsRemarks;
    @XmlElement(name = "chronic_condition_remarks")
    protected String chronicConditionRemarks;

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
     * Gets the value of the roadtoheathShown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadtoheathShown() {
        return roadtoheathShown;
    }

    /**
     * Sets the value of the roadtoheathShown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadtoheathShown(String value) {
        this.roadtoheathShown = value;
    }

    /**
     * Gets the value of the growthProgress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrowthProgress() {
        return growthProgress;
    }

    /**
     * Sets the value of the growthProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrowthProgress(String value) {
        this.growthProgress = value;
    }

    /**
     * Gets the value of the preOrPostNatal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreOrPostNatal() {
        return preOrPostNatal;
    }

    /**
     * Sets the value of the preOrPostNatal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreOrPostNatal(String value) {
        this.preOrPostNatal = value;
    }

    /**
     * Gets the value of the immunisationRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmunisationRecord() {
        return immunisationRecord;
    }

    /**
     * Sets the value of the immunisationRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmunisationRecord(String value) {
        this.immunisationRecord = value;
    }

    /**
     * Gets the value of the hospitalAdmissions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalAdmissions() {
        return hospitalAdmissions;
    }

    /**
     * Sets the value of the hospitalAdmissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalAdmissions(String value) {
        this.hospitalAdmissions = value;
    }

    /**
     * Gets the value of the developmentalProblems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentalProblems() {
        return developmentalProblems;
    }

    /**
     * Sets the value of the developmentalProblems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentalProblems(String value) {
        this.developmentalProblems = value;
    }

    /**
     * Gets the value of the chronicCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronicCondition() {
        return chronicCondition;
    }

    /**
     * Sets the value of the chronicCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronicCondition(String value) {
        this.chronicCondition = value;
    }

    /**
     * Gets the value of the screeningResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningResult() {
        return screeningResult;
    }

    /**
     * Sets the value of the screeningResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningResult(String value) {
        this.screeningResult = value;
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

    /**
     * Gets the value of the roadtoheathShownNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadtoheathShownNumber() {
        return roadtoheathShownNumber;
    }

    /**
     * Sets the value of the roadtoheathShownNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadtoheathShownNumber(String value) {
        this.roadtoheathShownNumber = value;
    }

    /**
     * Gets the value of the growthProgressRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrowthProgressRemarks() {
        return growthProgressRemarks;
    }

    /**
     * Sets the value of the growthProgressRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrowthProgressRemarks(String value) {
        this.growthProgressRemarks = value;
    }

    /**
     * Gets the value of the preOrPostNatalRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreOrPostNatalRemarks() {
        return preOrPostNatalRemarks;
    }

    /**
     * Sets the value of the preOrPostNatalRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreOrPostNatalRemarks(String value) {
        this.preOrPostNatalRemarks = value;
    }

    /**
     * Gets the value of the immunisationRecordRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmunisationRecordRemarks() {
        return immunisationRecordRemarks;
    }

    /**
     * Sets the value of the immunisationRecordRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmunisationRecordRemarks(String value) {
        this.immunisationRecordRemarks = value;
    }

    /**
     * Gets the value of the hospitalAdmissionsRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalAdmissionsRemarks() {
        return hospitalAdmissionsRemarks;
    }

    /**
     * Sets the value of the hospitalAdmissionsRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalAdmissionsRemarks(String value) {
        this.hospitalAdmissionsRemarks = value;
    }

    /**
     * Gets the value of the developmentalProblemsRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentalProblemsRemarks() {
        return developmentalProblemsRemarks;
    }

    /**
     * Sets the value of the developmentalProblemsRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentalProblemsRemarks(String value) {
        this.developmentalProblemsRemarks = value;
    }

    /**
     * Gets the value of the chronicConditionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronicConditionRemarks() {
        return chronicConditionRemarks;
    }

    /**
     * Sets the value of the chronicConditionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronicConditionRemarks(String value) {
        this.chronicConditionRemarks = value;
    }

}
