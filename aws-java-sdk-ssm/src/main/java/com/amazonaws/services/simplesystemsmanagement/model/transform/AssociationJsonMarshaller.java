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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssociationMarshaller
 */
public class AssociationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Association association, StructuredJsonGenerator jsonGenerator) {

        if (association == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (association.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(association.getName());
            }
            if (association.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(association.getInstanceId());
            }
            if (association.getAssociationId() != null) {
                jsonGenerator.writeFieldName("AssociationId").writeValue(association.getAssociationId());
            }
            if (association.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(association.getDocumentVersion());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) association.getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (association.getLastExecutionDate() != null) {
                jsonGenerator.writeFieldName("LastExecutionDate").writeValue(association.getLastExecutionDate());
            }
            if (association.getOverview() != null) {
                jsonGenerator.writeFieldName("Overview");
                AssociationOverviewJsonMarshaller.getInstance().marshall(association.getOverview(), jsonGenerator);
            }
            if (association.getScheduleExpression() != null) {
                jsonGenerator.writeFieldName("ScheduleExpression").writeValue(association.getScheduleExpression());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssociationJsonMarshaller instance;

    public static AssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociationJsonMarshaller();
        return instance;
    }

}
