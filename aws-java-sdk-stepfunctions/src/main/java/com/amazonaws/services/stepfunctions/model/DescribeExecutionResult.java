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
public class DescribeExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the execution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the execution was started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     */
    private java.util.Date stopDate;
    /**
     * <p>
     * The JSON input data of the execution.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The JSON output data of the execution.
     * </p>
     */
    private String output;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the execution.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed stated machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the executed stated machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed stated machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @param name
     *        The name of the execution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @return The name of the execution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * 
     * @param name
     *        The name of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @return The current status of the execution.
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public DescribeExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(ExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public DescribeExecutionResult withStatus(ExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date the execution was started.
     * </p>
     * 
     * @param startDate
     *        The date the execution was started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date the execution was started.
     * </p>
     * 
     * @return The date the execution was started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date the execution was started.
     * </p>
     * 
     * @param startDate
     *        The date the execution was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution has already ended, the date the execution stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @return If the execution has already ended, the date the execution stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * If the execution has already ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution has already ended, the date the execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
        return this;
    }

    /**
     * <p>
     * The JSON input data of the execution.
     * </p>
     * 
     * @param input
     *        The JSON input data of the execution.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON input data of the execution.
     * </p>
     * 
     * @return The JSON input data of the execution.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON input data of the execution.
     * </p>
     * 
     * @param input
     *        The JSON input data of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The JSON output data of the execution.
     * </p>
     * 
     * @param output
     *        The JSON output data of the execution.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON output data of the execution.
     * </p>
     * 
     * @return The JSON output data of the execution.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON output data of the execution.
     * </p>
     * 
     * @param output
     *        The JSON output data of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withOutput(String output) {
        setOutput(output);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: " + getExecutionArn() + ",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: " + getStateMachineArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getStopDate() != null)
            sb.append("StopDate: " + getStopDate() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExecutionResult == false)
            return false;
        DescribeExecutionResult other = (DescribeExecutionResult) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
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
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExecutionResult clone() {
        try {
            return (DescribeExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
