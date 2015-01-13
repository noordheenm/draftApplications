//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 10:09:37 PM EET 
//


package ilkerkonar.com.products.product_query_web_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="developer"/>
 *     &lt;enumeration value="architect"/>
 *     &lt;enumeration value="manager"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonType")
@XmlEnum
public enum PersonType {

    @XmlEnumValue("developer")
    DEVELOPER("developer"),
    @XmlEnumValue("architect")
    ARCHITECT("architect"),
    @XmlEnumValue("manager")
    MANAGER("manager");
    private final String value;

    PersonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonType fromValue(String v) {
        for (PersonType c: PersonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
