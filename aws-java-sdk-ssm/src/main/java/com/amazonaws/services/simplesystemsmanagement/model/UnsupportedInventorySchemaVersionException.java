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

/**
 * <p>
 * Inventory item type schema version has to match supported versions in the service. Check output of
 * <code>GetInventorySchema</code> to see the available schema version for each type.
 * </p>
 */
public class UnsupportedInventorySchemaVersionException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnsupportedInventorySchemaVersionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedInventorySchemaVersionException(String message) {
        super(message);
    }

}
