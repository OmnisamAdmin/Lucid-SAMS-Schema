
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
 *         &lt;element name="Field181" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field182" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1831" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Field1832" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Field1833" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Field1851M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1851F" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1852M" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1852F" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
    "field181",
    "field182",
    "field1831",
    "field1832",
    "field1833",
    "field1851M",
    "field1851F",
    "field1852M",
    "field1852F"
})
@XmlRootElement(name = "SchoolUniform")
public class SchoolUniform {

    @XmlElement(name = "EmisNumber")
    protected Integer emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field181")
    protected Integer field181;
    @XmlElement(name = "Field182")
    protected Integer field182;
    @XmlElement(name = "Field1831")
    protected boolean field1831;
    @XmlElement(name = "Field1832")
    protected boolean field1832;
    @XmlElement(name = "Field1833")
    protected boolean field1833;
    @XmlElement(name = "Field1851M")
    protected Double field1851M;
    @XmlElement(name = "Field1851F")
    protected Double field1851F;
    @XmlElement(name = "Field1852M")
    protected Double field1852M;
    @XmlElement(name = "Field1852F")
    protected Double field1852F;

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
     * Gets the value of the field181 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField181() {
        return field181;
    }

    /**
     * Sets the value of the field181 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField181(Integer value) {
        this.field181 = value;
    }

    /**
     * Gets the value of the field182 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField182() {
        return field182;
    }

    /**
     * Sets the value of the field182 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField182(Integer value) {
        this.field182 = value;
    }

    /**
     * Gets the value of the field1831 property.
     * 
     */
    public boolean isField1831() {
        return field1831;
    }

    /**
     * Sets the value of the field1831 property.
     * 
     */
    public void setField1831(boolean value) {
        this.field1831 = value;
    }

    /**
     * Gets the value of the field1832 property.
     * 
     */
    public boolean isField1832() {
        return field1832;
    }

    /**
     * Sets the value of the field1832 property.
     * 
     */
    public void setField1832(boolean value) {
        this.field1832 = value;
    }

    /**
     * Gets the value of the field1833 property.
     * 
     */
    public boolean isField1833() {
        return field1833;
    }

    /**
     * Sets the value of the field1833 property.
     * 
     */
    public void setField1833(boolean value) {
        this.field1833 = value;
    }

    /**
     * Gets the value of the field1851M property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1851M() {
        return field1851M;
    }

    /**
     * Sets the value of the field1851M property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1851M(Double value) {
        this.field1851M = value;
    }

    /**
     * Gets the value of the field1851F property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1851F() {
        return field1851F;
    }

    /**
     * Sets the value of the field1851F property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1851F(Double value) {
        this.field1851F = value;
    }

    /**
     * Gets the value of the field1852M property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1852M() {
        return field1852M;
    }

    /**
     * Sets the value of the field1852M property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1852M(Double value) {
        this.field1852M = value;
    }

    /**
     * Gets the value of the field1852F property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1852F() {
        return field1852F;
    }

    /**
     * Sets the value of the field1852F property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1852F(Double value) {
        this.field1852F = value;
    }

}
