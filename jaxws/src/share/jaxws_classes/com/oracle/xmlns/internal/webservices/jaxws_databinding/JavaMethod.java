/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.oracle.xmlns.internal.webservices.jaxws_databinding;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This file was generated by JAXB-RI v2.2.6 and afterwards modified
 * to implement appropriate Annotation
 *
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xmlns.oracle.com/webservices/jaxws-databinding}method-annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="java-params" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://xmlns.oracle.com/webservices/jaxws-databinding}java-param" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "methodAnnotation",
    "javaParams"
})
@XmlRootElement(name = "java-method")
public class JavaMethod {

    @XmlElementRefs({
        @XmlElementRef(name = "web-endpoint", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlWebEndpoint.class, required = false),
        @XmlElementRef(name = "oneway", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlOneway.class, required = false),
        @XmlElementRef(name = "action", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlAction.class, required = false),
        @XmlElementRef(name = "soap-binding", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlSOAPBinding.class, required = false),
        @XmlElementRef(name = "web-result", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlWebResult.class, required = false),
        @XmlElementRef(name = "web-method", namespace = "http://xmlns.oracle.com/webservices/jaxws-databinding", type = XmlWebMethod.class, required = false)
    })
    @XmlAnyElement
    protected List<Object> methodAnnotation;
    @XmlElement(name = "java-params")
    protected JavaMethod.JavaParams javaParams;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the methodAnnotation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodAnnotation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodAnnotation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlWebEndpoint }
     * {@link XmlOneway }
     * {@link XmlAction }
     * {@link XmlSOAPBinding }
     * {@link XmlWebResult }
     * {@link XmlWebMethod }
     * {@link Element }
     *
     *
     */
    public List<Object> getMethodAnnotation() {
        if (methodAnnotation == null) {
            methodAnnotation = new ArrayList<Object>();
        }
        return this.methodAnnotation;
    }

    /**
     * Gets the value of the javaParams property.
     *
     * @return
     *     possible object is
     *     {@link JavaMethod.JavaParams }
     *
     */
    public JavaMethod.JavaParams getJavaParams() {
        return javaParams;
    }

    /**
     * Sets the value of the javaParams property.
     *
     * @param value
     *     allowed object is
     *     {@link JavaMethod.JavaParams }
     *
     */
    public void setJavaParams(JavaMethod.JavaParams value) {
        this.javaParams = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://xmlns.oracle.com/webservices/jaxws-databinding}java-param" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "javaParam"
    })
    public static class JavaParams {

        @XmlElement(name = "java-param", required = true)
        protected List<JavaParam> javaParam;

        /**
         * Gets the value of the javaParam property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the javaParam property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJavaParam().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JavaParam }
         *
         *
         */
        public List<JavaParam> getJavaParam() {
            if (javaParam == null) {
                javaParam = new ArrayList<JavaParam>();
            }
            return this.javaParam;
        }

    }

}
