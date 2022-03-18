
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
 *         &lt;element name="Parent_Aggree_With_action" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Parent_Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Parent_name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Parent_Signature" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Parent_Date_signed" minOccurs="0"&gt;
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
    "parentAggreeWithAction",
    "parentComment",
    "parentName",
    "parentSignature",
    "parentDateSigned",
    "dataYear"
})
@XmlRootElement(name = "SIAS_Learner_Action_Plan_Signature")
public class SIASLearnerActionPlanSignature {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Parent_Aggree_With_action")
    protected String parentAggreeWithAction;
    @XmlElement(name = "Parent_Comment")
    protected String parentComment;
    @XmlElement(name = "Parent_name")
    protected String parentName;
    @XmlElement(name = "Parent_Signature")
    protected String parentSignature;
    @XmlElement(name = "Parent_Date_signed")
    protected String parentDateSigned;
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
     * Gets the value of the parentAggreeWithAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAggreeWithAction() {
        return parentAggreeWithAction;
    }

    /**
     * Sets the value of the parentAggreeWithAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAggreeWithAction(String value) {
        this.parentAggreeWithAction = value;
    }

    /**
     * Gets the value of the parentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentComment() {
        return parentComment;
    }

    /**
     * Sets the value of the parentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentComment(String value) {
        this.parentComment = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the parentSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSignature() {
        return parentSignature;
    }

    /**
     * Sets the value of the parentSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSignature(String value) {
        this.parentSignature = value;
    }

    /**
     * Gets the value of the parentDateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDateSigned() {
        return parentDateSigned;
    }

    /**
     * Sets the value of the parentDateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDateSigned(String value) {
        this.parentDateSigned = value;
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
