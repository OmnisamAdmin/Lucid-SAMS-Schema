
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
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjNextOfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjNextLuritsCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjNextName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SBAMarks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "dataYear",
    "officialSubjectID",
    "subjNextOfficialSubjectID",
    "subjNextLuritsCode",
    "subjNextName",
    "sbaWeight",
    "sbaMarks"
})
@XmlRootElement(name = "SubjectsOfficialSettings")
public class SubjectsOfficialSettings {

    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "OfficialSubjectID")
    protected Integer officialSubjectID;
    @XmlElement(name = "SubjNextOfficialSubjectID")
    protected Integer subjNextOfficialSubjectID;
    @XmlElement(name = "SubjNextLuritsCode")
    protected String subjNextLuritsCode;
    @XmlElement(name = "SubjNextName")
    protected String subjNextName;
    @XmlElement(name = "SBAWeight")
    protected Double sbaWeight;
    @XmlElement(name = "SBAMarks")
    protected Integer sbaMarks;

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
     * Gets the value of the officialSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfficialSubjectID() {
        return officialSubjectID;
    }

    /**
     * Sets the value of the officialSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfficialSubjectID(Integer value) {
        this.officialSubjectID = value;
    }

    /**
     * Gets the value of the subjNextOfficialSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjNextOfficialSubjectID() {
        return subjNextOfficialSubjectID;
    }

    /**
     * Sets the value of the subjNextOfficialSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjNextOfficialSubjectID(Integer value) {
        this.subjNextOfficialSubjectID = value;
    }

    /**
     * Gets the value of the subjNextLuritsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjNextLuritsCode() {
        return subjNextLuritsCode;
    }

    /**
     * Sets the value of the subjNextLuritsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjNextLuritsCode(String value) {
        this.subjNextLuritsCode = value;
    }

    /**
     * Gets the value of the subjNextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjNextName() {
        return subjNextName;
    }

    /**
     * Sets the value of the subjNextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjNextName(String value) {
        this.subjNextName = value;
    }

    /**
     * Gets the value of the sbaWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSBAWeight() {
        return sbaWeight;
    }

    /**
     * Sets the value of the sbaWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSBAWeight(Double value) {
        this.sbaWeight = value;
    }

    /**
     * Gets the value of the sbaMarks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSBAMarks() {
        return sbaMarks;
    }

    /**
     * Sets the value of the sbaMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSBAMarks(Integer value) {
        this.sbaMarks = value;
    }

}
