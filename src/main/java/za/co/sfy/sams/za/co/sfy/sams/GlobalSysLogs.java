
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
 *         &lt;element name="RecNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RecValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
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
    "recNo",
    "recDesc",
    "recEnabled",
    "recValue"
})
@XmlRootElement(name = "GlobalSysLogs")
public class GlobalSysLogs {

    @XmlElement(name = "RecNo")
    protected Integer recNo;
    @XmlElement(name = "RecDesc")
    protected String recDesc;
    @XmlElement(name = "RecEnabled")
    protected boolean recEnabled;
    @XmlElement(name = "RecValue")
    protected String recValue;

    /**
     * Gets the value of the recNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecNo() {
        return recNo;
    }

    /**
     * Sets the value of the recNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecNo(Integer value) {
        this.recNo = value;
    }

    /**
     * Gets the value of the recDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDesc() {
        return recDesc;
    }

    /**
     * Sets the value of the recDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDesc(String value) {
        this.recDesc = value;
    }

    /**
     * Gets the value of the recEnabled property.
     * 
     */
    public boolean isRecEnabled() {
        return recEnabled;
    }

    /**
     * Sets the value of the recEnabled property.
     * 
     */
    public void setRecEnabled(boolean value) {
        this.recEnabled = value;
    }

    /**
     * Gets the value of the recValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecValue() {
        return recValue;
    }

    /**
     * Sets the value of the recValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecValue(String value) {
        this.recValue = value;
    }

}
