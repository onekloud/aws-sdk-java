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

/**
 * 
 */
public class CreateFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details for the created fleet.
     * </p>
     */
    private Fleet fleet;

    /**
     * <p>
     * The details for the created fleet.
     * </p>
     * 
     * @param fleet
     *        The details for the created fleet.
     */

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The details for the created fleet.
     * </p>
     * 
     * @return The details for the created fleet.
     */

    public Fleet getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The details for the created fleet.
     * </p>
     * 
     * @param fleet
     *        The details for the created fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withFleet(Fleet fleet) {
        setFleet(fleet);
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
        if (getFleet() != null)
            sb.append("Fleet: " + getFleet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetResult == false)
            return false;
        CreateFleetResult other = (CreateFleetResult) obj;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetResult clone() {
        try {
            return (CreateFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
