
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccessionNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TheDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="NickName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BirthDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDNo" minOccurs="0"&gt;
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
 *         &lt;element name="HomeLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstructionLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Address1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
 *         &lt;element name="Guardian" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel1Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel2Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel3Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tel3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GradeYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreviousSchool" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Religion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Disciplinary" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicalConditions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DrInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicalAidName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicalAidNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicalAidMember" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Guidance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
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
 *         &lt;element name="Citizenship" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Provincial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolProvince" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreviousSchoolProvince" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AssignClass" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PhysProvince" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Race" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
 *         &lt;element name="PreviousPlacementofSchool" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Transport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LSENDisabilities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateLeft" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Reason" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LSENStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Boarder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountryResidence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProvinceResidence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FirstProvince" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeceasedParent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SGRegister" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SGReceive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DrTel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Dexterity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PSNP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NoFamily" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PositionFamily" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReportLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ForeignID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LearnerComment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PhotoName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GradeEntered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GradeLeft" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BoarderNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BoarderHostel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ThirdName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
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
 *         &lt;element name="SocialGrantNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TSTransactionCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReportStatusFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LuritsNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TSSentfileName" minOccurs="0"&gt;
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
 *         &lt;element name="LearnerName2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LearnerName3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NameDiacritics" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherHomeLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherPreferredLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherTeachingLanguage" minOccurs="0"&gt;
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
 *         &lt;element name="SecondName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PastelCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BusRouteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Subj_HL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Subj_FAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrevSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PositionFamilyF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonForNoIDNo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="GrantCReg" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="GrantCReceive" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="GrantCNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grant4Reg" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant4Receive" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant4No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grant5Reg" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant5Receive" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant5No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grant9Reg" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant9Receive" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Grant9No" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClinicName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClinicAccRef" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClinicTelCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClinicTel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Subj_LOI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhaseYears" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ProgressedToGrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StudyPermit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="StudyPermitNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StudyPermitDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDNoNotValidating" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OldMentor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LSENAnaInc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LSENAnaHL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LSENAnaFAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreviousPlacementofSchoolYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ForeignIDType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="AgeRuleOverwritten" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReasonForNoForeignID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="FarmProj" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Road2Health" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ImmunizationCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ICEName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICESurname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICERelation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
    "id",
    "learnerID",
    "accessionNo",
    "theDate",
    "sName",
    "fName",
    "nickName",
    "birthDate",
    "idNo",
    "gender",
    "homeLanguage",
    "instructionLanguage",
    "preferredLanguage",
    "address1",
    "address2",
    "address3",
    "addressCode",
    "guardian",
    "tel1Code",
    "tel1",
    "tel2Code",
    "tel2",
    "tel3Code",
    "tel3",
    "grade",
    "clazz",
    "gradeYears",
    "previousSchool",
    "schoolAddress1",
    "schoolAddress2",
    "schoolAddress3",
    "schoolCode",
    "religion",
    "disciplinary",
    "medicalConditions",
    "drInfo",
    "medicalAidName",
    "medicalAidNo",
    "medicalAidMember",
    "guidance",
    "initials",
    "citizenship",
    "provincial",
    "schoolProvince",
    "previousSchoolProvince",
    "assignClass",
    "physProvince",
    "race",
    "title",
    "previousPlacementofSchool",
    "transport",
    "lsenDisabilities",
    "dateLeft",
    "reason",
    "lsenStatus",
    "status",
    "boarder",
    "countryResidence",
    "provinceResidence",
    "firstProvince",
    "deceasedParent",
    "sgRegister",
    "sgReceive",
    "drName",
    "drTel",
    "dexterity",
    "psnp",
    "noFamily",
    "positionFamily",
    "reportLanguage",
    "foreignID",
    "learnerComment",
    "photoName",
    "gradeEntered",
    "gradeLeft",
    "boarderNumber",
    "boarderHostel",
    "thirdName",
    "email",
    "socialGrantNo",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "luritsIndicator",
    "luritsFlag",
    "luritsNumber",
    "tsSentfileName",
    "tsDateLastUpdate",
    "tsLastUpdatedBy",
    "learnerName2",
    "learnerName3",
    "nameDiacritics",
    "otherHomeLanguage",
    "otherLanguage",
    "otherPreferredLanguage",
    "otherTeachingLanguage",
    "luritsStatus",
    "secondName",
    "pastelCode",
    "busRouteId",
    "subjHL",
    "subjFAL",
    "prevSName",
    "positionFamilyF",
    "reasonForNoIDNo",
    "grantCReg",
    "grantCReceive",
    "grantCNo",
    "grant4Reg",
    "grant4Receive",
    "grant4No",
    "grant5Reg",
    "grant5Receive",
    "grant5No",
    "grant9Reg",
    "grant9Receive",
    "grant9No",
    "clinicName",
    "clinicAccRef",
    "clinicTelCode",
    "clinicTel",
    "subjLOI",
    "hseID",
    "phaseYears",
    "progressedToGrade",
    "studyPermit",
    "studyPermitNo",
    "studyPermitDate",
    "idNoNotValidating",
    "oldMentor",
    "lsenAnaInc",
    "lsenAnaHL",
    "lsenAnaFAL",
    "previousPlacementofSchoolYear",
    "foreignIDType",
    "ageRuleOverwritten",
    "reasonForNoForeignID",
    "farmProj",
    "road2Health",
    "immunizationCard",
    "iceName",
    "iceSurname",
    "iceRelation"
})
@XmlRootElement(name = "Learner_Info")
public class LearnerInfo {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID", required = true)
    protected String learnerID;
    @XmlElement(name = "AccessionNo", required = true)
    protected String accessionNo;
    @XmlElement(name = "TheDate", required = true)
    protected String theDate;
    @XmlElement(name = "SName")
    protected String sName;
    @XmlElement(name = "FName")
    protected String fName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "IDNo")
    protected String idNo;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "HomeLanguage")
    protected Integer homeLanguage;
    @XmlElement(name = "InstructionLanguage")
    protected Integer instructionLanguage;
    @XmlElement(name = "PreferredLanguage")
    protected Integer preferredLanguage;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "AddressCode")
    protected String addressCode;
    @XmlElement(name = "Guardian")
    protected String guardian;
    @XmlElement(name = "Tel1Code")
    protected String tel1Code;
    @XmlElement(name = "Tel1")
    protected String tel1;
    @XmlElement(name = "Tel2Code")
    protected String tel2Code;
    @XmlElement(name = "Tel2")
    protected String tel2;
    @XmlElement(name = "Tel3Code")
    protected String tel3Code;
    @XmlElement(name = "Tel3")
    protected String tel3;
    @XmlElement(name = "Grade")
    protected int grade;
    @XmlElement(name = "Class")
    protected Integer clazz;
    @XmlElement(name = "GradeYears")
    protected Integer gradeYears;
    @XmlElement(name = "PreviousSchool")
    protected String previousSchool;
    @XmlElement(name = "SchoolAddress1")
    protected String schoolAddress1;
    @XmlElement(name = "SchoolAddress2")
    protected String schoolAddress2;
    @XmlElement(name = "SchoolAddress3")
    protected String schoolAddress3;
    @XmlElement(name = "SchoolCode")
    protected String schoolCode;
    @XmlElement(name = "Religion")
    protected String religion;
    @XmlElement(name = "Disciplinary")
    protected String disciplinary;
    @XmlElement(name = "MedicalConditions")
    protected String medicalConditions;
    @XmlElement(name = "DrInfo")
    protected String drInfo;
    @XmlElement(name = "MedicalAidName")
    protected String medicalAidName;
    @XmlElement(name = "MedicalAidNo")
    protected String medicalAidNo;
    @XmlElement(name = "MedicalAidMember")
    protected String medicalAidMember;
    @XmlElement(name = "Guidance")
    protected String guidance;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "Citizenship")
    protected String citizenship;
    @XmlElement(name = "Provincial")
    protected String provincial;
    @XmlElement(name = "SchoolProvince")
    protected String schoolProvince;
    @XmlElement(name = "PreviousSchoolProvince")
    protected String previousSchoolProvince;
    @XmlElement(name = "AssignClass")
    protected boolean assignClass;
    @XmlElement(name = "PhysProvince")
    protected String physProvince;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "PreviousPlacementofSchool")
    protected Integer previousPlacementofSchool;
    @XmlElement(name = "Transport")
    protected Integer transport;
    @XmlElement(name = "LSENDisabilities")
    protected Integer lsenDisabilities;
    @XmlElement(name = "DateLeft")
    protected String dateLeft;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "LSENStatus")
    protected Integer lsenStatus;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Boarder")
    protected Integer boarder;
    @XmlElement(name = "CountryResidence")
    protected String countryResidence;
    @XmlElement(name = "ProvinceResidence")
    protected String provinceResidence;
    @XmlElement(name = "FirstProvince")
    protected Integer firstProvince;
    @XmlElement(name = "DeceasedParent")
    protected Integer deceasedParent;
    @XmlElement(name = "SGRegister")
    protected Integer sgRegister;
    @XmlElement(name = "SGReceive")
    protected Integer sgReceive;
    @XmlElement(name = "DrName")
    protected String drName;
    @XmlElement(name = "DrTel")
    protected String drTel;
    @XmlElement(name = "Dexterity")
    protected Integer dexterity;
    @XmlElement(name = "PSNP")
    protected Integer psnp;
    @XmlElement(name = "NoFamily")
    protected Integer noFamily;
    @XmlElement(name = "PositionFamily")
    protected String positionFamily;
    @XmlElement(name = "ReportLanguage")
    protected Integer reportLanguage;
    @XmlElement(name = "ForeignID")
    protected String foreignID;
    @XmlElement(name = "LearnerComment")
    protected String learnerComment;
    @XmlElement(name = "PhotoName")
    protected String photoName;
    @XmlElement(name = "GradeEntered")
    protected Integer gradeEntered;
    @XmlElement(name = "GradeLeft")
    protected Integer gradeLeft;
    @XmlElement(name = "BoarderNumber")
    protected String boarderNumber;
    @XmlElement(name = "BoarderHostel")
    protected String boarderHostel;
    @XmlElement(name = "ThirdName")
    protected String thirdName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "SocialGrantNo")
    protected String socialGrantNo;
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
    @XmlElement(name = "LuritsNumber")
    protected Double luritsNumber;
    @XmlElement(name = "TSSentfileName")
    protected String tsSentfileName;
    @XmlElement(name = "TSDateLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsDateLastUpdate;
    @XmlElement(name = "TSLastUpdatedBy")
    protected String tsLastUpdatedBy;
    @XmlElement(name = "LearnerName2")
    protected String learnerName2;
    @XmlElement(name = "LearnerName3")
    protected String learnerName3;
    @XmlElement(name = "NameDiacritics")
    protected String nameDiacritics;
    @XmlElement(name = "OtherHomeLanguage")
    protected String otherHomeLanguage;
    @XmlElement(name = "OtherLanguage")
    protected String otherLanguage;
    @XmlElement(name = "OtherPreferredLanguage")
    protected String otherPreferredLanguage;
    @XmlElement(name = "OtherTeachingLanguage")
    protected String otherTeachingLanguage;
    @XmlElement(name = "LuritsStatus")
    protected String luritsStatus;
    @XmlElement(name = "SecondName")
    protected String secondName;
    @XmlElement(name = "PastelCode")
    protected String pastelCode;
    @XmlElement(name = "BusRouteId")
    protected Integer busRouteId;
    @XmlElement(name = "Subj_HL")
    protected String subjHL;
    @XmlElement(name = "Subj_FAL")
    protected String subjFAL;
    @XmlElement(name = "PrevSName")
    protected String prevSName;
    @XmlElement(name = "PositionFamilyF")
    protected String positionFamilyF;
    @XmlElement(name = "ReasonForNoIDNo")
    @XmlSchemaType(name = "unsignedByte")
    protected Short reasonForNoIDNo;
    @XmlElement(name = "GrantCReg")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grantCReg;
    @XmlElement(name = "GrantCReceive")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grantCReceive;
    @XmlElement(name = "GrantCNo")
    protected String grantCNo;
    @XmlElement(name = "Grant4Reg")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant4Reg;
    @XmlElement(name = "Grant4Receive")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant4Receive;
    @XmlElement(name = "Grant4No")
    protected String grant4No;
    @XmlElement(name = "Grant5Reg")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant5Reg;
    @XmlElement(name = "Grant5Receive")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant5Receive;
    @XmlElement(name = "Grant5No")
    protected String grant5No;
    @XmlElement(name = "Grant9Reg")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant9Reg;
    @XmlElement(name = "Grant9Receive")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grant9Receive;
    @XmlElement(name = "Grant9No")
    protected String grant9No;
    @XmlElement(name = "ClinicName")
    protected String clinicName;
    @XmlElement(name = "ClinicAccRef")
    protected String clinicAccRef;
    @XmlElement(name = "ClinicTelCode")
    protected String clinicTelCode;
    @XmlElement(name = "ClinicTel")
    protected String clinicTel;
    @XmlElement(name = "Subj_LOI")
    protected String subjLOI;
    @XmlElement(name = "HseID")
    protected Integer hseID;
    @XmlElement(name = "PhaseYears")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseYears;
    @XmlElement(name = "ProgressedToGrade")
    protected boolean progressedToGrade;
    @XmlElement(name = "StudyPermit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short studyPermit;
    @XmlElement(name = "StudyPermitNo")
    protected String studyPermitNo;
    @XmlElement(name = "StudyPermitDate")
    protected String studyPermitDate;
    @XmlElement(name = "IDNoNotValidating")
    protected String idNoNotValidating;
    @XmlElement(name = "OldMentor")
    protected String oldMentor;
    @XmlElement(name = "LSENAnaInc")
    protected boolean lsenAnaInc;
    @XmlElement(name = "LSENAnaHL")
    protected String lsenAnaHL;
    @XmlElement(name = "LSENAnaFAL")
    protected String lsenAnaFAL;
    @XmlElement(name = "PreviousPlacementofSchoolYear")
    protected Integer previousPlacementofSchoolYear;
    @XmlElement(name = "ForeignIDType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short foreignIDType;
    @XmlElement(name = "AgeRuleOverwritten")
    protected boolean ageRuleOverwritten;
    @XmlElement(name = "ReasonForNoForeignID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short reasonForNoForeignID;
    @XmlElement(name = "FarmProj")
    protected String farmProj;
    @XmlElement(name = "Road2Health")
    protected boolean road2Health;
    @XmlElement(name = "ImmunizationCard")
    protected boolean immunizationCard;
    @XmlElement(name = "ICEName")
    protected String iceName;
    @XmlElement(name = "ICESurname")
    protected String iceSurname;
    @XmlElement(name = "ICERelation")
    protected String iceRelation;

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
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerID(String value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the accessionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNo() {
        return accessionNo;
    }

    /**
     * Sets the value of the accessionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNo(String value) {
        this.accessionNo = value;
    }

    /**
     * Gets the value of the theDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheDate() {
        return theDate;
    }

    /**
     * Sets the value of the theDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheDate(String value) {
        this.theDate = value;
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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
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
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
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
     * Gets the value of the homeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHomeLanguage() {
        return homeLanguage;
    }

    /**
     * Sets the value of the homeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHomeLanguage(Integer value) {
        this.homeLanguage = value;
    }

    /**
     * Gets the value of the instructionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstructionLanguage() {
        return instructionLanguage;
    }

    /**
     * Sets the value of the instructionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstructionLanguage(Integer value) {
        this.instructionLanguage = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreferredLanguage(Integer value) {
        this.preferredLanguage = value;
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
     * Gets the value of the guardian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuardian() {
        return guardian;
    }

    /**
     * Sets the value of the guardian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuardian(String value) {
        this.guardian = value;
    }

    /**
     * Gets the value of the tel1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1Code() {
        return tel1Code;
    }

    /**
     * Sets the value of the tel1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1Code(String value) {
        this.tel1Code = value;
    }

    /**
     * Gets the value of the tel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * Sets the value of the tel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1(String value) {
        this.tel1 = value;
    }

    /**
     * Gets the value of the tel2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel2Code() {
        return tel2Code;
    }

    /**
     * Sets the value of the tel2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel2Code(String value) {
        this.tel2Code = value;
    }

    /**
     * Gets the value of the tel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * Sets the value of the tel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel2(String value) {
        this.tel2 = value;
    }

    /**
     * Gets the value of the tel3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel3Code() {
        return tel3Code;
    }

    /**
     * Sets the value of the tel3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel3Code(String value) {
        this.tel3Code = value;
    }

    /**
     * Gets the value of the tel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel3() {
        return tel3;
    }

    /**
     * Sets the value of the tel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel3(String value) {
        this.tel3 = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     */
    public void setGrade(int value) {
        this.grade = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClazz(Integer value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the gradeYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGradeYears() {
        return gradeYears;
    }

    /**
     * Sets the value of the gradeYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradeYears(Integer value) {
        this.gradeYears = value;
    }

    /**
     * Gets the value of the previousSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSchool() {
        return previousSchool;
    }

    /**
     * Sets the value of the previousSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSchool(String value) {
        this.previousSchool = value;
    }

    /**
     * Gets the value of the schoolAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAddress1() {
        return schoolAddress1;
    }

    /**
     * Sets the value of the schoolAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAddress1(String value) {
        this.schoolAddress1 = value;
    }

    /**
     * Gets the value of the schoolAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAddress2() {
        return schoolAddress2;
    }

    /**
     * Sets the value of the schoolAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAddress2(String value) {
        this.schoolAddress2 = value;
    }

    /**
     * Gets the value of the schoolAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAddress3() {
        return schoolAddress3;
    }

    /**
     * Sets the value of the schoolAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAddress3(String value) {
        this.schoolAddress3 = value;
    }

    /**
     * Gets the value of the schoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCode() {
        return schoolCode;
    }

    /**
     * Sets the value of the schoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCode(String value) {
        this.schoolCode = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Gets the value of the disciplinary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinary() {
        return disciplinary;
    }

    /**
     * Sets the value of the disciplinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinary(String value) {
        this.disciplinary = value;
    }

    /**
     * Gets the value of the medicalConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalConditions() {
        return medicalConditions;
    }

    /**
     * Sets the value of the medicalConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalConditions(String value) {
        this.medicalConditions = value;
    }

    /**
     * Gets the value of the drInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrInfo() {
        return drInfo;
    }

    /**
     * Sets the value of the drInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrInfo(String value) {
        this.drInfo = value;
    }

    /**
     * Gets the value of the medicalAidName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalAidName() {
        return medicalAidName;
    }

    /**
     * Sets the value of the medicalAidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalAidName(String value) {
        this.medicalAidName = value;
    }

    /**
     * Gets the value of the medicalAidNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalAidNo() {
        return medicalAidNo;
    }

    /**
     * Sets the value of the medicalAidNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalAidNo(String value) {
        this.medicalAidNo = value;
    }

    /**
     * Gets the value of the medicalAidMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalAidMember() {
        return medicalAidMember;
    }

    /**
     * Sets the value of the medicalAidMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalAidMember(String value) {
        this.medicalAidMember = value;
    }

    /**
     * Gets the value of the guidance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidance() {
        return guidance;
    }

    /**
     * Sets the value of the guidance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidance(String value) {
        this.guidance = value;
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
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the provincial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincial() {
        return provincial;
    }

    /**
     * Sets the value of the provincial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincial(String value) {
        this.provincial = value;
    }

    /**
     * Gets the value of the schoolProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolProvince() {
        return schoolProvince;
    }

    /**
     * Sets the value of the schoolProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolProvince(String value) {
        this.schoolProvince = value;
    }

    /**
     * Gets the value of the previousSchoolProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSchoolProvince() {
        return previousSchoolProvince;
    }

    /**
     * Sets the value of the previousSchoolProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSchoolProvince(String value) {
        this.previousSchoolProvince = value;
    }

    /**
     * Gets the value of the assignClass property.
     * 
     */
    public boolean isAssignClass() {
        return assignClass;
    }

    /**
     * Sets the value of the assignClass property.
     * 
     */
    public void setAssignClass(boolean value) {
        this.assignClass = value;
    }

    /**
     * Gets the value of the physProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysProvince() {
        return physProvince;
    }

    /**
     * Sets the value of the physProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysProvince(String value) {
        this.physProvince = value;
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
     * Gets the value of the previousPlacementofSchool property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousPlacementofSchool() {
        return previousPlacementofSchool;
    }

    /**
     * Sets the value of the previousPlacementofSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousPlacementofSchool(Integer value) {
        this.previousPlacementofSchool = value;
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
     * Gets the value of the lsenDisabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLSENDisabilities() {
        return lsenDisabilities;
    }

    /**
     * Sets the value of the lsenDisabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLSENDisabilities(Integer value) {
        this.lsenDisabilities = value;
    }

    /**
     * Gets the value of the dateLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLeft() {
        return dateLeft;
    }

    /**
     * Sets the value of the dateLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLeft(String value) {
        this.dateLeft = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the lsenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLSENStatus() {
        return lsenStatus;
    }

    /**
     * Sets the value of the lsenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLSENStatus(Integer value) {
        this.lsenStatus = value;
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
     * Gets the value of the boarder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoarder() {
        return boarder;
    }

    /**
     * Sets the value of the boarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoarder(Integer value) {
        this.boarder = value;
    }

    /**
     * Gets the value of the countryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryResidence() {
        return countryResidence;
    }

    /**
     * Sets the value of the countryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryResidence(String value) {
        this.countryResidence = value;
    }

    /**
     * Gets the value of the provinceResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceResidence() {
        return provinceResidence;
    }

    /**
     * Sets the value of the provinceResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceResidence(String value) {
        this.provinceResidence = value;
    }

    /**
     * Gets the value of the firstProvince property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstProvince() {
        return firstProvince;
    }

    /**
     * Sets the value of the firstProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstProvince(Integer value) {
        this.firstProvince = value;
    }

    /**
     * Gets the value of the deceasedParent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeceasedParent() {
        return deceasedParent;
    }

    /**
     * Sets the value of the deceasedParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeceasedParent(Integer value) {
        this.deceasedParent = value;
    }

    /**
     * Gets the value of the sgRegister property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSGRegister() {
        return sgRegister;
    }

    /**
     * Sets the value of the sgRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSGRegister(Integer value) {
        this.sgRegister = value;
    }

    /**
     * Gets the value of the sgReceive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSGReceive() {
        return sgReceive;
    }

    /**
     * Sets the value of the sgReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSGReceive(Integer value) {
        this.sgReceive = value;
    }

    /**
     * Gets the value of the drName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrName() {
        return drName;
    }

    /**
     * Sets the value of the drName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrName(String value) {
        this.drName = value;
    }

    /**
     * Gets the value of the drTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrTel() {
        return drTel;
    }

    /**
     * Sets the value of the drTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrTel(String value) {
        this.drTel = value;
    }

    /**
     * Gets the value of the dexterity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDexterity() {
        return dexterity;
    }

    /**
     * Sets the value of the dexterity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDexterity(Integer value) {
        this.dexterity = value;
    }

    /**
     * Gets the value of the psnp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSNP() {
        return psnp;
    }

    /**
     * Sets the value of the psnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSNP(Integer value) {
        this.psnp = value;
    }

    /**
     * Gets the value of the noFamily property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoFamily() {
        return noFamily;
    }

    /**
     * Sets the value of the noFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoFamily(Integer value) {
        this.noFamily = value;
    }

    /**
     * Gets the value of the positionFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionFamily() {
        return positionFamily;
    }

    /**
     * Sets the value of the positionFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionFamily(String value) {
        this.positionFamily = value;
    }

    /**
     * Gets the value of the reportLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportLanguage() {
        return reportLanguage;
    }

    /**
     * Sets the value of the reportLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportLanguage(Integer value) {
        this.reportLanguage = value;
    }

    /**
     * Gets the value of the foreignID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignID() {
        return foreignID;
    }

    /**
     * Sets the value of the foreignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignID(String value) {
        this.foreignID = value;
    }

    /**
     * Gets the value of the learnerComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerComment() {
        return learnerComment;
    }

    /**
     * Sets the value of the learnerComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerComment(String value) {
        this.learnerComment = value;
    }

    /**
     * Gets the value of the photoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoName() {
        return photoName;
    }

    /**
     * Sets the value of the photoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoName(String value) {
        this.photoName = value;
    }

    /**
     * Gets the value of the gradeEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGradeEntered() {
        return gradeEntered;
    }

    /**
     * Sets the value of the gradeEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradeEntered(Integer value) {
        this.gradeEntered = value;
    }

    /**
     * Gets the value of the gradeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGradeLeft() {
        return gradeLeft;
    }

    /**
     * Sets the value of the gradeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradeLeft(Integer value) {
        this.gradeLeft = value;
    }

    /**
     * Gets the value of the boarderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoarderNumber() {
        return boarderNumber;
    }

    /**
     * Sets the value of the boarderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoarderNumber(String value) {
        this.boarderNumber = value;
    }

    /**
     * Gets the value of the boarderHostel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoarderHostel() {
        return boarderHostel;
    }

    /**
     * Sets the value of the boarderHostel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoarderHostel(String value) {
        this.boarderHostel = value;
    }

    /**
     * Gets the value of the thirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Sets the value of the thirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
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
     * Gets the value of the socialGrantNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialGrantNo() {
        return socialGrantNo;
    }

    /**
     * Sets the value of the socialGrantNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialGrantNo(String value) {
        this.socialGrantNo = value;
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
     * Gets the value of the luritsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuritsNumber() {
        return luritsNumber;
    }

    /**
     * Sets the value of the luritsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuritsNumber(Double value) {
        this.luritsNumber = value;
    }

    /**
     * Gets the value of the tsSentfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSentfileName() {
        return tsSentfileName;
    }

    /**
     * Sets the value of the tsSentfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSentfileName(String value) {
        this.tsSentfileName = value;
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
     * Gets the value of the learnerName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerName2() {
        return learnerName2;
    }

    /**
     * Sets the value of the learnerName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerName2(String value) {
        this.learnerName2 = value;
    }

    /**
     * Gets the value of the learnerName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerName3() {
        return learnerName3;
    }

    /**
     * Sets the value of the learnerName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerName3(String value) {
        this.learnerName3 = value;
    }

    /**
     * Gets the value of the nameDiacritics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDiacritics() {
        return nameDiacritics;
    }

    /**
     * Sets the value of the nameDiacritics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDiacritics(String value) {
        this.nameDiacritics = value;
    }

    /**
     * Gets the value of the otherHomeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherHomeLanguage() {
        return otherHomeLanguage;
    }

    /**
     * Sets the value of the otherHomeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherHomeLanguage(String value) {
        this.otherHomeLanguage = value;
    }

    /**
     * Gets the value of the otherLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLanguage() {
        return otherLanguage;
    }

    /**
     * Sets the value of the otherLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLanguage(String value) {
        this.otherLanguage = value;
    }

    /**
     * Gets the value of the otherPreferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPreferredLanguage() {
        return otherPreferredLanguage;
    }

    /**
     * Sets the value of the otherPreferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPreferredLanguage(String value) {
        this.otherPreferredLanguage = value;
    }

    /**
     * Gets the value of the otherTeachingLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTeachingLanguage() {
        return otherTeachingLanguage;
    }

    /**
     * Sets the value of the otherTeachingLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTeachingLanguage(String value) {
        this.otherTeachingLanguage = value;
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

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the pastelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastelCode() {
        return pastelCode;
    }

    /**
     * Sets the value of the pastelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastelCode(String value) {
        this.pastelCode = value;
    }

    /**
     * Gets the value of the busRouteId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusRouteId() {
        return busRouteId;
    }

    /**
     * Sets the value of the busRouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusRouteId(Integer value) {
        this.busRouteId = value;
    }

    /**
     * Gets the value of the subjHL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjHL() {
        return subjHL;
    }

    /**
     * Sets the value of the subjHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjHL(String value) {
        this.subjHL = value;
    }

    /**
     * Gets the value of the subjFAL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjFAL() {
        return subjFAL;
    }

    /**
     * Sets the value of the subjFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjFAL(String value) {
        this.subjFAL = value;
    }

    /**
     * Gets the value of the prevSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevSName() {
        return prevSName;
    }

    /**
     * Sets the value of the prevSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevSName(String value) {
        this.prevSName = value;
    }

    /**
     * Gets the value of the positionFamilyF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionFamilyF() {
        return positionFamilyF;
    }

    /**
     * Sets the value of the positionFamilyF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionFamilyF(String value) {
        this.positionFamilyF = value;
    }

    /**
     * Gets the value of the reasonForNoIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReasonForNoIDNo() {
        return reasonForNoIDNo;
    }

    /**
     * Sets the value of the reasonForNoIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReasonForNoIDNo(Short value) {
        this.reasonForNoIDNo = value;
    }

    /**
     * Gets the value of the grantCReg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrantCReg() {
        return grantCReg;
    }

    /**
     * Sets the value of the grantCReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrantCReg(Short value) {
        this.grantCReg = value;
    }

    /**
     * Gets the value of the grantCReceive property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrantCReceive() {
        return grantCReceive;
    }

    /**
     * Sets the value of the grantCReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrantCReceive(Short value) {
        this.grantCReceive = value;
    }

    /**
     * Gets the value of the grantCNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantCNo() {
        return grantCNo;
    }

    /**
     * Sets the value of the grantCNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantCNo(String value) {
        this.grantCNo = value;
    }

    /**
     * Gets the value of the grant4Reg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant4Reg() {
        return grant4Reg;
    }

    /**
     * Sets the value of the grant4Reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant4Reg(Short value) {
        this.grant4Reg = value;
    }

    /**
     * Gets the value of the grant4Receive property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant4Receive() {
        return grant4Receive;
    }

    /**
     * Sets the value of the grant4Receive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant4Receive(Short value) {
        this.grant4Receive = value;
    }

    /**
     * Gets the value of the grant4No property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrant4No() {
        return grant4No;
    }

    /**
     * Sets the value of the grant4No property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrant4No(String value) {
        this.grant4No = value;
    }

    /**
     * Gets the value of the grant5Reg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant5Reg() {
        return grant5Reg;
    }

    /**
     * Sets the value of the grant5Reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant5Reg(Short value) {
        this.grant5Reg = value;
    }

    /**
     * Gets the value of the grant5Receive property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant5Receive() {
        return grant5Receive;
    }

    /**
     * Sets the value of the grant5Receive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant5Receive(Short value) {
        this.grant5Receive = value;
    }

    /**
     * Gets the value of the grant5No property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrant5No() {
        return grant5No;
    }

    /**
     * Sets the value of the grant5No property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrant5No(String value) {
        this.grant5No = value;
    }

    /**
     * Gets the value of the grant9Reg property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant9Reg() {
        return grant9Reg;
    }

    /**
     * Sets the value of the grant9Reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant9Reg(Short value) {
        this.grant9Reg = value;
    }

    /**
     * Gets the value of the grant9Receive property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrant9Receive() {
        return grant9Receive;
    }

    /**
     * Sets the value of the grant9Receive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrant9Receive(Short value) {
        this.grant9Receive = value;
    }

    /**
     * Gets the value of the grant9No property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrant9No() {
        return grant9No;
    }

    /**
     * Sets the value of the grant9No property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrant9No(String value) {
        this.grant9No = value;
    }

    /**
     * Gets the value of the clinicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicName() {
        return clinicName;
    }

    /**
     * Sets the value of the clinicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicName(String value) {
        this.clinicName = value;
    }

    /**
     * Gets the value of the clinicAccRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicAccRef() {
        return clinicAccRef;
    }

    /**
     * Sets the value of the clinicAccRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicAccRef(String value) {
        this.clinicAccRef = value;
    }

    /**
     * Gets the value of the clinicTelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicTelCode() {
        return clinicTelCode;
    }

    /**
     * Sets the value of the clinicTelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicTelCode(String value) {
        this.clinicTelCode = value;
    }

    /**
     * Gets the value of the clinicTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicTel() {
        return clinicTel;
    }

    /**
     * Sets the value of the clinicTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicTel(String value) {
        this.clinicTel = value;
    }

    /**
     * Gets the value of the subjLOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjLOI() {
        return subjLOI;
    }

    /**
     * Sets the value of the subjLOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjLOI(String value) {
        this.subjLOI = value;
    }

    /**
     * Gets the value of the hseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHseID() {
        return hseID;
    }

    /**
     * Sets the value of the hseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHseID(Integer value) {
        this.hseID = value;
    }

    /**
     * Gets the value of the phaseYears property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseYears() {
        return phaseYears;
    }

    /**
     * Sets the value of the phaseYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseYears(Short value) {
        this.phaseYears = value;
    }

    /**
     * Gets the value of the progressedToGrade property.
     * 
     */
    public boolean isProgressedToGrade() {
        return progressedToGrade;
    }

    /**
     * Sets the value of the progressedToGrade property.
     * 
     */
    public void setProgressedToGrade(boolean value) {
        this.progressedToGrade = value;
    }

    /**
     * Gets the value of the studyPermit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStudyPermit() {
        return studyPermit;
    }

    /**
     * Sets the value of the studyPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStudyPermit(Short value) {
        this.studyPermit = value;
    }

    /**
     * Gets the value of the studyPermitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyPermitNo() {
        return studyPermitNo;
    }

    /**
     * Sets the value of the studyPermitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyPermitNo(String value) {
        this.studyPermitNo = value;
    }

    /**
     * Gets the value of the studyPermitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyPermitDate() {
        return studyPermitDate;
    }

    /**
     * Sets the value of the studyPermitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyPermitDate(String value) {
        this.studyPermitDate = value;
    }

    /**
     * Gets the value of the idNoNotValidating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNoNotValidating() {
        return idNoNotValidating;
    }

    /**
     * Sets the value of the idNoNotValidating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNoNotValidating(String value) {
        this.idNoNotValidating = value;
    }

    /**
     * Gets the value of the oldMentor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMentor() {
        return oldMentor;
    }

    /**
     * Sets the value of the oldMentor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMentor(String value) {
        this.oldMentor = value;
    }

    /**
     * Gets the value of the lsenAnaInc property.
     * 
     */
    public boolean isLSENAnaInc() {
        return lsenAnaInc;
    }

    /**
     * Sets the value of the lsenAnaInc property.
     * 
     */
    public void setLSENAnaInc(boolean value) {
        this.lsenAnaInc = value;
    }

    /**
     * Gets the value of the lsenAnaHL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSENAnaHL() {
        return lsenAnaHL;
    }

    /**
     * Sets the value of the lsenAnaHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSENAnaHL(String value) {
        this.lsenAnaHL = value;
    }

    /**
     * Gets the value of the lsenAnaFAL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSENAnaFAL() {
        return lsenAnaFAL;
    }

    /**
     * Sets the value of the lsenAnaFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSENAnaFAL(String value) {
        this.lsenAnaFAL = value;
    }

    /**
     * Gets the value of the previousPlacementofSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousPlacementofSchoolYear() {
        return previousPlacementofSchoolYear;
    }

    /**
     * Sets the value of the previousPlacementofSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousPlacementofSchoolYear(Integer value) {
        this.previousPlacementofSchoolYear = value;
    }

    /**
     * Gets the value of the foreignIDType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getForeignIDType() {
        return foreignIDType;
    }

    /**
     * Sets the value of the foreignIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setForeignIDType(Short value) {
        this.foreignIDType = value;
    }

    /**
     * Gets the value of the ageRuleOverwritten property.
     * 
     */
    public boolean isAgeRuleOverwritten() {
        return ageRuleOverwritten;
    }

    /**
     * Sets the value of the ageRuleOverwritten property.
     * 
     */
    public void setAgeRuleOverwritten(boolean value) {
        this.ageRuleOverwritten = value;
    }

    /**
     * Gets the value of the reasonForNoForeignID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReasonForNoForeignID() {
        return reasonForNoForeignID;
    }

    /**
     * Sets the value of the reasonForNoForeignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReasonForNoForeignID(Short value) {
        this.reasonForNoForeignID = value;
    }

    /**
     * Gets the value of the farmProj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmProj() {
        return farmProj;
    }

    /**
     * Sets the value of the farmProj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmProj(String value) {
        this.farmProj = value;
    }

    /**
     * Gets the value of the road2Health property.
     * 
     */
    public boolean isRoad2Health() {
        return road2Health;
    }

    /**
     * Sets the value of the road2Health property.
     * 
     */
    public void setRoad2Health(boolean value) {
        this.road2Health = value;
    }

    /**
     * Gets the value of the immunizationCard property.
     * 
     */
    public boolean isImmunizationCard() {
        return immunizationCard;
    }

    /**
     * Sets the value of the immunizationCard property.
     * 
     */
    public void setImmunizationCard(boolean value) {
        this.immunizationCard = value;
    }

    /**
     * Gets the value of the iceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICEName() {
        return iceName;
    }

    /**
     * Sets the value of the iceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICEName(String value) {
        this.iceName = value;
    }

    /**
     * Gets the value of the iceSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICESurname() {
        return iceSurname;
    }

    /**
     * Sets the value of the iceSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICESurname(String value) {
        this.iceSurname = value;
    }

    /**
     * Gets the value of the iceRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICERelation() {
        return iceRelation;
    }

    /**
     * Sets the value of the iceRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICERelation(String value) {
        this.iceRelation = value;
    }

}
