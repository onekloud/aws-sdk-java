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
 * 
 */
public class GetDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The contents of the SSM document.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The document type.
     * </p>
     */
    private String documentType;

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

    public GetDocumentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @return The document version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentResult withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The contents of the SSM document.
     * </p>
     * 
     * @param content
     *        The contents of the SSM document.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of the SSM document.
     * </p>
     * 
     * @return The contents of the SSM document.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The contents of the SSM document.
     * </p>
     * 
     * @param content
     *        The contents of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentResult withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @see DocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @return The document type.
     * @see DocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public GetDocumentResult withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @see DocumentType
     */

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public GetDocumentResult withDocumentType(DocumentType documentType) {
        setDocumentType(documentType);
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
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentResult == false)
            return false;
        GetDocumentResult other = (GetDocumentResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentResult clone() {
        try {
            return (GetDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
