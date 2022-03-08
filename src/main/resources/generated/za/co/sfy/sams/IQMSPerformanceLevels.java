
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
 *         &lt;element name="StandardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LevelNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LevelDesc" minOccurs="0"&gt;
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
    "standardID",
    "criteriaID",
    "levelNo",
    "levelDesc"
})
@XmlRootElement(name = "IQMS_PerformanceLevels")
public class IQMSPerformanceLevels {

    @XmlElement(name = "StandardID")
    protected Integer standardID;
    @XmlElement(name = "CriteriaID")
    protected Integer criteriaID;
    @XmlElement(name = "LevelNo")
    protected Integer levelNo;
    @XmlElement(name = "LevelDesc")
    protected String levelDesc;

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
     * Gets the value of the levelNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevelNo() {
        return levelNo;
    }

    /**
     * Sets the value of the levelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevelNo(Integer value) {
        this.levelNo = value;
    }

    /**
     * Gets the value of the levelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelDesc() {
        return levelDesc;
    }

    /**
     * Sets the value of the levelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelDesc(String value) {
        this.levelDesc = value;
    }

}
