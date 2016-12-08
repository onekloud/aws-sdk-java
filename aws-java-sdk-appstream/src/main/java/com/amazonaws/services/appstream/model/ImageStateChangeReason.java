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
 * The reason why the last state change occurred.
 * </p>
 */
public class ImageStateChangeReason implements Serializable, Cloneable {

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The state change reason message to the end user.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     * 
     * @param code
     *        The state change reason code of the image.
     * @see ImageStateChangeReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     * 
     * @return The state change reason code of the image.
     * @see ImageStateChangeReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     * 
     * @param code
     *        The state change reason code of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageStateChangeReasonCode
     */

    public ImageStateChangeReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     * 
     * @param code
     *        The state change reason code of the image.
     * @see ImageStateChangeReasonCode
     */

    public void setCode(ImageStateChangeReasonCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The state change reason code of the image.
     * </p>
     * 
     * @param code
     *        The state change reason code of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageStateChangeReasonCode
     */

    public ImageStateChangeReason withCode(ImageStateChangeReasonCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state change reason message to the end user.
     * </p>
     * 
     * @param message
     *        The state change reason message to the end user.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The state change reason message to the end user.
     * </p>
     * 
     * @return The state change reason message to the end user.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The state change reason message to the end user.
     * </p>
     * 
     * @param message
     *        The state change reason message to the end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageStateChangeReason withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageStateChangeReason == false)
            return false;
        ImageStateChangeReason other = (ImageStateChangeReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImageStateChangeReason clone() {
        try {
            return (ImageStateChangeReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
