
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
 *         &lt;element name="Datayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalConsRecieved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalDewTabletRecieved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalTabletDestroyed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalTabletReturned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "datayear",
    "totalConsRecieved",
    "totalDewTabletRecieved",
    "totalTabletDestroyed",
    "totalTabletReturned"
})
@XmlRootElement(name = "DewormingQue")
public class DewormingQue {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Datayear")
    protected String datayear;
    @XmlElement(name = "TotalConsRecieved")
    protected Integer totalConsRecieved;
    @XmlElement(name = "TotalDewTabletRecieved")
    protected Integer totalDewTabletRecieved;
    @XmlElement(name = "TotalTabletDestroyed")
    protected Integer totalTabletDestroyed;
    @XmlElement(name = "TotalTabletReturned")
    protected Integer totalTabletReturned;

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
     * Gets the value of the datayear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatayear() {
        return datayear;
    }

    /**
     * Sets the value of the datayear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatayear(String value) {
        this.datayear = value;
    }

    /**
     * Gets the value of the totalConsRecieved property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalConsRecieved() {
        return totalConsRecieved;
    }

    /**
     * Sets the value of the totalConsRecieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalConsRecieved(Integer value) {
        this.totalConsRecieved = value;
    }

    /**
     * Gets the value of the totalDewTabletRecieved property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDewTabletRecieved() {
        return totalDewTabletRecieved;
    }

    /**
     * Sets the value of the totalDewTabletRecieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDewTabletRecieved(Integer value) {
        this.totalDewTabletRecieved = value;
    }

    /**
     * Gets the value of the totalTabletDestroyed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalTabletDestroyed() {
        return totalTabletDestroyed;
    }

    /**
     * Sets the value of the totalTabletDestroyed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalTabletDestroyed(Integer value) {
        this.totalTabletDestroyed = value;
    }

    /**
     * Gets the value of the totalTabletReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalTabletReturned() {
        return totalTabletReturned;
    }

    /**
     * Sets the value of the totalTabletReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalTabletReturned(Integer value) {
        this.totalTabletReturned = value;
    }

}
