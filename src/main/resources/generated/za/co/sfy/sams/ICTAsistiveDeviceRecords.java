
package za.co.sfy.sams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="HasAsssDevice" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="NoHeld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NoReq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "hasAsssDevice",
    "noHeld",
    "noReq",
    "dataYear"
})
@XmlRootElement(name = "ICTAsistiveDeviceRecords")
public class ICTAsistiveDeviceRecords {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "HasAsssDevice")
    @XmlSchemaType(name = "unsignedByte")
    protected Short hasAsssDevice;
    @XmlElement(name = "NoHeld")
    protected Integer noHeld;
    @XmlElement(name = "NoReq")
    protected Integer noReq;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;

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
     * Gets the value of the hasAsssDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasAsssDevice() {
        return hasAsssDevice;
    }

    /**
     * Sets the value of the hasAsssDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasAsssDevice(Short value) {
        this.hasAsssDevice = value;
    }

    /**
     * Gets the value of the noHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoHeld() {
        return noHeld;
    }

    /**
     * Sets the value of the noHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoHeld(Integer value) {
        this.noHeld = value;
    }

    /**
     * Gets the value of the noReq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoReq() {
        return noReq;
    }

    /**
     * Sets the value of the noReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoReq(Integer value) {
        this.noReq = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

}
