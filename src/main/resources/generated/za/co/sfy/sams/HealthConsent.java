
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
 *         &lt;element name="LearnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Yes10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans11" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans13" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans14" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans15" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ans16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "learnerID",
    "yes1",
    "yes2",
    "yes3",
    "yes4",
    "yes5",
    "yes6",
    "yes7",
    "yes8",
    "yes9",
    "yes10",
    "no1",
    "no2",
    "no3",
    "no4",
    "no5",
    "no6",
    "no7",
    "no8",
    "no9",
    "no10",
    "ans11",
    "ans12",
    "ans13",
    "ans14",
    "ans15",
    "ans16",
    "datayear"
})
@XmlRootElement(name = "HealthConsent")
public class HealthConsent {

    @XmlElement(name = "LearnerID")
    protected Integer learnerID;
    @XmlElement(name = "Yes1")
    protected Integer yes1;
    @XmlElement(name = "Yes2")
    protected Integer yes2;
    @XmlElement(name = "Yes3")
    protected Integer yes3;
    @XmlElement(name = "Yes4")
    protected Integer yes4;
    @XmlElement(name = "Yes5")
    protected Integer yes5;
    @XmlElement(name = "Yes6")
    protected Integer yes6;
    @XmlElement(name = "Yes7")
    protected Integer yes7;
    @XmlElement(name = "Yes8")
    protected Integer yes8;
    @XmlElement(name = "Yes9")
    protected Integer yes9;
    @XmlElement(name = "Yes10")
    protected Integer yes10;
    @XmlElement(name = "No1")
    protected Integer no1;
    @XmlElement(name = "No2")
    protected Integer no2;
    @XmlElement(name = "No3")
    protected Integer no3;
    @XmlElement(name = "No4")
    protected Integer no4;
    @XmlElement(name = "No5")
    protected Integer no5;
    @XmlElement(name = "No6")
    protected Integer no6;
    @XmlElement(name = "No7")
    protected Integer no7;
    @XmlElement(name = "No8")
    protected Integer no8;
    @XmlElement(name = "No9")
    protected Integer no9;
    @XmlElement(name = "No10")
    protected Integer no10;
    @XmlElement(name = "Ans11")
    protected Integer ans11;
    @XmlElement(name = "Ans12")
    protected Integer ans12;
    @XmlElement(name = "Ans13")
    protected Integer ans13;
    @XmlElement(name = "Ans14")
    protected Integer ans14;
    @XmlElement(name = "Ans15")
    protected Integer ans15;
    @XmlElement(name = "Ans16")
    protected String ans16;
    @XmlElement(name = "Datayear")
    protected String datayear;

    /**
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerID(Integer value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the yes1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes1() {
        return yes1;
    }

    /**
     * Sets the value of the yes1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes1(Integer value) {
        this.yes1 = value;
    }

    /**
     * Gets the value of the yes2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes2() {
        return yes2;
    }

    /**
     * Sets the value of the yes2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes2(Integer value) {
        this.yes2 = value;
    }

    /**
     * Gets the value of the yes3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes3() {
        return yes3;
    }

    /**
     * Sets the value of the yes3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes3(Integer value) {
        this.yes3 = value;
    }

    /**
     * Gets the value of the yes4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes4() {
        return yes4;
    }

    /**
     * Sets the value of the yes4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes4(Integer value) {
        this.yes4 = value;
    }

    /**
     * Gets the value of the yes5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes5() {
        return yes5;
    }

    /**
     * Sets the value of the yes5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes5(Integer value) {
        this.yes5 = value;
    }

    /**
     * Gets the value of the yes6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes6() {
        return yes6;
    }

    /**
     * Sets the value of the yes6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes6(Integer value) {
        this.yes6 = value;
    }

    /**
     * Gets the value of the yes7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes7() {
        return yes7;
    }

    /**
     * Sets the value of the yes7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes7(Integer value) {
        this.yes7 = value;
    }

    /**
     * Gets the value of the yes8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes8() {
        return yes8;
    }

    /**
     * Sets the value of the yes8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes8(Integer value) {
        this.yes8 = value;
    }

    /**
     * Gets the value of the yes9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes9() {
        return yes9;
    }

    /**
     * Sets the value of the yes9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes9(Integer value) {
        this.yes9 = value;
    }

    /**
     * Gets the value of the yes10 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYes10() {
        return yes10;
    }

    /**
     * Sets the value of the yes10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYes10(Integer value) {
        this.yes10 = value;
    }

    /**
     * Gets the value of the no1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo1() {
        return no1;
    }

    /**
     * Sets the value of the no1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo1(Integer value) {
        this.no1 = value;
    }

    /**
     * Gets the value of the no2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo2() {
        return no2;
    }

    /**
     * Sets the value of the no2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo2(Integer value) {
        this.no2 = value;
    }

    /**
     * Gets the value of the no3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo3() {
        return no3;
    }

    /**
     * Sets the value of the no3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo3(Integer value) {
        this.no3 = value;
    }

    /**
     * Gets the value of the no4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo4() {
        return no4;
    }

    /**
     * Sets the value of the no4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo4(Integer value) {
        this.no4 = value;
    }

    /**
     * Gets the value of the no5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo5() {
        return no5;
    }

    /**
     * Sets the value of the no5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo5(Integer value) {
        this.no5 = value;
    }

    /**
     * Gets the value of the no6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo6() {
        return no6;
    }

    /**
     * Sets the value of the no6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo6(Integer value) {
        this.no6 = value;
    }

    /**
     * Gets the value of the no7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo7() {
        return no7;
    }

    /**
     * Sets the value of the no7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo7(Integer value) {
        this.no7 = value;
    }

    /**
     * Gets the value of the no8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo8() {
        return no8;
    }

    /**
     * Sets the value of the no8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo8(Integer value) {
        this.no8 = value;
    }

    /**
     * Gets the value of the no9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo9() {
        return no9;
    }

    /**
     * Sets the value of the no9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo9(Integer value) {
        this.no9 = value;
    }

    /**
     * Gets the value of the no10 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo10() {
        return no10;
    }

    /**
     * Sets the value of the no10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo10(Integer value) {
        this.no10 = value;
    }

    /**
     * Gets the value of the ans11 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAns11() {
        return ans11;
    }

    /**
     * Sets the value of the ans11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAns11(Integer value) {
        this.ans11 = value;
    }

    /**
     * Gets the value of the ans12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAns12() {
        return ans12;
    }

    /**
     * Sets the value of the ans12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAns12(Integer value) {
        this.ans12 = value;
    }

    /**
     * Gets the value of the ans13 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAns13() {
        return ans13;
    }

    /**
     * Sets the value of the ans13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAns13(Integer value) {
        this.ans13 = value;
    }

    /**
     * Gets the value of the ans14 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAns14() {
        return ans14;
    }

    /**
     * Sets the value of the ans14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAns14(Integer value) {
        this.ans14 = value;
    }

    /**
     * Gets the value of the ans15 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAns15() {
        return ans15;
    }

    /**
     * Sets the value of the ans15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAns15(Integer value) {
        this.ans15 = value;
    }

    /**
     * Gets the value of the ans16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAns16() {
        return ans16;
    }

    /**
     * Sets the value of the ans16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAns16(String value) {
        this.ans16 = value;
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

}
