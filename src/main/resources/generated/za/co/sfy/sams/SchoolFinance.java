
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
 *         &lt;element name="EmisNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Field131" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field132" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1331" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1332" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field134" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1351" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1352" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1353" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1354" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1355" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1356" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1357" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1361" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1362" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1363" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1364" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1365" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1366" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1367" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1368" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Field1371" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1372" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1373" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1374" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field138" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field139" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Field1310" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "emisNumber",
    "dataYear",
    "field131",
    "field132",
    "field1331",
    "field1332",
    "field134",
    "field1351",
    "field1352",
    "field1353",
    "field1354",
    "field1355",
    "field1356",
    "field1357",
    "field1361",
    "field1362",
    "field1363",
    "field1364",
    "field1365",
    "field1366",
    "field1367",
    "field1368",
    "field1371",
    "field1372",
    "field1373",
    "field1374",
    "field138",
    "field139",
    "field1310"
})
@XmlRootElement(name = "SchoolFinance")
public class SchoolFinance {

    @XmlElement(name = "EmisNumber")
    protected Double emisNumber;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Field131")
    protected Integer field131;
    @XmlElement(name = "Field132")
    protected Integer field132;
    @XmlElement(name = "Field1331")
    protected Integer field1331;
    @XmlElement(name = "Field1332")
    protected Integer field1332;
    @XmlElement(name = "Field134")
    protected Integer field134;
    @XmlElement(name = "Field1351")
    protected Integer field1351;
    @XmlElement(name = "Field1352")
    protected Double field1352;
    @XmlElement(name = "Field1353")
    protected Double field1353;
    @XmlElement(name = "Field1354")
    protected Double field1354;
    @XmlElement(name = "Field1355")
    protected Double field1355;
    @XmlElement(name = "Field1356")
    protected Double field1356;
    @XmlElement(name = "Field1357")
    protected Double field1357;
    @XmlElement(name = "Field1361")
    protected Double field1361;
    @XmlElement(name = "Field1362")
    protected Double field1362;
    @XmlElement(name = "Field1363")
    protected Double field1363;
    @XmlElement(name = "Field1364")
    protected Double field1364;
    @XmlElement(name = "Field1365")
    protected Double field1365;
    @XmlElement(name = "Field1366")
    protected Double field1366;
    @XmlElement(name = "Field1367")
    protected Double field1367;
    @XmlElement(name = "Field1368")
    protected Double field1368;
    @XmlElement(name = "Field1371")
    protected Integer field1371;
    @XmlElement(name = "Field1372")
    protected Integer field1372;
    @XmlElement(name = "Field1373")
    protected Integer field1373;
    @XmlElement(name = "Field1374")
    protected Integer field1374;
    @XmlElement(name = "Field138")
    protected Integer field138;
    @XmlElement(name = "Field139")
    protected Integer field139;
    @XmlElement(name = "Field1310")
    protected Integer field1310;

    /**
     * Gets the value of the emisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmisNumber() {
        return emisNumber;
    }

    /**
     * Sets the value of the emisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmisNumber(Double value) {
        this.emisNumber = value;
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

    /**
     * Gets the value of the field131 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField131() {
        return field131;
    }

    /**
     * Sets the value of the field131 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField131(Integer value) {
        this.field131 = value;
    }

    /**
     * Gets the value of the field132 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField132() {
        return field132;
    }

    /**
     * Sets the value of the field132 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField132(Integer value) {
        this.field132 = value;
    }

    /**
     * Gets the value of the field1331 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1331() {
        return field1331;
    }

    /**
     * Sets the value of the field1331 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1331(Integer value) {
        this.field1331 = value;
    }

    /**
     * Gets the value of the field1332 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1332() {
        return field1332;
    }

    /**
     * Sets the value of the field1332 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1332(Integer value) {
        this.field1332 = value;
    }

    /**
     * Gets the value of the field134 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField134() {
        return field134;
    }

    /**
     * Sets the value of the field134 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField134(Integer value) {
        this.field134 = value;
    }

    /**
     * Gets the value of the field1351 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1351() {
        return field1351;
    }

    /**
     * Sets the value of the field1351 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1351(Integer value) {
        this.field1351 = value;
    }

    /**
     * Gets the value of the field1352 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1352() {
        return field1352;
    }

    /**
     * Sets the value of the field1352 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1352(Double value) {
        this.field1352 = value;
    }

    /**
     * Gets the value of the field1353 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1353() {
        return field1353;
    }

    /**
     * Sets the value of the field1353 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1353(Double value) {
        this.field1353 = value;
    }

    /**
     * Gets the value of the field1354 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1354() {
        return field1354;
    }

    /**
     * Sets the value of the field1354 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1354(Double value) {
        this.field1354 = value;
    }

    /**
     * Gets the value of the field1355 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1355() {
        return field1355;
    }

    /**
     * Sets the value of the field1355 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1355(Double value) {
        this.field1355 = value;
    }

    /**
     * Gets the value of the field1356 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1356() {
        return field1356;
    }

    /**
     * Sets the value of the field1356 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1356(Double value) {
        this.field1356 = value;
    }

    /**
     * Gets the value of the field1357 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1357() {
        return field1357;
    }

    /**
     * Sets the value of the field1357 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1357(Double value) {
        this.field1357 = value;
    }

    /**
     * Gets the value of the field1361 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1361() {
        return field1361;
    }

    /**
     * Sets the value of the field1361 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1361(Double value) {
        this.field1361 = value;
    }

    /**
     * Gets the value of the field1362 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1362() {
        return field1362;
    }

    /**
     * Sets the value of the field1362 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1362(Double value) {
        this.field1362 = value;
    }

    /**
     * Gets the value of the field1363 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1363() {
        return field1363;
    }

    /**
     * Sets the value of the field1363 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1363(Double value) {
        this.field1363 = value;
    }

    /**
     * Gets the value of the field1364 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1364() {
        return field1364;
    }

    /**
     * Sets the value of the field1364 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1364(Double value) {
        this.field1364 = value;
    }

    /**
     * Gets the value of the field1365 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1365() {
        return field1365;
    }

    /**
     * Sets the value of the field1365 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1365(Double value) {
        this.field1365 = value;
    }

    /**
     * Gets the value of the field1366 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1366() {
        return field1366;
    }

    /**
     * Sets the value of the field1366 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1366(Double value) {
        this.field1366 = value;
    }

    /**
     * Gets the value of the field1367 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1367() {
        return field1367;
    }

    /**
     * Sets the value of the field1367 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1367(Double value) {
        this.field1367 = value;
    }

    /**
     * Gets the value of the field1368 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getField1368() {
        return field1368;
    }

    /**
     * Sets the value of the field1368 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setField1368(Double value) {
        this.field1368 = value;
    }

    /**
     * Gets the value of the field1371 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1371() {
        return field1371;
    }

    /**
     * Sets the value of the field1371 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1371(Integer value) {
        this.field1371 = value;
    }

    /**
     * Gets the value of the field1372 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1372() {
        return field1372;
    }

    /**
     * Sets the value of the field1372 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1372(Integer value) {
        this.field1372 = value;
    }

    /**
     * Gets the value of the field1373 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1373() {
        return field1373;
    }

    /**
     * Sets the value of the field1373 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1373(Integer value) {
        this.field1373 = value;
    }

    /**
     * Gets the value of the field1374 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1374() {
        return field1374;
    }

    /**
     * Sets the value of the field1374 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1374(Integer value) {
        this.field1374 = value;
    }

    /**
     * Gets the value of the field138 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField138() {
        return field138;
    }

    /**
     * Sets the value of the field138 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField138(Integer value) {
        this.field138 = value;
    }

    /**
     * Gets the value of the field139 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField139() {
        return field139;
    }

    /**
     * Sets the value of the field139 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField139(Integer value) {
        this.field139 = value;
    }

    /**
     * Gets the value of the field1310 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getField1310() {
        return field1310;
    }

    /**
     * Sets the value of the field1310 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setField1310(Integer value) {
        this.field1310 = value;
    }

}
