
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
 *         &lt;element name="Datayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field32" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field331" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field332" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field333" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field334" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field34" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field351" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field352" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field353" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field354" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field355" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field356" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field357" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field358" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field359" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3510" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3511" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3512" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field361" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field362" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field363" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field364" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field365" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field366" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field367" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field368" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field369" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3610" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3611" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field37" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field381" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field382" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field383" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field384" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field39" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3101" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3102" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3103" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3104" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3111" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3112" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3113" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3114" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3115" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3116" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field3117" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "datayear",
    "field32",
    "field331",
    "field332",
    "field333",
    "field334",
    "field34",
    "field351",
    "field352",
    "field353",
    "field354",
    "field355",
    "field356",
    "field357",
    "field358",
    "field359",
    "field3510",
    "field3511",
    "field3512",
    "field361",
    "field362",
    "field363",
    "field364",
    "field365",
    "field366",
    "field367",
    "field368",
    "field369",
    "field3610",
    "field3611",
    "field37",
    "field381",
    "field382",
    "field383",
    "field384",
    "field39",
    "field3101",
    "field3102",
    "field3103",
    "field3104",
    "field3111",
    "field3112",
    "field3113",
    "field3114",
    "field3115",
    "field3116",
    "field3117"
})
@XmlRootElement(name = "_x0031_8_1_0_SGBFunctions")
public class X0031810SGBFunctions {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "Datayear")
    protected String datayear;
    @XmlElement(name = "Field32")
    protected Integer field32;
    @XmlElement(name = "Field331")
    protected Integer field331;
    @XmlElement(name = "Field332")
    protected Integer field332;
    @XmlElement(name = "Field333")
    protected Integer field333;
    @XmlElement(name = "Field334")
    protected Integer field334;
    @XmlElement(name = "Field34")
    protected Integer field34;
    @XmlElement(name = "Field351")
    protected Integer field351;
    @XmlElement(name = "Field352")
    protected Integer field352;
    @XmlElement(name = "Field353")
    protected Integer field353;
    @XmlElement(name = "Field354")
    protected Integer field354;
    @XmlElement(name = "Field355")
    protected Integer field355;
    @XmlElement(name = "Field356")
    protected Integer field356;
    @XmlElement(name = "Field357")
    protected Integer field357;
    @XmlElement(name = "Field358")
    protected Integer field358;
    @XmlElement(name = "Field359")
    protected Integer field359;
    @XmlElement(name = "Field3510")
    protected Integer field3510;
    @XmlElement(name = "Field3511")
    protected Integer field3511;
    @XmlElement(name = "Field3512")
    protected Integer field3512;
    @XmlElement(name = "Field361")
    protected Integer field361;
    @XmlElement(name = "Field362")
    protected Integer field362;
    @XmlElement(name = "Field363")
    protected Integer field363;
    @XmlElement(name = "Field364")
    protected Integer field364;
    @XmlElement(name = "Field365")
    protected Integer field365;
    @XmlElement(name = "Field366")
    protected Integer field366;
    @XmlElement(name = "Field367")
    protected Integer field367;
    @XmlElement(name = "Field368")
    protected Integer field368;
    @XmlElement(name = "Field369")
    protected Integer field369;
    @XmlElement(name = "Field3610")
    protected Integer field3610;
    @XmlElement(name = "Field3611")
    protected Integer field3611;
    @XmlElement(name = "Field37")
    protected Integer field37;
    @XmlElement(name = "Field381")
    protected Integer field381;
    @XmlElement(name = "Field382")
    protected Integer field382;
    @XmlElement(name = "Field383")
    protected Integer field383;
    @XmlElement(name = "Field384")
    protected Integer field384;
    @XmlElement(name = "Field39")
    protected Integer field39;
    @XmlElement(name = "Field3101")
    protected Integer field3101;
    @XmlElement(name = "Field3102")
    protected Integer field3102;
    @XmlElement(name = "Field3103")
    protected Integer field3103;
    @XmlElement(name = "Field3104")
    protected Integer field3104;
    @XmlElement(name = "Field3111")
    protected Integer field3111;
    @XmlElement(name = "Field3112")
    protected Integer field3112;
    @XmlElement(name = "Field3113")
    protected Integer field3113;
    @XmlElement(name = "Field3114")
    protected Integer field3114;
    @XmlElement(name = "Field3115")
    protected Integer field3115;
    @XmlElement(name = "Field3116")
    protected Integer field3116;
    @XmlElement(name = "Field3117")
    protected Integer field3117;

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
     * Gets the value of the datayear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatayear() {
        return datayear;
    }

    /**
     * Sets the value of the datayear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatayear(String value) {
        this.datayear = value;
    }

    /**
     * Gets the value of the field32 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField32() {
        return field32;
    }

    /**
     * Sets the value of the field32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField32(Integer value) {
        this.field32 = value;
    }

    /**
     * Gets the value of the field331 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField331() {
        return field331;
    }

    /**
     * Sets the value of the field331 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField331(Integer value) {
        this.field331 = value;
    }

    /**
     * Gets the value of the field332 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField332() {
        return field332;
    }

    /**
     * Sets the value of the field332 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField332(Integer value) {
        this.field332 = value;
    }

    /**
     * Gets the value of the field333 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField333() {
        return field333;
    }

    /**
     * Sets the value of the field333 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField333(Integer value) {
        this.field333 = value;
    }

    /**
     * Gets the value of the field334 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField334() {
        return field334;
    }

    /**
     * Sets the value of the field334 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField334(Integer value) {
        this.field334 = value;
    }

    /**
     * Gets the value of the field34 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField34() {
        return field34;
    }

    /**
     * Sets the value of the field34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField34(Integer value) {
        this.field34 = value;
    }

    /**
     * Gets the value of the field351 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField351() {
        return field351;
    }

    /**
     * Sets the value of the field351 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField351(Integer value) {
        this.field351 = value;
    }

    /**
     * Gets the value of the field352 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField352() {
        return field352;
    }

    /**
     * Sets the value of the field352 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField352(Integer value) {
        this.field352 = value;
    }

    /**
     * Gets the value of the field353 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField353() {
        return field353;
    }

    /**
     * Sets the value of the field353 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField353(Integer value) {
        this.field353 = value;
    }

    /**
     * Gets the value of the field354 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField354() {
        return field354;
    }

    /**
     * Sets the value of the field354 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField354(Integer value) {
        this.field354 = value;
    }

    /**
     * Gets the value of the field355 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField355() {
        return field355;
    }

    /**
     * Sets the value of the field355 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField355(Integer value) {
        this.field355 = value;
    }

    /**
     * Gets the value of the field356 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField356() {
        return field356;
    }

    /**
     * Sets the value of the field356 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField356(Integer value) {
        this.field356 = value;
    }

    /**
     * Gets the value of the field357 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField357() {
        return field357;
    }

    /**
     * Sets the value of the field357 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField357(Integer value) {
        this.field357 = value;
    }

    /**
     * Gets the value of the field358 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField358() {
        return field358;
    }

    /**
     * Sets the value of the field358 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField358(Integer value) {
        this.field358 = value;
    }

    /**
     * Gets the value of the field359 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField359() {
        return field359;
    }

    /**
     * Sets the value of the field359 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField359(Integer value) {
        this.field359 = value;
    }

    /**
     * Gets the value of the field3510 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3510() {
        return field3510;
    }

    /**
     * Sets the value of the field3510 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3510(Integer value) {
        this.field3510 = value;
    }

    /**
     * Gets the value of the field3511 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3511() {
        return field3511;
    }

    /**
     * Sets the value of the field3511 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3511(Integer value) {
        this.field3511 = value;
    }

    /**
     * Gets the value of the field3512 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3512() {
        return field3512;
    }

    /**
     * Sets the value of the field3512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3512(Integer value) {
        this.field3512 = value;
    }

    /**
     * Gets the value of the field361 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField361() {
        return field361;
    }

    /**
     * Sets the value of the field361 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField361(Integer value) {
        this.field361 = value;
    }

    /**
     * Gets the value of the field362 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField362() {
        return field362;
    }

    /**
     * Sets the value of the field362 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField362(Integer value) {
        this.field362 = value;
    }

    /**
     * Gets the value of the field363 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField363() {
        return field363;
    }

    /**
     * Sets the value of the field363 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField363(Integer value) {
        this.field363 = value;
    }

    /**
     * Gets the value of the field364 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField364() {
        return field364;
    }

    /**
     * Sets the value of the field364 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField364(Integer value) {
        this.field364 = value;
    }

    /**
     * Gets the value of the field365 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField365() {
        return field365;
    }

    /**
     * Sets the value of the field365 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField365(Integer value) {
        this.field365 = value;
    }

    /**
     * Gets the value of the field366 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField366() {
        return field366;
    }

    /**
     * Sets the value of the field366 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField366(Integer value) {
        this.field366 = value;
    }

    /**
     * Gets the value of the field367 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField367() {
        return field367;
    }

    /**
     * Sets the value of the field367 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField367(Integer value) {
        this.field367 = value;
    }

    /**
     * Gets the value of the field368 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField368() {
        return field368;
    }

    /**
     * Sets the value of the field368 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField368(Integer value) {
        this.field368 = value;
    }

    /**
     * Gets the value of the field369 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField369() {
        return field369;
    }

    /**
     * Sets the value of the field369 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField369(Integer value) {
        this.field369 = value;
    }

    /**
     * Gets the value of the field3610 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3610() {
        return field3610;
    }

    /**
     * Sets the value of the field3610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3610(Integer value) {
        this.field3610 = value;
    }

    /**
     * Gets the value of the field3611 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3611() {
        return field3611;
    }

    /**
     * Sets the value of the field3611 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3611(Integer value) {
        this.field3611 = value;
    }

    /**
     * Gets the value of the field37 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField37() {
        return field37;
    }

    /**
     * Sets the value of the field37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField37(Integer value) {
        this.field37 = value;
    }

    /**
     * Gets the value of the field381 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField381() {
        return field381;
    }

    /**
     * Sets the value of the field381 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField381(Integer value) {
        this.field381 = value;
    }

    /**
     * Gets the value of the field382 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField382() {
        return field382;
    }

    /**
     * Sets the value of the field382 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField382(Integer value) {
        this.field382 = value;
    }

    /**
     * Gets the value of the field383 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField383() {
        return field383;
    }

    /**
     * Sets the value of the field383 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField383(Integer value) {
        this.field383 = value;
    }

    /**
     * Gets the value of the field384 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField384() {
        return field384;
    }

    /**
     * Sets the value of the field384 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField384(Integer value) {
        this.field384 = value;
    }

    /**
     * Gets the value of the field39 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField39() {
        return field39;
    }

    /**
     * Sets the value of the field39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField39(Integer value) {
        this.field39 = value;
    }

    /**
     * Gets the value of the field3101 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3101() {
        return field3101;
    }

    /**
     * Sets the value of the field3101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3101(Integer value) {
        this.field3101 = value;
    }

    /**
     * Gets the value of the field3102 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3102() {
        return field3102;
    }

    /**
     * Sets the value of the field3102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3102(Integer value) {
        this.field3102 = value;
    }

    /**
     * Gets the value of the field3103 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3103() {
        return field3103;
    }

    /**
     * Sets the value of the field3103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3103(Integer value) {
        this.field3103 = value;
    }

    /**
     * Gets the value of the field3104 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3104() {
        return field3104;
    }

    /**
     * Sets the value of the field3104 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3104(Integer value) {
        this.field3104 = value;
    }

    /**
     * Gets the value of the field3111 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3111() {
        return field3111;
    }

    /**
     * Sets the value of the field3111 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3111(Integer value) {
        this.field3111 = value;
    }

    /**
     * Gets the value of the field3112 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3112() {
        return field3112;
    }

    /**
     * Sets the value of the field3112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3112(Integer value) {
        this.field3112 = value;
    }

    /**
     * Gets the value of the field3113 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3113() {
        return field3113;
    }

    /**
     * Sets the value of the field3113 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3113(Integer value) {
        this.field3113 = value;
    }

    /**
     * Gets the value of the field3114 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3114() {
        return field3114;
    }

    /**
     * Sets the value of the field3114 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3114(Integer value) {
        this.field3114 = value;
    }

    /**
     * Gets the value of the field3115 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3115() {
        return field3115;
    }

    /**
     * Sets the value of the field3115 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3115(Integer value) {
        this.field3115 = value;
    }

    /**
     * Gets the value of the field3116 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3116() {
        return field3116;
    }

    /**
     * Sets the value of the field3116 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3116(Integer value) {
        this.field3116 = value;
    }

    /**
     * Gets the value of the field3117 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField3117() {
        return field3117;
    }

    /**
     * Sets the value of the field3117 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField3117(Integer value) {
        this.field3117 = value;
    }

}
