
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
 *         &lt;element name="Field71" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field731" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field732" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field733" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field734" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field741" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field742" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field743" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field744" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field745" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field75" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field76" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field77" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field78" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field79" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field710" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field711" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field712" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field713" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field714" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field71",
    "field72",
    "field731",
    "field732",
    "field733",
    "field734",
    "field741",
    "field742",
    "field743",
    "field744",
    "field745",
    "field75",
    "field76",
    "field77",
    "field78",
    "field79",
    "field710",
    "field711",
    "field712",
    "field713",
    "field714"
})
@XmlRootElement(name = "SchoolCurriculum")
public class SchoolCurriculum {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field71")
    protected Integer field71;
    @XmlElement(name = "Field72")
    protected Integer field72;
    @XmlElement(name = "Field731")
    protected Integer field731;
    @XmlElement(name = "Field732")
    protected Integer field732;
    @XmlElement(name = "Field733")
    protected Integer field733;
    @XmlElement(name = "Field734")
    protected Integer field734;
    @XmlElement(name = "Field741")
    protected Integer field741;
    @XmlElement(name = "Field742")
    protected Integer field742;
    @XmlElement(name = "Field743")
    protected Integer field743;
    @XmlElement(name = "Field744")
    protected Integer field744;
    @XmlElement(name = "Field745")
    protected Integer field745;
    @XmlElement(name = "Field75")
    protected Integer field75;
    @XmlElement(name = "Field76")
    protected Integer field76;
    @XmlElement(name = "Field77")
    protected Integer field77;
    @XmlElement(name = "Field78")
    protected Integer field78;
    @XmlElement(name = "Field79")
    protected Integer field79;
    @XmlElement(name = "Field710")
    protected Integer field710;
    @XmlElement(name = "Field711")
    protected Integer field711;
    @XmlElement(name = "Field712")
    protected Integer field712;
    @XmlElement(name = "Field713")
    protected Integer field713;
    @XmlElement(name = "Field714")
    protected Integer field714;

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
     * Gets the value of the field71 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField71() {
        return field71;
    }

    /**
     * Sets the value of the field71 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField71(Integer value) {
        this.field71 = value;
    }

    /**
     * Gets the value of the field72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField72() {
        return field72;
    }

    /**
     * Sets the value of the field72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField72(Integer value) {
        this.field72 = value;
    }

    /**
     * Gets the value of the field731 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField731() {
        return field731;
    }

    /**
     * Sets the value of the field731 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField731(Integer value) {
        this.field731 = value;
    }

    /**
     * Gets the value of the field732 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField732() {
        return field732;
    }

    /**
     * Sets the value of the field732 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField732(Integer value) {
        this.field732 = value;
    }

    /**
     * Gets the value of the field733 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField733() {
        return field733;
    }

    /**
     * Sets the value of the field733 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField733(Integer value) {
        this.field733 = value;
    }

    /**
     * Gets the value of the field734 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField734() {
        return field734;
    }

    /**
     * Sets the value of the field734 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField734(Integer value) {
        this.field734 = value;
    }

    /**
     * Gets the value of the field741 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField741() {
        return field741;
    }

    /**
     * Sets the value of the field741 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField741(Integer value) {
        this.field741 = value;
    }

    /**
     * Gets the value of the field742 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField742() {
        return field742;
    }

    /**
     * Sets the value of the field742 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField742(Integer value) {
        this.field742 = value;
    }

    /**
     * Gets the value of the field743 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField743() {
        return field743;
    }

    /**
     * Sets the value of the field743 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField743(Integer value) {
        this.field743 = value;
    }

    /**
     * Gets the value of the field744 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField744() {
        return field744;
    }

    /**
     * Sets the value of the field744 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField744(Integer value) {
        this.field744 = value;
    }

    /**
     * Gets the value of the field745 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField745() {
        return field745;
    }

    /**
     * Sets the value of the field745 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField745(Integer value) {
        this.field745 = value;
    }

    /**
     * Gets the value of the field75 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField75() {
        return field75;
    }

    /**
     * Sets the value of the field75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField75(Integer value) {
        this.field75 = value;
    }

    /**
     * Gets the value of the field76 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField76() {
        return field76;
    }

    /**
     * Sets the value of the field76 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField76(Integer value) {
        this.field76 = value;
    }

    /**
     * Gets the value of the field77 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField77() {
        return field77;
    }

    /**
     * Sets the value of the field77 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField77(Integer value) {
        this.field77 = value;
    }

    /**
     * Gets the value of the field78 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField78() {
        return field78;
    }

    /**
     * Sets the value of the field78 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField78(Integer value) {
        this.field78 = value;
    }

    /**
     * Gets the value of the field79 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField79() {
        return field79;
    }

    /**
     * Sets the value of the field79 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField79(Integer value) {
        this.field79 = value;
    }

    /**
     * Gets the value of the field710 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField710() {
        return field710;
    }

    /**
     * Sets the value of the field710 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField710(Integer value) {
        this.field710 = value;
    }

    /**
     * Gets the value of the field711 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField711() {
        return field711;
    }

    /**
     * Sets the value of the field711 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField711(Integer value) {
        this.field711 = value;
    }

    /**
     * Gets the value of the field712 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField712() {
        return field712;
    }

    /**
     * Sets the value of the field712 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField712(Integer value) {
        this.field712 = value;
    }

    /**
     * Gets the value of the field713 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField713() {
        return field713;
    }

    /**
     * Sets the value of the field713 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField713(Integer value) {
        this.field713 = value;
    }

    /**
     * Gets the value of the field714 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField714() {
        return field714;
    }

    /**
     * Sets the value of the field714 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField714(Integer value) {
        this.field714 = value;
    }

}
