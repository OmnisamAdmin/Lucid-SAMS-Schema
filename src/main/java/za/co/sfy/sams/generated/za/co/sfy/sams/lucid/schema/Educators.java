
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
 *         &lt;element name="EdID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
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
 *         &lt;element name="Key" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
 *               &lt;maxLength value="30"/&gt;
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
 *         &lt;element name="IDNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DepCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Subsidies" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Spouse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Licenses" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Academic" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Institution" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Skills" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateJoined" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ManagementPosition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Professional" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RegisterClass" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersalNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Homelanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_x0032_ndlanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EducatorType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaritalStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
 *         &lt;element name="Actual" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Acting" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NatureofApointment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remuneration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Qualification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QualificationType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreGradeR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Secondary" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GradeR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Primary" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LSEN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AcademicDegree" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProfessionalDegree" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TechnicalCerDip" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProfessionalDiploma" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="YearsExperience" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Time" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructionLanguage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SACE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WCType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICTSkill" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICTUsage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Country" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Photoname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Intermediate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LuritsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *         &lt;element name="KinSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KinFName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SACitizen" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="WorkPermit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="WorkPermitNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WorkPermitDate" minOccurs="0"&gt;
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
 *         &lt;element name="CompUsage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="45"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonForNoSACE" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="UnionName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnionNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnionName2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnionNo2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnionNameX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnionNoX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
 *         &lt;element name="ForeignID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Bursar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "edID",
    "fName",
    "sName",
    "initials",
    "key",
    "address1",
    "address2",
    "address3",
    "code",
    "tel1Code",
    "tel1",
    "birthDate",
    "idNumber",
    "depCode",
    "subsidies",
    "medName",
    "medNo",
    "spouse",
    "eNumber",
    "licenses",
    "taxNo",
    "academic",
    "institution",
    "skills",
    "dateJoined",
    "managementPosition",
    "postLevel",
    "tel2Code",
    "tel2",
    "professional",
    "registerClass",
    "persalNumber",
    "homelanguage",
    "x0032Ndlanguage",
    "race",
    "title",
    "gender",
    "educatorType",
    "maritalStatus",
    "disabilityStatus",
    "actual",
    "acting",
    "natureofApointment",
    "remuneration",
    "qualification",
    "qualificationType",
    "preGradeR",
    "secondary",
    "gradeR",
    "primary",
    "lsen",
    "academicDegree",
    "professionalDegree",
    "technicalCerDip",
    "professionalDiploma",
    "yearsExperience",
    "time",
    "instructionLanguage",
    "status",
    "sace",
    "wcType",
    "emailAddress",
    "ictSkill",
    "ictUsage",
    "country",
    "photoname",
    "intermediate",
    "luritsNumber",
    "tsTransactionCategory",
    "tsStatusFlag",
    "tsReportStatusFlag",
    "tsReasonCode",
    "luritsIndicator",
    "luritsFlag",
    "tsSentFileName",
    "tsDateLastUpdate",
    "tsLastUpdatedBy",
    "luritsStatus",
    "kinSName",
    "kinFName",
    "saCitizen",
    "workPermit",
    "workPermitNo",
    "workPermitDate",
    "prevSName",
    "compUsage",
    "reasonForNoSACE",
    "unionName",
    "unionNo",
    "unionName2",
    "unionNo2",
    "unionNameX",
    "unionNoX",
    "religion",
    "foreignID",
    "bursar"
})
@XmlRootElement(name = "Educators")
public class Educators {

    @XmlElement(name = "EdID")
    protected int edID;
    @XmlElement(name = "FName")
    protected String fName;
    @XmlElement(name = "SName", required = true)
    protected String sName;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Tel1Code")
    protected String tel1Code;
    @XmlElement(name = "Tel1")
    protected String tel1;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "DepCode")
    protected String depCode;
    @XmlElement(name = "Subsidies")
    protected String subsidies;
    @XmlElement(name = "MedName")
    protected String medName;
    @XmlElement(name = "MedNo")
    protected String medNo;
    @XmlElement(name = "Spouse")
    protected String spouse;
    @XmlElement(name = "ENumber")
    protected String eNumber;
    @XmlElement(name = "Licenses")
    protected String licenses;
    @XmlElement(name = "TaxNo")
    protected String taxNo;
    @XmlElement(name = "Academic")
    protected String academic;
    @XmlElement(name = "Institution")
    protected String institution;
    @XmlElement(name = "Skills")
    protected String skills;
    @XmlElement(name = "DateJoined")
    protected String dateJoined;
    @XmlElement(name = "ManagementPosition")
    protected String managementPosition;
    @XmlElement(name = "PostLevel")
    protected String postLevel;
    @XmlElement(name = "Tel2Code")
    protected String tel2Code;
    @XmlElement(name = "Tel2")
    protected String tel2;
    @XmlElement(name = "Professional")
    protected String professional;
    @XmlElement(name = "RegisterClass")
    protected String registerClass;
    @XmlElement(name = "PersalNumber")
    protected String persalNumber;
    @XmlElement(name = "Homelanguage")
    protected String homelanguage;
    @XmlElement(name = "_x0032_ndlanguage")
    protected String x0032Ndlanguage;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "EducatorType")
    protected String educatorType;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "DisabilityStatus")
    protected String disabilityStatus;
    @XmlElement(name = "Actual")
    protected String actual;
    @XmlElement(name = "Acting")
    protected String acting;
    @XmlElement(name = "NatureofApointment")
    protected String natureofApointment;
    @XmlElement(name = "Remuneration")
    protected String remuneration;
    @XmlElement(name = "Qualification")
    protected String qualification;
    @XmlElement(name = "QualificationType")
    protected String qualificationType;
    @XmlElement(name = "PreGradeR")
    protected String preGradeR;
    @XmlElement(name = "Secondary")
    protected String secondary;
    @XmlElement(name = "GradeR")
    protected String gradeR;
    @XmlElement(name = "Primary")
    protected String primary;
    @XmlElement(name = "LSEN")
    protected String lsen;
    @XmlElement(name = "AcademicDegree")
    protected String academicDegree;
    @XmlElement(name = "ProfessionalDegree")
    protected String professionalDegree;
    @XmlElement(name = "TechnicalCerDip")
    protected String technicalCerDip;
    @XmlElement(name = "ProfessionalDiploma")
    protected String professionalDiploma;
    @XmlElement(name = "YearsExperience")
    protected Integer yearsExperience;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "InstructionLanguage")
    protected String instructionLanguage;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SACE")
    protected String sace;
    @XmlElement(name = "WCType")
    protected Integer wcType;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "ICTSkill")
    protected String ictSkill;
    @XmlElement(name = "ICTUsage")
    protected String ictUsage;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Photoname")
    protected String photoname;
    @XmlElement(name = "Intermediate")
    protected String intermediate;
    @XmlElement(name = "LuritsNumber")
    protected Integer luritsNumber;
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
    @XmlElement(name = "KinSName")
    protected String kinSName;
    @XmlElement(name = "KinFName")
    protected String kinFName;
    @XmlElement(name = "SACitizen")
    @XmlSchemaType(name = "unsignedByte")
    protected Short saCitizen;
    @XmlElement(name = "WorkPermit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short workPermit;
    @XmlElement(name = "WorkPermitNo")
    protected String workPermitNo;
    @XmlElement(name = "WorkPermitDate")
    protected String workPermitDate;
    @XmlElement(name = "PrevSName")
    protected String prevSName;
    @XmlElement(name = "CompUsage")
    protected String compUsage;
    @XmlElement(name = "ReasonForNoSACE")
    @XmlSchemaType(name = "unsignedByte")
    protected Short reasonForNoSACE;
    @XmlElement(name = "UnionName")
    protected String unionName;
    @XmlElement(name = "UnionNo")
    protected String unionNo;
    @XmlElement(name = "UnionName2")
    protected String unionName2;
    @XmlElement(name = "UnionNo2")
    protected String unionNo2;
    @XmlElement(name = "UnionNameX")
    protected String unionNameX;
    @XmlElement(name = "UnionNoX")
    protected String unionNoX;
    @XmlElement(name = "Religion")
    protected String religion;
    @XmlElement(name = "ForeignID")
    protected String foreignID;
    @XmlElement(name = "Bursar")
    protected Integer bursar;

    /**
     * Gets the value of the edID property.
     * 
     */
    public int getEdID() {
        return edID;
    }

    /**
     * Sets the value of the edID property.
     * 
     */
    public void setEdID(int value) {
        this.edID = value;
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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the depCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * Sets the value of the depCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCode(String value) {
        this.depCode = value;
    }

    /**
     * Gets the value of the subsidies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidies() {
        return subsidies;
    }

    /**
     * Sets the value of the subsidies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidies(String value) {
        this.subsidies = value;
    }

    /**
     * Gets the value of the medName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedName() {
        return medName;
    }

    /**
     * Sets the value of the medName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedName(String value) {
        this.medName = value;
    }

    /**
     * Gets the value of the medNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedNo() {
        return medNo;
    }

    /**
     * Sets the value of the medNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedNo(String value) {
        this.medNo = value;
    }

    /**
     * Gets the value of the spouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the value of the spouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouse(String value) {
        this.spouse = value;
    }

    /**
     * Gets the value of the eNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENumber() {
        return eNumber;
    }

    /**
     * Sets the value of the eNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENumber(String value) {
        this.eNumber = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenses(String value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the academic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademic() {
        return academic;
    }

    /**
     * Sets the value of the academic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademic(String value) {
        this.academic = value;
    }

    /**
     * Gets the value of the institution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * Sets the value of the institution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitution(String value) {
        this.institution = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkills(String value) {
        this.skills = value;
    }

    /**
     * Gets the value of the dateJoined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateJoined() {
        return dateJoined;
    }

    /**
     * Sets the value of the dateJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateJoined(String value) {
        this.dateJoined = value;
    }

    /**
     * Gets the value of the managementPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementPosition() {
        return managementPosition;
    }

    /**
     * Sets the value of the managementPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementPosition(String value) {
        this.managementPosition = value;
    }

    /**
     * Gets the value of the postLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostLevel() {
        return postLevel;
    }

    /**
     * Sets the value of the postLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostLevel(String value) {
        this.postLevel = value;
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
     * Gets the value of the professional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessional() {
        return professional;
    }

    /**
     * Sets the value of the professional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessional(String value) {
        this.professional = value;
    }

    /**
     * Gets the value of the registerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterClass() {
        return registerClass;
    }

    /**
     * Sets the value of the registerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterClass(String value) {
        this.registerClass = value;
    }

    /**
     * Gets the value of the persalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersalNumber() {
        return persalNumber;
    }

    /**
     * Sets the value of the persalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersalNumber(String value) {
        this.persalNumber = value;
    }

    /**
     * Gets the value of the homelanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomelanguage() {
        return homelanguage;
    }

    /**
     * Sets the value of the homelanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomelanguage(String value) {
        this.homelanguage = value;
    }

    /**
     * Gets the value of the x0032Ndlanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX0032Ndlanguage() {
        return x0032Ndlanguage;
    }

    /**
     * Sets the value of the x0032Ndlanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX0032Ndlanguage(String value) {
        this.x0032Ndlanguage = value;
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
     * Gets the value of the educatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducatorType() {
        return educatorType;
    }

    /**
     * Sets the value of the educatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducatorType(String value) {
        this.educatorType = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
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
     * Gets the value of the actual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActual(String value) {
        this.actual = value;
    }

    /**
     * Gets the value of the acting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActing() {
        return acting;
    }

    /**
     * Sets the value of the acting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActing(String value) {
        this.acting = value;
    }

    /**
     * Gets the value of the natureofApointment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureofApointment() {
        return natureofApointment;
    }

    /**
     * Sets the value of the natureofApointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureofApointment(String value) {
        this.natureofApointment = value;
    }

    /**
     * Gets the value of the remuneration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemuneration() {
        return remuneration;
    }

    /**
     * Sets the value of the remuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemuneration(String value) {
        this.remuneration = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualification(String value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the qualificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * Sets the value of the qualificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
    }

    /**
     * Gets the value of the preGradeR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreGradeR() {
        return preGradeR;
    }

    /**
     * Sets the value of the preGradeR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreGradeR(String value) {
        this.preGradeR = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the gradeR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeR() {
        return gradeR;
    }

    /**
     * Sets the value of the gradeR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeR(String value) {
        this.gradeR = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the lsen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSEN() {
        return lsen;
    }

    /**
     * Sets the value of the lsen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSEN(String value) {
        this.lsen = value;
    }

    /**
     * Gets the value of the academicDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /**
     * Sets the value of the academicDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDegree(String value) {
        this.academicDegree = value;
    }

    /**
     * Gets the value of the professionalDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalDegree() {
        return professionalDegree;
    }

    /**
     * Sets the value of the professionalDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalDegree(String value) {
        this.professionalDegree = value;
    }

    /**
     * Gets the value of the technicalCerDip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalCerDip() {
        return technicalCerDip;
    }

    /**
     * Sets the value of the technicalCerDip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalCerDip(String value) {
        this.technicalCerDip = value;
    }

    /**
     * Gets the value of the professionalDiploma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalDiploma() {
        return professionalDiploma;
    }

    /**
     * Sets the value of the professionalDiploma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalDiploma(String value) {
        this.professionalDiploma = value;
    }

    /**
     * Gets the value of the yearsExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearsExperience() {
        return yearsExperience;
    }

    /**
     * Sets the value of the yearsExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearsExperience(Integer value) {
        this.yearsExperience = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the instructionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionLanguage() {
        return instructionLanguage;
    }

    /**
     * Sets the value of the instructionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionLanguage(String value) {
        this.instructionLanguage = value;
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
     * Gets the value of the sace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACE() {
        return sace;
    }

    /**
     * Sets the value of the sace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACE(String value) {
        this.sace = value;
    }

    /**
     * Gets the value of the wcType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWCType() {
        return wcType;
    }

    /**
     * Sets the value of the wcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWCType(Integer value) {
        this.wcType = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the ictSkill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICTSkill() {
        return ictSkill;
    }

    /**
     * Sets the value of the ictSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICTSkill(String value) {
        this.ictSkill = value;
    }

    /**
     * Gets the value of the ictUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICTUsage() {
        return ictUsage;
    }

    /**
     * Sets the value of the ictUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICTUsage(String value) {
        this.ictUsage = value;
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
     * Gets the value of the photoname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoname() {
        return photoname;
    }

    /**
     * Sets the value of the photoname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoname(String value) {
        this.photoname = value;
    }

    /**
     * Gets the value of the intermediate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediate() {
        return intermediate;
    }

    /**
     * Sets the value of the intermediate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediate(String value) {
        this.intermediate = value;
    }

    /**
     * Gets the value of the luritsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLuritsNumber() {
        return luritsNumber;
    }

    /**
     * Sets the value of the luritsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLuritsNumber(Integer value) {
        this.luritsNumber = value;
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

    /**
     * Gets the value of the kinSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinSName() {
        return kinSName;
    }

    /**
     * Sets the value of the kinSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinSName(String value) {
        this.kinSName = value;
    }

    /**
     * Gets the value of the kinFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinFName() {
        return kinFName;
    }

    /**
     * Sets the value of the kinFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinFName(String value) {
        this.kinFName = value;
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
     * Gets the value of the workPermit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkPermit() {
        return workPermit;
    }

    /**
     * Sets the value of the workPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkPermit(Short value) {
        this.workPermit = value;
    }

    /**
     * Gets the value of the workPermitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPermitNo() {
        return workPermitNo;
    }

    /**
     * Sets the value of the workPermitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPermitNo(String value) {
        this.workPermitNo = value;
    }

    /**
     * Gets the value of the workPermitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPermitDate() {
        return workPermitDate;
    }

    /**
     * Sets the value of the workPermitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPermitDate(String value) {
        this.workPermitDate = value;
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
     * Gets the value of the compUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompUsage() {
        return compUsage;
    }

    /**
     * Sets the value of the compUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompUsage(String value) {
        this.compUsage = value;
    }

    /**
     * Gets the value of the reasonForNoSACE property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReasonForNoSACE() {
        return reasonForNoSACE;
    }

    /**
     * Sets the value of the reasonForNoSACE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReasonForNoSACE(Short value) {
        this.reasonForNoSACE = value;
    }

    /**
     * Gets the value of the unionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * Sets the value of the unionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionName(String value) {
        this.unionName = value;
    }

    /**
     * Gets the value of the unionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionNo() {
        return unionNo;
    }

    /**
     * Sets the value of the unionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionNo(String value) {
        this.unionNo = value;
    }

    /**
     * Gets the value of the unionName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionName2() {
        return unionName2;
    }

    /**
     * Sets the value of the unionName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionName2(String value) {
        this.unionName2 = value;
    }

    /**
     * Gets the value of the unionNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionNo2() {
        return unionNo2;
    }

    /**
     * Sets the value of the unionNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionNo2(String value) {
        this.unionNo2 = value;
    }

    /**
     * Gets the value of the unionNameX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionNameX() {
        return unionNameX;
    }

    /**
     * Sets the value of the unionNameX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionNameX(String value) {
        this.unionNameX = value;
    }

    /**
     * Gets the value of the unionNoX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnionNoX() {
        return unionNoX;
    }

    /**
     * Sets the value of the unionNoX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnionNoX(String value) {
        this.unionNoX = value;
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
     * Gets the value of the bursar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBursar() {
        return bursar;
    }

    /**
     * Sets the value of the bursar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBursar(Integer value) {
        this.bursar = value;
    }

}
