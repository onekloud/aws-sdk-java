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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version for which you want information.
     * </p>
     */
    private String documentVersion;

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @return The name of the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * 
     * @param documentVersion
     *        The document version for which you want information.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * 
     * @return The document version for which you want information.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * 
     * @param documentVersion
     *        The document version for which you want information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentRequest == false)
            return false;
        GetDocumentRequest other = (GetDocumentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentRequest clone() {
        return (GetDocumentRequest) super.clone();
    }
}
