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
public class CreateAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The targets (either instances or tags) for the association. Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * A cron expression when the association will be applied to the target(s). Supported expressions are every half, 1,
     * 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *) to run
     * every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run every
     * Sunday at 10 a.m.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request. For example:
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;

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

    public CreateAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @return The document version you want to associate with the target(s). Can be a specific version or the default
     *         version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @return The parameters for the documents runtime configuration.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the documents runtime configuration.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the documents runtime configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public CreateAssociationRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association. Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @return The targets (either instances or tags) for the association. Instances are specified using
     *         Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *         name&gt;,Values=&lt;tag value&gt;.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association. Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association. Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association. Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association. Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association. Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association. Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s). Supported expressions are every half, 1,
     * 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *) to run
     * every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run every
     * Sunday at 10 a.m.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s). Supported expressions are every
     *        half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 *
     *        ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN
     *        *) to run every Sunday at 10 a.m.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s). Supported expressions are every half, 1,
     * 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *) to run
     * every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run every
     * Sunday at 10 a.m.
     * </p>
     * 
     * @return A cron expression when the association will be applied to the target(s). Supported expressions are every
     *         half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1
     *         * ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? *
     *         SUN *) to run every Sunday at 10 a.m.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s). Supported expressions are every half, 1,
     * 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *) to run
     * every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run every
     * Sunday at 10 a.m.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s). Supported expressions are every
     *        half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 *
     *        ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN
     *        *) to run every Sunday at 10 a.m.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request. For example:
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the output details of the request. For example:</p>
     *        <p>
     *        <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request. For example:
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @return An Amazon S3 bucket where you want to store the output details of the request. For example:</p>
     *         <p>
     *         <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request. For example:
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the output details of the request. For example:</p>
     *        <p>
     *        <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationRequest == false)
            return false;
        CreateAssociationRequest other = (CreateAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationRequest clone() {
        return (CreateAssociationRequest) super.clone();
    }
}
