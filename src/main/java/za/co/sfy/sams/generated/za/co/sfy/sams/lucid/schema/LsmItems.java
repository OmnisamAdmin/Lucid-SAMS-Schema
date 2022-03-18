
package za.co.sfy.sams.lucid.schema;

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
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AreaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Item" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISBN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PubID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AuthID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ManuID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CatID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LangID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffItemID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffAreaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OffSubjID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "itemID",
    "areaID",
    "typeNo",
    "item",
    "isbn",
    "pubID",
    "authID",
    "manuID",
    "itemYear",
    "catID",
    "langID",
    "offItemID",
    "offAreaID",
    "offSubjID",
    "status"
})
@XmlRootElement(name = "LsmItems")
public class LsmItems {

    @XmlElement(name = "ItemID")
    protected int itemID;
    @XmlElement(name = "AreaID")
    protected Integer areaID;
    @XmlElement(name = "TypeNo")
    protected Integer typeNo;
    @XmlElement(name = "Item")
    protected String item;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "PubID")
    protected Integer pubID;
    @XmlElement(name = "AuthID")
    protected Integer authID;
    @XmlElement(name = "ManuID")
    protected Integer manuID;
    @XmlElement(name = "ItemYear")
    protected String itemYear;
    @XmlElement(name = "CatID")
    protected Integer catID;
    @XmlElement(name = "LangID")
    protected Integer langID;
    @XmlElement(name = "OffItemID")
    protected Integer offItemID;
    @XmlElement(name = "OffAreaID")
    protected Integer offAreaID;
    @XmlElement(name = "OffSubjID")
    protected Integer offSubjID;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the itemID property.
     * 
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     */
    public void setItemID(int value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaID(Integer value) {
        this.areaID = value;
    }

    /**
     * Gets the value of the typeNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeNo() {
        return typeNo;
    }

    /**
     * Sets the value of the typeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeNo(Integer value) {
        this.typeNo = value;
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
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the pubID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPubID() {
        return pubID;
    }

    /**
     * Sets the value of the pubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPubID(Integer value) {
        this.pubID = value;
    }

    /**
     * Gets the value of the authID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthID() {
        return authID;
    }

    /**
     * Sets the value of the authID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthID(Integer value) {
        this.authID = value;
    }

    /**
     * Gets the value of the manuID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManuID() {
        return manuID;
    }

    /**
     * Sets the value of the manuID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManuID(Integer value) {
        this.manuID = value;
    }

    /**
     * Gets the value of the itemYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemYear() {
        return itemYear;
    }

    /**
     * Sets the value of the itemYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemYear(String value) {
        this.itemYear = value;
    }

    /**
     * Gets the value of the catID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatID() {
        return catID;
    }

    /**
     * Sets the value of the catID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatID(Integer value) {
        this.catID = value;
    }

    /**
     * Gets the value of the langID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLangID() {
        return langID;
    }

    /**
     * Sets the value of the langID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLangID(Integer value) {
        this.langID = value;
    }

    /**
     * Gets the value of the offItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffItemID() {
        return offItemID;
    }

    /**
     * Sets the value of the offItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffItemID(Integer value) {
        this.offItemID = value;
    }

    /**
     * Gets the value of the offAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffAreaID() {
        return offAreaID;
    }

    /**
     * Sets the value of the offAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffAreaID(Integer value) {
        this.offAreaID = value;
    }

    /**
     * Gets the value of the offSubjID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffSubjID() {
        return offSubjID;
    }

    /**
     * Sets the value of the offSubjID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffSubjID(Integer value) {
        this.offSubjID = value;
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

}
