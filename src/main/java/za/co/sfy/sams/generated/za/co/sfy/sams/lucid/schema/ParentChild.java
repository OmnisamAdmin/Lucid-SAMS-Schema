
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
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChildId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Learnerid" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccPayer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Resides" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FamilyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PastelCustomerAccountDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PastelCustomerCategoryCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PastelContact" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGBReg" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Relation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
    "parentId",
    "childId",
    "learnerid",
    "accPayer",
    "status",
    "resides",
    "familyCode",
    "pastelCustomerAccountDescription",
    "pastelCustomerCategoryCode",
    "pastelContact",
    "sgbReg",
    "relation"
})
@XmlRootElement(name = "Parent_Child")
public class ParentChild {

    @XmlElement(name = "ParentId")
    protected Integer parentId;
    @XmlElement(name = "ChildId")
    protected Integer childId;
    @XmlElement(name = "Learnerid")
    protected String learnerid;
    @XmlElement(name = "AccPayer")
    protected boolean accPayer;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Resides")
    protected String resides;
    @XmlElement(name = "FamilyCode")
    protected String familyCode;
    @XmlElement(name = "PastelCustomerAccountDescription")
    protected String pastelCustomerAccountDescription;
    @XmlElement(name = "PastelCustomerCategoryCode")
    protected Integer pastelCustomerCategoryCode;
    @XmlElement(name = "PastelContact")
    protected String pastelContact;
    @XmlElement(name = "SGBReg")
    protected String sgbReg;
    @XmlElement(name = "Relation")
    protected String relation;

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the childId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildId() {
        return childId;
    }

    /**
     * Sets the value of the childId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildId(Integer value) {
        this.childId = value;
    }

    /**
     * Gets the value of the learnerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerid() {
        return learnerid;
    }

    /**
     * Sets the value of the learnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerid(String value) {
        this.learnerid = value;
    }

    /**
     * Gets the value of the accPayer property.
     * 
     */
    public boolean isAccPayer() {
        return accPayer;
    }

    /**
     * Sets the value of the accPayer property.
     * 
     */
    public void setAccPayer(boolean value) {
        this.accPayer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the resides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResides() {
        return resides;
    }

    /**
     * Sets the value of the resides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResides(String value) {
        this.resides = value;
    }

    /**
     * Gets the value of the familyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyCode() {
        return familyCode;
    }

    /**
     * Sets the value of the familyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyCode(String value) {
        this.familyCode = value;
    }

    /**
     * Gets the value of the pastelCustomerAccountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastelCustomerAccountDescription() {
        return pastelCustomerAccountDescription;
    }

    /**
     * Sets the value of the pastelCustomerAccountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastelCustomerAccountDescription(String value) {
        this.pastelCustomerAccountDescription = value;
    }

    /**
     * Gets the value of the pastelCustomerCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastelCustomerCategoryCode() {
        return pastelCustomerCategoryCode;
    }

    /**
     * Sets the value of the pastelCustomerCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastelCustomerCategoryCode(Integer value) {
        this.pastelCustomerCategoryCode = value;
    }

    /**
     * Gets the value of the pastelContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastelContact() {
        return pastelContact;
    }

    /**
     * Sets the value of the pastelContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastelContact(String value) {
        this.pastelContact = value;
    }

    /**
     * Gets the value of the sgbReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGBReg() {
        return sgbReg;
    }

    /**
     * Sets the value of the sgbReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGBReg(String value) {
        this.sgbReg = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
