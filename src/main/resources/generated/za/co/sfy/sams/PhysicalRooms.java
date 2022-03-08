
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
 *         &lt;element name="PrincipalOffice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtherOffice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SchoolHall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Staffroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Safe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SickRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DuplicatingRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Storeroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StrongRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtherNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtherType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClassPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClassPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClassUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClassOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultigradePerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultigradePrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultigradeUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultigradeOffsite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LabPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LabPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LabUndercon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LabOffsite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpecialUndercon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpecialOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkshopPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkshopPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkshopUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkshopOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultiPurPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultiPurPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultiPurUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MultiPurOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MediaPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MediaPrefab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MediaUnderCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MediaOffSite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MediaCentre" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MediaType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BuildingOwner" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LandOwner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOther" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnerSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnerTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnerInitials" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Farm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PhysicalAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Faxcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Stateowned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecuritySystem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Alarm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Guard" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ArmedResponse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Year" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Entrydate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Transport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransportLearners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Typetransport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransportOther" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClassroomCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StaffroomCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfficesCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LaboratoryCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LibraryCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ToiletsCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StoreroomCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sportfields" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "principalOffice",
    "otherOffice",
    "schoolHall",
    "staffroom",
    "safe",
    "sickRoom",
    "duplicatingRoom",
    "storeroom",
    "quad",
    "strongRoom",
    "otherNumber",
    "otherType",
    "classPerm",
    "classPrefab",
    "classUnderCon",
    "classOffSite",
    "multigradePerm",
    "multigradePrefab",
    "multigradeUnderCon",
    "multigradeOffsite",
    "labPerm",
    "labPrefab",
    "labUndercon",
    "labOffsite",
    "specialPerm",
    "specialPrefab",
    "specialUndercon",
    "specialOffSite",
    "workshopPerm",
    "workshopPrefab",
    "workshopUnderCon",
    "workshopOffSite",
    "multiPurPerm",
    "multiPurPrefab",
    "multiPurUnderCon",
    "multiPurOffSite",
    "compPerm",
    "compPrefab",
    "compUnderCon",
    "compOffSite",
    "mediaPerm",
    "mediaPrefab",
    "mediaUnderCon",
    "mediaOffSite",
    "mediaCentre",
    "mediaType",
    "buildingOwner",
    "landOwner",
    "ownerOther",
    "ownerSName",
    "ownerTitle",
    "ownerInitials",
    "farm",
    "postalAddress",
    "physicalAddress",
    "telcode",
    "tel",
    "faxcode",
    "fax",
    "stateowned",
    "securitySystem",
    "alarm",
    "guard",
    "armedResponse",
    "year",
    "entrydate",
    "transport",
    "transportLearners",
    "typetransport",
    "transportOther",
    "classroomCon",
    "staffroomCon",
    "officesCon",
    "laboratoryCon",
    "libraryCon",
    "toiletsCon",
    "storeroomCon",
    "sportfields"
})
@XmlRootElement(name = "PhysicalRooms")
public class PhysicalRooms {

    @XmlElement(name = "PrincipalOffice")
    protected Integer principalOffice;
    @XmlElement(name = "OtherOffice")
    protected Integer otherOffice;
    @XmlElement(name = "SchoolHall")
    protected Integer schoolHall;
    @XmlElement(name = "Staffroom")
    protected Integer staffroom;
    @XmlElement(name = "Safe")
    protected Integer safe;
    @XmlElement(name = "SickRoom")
    protected Integer sickRoom;
    @XmlElement(name = "DuplicatingRoom")
    protected Integer duplicatingRoom;
    @XmlElement(name = "Storeroom")
    protected Integer storeroom;
    @XmlElement(name = "Quad")
    protected Integer quad;
    @XmlElement(name = "StrongRoom")
    protected Integer strongRoom;
    @XmlElement(name = "OtherNumber")
    protected Integer otherNumber;
    @XmlElement(name = "OtherType")
    protected String otherType;
    @XmlElement(name = "ClassPerm")
    protected Integer classPerm;
    @XmlElement(name = "ClassPrefab")
    protected Integer classPrefab;
    @XmlElement(name = "ClassUnderCon")
    protected Integer classUnderCon;
    @XmlElement(name = "ClassOffSite")
    protected Integer classOffSite;
    @XmlElement(name = "MultigradePerm")
    protected Integer multigradePerm;
    @XmlElement(name = "MultigradePrefab")
    protected Integer multigradePrefab;
    @XmlElement(name = "MultigradeUnderCon")
    protected Integer multigradeUnderCon;
    @XmlElement(name = "MultigradeOffsite")
    protected Integer multigradeOffsite;
    @XmlElement(name = "LabPerm")
    protected Integer labPerm;
    @XmlElement(name = "LabPrefab")
    protected Integer labPrefab;
    @XmlElement(name = "LabUndercon")
    protected Integer labUndercon;
    @XmlElement(name = "LabOffsite")
    protected Integer labOffsite;
    @XmlElement(name = "SpecialPerm")
    protected Integer specialPerm;
    @XmlElement(name = "SpecialPrefab")
    protected Integer specialPrefab;
    @XmlElement(name = "SpecialUndercon")
    protected Integer specialUndercon;
    @XmlElement(name = "SpecialOffSite")
    protected Integer specialOffSite;
    @XmlElement(name = "WorkshopPerm")
    protected Integer workshopPerm;
    @XmlElement(name = "WorkshopPrefab")
    protected Integer workshopPrefab;
    @XmlElement(name = "WorkshopUnderCon")
    protected Integer workshopUnderCon;
    @XmlElement(name = "WorkshopOffSite")
    protected Integer workshopOffSite;
    @XmlElement(name = "MultiPurPerm")
    protected Integer multiPurPerm;
    @XmlElement(name = "MultiPurPrefab")
    protected Integer multiPurPrefab;
    @XmlElement(name = "MultiPurUnderCon")
    protected Integer multiPurUnderCon;
    @XmlElement(name = "MultiPurOffSite")
    protected Integer multiPurOffSite;
    @XmlElement(name = "CompPerm")
    protected Integer compPerm;
    @XmlElement(name = "CompPrefab")
    protected Integer compPrefab;
    @XmlElement(name = "CompUnderCon")
    protected Integer compUnderCon;
    @XmlElement(name = "CompOffSite")
    protected Integer compOffSite;
    @XmlElement(name = "MediaPerm")
    protected Integer mediaPerm;
    @XmlElement(name = "MediaPrefab")
    protected Integer mediaPrefab;
    @XmlElement(name = "MediaUnderCon")
    protected Integer mediaUnderCon;
    @XmlElement(name = "MediaOffSite")
    protected Integer mediaOffSite;
    @XmlElement(name = "MediaCentre")
    protected String mediaCentre;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "BuildingOwner")
    protected String buildingOwner;
    @XmlElement(name = "LandOwner")
    protected Integer landOwner;
    @XmlElement(name = "OwnerOther")
    protected String ownerOther;
    @XmlElement(name = "OwnerSName")
    protected String ownerSName;
    @XmlElement(name = "OwnerTitle")
    protected String ownerTitle;
    @XmlElement(name = "OwnerInitials")
    protected String ownerInitials;
    @XmlElement(name = "Farm")
    protected String farm;
    @XmlElement(name = "PostalAddress")
    protected String postalAddress;
    @XmlElement(name = "PhysicalAddress")
    protected String physicalAddress;
    @XmlElement(name = "Telcode")
    protected String telcode;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Faxcode")
    protected String faxcode;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Stateowned")
    protected Integer stateowned;
    @XmlElement(name = "SecuritySystem")
    protected String securitySystem;
    @XmlElement(name = "Alarm")
    protected String alarm;
    @XmlElement(name = "Guard")
    protected String guard;
    @XmlElement(name = "ArmedResponse")
    protected String armedResponse;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "Entrydate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrydate;
    @XmlElement(name = "Transport")
    protected Integer transport;
    @XmlElement(name = "TransportLearners")
    protected Integer transportLearners;
    @XmlElement(name = "Typetransport")
    protected Integer typetransport;
    @XmlElement(name = "TransportOther")
    protected String transportOther;
    @XmlElement(name = "ClassroomCon")
    protected Integer classroomCon;
    @XmlElement(name = "StaffroomCon")
    protected Integer staffroomCon;
    @XmlElement(name = "OfficesCon")
    protected Integer officesCon;
    @XmlElement(name = "LaboratoryCon")
    protected Integer laboratoryCon;
    @XmlElement(name = "LibraryCon")
    protected Integer libraryCon;
    @XmlElement(name = "ToiletsCon")
    protected Integer toiletsCon;
    @XmlElement(name = "StoreroomCon")
    protected Integer storeroomCon;
    @XmlElement(name = "Sportfields")
    protected Integer sportfields;

    /**
     * Gets the value of the principalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrincipalOffice() {
        return principalOffice;
    }

    /**
     * Sets the value of the principalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrincipalOffice(Integer value) {
        this.principalOffice = value;
    }

    /**
     * Gets the value of the otherOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherOffice() {
        return otherOffice;
    }

    /**
     * Sets the value of the otherOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherOffice(Integer value) {
        this.otherOffice = value;
    }

    /**
     * Gets the value of the schoolHall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchoolHall() {
        return schoolHall;
    }

    /**
     * Sets the value of the schoolHall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchoolHall(Integer value) {
        this.schoolHall = value;
    }

    /**
     * Gets the value of the staffroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffroom() {
        return staffroom;
    }

    /**
     * Sets the value of the staffroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffroom(Integer value) {
        this.staffroom = value;
    }

    /**
     * Gets the value of the safe property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafe() {
        return safe;
    }

    /**
     * Sets the value of the safe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafe(Integer value) {
        this.safe = value;
    }

    /**
     * Gets the value of the sickRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSickRoom() {
        return sickRoom;
    }

    /**
     * Sets the value of the sickRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSickRoom(Integer value) {
        this.sickRoom = value;
    }

    /**
     * Gets the value of the duplicatingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuplicatingRoom() {
        return duplicatingRoom;
    }

    /**
     * Sets the value of the duplicatingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuplicatingRoom(Integer value) {
        this.duplicatingRoom = value;
    }

    /**
     * Gets the value of the storeroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreroom() {
        return storeroom;
    }

    /**
     * Sets the value of the storeroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreroom(Integer value) {
        this.storeroom = value;
    }

    /**
     * Gets the value of the quad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuad() {
        return quad;
    }

    /**
     * Sets the value of the quad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuad(Integer value) {
        this.quad = value;
    }

    /**
     * Gets the value of the strongRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrongRoom() {
        return strongRoom;
    }

    /**
     * Sets the value of the strongRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrongRoom(Integer value) {
        this.strongRoom = value;
    }

    /**
     * Gets the value of the otherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherNumber() {
        return otherNumber;
    }

    /**
     * Sets the value of the otherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherNumber(Integer value) {
        this.otherNumber = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the classPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassPerm() {
        return classPerm;
    }

    /**
     * Sets the value of the classPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassPerm(Integer value) {
        this.classPerm = value;
    }

    /**
     * Gets the value of the classPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassPrefab() {
        return classPrefab;
    }

    /**
     * Sets the value of the classPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassPrefab(Integer value) {
        this.classPrefab = value;
    }

    /**
     * Gets the value of the classUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassUnderCon() {
        return classUnderCon;
    }

    /**
     * Sets the value of the classUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassUnderCon(Integer value) {
        this.classUnderCon = value;
    }

    /**
     * Gets the value of the classOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassOffSite() {
        return classOffSite;
    }

    /**
     * Sets the value of the classOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassOffSite(Integer value) {
        this.classOffSite = value;
    }

    /**
     * Gets the value of the multigradePerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultigradePerm() {
        return multigradePerm;
    }

    /**
     * Sets the value of the multigradePerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultigradePerm(Integer value) {
        this.multigradePerm = value;
    }

    /**
     * Gets the value of the multigradePrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultigradePrefab() {
        return multigradePrefab;
    }

    /**
     * Sets the value of the multigradePrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultigradePrefab(Integer value) {
        this.multigradePrefab = value;
    }

    /**
     * Gets the value of the multigradeUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultigradeUnderCon() {
        return multigradeUnderCon;
    }

    /**
     * Sets the value of the multigradeUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultigradeUnderCon(Integer value) {
        this.multigradeUnderCon = value;
    }

    /**
     * Gets the value of the multigradeOffsite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultigradeOffsite() {
        return multigradeOffsite;
    }

    /**
     * Sets the value of the multigradeOffsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultigradeOffsite(Integer value) {
        this.multigradeOffsite = value;
    }

    /**
     * Gets the value of the labPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLabPerm() {
        return labPerm;
    }

    /**
     * Sets the value of the labPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLabPerm(Integer value) {
        this.labPerm = value;
    }

    /**
     * Gets the value of the labPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLabPrefab() {
        return labPrefab;
    }

    /**
     * Sets the value of the labPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLabPrefab(Integer value) {
        this.labPrefab = value;
    }

    /**
     * Gets the value of the labUndercon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLabUndercon() {
        return labUndercon;
    }

    /**
     * Sets the value of the labUndercon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLabUndercon(Integer value) {
        this.labUndercon = value;
    }

    /**
     * Gets the value of the labOffsite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLabOffsite() {
        return labOffsite;
    }

    /**
     * Sets the value of the labOffsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLabOffsite(Integer value) {
        this.labOffsite = value;
    }

    /**
     * Gets the value of the specialPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialPerm() {
        return specialPerm;
    }

    /**
     * Sets the value of the specialPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialPerm(Integer value) {
        this.specialPerm = value;
    }

    /**
     * Gets the value of the specialPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialPrefab() {
        return specialPrefab;
    }

    /**
     * Sets the value of the specialPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialPrefab(Integer value) {
        this.specialPrefab = value;
    }

    /**
     * Gets the value of the specialUndercon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialUndercon() {
        return specialUndercon;
    }

    /**
     * Sets the value of the specialUndercon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialUndercon(Integer value) {
        this.specialUndercon = value;
    }

    /**
     * Gets the value of the specialOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialOffSite() {
        return specialOffSite;
    }

    /**
     * Sets the value of the specialOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialOffSite(Integer value) {
        this.specialOffSite = value;
    }

    /**
     * Gets the value of the workshopPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkshopPerm() {
        return workshopPerm;
    }

    /**
     * Sets the value of the workshopPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkshopPerm(Integer value) {
        this.workshopPerm = value;
    }

    /**
     * Gets the value of the workshopPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkshopPrefab() {
        return workshopPrefab;
    }

    /**
     * Sets the value of the workshopPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkshopPrefab(Integer value) {
        this.workshopPrefab = value;
    }

    /**
     * Gets the value of the workshopUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkshopUnderCon() {
        return workshopUnderCon;
    }

    /**
     * Sets the value of the workshopUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkshopUnderCon(Integer value) {
        this.workshopUnderCon = value;
    }

    /**
     * Gets the value of the workshopOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkshopOffSite() {
        return workshopOffSite;
    }

    /**
     * Sets the value of the workshopOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkshopOffSite(Integer value) {
        this.workshopOffSite = value;
    }

    /**
     * Gets the value of the multiPurPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiPurPerm() {
        return multiPurPerm;
    }

    /**
     * Sets the value of the multiPurPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiPurPerm(Integer value) {
        this.multiPurPerm = value;
    }

    /**
     * Gets the value of the multiPurPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiPurPrefab() {
        return multiPurPrefab;
    }

    /**
     * Sets the value of the multiPurPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiPurPrefab(Integer value) {
        this.multiPurPrefab = value;
    }

    /**
     * Gets the value of the multiPurUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiPurUnderCon() {
        return multiPurUnderCon;
    }

    /**
     * Sets the value of the multiPurUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiPurUnderCon(Integer value) {
        this.multiPurUnderCon = value;
    }

    /**
     * Gets the value of the multiPurOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiPurOffSite() {
        return multiPurOffSite;
    }

    /**
     * Sets the value of the multiPurOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiPurOffSite(Integer value) {
        this.multiPurOffSite = value;
    }

    /**
     * Gets the value of the compPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompPerm() {
        return compPerm;
    }

    /**
     * Sets the value of the compPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompPerm(Integer value) {
        this.compPerm = value;
    }

    /**
     * Gets the value of the compPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompPrefab() {
        return compPrefab;
    }

    /**
     * Sets the value of the compPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompPrefab(Integer value) {
        this.compPrefab = value;
    }

    /**
     * Gets the value of the compUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompUnderCon() {
        return compUnderCon;
    }

    /**
     * Sets the value of the compUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompUnderCon(Integer value) {
        this.compUnderCon = value;
    }

    /**
     * Gets the value of the compOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompOffSite() {
        return compOffSite;
    }

    /**
     * Sets the value of the compOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompOffSite(Integer value) {
        this.compOffSite = value;
    }

    /**
     * Gets the value of the mediaPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaPerm() {
        return mediaPerm;
    }

    /**
     * Sets the value of the mediaPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaPerm(Integer value) {
        this.mediaPerm = value;
    }

    /**
     * Gets the value of the mediaPrefab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaPrefab() {
        return mediaPrefab;
    }

    /**
     * Sets the value of the mediaPrefab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaPrefab(Integer value) {
        this.mediaPrefab = value;
    }

    /**
     * Gets the value of the mediaUnderCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaUnderCon() {
        return mediaUnderCon;
    }

    /**
     * Sets the value of the mediaUnderCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaUnderCon(Integer value) {
        this.mediaUnderCon = value;
    }

    /**
     * Gets the value of the mediaOffSite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaOffSite() {
        return mediaOffSite;
    }

    /**
     * Sets the value of the mediaOffSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaOffSite(Integer value) {
        this.mediaOffSite = value;
    }

    /**
     * Gets the value of the mediaCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaCentre() {
        return mediaCentre;
    }

    /**
     * Sets the value of the mediaCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaCentre(String value) {
        this.mediaCentre = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the buildingOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingOwner() {
        return buildingOwner;
    }

    /**
     * Sets the value of the buildingOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingOwner(String value) {
        this.buildingOwner = value;
    }

    /**
     * Gets the value of the landOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLandOwner() {
        return landOwner;
    }

    /**
     * Sets the value of the landOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLandOwner(Integer value) {
        this.landOwner = value;
    }

    /**
     * Gets the value of the ownerOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOther() {
        return ownerOther;
    }

    /**
     * Sets the value of the ownerOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOther(String value) {
        this.ownerOther = value;
    }

    /**
     * Gets the value of the ownerSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerSName() {
        return ownerSName;
    }

    /**
     * Sets the value of the ownerSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerSName(String value) {
        this.ownerSName = value;
    }

    /**
     * Gets the value of the ownerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTitle() {
        return ownerTitle;
    }

    /**
     * Sets the value of the ownerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTitle(String value) {
        this.ownerTitle = value;
    }

    /**
     * Gets the value of the ownerInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerInitials() {
        return ownerInitials;
    }

    /**
     * Sets the value of the ownerInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerInitials(String value) {
        this.ownerInitials = value;
    }

    /**
     * Gets the value of the farm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarm() {
        return farm;
    }

    /**
     * Sets the value of the farm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarm(String value) {
        this.farm = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress(String value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the telcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelcode() {
        return telcode;
    }

    /**
     * Sets the value of the telcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelcode(String value) {
        this.telcode = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the faxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxcode() {
        return faxcode;
    }

    /**
     * Sets the value of the faxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxcode(String value) {
        this.faxcode = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the stateowned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateowned() {
        return stateowned;
    }

    /**
     * Sets the value of the stateowned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateowned(Integer value) {
        this.stateowned = value;
    }

    /**
     * Gets the value of the securitySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySystem() {
        return securitySystem;
    }

    /**
     * Sets the value of the securitySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySystem(String value) {
        this.securitySystem = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarm(String value) {
        this.alarm = value;
    }

    /**
     * Gets the value of the guard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuard() {
        return guard;
    }

    /**
     * Sets the value of the guard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuard(String value) {
        this.guard = value;
    }

    /**
     * Gets the value of the armedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmedResponse() {
        return armedResponse;
    }

    /**
     * Sets the value of the armedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmedResponse(String value) {
        this.armedResponse = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the entrydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrydate() {
        return entrydate;
    }

    /**
     * Sets the value of the entrydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrydate(XMLGregorianCalendar value) {
        this.entrydate = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransport(Integer value) {
        this.transport = value;
    }

    /**
     * Gets the value of the transportLearners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportLearners() {
        return transportLearners;
    }

    /**
     * Sets the value of the transportLearners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportLearners(Integer value) {
        this.transportLearners = value;
    }

    /**
     * Gets the value of the typetransport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypetransport() {
        return typetransport;
    }

    /**
     * Sets the value of the typetransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypetransport(Integer value) {
        this.typetransport = value;
    }

    /**
     * Gets the value of the transportOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportOther() {
        return transportOther;
    }

    /**
     * Sets the value of the transportOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportOther(String value) {
        this.transportOther = value;
    }

    /**
     * Gets the value of the classroomCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassroomCon() {
        return classroomCon;
    }

    /**
     * Sets the value of the classroomCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassroomCon(Integer value) {
        this.classroomCon = value;
    }

    /**
     * Gets the value of the staffroomCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffroomCon() {
        return staffroomCon;
    }

    /**
     * Sets the value of the staffroomCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffroomCon(Integer value) {
        this.staffroomCon = value;
    }

    /**
     * Gets the value of the officesCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfficesCon() {
        return officesCon;
    }

    /**
     * Sets the value of the officesCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfficesCon(Integer value) {
        this.officesCon = value;
    }

    /**
     * Gets the value of the laboratoryCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLaboratoryCon() {
        return laboratoryCon;
    }

    /**
     * Sets the value of the laboratoryCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLaboratoryCon(Integer value) {
        this.laboratoryCon = value;
    }

    /**
     * Gets the value of the libraryCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLibraryCon() {
        return libraryCon;
    }

    /**
     * Sets the value of the libraryCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLibraryCon(Integer value) {
        this.libraryCon = value;
    }

    /**
     * Gets the value of the toiletsCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToiletsCon() {
        return toiletsCon;
    }

    /**
     * Sets the value of the toiletsCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToiletsCon(Integer value) {
        this.toiletsCon = value;
    }

    /**
     * Gets the value of the storeroomCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreroomCon() {
        return storeroomCon;
    }

    /**
     * Sets the value of the storeroomCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreroomCon(Integer value) {
        this.storeroomCon = value;
    }

    /**
     * Gets the value of the sportfields property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSportfields() {
        return sportfields;
    }

    /**
     * Sets the value of the sportfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSportfields(Integer value) {
        this.sportfields = value;
    }

}
