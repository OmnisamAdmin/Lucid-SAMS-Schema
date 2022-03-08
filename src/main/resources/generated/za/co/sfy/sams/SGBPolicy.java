
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
 *         &lt;element name="Field411" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field412" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field413" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field414" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field421" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field422" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field423" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field424" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field425" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field426" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field427" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field428" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field431" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field432" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field433" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field434" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field435" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field436" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field44" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field45" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field46" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field47" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field48" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field49" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4100" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4110" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4121" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4122" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4123" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4124" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4125" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4131" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4132" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4141" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4142" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4143" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4144" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4145" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4146" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4151" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4152" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4153" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4154" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field4155" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field416" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field417" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field418" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field419" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field420" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field411",
    "field412",
    "field413",
    "field414",
    "field421",
    "field422",
    "field423",
    "field424",
    "field425",
    "field426",
    "field427",
    "field428",
    "field431",
    "field432",
    "field433",
    "field434",
    "field435",
    "field436",
    "field44",
    "field45",
    "field46",
    "field47",
    "field48",
    "field49",
    "field4100",
    "field4110",
    "field4121",
    "field4122",
    "field4123",
    "field4124",
    "field4125",
    "field4131",
    "field4132",
    "field4141",
    "field4142",
    "field4143",
    "field4144",
    "field4145",
    "field4146",
    "field4151",
    "field4152",
    "field4153",
    "field4154",
    "field4155",
    "field416",
    "field417",
    "field418",
    "field419",
    "field420"
})
@XmlRootElement(name = "SGBPolicy")
public class SGBPolicy {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field411")
    protected Integer field411;
    @XmlElement(name = "Field412")
    protected Integer field412;
    @XmlElement(name = "Field413")
    protected Integer field413;
    @XmlElement(name = "Field414")
    protected Integer field414;
    @XmlElement(name = "Field421")
    protected Integer field421;
    @XmlElement(name = "Field422")
    protected Integer field422;
    @XmlElement(name = "Field423")
    protected Integer field423;
    @XmlElement(name = "Field424")
    protected Integer field424;
    @XmlElement(name = "Field425")
    protected Integer field425;
    @XmlElement(name = "Field426")
    protected Integer field426;
    @XmlElement(name = "Field427")
    protected Integer field427;
    @XmlElement(name = "Field428")
    protected Integer field428;
    @XmlElement(name = "Field431")
    protected Integer field431;
    @XmlElement(name = "Field432")
    protected Integer field432;
    @XmlElement(name = "Field433")
    protected Integer field433;
    @XmlElement(name = "Field434")
    protected Integer field434;
    @XmlElement(name = "Field435")
    protected Integer field435;
    @XmlElement(name = "Field436")
    protected Integer field436;
    @XmlElement(name = "Field44")
    protected Integer field44;
    @XmlElement(name = "Field45")
    protected Integer field45;
    @XmlElement(name = "Field46")
    protected Integer field46;
    @XmlElement(name = "Field47")
    protected Integer field47;
    @XmlElement(name = "Field48")
    protected Integer field48;
    @XmlElement(name = "Field49")
    protected Integer field49;
    @XmlElement(name = "Field4100")
    protected Integer field4100;
    @XmlElement(name = "Field4110")
    protected Integer field4110;
    @XmlElement(name = "Field4121")
    protected Integer field4121;
    @XmlElement(name = "Field4122")
    protected Integer field4122;
    @XmlElement(name = "Field4123")
    protected Integer field4123;
    @XmlElement(name = "Field4124")
    protected Integer field4124;
    @XmlElement(name = "Field4125")
    protected Integer field4125;
    @XmlElement(name = "Field4131")
    protected Integer field4131;
    @XmlElement(name = "Field4132")
    protected Integer field4132;
    @XmlElement(name = "Field4141")
    protected Integer field4141;
    @XmlElement(name = "Field4142")
    protected Integer field4142;
    @XmlElement(name = "Field4143")
    protected Integer field4143;
    @XmlElement(name = "Field4144")
    protected Integer field4144;
    @XmlElement(name = "Field4145")
    protected Integer field4145;
    @XmlElement(name = "Field4146")
    protected Integer field4146;
    @XmlElement(name = "Field4151")
    protected Integer field4151;
    @XmlElement(name = "Field4152")
    protected Integer field4152;
    @XmlElement(name = "Field4153")
    protected Integer field4153;
    @XmlElement(name = "Field4154")
    protected Integer field4154;
    @XmlElement(name = "Field4155")
    protected Integer field4155;
    @XmlElement(name = "Field416")
    protected Integer field416;
    @XmlElement(name = "Field417")
    protected Integer field417;
    @XmlElement(name = "Field418")
    protected Integer field418;
    @XmlElement(name = "Field419")
    protected Integer field419;
    @XmlElement(name = "Field420")
    protected Integer field420;

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
     * Gets the value of the field411 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField411() {
        return field411;
    }

    /**
     * Sets the value of the field411 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField411(Integer value) {
        this.field411 = value;
    }

    /**
     * Gets the value of the field412 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField412() {
        return field412;
    }

    /**
     * Sets the value of the field412 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField412(Integer value) {
        this.field412 = value;
    }

    /**
     * Gets the value of the field413 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField413() {
        return field413;
    }

    /**
     * Sets the value of the field413 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField413(Integer value) {
        this.field413 = value;
    }

    /**
     * Gets the value of the field414 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField414() {
        return field414;
    }

    /**
     * Sets the value of the field414 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField414(Integer value) {
        this.field414 = value;
    }

    /**
     * Gets the value of the field421 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField421() {
        return field421;
    }

    /**
     * Sets the value of the field421 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField421(Integer value) {
        this.field421 = value;
    }

    /**
     * Gets the value of the field422 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField422() {
        return field422;
    }

    /**
     * Sets the value of the field422 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField422(Integer value) {
        this.field422 = value;
    }

    /**
     * Gets the value of the field423 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField423() {
        return field423;
    }

    /**
     * Sets the value of the field423 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField423(Integer value) {
        this.field423 = value;
    }

    /**
     * Gets the value of the field424 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField424() {
        return field424;
    }

    /**
     * Sets the value of the field424 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField424(Integer value) {
        this.field424 = value;
    }

    /**
     * Gets the value of the field425 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField425() {
        return field425;
    }

    /**
     * Sets the value of the field425 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField425(Integer value) {
        this.field425 = value;
    }

    /**
     * Gets the value of the field426 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField426() {
        return field426;
    }

    /**
     * Sets the value of the field426 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField426(Integer value) {
        this.field426 = value;
    }

    /**
     * Gets the value of the field427 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField427() {
        return field427;
    }

    /**
     * Sets the value of the field427 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField427(Integer value) {
        this.field427 = value;
    }

    /**
     * Gets the value of the field428 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField428() {
        return field428;
    }

    /**
     * Sets the value of the field428 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField428(Integer value) {
        this.field428 = value;
    }

    /**
     * Gets the value of the field431 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField431() {
        return field431;
    }

    /**
     * Sets the value of the field431 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField431(Integer value) {
        this.field431 = value;
    }

    /**
     * Gets the value of the field432 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField432() {
        return field432;
    }

    /**
     * Sets the value of the field432 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField432(Integer value) {
        this.field432 = value;
    }

    /**
     * Gets the value of the field433 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField433() {
        return field433;
    }

    /**
     * Sets the value of the field433 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField433(Integer value) {
        this.field433 = value;
    }

    /**
     * Gets the value of the field434 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField434() {
        return field434;
    }

    /**
     * Sets the value of the field434 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField434(Integer value) {
        this.field434 = value;
    }

    /**
     * Gets the value of the field435 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField435() {
        return field435;
    }

    /**
     * Sets the value of the field435 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField435(Integer value) {
        this.field435 = value;
    }

    /**
     * Gets the value of the field436 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField436() {
        return field436;
    }

    /**
     * Sets the value of the field436 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField436(Integer value) {
        this.field436 = value;
    }

    /**
     * Gets the value of the field44 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField44() {
        return field44;
    }

    /**
     * Sets the value of the field44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField44(Integer value) {
        this.field44 = value;
    }

    /**
     * Gets the value of the field45 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField45() {
        return field45;
    }

    /**
     * Sets the value of the field45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField45(Integer value) {
        this.field45 = value;
    }

    /**
     * Gets the value of the field46 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField46() {
        return field46;
    }

    /**
     * Sets the value of the field46 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField46(Integer value) {
        this.field46 = value;
    }

    /**
     * Gets the value of the field47 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField47() {
        return field47;
    }

    /**
     * Sets the value of the field47 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField47(Integer value) {
        this.field47 = value;
    }

    /**
     * Gets the value of the field48 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField48() {
        return field48;
    }

    /**
     * Sets the value of the field48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField48(Integer value) {
        this.field48 = value;
    }

    /**
     * Gets the value of the field49 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField49() {
        return field49;
    }

    /**
     * Sets the value of the field49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField49(Integer value) {
        this.field49 = value;
    }

    /**
     * Gets the value of the field4100 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4100() {
        return field4100;
    }

    /**
     * Sets the value of the field4100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4100(Integer value) {
        this.field4100 = value;
    }

    /**
     * Gets the value of the field4110 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4110() {
        return field4110;
    }

    /**
     * Sets the value of the field4110 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4110(Integer value) {
        this.field4110 = value;
    }

    /**
     * Gets the value of the field4121 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4121() {
        return field4121;
    }

    /**
     * Sets the value of the field4121 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4121(Integer value) {
        this.field4121 = value;
    }

    /**
     * Gets the value of the field4122 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4122() {
        return field4122;
    }

    /**
     * Sets the value of the field4122 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4122(Integer value) {
        this.field4122 = value;
    }

    /**
     * Gets the value of the field4123 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4123() {
        return field4123;
    }

    /**
     * Sets the value of the field4123 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4123(Integer value) {
        this.field4123 = value;
    }

    /**
     * Gets the value of the field4124 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4124() {
        return field4124;
    }

    /**
     * Sets the value of the field4124 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4124(Integer value) {
        this.field4124 = value;
    }

    /**
     * Gets the value of the field4125 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4125() {
        return field4125;
    }

    /**
     * Sets the value of the field4125 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4125(Integer value) {
        this.field4125 = value;
    }

    /**
     * Gets the value of the field4131 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4131() {
        return field4131;
    }

    /**
     * Sets the value of the field4131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4131(Integer value) {
        this.field4131 = value;
    }

    /**
     * Gets the value of the field4132 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4132() {
        return field4132;
    }

    /**
     * Sets the value of the field4132 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4132(Integer value) {
        this.field4132 = value;
    }

    /**
     * Gets the value of the field4141 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4141() {
        return field4141;
    }

    /**
     * Sets the value of the field4141 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4141(Integer value) {
        this.field4141 = value;
    }

    /**
     * Gets the value of the field4142 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4142() {
        return field4142;
    }

    /**
     * Sets the value of the field4142 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4142(Integer value) {
        this.field4142 = value;
    }

    /**
     * Gets the value of the field4143 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4143() {
        return field4143;
    }

    /**
     * Sets the value of the field4143 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4143(Integer value) {
        this.field4143 = value;
    }

    /**
     * Gets the value of the field4144 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4144() {
        return field4144;
    }

    /**
     * Sets the value of the field4144 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4144(Integer value) {
        this.field4144 = value;
    }

    /**
     * Gets the value of the field4145 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4145() {
        return field4145;
    }

    /**
     * Sets the value of the field4145 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4145(Integer value) {
        this.field4145 = value;
    }

    /**
     * Gets the value of the field4146 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4146() {
        return field4146;
    }

    /**
     * Sets the value of the field4146 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4146(Integer value) {
        this.field4146 = value;
    }

    /**
     * Gets the value of the field4151 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4151() {
        return field4151;
    }

    /**
     * Sets the value of the field4151 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4151(Integer value) {
        this.field4151 = value;
    }

    /**
     * Gets the value of the field4152 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4152() {
        return field4152;
    }

    /**
     * Sets the value of the field4152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4152(Integer value) {
        this.field4152 = value;
    }

    /**
     * Gets the value of the field4153 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4153() {
        return field4153;
    }

    /**
     * Sets the value of the field4153 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4153(Integer value) {
        this.field4153 = value;
    }

    /**
     * Gets the value of the field4154 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4154() {
        return field4154;
    }

    /**
     * Sets the value of the field4154 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4154(Integer value) {
        this.field4154 = value;
    }

    /**
     * Gets the value of the field4155 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField4155() {
        return field4155;
    }

    /**
     * Sets the value of the field4155 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField4155(Integer value) {
        this.field4155 = value;
    }

    /**
     * Gets the value of the field416 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField416() {
        return field416;
    }

    /**
     * Sets the value of the field416 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField416(Integer value) {
        this.field416 = value;
    }

    /**
     * Gets the value of the field417 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField417() {
        return field417;
    }

    /**
     * Sets the value of the field417 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField417(Integer value) {
        this.field417 = value;
    }

    /**
     * Gets the value of the field418 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField418() {
        return field418;
    }

    /**
     * Sets the value of the field418 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField418(Integer value) {
        this.field418 = value;
    }

    /**
     * Gets the value of the field419 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField419() {
        return field419;
    }

    /**
     * Sets the value of the field419 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField419(Integer value) {
        this.field419 = value;
    }

    /**
     * Gets the value of the field420 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField420() {
        return field420;
    }

    /**
     * Sets the value of the field420 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField420(Integer value) {
        this.field420 = value;
    }

}
