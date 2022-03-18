
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
 *         &lt;element name="ReportId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SystemPageHeaderHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SystemPageFooterHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SystemPageLeftMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SystemPageRightMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PrintedPageHeaderHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PrintedPageFooterHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PrintedPageLeftMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PrintedPageRightMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
    "reportId",
    "reportDescription",
    "systemPageHeaderHeight",
    "systemPageFooterHeight",
    "systemPageLeftMargin",
    "systemPageRightMargin",
    "printedPageHeaderHeight",
    "printedPageFooterHeight",
    "printedPageLeftMargin",
    "printedPageRightMargin"
})
@XmlRootElement(name = "LetterHeadSettings")
public class LetterHeadSettings {

    @XmlElement(name = "ReportId")
    protected Integer reportId;
    @XmlElement(name = "ReportDescription")
    protected String reportDescription;
    @XmlElement(name = "SystemPageHeaderHeight")
    protected Double systemPageHeaderHeight;
    @XmlElement(name = "SystemPageFooterHeight")
    protected Double systemPageFooterHeight;
    @XmlElement(name = "SystemPageLeftMargin")
    protected Double systemPageLeftMargin;
    @XmlElement(name = "SystemPageRightMargin")
    protected Double systemPageRightMargin;
    @XmlElement(name = "PrintedPageHeaderHeight")
    protected Double printedPageHeaderHeight;
    @XmlElement(name = "PrintedPageFooterHeight")
    protected Double printedPageFooterHeight;
    @XmlElement(name = "PrintedPageLeftMargin")
    protected Double printedPageLeftMargin;
    @XmlElement(name = "PrintedPageRightMargin")
    protected Double printedPageRightMargin;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportId(Integer value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the reportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDescription() {
        return reportDescription;
    }

    /**
     * Sets the value of the reportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDescription(String value) {
        this.reportDescription = value;
    }

    /**
     * Gets the value of the systemPageHeaderHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSystemPageHeaderHeight() {
        return systemPageHeaderHeight;
    }

    /**
     * Sets the value of the systemPageHeaderHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSystemPageHeaderHeight(Double value) {
        this.systemPageHeaderHeight = value;
    }

    /**
     * Gets the value of the systemPageFooterHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSystemPageFooterHeight() {
        return systemPageFooterHeight;
    }

    /**
     * Sets the value of the systemPageFooterHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSystemPageFooterHeight(Double value) {
        this.systemPageFooterHeight = value;
    }

    /**
     * Gets the value of the systemPageLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSystemPageLeftMargin() {
        return systemPageLeftMargin;
    }

    /**
     * Sets the value of the systemPageLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSystemPageLeftMargin(Double value) {
        this.systemPageLeftMargin = value;
    }

    /**
     * Gets the value of the systemPageRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSystemPageRightMargin() {
        return systemPageRightMargin;
    }

    /**
     * Sets the value of the systemPageRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSystemPageRightMargin(Double value) {
        this.systemPageRightMargin = value;
    }

    /**
     * Gets the value of the printedPageHeaderHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrintedPageHeaderHeight() {
        return printedPageHeaderHeight;
    }

    /**
     * Sets the value of the printedPageHeaderHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrintedPageHeaderHeight(Double value) {
        this.printedPageHeaderHeight = value;
    }

    /**
     * Gets the value of the printedPageFooterHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrintedPageFooterHeight() {
        return printedPageFooterHeight;
    }

    /**
     * Sets the value of the printedPageFooterHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrintedPageFooterHeight(Double value) {
        this.printedPageFooterHeight = value;
    }

    /**
     * Gets the value of the printedPageLeftMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrintedPageLeftMargin() {
        return printedPageLeftMargin;
    }

    /**
     * Sets the value of the printedPageLeftMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrintedPageLeftMargin(Double value) {
        this.printedPageLeftMargin = value;
    }

    /**
     * Gets the value of the printedPageRightMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrintedPageRightMargin() {
        return printedPageRightMargin;
    }

    /**
     * Sets the value of the printedPageRightMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrintedPageRightMargin(Double value) {
        this.printedPageRightMargin = value;
    }

}
