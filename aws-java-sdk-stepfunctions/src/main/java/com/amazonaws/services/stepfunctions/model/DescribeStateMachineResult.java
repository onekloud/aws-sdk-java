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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeStateMachineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the state machine.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the state machine.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The date the state machine was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) that identifies the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @param name
     *        The name of the state machine.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @return The name of the state machine.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @param name
     *        The name of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @see StateMachineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @return The current status of the state machine.
     * @see StateMachineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineStatus
     */

    public DescribeStateMachineResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @see StateMachineStatus
     */

    public void setStatus(StateMachineStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineStatus
     */

    public DescribeStateMachineResult withStatus(StateMachineStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used for executing this state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The date the state machine was created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the state machine was created.
     * </p>
     * 
     * @return The date the state machine was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the state machine was created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: " + getStateMachineArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDefinition() != null)
            sb.append("Definition: " + getDefinition() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStateMachineResult == false)
            return false;
        DescribeStateMachineResult other = (DescribeStateMachineResult) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStateMachineResult clone() {
        try {
            return (DescribeStateMachineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
