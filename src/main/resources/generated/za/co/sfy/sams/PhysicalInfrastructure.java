
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
 *         &lt;element name="Electricity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Water" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WaterQuality" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WaterDistance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Toilets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FlushSystem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VentilatedPit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SepticTank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PitLatrine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bucket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaleLearners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaleStaff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaleDisabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FemaleLearners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FemaleStaff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FemaleDisabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnersNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StaffNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DisabledNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerUrinals" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StaffUrinals" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DisabledUrinals" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LearnerUrinalNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StaffUrinalNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DisabledUrinalNotFunctioning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FenceHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MeshWire" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BrickFence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BarbedWire" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Woodfence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConcreteFence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FenceCondition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadCondition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TarDistance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BoardingFacilities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EducatorAccommodation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxMaleAccom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxFemaleAccom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualMaleAccom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualFemaleAccom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PayM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PayF" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Walltype" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoofType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ceiling" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InternalWallFinish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FloorFinish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Photocopier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CopierMachine" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RisoMachine" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GeneralCondition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="year" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="entrydate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "electricity",
    "water",
    "waterQuality",
    "waterDistance",
    "toilets",
    "flushSystem",
    "ventilatedPit",
    "septicTank",
    "pitLatrine",
    "bucket",
    "maleLearners",
    "maleStaff",
    "maleDisabled",
    "femaleLearners",
    "femaleStaff",
    "femaleDisabled",
    "learnersNotFunctioning",
    "staffNotFunctioning",
    "disabledNotFunctioning",
    "learnerUrinals",
    "staffUrinals",
    "disabledUrinals",
    "learnerUrinalNotFunctioning",
    "staffUrinalNotFunctioning",
    "disabledUrinalNotFunctioning",
    "fenceHeight",
    "meshWire",
    "brickFence",
    "barbedWire",
    "woodfence",
    "concreteFence",
    "fenceCondition",
    "roadAccess",
    "roadCondition",
    "tarDistance",
    "boardingFacilities",
    "educatorAccommodation",
    "maxMaleAccom",
    "maxFemaleAccom",
    "actualMaleAccom",
    "actualFemaleAccom",
    "payM",
    "payF",
    "walltype",
    "roofType",
    "ceiling",
    "internalWallFinish",
    "floorFinish",
    "photocopier",
    "fax",
    "copierMachine",
    "risoMachine",
    "generalCondition",
    "year",
    "entrydate"
})
@XmlRootElement(name = "PhysicalInfrastructure")
public class PhysicalInfrastructure {

    @XmlElement(name = "Electricity")
    protected Integer electricity;
    @XmlElement(name = "Water")
    protected Integer water;
    @XmlElement(name = "WaterQuality")
    protected String waterQuality;
    @XmlElement(name = "WaterDistance")
    protected Integer waterDistance;
    @XmlElement(name = "Toilets")
    protected Integer toilets;
    @XmlElement(name = "FlushSystem")
    protected Integer flushSystem;
    @XmlElement(name = "VentilatedPit")
    protected Integer ventilatedPit;
    @XmlElement(name = "SepticTank")
    protected Integer septicTank;
    @XmlElement(name = "PitLatrine")
    protected Integer pitLatrine;
    @XmlElement(name = "Bucket")
    protected Integer bucket;
    @XmlElement(name = "MaleLearners")
    protected Integer maleLearners;
    @XmlElement(name = "MaleStaff")
    protected Integer maleStaff;
    @XmlElement(name = "MaleDisabled")
    protected Integer maleDisabled;
    @XmlElement(name = "FemaleLearners")
    protected Integer femaleLearners;
    @XmlElement(name = "FemaleStaff")
    protected Integer femaleStaff;
    @XmlElement(name = "FemaleDisabled")
    protected Integer femaleDisabled;
    @XmlElement(name = "LearnersNotFunctioning")
    protected Integer learnersNotFunctioning;
    @XmlElement(name = "StaffNotFunctioning")
    protected Integer staffNotFunctioning;
    @XmlElement(name = "DisabledNotFunctioning")
    protected Integer disabledNotFunctioning;
    @XmlElement(name = "LearnerUrinals")
    protected Integer learnerUrinals;
    @XmlElement(name = "StaffUrinals")
    protected Integer staffUrinals;
    @XmlElement(name = "DisabledUrinals")
    protected Integer disabledUrinals;
    @XmlElement(name = "LearnerUrinalNotFunctioning")
    protected Integer learnerUrinalNotFunctioning;
    @XmlElement(name = "StaffUrinalNotFunctioning")
    protected Integer staffUrinalNotFunctioning;
    @XmlElement(name = "DisabledUrinalNotFunctioning")
    protected Integer disabledUrinalNotFunctioning;
    @XmlElement(name = "FenceHeight")
    protected Double fenceHeight;
    @XmlElement(name = "MeshWire")
    protected String meshWire;
    @XmlElement(name = "BrickFence")
    protected String brickFence;
    @XmlElement(name = "BarbedWire")
    protected String barbedWire;
    @XmlElement(name = "Woodfence")
    protected String woodfence;
    @XmlElement(name = "ConcreteFence")
    protected String concreteFence;
    @XmlElement(name = "FenceCondition")
    protected Integer fenceCondition;
    @XmlElement(name = "RoadAccess")
    protected Integer roadAccess;
    @XmlElement(name = "RoadCondition")
    protected Integer roadCondition;
    @XmlElement(name = "TarDistance")
    protected Integer tarDistance;
    @XmlElement(name = "BoardingFacilities")
    protected Integer boardingFacilities;
    @XmlElement(name = "EducatorAccommodation")
    protected Integer educatorAccommodation;
    @XmlElement(name = "MaxMaleAccom")
    protected Integer maxMaleAccom;
    @XmlElement(name = "MaxFemaleAccom")
    protected Integer maxFemaleAccom;
    @XmlElement(name = "ActualMaleAccom")
    protected Integer actualMaleAccom;
    @XmlElement(name = "ActualFemaleAccom")
    protected Integer actualFemaleAccom;
    @XmlElement(name = "PayM")
    protected Integer payM;
    @XmlElement(name = "PayF")
    protected Integer payF;
    @XmlElement(name = "Walltype")
    protected String walltype;
    @XmlElement(name = "RoofType")
    protected String roofType;
    @XmlElement(name = "Ceiling")
    protected String ceiling;
    @XmlElement(name = "InternalWallFinish")
    protected String internalWallFinish;
    @XmlElement(name = "FloorFinish")
    protected String floorFinish;
    @XmlElement(name = "Photocopier")
    protected String photocopier;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "CopierMachine")
    protected String copierMachine;
    @XmlElement(name = "RisoMachine")
    protected String risoMachine;
    @XmlElement(name = "GeneralCondition")
    protected String generalCondition;
    protected String year;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrydate;

    /**
     * Gets the value of the electricity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElectricity() {
        return electricity;
    }

    /**
     * Sets the value of the electricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElectricity(Integer value) {
        this.electricity = value;
    }

    /**
     * Gets the value of the water property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWater() {
        return water;
    }

    /**
     * Sets the value of the water property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWater(Integer value) {
        this.water = value;
    }

    /**
     * Gets the value of the waterQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterQuality() {
        return waterQuality;
    }

    /**
     * Sets the value of the waterQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterQuality(String value) {
        this.waterQuality = value;
    }

    /**
     * Gets the value of the waterDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaterDistance() {
        return waterDistance;
    }

    /**
     * Sets the value of the waterDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaterDistance(Integer value) {
        this.waterDistance = value;
    }

    /**
     * Gets the value of the toilets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToilets() {
        return toilets;
    }

    /**
     * Sets the value of the toilets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToilets(Integer value) {
        this.toilets = value;
    }

    /**
     * Gets the value of the flushSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlushSystem() {
        return flushSystem;
    }

    /**
     * Sets the value of the flushSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlushSystem(Integer value) {
        this.flushSystem = value;
    }

    /**
     * Gets the value of the ventilatedPit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVentilatedPit() {
        return ventilatedPit;
    }

    /**
     * Sets the value of the ventilatedPit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVentilatedPit(Integer value) {
        this.ventilatedPit = value;
    }

    /**
     * Gets the value of the septicTank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSepticTank() {
        return septicTank;
    }

    /**
     * Sets the value of the septicTank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSepticTank(Integer value) {
        this.septicTank = value;
    }

    /**
     * Gets the value of the pitLatrine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPitLatrine() {
        return pitLatrine;
    }

    /**
     * Sets the value of the pitLatrine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPitLatrine(Integer value) {
        this.pitLatrine = value;
    }

    /**
     * Gets the value of the bucket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBucket() {
        return bucket;
    }

    /**
     * Sets the value of the bucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBucket(Integer value) {
        this.bucket = value;
    }

    /**
     * Gets the value of the maleLearners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaleLearners() {
        return maleLearners;
    }

    /**
     * Sets the value of the maleLearners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaleLearners(Integer value) {
        this.maleLearners = value;
    }

    /**
     * Gets the value of the maleStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaleStaff() {
        return maleStaff;
    }

    /**
     * Sets the value of the maleStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaleStaff(Integer value) {
        this.maleStaff = value;
    }

    /**
     * Gets the value of the maleDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaleDisabled() {
        return maleDisabled;
    }

    /**
     * Sets the value of the maleDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaleDisabled(Integer value) {
        this.maleDisabled = value;
    }

    /**
     * Gets the value of the femaleLearners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemaleLearners() {
        return femaleLearners;
    }

    /**
     * Sets the value of the femaleLearners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemaleLearners(Integer value) {
        this.femaleLearners = value;
    }

    /**
     * Gets the value of the femaleStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemaleStaff() {
        return femaleStaff;
    }

    /**
     * Sets the value of the femaleStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemaleStaff(Integer value) {
        this.femaleStaff = value;
    }

    /**
     * Gets the value of the femaleDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemaleDisabled() {
        return femaleDisabled;
    }

    /**
     * Sets the value of the femaleDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemaleDisabled(Integer value) {
        this.femaleDisabled = value;
    }

    /**
     * Gets the value of the learnersNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnersNotFunctioning() {
        return learnersNotFunctioning;
    }

    /**
     * Sets the value of the learnersNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnersNotFunctioning(Integer value) {
        this.learnersNotFunctioning = value;
    }

    /**
     * Gets the value of the staffNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffNotFunctioning() {
        return staffNotFunctioning;
    }

    /**
     * Sets the value of the staffNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffNotFunctioning(Integer value) {
        this.staffNotFunctioning = value;
    }

    /**
     * Gets the value of the disabledNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisabledNotFunctioning() {
        return disabledNotFunctioning;
    }

    /**
     * Sets the value of the disabledNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisabledNotFunctioning(Integer value) {
        this.disabledNotFunctioning = value;
    }

    /**
     * Gets the value of the learnerUrinals property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerUrinals() {
        return learnerUrinals;
    }

    /**
     * Sets the value of the learnerUrinals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerUrinals(Integer value) {
        this.learnerUrinals = value;
    }

    /**
     * Gets the value of the staffUrinals property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffUrinals() {
        return staffUrinals;
    }

    /**
     * Sets the value of the staffUrinals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffUrinals(Integer value) {
        this.staffUrinals = value;
    }

    /**
     * Gets the value of the disabledUrinals property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisabledUrinals() {
        return disabledUrinals;
    }

    /**
     * Sets the value of the disabledUrinals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisabledUrinals(Integer value) {
        this.disabledUrinals = value;
    }

    /**
     * Gets the value of the learnerUrinalNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerUrinalNotFunctioning() {
        return learnerUrinalNotFunctioning;
    }

    /**
     * Sets the value of the learnerUrinalNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerUrinalNotFunctioning(Integer value) {
        this.learnerUrinalNotFunctioning = value;
    }

    /**
     * Gets the value of the staffUrinalNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffUrinalNotFunctioning() {
        return staffUrinalNotFunctioning;
    }

    /**
     * Sets the value of the staffUrinalNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffUrinalNotFunctioning(Integer value) {
        this.staffUrinalNotFunctioning = value;
    }

    /**
     * Gets the value of the disabledUrinalNotFunctioning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisabledUrinalNotFunctioning() {
        return disabledUrinalNotFunctioning;
    }

    /**
     * Sets the value of the disabledUrinalNotFunctioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisabledUrinalNotFunctioning(Integer value) {
        this.disabledUrinalNotFunctioning = value;
    }

    /**
     * Gets the value of the fenceHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFenceHeight() {
        return fenceHeight;
    }

    /**
     * Sets the value of the fenceHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFenceHeight(Double value) {
        this.fenceHeight = value;
    }

    /**
     * Gets the value of the meshWire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeshWire() {
        return meshWire;
    }

    /**
     * Sets the value of the meshWire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeshWire(String value) {
        this.meshWire = value;
    }

    /**
     * Gets the value of the brickFence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrickFence() {
        return brickFence;
    }

    /**
     * Sets the value of the brickFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrickFence(String value) {
        this.brickFence = value;
    }

    /**
     * Gets the value of the barbedWire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarbedWire() {
        return barbedWire;
    }

    /**
     * Sets the value of the barbedWire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarbedWire(String value) {
        this.barbedWire = value;
    }

    /**
     * Gets the value of the woodfence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoodfence() {
        return woodfence;
    }

    /**
     * Sets the value of the woodfence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoodfence(String value) {
        this.woodfence = value;
    }

    /**
     * Gets the value of the concreteFence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcreteFence() {
        return concreteFence;
    }

    /**
     * Sets the value of the concreteFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcreteFence(String value) {
        this.concreteFence = value;
    }

    /**
     * Gets the value of the fenceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFenceCondition() {
        return fenceCondition;
    }

    /**
     * Sets the value of the fenceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFenceCondition(Integer value) {
        this.fenceCondition = value;
    }

    /**
     * Gets the value of the roadAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadAccess() {
        return roadAccess;
    }

    /**
     * Sets the value of the roadAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadAccess(Integer value) {
        this.roadAccess = value;
    }

    /**
     * Gets the value of the roadCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadCondition() {
        return roadCondition;
    }

    /**
     * Sets the value of the roadCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadCondition(Integer value) {
        this.roadCondition = value;
    }

    /**
     * Gets the value of the tarDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTarDistance() {
        return tarDistance;
    }

    /**
     * Sets the value of the tarDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTarDistance(Integer value) {
        this.tarDistance = value;
    }

    /**
     * Gets the value of the boardingFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoardingFacilities() {
        return boardingFacilities;
    }

    /**
     * Sets the value of the boardingFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoardingFacilities(Integer value) {
        this.boardingFacilities = value;
    }

    /**
     * Gets the value of the educatorAccommodation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEducatorAccommodation() {
        return educatorAccommodation;
    }

    /**
     * Sets the value of the educatorAccommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEducatorAccommodation(Integer value) {
        this.educatorAccommodation = value;
    }

    /**
     * Gets the value of the maxMaleAccom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMaleAccom() {
        return maxMaleAccom;
    }

    /**
     * Sets the value of the maxMaleAccom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMaleAccom(Integer value) {
        this.maxMaleAccom = value;
    }

    /**
     * Gets the value of the maxFemaleAccom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFemaleAccom() {
        return maxFemaleAccom;
    }

    /**
     * Sets the value of the maxFemaleAccom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFemaleAccom(Integer value) {
        this.maxFemaleAccom = value;
    }

    /**
     * Gets the value of the actualMaleAccom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualMaleAccom() {
        return actualMaleAccom;
    }

    /**
     * Sets the value of the actualMaleAccom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualMaleAccom(Integer value) {
        this.actualMaleAccom = value;
    }

    /**
     * Gets the value of the actualFemaleAccom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualFemaleAccom() {
        return actualFemaleAccom;
    }

    /**
     * Sets the value of the actualFemaleAccom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualFemaleAccom(Integer value) {
        this.actualFemaleAccom = value;
    }

    /**
     * Gets the value of the payM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayM() {
        return payM;
    }

    /**
     * Sets the value of the payM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayM(Integer value) {
        this.payM = value;
    }

    /**
     * Gets the value of the payF property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayF() {
        return payF;
    }

    /**
     * Sets the value of the payF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayF(Integer value) {
        this.payF = value;
    }

    /**
     * Gets the value of the walltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalltype() {
        return walltype;
    }

    /**
     * Sets the value of the walltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalltype(String value) {
        this.walltype = value;
    }

    /**
     * Gets the value of the roofType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofType() {
        return roofType;
    }

    /**
     * Sets the value of the roofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofType(String value) {
        this.roofType = value;
    }

    /**
     * Gets the value of the ceiling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeiling() {
        return ceiling;
    }

    /**
     * Sets the value of the ceiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeiling(String value) {
        this.ceiling = value;
    }

    /**
     * Gets the value of the internalWallFinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalWallFinish() {
        return internalWallFinish;
    }

    /**
     * Sets the value of the internalWallFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalWallFinish(String value) {
        this.internalWallFinish = value;
    }

    /**
     * Gets the value of the floorFinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorFinish() {
        return floorFinish;
    }

    /**
     * Sets the value of the floorFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorFinish(String value) {
        this.floorFinish = value;
    }

    /**
     * Gets the value of the photocopier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotocopier() {
        return photocopier;
    }

    /**
     * Sets the value of the photocopier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotocopier(String value) {
        this.photocopier = value;
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
     * Gets the value of the copierMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopierMachine() {
        return copierMachine;
    }

    /**
     * Sets the value of the copierMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopierMachine(String value) {
        this.copierMachine = value;
    }

    /**
     * Gets the value of the risoMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisoMachine() {
        return risoMachine;
    }

    /**
     * Sets the value of the risoMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisoMachine(String value) {
        this.risoMachine = value;
    }

    /**
     * Gets the value of the generalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralCondition() {
        return generalCondition;
    }

    /**
     * Sets the value of the generalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralCondition(String value) {
        this.generalCondition = value;
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

}
