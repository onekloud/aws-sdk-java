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
public class SendCommandRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     * combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in
     * the call. For more information about how to use <code>Targets</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * Required. The name of the SSM document to execute. This can be an SSM public document or a custom document.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String documentHash;
    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String documentHashType;
    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute.
     * </p>
     */
    private Integer timeoutSeconds;
    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The required and optional parameters specified in the SSM document being executed.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The default
     * value is the region where Run Command is being called.
     * </p>
     */
    private String outputS3Region;
    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to execute the command at the same time. You can
     * specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more information about
     * how to use <code>MaxConcurrency</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of <code>MaxErrors</code>, the systems stops sending the command to additional targets. You can specify a
     * number like “10” or a percentage like “10%”. The default value is 50. For more information about how to use
     * <code>MaxErrors</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>
     * Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * </p>
     * 
     * @return Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * </p>
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * </p>
     * 
     * @param instanceIds
     *        Required. The instance IDs where the command should execute. You can specify a maximum of 50 IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     * combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in
     * the call. For more information about how to use <code>Targets</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @return (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     *         combination that you specify. <code>Targets</code> is required if you don't provide one or more instance
     *         IDs in the call. For more information about how to use <code>Targets</code>, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Linux) or <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Windows).
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     * combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in
     * the call. For more information about how to use <code>Targets</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     *        combination that you specify. <code>Targets</code> is required if you don't provide one or more instance
     *        IDs in the call. For more information about how to use <code>Targets</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
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
     * (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     * combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in
     * the call. For more information about how to use <code>Targets</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     *        combination that you specify. <code>Targets</code> is required if you don't provide one or more instance
     *        IDs in the call. For more information about how to use <code>Targets</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTargets(Target... targets) {
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
     * (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     * combination that you specify. <code>Targets</code> is required if you don't provide one or more instance IDs in
     * the call. For more information about how to use <code>Targets</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a <code>Key</code>;<code>Value</code>
     *        combination that you specify. <code>Targets</code> is required if you don't provide one or more instance
     *        IDs in the call. For more information about how to use <code>Targets</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Required. The name of the SSM document to execute. This can be an SSM public document or a custom document.
     * </p>
     * 
     * @param documentName
     *        Required. The name of the SSM document to execute. This can be an SSM public document or a custom
     *        document.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * Required. The name of the SSM document to execute. This can be an SSM public document or a custom document.
     * </p>
     * 
     * @return Required. The name of the SSM document to execute. This can be an SSM public document or a custom
     *         document.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * Required. The name of the SSM document to execute. This can be an SSM public document or a custom document.
     * </p>
     * 
     * @param documentName
     *        Required. The name of the SSM document to execute. This can be an SSM public document or a custom
     *        document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     */

    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     */

    public String getDocumentHash() {
        return this.documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withDocumentHash(String documentHash) {
        setDocumentHash(documentHash);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return Sha256 or Sha1.</p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     * @see DocumentHashType
     */

    public String getDocumentHashType() {
        return this.documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public SendCommandRequest withDocumentHashType(String documentHashType) {
        setDocumentHashType(documentHashType);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public SendCommandRequest withDocumentHashType(DocumentHashType documentHashType) {
        setDocumentHashType(documentHashType);
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started executing, it will not execute.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute.
     * </p>
     * 
     * @return If this time is reached and the command has not already started executing, it will not execute.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started executing, it will not execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @return User-specified information about the command, such as a brief description of what the command should do.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The required and optional parameters specified in the SSM document being executed.
     * </p>
     * 
     * @return The required and optional parameters specified in the SSM document being executed.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the SSM document being executed.
     * </p>
     * 
     * @param parameters
     *        The required and optional parameters specified in the SSM document being executed.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the SSM document being executed.
     * </p>
     * 
     * @param parameters
     *        The required and optional parameters specified in the SSM document being executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public SendCommandRequest addParametersEntry(String key, java.util.List<String> value) {
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

    public SendCommandRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The default
     * value is the region where Run Command is being called.
     * </p>
     * 
     * @param outputS3Region
     *        (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The
     *        default value is the region where Run Command is being called.
     */

    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The default
     * value is the region where Run Command is being called.
     * </p>
     * 
     * @return (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The
     *         default value is the region where Run Command is being called.
     */

    public String getOutputS3Region() {
        return this.outputS3Region;
    }

    /**
     * <p>
     * (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The default
     * value is the region where Run Command is being called.
     * </p>
     * 
     * @param outputS3Region
     *        (Optional) The region where the Amazon Simple Storage Service (Amazon S3) output bucket is located. The
     *        default value is the region where Run Command is being called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3Region(String outputS3Region) {
        setOutputS3Region(outputS3Region);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should be stored.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @return The name of the S3 bucket where command execution responses should be stored.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses should be stored.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @return The directory structure within the S3 bucket where the responses should be stored.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses should be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to execute the command at the same time. You can
     * specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more information about
     * how to use <code>MaxConcurrency</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param maxConcurrency
     *        (Optional) The maximum number of instances that are allowed to execute the command at the same time. You
     *        can specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more
     *        information about how to use <code>MaxConcurrency</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to execute the command at the same time. You can
     * specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more information about
     * how to use <code>MaxConcurrency</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @return (Optional) The maximum number of instances that are allowed to execute the command at the same time. You
     *         can specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more
     *         information about how to use <code>MaxConcurrency</code>, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Linux) or <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Windows).
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to execute the command at the same time. You can
     * specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more information about
     * how to use <code>MaxConcurrency</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param maxConcurrency
     *        (Optional) The maximum number of instances that are allowed to execute the command at the same time. You
     *        can specify a number such as “10” or a percentage such as “10%”. The default value is 50. For more
     *        information about how to use <code>MaxConcurrency</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of <code>MaxErrors</code>, the systems stops sending the command to additional targets. You can specify a
     * number like “10” or a percentage like “10%”. The default value is 50. For more information about how to use
     * <code>MaxErrors</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed without the command failing. When the command fails one more time
     *        beyond the value of <code>MaxErrors</code>, the systems stops sending the command to additional targets.
     *        You can specify a number like “10” or a percentage like “10%”. The default value is 50. For more
     *        information about how to use <code>MaxErrors</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of <code>MaxErrors</code>, the systems stops sending the command to additional targets. You can specify a
     * number like “10” or a percentage like “10%”. The default value is 50. For more information about how to use
     * <code>MaxErrors</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @return The maximum number of errors allowed without the command failing. When the command fails one more time
     *         beyond the value of <code>MaxErrors</code>, the systems stops sending the command to additional targets.
     *         You can specify a number like “10” or a percentage like “10%”. The default value is 50. For more
     *         information about how to use <code>MaxErrors</code>, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Linux) or <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *         Amazon EC2 Run Command</a> (Windows).
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of <code>MaxErrors</code>, the systems stops sending the command to additional targets. You can specify a
     * number like “10” or a percentage like “10%”. The default value is 50. For more information about how to use
     * <code>MaxErrors</code>, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using Amazon EC2
     * Run Command</a> (Linux) or <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using Amazon
     * EC2 Run Command</a> (Windows).
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed without the command failing. When the command fails one more time
     *        beyond the value of <code>MaxErrors</code>, the systems stops sending the command to additional targets.
     *        You can specify a number like “10” or a percentage like “10%”. The default value is 50. For more
     *        information about how to use <code>MaxErrors</code>, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Linux) or <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/run-command.html">Executing a Command Using
     *        Amazon EC2 Run Command</a> (Windows).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM role that Systems Manager uses to send notifications.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @return The IAM role that Systems Manager uses to send notifications.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM role that Systems Manager uses to send notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @return Configurations for sending notifications.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withNotificationConfig(NotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentHash() != null)
            sb.append("DocumentHash: " + getDocumentHash() + ",");
        if (getDocumentHashType() != null)
            sb.append("DocumentHashType: " + getDocumentHashType() + ",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: " + getTimeoutSeconds() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: " + getOutputS3Region() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: " + getNotificationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentHash() == null ^ this.getDocumentHash() == null)
            return false;
        if (other.getDocumentHash() != null && other.getDocumentHash().equals(this.getDocumentHash()) == false)
            return false;
        if (other.getDocumentHashType() == null ^ this.getDocumentHashType() == null)
            return false;
        if (other.getDocumentHashType() != null && other.getDocumentHashType().equals(this.getDocumentHashType()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null)
            return false;
        if (other.getOutputS3Region() != null && other.getOutputS3Region().equals(this.getOutputS3Region()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentHash() == null) ? 0 : getDocumentHash().hashCode());
        hashCode = prime * hashCode + ((getDocumentHashType() == null) ? 0 : getDocumentHashType().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        return hashCode;
    }

    @Override
    public SendCommandRequest clone() {
        return (SendCommandRequest) super.clone();
    }
}
