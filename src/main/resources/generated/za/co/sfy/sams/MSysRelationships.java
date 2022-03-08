
package za.co.sfy.sams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ccolumn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="grbit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="icolumn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="szColumn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="szObject" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="szReferencedColumn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="szReferencedObject" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="szRelationship" minOccurs="0"&gt;
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
    "ccolumn",
    "grbit",
    "icolumn",
    "szColumn",
    "szObject",
    "szReferencedColumn",
    "szReferencedObject",
    "szRelationship"
})
@XmlRootElement(name = "MSysRelationships")
public class MSysRelationships {

    protected Integer ccolumn;
    protected Integer grbit;
    protected Integer icolumn;
    protected String szColumn;
    protected String szObject;
    protected String szReferencedColumn;
    protected String szReferencedObject;
    protected String szRelationship;

    /**
     * Gets the value of the ccolumn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCcolumn() {
        return ccolumn;
    }

    /**
     * Sets the value of the ccolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCcolumn(Integer value) {
        this.ccolumn = value;
    }

    /**
     * Gets the value of the grbit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrbit() {
        return grbit;
    }

    /**
     * Sets the value of the grbit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrbit(Integer value) {
        this.grbit = value;
    }

    /**
     * Gets the value of the icolumn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIcolumn() {
        return icolumn;
    }

    /**
     * Sets the value of the icolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIcolumn(Integer value) {
        this.icolumn = value;
    }

    /**
     * Gets the value of the szColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzColumn() {
        return szColumn;
    }

    /**
     * Sets the value of the szColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzColumn(String value) {
        this.szColumn = value;
    }

    /**
     * Gets the value of the szObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzObject() {
        return szObject;
    }

    /**
     * Sets the value of the szObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzObject(String value) {
        this.szObject = value;
    }

    /**
     * Gets the value of the szReferencedColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzReferencedColumn() {
        return szReferencedColumn;
    }

    /**
     * Sets the value of the szReferencedColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzReferencedColumn(String value) {
        this.szReferencedColumn = value;
    }

    /**
     * Gets the value of the szReferencedObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzReferencedObject() {
        return szReferencedObject;
    }

    /**
     * Sets the value of the szReferencedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzReferencedObject(String value) {
        this.szReferencedObject = value;
    }

    /**
     * Gets the value of the szRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzRelationship() {
        return szRelationship;
    }

    /**
     * Sets the value of the szRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzRelationship(String value) {
        this.szRelationship = value;
    }

}
