
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
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StaffCategory" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StaffId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayMeth" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VoucherNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CoaAccount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GSalary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PAYE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UIF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Medical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Pension" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SUIF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SMedical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SPension" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SOther" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SDL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
    "paymentID",
    "dataYear",
    "month",
    "staffCategory",
    "staffId",
    "sname",
    "fname",
    "payMeth",
    "voucherNo",
    "coaAccount",
    "transNumber",
    "gSalary",
    "paye",
    "uif",
    "medical",
    "pension",
    "other",
    "suif",
    "sMedical",
    "sPension",
    "sOther",
    "sdl"
})
@XmlRootElement(name = "SGBSalaries")
public class SGBSalaries {

    @XmlElement(name = "PaymentID")
    protected int paymentID;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Month")
    protected Integer month;
    @XmlElement(name = "StaffCategory")
    protected String staffCategory;
    @XmlElement(name = "StaffId")
    protected Integer staffId;
    @XmlElement(name = "Sname")
    protected String sname;
    @XmlElement(name = "Fname")
    protected String fname;
    @XmlElement(name = "PayMeth")
    protected String payMeth;
    @XmlElement(name = "VoucherNo")
    protected Integer voucherNo;
    @XmlElement(name = "CoaAccount")
    protected Integer coaAccount;
    @XmlElement(name = "TransNumber")
    protected Integer transNumber;
    @XmlElement(name = "GSalary")
    protected Double gSalary;
    @XmlElement(name = "PAYE")
    protected Double paye;
    @XmlElement(name = "UIF")
    protected Double uif;
    @XmlElement(name = "Medical")
    protected Double medical;
    @XmlElement(name = "Pension")
    protected Double pension;
    @XmlElement(name = "Other")
    protected Double other;
    @XmlElement(name = "SUIF")
    protected Double suif;
    @XmlElement(name = "SMedical")
    protected Double sMedical;
    @XmlElement(name = "SPension")
    protected Double sPension;
    @XmlElement(name = "SOther")
    protected Double sOther;
    @XmlElement(name = "SDL")
    protected Double sdl;

    /**
     * Gets the value of the paymentID property.
     * 
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     */
    public void setPaymentID(int value) {
        this.paymentID = value;
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
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Gets the value of the staffCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCategory() {
        return staffCategory;
    }

    /**
     * Sets the value of the staffCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCategory(String value) {
        this.staffCategory = value;
    }

    /**
     * Gets the value of the staffId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * Sets the value of the staffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaffId(Integer value) {
        this.staffId = value;
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
     * Gets the value of the payMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * Sets the value of the payMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMeth(String value) {
        this.payMeth = value;
    }

    /**
     * Gets the value of the voucherNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoucherNo() {
        return voucherNo;
    }

    /**
     * Sets the value of the voucherNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoucherNo(Integer value) {
        this.voucherNo = value;
    }

    /**
     * Gets the value of the coaAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoaAccount() {
        return coaAccount;
    }

    /**
     * Sets the value of the coaAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoaAccount(Integer value) {
        this.coaAccount = value;
    }

    /**
     * Gets the value of the transNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransNumber() {
        return transNumber;
    }

    /**
     * Sets the value of the transNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransNumber(Integer value) {
        this.transNumber = value;
    }

    /**
     * Gets the value of the gSalary property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGSalary() {
        return gSalary;
    }

    /**
     * Sets the value of the gSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGSalary(Double value) {
        this.gSalary = value;
    }

    /**
     * Gets the value of the paye property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPAYE() {
        return paye;
    }

    /**
     * Sets the value of the paye property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPAYE(Double value) {
        this.paye = value;
    }

    /**
     * Gets the value of the uif property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUIF() {
        return uif;
    }

    /**
     * Sets the value of the uif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUIF(Double value) {
        this.uif = value;
    }

    /**
     * Gets the value of the medical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMedical() {
        return medical;
    }

    /**
     * Sets the value of the medical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMedical(Double value) {
        this.medical = value;
    }

    /**
     * Gets the value of the pension property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPension() {
        return pension;
    }

    /**
     * Sets the value of the pension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPension(Double value) {
        this.pension = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOther(Double value) {
        this.other = value;
    }

    /**
     * Gets the value of the suif property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSUIF() {
        return suif;
    }

    /**
     * Sets the value of the suif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSUIF(Double value) {
        this.suif = value;
    }

    /**
     * Gets the value of the sMedical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSMedical() {
        return sMedical;
    }

    /**
     * Sets the value of the sMedical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSMedical(Double value) {
        this.sMedical = value;
    }

    /**
     * Gets the value of the sPension property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSPension() {
        return sPension;
    }

    /**
     * Sets the value of the sPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSPension(Double value) {
        this.sPension = value;
    }

    /**
     * Gets the value of the sOther property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSOther() {
        return sOther;
    }

    /**
     * Sets the value of the sOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSOther(Double value) {
        this.sOther = value;
    }

    /**
     * Gets the value of the sdl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSDL() {
        return sdl;
    }

    /**
     * Sets the value of the sdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSDL(Double value) {
        this.sdl = value;
    }

}
