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
 * <p>
 * The details of the fleet error.
 * </p>
 */
public class FleetError implements Serializable, Cloneable {

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message generated when the fleet has errors.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     * 
     * @param errorCode
     *        The error code for the fleet error.
     * @see FleetErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     * 
     * @return The error code for the fleet error.
     * @see FleetErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     * 
     * @param errorCode
     *        The error code for the fleet error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetErrorCode
     */

    public FleetError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     * 
     * @param errorCode
     *        The error code for the fleet error.
     * @see FleetErrorCode
     */

    public void setErrorCode(FleetErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The error code for the fleet error.
     * </p>
     * 
     * @param errorCode
     *        The error code for the fleet error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetErrorCode
     */

    public FleetError withErrorCode(FleetErrorCode errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message generated when the fleet has errors.
     * </p>
     * 
     * @param errorMessage
     *        The error message generated when the fleet has errors.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message generated when the fleet has errors.
     * </p>
     * 
     * @return The error message generated when the fleet has errors.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message generated when the fleet has errors.
     * </p>
     * 
     * @param errorMessage
     *        The error message generated when the fleet has errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetError == false)
            return false;
        FleetError other = (FleetError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FleetError clone() {
        try {
            return (FleetError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
