
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
 *         &lt;element name="COANo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BankStateNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Entrydate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Item" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChequeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DbAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CrAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ItemNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Recon" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Year" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "coaNo",
    "bankStateNo",
    "entrydate",
    "item",
    "chequeNo",
    "dbAmt",
    "crAmt",
    "itemNo",
    "recon",
    "year",
    "month"
})
@XmlRootElement(name = "BankStateDetails")
public class BankStateDetails {

    @XmlElement(name = "COANo")
    protected Integer coaNo;
    @XmlElement(name = "BankStateNo")
    protected int bankStateNo;
    @XmlElement(name = "Entrydate")
    protected String entrydate;
    @XmlElement(name = "Item")
    protected String item;
    @XmlElement(name = "ChequeNo")
    protected Integer chequeNo;
    @XmlElement(name = "DbAmt")
    protected Double dbAmt;
    @XmlElement(name = "CrAmt")
    protected Double crAmt;
    @XmlElement(name = "ItemNo")
    protected int itemNo;
    @XmlElement(name = "Recon")
    protected String recon;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "Month")
    protected Integer month;

    /**
     * Gets the value of the coaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOANo() {
        return coaNo;
    }

    /**
     * Sets the value of the coaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOANo(Integer value) {
        this.coaNo = value;
    }

    /**
     * Gets the value of the bankStateNo property.
     * 
     */
    public int getBankStateNo() {
        return bankStateNo;
    }

    /**
     * Sets the value of the bankStateNo property.
     * 
     */
    public void setBankStateNo(int value) {
        this.bankStateNo = value;
    }

    /**
     * Gets the value of the entrydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrydate() {
        return entrydate;
    }

    /**
     * Sets the value of the entrydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrydate(String value) {
        this.entrydate = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the chequeNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequeNo() {
        return chequeNo;
    }

    /**
     * Sets the value of the chequeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequeNo(Integer value) {
        this.chequeNo = value;
    }

    /**
     * Gets the value of the dbAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDbAmt() {
        return dbAmt;
    }

    /**
     * Sets the value of the dbAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDbAmt(Double value) {
        this.dbAmt = value;
    }

    /**
     * Gets the value of the crAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrAmt() {
        return crAmt;
    }

    /**
     * Sets the value of the crAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrAmt(Double value) {
        this.crAmt = value;
    }

    /**
     * Gets the value of the itemNo property.
     * 
     */
    public int getItemNo() {
        return itemNo;
    }

    /**
     * Sets the value of the itemNo property.
     * 
     */
    public void setItemNo(int value) {
        this.itemNo = value;
    }

    /**
     * Gets the value of the recon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecon() {
        return recon;
    }

    /**
     * Sets the value of the recon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecon(String value) {
        this.recon = value;
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

}
