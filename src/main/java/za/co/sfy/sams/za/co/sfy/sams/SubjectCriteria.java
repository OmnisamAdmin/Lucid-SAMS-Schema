
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
 *         &lt;element name="Subjectid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriterionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Weighting" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SubjectLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CriterionScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubHeading" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Outcomes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Activities" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Assessments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UseActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeFFL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeExam" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Updated" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QuarterlyTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FETCommonTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DescriptionAfr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DescriptionVern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaskType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBATask" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FixedCriterionScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FixedWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FixedSBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SubjSplitNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffCriterionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Fixed0Weight" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "subjectid",
    "criterionId",
    "description",
    "grade",
    "weighting",
    "subjectLevel",
    "criterionScore",
    "dataYear",
    "subHeading",
    "dateAdded",
    "type",
    "outcomes",
    "activities",
    "assessments",
    "sectionId",
    "useActivities",
    "includeFFL",
    "includeExam",
    "updated",
    "quarterlyTest",
    "fetCommonTest",
    "descriptionAfr",
    "descriptionVern",
    "taskType",
    "sbaTask",
    "sbaWeight",
    "fixedCriterionScore",
    "fixedWeight",
    "fixedSBAWeight",
    "subjSplitNo",
    "offSubjectID",
    "offCriterionId",
    "recLocked",
    "status",
    "fixed0Weight"
})
@XmlRootElement(name = "SubjectCriteria")
public class SubjectCriteria {

    @XmlElement(name = "Subjectid")
    protected Integer subjectid;
    @XmlElement(name = "CriterionId")
    protected int criterionId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Weighting")
    protected Double weighting;
    @XmlElement(name = "SubjectLevel")
    protected String subjectLevel;
    @XmlElement(name = "CriterionScore")
    protected Integer criterionScore;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "SubHeading")
    protected String subHeading;
    @XmlElement(name = "DateAdded")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Outcomes")
    protected String outcomes;
    @XmlElement(name = "Activities")
    protected String activities;
    @XmlElement(name = "Assessments")
    protected String assessments;
    @XmlElement(name = "SectionId")
    protected Integer sectionId;
    @XmlElement(name = "UseActivities")
    protected boolean useActivities;
    @XmlElement(name = "IncludeFFL")
    protected boolean includeFFL;
    @XmlElement(name = "IncludeExam")
    protected boolean includeExam;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "QuarterlyTest")
    protected boolean quarterlyTest;
    @XmlElement(name = "FETCommonTest")
    protected boolean fetCommonTest;
    @XmlElement(name = "DescriptionAfr")
    protected String descriptionAfr;
    @XmlElement(name = "DescriptionVern")
    protected String descriptionVern;
    @XmlElement(name = "TaskType")
    protected Integer taskType;
    @XmlElement(name = "SBATask")
    protected boolean sbaTask;
    @XmlElement(name = "SBAWeight")
    protected Double sbaWeight;
    @XmlElement(name = "FixedCriterionScore")
    protected Integer fixedCriterionScore;
    @XmlElement(name = "FixedWeight")
    protected Double fixedWeight;
    @XmlElement(name = "FixedSBAWeight")
    protected Double fixedSBAWeight;
    @XmlElement(name = "SubjSplitNo")
    protected Integer subjSplitNo;
    @XmlElement(name = "OffSubjectID")
    protected Integer offSubjectID;
    @XmlElement(name = "OffCriterionId")
    protected Integer offCriterionId;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "unsignedByte")
    protected Short status;
    @XmlElement(name = "Fixed0Weight")
    protected boolean fixed0Weight;

    /**
     * Gets the value of the subjectid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectid() {
        return subjectid;
    }

    /**
     * Sets the value of the subjectid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectid(Integer value) {
        this.subjectid = value;
    }

    /**
     * Gets the value of the criterionId property.
     * 
     */
    public int getCriterionId() {
        return criterionId;
    }

    /**
     * Sets the value of the criterionId property.
     * 
     */
    public void setCriterionId(int value) {
        this.criterionId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeighting(Double value) {
        this.weighting = value;
    }

    /**
     * Gets the value of the subjectLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLevel() {
        return subjectLevel;
    }

    /**
     * Sets the value of the subjectLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLevel(String value) {
        this.subjectLevel = value;
    }

    /**
     * Gets the value of the criterionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionScore() {
        return criterionScore;
    }

    /**
     * Sets the value of the criterionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionScore(Integer value) {
        this.criterionScore = value;
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
     * Gets the value of the subHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubHeading() {
        return subHeading;
    }

    /**
     * Sets the value of the subHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubHeading(String value) {
        this.subHeading = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomes(String value) {
        this.outcomes = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Gets the value of the assessments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessments() {
        return assessments;
    }

    /**
     * Sets the value of the assessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessments(String value) {
        this.assessments = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionId(Integer value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the useActivities property.
     * 
     */
    public boolean isUseActivities() {
        return useActivities;
    }

    /**
     * Sets the value of the useActivities property.
     * 
     */
    public void setUseActivities(boolean value) {
        this.useActivities = value;
    }

    /**
     * Gets the value of the includeFFL property.
     * 
     */
    public boolean isIncludeFFL() {
        return includeFFL;
    }

    /**
     * Sets the value of the includeFFL property.
     * 
     */
    public void setIncludeFFL(boolean value) {
        this.includeFFL = value;
    }

    /**
     * Gets the value of the includeExam property.
     * 
     */
    public boolean isIncludeExam() {
        return includeExam;
    }

    /**
     * Sets the value of the includeExam property.
     * 
     */
    public void setIncludeExam(boolean value) {
        this.includeExam = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the quarterlyTest property.
     * 
     */
    public boolean isQuarterlyTest() {
        return quarterlyTest;
    }

    /**
     * Sets the value of the quarterlyTest property.
     * 
     */
    public void setQuarterlyTest(boolean value) {
        this.quarterlyTest = value;
    }

    /**
     * Gets the value of the fetCommonTest property.
     * 
     */
    public boolean isFETCommonTest() {
        return fetCommonTest;
    }

    /**
     * Sets the value of the fetCommonTest property.
     * 
     */
    public void setFETCommonTest(boolean value) {
        this.fetCommonTest = value;
    }

    /**
     * Gets the value of the descriptionAfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionAfr() {
        return descriptionAfr;
    }

    /**
     * Sets the value of the descriptionAfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionAfr(String value) {
        this.descriptionAfr = value;
    }

    /**
     * Gets the value of the descriptionVern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionVern() {
        return descriptionVern;
    }

    /**
     * Sets the value of the descriptionVern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionVern(String value) {
        this.descriptionVern = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskType(Integer value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the sbaTask property.
     * 
     */
    public boolean isSBATask() {
        return sbaTask;
    }

    /**
     * Sets the value of the sbaTask property.
     * 
     */
    public void setSBATask(boolean value) {
        this.sbaTask = value;
    }

    /**
     * Gets the value of the sbaWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSBAWeight() {
        return sbaWeight;
    }

    /**
     * Sets the value of the sbaWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSBAWeight(Double value) {
        this.sbaWeight = value;
    }

    /**
     * Gets the value of the fixedCriterionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFixedCriterionScore() {
        return fixedCriterionScore;
    }

    /**
     * Sets the value of the fixedCriterionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixedCriterionScore(Integer value) {
        this.fixedCriterionScore = value;
    }

    /**
     * Gets the value of the fixedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedWeight() {
        return fixedWeight;
    }

    /**
     * Sets the value of the fixedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedWeight(Double value) {
        this.fixedWeight = value;
    }

    /**
     * Gets the value of the fixedSBAWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedSBAWeight() {
        return fixedSBAWeight;
    }

    /**
     * Sets the value of the fixedSBAWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedSBAWeight(Double value) {
        this.fixedSBAWeight = value;
    }

    /**
     * Gets the value of the subjSplitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjSplitNo() {
        return subjSplitNo;
    }

    /**
     * Sets the value of the subjSplitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjSplitNo(Integer value) {
        this.subjSplitNo = value;
    }

    /**
     * Gets the value of the offSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffSubjectID() {
        return offSubjectID;
    }

    /**
     * Sets the value of the offSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffSubjectID(Integer value) {
        this.offSubjectID = value;
    }

    /**
     * Gets the value of the offCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffCriterionId() {
        return offCriterionId;
    }

    /**
     * Sets the value of the offCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffCriterionId(Integer value) {
        this.offCriterionId = value;
    }

    /**
     * Gets the value of the recLocked property.
     * 
     */
    public boolean isRecLocked() {
        return recLocked;
    }

    /**
     * Sets the value of the recLocked property.
     * 
     */
    public void setRecLocked(boolean value) {
        this.recLocked = value;
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
     * Gets the value of the fixed0Weight property.
     * 
     */
    public boolean isFixed0Weight() {
        return fixed0Weight;
    }

    /**
     * Sets the value of the fixed0Weight property.
     * 
     */
    public void setFixed0Weight(boolean value) {
        this.fixed0Weight = value;
    }

}
