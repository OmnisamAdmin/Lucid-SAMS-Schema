
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IncDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IncType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="CompType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="CompGrade" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="CompLinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PerpType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PerpGrade" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PerpLinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PerpName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RepToPDE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RepToSACE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RepToSAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RepSAPStation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RepSAPCaseNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusHearing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StatusSuspension" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StatusWithdrawn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Comments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "id",
    "dataYear",
    "incDate",
    "incType",
    "compType",
    "compGrade",
    "compLinkID",
    "compName",
    "perpType",
    "perpGrade",
    "perpLinkID",
    "perpName",
    "repToPDE",
    "repToSACE",
    "repToSAP",
    "repSAPStation",
    "repSAPCaseNo",
    "statusHearing",
    "statusSuspension",
    "statusWithdrawn",
    "comments",
    "statusCompleted"
})
@XmlRootElement(name = "SeriousIncidents")
public class SeriousIncidents {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "IncDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar incDate;
    @XmlElement(name = "IncType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short incType;
    @XmlElement(name = "CompType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short compType;
    @XmlElement(name = "CompGrade")
    @XmlSchemaType(name = "unsignedByte")
    protected Short compGrade;
    @XmlElement(name = "CompLinkID")
    protected Integer compLinkID;
    @XmlElement(name = "CompName")
    protected String compName;
    @XmlElement(name = "PerpType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short perpType;
    @XmlElement(name = "PerpGrade")
    @XmlSchemaType(name = "unsignedByte")
    protected Short perpGrade;
    @XmlElement(name = "PerpLinkID")
    protected Integer perpLinkID;
    @XmlElement(name = "PerpName")
    protected String perpName;
    @XmlElement(name = "RepToPDE")
    protected boolean repToPDE;
    @XmlElement(name = "RepToSACE")
    protected boolean repToSACE;
    @XmlElement(name = "RepToSAP")
    protected boolean repToSAP;
    @XmlElement(name = "RepSAPStation")
    protected String repSAPStation;
    @XmlElement(name = "RepSAPCaseNo")
    protected String repSAPCaseNo;
    @XmlElement(name = "StatusHearing")
    protected boolean statusHearing;
    @XmlElement(name = "StatusSuspension")
    protected boolean statusSuspension;
    @XmlElement(name = "StatusWithdrawn")
    protected boolean statusWithdrawn;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "StatusCompleted")
    protected boolean statusCompleted;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
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
     * Gets the value of the incDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncDate() {
        return incDate;
    }

    /**
     * Sets the value of the incDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncDate(XMLGregorianCalendar value) {
        this.incDate = value;
    }

    /**
     * Gets the value of the incType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIncType() {
        return incType;
    }

    /**
     * Sets the value of the incType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIncType(Short value) {
        this.incType = value;
    }

    /**
     * Gets the value of the compType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCompType() {
        return compType;
    }

    /**
     * Sets the value of the compType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCompType(Short value) {
        this.compType = value;
    }

    /**
     * Gets the value of the compGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCompGrade() {
        return compGrade;
    }

    /**
     * Sets the value of the compGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCompGrade(Short value) {
        this.compGrade = value;
    }

    /**
     * Gets the value of the compLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompLinkID() {
        return compLinkID;
    }

    /**
     * Sets the value of the compLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompLinkID(Integer value) {
        this.compLinkID = value;
    }

    /**
     * Gets the value of the compName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompName() {
        return compName;
    }

    /**
     * Sets the value of the compName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompName(String value) {
        this.compName = value;
    }

    /**
     * Gets the value of the perpType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPerpType() {
        return perpType;
    }

    /**
     * Sets the value of the perpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPerpType(Short value) {
        this.perpType = value;
    }

    /**
     * Gets the value of the perpGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPerpGrade() {
        return perpGrade;
    }

    /**
     * Sets the value of the perpGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPerpGrade(Short value) {
        this.perpGrade = value;
    }

    /**
     * Gets the value of the perpLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerpLinkID() {
        return perpLinkID;
    }

    /**
     * Sets the value of the perpLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerpLinkID(Integer value) {
        this.perpLinkID = value;
    }

    /**
     * Gets the value of the perpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerpName() {
        return perpName;
    }

    /**
     * Sets the value of the perpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerpName(String value) {
        this.perpName = value;
    }

    /**
     * Gets the value of the repToPDE property.
     * 
     */
    public boolean isRepToPDE() {
        return repToPDE;
    }

    /**
     * Sets the value of the repToPDE property.
     * 
     */
    public void setRepToPDE(boolean value) {
        this.repToPDE = value;
    }

    /**
     * Gets the value of the repToSACE property.
     * 
     */
    public boolean isRepToSACE() {
        return repToSACE;
    }

    /**
     * Sets the value of the repToSACE property.
     * 
     */
    public void setRepToSACE(boolean value) {
        this.repToSACE = value;
    }

    /**
     * Gets the value of the repToSAP property.
     * 
     */
    public boolean isRepToSAP() {
        return repToSAP;
    }

    /**
     * Sets the value of the repToSAP property.
     * 
     */
    public void setRepToSAP(boolean value) {
        this.repToSAP = value;
    }

    /**
     * Gets the value of the repSAPStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepSAPStation() {
        return repSAPStation;
    }

    /**
     * Sets the value of the repSAPStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepSAPStation(String value) {
        this.repSAPStation = value;
    }

    /**
     * Gets the value of the repSAPCaseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepSAPCaseNo() {
        return repSAPCaseNo;
    }

    /**
     * Sets the value of the repSAPCaseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepSAPCaseNo(String value) {
        this.repSAPCaseNo = value;
    }

    /**
     * Gets the value of the statusHearing property.
     * 
     */
    public boolean isStatusHearing() {
        return statusHearing;
    }

    /**
     * Sets the value of the statusHearing property.
     * 
     */
    public void setStatusHearing(boolean value) {
        this.statusHearing = value;
    }

    /**
     * Gets the value of the statusSuspension property.
     * 
     */
    public boolean isStatusSuspension() {
        return statusSuspension;
    }

    /**
     * Sets the value of the statusSuspension property.
     * 
     */
    public void setStatusSuspension(boolean value) {
        this.statusSuspension = value;
    }

    /**
     * Gets the value of the statusWithdrawn property.
     * 
     */
    public boolean isStatusWithdrawn() {
        return statusWithdrawn;
    }

    /**
     * Sets the value of the statusWithdrawn property.
     * 
     */
    public void setStatusWithdrawn(boolean value) {
        this.statusWithdrawn = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the statusCompleted property.
     * 
     */
    public boolean isStatusCompleted() {
        return statusCompleted;
    }

    /**
     * Sets the value of the statusCompleted property.
     * 
     */
    public void setStatusCompleted(boolean value) {
        this.statusCompleted = value;
    }

}
