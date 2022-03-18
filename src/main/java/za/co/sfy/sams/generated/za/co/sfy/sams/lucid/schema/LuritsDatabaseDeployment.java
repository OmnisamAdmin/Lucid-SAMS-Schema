
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
 *         &lt;element name="DeploymentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DeploymentCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeploymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "deploymentId",
    "deploymentCode",
    "deploymentDate"
})
@XmlRootElement(name = "LuritsDatabaseDeployment")
public class LuritsDatabaseDeployment {

    @XmlElement(name = "DeploymentId")
    protected int deploymentId;
    @XmlElement(name = "DeploymentCode")
    protected String deploymentCode;
    @XmlElement(name = "DeploymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deploymentDate;

    /**
     * Gets the value of the deploymentId property.
     * 
     */
    public int getDeploymentId() {
        return deploymentId;
    }

    /**
     * Sets the value of the deploymentId property.
     * 
     */
    public void setDeploymentId(int value) {
        this.deploymentId = value;
    }

    /**
     * Gets the value of the deploymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentCode() {
        return deploymentCode;
    }

    /**
     * Sets the value of the deploymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentCode(String value) {
        this.deploymentCode = value;
    }

    /**
     * Gets the value of the deploymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeploymentDate() {
        return deploymentDate;
    }

    /**
     * Sets the value of the deploymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeploymentDate(XMLGregorianCalendar value) {
        this.deploymentDate = value;
    }

}
