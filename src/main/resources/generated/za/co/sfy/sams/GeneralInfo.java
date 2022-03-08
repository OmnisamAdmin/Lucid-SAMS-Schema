
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
 *         &lt;element name="SchoolID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SchoolName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProvincialDep"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="District"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Region" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Circuit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TelCode1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TelCode2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telcode3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FaxCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TSchool" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="210"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAdd1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAdd2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAdd3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ttelcode1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TTel1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tfaxcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TFax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPrincipal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactPerson" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmisCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMail" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="210"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PredominantLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PersalPayPoint" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersalComponent" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InternetAccess" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ownership" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LandOwnership" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Platoon" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HostSchool" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DoubleShifts" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExamAuthority" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExamCentre" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExamCentreNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Specialised" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Specialisation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeePeriod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Multigrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Remedial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SGBStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaintainProperty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExtraMural" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Textbooks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Services" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Abet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OtherFunctions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CensusArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ErfNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmisHostSchool" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HostTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExamAuthName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CorrespondenceLang" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NearestTown" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DistanceTown" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DistrictCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddressType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSSchoolStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSTransactionCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReportStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *         &lt;element name="OwnerBuildings" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LuritsIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Telcode4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdminComputers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostAddress0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostAddress0No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEmisCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UseMarksSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PSNP" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="TSIncludesANA" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LastDBCompact" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IQMS_LastExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IQMS_LastImpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExamBoard" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExamBoardOther" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
    "schoolID",
    "schoolName",
    "provincialDep",
    "district",
    "region",
    "circuit",
    "address1",
    "address2",
    "address3",
    "addressCode",
    "postAddress1",
    "postAddress2",
    "postAddress3",
    "postCode",
    "telCode1",
    "telephone1",
    "telCode2",
    "telephone2",
    "telcode3",
    "telephone3",
    "faxCode",
    "fax",
    "tSchool",
    "tAdd1",
    "tAdd2",
    "tAdd3",
    "tCode",
    "ttelcode1",
    "tTel1",
    "tfaxcode",
    "tFax",
    "tPrincipal",
    "contactPerson",
    "emisCode",
    "eMail",
    "predominantLanguage",
    "persalPayPoint",
    "persalComponent",
    "internetAccess",
    "ownership",
    "landOwnership",
    "platoon",
    "hostSchool",
    "doubleShifts",
    "examAuthority",
    "examCentre",
    "examCentreNumber",
    "specialised",
    "specialisation",
    "feePeriod",
    "feeMonths",
    "multigrade",
    "remedial",
    "sgbStatus",
    "maintainProperty",
    "extraMural",
    "textbooks",
    "services",
    "abet",
    "otherFunctions",
    "censusArea",
    "erfNumber",
    "emisHostSchool",
    "hostTime",
    "examAuthName",
    "correspondenceLang",
    "nearestTown",
    "distanceTown",
    "districtCode",
    "postalAddressType",
    "schoolLevel",
    "tsSchoolStatus",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "luritsYear",
    "tsSentFileName",
    "tsDateLastUpdate",
    "tsLastUpdatedBy",
    "ownerBuildings",
    "luritsIndicator",
    "telcode4",
    "telephone4",
    "adminComputers",
    "postAddress0",
    "postAddress0No",
    "tEmisCode",
    "useMarksSecurity",
    "psnp",
    "tsIncludesANA",
    "lastDBCompact",
    "iqmsLastExpDate",
    "iqmsLastImpDate",
    "examBoard",
    "examBoardOther"
})
@XmlRootElement(name = "General_Info")
public class GeneralInfo {

    @XmlElement(name = "SchoolID")
    protected int schoolID;
    @XmlElement(name = "SchoolName", required = true)
    protected String schoolName;
    @XmlElement(name = "ProvincialDep", required = true)
    protected String provincialDep;
    @XmlElement(name = "District", required = true)
    protected String district;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Circuit")
    protected String circuit;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "PostAddress1")
    protected String postAddress1;
    @XmlElement(name = "PostAddress2")
    protected String postAddress2;
    @XmlElement(name = "PostAddress3")
    protected String postAddress3;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "TelCode1")
    protected String telCode1;
    @XmlElement(name = "Telephone1")
    protected String telephone1;
    @XmlElement(name = "TelCode2")
    protected String telCode2;
    @XmlElement(name = "Telephone2")
    protected String telephone2;
    @XmlElement(name = "Telcode3")
    protected String telcode3;
    @XmlElement(name = "Telephone3")
    protected String telephone3;
    @XmlElement(name = "FaxCode")
    protected String faxCode;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "TSchool")
    protected String tSchool;
    @XmlElement(name = "TAdd1")
    protected String tAdd1;
    @XmlElement(name = "TAdd2")
    protected String tAdd2;
    @XmlElement(name = "TAdd3")
    protected String tAdd3;
    @XmlElement(name = "TCode")
    protected String tCode;
    protected String ttelcode1;
    @XmlElement(name = "TTel1")
    protected String tTel1;
    @XmlElement(name = "Tfaxcode")
    protected String tfaxcode;
    @XmlElement(name = "TFax")
    protected String tFax;
    @XmlElement(name = "TPrincipal")
    protected String tPrincipal;
    @XmlElement(name = "ContactPerson")
    protected String contactPerson;
    @XmlElement(name = "EmisCode")
    protected String emisCode;
    @XmlElement(name = "EMail")
    protected String eMail;
    @XmlElement(name = "PredominantLanguage")
    protected Integer predominantLanguage;
    @XmlElement(name = "PersalPayPoint")
    protected String persalPayPoint;
    @XmlElement(name = "PersalComponent")
    protected String persalComponent;
    @XmlElement(name = "InternetAccess")
    protected String internetAccess;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "LandOwnership")
    protected String landOwnership;
    @XmlElement(name = "Platoon")
    protected String platoon;
    @XmlElement(name = "HostSchool")
    protected String hostSchool;
    @XmlElement(name = "DoubleShifts")
    protected String doubleShifts;
    @XmlElement(name = "ExamAuthority")
    protected String examAuthority;
    @XmlElement(name = "ExamCentre")
    protected String examCentre;
    @XmlElement(name = "ExamCentreNumber")
    protected String examCentreNumber;
    @XmlElement(name = "Specialised")
    protected String specialised;
    @XmlElement(name = "Specialisation")
    protected String specialisation;
    @XmlElement(name = "FeePeriod")
    protected String feePeriod;
    @XmlElement(name = "FeeMonths")
    protected Integer feeMonths;
    @XmlElement(name = "Multigrade")
    protected Integer multigrade;
    @XmlElement(name = "Remedial")
    protected Integer remedial;
    @XmlElement(name = "SGBStatus")
    protected String sgbStatus;
    @XmlElement(name = "MaintainProperty")
    protected boolean maintainProperty;
    @XmlElement(name = "ExtraMural")
    protected boolean extraMural;
    @XmlElement(name = "Textbooks")
    protected boolean textbooks;
    @XmlElement(name = "Services")
    protected boolean services;
    @XmlElement(name = "Abet")
    protected boolean abet;
    @XmlElement(name = "OtherFunctions")
    protected boolean otherFunctions;
    @XmlElement(name = "CensusArea")
    protected String censusArea;
    @XmlElement(name = "ErfNumber")
    protected String erfNumber;
    @XmlElement(name = "EmisHostSchool")
    protected String emisHostSchool;
    @XmlElement(name = "HostTime")
    protected Integer hostTime;
    @XmlElement(name = "ExamAuthName")
    protected String examAuthName;
    @XmlElement(name = "CorrespondenceLang")
    protected Integer correspondenceLang;
    @XmlElement(name = "NearestTown")
    protected String nearestTown;
    @XmlElement(name = "DistanceTown")
    protected Double distanceTown;
    @XmlElement(name = "DistrictCode")
    protected Integer districtCode;
    @XmlElement(name = "PostalAddressType")
    protected String postalAddressType;
    @XmlElement(name = "SchoolLevel")
    protected Integer schoolLevel;
    @XmlElement(name = "TSSchoolStatus")
    protected Integer tsSchoolStatus;
    @XmlElement(name = "TSTransactionCategory")
    protected Integer tsTransactionCategory;
    @XmlElement(name = "TSStatusFlag")
    protected Integer tsStatusFlag;
    @XmlElement(name = "TSReportStatusFlag")
    protected Integer tsReportStatusFlag;
    @XmlElement(name = "TSReasonCode")
    protected Integer tsReasonCode;
    @XmlElement(name = "LuritsYear")
    protected Integer luritsYear;
    @XmlElement(name = "TSSentFileName")
    protected String tsSentFileName;
    @XmlElement(name = "TSDateLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsDateLastUpdate;
    @XmlElement(name = "TSLastUpdatedBy")
    protected String tsLastUpdatedBy;
    @XmlElement(name = "OwnerBuildings")
    protected String ownerBuildings;
    @XmlElement(name = "LuritsIndicator")
    protected Integer luritsIndicator;
    @XmlElement(name = "Telcode4")
    protected String telcode4;
    @XmlElement(name = "Telephone4")
    protected String telephone4;
    @XmlElement(name = "AdminComputers")
    protected Integer adminComputers;
    @XmlElement(name = "PostAddress0")
    protected String postAddress0;
    @XmlElement(name = "PostAddress0No")
    protected String postAddress0No;
    @XmlElement(name = "TEmisCode")
    protected String tEmisCode;
    @XmlElement(name = "UseMarksSecurity")
    protected boolean useMarksSecurity;
    @XmlElement(name = "PSNP")
    @XmlSchemaType(name = "unsignedByte")
    protected Short psnp;
    @XmlElement(name = "TSIncludesANA")
    @XmlSchemaType(name = "unsignedByte")
    protected Short tsIncludesANA;
    @XmlElement(name = "LastDBCompact")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDBCompact;
    @XmlElement(name = "IQMS_LastExpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar iqmsLastExpDate;
    @XmlElement(name = "IQMS_LastImpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar iqmsLastImpDate;
    @XmlElement(name = "ExamBoard")
    protected Integer examBoard;
    @XmlElement(name = "ExamBoardOther")
    protected String examBoardOther;

    /**
     * Gets the value of the schoolID property.
     * 
     */
    public int getSchoolID() {
        return schoolID;
    }

    /**
     * Sets the value of the schoolID property.
     * 
     */
    public void setSchoolID(int value) {
        this.schoolID = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the provincialDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincialDep() {
        return provincialDep;
    }

    /**
     * Sets the value of the provincialDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincialDep(String value) {
        this.provincialDep = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the circuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuit() {
        return circuit;
    }

    /**
     * Sets the value of the circuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuit(String value) {
        this.circuit = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the postAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress1() {
        return postAddress1;
    }

    /**
     * Sets the value of the postAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress1(String value) {
        this.postAddress1 = value;
    }

    /**
     * Gets the value of the postAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress2() {
        return postAddress2;
    }

    /**
     * Sets the value of the postAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress2(String value) {
        this.postAddress2 = value;
    }

    /**
     * Gets the value of the postAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress3() {
        return postAddress3;
    }

    /**
     * Sets the value of the postAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress3(String value) {
        this.postAddress3 = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the telCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCode1() {
        return telCode1;
    }

    /**
     * Sets the value of the telCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCode1(String value) {
        this.telCode1 = value;
    }

    /**
     * Gets the value of the telephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone1() {
        return telephone1;
    }

    /**
     * Sets the value of the telephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone1(String value) {
        this.telephone1 = value;
    }

    /**
     * Gets the value of the telCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelCode2() {
        return telCode2;
    }

    /**
     * Sets the value of the telCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelCode2(String value) {
        this.telCode2 = value;
    }

    /**
     * Gets the value of the telephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * Sets the value of the telephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone2(String value) {
        this.telephone2 = value;
    }

    /**
     * Gets the value of the telcode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelcode3() {
        return telcode3;
    }

    /**
     * Sets the value of the telcode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelcode3(String value) {
        this.telcode3 = value;
    }

    /**
     * Gets the value of the telephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone3() {
        return telephone3;
    }

    /**
     * Sets the value of the telephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone3(String value) {
        this.telephone3 = value;
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
     * Gets the value of the tSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSchool() {
        return tSchool;
    }

    /**
     * Sets the value of the tSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSchool(String value) {
        this.tSchool = value;
    }

    /**
     * Gets the value of the tAdd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAdd1() {
        return tAdd1;
    }

    /**
     * Sets the value of the tAdd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAdd1(String value) {
        this.tAdd1 = value;
    }

    /**
     * Gets the value of the tAdd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAdd2() {
        return tAdd2;
    }

    /**
     * Sets the value of the tAdd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAdd2(String value) {
        this.tAdd2 = value;
    }

    /**
     * Gets the value of the tAdd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAdd3() {
        return tAdd3;
    }

    /**
     * Sets the value of the tAdd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAdd3(String value) {
        this.tAdd3 = value;
    }

    /**
     * Gets the value of the tCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCode() {
        return tCode;
    }

    /**
     * Sets the value of the tCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCode(String value) {
        this.tCode = value;
    }

    /**
     * Gets the value of the ttelcode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtelcode1() {
        return ttelcode1;
    }

    /**
     * Sets the value of the ttelcode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtelcode1(String value) {
        this.ttelcode1 = value;
    }

    /**
     * Gets the value of the tTel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTel1() {
        return tTel1;
    }

    /**
     * Sets the value of the tTel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTel1(String value) {
        this.tTel1 = value;
    }

    /**
     * Gets the value of the tfaxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfaxcode() {
        return tfaxcode;
    }

    /**
     * Sets the value of the tfaxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfaxcode(String value) {
        this.tfaxcode = value;
    }

    /**
     * Gets the value of the tFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFax() {
        return tFax;
    }

    /**
     * Sets the value of the tFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFax(String value) {
        this.tFax = value;
    }

    /**
     * Gets the value of the tPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPrincipal() {
        return tPrincipal;
    }

    /**
     * Sets the value of the tPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPrincipal(String value) {
        this.tPrincipal = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the emisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisCode() {
        return emisCode;
    }

    /**
     * Sets the value of the emisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisCode(String value) {
        this.emisCode = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the predominantLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPredominantLanguage() {
        return predominantLanguage;
    }

    /**
     * Sets the value of the predominantLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPredominantLanguage(Integer value) {
        this.predominantLanguage = value;
    }

    /**
     * Gets the value of the persalPayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersalPayPoint() {
        return persalPayPoint;
    }

    /**
     * Sets the value of the persalPayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersalPayPoint(String value) {
        this.persalPayPoint = value;
    }

    /**
     * Gets the value of the persalComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersalComponent() {
        return persalComponent;
    }

    /**
     * Sets the value of the persalComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersalComponent(String value) {
        this.persalComponent = value;
    }

    /**
     * Gets the value of the internetAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAccess() {
        return internetAccess;
    }

    /**
     * Sets the value of the internetAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAccess(String value) {
        this.internetAccess = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the landOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandOwnership() {
        return landOwnership;
    }

    /**
     * Sets the value of the landOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandOwnership(String value) {
        this.landOwnership = value;
    }

    /**
     * Gets the value of the platoon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatoon() {
        return platoon;
    }

    /**
     * Sets the value of the platoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatoon(String value) {
        this.platoon = value;
    }

    /**
     * Gets the value of the hostSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostSchool() {
        return hostSchool;
    }

    /**
     * Sets the value of the hostSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostSchool(String value) {
        this.hostSchool = value;
    }

    /**
     * Gets the value of the doubleShifts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleShifts() {
        return doubleShifts;
    }

    /**
     * Sets the value of the doubleShifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleShifts(String value) {
        this.doubleShifts = value;
    }

    /**
     * Gets the value of the examAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamAuthority() {
        return examAuthority;
    }

    /**
     * Sets the value of the examAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamAuthority(String value) {
        this.examAuthority = value;
    }

    /**
     * Gets the value of the examCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamCentre() {
        return examCentre;
    }

    /**
     * Sets the value of the examCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamCentre(String value) {
        this.examCentre = value;
    }

    /**
     * Gets the value of the examCentreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamCentreNumber() {
        return examCentreNumber;
    }

    /**
     * Sets the value of the examCentreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamCentreNumber(String value) {
        this.examCentreNumber = value;
    }

    /**
     * Gets the value of the specialised property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialised() {
        return specialised;
    }

    /**
     * Sets the value of the specialised property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialised(String value) {
        this.specialised = value;
    }

    /**
     * Gets the value of the specialisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialisation() {
        return specialisation;
    }

    /**
     * Sets the value of the specialisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialisation(String value) {
        this.specialisation = value;
    }

    /**
     * Gets the value of the feePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePeriod() {
        return feePeriod;
    }

    /**
     * Sets the value of the feePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePeriod(String value) {
        this.feePeriod = value;
    }

    /**
     * Gets the value of the feeMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeMonths() {
        return feeMonths;
    }

    /**
     * Sets the value of the feeMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeMonths(Integer value) {
        this.feeMonths = value;
    }

    /**
     * Gets the value of the multigrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultigrade() {
        return multigrade;
    }

    /**
     * Sets the value of the multigrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultigrade(Integer value) {
        this.multigrade = value;
    }

    /**
     * Gets the value of the remedial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemedial() {
        return remedial;
    }

    /**
     * Sets the value of the remedial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemedial(Integer value) {
        this.remedial = value;
    }

    /**
     * Gets the value of the sgbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGBStatus() {
        return sgbStatus;
    }

    /**
     * Sets the value of the sgbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGBStatus(String value) {
        this.sgbStatus = value;
    }

    /**
     * Gets the value of the maintainProperty property.
     * 
     */
    public boolean isMaintainProperty() {
        return maintainProperty;
    }

    /**
     * Sets the value of the maintainProperty property.
     * 
     */
    public void setMaintainProperty(boolean value) {
        this.maintainProperty = value;
    }

    /**
     * Gets the value of the extraMural property.
     * 
     */
    public boolean isExtraMural() {
        return extraMural;
    }

    /**
     * Sets the value of the extraMural property.
     * 
     */
    public void setExtraMural(boolean value) {
        this.extraMural = value;
    }

    /**
     * Gets the value of the textbooks property.
     * 
     */
    public boolean isTextbooks() {
        return textbooks;
    }

    /**
     * Sets the value of the textbooks property.
     * 
     */
    public void setTextbooks(boolean value) {
        this.textbooks = value;
    }

    /**
     * Gets the value of the services property.
     * 
     */
    public boolean isServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     */
    public void setServices(boolean value) {
        this.services = value;
    }

    /**
     * Gets the value of the abet property.
     * 
     */
    public boolean isAbet() {
        return abet;
    }

    /**
     * Sets the value of the abet property.
     * 
     */
    public void setAbet(boolean value) {
        this.abet = value;
    }

    /**
     * Gets the value of the otherFunctions property.
     * 
     */
    public boolean isOtherFunctions() {
        return otherFunctions;
    }

    /**
     * Sets the value of the otherFunctions property.
     * 
     */
    public void setOtherFunctions(boolean value) {
        this.otherFunctions = value;
    }

    /**
     * Gets the value of the censusArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusArea() {
        return censusArea;
    }

    /**
     * Sets the value of the censusArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusArea(String value) {
        this.censusArea = value;
    }

    /**
     * Gets the value of the erfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErfNumber() {
        return erfNumber;
    }

    /**
     * Sets the value of the erfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErfNumber(String value) {
        this.erfNumber = value;
    }

    /**
     * Gets the value of the emisHostSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisHostSchool() {
        return emisHostSchool;
    }

    /**
     * Sets the value of the emisHostSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisHostSchool(String value) {
        this.emisHostSchool = value;
    }

    /**
     * Gets the value of the hostTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostTime() {
        return hostTime;
    }

    /**
     * Sets the value of the hostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostTime(Integer value) {
        this.hostTime = value;
    }

    /**
     * Gets the value of the examAuthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamAuthName() {
        return examAuthName;
    }

    /**
     * Sets the value of the examAuthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamAuthName(String value) {
        this.examAuthName = value;
    }

    /**
     * Gets the value of the correspondenceLang property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrespondenceLang() {
        return correspondenceLang;
    }

    /**
     * Sets the value of the correspondenceLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrespondenceLang(Integer value) {
        this.correspondenceLang = value;
    }

    /**
     * Gets the value of the nearestTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearestTown() {
        return nearestTown;
    }

    /**
     * Sets the value of the nearestTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearestTown(String value) {
        this.nearestTown = value;
    }

    /**
     * Gets the value of the distanceTown property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceTown() {
        return distanceTown;
    }

    /**
     * Sets the value of the distanceTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceTown(Double value) {
        this.distanceTown = value;
    }

    /**
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistrictCode(Integer value) {
        this.districtCode = value;
    }

    /**
     * Gets the value of the postalAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddressType() {
        return postalAddressType;
    }

    /**
     * Sets the value of the postalAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddressType(String value) {
        this.postalAddressType = value;
    }

    /**
     * Gets the value of the schoolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchoolLevel() {
        return schoolLevel;
    }

    /**
     * Sets the value of the schoolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchoolLevel(Integer value) {
        this.schoolLevel = value;
    }

    /**
     * Gets the value of the tsSchoolStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSSchoolStatus() {
        return tsSchoolStatus;
    }

    /**
     * Sets the value of the tsSchoolStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSSchoolStatus(Integer value) {
        this.tsSchoolStatus = value;
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
     * Gets the value of the luritsYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLuritsYear() {
        return luritsYear;
    }

    /**
     * Sets the value of the luritsYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLuritsYear(Integer value) {
        this.luritsYear = value;
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
     * Gets the value of the ownerBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerBuildings() {
        return ownerBuildings;
    }

    /**
     * Sets the value of the ownerBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerBuildings(String value) {
        this.ownerBuildings = value;
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
     * Gets the value of the telcode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelcode4() {
        return telcode4;
    }

    /**
     * Sets the value of the telcode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelcode4(String value) {
        this.telcode4 = value;
    }

    /**
     * Gets the value of the telephone4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone4() {
        return telephone4;
    }

    /**
     * Sets the value of the telephone4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone4(String value) {
        this.telephone4 = value;
    }

    /**
     * Gets the value of the adminComputers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdminComputers() {
        return adminComputers;
    }

    /**
     * Sets the value of the adminComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdminComputers(Integer value) {
        this.adminComputers = value;
    }

    /**
     * Gets the value of the postAddress0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress0() {
        return postAddress0;
    }

    /**
     * Sets the value of the postAddress0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress0(String value) {
        this.postAddress0 = value;
    }

    /**
     * Gets the value of the postAddress0No property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress0No() {
        return postAddress0No;
    }

    /**
     * Sets the value of the postAddress0No property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress0No(String value) {
        this.postAddress0No = value;
    }

    /**
     * Gets the value of the tEmisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEmisCode() {
        return tEmisCode;
    }

    /**
     * Sets the value of the tEmisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEmisCode(String value) {
        this.tEmisCode = value;
    }

    /**
     * Gets the value of the useMarksSecurity property.
     * 
     */
    public boolean isUseMarksSecurity() {
        return useMarksSecurity;
    }

    /**
     * Sets the value of the useMarksSecurity property.
     * 
     */
    public void setUseMarksSecurity(boolean value) {
        this.useMarksSecurity = value;
    }

    /**
     * Gets the value of the psnp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPSNP() {
        return psnp;
    }

    /**
     * Sets the value of the psnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPSNP(Short value) {
        this.psnp = value;
    }

    /**
     * Gets the value of the tsIncludesANA property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTSIncludesANA() {
        return tsIncludesANA;
    }

    /**
     * Sets the value of the tsIncludesANA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTSIncludesANA(Short value) {
        this.tsIncludesANA = value;
    }

    /**
     * Gets the value of the lastDBCompact property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDBCompact() {
        return lastDBCompact;
    }

    /**
     * Sets the value of the lastDBCompact property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDBCompact(XMLGregorianCalendar value) {
        this.lastDBCompact = value;
    }

    /**
     * Gets the value of the iqmsLastExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIQMSLastExpDate() {
        return iqmsLastExpDate;
    }

    /**
     * Sets the value of the iqmsLastExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIQMSLastExpDate(XMLGregorianCalendar value) {
        this.iqmsLastExpDate = value;
    }

    /**
     * Gets the value of the iqmsLastImpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIQMSLastImpDate() {
        return iqmsLastImpDate;
    }

    /**
     * Sets the value of the iqmsLastImpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIQMSLastImpDate(XMLGregorianCalendar value) {
        this.iqmsLastImpDate = value;
    }

    /**
     * Gets the value of the examBoard property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExamBoard() {
        return examBoard;
    }

    /**
     * Sets the value of the examBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExamBoard(Integer value) {
        this.examBoard = value;
    }

    /**
     * Gets the value of the examBoardOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamBoardOther() {
        return examBoardOther;
    }

    /**
     * Sets the value of the examBoardOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamBoardOther(String value) {
        this.examBoardOther = value;
    }

}
