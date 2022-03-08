
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
 *         &lt;element name="InventoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="stockcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VenueId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubVenue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "inventoryId",
    "stockcode",
    "quantity",
    "venueId",
    "subVenue",
    "inventoryStockID"
})
@XmlRootElement(name = "InventoryLocation")
public class InventoryLocation {

    @XmlElement(name = "InventoryId")
    protected Integer inventoryId;
    protected String stockcode;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "VenueId")
    protected Integer venueId;
    @XmlElement(name = "SubVenue")
    protected Integer subVenue;
    @XmlElement(name = "InventoryStockID")
    protected Integer inventoryStockID;

    /**
     * Gets the value of the inventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventoryId() {
        return inventoryId;
    }

    /**
     * Sets the value of the inventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventoryId(Integer value) {
        this.inventoryId = value;
    }

    /**
     * Gets the value of the stockcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockcode() {
        return stockcode;
    }

    /**
     * Sets the value of the stockcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockcode(String value) {
        this.stockcode = value;
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
     * Gets the value of the venueId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVenueId() {
        return venueId;
    }

    /**
     * Sets the value of the venueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVenueId(Integer value) {
        this.venueId = value;
    }

    /**
     * Gets the value of the subVenue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubVenue() {
        return subVenue;
    }

    /**
     * Sets the value of the subVenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubVenue(Integer value) {
        this.subVenue = value;
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
