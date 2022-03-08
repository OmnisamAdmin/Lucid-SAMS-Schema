
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Problem1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem3" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem4" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem5" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem6" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Problem7" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "learnerID",
    "problem1",
    "problem2",
    "problem3",
    "problem4",
    "problem5",
    "problem6",
    "problem7",
    "dataYear"
})
@XmlRootElement(name = "SIAS_Learner_Profile")
public class SIASLearnerProfile {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Problem1")
    protected boolean problem1;
    @XmlElement(name = "Problem2")
    protected boolean problem2;
    @XmlElement(name = "Problem3")
    protected boolean problem3;
    @XmlElement(name = "Problem4")
    protected boolean problem4;
    @XmlElement(name = "Problem5")
    protected boolean problem5;
    @XmlElement(name = "Problem6")
    protected boolean problem6;
    @XmlElement(name = "Problem7")
    protected boolean problem7;
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
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerID(String value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the problem1 property.
     * 
     */
    public boolean isProblem1() {
        return problem1;
    }

    /**
     * Sets the value of the problem1 property.
     * 
     */
    public void setProblem1(boolean value) {
        this.problem1 = value;
    }

    /**
     * Gets the value of the problem2 property.
     * 
     */
    public boolean isProblem2() {
        return problem2;
    }

    /**
     * Sets the value of the problem2 property.
     * 
     */
    public void setProblem2(boolean value) {
        this.problem2 = value;
    }

    /**
     * Gets the value of the problem3 property.
     * 
     */
    public boolean isProblem3() {
        return problem3;
    }

    /**
     * Sets the value of the problem3 property.
     * 
     */
    public void setProblem3(boolean value) {
        this.problem3 = value;
    }

    /**
     * Gets the value of the problem4 property.
     * 
     */
    public boolean isProblem4() {
        return problem4;
    }

    /**
     * Sets the value of the problem4 property.
     * 
     */
    public void setProblem4(boolean value) {
        this.problem4 = value;
    }

    /**
     * Gets the value of the problem5 property.
     * 
     */
    public boolean isProblem5() {
        return problem5;
    }

    /**
     * Sets the value of the problem5 property.
     * 
     */
    public void setProblem5(boolean value) {
        this.problem5 = value;
    }

    /**
     * Gets the value of the problem6 property.
     * 
     */
    public boolean isProblem6() {
        return problem6;
    }

    /**
     * Sets the value of the problem6 property.
     * 
     */
    public void setProblem6(boolean value) {
        this.problem6 = value;
    }

    /**
     * Gets the value of the problem7 property.
     * 
     */
    public boolean isProblem7() {
        return problem7;
    }

    /**
     * Sets the value of the problem7 property.
     * 
     */
    public void setProblem7(boolean value) {
        this.problem7 = value;
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
