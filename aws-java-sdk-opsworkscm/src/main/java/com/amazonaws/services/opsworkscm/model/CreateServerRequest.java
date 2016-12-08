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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     */
    private Boolean disableAutomatedBackup;
    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code>.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine model, or option. Valid values include <code>Single</code>.
     * </p>
     */
    private String engineModel;
    /**
     * <p>
     * The major release version of the engine that you want to use. Values depend on the engine that you choose.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for Chef
     * Automate. This private key is required to access the Chef API.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;
    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for Chef
     * Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     */
    private Integer backupRetentionCount;
    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32 characters.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     * service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the instance profile you need.
     * </p>
     */
    private String instanceProfileArn;
    /**
     * <p>
     * The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your instances by
     * using SSH.
     * </p>
     */
    private String keyPair;
    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs maintenance
     * on the instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     * time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday,
     * or Friday. See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up application-level data
     * on your server if backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that uses TCP
     * ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account. Although
     * the AWS OpsWorks console typically creates the service role for you, in this release of AWS OpsWorks for Chef
     * Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the service role that you need.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a href=
     * "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a>.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup represented by
     * BackupId.
     * </p>
     */
    private String backupId;

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default
     *        value is <code>true</code>.
     */

    public void setDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The
     *         default value is <code>true</code>.
     */

    public Boolean getDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default
     *        value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        setDisableAutomatedBackup(disableAutomatedBackup);
        return this;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The
     *         default value is <code>true</code>.
     */

    public Boolean isDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code>.
     * </p>
     * 
     * @param engine
     *        The configuration management engine to use. Valid values include <code>Chef</code>.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code>.
     * </p>
     * 
     * @return The configuration management engine to use. Valid values include <code>Chef</code>.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code>.
     * </p>
     * 
     * @param engine
     *        The configuration management engine to use. Valid values include <code>Chef</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine model, or option. Valid values include <code>Single</code>.
     * </p>
     * 
     * @param engineModel
     *        The engine model, or option. Valid values include <code>Single</code>.
     */

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /**
     * <p>
     * The engine model, or option. Valid values include <code>Single</code>.
     * </p>
     * 
     * @return The engine model, or option. Valid values include <code>Single</code>.
     */

    public String getEngineModel() {
        return this.engineModel;
    }

    /**
     * <p>
     * The engine model, or option. Valid values include <code>Single</code>.
     * </p>
     * 
     * @param engineModel
     *        The engine model, or option. Valid values include <code>Single</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineModel(String engineModel) {
        setEngineModel(engineModel);
        return this;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. Values depend on the engine that you choose.
     * </p>
     * 
     * @param engineVersion
     *        The major release version of the engine that you want to use. Values depend on the engine that you choose.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. Values depend on the engine that you choose.
     * </p>
     * 
     * @return The major release version of the engine that you want to use. Values depend on the engine that you
     *         choose.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. Values depend on the engine that you choose.
     * </p>
     * 
     * @param engineVersion
     *        The major release version of the engine that you want to use. Values depend on the engine that you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for Chef
     * Automate. This private key is required to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Engine attributes on a specified server. </p>
     *         <p class="title">
     *         <b>Attributes accepted in a createServer request:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for
     *         Chef Automate. This private key is required to access the Chef API.
     *         </p>
     *         </li>
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for Chef
     * Automate. This private key is required to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for
     *        Chef Automate. This private key is required to access the Chef API.
     *        </p>
     *        </li>
     */

    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for Chef
     * Automate. This private key is required to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
     *        Engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for
     *        Chef Automate. This private key is required to access the Chef API.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (this.engineAttributes == null) {
            setEngineAttributes(new java.util.ArrayList<EngineAttribute>(engineAttributes.length));
        }
        for (EngineAttribute ele : engineAttributes) {
            this.engineAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for Chef
     * Automate. This private key is required to access the Chef API.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA private key that is not stored by AWS OpsWorks for
     *        Chef Automate. This private key is required to access the Chef API.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
        return this;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for Chef
     * Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @param backupRetentionCount
     *        The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for
     *        Chef Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     */

    public void setBackupRetentionCount(Integer backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for Chef
     * Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @return The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for
     *         Chef Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     */

    public Integer getBackupRetentionCount() {
        return this.backupRetentionCount;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for Chef
     * Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @param backupRetentionCount
     *        The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks for
     *        Chef Automate deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withBackupRetentionCount(Integer backupRetentionCount) {
        setBackupRetentionCount(backupRetentionCount);
        return this;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32 characters.
     * </p>
     * 
     * @param serverName
     *        The name of the server. The server name must be unique within your AWS account, within each region. Server
     *        names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32
     *        characters.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32 characters.
     * </p>
     * 
     * @return The name of the server. The server name must be unique within your AWS account, within each region.
     *         Server names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum
     *         of 32 characters.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32 characters.
     * </p>
     * 
     * @param serverName
     *        The name of the server. The server name must be unique within your AWS account, within each region. Server
     *        names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 32
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     * service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the instance profile you need.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *        typically creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     *        service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *        that includes the instance profile you need.
     */

    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     * service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the instance profile you need.
     * </p>
     * 
     * @return The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *         typically creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run
     *         the service-role-creation.yaml AWS CloudFormation template, located at
     *         https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *         that includes the instance profile you need.
     */

    public String getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     * service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the instance profile you need.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *        typically creates the instance profile for you, in this release of AWS OpsWorks for Chef Automate, run the
     *        service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *        that includes the instance profile you need.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withInstanceProfileArn(String instanceProfileArn) {
        setInstanceProfileArn(instanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     *        <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     * </p>
     * 
     * @return The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     *         <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type to use. Valid values must be specified in the following format:
     *        <code>^([cm][34]|t2).*</code> For example, <code>c3.large</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your instances by
     * using SSH.
     * </p>
     * 
     * @param keyPair
     *        The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your
     *        instances by using SSH.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your instances by
     * using SSH.
     * </p>
     * 
     * @return The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your
     *         instances by using SSH.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your instances by
     * using SSH.
     * </p>
     * 
     * @param keyPair
     *        The Amazon EC2 key pair to set for the instance. You may specify this parameter to connect to your
     *        instances by using SSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withKeyPair(String keyPair) {
        setKeyPair(keyPair);
        return this;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs maintenance
     * on the instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     * time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday,
     * or Friday. See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs
     *        maintenance on the instance. Valid values must be specified in the following format:
     *        <code>DDD:HH:MM</code>. The specified time is in coordinated universal time (UTC). The default value is a
     *        random one-hour period on Tuesday, Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more
     *        information. </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs maintenance
     * on the instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     * time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday,
     * or Friday. See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @return The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs
     *         maintenance on the instance. Valid values must be specified in the following format:
     *         <code>DDD:HH:MM</code>. The specified time is in coordinated universal time (UTC). The default value is a
     *         random one-hour period on Tuesday, Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more
     *         information. </p>
     *         <p>
     *         <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *         a.m.)
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs maintenance
     * on the instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     * time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday,
     * or Friday. See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The start time for a one-hour period each week during which AWS OpsWorks for Chef Automate performs
     *        maintenance on the instance. Valid values must be specified in the following format:
     *        <code>DDD:HH:MM</code>. The specified time is in coordinated universal time (UTC). The default value is a
     *        random one-hour period on Tuesday, Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more
     *        information. </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up application-level data
     * on your server if backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredBackupWindow
     *        The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up
     *        application-level data on your server if backups are enabled. Valid values must be specified in one of the
     *        following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HH:MM</code> for daily backups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDD:HH:MM</code> for weekly backups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *        time.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up application-level data
     * on your server if backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @return The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up
     *         application-level data on your server if backups are enabled. Valid values must be specified in one of
     *         the following formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HH:MM</code> for daily backups
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DDD:HH:MM</code> for weekly backups
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *         time.
     *         </p>
     *         <p>
     *         <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *         </p>
     *         <p>
     *         <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *         a.m.)
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up application-level data
     * on your server if backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredBackupWindow
     *        The start time for a one-hour period during which AWS OpsWorks for Chef Automate backs up
     *        application-level data on your server if backups are enabled. Valid values must be specified in one of the
     *        following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HH:MM</code> for daily backups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDD:HH:MM</code> for weekly backups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *        time.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that uses TCP
     * ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @return A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *         specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *         <p>
     *         If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that
     *         uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that uses TCP
     * ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that
     *        uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that uses TCP
     * ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that
     *        uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that uses TCP
     * ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks for Chef Automate creates one new security group that
     *        uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account. Although
     * the AWS OpsWorks console typically creates the service role for you, in this release of AWS OpsWorks for Chef
     * Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the service role that you need.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account.
     *        Although the AWS OpsWorks console typically creates the service role for you, in this release of AWS
     *        OpsWorks for Chef Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *        that includes the service role that you need.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account. Although
     * the AWS OpsWorks console typically creates the service role for you, in this release of AWS OpsWorks for Chef
     * Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the service role that you need.
     * </p>
     * 
     * @return The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account.
     *         Although the AWS OpsWorks console typically creates the service role for you, in this release of AWS
     *         OpsWorks for Chef Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     *         https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *         that includes the service role that you need.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account. Although
     * the AWS OpsWorks console typically creates the service role for you, in this release of AWS OpsWorks for Chef
     * Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack that
     * includes the service role that you need.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role that the AWS OpsWorks for Chef Automate service backend uses to work with your account.
     *        Although the AWS OpsWorks console typically creates the service role for you, in this release of AWS
     *        OpsWorks for Chef Automate, run the service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-stuff/latest/service-role-creation.yaml. This template creates a stack
     *        that includes the service role that you need.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a href=
     * "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a>.
     * </p>
     * 
     * @return The IDs of subnets in which to launch the server EC2 instance. </p>
     *         <p>
     *         Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must
     *         have "Auto Assign Public IP" enabled.
     *         </p>
     *         <p>
     *         EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *         created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *         "Auto Assign Public IP" enabled.
     *         </p>
     *         <p>
     *         For more information about supported Amazon EC2 platforms, see <a href=
     *         "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *         >Supported Platforms</a>.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a href=
     * "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a>.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a href=
     *        "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *        >Supported Platforms</a>.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a href=
     * "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a href=
     *        "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *        >Supported Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a href=
     * "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a>.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a href=
     *        "http://docs.aws.amazon.com/https:/docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *        >Supported Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup represented by
     * BackupId.
     * </p>
     * 
     * @param backupId
     *        If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup
     *        represented by BackupId.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup represented by
     * BackupId.
     * </p>
     * 
     * @return If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup
     *         represented by BackupId.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup represented by
     * BackupId.
     * </p>
     * 
     * @param backupId
     *        If you specify this field, AWS OpsWorks for Chef Automate creates the server by using the backup
     *        represented by BackupId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withBackupId(String backupId) {
        setBackupId(backupId);
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
        if (getDisableAutomatedBackup() != null)
            sb.append("DisableAutomatedBackup: " + getDisableAutomatedBackup() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineModel() != null)
            sb.append("EngineModel: " + getEngineModel() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: " + getEngineAttributes() + ",");
        if (getBackupRetentionCount() != null)
            sb.append("BackupRetentionCount: " + getBackupRetentionCount() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: " + getInstanceProfileArn() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKeyPair() != null)
            sb.append("KeyPair: " + getKeyPair() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getBackupId() != null)
            sb.append("BackupId: " + getBackupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServerRequest == false)
            return false;
        CreateServerRequest other = (CreateServerRequest) obj;
        if (other.getDisableAutomatedBackup() == null ^ this.getDisableAutomatedBackup() == null)
            return false;
        if (other.getDisableAutomatedBackup() != null && other.getDisableAutomatedBackup().equals(this.getDisableAutomatedBackup()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineModel() == null ^ this.getEngineModel() == null)
            return false;
        if (other.getEngineModel() != null && other.getEngineModel().equals(this.getEngineModel()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        if (other.getBackupRetentionCount() == null ^ this.getBackupRetentionCount() == null)
            return false;
        if (other.getBackupRetentionCount() != null && other.getBackupRetentionCount().equals(this.getBackupRetentionCount()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableAutomatedBackup() == null) ? 0 : getDisableAutomatedBackup().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineModel() == null) ? 0 : getEngineModel().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionCount() == null) ? 0 : getBackupRetentionCount().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerRequest clone() {
        return (CreateServerRequest) super.clone();
    }
}
