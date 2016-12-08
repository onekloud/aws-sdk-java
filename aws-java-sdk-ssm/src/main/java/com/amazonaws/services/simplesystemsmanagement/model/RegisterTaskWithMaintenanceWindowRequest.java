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
public class RegisterTaskWithMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the Maintenance Window the task should be added to.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The ARN of the task to execute
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The role that should be assumed when executing the task.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The type of task being registered.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;
    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     * </p>
     */
    private LoggingInfo loggingInfo;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The id of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @param windowId
     *        The id of the Maintenance Window the task should be added to.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The id of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @return The id of the Maintenance Window the task should be added to.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The id of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @param windowId
     *        The id of the Maintenance Window the task should be added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @return The targets (either instances or tags). Instances are specified using
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
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). Instances are specified using
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
     * The targets (either instances or tags). Instances are specified using
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
     *        The targets (either instances or tags). Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTargets(Target... targets) {
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
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The ARN of the task to execute
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to execute
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task to execute
     * </p>
     * 
     * @return The ARN of the task to execute
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task to execute
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to execute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task.
     * </p>
     * 
     * @param serviceRoleArn
     *        The role that should be assumed when executing the task.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task.
     * </p>
     * 
     * @return The role that should be assumed when executing the task.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task.
     * </p>
     * 
     * @param serviceRoleArn
     *        The role that should be assumed when executing the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @return The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskType(MaintenanceWindowTaskType taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @return The parameters that should be passed to the task when it is executed.
     */

    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @param taskParameters
     *        The parameters that should be passed to the task when it is executed.
     */

    public void setTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @param taskParameters
     *        The parameters that should be passed to the task when it is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    public RegisterTaskWithMaintenanceWindowRequest addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
        if (null == this.taskParameters) {
            this.taskParameters = new java.util.HashMap<String, MaintenanceWindowTaskParameterValueExpression>();
        }
        if (this.taskParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in
     *        a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in
     *        parallel.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @return The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks
     *         in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled
     *         in parallel.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in
     *        a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in
     *        parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets this task can be run for in parallel.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @return The maximum number of targets this task can be run for in parallel.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets this task can be run for in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before this task stops being scheduled.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @return The maximum number of errors allowed before this task stops being scheduled.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before this task stops being scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     * </p>
     * 
     * @param loggingInfo
     *        A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     * </p>
     * 
     * @return A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * <p>
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     * </p>
     * 
     * @param loggingInfo
     *        A structure containing information about an Amazon S3 bucket to write instance-level logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTaskType() != null)
            sb.append("TaskType: " + getTaskType() + ",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: " + getTaskParameters() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskWithMaintenanceWindowRequest == false)
            return false;
        RegisterTaskWithMaintenanceWindowRequest other = (RegisterTaskWithMaintenanceWindowRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskWithMaintenanceWindowRequest clone() {
        return (RegisterTaskWithMaintenanceWindowRequest) super.clone();
    }
}
