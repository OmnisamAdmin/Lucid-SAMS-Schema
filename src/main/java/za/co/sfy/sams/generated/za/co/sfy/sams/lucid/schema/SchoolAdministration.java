
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
 *         &lt;element name="EmisNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field61" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field62" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field631" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field632" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field633" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field634" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field635" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field64" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field65" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field66" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field67" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field68" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field69" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field610" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field611" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field612" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6131" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6132" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6133" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Field6134" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6135" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6136" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6137" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6138" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field6139" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field61",
    "field62",
    "field631",
    "field632",
    "field633",
    "field634",
    "field635",
    "field64",
    "field65",
    "field66",
    "field67",
    "field68",
    "field69",
    "field610",
    "field611",
    "field612",
    "field6131",
    "field6132",
    "field6133",
    "field6134",
    "field6135",
    "field6136",
    "field6137",
    "field6138",
    "field6139"
})
@XmlRootElement(name = "SchoolAdministration")
public class SchoolAdministration {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field61")
    protected Integer field61;
    @XmlElement(name = "Field62")
    protected Integer field62;
    @XmlElement(name = "Field631")
    protected Integer field631;
    @XmlElement(name = "Field632")
    protected Integer field632;
    @XmlElement(name = "Field633")
    protected Integer field633;
    @XmlElement(name = "Field634")
    protected Integer field634;
    @XmlElement(name = "Field635")
    protected Integer field635;
    @XmlElement(name = "Field64")
    protected Integer field64;
    @XmlElement(name = "Field65")
    protected Integer field65;
    @XmlElement(name = "Field66")
    protected Integer field66;
    @XmlElement(name = "Field67")
    protected Integer field67;
    @XmlElement(name = "Field68")
    protected Integer field68;
    @XmlElement(name = "Field69")
    protected Integer field69;
    @XmlElement(name = "Field610")
    protected Integer field610;
    @XmlElement(name = "Field611")
    protected Integer field611;
    @XmlElement(name = "Field612")
    protected Integer field612;
    @XmlElement(name = "Field6131")
    protected Integer field6131;
    @XmlElement(name = "Field6132")
    protected Integer field6132;
    @XmlElement(name = "Field6133")
    protected Short field6133;
    @XmlElement(name = "Field6134")
    protected Integer field6134;
    @XmlElement(name = "Field6135")
    protected Integer field6135;
    @XmlElement(name = "Field6136")
    protected Integer field6136;
    @XmlElement(name = "Field6137")
    protected Integer field6137;
    @XmlElement(name = "Field6138")
    protected Integer field6138;
    @XmlElement(name = "Field6139")
    protected Integer field6139;

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
     * Gets the value of the field61 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField61() {
        return field61;
    }

    /**
     * Sets the value of the field61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField61(Integer value) {
        this.field61 = value;
    }

    /**
     * Gets the value of the field62 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField62() {
        return field62;
    }

    /**
     * Sets the value of the field62 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField62(Integer value) {
        this.field62 = value;
    }

    /**
     * Gets the value of the field631 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField631() {
        return field631;
    }

    /**
     * Sets the value of the field631 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField631(Integer value) {
        this.field631 = value;
    }

    /**
     * Gets the value of the field632 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField632() {
        return field632;
    }

    /**
     * Sets the value of the field632 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField632(Integer value) {
        this.field632 = value;
    }

    /**
     * Gets the value of the field633 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField633() {
        return field633;
    }

    /**
     * Sets the value of the field633 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField633(Integer value) {
        this.field633 = value;
    }

    /**
     * Gets the value of the field634 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField634() {
        return field634;
    }

    /**
     * Sets the value of the field634 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField634(Integer value) {
        this.field634 = value;
    }

    /**
     * Gets the value of the field635 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField635() {
        return field635;
    }

    /**
     * Sets the value of the field635 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField635(Integer value) {
        this.field635 = value;
    }

    /**
     * Gets the value of the field64 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField64() {
        return field64;
    }

    /**
     * Sets the value of the field64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField64(Integer value) {
        this.field64 = value;
    }

    /**
     * Gets the value of the field65 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField65() {
        return field65;
    }

    /**
     * Sets the value of the field65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField65(Integer value) {
        this.field65 = value;
    }

    /**
     * Gets the value of the field66 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField66() {
        return field66;
    }

    /**
     * Sets the value of the field66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField66(Integer value) {
        this.field66 = value;
    }

    /**
     * Gets the value of the field67 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField67() {
        return field67;
    }

    /**
     * Sets the value of the field67 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField67(Integer value) {
        this.field67 = value;
    }

    /**
     * Gets the value of the field68 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField68() {
        return field68;
    }

    /**
     * Sets the value of the field68 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField68(Integer value) {
        this.field68 = value;
    }

    /**
     * Gets the value of the field69 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField69() {
        return field69;
    }

    /**
     * Sets the value of the field69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField69(Integer value) {
        this.field69 = value;
    }

    /**
     * Gets the value of the field610 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField610() {
        return field610;
    }

    /**
     * Sets the value of the field610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField610(Integer value) {
        this.field610 = value;
    }

    /**
     * Gets the value of the field611 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField611() {
        return field611;
    }

    /**
     * Sets the value of the field611 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField611(Integer value) {
        this.field611 = value;
    }

    /**
     * Gets the value of the field612 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField612() {
        return field612;
    }

    /**
     * Sets the value of the field612 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField612(Integer value) {
        this.field612 = value;
    }

    /**
     * Gets the value of the field6131 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6131() {
        return field6131;
    }

    /**
     * Sets the value of the field6131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6131(Integer value) {
        this.field6131 = value;
    }

    /**
     * Gets the value of the field6132 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6132() {
        return field6132;
    }

    /**
     * Sets the value of the field6132 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6132(Integer value) {
        this.field6132 = value;
    }

    /**
     * Gets the value of the field6133 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getField6133() {
        return field6133;
    }

    /**
     * Sets the value of the field6133 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setField6133(Short value) {
        this.field6133 = value;
    }

    /**
     * Gets the value of the field6134 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6134() {
        return field6134;
    }

    /**
     * Sets the value of the field6134 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6134(Integer value) {
        this.field6134 = value;
    }

    /**
     * Gets the value of the field6135 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6135() {
        return field6135;
    }

    /**
     * Sets the value of the field6135 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6135(Integer value) {
        this.field6135 = value;
    }

    /**
     * Gets the value of the field6136 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6136() {
        return field6136;
    }

    /**
     * Sets the value of the field6136 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6136(Integer value) {
        this.field6136 = value;
    }

    /**
     * Gets the value of the field6137 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6137() {
        return field6137;
    }

    /**
     * Sets the value of the field6137 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6137(Integer value) {
        this.field6137 = value;
    }

    /**
     * Gets the value of the field6138 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6138() {
        return field6138;
    }

    /**
     * Sets the value of the field6138 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6138(Integer value) {
        this.field6138 = value;
    }

    /**
     * Gets the value of the field6139 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField6139() {
        return field6139;
    }

    /**
     * Sets the value of the field6139 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField6139(Integer value) {
        this.field6139 = value;
    }

}
