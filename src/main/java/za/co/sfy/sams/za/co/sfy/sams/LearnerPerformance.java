
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
 *         &lt;element name="EmisNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field811" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field812" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field813" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field814" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field815" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field816" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field817" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field818" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field82" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field83" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field84" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field851" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field852" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field853" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field854" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "emisNumber",
    "dataYear",
    "field811",
    "field812",
    "field813",
    "field814",
    "field815",
    "field816",
    "field817",
    "field818",
    "field82",
    "field83",
    "field84",
    "field851",
    "field852",
    "field853",
    "field854"
})
@XmlRootElement(name = "LearnerPerformance")
public class LearnerPerformance {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field811")
    protected String field811;
    @XmlElement(name = "Field812")
    protected String field812;
    @XmlElement(name = "Field813")
    protected String field813;
    @XmlElement(name = "Field814")
    protected String field814;
    @XmlElement(name = "Field815")
    protected String field815;
    @XmlElement(name = "Field816")
    protected String field816;
    @XmlElement(name = "Field817")
    protected String field817;
    @XmlElement(name = "Field818")
    protected String field818;
    @XmlElement(name = "Field82")
    protected Integer field82;
    @XmlElement(name = "Field83")
    protected String field83;
    @XmlElement(name = "Field84")
    protected Integer field84;
    @XmlElement(name = "Field851")
    protected Integer field851;
    @XmlElement(name = "Field852")
    protected Integer field852;
    @XmlElement(name = "Field853")
    protected Integer field853;
    @XmlElement(name = "Field854")
    protected Integer field854;

    /**
     * Gets the value of the emisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmisNumber() {
        return emisNumber;
    }

    /**
     * Sets the value of the emisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmisNumber(Double value) {
        this.emisNumber = value;
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
     * Gets the value of the field811 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField811() {
        return field811;
    }

    /**
     * Sets the value of the field811 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField811(String value) {
        this.field811 = value;
    }

    /**
     * Gets the value of the field812 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField812() {
        return field812;
    }

    /**
     * Sets the value of the field812 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField812(String value) {
        this.field812 = value;
    }

    /**
     * Gets the value of the field813 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField813() {
        return field813;
    }

    /**
     * Sets the value of the field813 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField813(String value) {
        this.field813 = value;
    }

    /**
     * Gets the value of the field814 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField814() {
        return field814;
    }

    /**
     * Sets the value of the field814 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField814(String value) {
        this.field814 = value;
    }

    /**
     * Gets the value of the field815 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField815() {
        return field815;
    }

    /**
     * Sets the value of the field815 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField815(String value) {
        this.field815 = value;
    }

    /**
     * Gets the value of the field816 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField816() {
        return field816;
    }

    /**
     * Sets the value of the field816 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField816(String value) {
        this.field816 = value;
    }

    /**
     * Gets the value of the field817 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField817() {
        return field817;
    }

    /**
     * Sets the value of the field817 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField817(String value) {
        this.field817 = value;
    }

    /**
     * Gets the value of the field818 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField818() {
        return field818;
    }

    /**
     * Sets the value of the field818 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField818(String value) {
        this.field818 = value;
    }

    /**
     * Gets the value of the field82 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField82() {
        return field82;
    }

    /**
     * Sets the value of the field82 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField82(Integer value) {
        this.field82 = value;
    }

    /**
     * Gets the value of the field83 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField83() {
        return field83;
    }

    /**
     * Sets the value of the field83 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField83(String value) {
        this.field83 = value;
    }

    /**
     * Gets the value of the field84 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField84() {
        return field84;
    }

    /**
     * Sets the value of the field84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField84(Integer value) {
        this.field84 = value;
    }

    /**
     * Gets the value of the field851 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField851() {
        return field851;
    }

    /**
     * Sets the value of the field851 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField851(Integer value) {
        this.field851 = value;
    }

    /**
     * Gets the value of the field852 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField852() {
        return field852;
    }

    /**
     * Sets the value of the field852 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField852(Integer value) {
        this.field852 = value;
    }

    /**
     * Gets the value of the field853 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField853() {
        return field853;
    }

    /**
     * Sets the value of the field853 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField853(Integer value) {
        this.field853 = value;
    }

    /**
     * Gets the value of the field854 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField854() {
        return field854;
    }

    /**
     * Sets the value of the field854 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField854(Integer value) {
        this.field854 = value;
    }

}
