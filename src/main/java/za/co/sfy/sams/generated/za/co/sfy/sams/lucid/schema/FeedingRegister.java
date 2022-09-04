
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
 *         &lt;element name="Feeding_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Feeding_Date" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Feeding_Time_Start" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Feeding_Time_Finish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FH_No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Learner_Fed_No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="coordinator_Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MealType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Group" minOccurs="0"&gt;
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
    "feedingID",
    "feedingDate",
    "feedingTimeStart",
    "feedingTimeFinish",
    "fhNo",
    "learnerFedNo",
    "coordinatorName",
    "dataYear",
    "mealType",
    "group"
})
@XmlRootElement(name = "Feeding_Register")
public class FeedingRegister {

    @XmlElement(name = "Feeding_ID")
    protected int feedingID;
    @XmlElement(name = "Feeding_Date")
    protected String feedingDate;
    @XmlElement(name = "Feeding_Time_Start")
    protected String feedingTimeStart;
    @XmlElement(name = "Feeding_Time_Finish")
    protected String feedingTimeFinish;
    @XmlElement(name = "FH_No")
    protected String fhNo;
    @XmlElement(name = "Learner_Fed_No")
    protected String learnerFedNo;
    @XmlElement(name = "coordinator_Name")
    protected String coordinatorName;
    @XmlElement(name = "Data_year")
    protected Integer dataYear;
    @XmlElement(name = "MealType")
    protected String mealType;
    @XmlElement(name = "Group")
    protected String group;

    /**
     * Gets the value of the feedingID property.
     * 
     */
    public int getFeedingID() {
        return feedingID;
    }

    /**
     * Sets the value of the feedingID property.
     * 
     */
    public void setFeedingID(int value) {
        this.feedingID = value;
    }

    /**
     * Gets the value of the feedingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedingDate() {
        return feedingDate;
    }

    /**
     * Sets the value of the feedingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedingDate(String value) {
        this.feedingDate = value;
    }

    /**
     * Gets the value of the feedingTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedingTimeStart() {
        return feedingTimeStart;
    }

    /**
     * Sets the value of the feedingTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedingTimeStart(String value) {
        this.feedingTimeStart = value;
    }

    /**
     * Gets the value of the feedingTimeFinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedingTimeFinish() {
        return feedingTimeFinish;
    }

    /**
     * Sets the value of the feedingTimeFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedingTimeFinish(String value) {
        this.feedingTimeFinish = value;
    }

    /**
     * Gets the value of the fhNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFHNo() {
        return fhNo;
    }

    /**
     * Sets the value of the fhNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFHNo(String value) {
        this.fhNo = value;
    }

    /**
     * Gets the value of the learnerFedNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerFedNo() {
        return learnerFedNo;
    }

    /**
     * Sets the value of the learnerFedNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerFedNo(String value) {
        this.learnerFedNo = value;
    }

    /**
     * Gets the value of the coordinatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatorName() {
        return coordinatorName;
    }

    /**
     * Sets the value of the coordinatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatorName(String value) {
        this.coordinatorName = value;
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
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealType(String value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

}
