
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
 *         &lt;element name="stockcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VenueTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "stockcode",
    "venueTypeId",
    "inventoryStockID"
})
@XmlRootElement(name = "InventoryVenueTypes")
public class InventoryVenueTypes {

    protected String stockcode;
    @XmlElement(name = "VenueTypeId")
    protected Integer venueTypeId;
    @XmlElement(name = "InventoryStockID")
    protected Integer inventoryStockID;

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
     * Gets the value of the venueTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVenueTypeId() {
        return venueTypeId;
    }

    /**
     * Sets the value of the venueTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVenueTypeId(Integer value) {
        this.venueTypeId = value;
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
