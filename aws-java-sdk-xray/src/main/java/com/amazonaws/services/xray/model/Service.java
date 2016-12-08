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
package com.amazonaws.services.xray.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an application that processed requests, users that made requests, or downstream services, resources
 * and applications that an application used.
 * </p>
 */
public class Service implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     */
    private Integer referenceId;
    /**
     * <p>
     * The canonical name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * Indicates that the service was the first service to process a request.
     * </p>
     */
    private Boolean root;
    /**
     * <p>
     * Identifier of the AWS account in which the service runs.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The type of service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     * running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon
     * DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client</code> - Represents the clients that sent requests to a root service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>remote</code> - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The service's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The start time of the first segment that the service generated.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the last segment that the service generated.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Connections to downstream services.
     * </p>
     */
    private java.util.List<Edge> edges;
    /**
     * <p>
     * Aggregated statistics for the service.
     * </p>
     */
    private ServiceStatistics summaryStatistics;
    /**
     * <p>
     * Histogram mapping the spread of trace durations
     * </p>
     */
    private java.util.List<HistogramEntry> durationHistogram;

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier for the service. Unique within the service map.
     */

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @return Identifier for the service. Unique within the service map.
     */

    public Integer getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier for the service. Unique within the service map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withReferenceId(Integer referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @param name
     *        The canonical name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @return The canonical name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @param name
     *        The canonical name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @return A list of names for the service, including the canonical name.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Indicates that the service was the first service to process a request.
     * </p>
     * 
     * @param root
     *        Indicates that the service was the first service to process a request.
     */

    public void setRoot(Boolean root) {
        this.root = root;
    }

    /**
     * <p>
     * Indicates that the service was the first service to process a request.
     * </p>
     * 
     * @return Indicates that the service was the first service to process a request.
     */

    public Boolean getRoot() {
        return this.root;
    }

    /**
     * <p>
     * Indicates that the service was the first service to process a request.
     * </p>
     * 
     * @param root
     *        Indicates that the service was the first service to process a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withRoot(Boolean root) {
        setRoot(root);
        return this;
    }

    /**
     * <p>
     * Indicates that the service was the first service to process a request.
     * </p>
     * 
     * @return Indicates that the service was the first service to process a request.
     */

    public Boolean isRoot() {
        return this.root;
    }

    /**
     * <p>
     * Identifier of the AWS account in which the service runs.
     * </p>
     * 
     * @param accountId
     *        Identifier of the AWS account in which the service runs.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Identifier of the AWS account in which the service runs.
     * </p>
     * 
     * @return Identifier of the AWS account in which the service runs.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Identifier of the AWS account in which the service runs.
     * </p>
     * 
     * @param accountId
     *        Identifier of the AWS account in which the service runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     * running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon
     * DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client</code> - Represents the clients that sent requests to a root service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>remote</code> - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of service.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     *        running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the
     *        application used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to
     *        Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client</code> - Represents the clients that sent requests to a root service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>remote</code> - A downstream service of indeterminate type.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     * running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon
     * DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client</code> - Represents the clients that sent requests to a root service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>remote</code> - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of service.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a
     *         application running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that
     *         the application used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to
     *         Amazon DynamoDB that didn't target a specific table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client</code> - Represents the clients that sent requests to a root service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>remote</code> - A downstream service of indeterminate type.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     * running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon
     * DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client</code> - Represents the clients that sent requests to a root service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>remote</code> - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of service.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application
     *        running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the
     *        application used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to
     *        Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client</code> - Represents the clients that sent requests to a root service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>remote</code> - A downstream service of indeterminate type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The service's state.
     * </p>
     * 
     * @param state
     *        The service's state.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The service's state.
     * </p>
     * 
     * @return The service's state.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The service's state.
     * </p>
     * 
     * @param state
     *        The service's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The start time of the first segment that the service generated.
     * </p>
     * 
     * @param startTime
     *        The start time of the first segment that the service generated.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the first segment that the service generated.
     * </p>
     * 
     * @return The start time of the first segment that the service generated.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the first segment that the service generated.
     * </p>
     * 
     * @param startTime
     *        The start time of the first segment that the service generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the last segment that the service generated.
     * </p>
     * 
     * @param endTime
     *        The end time of the last segment that the service generated.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the last segment that the service generated.
     * </p>
     * 
     * @return The end time of the last segment that the service generated.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the last segment that the service generated.
     * </p>
     * 
     * @param endTime
     *        The end time of the last segment that the service generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @return Connections to downstream services.
     */

    public java.util.List<Edge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     */

    public void setEdges(java.util.Collection<Edge> edges) {
        if (edges == null) {
            this.edges = null;
            return;
        }

        this.edges = new java.util.ArrayList<Edge>(edges);
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdges(java.util.Collection)} or {@link #withEdges(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEdges(Edge... edges) {
        if (this.edges == null) {
            setEdges(new java.util.ArrayList<Edge>(edges.length));
        }
        for (Edge ele : edges) {
            this.edges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEdges(java.util.Collection<Edge> edges) {
        setEdges(edges);
        return this;
    }

    /**
     * <p>
     * Aggregated statistics for the service.
     * </p>
     * 
     * @param summaryStatistics
     *        Aggregated statistics for the service.
     */

    public void setSummaryStatistics(ServiceStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * <p>
     * Aggregated statistics for the service.
     * </p>
     * 
     * @return Aggregated statistics for the service.
     */

    public ServiceStatistics getSummaryStatistics() {
        return this.summaryStatistics;
    }

    /**
     * <p>
     * Aggregated statistics for the service.
     * </p>
     * 
     * @param summaryStatistics
     *        Aggregated statistics for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withSummaryStatistics(ServiceStatistics summaryStatistics) {
        setSummaryStatistics(summaryStatistics);
        return this;
    }

    /**
     * <p>
     * Histogram mapping the spread of trace durations
     * </p>
     * 
     * @return Histogram mapping the spread of trace durations
     */

    public java.util.List<HistogramEntry> getDurationHistogram() {
        return durationHistogram;
    }

    /**
     * <p>
     * Histogram mapping the spread of trace durations
     * </p>
     * 
     * @param durationHistogram
     *        Histogram mapping the spread of trace durations
     */

    public void setDurationHistogram(java.util.Collection<HistogramEntry> durationHistogram) {
        if (durationHistogram == null) {
            this.durationHistogram = null;
            return;
        }

        this.durationHistogram = new java.util.ArrayList<HistogramEntry>(durationHistogram);
    }

    /**
     * <p>
     * Histogram mapping the spread of trace durations
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDurationHistogram(java.util.Collection)} or {@link #withDurationHistogram(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param durationHistogram
     *        Histogram mapping the spread of trace durations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDurationHistogram(HistogramEntry... durationHistogram) {
        if (this.durationHistogram == null) {
            setDurationHistogram(new java.util.ArrayList<HistogramEntry>(durationHistogram.length));
        }
        for (HistogramEntry ele : durationHistogram) {
            this.durationHistogram.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Histogram mapping the spread of trace durations
     * </p>
     * 
     * @param durationHistogram
     *        Histogram mapping the spread of trace durations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDurationHistogram(java.util.Collection<HistogramEntry> durationHistogram) {
        setDurationHistogram(durationHistogram);
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
        if (getReferenceId() != null)
            sb.append("ReferenceId: " + getReferenceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNames() != null)
            sb.append("Names: " + getNames() + ",");
        if (getRoot() != null)
            sb.append("Root: " + getRoot() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getEdges() != null)
            sb.append("Edges: " + getEdges() + ",");
        if (getSummaryStatistics() != null)
            sb.append("SummaryStatistics: " + getSummaryStatistics() + ",");
        if (getDurationHistogram() != null)
            sb.append("DurationHistogram: " + getDurationHistogram());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
            return false;
        if (other.getSummaryStatistics() == null ^ this.getSummaryStatistics() == null)
            return false;
        if (other.getSummaryStatistics() != null && other.getSummaryStatistics().equals(this.getSummaryStatistics()) == false)
            return false;
        if (other.getDurationHistogram() == null ^ this.getDurationHistogram() == null)
            return false;
        if (other.getDurationHistogram() != null && other.getDurationHistogram().equals(this.getDurationHistogram()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        hashCode = prime * hashCode + ((getSummaryStatistics() == null) ? 0 : getSummaryStatistics().hashCode());
        hashCode = prime * hashCode + ((getDurationHistogram() == null) ? 0 : getDurationHistogram().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
