
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
 *         &lt;element name="EmisNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field1711" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1712" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1713" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1714" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1715" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1721" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1722" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1723" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1724" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1731" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1732" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1733" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1734" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1735" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1736" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1737" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1741" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1742" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1743" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1744" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1745" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1746" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1747" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field1711",
    "field1712",
    "field1713",
    "field1714",
    "field1715",
    "field1721",
    "field1722",
    "field1723",
    "field1724",
    "field1731",
    "field1732",
    "field1733",
    "field1734",
    "field1735",
    "field1736",
    "field1737",
    "field1741",
    "field1742",
    "field1743",
    "field1744",
    "field1745",
    "field1746",
    "field1747"
})
@XmlRootElement(name = "SchoolFees")
public class SchoolFees {

    @XmlElement(name = "EmisNumber")
    protected Integer emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field1711")
    protected Integer field1711;
    @XmlElement(name = "Field1712")
    protected Integer field1712;
    @XmlElement(name = "Field1713")
    protected Integer field1713;
    @XmlElement(name = "Field1714")
    protected Integer field1714;
    @XmlElement(name = "Field1715")
    protected Integer field1715;
    @XmlElement(name = "Field1721")
    protected Integer field1721;
    @XmlElement(name = "Field1722")
    protected Integer field1722;
    @XmlElement(name = "Field1723")
    protected Integer field1723;
    @XmlElement(name = "Field1724")
    protected Integer field1724;
    @XmlElement(name = "Field1731")
    protected Integer field1731;
    @XmlElement(name = "Field1732")
    protected Integer field1732;
    @XmlElement(name = "Field1733")
    protected Integer field1733;
    @XmlElement(name = "Field1734")
    protected Integer field1734;
    @XmlElement(name = "Field1735")
    protected Integer field1735;
    @XmlElement(name = "Field1736")
    protected Integer field1736;
    @XmlElement(name = "Field1737")
    protected Integer field1737;
    @XmlElement(name = "Field1741")
    protected Integer field1741;
    @XmlElement(name = "Field1742")
    protected Integer field1742;
    @XmlElement(name = "Field1743")
    protected Integer field1743;
    @XmlElement(name = "Field1744")
    protected Integer field1744;
    @XmlElement(name = "Field1745")
    protected Integer field1745;
    @XmlElement(name = "Field1746")
    protected Integer field1746;
    @XmlElement(name = "Field1747")
    protected Integer field1747;

    /**
     * Gets the value of the emisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmisNumber() {
        return emisNumber;
    }

    /**
     * Sets the value of the emisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmisNumber(Integer value) {
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
     * Gets the value of the field1711 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1711() {
        return field1711;
    }

    /**
     * Sets the value of the field1711 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1711(Integer value) {
        this.field1711 = value;
    }

    /**
     * Gets the value of the field1712 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1712() {
        return field1712;
    }

    /**
     * Sets the value of the field1712 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1712(Integer value) {
        this.field1712 = value;
    }

    /**
     * Gets the value of the field1713 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1713() {
        return field1713;
    }

    /**
     * Sets the value of the field1713 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1713(Integer value) {
        this.field1713 = value;
    }

    /**
     * Gets the value of the field1714 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1714() {
        return field1714;
    }

    /**
     * Sets the value of the field1714 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1714(Integer value) {
        this.field1714 = value;
    }

    /**
     * Gets the value of the field1715 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1715() {
        return field1715;
    }

    /**
     * Sets the value of the field1715 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1715(Integer value) {
        this.field1715 = value;
    }

    /**
     * Gets the value of the field1721 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1721() {
        return field1721;
    }

    /**
     * Sets the value of the field1721 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1721(Integer value) {
        this.field1721 = value;
    }

    /**
     * Gets the value of the field1722 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1722() {
        return field1722;
    }

    /**
     * Sets the value of the field1722 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1722(Integer value) {
        this.field1722 = value;
    }

    /**
     * Gets the value of the field1723 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1723() {
        return field1723;
    }

    /**
     * Sets the value of the field1723 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1723(Integer value) {
        this.field1723 = value;
    }

    /**
     * Gets the value of the field1724 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1724() {
        return field1724;
    }

    /**
     * Sets the value of the field1724 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1724(Integer value) {
        this.field1724 = value;
    }

    /**
     * Gets the value of the field1731 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1731() {
        return field1731;
    }

    /**
     * Sets the value of the field1731 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1731(Integer value) {
        this.field1731 = value;
    }

    /**
     * Gets the value of the field1732 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1732() {
        return field1732;
    }

    /**
     * Sets the value of the field1732 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1732(Integer value) {
        this.field1732 = value;
    }

    /**
     * Gets the value of the field1733 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1733() {
        return field1733;
    }

    /**
     * Sets the value of the field1733 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1733(Integer value) {
        this.field1733 = value;
    }

    /**
     * Gets the value of the field1734 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1734() {
        return field1734;
    }

    /**
     * Sets the value of the field1734 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1734(Integer value) {
        this.field1734 = value;
    }

    /**
     * Gets the value of the field1735 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1735() {
        return field1735;
    }

    /**
     * Sets the value of the field1735 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1735(Integer value) {
        this.field1735 = value;
    }

    /**
     * Gets the value of the field1736 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1736() {
        return field1736;
    }

    /**
     * Sets the value of the field1736 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1736(Integer value) {
        this.field1736 = value;
    }

    /**
     * Gets the value of the field1737 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1737() {
        return field1737;
    }

    /**
     * Sets the value of the field1737 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1737(Integer value) {
        this.field1737 = value;
    }

    /**
     * Gets the value of the field1741 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1741() {
        return field1741;
    }

    /**
     * Sets the value of the field1741 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1741(Integer value) {
        this.field1741 = value;
    }

    /**
     * Gets the value of the field1742 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1742() {
        return field1742;
    }

    /**
     * Sets the value of the field1742 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1742(Integer value) {
        this.field1742 = value;
    }

    /**
     * Gets the value of the field1743 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1743() {
        return field1743;
    }

    /**
     * Sets the value of the field1743 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1743(Integer value) {
        this.field1743 = value;
    }

    /**
     * Gets the value of the field1744 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1744() {
        return field1744;
    }

    /**
     * Sets the value of the field1744 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1744(Integer value) {
        this.field1744 = value;
    }

    /**
     * Gets the value of the field1745 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1745() {
        return field1745;
    }

    /**
     * Sets the value of the field1745 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1745(Integer value) {
        this.field1745 = value;
    }

    /**
     * Gets the value of the field1746 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1746() {
        return field1746;
    }

    /**
     * Sets the value of the field1746 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1746(Integer value) {
        this.field1746 = value;
    }

    /**
     * Gets the value of the field1747 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1747() {
        return field1747;
    }

    /**
     * Sets the value of the field1747 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1747(Integer value) {
        this.field1747 = value;
    }

}
