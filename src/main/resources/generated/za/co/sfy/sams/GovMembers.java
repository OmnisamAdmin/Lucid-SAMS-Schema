
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
 *         &lt;element name="MemberID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TypeOfMember" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Initials" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Title" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Race" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LangHome" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lang2nd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TelCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CellPhone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FaxCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FaxNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Email" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pAddressCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationTelCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationTelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceStationAddressCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceCommanderInitials" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceCommanderSname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceCommanderRank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceCommanderTelCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceCommanderTelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PoliceMemberRank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisabilityStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BirthDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SACitizen" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Country" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TSTransactionCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReportStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSSentFileName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TSDateLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TSLastUpdatedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LuritsStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
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
    "memberID",
    "typeOfMember",
    "linkID",
    "sname",
    "fname",
    "initials",
    "title",
    "race",
    "gender",
    "langHome",
    "lang2Nd",
    "telCode",
    "telNumber",
    "cellPhone",
    "faxCode",
    "faxNumber",
    "email",
    "pAddress1",
    "pAddress2",
    "pAddress3",
    "pAddressCode",
    "policeStationName",
    "policeStationNo",
    "policeStationTelCode",
    "policeStationTelNumber",
    "policeStationAddress1",
    "policeStationAddress2",
    "policeStationAddress3",
    "policeStationAddressCode",
    "policeCommanderInitials",
    "policeCommanderSname",
    "policeCommanderRank",
    "policeCommanderTelCode",
    "policeCommanderTelNumber",
    "policeMemberRank",
    "disabilityStatus",
    "birthDate",
    "saCitizen",
    "country",
    "idNumber",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "luritsIndicator",
    "luritsFlag",
    "tsSentFileName",
    "tsDateLastUpdate",
    "tsLastUpdatedBy",
    "luritsStatus"
})
@XmlRootElement(name = "GovMembers")
public class GovMembers {

    @XmlElement(name = "MemberID")
    protected int memberID;
    @XmlElement(name = "TypeOfMember")
    protected String typeOfMember;
    @XmlElement(name = "LinkID")
    protected Integer linkID;
    @XmlElement(name = "Sname")
    protected String sname;
    @XmlElement(name = "Fname")
    protected String fname;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "LangHome")
    protected String langHome;
    @XmlElement(name = "Lang2nd")
    protected String lang2Nd;
    @XmlElement(name = "TelCode")
    protected String telCode;
    @XmlElement(name = "TelNumber")
    protected String telNumber;
    @XmlElement(name = "CellPhone")
    protected String cellPhone;
    @XmlElement(name = "FaxCode")
    protected String faxCode;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "Email")
    protected String email;
    protected String pAddress1;
    protected String pAddress2;
    protected String pAddress3;
    protected String pAddressCode;
    @XmlElement(name = "PoliceStationName")
    protected String policeStationName;
    @XmlElement(name = "PoliceStationNo")
    protected String policeStationNo;
    @XmlElement(name = "PoliceStationTelCode")
    protected String policeStationTelCode;
    @XmlElement(name = "PoliceStationTelNumber")
    protected String policeStationTelNumber;
    @XmlElement(name = "PoliceStationAddress1")
    protected String policeStationAddress1;
    @XmlElement(name = "PoliceStationAddress2")
    protected String policeStationAddress2;
    @XmlElement(name = "PoliceStationAddress3")
    protected String policeStationAddress3;
    @XmlElement(name = "PoliceStationAddressCode")
    protected String policeStationAddressCode;
    @XmlElement(name = "PoliceCommanderInitials")
    protected String policeCommanderInitials;
    @XmlElement(name = "PoliceCommanderSname")
    protected String policeCommanderSname;
    @XmlElement(name = "PoliceCommanderRank")
    protected String policeCommanderRank;
    @XmlElement(name = "PoliceCommanderTelCode")
    protected String policeCommanderTelCode;
    @XmlElement(name = "PoliceCommanderTelNumber")
    protected String policeCommanderTelNumber;
    @XmlElement(name = "PoliceMemberRank")
    protected String policeMemberRank;
    @XmlElement(name = "DisabilityStatus")
    protected String disabilityStatus;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "SACitizen")
    @XmlSchemaType(name = "unsignedByte")
    protected Short saCitizen;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "TSTransactionCategory")
    protected Integer tsTransactionCategory;
    @XmlElement(name = "TSStatusFlag")
    protected Integer tsStatusFlag;
    @XmlElement(name = "TSReportStatusFlag")
    protected Integer tsReportStatusFlag;
    @XmlElement(name = "TSReasonCode")
    protected Integer tsReasonCode;
    @XmlElement(name = "LuritsIndicator")
    protected Integer luritsIndicator;
    @XmlElement(name = "LuritsFlag")
    protected Integer luritsFlag;
    @XmlElement(name = "TSSentFileName")
    protected String tsSentFileName;
    @XmlElement(name = "TSDateLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsDateLastUpdate;
    @XmlElement(name = "TSLastUpdatedBy")
    protected String tsLastUpdatedBy;
    @XmlElement(name = "LuritsStatus")
    protected String luritsStatus;

    /**
     * Gets the value of the memberID property.
     * 
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * Sets the value of the memberID property.
     * 
     */
    public void setMemberID(int value) {
        this.memberID = value;
    }

    /**
     * Gets the value of the typeOfMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfMember() {
        return typeOfMember;
    }

    /**
     * Sets the value of the typeOfMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfMember(String value) {
        this.typeOfMember = value;
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
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSname() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSname(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the fname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the langHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangHome() {
        return langHome;
    }

    /**
     * Sets the value of the langHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangHome(String value) {
        this.langHome = value;
    }

    /**
     * Gets the value of the lang2Nd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang2Nd() {
        return lang2Nd;
    }

    /**
     * Sets the value of the lang2Nd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang2Nd(String value) {
        this.lang2Nd = value;
    }

    /**
     * Gets the value of the telCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCode() {
        return telCode;
    }

    /**
     * Sets the value of the telCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCode(String value) {
        this.telCode = value;
    }

    /**
     * Gets the value of the telNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * Sets the value of the telNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the faxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxCode() {
        return faxCode;
    }

    /**
     * Sets the value of the faxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxCode(String value) {
        this.faxCode = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the pAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAddress1() {
        return pAddress1;
    }

    /**
     * Sets the value of the pAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAddress1(String value) {
        this.pAddress1 = value;
    }

    /**
     * Gets the value of the pAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAddress2() {
        return pAddress2;
    }

    /**
     * Sets the value of the pAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAddress2(String value) {
        this.pAddress2 = value;
    }

    /**
     * Gets the value of the pAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAddress3() {
        return pAddress3;
    }

    /**
     * Sets the value of the pAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAddress3(String value) {
        this.pAddress3 = value;
    }

    /**
     * Gets the value of the pAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAddressCode() {
        return pAddressCode;
    }

    /**
     * Sets the value of the pAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAddressCode(String value) {
        this.pAddressCode = value;
    }

    /**
     * Gets the value of the policeStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationName() {
        return policeStationName;
    }

    /**
     * Sets the value of the policeStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationName(String value) {
        this.policeStationName = value;
    }

    /**
     * Gets the value of the policeStationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationNo() {
        return policeStationNo;
    }

    /**
     * Sets the value of the policeStationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationNo(String value) {
        this.policeStationNo = value;
    }

    /**
     * Gets the value of the policeStationTelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationTelCode() {
        return policeStationTelCode;
    }

    /**
     * Sets the value of the policeStationTelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationTelCode(String value) {
        this.policeStationTelCode = value;
    }

    /**
     * Gets the value of the policeStationTelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationTelNumber() {
        return policeStationTelNumber;
    }

    /**
     * Sets the value of the policeStationTelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationTelNumber(String value) {
        this.policeStationTelNumber = value;
    }

    /**
     * Gets the value of the policeStationAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationAddress1() {
        return policeStationAddress1;
    }

    /**
     * Sets the value of the policeStationAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationAddress1(String value) {
        this.policeStationAddress1 = value;
    }

    /**
     * Gets the value of the policeStationAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationAddress2() {
        return policeStationAddress2;
    }

    /**
     * Sets the value of the policeStationAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationAddress2(String value) {
        this.policeStationAddress2 = value;
    }

    /**
     * Gets the value of the policeStationAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationAddress3() {
        return policeStationAddress3;
    }

    /**
     * Sets the value of the policeStationAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationAddress3(String value) {
        this.policeStationAddress3 = value;
    }

    /**
     * Gets the value of the policeStationAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationAddressCode() {
        return policeStationAddressCode;
    }

    /**
     * Sets the value of the policeStationAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationAddressCode(String value) {
        this.policeStationAddressCode = value;
    }

    /**
     * Gets the value of the policeCommanderInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceCommanderInitials() {
        return policeCommanderInitials;
    }

    /**
     * Sets the value of the policeCommanderInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceCommanderInitials(String value) {
        this.policeCommanderInitials = value;
    }

    /**
     * Gets the value of the policeCommanderSname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceCommanderSname() {
        return policeCommanderSname;
    }

    /**
     * Sets the value of the policeCommanderSname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceCommanderSname(String value) {
        this.policeCommanderSname = value;
    }

    /**
     * Gets the value of the policeCommanderRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceCommanderRank() {
        return policeCommanderRank;
    }

    /**
     * Sets the value of the policeCommanderRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceCommanderRank(String value) {
        this.policeCommanderRank = value;
    }

    /**
     * Gets the value of the policeCommanderTelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceCommanderTelCode() {
        return policeCommanderTelCode;
    }

    /**
     * Sets the value of the policeCommanderTelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceCommanderTelCode(String value) {
        this.policeCommanderTelCode = value;
    }

    /**
     * Gets the value of the policeCommanderTelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceCommanderTelNumber() {
        return policeCommanderTelNumber;
    }

    /**
     * Sets the value of the policeCommanderTelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceCommanderTelNumber(String value) {
        this.policeCommanderTelNumber = value;
    }

    /**
     * Gets the value of the policeMemberRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceMemberRank() {
        return policeMemberRank;
    }

    /**
     * Sets the value of the policeMemberRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceMemberRank(String value) {
        this.policeMemberRank = value;
    }

    /**
     * Gets the value of the disabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityStatus() {
        return disabilityStatus;
    }

    /**
     * Sets the value of the disabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityStatus(String value) {
        this.disabilityStatus = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the saCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSACitizen() {
        return saCitizen;
    }

    /**
     * Sets the value of the saCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSACitizen(Short value) {
        this.saCitizen = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the tsTransactionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSTransactionCategory() {
        return tsTransactionCategory;
    }

    /**
     * Sets the value of the tsTransactionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSTransactionCategory(Integer value) {
        this.tsTransactionCategory = value;
    }

    /**
     * Gets the value of the tsStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSStatusFlag() {
        return tsStatusFlag;
    }

    /**
     * Sets the value of the tsStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSStatusFlag(Integer value) {
        this.tsStatusFlag = value;
    }

    /**
     * Gets the value of the tsReportStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSReportStatusFlag() {
        return tsReportStatusFlag;
    }

    /**
     * Sets the value of the tsReportStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSReportStatusFlag(Integer value) {
        this.tsReportStatusFlag = value;
    }

    /**
     * Gets the value of the tsReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSReasonCode() {
        return tsReasonCode;
    }

    /**
     * Sets the value of the tsReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSReasonCode(Integer value) {
        this.tsReasonCode = value;
    }

    /**
     * Gets the value of the luritsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLuritsIndicator() {
        return luritsIndicator;
    }

    /**
     * Sets the value of the luritsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLuritsIndicator(Integer value) {
        this.luritsIndicator = value;
    }

    /**
     * Gets the value of the luritsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLuritsFlag() {
        return luritsFlag;
    }

    /**
     * Sets the value of the luritsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLuritsFlag(Integer value) {
        this.luritsFlag = value;
    }

    /**
     * Gets the value of the tsSentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSentFileName() {
        return tsSentFileName;
    }

    /**
     * Sets the value of the tsSentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSentFileName(String value) {
        this.tsSentFileName = value;
    }

    /**
     * Gets the value of the tsDateLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTSDateLastUpdate() {
        return tsDateLastUpdate;
    }

    /**
     * Sets the value of the tsDateLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTSDateLastUpdate(XMLGregorianCalendar value) {
        this.tsDateLastUpdate = value;
    }

    /**
     * Gets the value of the tsLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLastUpdatedBy() {
        return tsLastUpdatedBy;
    }

    /**
     * Sets the value of the tsLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLastUpdatedBy(String value) {
        this.tsLastUpdatedBy = value;
    }

    /**
     * Gets the value of the luritsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuritsStatus() {
        return luritsStatus;
    }

    /**
     * Sets the value of the luritsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuritsStatus(String value) {
        this.luritsStatus = value;
    }

}
