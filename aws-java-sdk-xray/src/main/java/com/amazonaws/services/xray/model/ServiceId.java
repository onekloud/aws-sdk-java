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
package com.amazonaws.services.xray.model;

import java.io.Serializable;

/**
 * <p>
 * </p>
 */
public class ServiceId implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private String name;
    /**
     * <p>
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * </p>
     */
    private String type;

    /**
     * <p>
     * </p>
     * 
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * </p>
     * 
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceId withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * </p>
     * 
     * @param names
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceId withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param names
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceId withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * </p>
     * 
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceId withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * </p>
     * 
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceId withType(String type) {
        setType(type);
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
        if (getNames() != null)
            sb.append("Names: " + getNames() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceId == false)
            return false;
        ServiceId other = (ServiceId) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ServiceId clone() {
        try {
            return (ServiceId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
