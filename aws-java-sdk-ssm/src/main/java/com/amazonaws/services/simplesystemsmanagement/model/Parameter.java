/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * An Amazon EC2 Systems Manager parameter in Parameter Store.
 * </p>
 */
public class Parameter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The parameter value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @return The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @see ParameterType
     */

    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of parameter. Valid values include the following: String, String list, Secure string.
     * </p>
     * 
     * @param type
     *        The type of parameter. Valid values include the following: String, String list, Secure string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public Parameter withType(ParameterType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @return The parameter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * 
     * @param value
     *        The parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
