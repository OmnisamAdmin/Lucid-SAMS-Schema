
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
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SBAMarks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBALocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubjReportSplit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RecValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "subjID",
    "officialSubjectID",
    "sbaWeight",
    "sbaMarks",
    "sbaLocked",
    "subjReportSplit",
    "recValidated"
})
@XmlRootElement(name = "SubjectsSettings")
public class SubjectsSettings {

    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "SubjID")
    protected Integer subjID;
    @XmlElement(name = "OfficialSubjectID")
    protected Integer officialSubjectID;
    @XmlElement(name = "SBAWeight")
    protected Double sbaWeight;
    @XmlElement(name = "SBAMarks")
    protected Integer sbaMarks;
    @XmlElement(name = "SBALocked")
    protected boolean sbaLocked;
    @XmlElement(name = "SubjReportSplit")
    protected boolean subjReportSplit;
    @XmlElement(name = "RecValidated")
    protected boolean recValidated;

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
     * Gets the value of the subjID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjID() {
        return subjID;
    }

    /**
     * Sets the value of the subjID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjID(Integer value) {
        this.subjID = value;
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

    /**
     * Gets the value of the sbaLocked property.
     * 
     */
    public boolean isSBALocked() {
        return sbaLocked;
    }

    /**
     * Sets the value of the sbaLocked property.
     * 
     */
    public void setSBALocked(boolean value) {
        this.sbaLocked = value;
    }

    /**
     * Gets the value of the subjReportSplit property.
     * 
     */
    public boolean isSubjReportSplit() {
        return subjReportSplit;
    }

    /**
     * Sets the value of the subjReportSplit property.
     * 
     */
    public void setSubjReportSplit(boolean value) {
        this.subjReportSplit = value;
    }

    /**
     * Gets the value of the recValidated property.
     * 
     */
    public boolean isRecValidated() {
        return recValidated;
    }

    /**
     * Sets the value of the recValidated property.
     * 
     */
    public void setRecValidated(boolean value) {
        this.recValidated = value;
    }

}
