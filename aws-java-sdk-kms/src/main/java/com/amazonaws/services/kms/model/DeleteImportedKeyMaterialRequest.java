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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteImportedKeyMaterialRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     *        <code>EXTERNAL</code>.</p>
     *        <p>
     *        A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     *         <code>EXTERNAL</code>.</p>
     *         <p>
     *         A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The identifier of the CMK whose key material to delete. The CMK's <code>Origin</code> must be
     *        <code>EXTERNAL</code>.</p>
     *        <p>
     *        A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImportedKeyMaterialRequest withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImportedKeyMaterialRequest == false)
            return false;
        DeleteImportedKeyMaterialRequest other = (DeleteImportedKeyMaterialRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteImportedKeyMaterialRequest clone() {
        return (DeleteImportedKeyMaterialRequest) super.clone();
    }
}
