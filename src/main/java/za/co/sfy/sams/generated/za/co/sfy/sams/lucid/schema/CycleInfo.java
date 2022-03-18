
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Schoolname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FETDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FETPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LowestGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HighestGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FETlength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LSEN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remedial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FETTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GETDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GETPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GETLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GETTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LSENSchool" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SNESpec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SNESpecOther" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="MultiGrade" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SIDLowestYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SIDHighestYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "schoolname",
    "fetDays",
    "rooms",
    "fetPeriods",
    "lowestGrade",
    "highestGrade",
    "feTlength",
    "lsen",
    "remedial",
    "fetTotal",
    "getDays",
    "getPeriods",
    "getLength",
    "getTotal",
    "lsenSchool",
    "sneSpec",
    "sneSpecOther",
    "schoolType",
    "multiGrade",
    "sid",
    "sidLowestYear",
    "sidHighestYear"
})
@XmlRootElement(name = "CycleInfo")
public class CycleInfo {

    @XmlElement(name = "Schoolname")
    protected String schoolname;
    @XmlElement(name = "FETDays")
    protected Integer fetDays;
    @XmlElement(name = "Rooms")
    protected Integer rooms;
    @XmlElement(name = "FETPeriods")
    protected Integer fetPeriods;
    @XmlElement(name = "LowestGrade")
    protected Integer lowestGrade;
    @XmlElement(name = "HighestGrade")
    protected Integer highestGrade;
    @XmlElement(name = "FETlength")
    protected Integer feTlength;
    @XmlElement(name = "LSEN")
    protected String lsen;
    @XmlElement(name = "Remedial")
    protected String remedial;
    @XmlElement(name = "FETTotal")
    protected Integer fetTotal;
    @XmlElement(name = "GETDays")
    protected Integer getDays;
    @XmlElement(name = "GETPeriods")
    protected Integer getPeriods;
    @XmlElement(name = "GETLength")
    protected Integer getLength;
    @XmlElement(name = "GETTotal")
    protected Integer getTotal;
    @XmlElement(name = "LSENSchool")
    protected boolean lsenSchool;
    @XmlElement(name = "SNESpec")
    protected Integer sneSpec;
    @XmlElement(name = "SNESpecOther")
    protected String sneSpecOther;
    @XmlElement(name = "SchoolType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short schoolType;
    @XmlElement(name = "MultiGrade")
    protected String multiGrade;
    @XmlElement(name = "SID")
    protected String sid;
    @XmlElement(name = "SIDLowestYear")
    protected Integer sidLowestYear;
    @XmlElement(name = "SIDHighestYear")
    protected Integer sidHighestYear;

    /**
     * Gets the value of the schoolname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * Sets the value of the schoolname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolname(String value) {
        this.schoolname = value;
    }

    /**
     * Gets the value of the fetDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFETDays() {
        return fetDays;
    }

    /**
     * Sets the value of the fetDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFETDays(Integer value) {
        this.fetDays = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRooms(Integer value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the fetPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFETPeriods() {
        return fetPeriods;
    }

    /**
     * Sets the value of the fetPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFETPeriods(Integer value) {
        this.fetPeriods = value;
    }

    /**
     * Gets the value of the lowestGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowestGrade() {
        return lowestGrade;
    }

    /**
     * Sets the value of the lowestGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowestGrade(Integer value) {
        this.lowestGrade = value;
    }

    /**
     * Gets the value of the highestGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighestGrade() {
        return highestGrade;
    }

    /**
     * Sets the value of the highestGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighestGrade(Integer value) {
        this.highestGrade = value;
    }

    /**
     * Gets the value of the feTlength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFETlength() {
        return feTlength;
    }

    /**
     * Sets the value of the feTlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFETlength(Integer value) {
        this.feTlength = value;
    }

    /**
     * Gets the value of the lsen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSEN() {
        return lsen;
    }

    /**
     * Sets the value of the lsen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSEN(String value) {
        this.lsen = value;
    }

    /**
     * Gets the value of the remedial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemedial() {
        return remedial;
    }

    /**
     * Sets the value of the remedial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemedial(String value) {
        this.remedial = value;
    }

    /**
     * Gets the value of the fetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFETTotal() {
        return fetTotal;
    }

    /**
     * Sets the value of the fetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFETTotal(Integer value) {
        this.fetTotal = value;
    }

    /**
     * Gets the value of the getDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGETDays() {
        return getDays;
    }

    /**
     * Sets the value of the getDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGETDays(Integer value) {
        this.getDays = value;
    }

    /**
     * Gets the value of the getPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGETPeriods() {
        return getPeriods;
    }

    /**
     * Sets the value of the getPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGETPeriods(Integer value) {
        this.getPeriods = value;
    }

    /**
     * Gets the value of the getLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGETLength() {
        return getLength;
    }

    /**
     * Sets the value of the getLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGETLength(Integer value) {
        this.getLength = value;
    }

    /**
     * Gets the value of the getTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGETTotal() {
        return getTotal;
    }

    /**
     * Sets the value of the getTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGETTotal(Integer value) {
        this.getTotal = value;
    }

    /**
     * Gets the value of the lsenSchool property.
     * 
     */
    public boolean isLSENSchool() {
        return lsenSchool;
    }

    /**
     * Sets the value of the lsenSchool property.
     * 
     */
    public void setLSENSchool(boolean value) {
        this.lsenSchool = value;
    }

    /**
     * Gets the value of the sneSpec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSNESpec() {
        return sneSpec;
    }

    /**
     * Sets the value of the sneSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSNESpec(Integer value) {
        this.sneSpec = value;
    }

    /**
     * Gets the value of the sneSpecOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNESpecOther() {
        return sneSpecOther;
    }

    /**
     * Sets the value of the sneSpecOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNESpecOther(String value) {
        this.sneSpecOther = value;
    }

    /**
     * Gets the value of the schoolType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSchoolType() {
        return schoolType;
    }

    /**
     * Sets the value of the schoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSchoolType(Short value) {
        this.schoolType = value;
    }

    /**
     * Gets the value of the multiGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiGrade() {
        return multiGrade;
    }

    /**
     * Sets the value of the multiGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiGrade(String value) {
        this.multiGrade = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the sidLowestYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIDLowestYear() {
        return sidLowestYear;
    }

    /**
     * Sets the value of the sidLowestYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIDLowestYear(Integer value) {
        this.sidLowestYear = value;
    }

    /**
     * Gets the value of the sidHighestYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIDHighestYear() {
        return sidHighestYear;
    }

    /**
     * Sets the value of the sidHighestYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIDHighestYear(Integer value) {
        this.sidHighestYear = value;
    }

}
