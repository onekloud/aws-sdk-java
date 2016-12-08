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
 * Information about parameter usage.
 * </p>
 */
public class ParameterHistory implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter used.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     */
    private String lastModifiedUser;
    /**
     * <p>
     * Information about the parameter.
     * </p>
     */
    private String description;
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

    public ParameterHistory withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @return The type of parameter used.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public ParameterHistory withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @see ParameterType
     */

    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of parameter used.
     * </p>
     * 
     * @param type
     *        The type of parameter used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public ParameterHistory withType(ParameterType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @param keyId
     *        The ID of the query key used for this parameter.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @return The ID of the query key used for this parameter.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * 
     * @param keyId
     *        The ID of the query key used for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @return Date the parameter was last changed or updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date the parameter was last changed or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @param lastModifiedUser
     *        Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     */

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     */

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * </p>
     * 
     * @param lastModifiedUser
     *        Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withLastModifiedUser(String lastModifiedUser) {
        setLastModifiedUser(lastModifiedUser);
        return this;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @param description
     *        Information about the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @return Information about the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the parameter.
     * </p>
     * 
     * @param description
     *        Information about the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterHistory withDescription(String description) {
        setDescription(description);
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

    public ParameterHistory withValue(String value) {
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: " + getLastModifiedUser() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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

        if (obj instanceof ParameterHistory == false)
            return false;
        ParameterHistory other = (ParameterHistory) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterHistory clone() {
        try {
            return (ParameterHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
