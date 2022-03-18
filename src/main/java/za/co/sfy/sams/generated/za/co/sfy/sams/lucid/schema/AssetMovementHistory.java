
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
 *         &lt;element name="Movement_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="stock_code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OldVenueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NewVenueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventoryStockID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "movementDate",
    "stockCode",
    "quantity",
    "oldVenueID",
    "newVenueID",
    "inventoryStockID"
})
@XmlRootElement(name = "AssetMovementHistory")
public class AssetMovementHistory {

    @XmlElement(name = "Movement_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar movementDate;
    @XmlElement(name = "stock_code")
    protected String stockCode;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "OldVenueID")
    protected Integer oldVenueID;
    @XmlElement(name = "NewVenueID")
    protected Integer newVenueID;
    @XmlElement(name = "InventoryStockID")
    protected Integer inventoryStockID;

    /**
     * Gets the value of the movementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementDate() {
        return movementDate;
    }

    /**
     * Sets the value of the movementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementDate(XMLGregorianCalendar value) {
        this.movementDate = value;
    }

    /**
     * Gets the value of the stockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * Sets the value of the stockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockCode(String value) {
        this.stockCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the oldVenueID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldVenueID() {
        return oldVenueID;
    }

    /**
     * Sets the value of the oldVenueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldVenueID(Integer value) {
        this.oldVenueID = value;
    }

    /**
     * Gets the value of the newVenueID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewVenueID() {
        return newVenueID;
    }

    /**
     * Sets the value of the newVenueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewVenueID(Integer value) {
        this.newVenueID = value;
    }

    /**
     * Gets the value of the inventoryStockID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventoryStockID() {
        return inventoryStockID;
    }

    /**
     * Sets the value of the inventoryStockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventoryStockID(Integer value) {
        this.inventoryStockID = value;
    }

}
