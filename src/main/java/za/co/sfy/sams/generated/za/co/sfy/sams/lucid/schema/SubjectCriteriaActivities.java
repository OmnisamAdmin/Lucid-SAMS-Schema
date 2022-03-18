
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
 *         &lt;element name="ActivityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Activity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RawMark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CriterionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityAfr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivityVern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OffCriterionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffActivityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GetFromOffCriterionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "activityID",
    "activity",
    "rawMark",
    "weight",
    "activityDate",
    "criterionID",
    "activityAfr",
    "activityVern",
    "offCriterionId",
    "offActivityID",
    "recLocked",
    "getFromOffCriterionId"
})
@XmlRootElement(name = "SubjectCriteriaActivities")
public class SubjectCriteriaActivities {

    @XmlElement(name = "ActivityID")
    protected int activityID;
    @XmlElement(name = "Activity")
    protected String activity;
    @XmlElement(name = "RawMark")
    protected Integer rawMark;
    @XmlElement(name = "Weight")
    protected Double weight;
    @XmlElement(name = "ActivityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "CriterionID")
    protected Integer criterionID;
    @XmlElement(name = "ActivityAfr")
    protected String activityAfr;
    @XmlElement(name = "ActivityVern")
    protected String activityVern;
    @XmlElement(name = "OffCriterionId")
    protected Integer offCriterionId;
    @XmlElement(name = "OffActivityID")
    protected Integer offActivityID;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;
    @XmlElement(name = "GetFromOffCriterionId")
    protected Integer getFromOffCriterionId;

    /**
     * Gets the value of the activityID property.
     * 
     */
    public int getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     */
    public void setActivityID(int value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the rawMark property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawMark() {
        return rawMark;
    }

    /**
     * Sets the value of the rawMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawMark(Integer value) {
        this.rawMark = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the criterionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionID() {
        return criterionID;
    }

    /**
     * Sets the value of the criterionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionID(Integer value) {
        this.criterionID = value;
    }

    /**
     * Gets the value of the activityAfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityAfr() {
        return activityAfr;
    }

    /**
     * Sets the value of the activityAfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityAfr(String value) {
        this.activityAfr = value;
    }

    /**
     * Gets the value of the activityVern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityVern() {
        return activityVern;
    }

    /**
     * Sets the value of the activityVern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityVern(String value) {
        this.activityVern = value;
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
     * Gets the value of the offActivityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffActivityID() {
        return offActivityID;
    }

    /**
     * Sets the value of the offActivityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffActivityID(Integer value) {
        this.offActivityID = value;
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
     * Gets the value of the getFromOffCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetFromOffCriterionId() {
        return getFromOffCriterionId;
    }

    /**
     * Sets the value of the getFromOffCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetFromOffCriterionId(Integer value) {
        this.getFromOffCriterionId = value;
    }

}
