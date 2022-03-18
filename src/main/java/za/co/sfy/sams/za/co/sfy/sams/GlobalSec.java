
package za.co.sfy.sams;

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
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserPassword" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProfID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrefShowMenuNo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PrefSubjectListLanguage" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PrefShowVernacular" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ChgPsw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrefGridEditEnterAction" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Prov" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsPrincipalApproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Library" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "userID",
    "userCode",
    "userName",
    "userPassword",
    "linkType",
    "linkID",
    "sName",
    "fName",
    "profID",
    "prefShowMenuNo",
    "prefSubjectListLanguage",
    "prefShowVernacular",
    "chgPsw",
    "status",
    "prefGridEditEnterAction",
    "expiryDate",
    "prov",
    "luritsPrincipalApproval",
    "library"
})
@XmlRootElement(name = "GlobalSec")
public class GlobalSec {

    @XmlElement(name = "UserID")
    protected int userID;
    @XmlElement(name = "UserCode")
    protected Integer userCode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserPassword")
    protected String userPassword;
    @XmlElement(name = "LinkType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkType;
    @XmlElement(name = "LinkID")
    protected Integer linkID;
    @XmlElement(name = "SName")
    protected String sName;
    @XmlElement(name = "FName")
    protected String fName;
    @XmlElement(name = "ProfID")
    protected Integer profID;
    @XmlElement(name = "PrefShowMenuNo")
    @XmlSchemaType(name = "unsignedByte")
    protected Short prefShowMenuNo;
    @XmlElement(name = "PrefSubjectListLanguage")
    @XmlSchemaType(name = "unsignedByte")
    protected Short prefSubjectListLanguage;
    @XmlElement(name = "PrefShowVernacular")
    @XmlSchemaType(name = "unsignedByte")
    protected Short prefShowVernacular;
    @XmlElement(name = "ChgPsw")
    protected boolean chgPsw;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PrefGridEditEnterAction")
    @XmlSchemaType(name = "unsignedByte")
    protected Short prefGridEditEnterAction;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Prov")
    protected Integer prov;
    @XmlElement(name = "LuritsPrincipalApproval")
    protected boolean luritsPrincipalApproval;
    @XmlElement(name = "Library")
    protected boolean library;

    /**
     * Gets the value of the userID property.
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserCode(Integer value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkType(Short value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinkID(Integer value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the sName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Sets the value of the sName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Gets the value of the fName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFName() {
        return fName;
    }

    /**
     * Sets the value of the fName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFName(String value) {
        this.fName = value;
    }

    /**
     * Gets the value of the profID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProfID() {
        return profID;
    }

    /**
     * Sets the value of the profID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProfID(Integer value) {
        this.profID = value;
    }

    /**
     * Gets the value of the prefShowMenuNo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrefShowMenuNo() {
        return prefShowMenuNo;
    }

    /**
     * Sets the value of the prefShowMenuNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrefShowMenuNo(Short value) {
        this.prefShowMenuNo = value;
    }

    /**
     * Gets the value of the prefSubjectListLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrefSubjectListLanguage() {
        return prefSubjectListLanguage;
    }

    /**
     * Sets the value of the prefSubjectListLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrefSubjectListLanguage(Short value) {
        this.prefSubjectListLanguage = value;
    }

    /**
     * Gets the value of the prefShowVernacular property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrefShowVernacular() {
        return prefShowVernacular;
    }

    /**
     * Sets the value of the prefShowVernacular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrefShowVernacular(Short value) {
        this.prefShowVernacular = value;
    }

    /**
     * Gets the value of the chgPsw property.
     * 
     */
    public boolean isChgPsw() {
        return chgPsw;
    }

    /**
     * Sets the value of the chgPsw property.
     * 
     */
    public void setChgPsw(boolean value) {
        this.chgPsw = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the prefGridEditEnterAction property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrefGridEditEnterAction() {
        return prefGridEditEnterAction;
    }

    /**
     * Sets the value of the prefGridEditEnterAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrefGridEditEnterAction(Short value) {
        this.prefGridEditEnterAction = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the prov property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProv() {
        return prov;
    }

    /**
     * Sets the value of the prov property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProv(Integer value) {
        this.prov = value;
    }

    /**
     * Gets the value of the luritsPrincipalApproval property.
     * 
     */
    public boolean isLuritsPrincipalApproval() {
        return luritsPrincipalApproval;
    }

    /**
     * Sets the value of the luritsPrincipalApproval property.
     * 
     */
    public void setLuritsPrincipalApproval(boolean value) {
        this.luritsPrincipalApproval = value;
    }

    /**
     * Gets the value of the library property.
     * 
     */
    public boolean isLibrary() {
        return library;
    }

    /**
     * Sets the value of the library property.
     * 
     */
    public void setLibrary(boolean value) {
        this.library = value;
    }

}
