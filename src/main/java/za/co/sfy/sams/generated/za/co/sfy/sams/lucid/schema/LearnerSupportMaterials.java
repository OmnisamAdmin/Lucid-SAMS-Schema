
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
 *         &lt;element name="Field911" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field912" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field913" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field914" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field921" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field922" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field923" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field924" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field931" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field932" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field933" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field934" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field935" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field936" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field937" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field938" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field941" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field942" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field95" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field96" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field97" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "field911",
    "field912",
    "field913",
    "field914",
    "field921",
    "field922",
    "field923",
    "field924",
    "field931",
    "field932",
    "field933",
    "field934",
    "field935",
    "field936",
    "field937",
    "field938",
    "field941",
    "field942",
    "field95",
    "field96",
    "field97"
})
@XmlRootElement(name = "LearnerSupportMaterials")
public class LearnerSupportMaterials {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field911")
    protected Integer field911;
    @XmlElement(name = "Field912")
    protected Integer field912;
    @XmlElement(name = "Field913")
    protected Integer field913;
    @XmlElement(name = "Field914")
    protected Integer field914;
    @XmlElement(name = "Field921")
    protected Integer field921;
    @XmlElement(name = "Field922")
    protected Integer field922;
    @XmlElement(name = "Field923")
    protected Integer field923;
    @XmlElement(name = "Field924")
    protected Integer field924;
    @XmlElement(name = "Field931")
    protected Integer field931;
    @XmlElement(name = "Field932")
    protected Integer field932;
    @XmlElement(name = "Field933")
    protected Integer field933;
    @XmlElement(name = "Field934")
    protected Integer field934;
    @XmlElement(name = "Field935")
    protected Integer field935;
    @XmlElement(name = "Field936")
    protected Integer field936;
    @XmlElement(name = "Field937")
    protected Integer field937;
    @XmlElement(name = "Field938")
    protected Integer field938;
    @XmlElement(name = "Field941")
    protected Integer field941;
    @XmlElement(name = "Field942")
    protected Integer field942;
    @XmlElement(name = "Field95")
    protected Integer field95;
    @XmlElement(name = "Field96")
    protected String field96;
    @XmlElement(name = "Field97")
    protected Integer field97;

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
     * Gets the value of the field911 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField911() {
        return field911;
    }

    /**
     * Sets the value of the field911 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField911(Integer value) {
        this.field911 = value;
    }

    /**
     * Gets the value of the field912 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField912() {
        return field912;
    }

    /**
     * Sets the value of the field912 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField912(Integer value) {
        this.field912 = value;
    }

    /**
     * Gets the value of the field913 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField913() {
        return field913;
    }

    /**
     * Sets the value of the field913 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField913(Integer value) {
        this.field913 = value;
    }

    /**
     * Gets the value of the field914 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField914() {
        return field914;
    }

    /**
     * Sets the value of the field914 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField914(Integer value) {
        this.field914 = value;
    }

    /**
     * Gets the value of the field921 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField921() {
        return field921;
    }

    /**
     * Sets the value of the field921 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField921(Integer value) {
        this.field921 = value;
    }

    /**
     * Gets the value of the field922 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField922() {
        return field922;
    }

    /**
     * Sets the value of the field922 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField922(Integer value) {
        this.field922 = value;
    }

    /**
     * Gets the value of the field923 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField923() {
        return field923;
    }

    /**
     * Sets the value of the field923 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField923(Integer value) {
        this.field923 = value;
    }

    /**
     * Gets the value of the field924 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField924() {
        return field924;
    }

    /**
     * Sets the value of the field924 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField924(Integer value) {
        this.field924 = value;
    }

    /**
     * Gets the value of the field931 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField931() {
        return field931;
    }

    /**
     * Sets the value of the field931 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField931(Integer value) {
        this.field931 = value;
    }

    /**
     * Gets the value of the field932 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField932() {
        return field932;
    }

    /**
     * Sets the value of the field932 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField932(Integer value) {
        this.field932 = value;
    }

    /**
     * Gets the value of the field933 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField933() {
        return field933;
    }

    /**
     * Sets the value of the field933 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField933(Integer value) {
        this.field933 = value;
    }

    /**
     * Gets the value of the field934 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField934() {
        return field934;
    }

    /**
     * Sets the value of the field934 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField934(Integer value) {
        this.field934 = value;
    }

    /**
     * Gets the value of the field935 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField935() {
        return field935;
    }

    /**
     * Sets the value of the field935 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField935(Integer value) {
        this.field935 = value;
    }

    /**
     * Gets the value of the field936 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField936() {
        return field936;
    }

    /**
     * Sets the value of the field936 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField936(Integer value) {
        this.field936 = value;
    }

    /**
     * Gets the value of the field937 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField937() {
        return field937;
    }

    /**
     * Sets the value of the field937 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField937(Integer value) {
        this.field937 = value;
    }

    /**
     * Gets the value of the field938 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField938() {
        return field938;
    }

    /**
     * Sets the value of the field938 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField938(Integer value) {
        this.field938 = value;
    }

    /**
     * Gets the value of the field941 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField941() {
        return field941;
    }

    /**
     * Sets the value of the field941 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField941(Integer value) {
        this.field941 = value;
    }

    /**
     * Gets the value of the field942 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField942() {
        return field942;
    }

    /**
     * Sets the value of the field942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField942(Integer value) {
        this.field942 = value;
    }

    /**
     * Gets the value of the field95 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField95() {
        return field95;
    }

    /**
     * Sets the value of the field95 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField95(Integer value) {
        this.field95 = value;
    }

    /**
     * Gets the value of the field96 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField96() {
        return field96;
    }

    /**
     * Sets the value of the field96 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField96(String value) {
        this.field96 = value;
    }

    /**
     * Gets the value of the field97 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField97() {
        return field97;
    }

    /**
     * Sets the value of the field97 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField97(Integer value) {
        this.field97 = value;
    }

}
