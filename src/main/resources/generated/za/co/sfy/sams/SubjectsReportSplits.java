
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
 *         &lt;element name="SubjID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjSplitNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjSplitName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjSplitNameAfr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "subjSplitNo",
    "subjSplitName",
    "subjSplitNameAfr"
})
@XmlRootElement(name = "SubjectsReportSplits")
public class SubjectsReportSplits {

    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "SubjID")
    protected Integer subjID;
    @XmlElement(name = "OfficialSubjectID")
    protected Integer officialSubjectID;
    @XmlElement(name = "SubjSplitNo")
    protected Integer subjSplitNo;
    @XmlElement(name = "SubjSplitName")
    protected String subjSplitName;
    @XmlElement(name = "SubjSplitNameAfr")
    protected String subjSplitNameAfr;

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
     * Gets the value of the subjSplitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjSplitNo() {
        return subjSplitNo;
    }

    /**
     * Sets the value of the subjSplitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjSplitNo(Integer value) {
        this.subjSplitNo = value;
    }

    /**
     * Gets the value of the subjSplitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjSplitName() {
        return subjSplitName;
    }

    /**
     * Sets the value of the subjSplitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjSplitName(String value) {
        this.subjSplitName = value;
    }

    /**
     * Gets the value of the subjSplitNameAfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjSplitNameAfr() {
        return subjSplitNameAfr;
    }

    /**
     * Sets the value of the subjSplitNameAfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjSplitNameAfr(String value) {
        this.subjSplitNameAfr = value;
    }

}
