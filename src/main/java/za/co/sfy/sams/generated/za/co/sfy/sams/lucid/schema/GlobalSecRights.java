
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
 *         &lt;element name="ProfID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MnuNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MnuOptOn1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn3" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn4" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn5" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn6" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn7" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn8" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn9" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn10" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn11" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn12" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn13" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn14" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn15" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn16" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn17" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn18" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MnuOptOn19" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "profID",
    "mnuNo",
    "mnuOptOn1",
    "mnuOptOn2",
    "mnuOptOn3",
    "mnuOptOn4",
    "mnuOptOn5",
    "mnuOptOn6",
    "mnuOptOn7",
    "mnuOptOn8",
    "mnuOptOn9",
    "mnuOptOn10",
    "mnuOptOn11",
    "mnuOptOn12",
    "mnuOptOn13",
    "mnuOptOn14",
    "mnuOptOn15",
    "mnuOptOn16",
    "mnuOptOn17",
    "mnuOptOn18",
    "mnuOptOn19"
})
@XmlRootElement(name = "GlobalSecRights")
public class GlobalSecRights {

    @XmlElement(name = "ProfID")
    protected Integer profID;
    @XmlElement(name = "MnuNo")
    protected String mnuNo;
    @XmlElement(name = "MnuOptOn1")
    protected boolean mnuOptOn1;
    @XmlElement(name = "MnuOptOn2")
    protected boolean mnuOptOn2;
    @XmlElement(name = "MnuOptOn3")
    protected boolean mnuOptOn3;
    @XmlElement(name = "MnuOptOn4")
    protected boolean mnuOptOn4;
    @XmlElement(name = "MnuOptOn5")
    protected boolean mnuOptOn5;
    @XmlElement(name = "MnuOptOn6")
    protected boolean mnuOptOn6;
    @XmlElement(name = "MnuOptOn7")
    protected boolean mnuOptOn7;
    @XmlElement(name = "MnuOptOn8")
    protected boolean mnuOptOn8;
    @XmlElement(name = "MnuOptOn9")
    protected boolean mnuOptOn9;
    @XmlElement(name = "MnuOptOn10")
    protected boolean mnuOptOn10;
    @XmlElement(name = "MnuOptOn11")
    protected boolean mnuOptOn11;
    @XmlElement(name = "MnuOptOn12")
    protected boolean mnuOptOn12;
    @XmlElement(name = "MnuOptOn13")
    protected boolean mnuOptOn13;
    @XmlElement(name = "MnuOptOn14")
    protected boolean mnuOptOn14;
    @XmlElement(name = "MnuOptOn15")
    protected boolean mnuOptOn15;
    @XmlElement(name = "MnuOptOn16")
    protected boolean mnuOptOn16;
    @XmlElement(name = "MnuOptOn17")
    protected boolean mnuOptOn17;
    @XmlElement(name = "MnuOptOn18")
    protected boolean mnuOptOn18;
    @XmlElement(name = "MnuOptOn19")
    protected boolean mnuOptOn19;

    /**
     * Gets the value of the profID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProfID() {
        return profID;
    }

    /**
     * Sets the value of the profID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProfID(Integer value) {
        this.profID = value;
    }

    /**
     * Gets the value of the mnuNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnuNo() {
        return mnuNo;
    }

    /**
     * Sets the value of the mnuNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnuNo(String value) {
        this.mnuNo = value;
    }

    /**
     * Gets the value of the mnuOptOn1 property.
     * 
     */
    public boolean isMnuOptOn1() {
        return mnuOptOn1;
    }

    /**
     * Sets the value of the mnuOptOn1 property.
     * 
     */
    public void setMnuOptOn1(boolean value) {
        this.mnuOptOn1 = value;
    }

    /**
     * Gets the value of the mnuOptOn2 property.
     * 
     */
    public boolean isMnuOptOn2() {
        return mnuOptOn2;
    }

    /**
     * Sets the value of the mnuOptOn2 property.
     * 
     */
    public void setMnuOptOn2(boolean value) {
        this.mnuOptOn2 = value;
    }

    /**
     * Gets the value of the mnuOptOn3 property.
     * 
     */
    public boolean isMnuOptOn3() {
        return mnuOptOn3;
    }

    /**
     * Sets the value of the mnuOptOn3 property.
     * 
     */
    public void setMnuOptOn3(boolean value) {
        this.mnuOptOn3 = value;
    }

    /**
     * Gets the value of the mnuOptOn4 property.
     * 
     */
    public boolean isMnuOptOn4() {
        return mnuOptOn4;
    }

    /**
     * Sets the value of the mnuOptOn4 property.
     * 
     */
    public void setMnuOptOn4(boolean value) {
        this.mnuOptOn4 = value;
    }

    /**
     * Gets the value of the mnuOptOn5 property.
     * 
     */
    public boolean isMnuOptOn5() {
        return mnuOptOn5;
    }

    /**
     * Sets the value of the mnuOptOn5 property.
     * 
     */
    public void setMnuOptOn5(boolean value) {
        this.mnuOptOn5 = value;
    }

    /**
     * Gets the value of the mnuOptOn6 property.
     * 
     */
    public boolean isMnuOptOn6() {
        return mnuOptOn6;
    }

    /**
     * Sets the value of the mnuOptOn6 property.
     * 
     */
    public void setMnuOptOn6(boolean value) {
        this.mnuOptOn6 = value;
    }

    /**
     * Gets the value of the mnuOptOn7 property.
     * 
     */
    public boolean isMnuOptOn7() {
        return mnuOptOn7;
    }

    /**
     * Sets the value of the mnuOptOn7 property.
     * 
     */
    public void setMnuOptOn7(boolean value) {
        this.mnuOptOn7 = value;
    }

    /**
     * Gets the value of the mnuOptOn8 property.
     * 
     */
    public boolean isMnuOptOn8() {
        return mnuOptOn8;
    }

    /**
     * Sets the value of the mnuOptOn8 property.
     * 
     */
    public void setMnuOptOn8(boolean value) {
        this.mnuOptOn8 = value;
    }

    /**
     * Gets the value of the mnuOptOn9 property.
     * 
     */
    public boolean isMnuOptOn9() {
        return mnuOptOn9;
    }

    /**
     * Sets the value of the mnuOptOn9 property.
     * 
     */
    public void setMnuOptOn9(boolean value) {
        this.mnuOptOn9 = value;
    }

    /**
     * Gets the value of the mnuOptOn10 property.
     * 
     */
    public boolean isMnuOptOn10() {
        return mnuOptOn10;
    }

    /**
     * Sets the value of the mnuOptOn10 property.
     * 
     */
    public void setMnuOptOn10(boolean value) {
        this.mnuOptOn10 = value;
    }

    /**
     * Gets the value of the mnuOptOn11 property.
     * 
     */
    public boolean isMnuOptOn11() {
        return mnuOptOn11;
    }

    /**
     * Sets the value of the mnuOptOn11 property.
     * 
     */
    public void setMnuOptOn11(boolean value) {
        this.mnuOptOn11 = value;
    }

    /**
     * Gets the value of the mnuOptOn12 property.
     * 
     */
    public boolean isMnuOptOn12() {
        return mnuOptOn12;
    }

    /**
     * Sets the value of the mnuOptOn12 property.
     * 
     */
    public void setMnuOptOn12(boolean value) {
        this.mnuOptOn12 = value;
    }

    /**
     * Gets the value of the mnuOptOn13 property.
     * 
     */
    public boolean isMnuOptOn13() {
        return mnuOptOn13;
    }

    /**
     * Sets the value of the mnuOptOn13 property.
     * 
     */
    public void setMnuOptOn13(boolean value) {
        this.mnuOptOn13 = value;
    }

    /**
     * Gets the value of the mnuOptOn14 property.
     * 
     */
    public boolean isMnuOptOn14() {
        return mnuOptOn14;
    }

    /**
     * Sets the value of the mnuOptOn14 property.
     * 
     */
    public void setMnuOptOn14(boolean value) {
        this.mnuOptOn14 = value;
    }

    /**
     * Gets the value of the mnuOptOn15 property.
     * 
     */
    public boolean isMnuOptOn15() {
        return mnuOptOn15;
    }

    /**
     * Sets the value of the mnuOptOn15 property.
     * 
     */
    public void setMnuOptOn15(boolean value) {
        this.mnuOptOn15 = value;
    }

    /**
     * Gets the value of the mnuOptOn16 property.
     * 
     */
    public boolean isMnuOptOn16() {
        return mnuOptOn16;
    }

    /**
     * Sets the value of the mnuOptOn16 property.
     * 
     */
    public void setMnuOptOn16(boolean value) {
        this.mnuOptOn16 = value;
    }

    /**
     * Gets the value of the mnuOptOn17 property.
     * 
     */
    public boolean isMnuOptOn17() {
        return mnuOptOn17;
    }

    /**
     * Sets the value of the mnuOptOn17 property.
     * 
     */
    public void setMnuOptOn17(boolean value) {
        this.mnuOptOn17 = value;
    }

    /**
     * Gets the value of the mnuOptOn18 property.
     * 
     */
    public boolean isMnuOptOn18() {
        return mnuOptOn18;
    }

    /**
     * Sets the value of the mnuOptOn18 property.
     * 
     */
    public void setMnuOptOn18(boolean value) {
        this.mnuOptOn18 = value;
    }

    /**
     * Gets the value of the mnuOptOn19 property.
     * 
     */
    public boolean isMnuOptOn19() {
        return mnuOptOn19;
    }

    /**
     * Sets the value of the mnuOptOn19 property.
     * 
     */
    public void setMnuOptOn19(boolean value) {
        this.mnuOptOn19 = value;
    }

}
