
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
 *         &lt;element name="Field101" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field102" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field103" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field104" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field105" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1061" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1062" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1063" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1064" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1065" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1066" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1067" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1068" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1071" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1072" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1073" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1074" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1075" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1076" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1077" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field101",
    "field102",
    "field103",
    "field104",
    "field105",
    "field1061",
    "field1062",
    "field1063",
    "field1064",
    "field1065",
    "field1066",
    "field1067",
    "field1068",
    "field1071",
    "field1072",
    "field1073",
    "field1074",
    "field1075",
    "field1076",
    "field1077"
})
@XmlRootElement(name = "SchoolCommunityParents")
public class SchoolCommunityParents {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field101")
    protected Integer field101;
    @XmlElement(name = "Field102")
    protected Integer field102;
    @XmlElement(name = "Field103")
    protected Integer field103;
    @XmlElement(name = "Field104")
    protected Integer field104;
    @XmlElement(name = "Field105")
    protected Integer field105;
    @XmlElement(name = "Field1061")
    protected Integer field1061;
    @XmlElement(name = "Field1062")
    protected Integer field1062;
    @XmlElement(name = "Field1063")
    protected Integer field1063;
    @XmlElement(name = "Field1064")
    protected Integer field1064;
    @XmlElement(name = "Field1065")
    protected Integer field1065;
    @XmlElement(name = "Field1066")
    protected Integer field1066;
    @XmlElement(name = "Field1067")
    protected Integer field1067;
    @XmlElement(name = "Field1068")
    protected Integer field1068;
    @XmlElement(name = "Field1071")
    protected Integer field1071;
    @XmlElement(name = "Field1072")
    protected Integer field1072;
    @XmlElement(name = "Field1073")
    protected Integer field1073;
    @XmlElement(name = "Field1074")
    protected Integer field1074;
    @XmlElement(name = "Field1075")
    protected Integer field1075;
    @XmlElement(name = "Field1076")
    protected Integer field1076;
    @XmlElement(name = "Field1077")
    protected Integer field1077;

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
     * Gets the value of the field101 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField101() {
        return field101;
    }

    /**
     * Sets the value of the field101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField101(Integer value) {
        this.field101 = value;
    }

    /**
     * Gets the value of the field102 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField102() {
        return field102;
    }

    /**
     * Sets the value of the field102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField102(Integer value) {
        this.field102 = value;
    }

    /**
     * Gets the value of the field103 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField103() {
        return field103;
    }

    /**
     * Sets the value of the field103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField103(Integer value) {
        this.field103 = value;
    }

    /**
     * Gets the value of the field104 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField104() {
        return field104;
    }

    /**
     * Sets the value of the field104 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField104(Integer value) {
        this.field104 = value;
    }

    /**
     * Gets the value of the field105 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField105() {
        return field105;
    }

    /**
     * Sets the value of the field105 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField105(Integer value) {
        this.field105 = value;
    }

    /**
     * Gets the value of the field1061 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1061() {
        return field1061;
    }

    /**
     * Sets the value of the field1061 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1061(Integer value) {
        this.field1061 = value;
    }

    /**
     * Gets the value of the field1062 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1062() {
        return field1062;
    }

    /**
     * Sets the value of the field1062 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1062(Integer value) {
        this.field1062 = value;
    }

    /**
     * Gets the value of the field1063 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1063() {
        return field1063;
    }

    /**
     * Sets the value of the field1063 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1063(Integer value) {
        this.field1063 = value;
    }

    /**
     * Gets the value of the field1064 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1064() {
        return field1064;
    }

    /**
     * Sets the value of the field1064 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1064(Integer value) {
        this.field1064 = value;
    }

    /**
     * Gets the value of the field1065 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1065() {
        return field1065;
    }

    /**
     * Sets the value of the field1065 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1065(Integer value) {
        this.field1065 = value;
    }

    /**
     * Gets the value of the field1066 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1066() {
        return field1066;
    }

    /**
     * Sets the value of the field1066 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1066(Integer value) {
        this.field1066 = value;
    }

    /**
     * Gets the value of the field1067 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1067() {
        return field1067;
    }

    /**
     * Sets the value of the field1067 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1067(Integer value) {
        this.field1067 = value;
    }

    /**
     * Gets the value of the field1068 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1068() {
        return field1068;
    }

    /**
     * Sets the value of the field1068 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1068(Integer value) {
        this.field1068 = value;
    }

    /**
     * Gets the value of the field1071 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1071() {
        return field1071;
    }

    /**
     * Sets the value of the field1071 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1071(Integer value) {
        this.field1071 = value;
    }

    /**
     * Gets the value of the field1072 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1072() {
        return field1072;
    }

    /**
     * Sets the value of the field1072 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1072(Integer value) {
        this.field1072 = value;
    }

    /**
     * Gets the value of the field1073 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1073() {
        return field1073;
    }

    /**
     * Sets the value of the field1073 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1073(Integer value) {
        this.field1073 = value;
    }

    /**
     * Gets the value of the field1074 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1074() {
        return field1074;
    }

    /**
     * Sets the value of the field1074 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1074(Integer value) {
        this.field1074 = value;
    }

    /**
     * Gets the value of the field1075 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1075() {
        return field1075;
    }

    /**
     * Sets the value of the field1075 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1075(Integer value) {
        this.field1075 = value;
    }

    /**
     * Gets the value of the field1076 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1076() {
        return field1076;
    }

    /**
     * Sets the value of the field1076 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1076(Integer value) {
        this.field1076 = value;
    }

    /**
     * Gets the value of the field1077 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1077() {
        return field1077;
    }

    /**
     * Sets the value of the field1077 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1077(Integer value) {
        this.field1077 = value;
    }

}
