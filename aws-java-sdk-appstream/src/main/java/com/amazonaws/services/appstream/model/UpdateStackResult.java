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
public class UpdateStackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of stack details.
     * </p>
     */
    private Stack stack;

    /**
     * <p>
     * A list of stack details.
     * </p>
     * 
     * @param stack
     *        A list of stack details.
     */

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    /**
     * <p>
     * A list of stack details.
     * </p>
     * 
     * @return A list of stack details.
     */

    public Stack getStack() {
        return this.stack;
    }

    /**
     * <p>
     * A list of stack details.
     * </p>
     * 
     * @param stack
     *        A list of stack details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackResult withStack(Stack stack) {
        setStack(stack);
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
        if (getStack() != null)
            sb.append("Stack: " + getStack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackResult == false)
            return false;
        UpdateStackResult other = (UpdateStackResult) obj;
        if (other.getStack() == null ^ this.getStack() == null)
            return false;
        if (other.getStack() != null && other.getStack().equals(this.getStack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStack() == null) ? 0 : getStack().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackResult clone() {
        try {
            return (UpdateStackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
