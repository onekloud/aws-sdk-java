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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an existing documentation part of an API.
 * </p>
 */
public class DeleteDocumentationPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The identifier of the to-be-deleted documentation part.
     * </p>
     */
    private String documentationPartId;

    /**
     * <p>
     * [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     * </p>
     * 
     * @param restApiId
     *        [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     * </p>
     * 
     * @return [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     * </p>
     * 
     * @param restApiId
     *        [Required] Specifies the identifier of an API of the to-be-deleted documentation part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentationPartRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The identifier of the to-be-deleted documentation part.
     * </p>
     * 
     * @param documentationPartId
     *        [Required] The identifier of the to-be-deleted documentation part.
     */

    public void setDocumentationPartId(String documentationPartId) {
        this.documentationPartId = documentationPartId;
    }

    /**
     * <p>
     * [Required] The identifier of the to-be-deleted documentation part.
     * </p>
     * 
     * @return [Required] The identifier of the to-be-deleted documentation part.
     */

    public String getDocumentationPartId() {
        return this.documentationPartId;
    }

    /**
     * <p>
     * [Required] The identifier of the to-be-deleted documentation part.
     * </p>
     * 
     * @param documentationPartId
     *        [Required] The identifier of the to-be-deleted documentation part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentationPartRequest withDocumentationPartId(String documentationPartId) {
        setDocumentationPartId(documentationPartId);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getDocumentationPartId() != null)
            sb.append("DocumentationPartId: " + getDocumentationPartId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDocumentationPartRequest == false)
            return false;
        DeleteDocumentationPartRequest other = (DeleteDocumentationPartRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDocumentationPartId() == null ^ this.getDocumentationPartId() == null)
            return false;
        if (other.getDocumentationPartId() != null && other.getDocumentationPartId().equals(this.getDocumentationPartId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getDocumentationPartId() == null) ? 0 : getDocumentationPartId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDocumentationPartRequest clone() {
        return (DeleteDocumentationPartRequest) super.clone();
    }
}
