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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the stack to update.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The name displayed to end users on the AppStream 2.0 portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The description displayed to end users on the AppStream 2.0 portal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the stack to update.
     * </p>
     * 
     * @param name
     *        The name of the stack to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stack to update.
     * </p>
     * 
     * @return The name of the stack to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stack to update.
     * </p>
     * 
     * @param name
     *        The name of the stack to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withName(String name) {
        setName(name);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackRequest == false)
            return false;
        UpdateStackRequest other = (UpdateStackRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackRequest clone() {
        return (UpdateStackRequest) super.clone();
    }
}
