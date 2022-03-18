
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
 *         &lt;element name="TeamID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TeamName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TeamAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TeamAgeFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="TeamAgeTo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="TeamEdID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TeamDepEdID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TeamPicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TeamOfficialID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RecLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "teamID",
    "exID",
    "teamName",
    "teamAfrName",
    "teamAgeFrom",
    "teamAgeTo",
    "teamEdID",
    "teamDepEdID",
    "teamPicture",
    "teamOfficialID",
    "recSelected",
    "recLocked"
})
@XmlRootElement(name = "ExtraMuralsTeams")
public class ExtraMuralsTeams {

    @XmlElement(name = "TeamID")
    protected int teamID;
    @XmlElement(name = "ExID")
    protected Integer exID;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElement(name = "TeamAfrName")
    protected String teamAfrName;
    @XmlElement(name = "TeamAgeFrom")
    @XmlSchemaType(name = "unsignedByte")
    protected Short teamAgeFrom;
    @XmlElement(name = "TeamAgeTo")
    @XmlSchemaType(name = "unsignedByte")
    protected Short teamAgeTo;
    @XmlElement(name = "TeamEdID")
    protected Integer teamEdID;
    @XmlElement(name = "TeamDepEdID")
    protected Integer teamDepEdID;
    @XmlElement(name = "TeamPicture")
    protected byte[] teamPicture;
    @XmlElement(name = "TeamOfficialID")
    protected Integer teamOfficialID;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;

    /**
     * Gets the value of the teamID property.
     * 
     */
    public int getTeamID() {
        return teamID;
    }

    /**
     * Sets the value of the teamID property.
     * 
     */
    public void setTeamID(int value) {
        this.teamID = value;
    }

    /**
     * Gets the value of the exID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExID() {
        return exID;
    }

    /**
     * Sets the value of the exID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExID(Integer value) {
        this.exID = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the teamAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamAfrName() {
        return teamAfrName;
    }

    /**
     * Sets the value of the teamAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamAfrName(String value) {
        this.teamAfrName = value;
    }

    /**
     * Gets the value of the teamAgeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTeamAgeFrom() {
        return teamAgeFrom;
    }

    /**
     * Sets the value of the teamAgeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTeamAgeFrom(Short value) {
        this.teamAgeFrom = value;
    }

    /**
     * Gets the value of the teamAgeTo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTeamAgeTo() {
        return teamAgeTo;
    }

    /**
     * Sets the value of the teamAgeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTeamAgeTo(Short value) {
        this.teamAgeTo = value;
    }

    /**
     * Gets the value of the teamEdID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeamEdID() {
        return teamEdID;
    }

    /**
     * Sets the value of the teamEdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeamEdID(Integer value) {
        this.teamEdID = value;
    }

    /**
     * Gets the value of the teamDepEdID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeamDepEdID() {
        return teamDepEdID;
    }

    /**
     * Sets the value of the teamDepEdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeamDepEdID(Integer value) {
        this.teamDepEdID = value;
    }

    /**
     * Gets the value of the teamPicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTeamPicture() {
        return teamPicture;
    }

    /**
     * Sets the value of the teamPicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTeamPicture(byte[] value) {
        this.teamPicture = value;
    }

    /**
     * Gets the value of the teamOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeamOfficialID() {
        return teamOfficialID;
    }

    /**
     * Sets the value of the teamOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeamOfficialID(Integer value) {
        this.teamOfficialID = value;
    }

    /**
     * Gets the value of the recSelected property.
     * 
     */
    public boolean isRecSelected() {
        return recSelected;
    }

    /**
     * Sets the value of the recSelected property.
     * 
     */
    public void setRecSelected(boolean value) {
        this.recSelected = value;
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

}
