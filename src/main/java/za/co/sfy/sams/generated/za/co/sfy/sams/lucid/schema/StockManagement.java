
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Per_Menu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Delivered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Used" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantity_Left" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Meal_Date" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
    "product",
    "quantityPerMenu",
    "quantityDelivered",
    "quantityUsed",
    "quantityLeft",
    "mealDate",
    "dataYear"
})
@XmlRootElement(name = "StockManagement")
public class StockManagement {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Product")
    protected Integer product;
    @XmlElement(name = "Quantity_Per_Menu")
    protected Integer quantityPerMenu;
    @XmlElement(name = "Quantity_Delivered")
    protected Integer quantityDelivered;
    @XmlElement(name = "Quantity_Used")
    protected Integer quantityUsed;
    @XmlElement(name = "Quantity_Left")
    protected Integer quantityLeft;
    @XmlElement(name = "Meal_Date")
    protected String mealDate;
    @XmlElement(name = "Data_Year")
    protected String dataYear;

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProduct(Integer value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantityPerMenu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPerMenu() {
        return quantityPerMenu;
    }

    /**
     * Sets the value of the quantityPerMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPerMenu(Integer value) {
        this.quantityPerMenu = value;
    }

    /**
     * Gets the value of the quantityDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityDelivered() {
        return quantityDelivered;
    }

    /**
     * Sets the value of the quantityDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityDelivered(Integer value) {
        this.quantityDelivered = value;
    }

    /**
     * Gets the value of the quantityUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityUsed() {
        return quantityUsed;
    }

    /**
     * Sets the value of the quantityUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityUsed(Integer value) {
        this.quantityUsed = value;
    }

    /**
     * Gets the value of the quantityLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityLeft() {
        return quantityLeft;
    }

    /**
     * Sets the value of the quantityLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityLeft(Integer value) {
        this.quantityLeft = value;
    }

    /**
     * Gets the value of the mealDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealDate() {
        return mealDate;
    }

    /**
     * Sets the value of the mealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealDate(String value) {
        this.mealDate = value;
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

}
