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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateAssociationRequest Marshaller
 */
public class CreateAssociationRequestMarshaller implements Marshaller<Request<CreateAssociationRequest>, CreateAssociationRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateAssociationRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateAssociationRequest> marshall(CreateAssociationRequest createAssociationRequest) {

        if (createAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAssociationRequest> request = new DefaultRequest<CreateAssociationRequest>(createAssociationRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.CreateAssociation");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createAssociationRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createAssociationRequest.getName());
            }
            if (createAssociationRequest.getDocumentVersion() != null) {
                jsonGenerator.writeFieldName("DocumentVersion").writeValue(createAssociationRequest.getDocumentVersion());
            }
            if (createAssociationRequest.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(createAssociationRequest.getInstanceId());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = createAssociationRequest.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String parametersMapValueList : parametersMapValue.getValue()) {
                            if (parametersMapValueList != null) {
                                jsonGenerator.writeValue(parametersMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) createAssociationRequest.getTargets();
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
            if (createAssociationRequest.getScheduleExpression() != null) {
                jsonGenerator.writeFieldName("ScheduleExpression").writeValue(createAssociationRequest.getScheduleExpression());
            }
            if (createAssociationRequest.getOutputLocation() != null) {
                jsonGenerator.writeFieldName("OutputLocation");
                InstanceAssociationOutputLocationJsonMarshaller.getInstance().marshall(createAssociationRequest.getOutputLocation(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
