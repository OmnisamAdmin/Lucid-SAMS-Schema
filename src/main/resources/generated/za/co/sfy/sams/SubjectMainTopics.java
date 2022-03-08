
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
 *         &lt;element name="MainTopicID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MainPosition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AfrDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VernDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfficialSubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PatchVer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GroupNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "mainTopicID",
    "mainPosition",
    "description",
    "afrDescription",
    "vernDescription",
    "subjectID",
    "officialSubjectID",
    "recLocked",
    "patchVer",
    "groupNo"
})
@XmlRootElement(name = "SubjectMainTopics")
public class SubjectMainTopics {

    @XmlElement(name = "MainTopicID")
    protected int mainTopicID;
    @XmlElement(name = "MainPosition")
    protected Integer mainPosition;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AfrDescription")
    protected String afrDescription;
    @XmlElement(name = "VernDescription")
    protected String vernDescription;
    @XmlElement(name = "SubjectID")
    protected Integer subjectID;
    @XmlElement(name = "OfficialSubjectID")
    protected Integer officialSubjectID;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;
    @XmlElement(name = "PatchVer")
    protected String patchVer;
    @XmlElement(name = "GroupNo")
    protected Integer groupNo;

    /**
     * Gets the value of the mainTopicID property.
     * 
     */
    public int getMainTopicID() {
        return mainTopicID;
    }

    /**
     * Sets the value of the mainTopicID property.
     * 
     */
    public void setMainTopicID(int value) {
        this.mainTopicID = value;
    }

    /**
     * Gets the value of the mainPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainPosition() {
        return mainPosition;
    }

    /**
     * Sets the value of the mainPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainPosition(Integer value) {
        this.mainPosition = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the afrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfrDescription() {
        return afrDescription;
    }

    /**
     * Sets the value of the afrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfrDescription(String value) {
        this.afrDescription = value;
    }

    /**
     * Gets the value of the vernDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVernDescription() {
        return vernDescription;
    }

    /**
     * Sets the value of the vernDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVernDescription(String value) {
        this.vernDescription = value;
    }

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectID(Integer value) {
        this.subjectID = value;
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
     * Gets the value of the recLocked property.
     * 
     */
    public boolean isRecLocked() {
        return recLocked;
    }

    /**
     * Sets the value of the recLocked property.
     * 
     */
    public void setRecLocked(boolean value) {
        this.recLocked = value;
    }

    /**
     * Gets the value of the patchVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatchVer() {
        return patchVer;
    }

    /**
     * Sets the value of the patchVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatchVer(String value) {
        this.patchVer = value;
    }

    /**
     * Gets the value of the groupNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupNo() {
        return groupNo;
    }

    /**
     * Sets the value of the groupNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupNo(Integer value) {
        this.groupNo = value;
    }

}
