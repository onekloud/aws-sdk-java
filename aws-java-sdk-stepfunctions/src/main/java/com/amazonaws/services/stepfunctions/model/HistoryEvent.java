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
public class HistoryEvent implements Serializable, Cloneable {

    /**
     * <p>
     * The date the event occured.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of the event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     */
    private Long id;
    /**
     * <p>
     * The id of the previous event.
     * </p>
     */
    private Long previousEventId;

    private ActivityFailedEventDetails activityFailedEventDetails;

    private ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails;

    private ActivityScheduledEventDetails activityScheduledEventDetails;

    private ActivityStartedEventDetails activityStartedEventDetails;

    private ActivitySucceededEventDetails activitySucceededEventDetails;

    private ActivityTimedOutEventDetails activityTimedOutEventDetails;

    private ExecutionFailedEventDetails executionFailedEventDetails;

    private ExecutionStartedEventDetails executionStartedEventDetails;

    private ExecutionSucceededEventDetails executionSucceededEventDetails;

    private ExecutionAbortedEventDetails executionAbortedEventDetails;

    private ExecutionTimedOutEventDetails executionTimedOutEventDetails;

    private LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails;

    private LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails;

    private LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails;

    private LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails;

    private LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails;

    private LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails;

    private StateEnteredEventDetails stateEnteredEventDetails;

    private StateExitedEventDetails stateExitedEventDetails;

    /**
     * <p>
     * The date the event occured.
     * </p>
     * 
     * @param timestamp
     *        The date the event occured.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date the event occured.
     * </p>
     * 
     * @return The date the event occured.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date the event occured.
     * </p>
     * 
     * @param timestamp
     *        The date the event occured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @see HistoryEventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @return The type of the event.
     * @see HistoryEventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryEventType
     */

    public HistoryEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @see HistoryEventType
     */

    public void setType(HistoryEventType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryEventType
     */

    public HistoryEvent withType(HistoryEventType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @param id
     *        The id of the event. Events are numbered sequentially, starting at one.
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @return The id of the event. Events are numbered sequentially, starting at one.
     */

    public Long getId() {
        return this.id;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @param id
     *        The id of the event. Events are numbered sequentially, starting at one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withId(Long id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @param previousEventId
     *        The id of the previous event.
     */

    public void setPreviousEventId(Long previousEventId) {
        this.previousEventId = previousEventId;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @return The id of the previous event.
     */

    public Long getPreviousEventId() {
        return this.previousEventId;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @param previousEventId
     *        The id of the previous event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withPreviousEventId(Long previousEventId) {
        setPreviousEventId(previousEventId);
        return this;
    }

    /**
     * @param activityFailedEventDetails
     */

    public void setActivityFailedEventDetails(ActivityFailedEventDetails activityFailedEventDetails) {
        this.activityFailedEventDetails = activityFailedEventDetails;
    }

    /**
     * @return
     */

    public ActivityFailedEventDetails getActivityFailedEventDetails() {
        return this.activityFailedEventDetails;
    }

    /**
     * @param activityFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityFailedEventDetails(ActivityFailedEventDetails activityFailedEventDetails) {
        setActivityFailedEventDetails(activityFailedEventDetails);
        return this;
    }

    /**
     * @param activityScheduleFailedEventDetails
     */

    public void setActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails) {
        this.activityScheduleFailedEventDetails = activityScheduleFailedEventDetails;
    }

    /**
     * @return
     */

    public ActivityScheduleFailedEventDetails getActivityScheduleFailedEventDetails() {
        return this.activityScheduleFailedEventDetails;
    }

    /**
     * @param activityScheduleFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails) {
        setActivityScheduleFailedEventDetails(activityScheduleFailedEventDetails);
        return this;
    }

    /**
     * @param activityScheduledEventDetails
     */

    public void setActivityScheduledEventDetails(ActivityScheduledEventDetails activityScheduledEventDetails) {
        this.activityScheduledEventDetails = activityScheduledEventDetails;
    }

    /**
     * @return
     */

    public ActivityScheduledEventDetails getActivityScheduledEventDetails() {
        return this.activityScheduledEventDetails;
    }

    /**
     * @param activityScheduledEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityScheduledEventDetails(ActivityScheduledEventDetails activityScheduledEventDetails) {
        setActivityScheduledEventDetails(activityScheduledEventDetails);
        return this;
    }

    /**
     * @param activityStartedEventDetails
     */

    public void setActivityStartedEventDetails(ActivityStartedEventDetails activityStartedEventDetails) {
        this.activityStartedEventDetails = activityStartedEventDetails;
    }

    /**
     * @return
     */

    public ActivityStartedEventDetails getActivityStartedEventDetails() {
        return this.activityStartedEventDetails;
    }

    /**
     * @param activityStartedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityStartedEventDetails(ActivityStartedEventDetails activityStartedEventDetails) {
        setActivityStartedEventDetails(activityStartedEventDetails);
        return this;
    }

    /**
     * @param activitySucceededEventDetails
     */

    public void setActivitySucceededEventDetails(ActivitySucceededEventDetails activitySucceededEventDetails) {
        this.activitySucceededEventDetails = activitySucceededEventDetails;
    }

    /**
     * @return
     */

    public ActivitySucceededEventDetails getActivitySucceededEventDetails() {
        return this.activitySucceededEventDetails;
    }

    /**
     * @param activitySucceededEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivitySucceededEventDetails(ActivitySucceededEventDetails activitySucceededEventDetails) {
        setActivitySucceededEventDetails(activitySucceededEventDetails);
        return this;
    }

    /**
     * @param activityTimedOutEventDetails
     */

    public void setActivityTimedOutEventDetails(ActivityTimedOutEventDetails activityTimedOutEventDetails) {
        this.activityTimedOutEventDetails = activityTimedOutEventDetails;
    }

    /**
     * @return
     */

    public ActivityTimedOutEventDetails getActivityTimedOutEventDetails() {
        return this.activityTimedOutEventDetails;
    }

    /**
     * @param activityTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTimedOutEventDetails(ActivityTimedOutEventDetails activityTimedOutEventDetails) {
        setActivityTimedOutEventDetails(activityTimedOutEventDetails);
        return this;
    }

    /**
     * @param executionFailedEventDetails
     */

    public void setExecutionFailedEventDetails(ExecutionFailedEventDetails executionFailedEventDetails) {
        this.executionFailedEventDetails = executionFailedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionFailedEventDetails getExecutionFailedEventDetails() {
        return this.executionFailedEventDetails;
    }

    /**
     * @param executionFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionFailedEventDetails(ExecutionFailedEventDetails executionFailedEventDetails) {
        setExecutionFailedEventDetails(executionFailedEventDetails);
        return this;
    }

    /**
     * @param executionStartedEventDetails
     */

    public void setExecutionStartedEventDetails(ExecutionStartedEventDetails executionStartedEventDetails) {
        this.executionStartedEventDetails = executionStartedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionStartedEventDetails getExecutionStartedEventDetails() {
        return this.executionStartedEventDetails;
    }

    /**
     * @param executionStartedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionStartedEventDetails(ExecutionStartedEventDetails executionStartedEventDetails) {
        setExecutionStartedEventDetails(executionStartedEventDetails);
        return this;
    }

    /**
     * @param executionSucceededEventDetails
     */

    public void setExecutionSucceededEventDetails(ExecutionSucceededEventDetails executionSucceededEventDetails) {
        this.executionSucceededEventDetails = executionSucceededEventDetails;
    }

    /**
     * @return
     */

    public ExecutionSucceededEventDetails getExecutionSucceededEventDetails() {
        return this.executionSucceededEventDetails;
    }

    /**
     * @param executionSucceededEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionSucceededEventDetails(ExecutionSucceededEventDetails executionSucceededEventDetails) {
        setExecutionSucceededEventDetails(executionSucceededEventDetails);
        return this;
    }

    /**
     * @param executionAbortedEventDetails
     */

    public void setExecutionAbortedEventDetails(ExecutionAbortedEventDetails executionAbortedEventDetails) {
        this.executionAbortedEventDetails = executionAbortedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionAbortedEventDetails getExecutionAbortedEventDetails() {
        return this.executionAbortedEventDetails;
    }

    /**
     * @param executionAbortedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionAbortedEventDetails(ExecutionAbortedEventDetails executionAbortedEventDetails) {
        setExecutionAbortedEventDetails(executionAbortedEventDetails);
        return this;
    }

    /**
     * @param executionTimedOutEventDetails
     */

    public void setExecutionTimedOutEventDetails(ExecutionTimedOutEventDetails executionTimedOutEventDetails) {
        this.executionTimedOutEventDetails = executionTimedOutEventDetails;
    }

    /**
     * @return
     */

    public ExecutionTimedOutEventDetails getExecutionTimedOutEventDetails() {
        return this.executionTimedOutEventDetails;
    }

    /**
     * @param executionTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionTimedOutEventDetails(ExecutionTimedOutEventDetails executionTimedOutEventDetails) {
        setExecutionTimedOutEventDetails(executionTimedOutEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionFailedEventDetails
     */

    public void setLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails) {
        this.lambdaFunctionFailedEventDetails = lambdaFunctionFailedEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionFailedEventDetails getLambdaFunctionFailedEventDetails() {
        return this.lambdaFunctionFailedEventDetails;
    }

    /**
     * @param lambdaFunctionFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails) {
        setLambdaFunctionFailedEventDetails(lambdaFunctionFailedEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionScheduleFailedEventDetails
     */

    public void setLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails) {
        this.lambdaFunctionScheduleFailedEventDetails = lambdaFunctionScheduleFailedEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionScheduleFailedEventDetails getLambdaFunctionScheduleFailedEventDetails() {
        return this.lambdaFunctionScheduleFailedEventDetails;
    }

    /**
     * @param lambdaFunctionScheduleFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails) {
        setLambdaFunctionScheduleFailedEventDetails(lambdaFunctionScheduleFailedEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionScheduledEventDetails
     */

    public void setLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails) {
        this.lambdaFunctionScheduledEventDetails = lambdaFunctionScheduledEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionScheduledEventDetails getLambdaFunctionScheduledEventDetails() {
        return this.lambdaFunctionScheduledEventDetails;
    }

    /**
     * @param lambdaFunctionScheduledEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails) {
        setLambdaFunctionScheduledEventDetails(lambdaFunctionScheduledEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionStartFailedEventDetails
     */

    public void setLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails) {
        this.lambdaFunctionStartFailedEventDetails = lambdaFunctionStartFailedEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionStartFailedEventDetails getLambdaFunctionStartFailedEventDetails() {
        return this.lambdaFunctionStartFailedEventDetails;
    }

    /**
     * @param lambdaFunctionStartFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails) {
        setLambdaFunctionStartFailedEventDetails(lambdaFunctionStartFailedEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionSucceededEventDetails
     */

    public void setLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails) {
        this.lambdaFunctionSucceededEventDetails = lambdaFunctionSucceededEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionSucceededEventDetails getLambdaFunctionSucceededEventDetails() {
        return this.lambdaFunctionSucceededEventDetails;
    }

    /**
     * @param lambdaFunctionSucceededEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails) {
        setLambdaFunctionSucceededEventDetails(lambdaFunctionSucceededEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionTimedOutEventDetails
     */

    public void setLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails) {
        this.lambdaFunctionTimedOutEventDetails = lambdaFunctionTimedOutEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionTimedOutEventDetails getLambdaFunctionTimedOutEventDetails() {
        return this.lambdaFunctionTimedOutEventDetails;
    }

    /**
     * @param lambdaFunctionTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails) {
        setLambdaFunctionTimedOutEventDetails(lambdaFunctionTimedOutEventDetails);
        return this;
    }

    /**
     * @param stateEnteredEventDetails
     */

    public void setStateEnteredEventDetails(StateEnteredEventDetails stateEnteredEventDetails) {
        this.stateEnteredEventDetails = stateEnteredEventDetails;
    }

    /**
     * @return
     */

    public StateEnteredEventDetails getStateEnteredEventDetails() {
        return this.stateEnteredEventDetails;
    }

    /**
     * @param stateEnteredEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStateEnteredEventDetails(StateEnteredEventDetails stateEnteredEventDetails) {
        setStateEnteredEventDetails(stateEnteredEventDetails);
        return this;
    }

    /**
     * @param stateExitedEventDetails
     */

    public void setStateExitedEventDetails(StateExitedEventDetails stateExitedEventDetails) {
        this.stateExitedEventDetails = stateExitedEventDetails;
    }

    /**
     * @return
     */

    public StateExitedEventDetails getStateExitedEventDetails() {
        return this.stateExitedEventDetails;
    }

    /**
     * @param stateExitedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStateExitedEventDetails(StateExitedEventDetails stateExitedEventDetails) {
        setStateExitedEventDetails(stateExitedEventDetails);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getPreviousEventId() != null)
            sb.append("PreviousEventId: " + getPreviousEventId() + ",");
        if (getActivityFailedEventDetails() != null)
            sb.append("ActivityFailedEventDetails: " + getActivityFailedEventDetails() + ",");
        if (getActivityScheduleFailedEventDetails() != null)
            sb.append("ActivityScheduleFailedEventDetails: " + getActivityScheduleFailedEventDetails() + ",");
        if (getActivityScheduledEventDetails() != null)
            sb.append("ActivityScheduledEventDetails: " + getActivityScheduledEventDetails() + ",");
        if (getActivityStartedEventDetails() != null)
            sb.append("ActivityStartedEventDetails: " + getActivityStartedEventDetails() + ",");
        if (getActivitySucceededEventDetails() != null)
            sb.append("ActivitySucceededEventDetails: " + getActivitySucceededEventDetails() + ",");
        if (getActivityTimedOutEventDetails() != null)
            sb.append("ActivityTimedOutEventDetails: " + getActivityTimedOutEventDetails() + ",");
        if (getExecutionFailedEventDetails() != null)
            sb.append("ExecutionFailedEventDetails: " + getExecutionFailedEventDetails() + ",");
        if (getExecutionStartedEventDetails() != null)
            sb.append("ExecutionStartedEventDetails: " + getExecutionStartedEventDetails() + ",");
        if (getExecutionSucceededEventDetails() != null)
            sb.append("ExecutionSucceededEventDetails: " + getExecutionSucceededEventDetails() + ",");
        if (getExecutionAbortedEventDetails() != null)
            sb.append("ExecutionAbortedEventDetails: " + getExecutionAbortedEventDetails() + ",");
        if (getExecutionTimedOutEventDetails() != null)
            sb.append("ExecutionTimedOutEventDetails: " + getExecutionTimedOutEventDetails() + ",");
        if (getLambdaFunctionFailedEventDetails() != null)
            sb.append("LambdaFunctionFailedEventDetails: " + getLambdaFunctionFailedEventDetails() + ",");
        if (getLambdaFunctionScheduleFailedEventDetails() != null)
            sb.append("LambdaFunctionScheduleFailedEventDetails: " + getLambdaFunctionScheduleFailedEventDetails() + ",");
        if (getLambdaFunctionScheduledEventDetails() != null)
            sb.append("LambdaFunctionScheduledEventDetails: " + getLambdaFunctionScheduledEventDetails() + ",");
        if (getLambdaFunctionStartFailedEventDetails() != null)
            sb.append("LambdaFunctionStartFailedEventDetails: " + getLambdaFunctionStartFailedEventDetails() + ",");
        if (getLambdaFunctionSucceededEventDetails() != null)
            sb.append("LambdaFunctionSucceededEventDetails: " + getLambdaFunctionSucceededEventDetails() + ",");
        if (getLambdaFunctionTimedOutEventDetails() != null)
            sb.append("LambdaFunctionTimedOutEventDetails: " + getLambdaFunctionTimedOutEventDetails() + ",");
        if (getStateEnteredEventDetails() != null)
            sb.append("StateEnteredEventDetails: " + getStateEnteredEventDetails() + ",");
        if (getStateExitedEventDetails() != null)
            sb.append("StateExitedEventDetails: " + getStateExitedEventDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryEvent == false)
            return false;
        HistoryEvent other = (HistoryEvent) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPreviousEventId() == null ^ this.getPreviousEventId() == null)
            return false;
        if (other.getPreviousEventId() != null && other.getPreviousEventId().equals(this.getPreviousEventId()) == false)
            return false;
        if (other.getActivityFailedEventDetails() == null ^ this.getActivityFailedEventDetails() == null)
            return false;
        if (other.getActivityFailedEventDetails() != null && other.getActivityFailedEventDetails().equals(this.getActivityFailedEventDetails()) == false)
            return false;
        if (other.getActivityScheduleFailedEventDetails() == null ^ this.getActivityScheduleFailedEventDetails() == null)
            return false;
        if (other.getActivityScheduleFailedEventDetails() != null
                && other.getActivityScheduleFailedEventDetails().equals(this.getActivityScheduleFailedEventDetails()) == false)
            return false;
        if (other.getActivityScheduledEventDetails() == null ^ this.getActivityScheduledEventDetails() == null)
            return false;
        if (other.getActivityScheduledEventDetails() != null
                && other.getActivityScheduledEventDetails().equals(this.getActivityScheduledEventDetails()) == false)
            return false;
        if (other.getActivityStartedEventDetails() == null ^ this.getActivityStartedEventDetails() == null)
            return false;
        if (other.getActivityStartedEventDetails() != null && other.getActivityStartedEventDetails().equals(this.getActivityStartedEventDetails()) == false)
            return false;
        if (other.getActivitySucceededEventDetails() == null ^ this.getActivitySucceededEventDetails() == null)
            return false;
        if (other.getActivitySucceededEventDetails() != null
                && other.getActivitySucceededEventDetails().equals(this.getActivitySucceededEventDetails()) == false)
            return false;
        if (other.getActivityTimedOutEventDetails() == null ^ this.getActivityTimedOutEventDetails() == null)
            return false;
        if (other.getActivityTimedOutEventDetails() != null && other.getActivityTimedOutEventDetails().equals(this.getActivityTimedOutEventDetails()) == false)
            return false;
        if (other.getExecutionFailedEventDetails() == null ^ this.getExecutionFailedEventDetails() == null)
            return false;
        if (other.getExecutionFailedEventDetails() != null && other.getExecutionFailedEventDetails().equals(this.getExecutionFailedEventDetails()) == false)
            return false;
        if (other.getExecutionStartedEventDetails() == null ^ this.getExecutionStartedEventDetails() == null)
            return false;
        if (other.getExecutionStartedEventDetails() != null && other.getExecutionStartedEventDetails().equals(this.getExecutionStartedEventDetails()) == false)
            return false;
        if (other.getExecutionSucceededEventDetails() == null ^ this.getExecutionSucceededEventDetails() == null)
            return false;
        if (other.getExecutionSucceededEventDetails() != null
                && other.getExecutionSucceededEventDetails().equals(this.getExecutionSucceededEventDetails()) == false)
            return false;
        if (other.getExecutionAbortedEventDetails() == null ^ this.getExecutionAbortedEventDetails() == null)
            return false;
        if (other.getExecutionAbortedEventDetails() != null && other.getExecutionAbortedEventDetails().equals(this.getExecutionAbortedEventDetails()) == false)
            return false;
        if (other.getExecutionTimedOutEventDetails() == null ^ this.getExecutionTimedOutEventDetails() == null)
            return false;
        if (other.getExecutionTimedOutEventDetails() != null
                && other.getExecutionTimedOutEventDetails().equals(this.getExecutionTimedOutEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionFailedEventDetails() == null ^ this.getLambdaFunctionFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionFailedEventDetails() != null
                && other.getLambdaFunctionFailedEventDetails().equals(this.getLambdaFunctionFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionScheduleFailedEventDetails() == null ^ this.getLambdaFunctionScheduleFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionScheduleFailedEventDetails() != null
                && other.getLambdaFunctionScheduleFailedEventDetails().equals(this.getLambdaFunctionScheduleFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionScheduledEventDetails() == null ^ this.getLambdaFunctionScheduledEventDetails() == null)
            return false;
        if (other.getLambdaFunctionScheduledEventDetails() != null
                && other.getLambdaFunctionScheduledEventDetails().equals(this.getLambdaFunctionScheduledEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionStartFailedEventDetails() == null ^ this.getLambdaFunctionStartFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionStartFailedEventDetails() != null
                && other.getLambdaFunctionStartFailedEventDetails().equals(this.getLambdaFunctionStartFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionSucceededEventDetails() == null ^ this.getLambdaFunctionSucceededEventDetails() == null)
            return false;
        if (other.getLambdaFunctionSucceededEventDetails() != null
                && other.getLambdaFunctionSucceededEventDetails().equals(this.getLambdaFunctionSucceededEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionTimedOutEventDetails() == null ^ this.getLambdaFunctionTimedOutEventDetails() == null)
            return false;
        if (other.getLambdaFunctionTimedOutEventDetails() != null
                && other.getLambdaFunctionTimedOutEventDetails().equals(this.getLambdaFunctionTimedOutEventDetails()) == false)
            return false;
        if (other.getStateEnteredEventDetails() == null ^ this.getStateEnteredEventDetails() == null)
            return false;
        if (other.getStateEnteredEventDetails() != null && other.getStateEnteredEventDetails().equals(this.getStateEnteredEventDetails()) == false)
            return false;
        if (other.getStateExitedEventDetails() == null ^ this.getStateExitedEventDetails() == null)
            return false;
        if (other.getStateExitedEventDetails() != null && other.getStateExitedEventDetails().equals(this.getStateExitedEventDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPreviousEventId() == null) ? 0 : getPreviousEventId().hashCode());
        hashCode = prime * hashCode + ((getActivityFailedEventDetails() == null) ? 0 : getActivityFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityScheduleFailedEventDetails() == null) ? 0 : getActivityScheduleFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityScheduledEventDetails() == null) ? 0 : getActivityScheduledEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityStartedEventDetails() == null) ? 0 : getActivityStartedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivitySucceededEventDetails() == null) ? 0 : getActivitySucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityTimedOutEventDetails() == null) ? 0 : getActivityTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionFailedEventDetails() == null) ? 0 : getExecutionFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartedEventDetails() == null) ? 0 : getExecutionStartedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionSucceededEventDetails() == null) ? 0 : getExecutionSucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionAbortedEventDetails() == null) ? 0 : getExecutionAbortedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimedOutEventDetails() == null) ? 0 : getExecutionTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionFailedEventDetails() == null) ? 0 : getLambdaFunctionFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionScheduleFailedEventDetails() == null) ? 0 : getLambdaFunctionScheduleFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionScheduledEventDetails() == null) ? 0 : getLambdaFunctionScheduledEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionStartFailedEventDetails() == null) ? 0 : getLambdaFunctionStartFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionSucceededEventDetails() == null) ? 0 : getLambdaFunctionSucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionTimedOutEventDetails() == null) ? 0 : getLambdaFunctionTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getStateEnteredEventDetails() == null) ? 0 : getStateEnteredEventDetails().hashCode());
        hashCode = prime * hashCode + ((getStateExitedEventDetails() == null) ? 0 : getStateExitedEventDetails().hashCode());
        return hashCode;
    }

    @Override
    public HistoryEvent clone() {
        try {
            return (HistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
