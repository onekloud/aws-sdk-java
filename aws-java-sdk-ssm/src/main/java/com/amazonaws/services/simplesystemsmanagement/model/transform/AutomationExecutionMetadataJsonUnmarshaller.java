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
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomationExecutionMetadata JSON Unmarshaller
 */
public class AutomationExecutionMetadataJsonUnmarshaller implements Unmarshaller<AutomationExecutionMetadata, JsonUnmarshallerContext> {

    public AutomationExecutionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationExecutionMetadata automationExecutionMetadata = new AutomationExecutionMetadata();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AutomationExecutionId", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomationExecutionStatus", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setAutomationExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartTime", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setExecutionStartTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionEndTime", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setExecutionEndTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("ExecutedBy", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setExecutedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFile", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setLogFile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    context.nextToken();
                    automationExecutionMetadata.setOutputs(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return automationExecutionMetadata;
    }

    private static AutomationExecutionMetadataJsonUnmarshaller instance;

    public static AutomationExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
