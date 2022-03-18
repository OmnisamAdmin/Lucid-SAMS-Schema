
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
 *         &lt;element name="DataYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StandardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountFoundation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountIntermediate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountSenior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountFET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImprovementStrategies" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EducatorIDs" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIPDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Budget" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressingNeeds" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
    "standardID",
    "criteriaID",
    "countFoundation",
    "countIntermediate",
    "countSenior",
    "countFET",
    "improvementStrategies",
    "educatorIDs",
    "eipDate",
    "budget",
    "addressingNeeds"
})
@XmlRootElement(name = "IQMS_Educator_ImprovementPlan")
public class IQMSEducatorImprovementPlan {

    @XmlElement(name = "DataYear")
    protected Integer dataYear;
    @XmlElement(name = "StandardID")
    protected Integer standardID;
    @XmlElement(name = "CriteriaID")
    protected Integer criteriaID;
    @XmlElement(name = "CountFoundation")
    protected Integer countFoundation;
    @XmlElement(name = "CountIntermediate")
    protected Integer countIntermediate;
    @XmlElement(name = "CountSenior")
    protected Integer countSenior;
    @XmlElement(name = "CountFET")
    protected Integer countFET;
    @XmlElement(name = "ImprovementStrategies")
    protected String improvementStrategies;
    @XmlElement(name = "EducatorIDs")
    protected String educatorIDs;
    @XmlElement(name = "EIPDate")
    protected String eipDate;
    @XmlElement(name = "Budget")
    protected String budget;
    @XmlElement(name = "AddressingNeeds")
    protected String addressingNeeds;

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
     * Gets the value of the countFoundation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountFoundation() {
        return countFoundation;
    }

    /**
     * Sets the value of the countFoundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountFoundation(Integer value) {
        this.countFoundation = value;
    }

    /**
     * Gets the value of the countIntermediate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountIntermediate() {
        return countIntermediate;
    }

    /**
     * Sets the value of the countIntermediate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountIntermediate(Integer value) {
        this.countIntermediate = value;
    }

    /**
     * Gets the value of the countSenior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountSenior() {
        return countSenior;
    }

    /**
     * Sets the value of the countSenior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountSenior(Integer value) {
        this.countSenior = value;
    }

    /**
     * Gets the value of the countFET property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountFET() {
        return countFET;
    }

    /**
     * Sets the value of the countFET property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountFET(Integer value) {
        this.countFET = value;
    }

    /**
     * Gets the value of the improvementStrategies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImprovementStrategies() {
        return improvementStrategies;
    }

    /**
     * Sets the value of the improvementStrategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImprovementStrategies(String value) {
        this.improvementStrategies = value;
    }

    /**
     * Gets the value of the educatorIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducatorIDs() {
        return educatorIDs;
    }

    /**
     * Sets the value of the educatorIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducatorIDs(String value) {
        this.educatorIDs = value;
    }

    /**
     * Gets the value of the eipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIPDate() {
        return eipDate;
    }

    /**
     * Sets the value of the eipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIPDate(String value) {
        this.eipDate = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudget(String value) {
        this.budget = value;
    }

    /**
     * Gets the value of the addressingNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressingNeeds() {
        return addressingNeeds;
    }

    /**
     * Sets the value of the addressingNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressingNeeds(String value) {
        this.addressingNeeds = value;
    }

}
