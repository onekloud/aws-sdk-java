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
package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * The number of entities that are affected by one or more events. Returned by the <a>DescribeEntityAggregates</a>
 * operation.
 * </p>
 */
public class EntityAggregate implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     * <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The number entities that match the criteria for the specified events.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     * <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     *        <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     * <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     * </p>
     * 
     * @return The unique identifier for the event. Format:
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     *         <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     * <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>EVENT_TYPE_PLUS_ID</i> </code>. Example:
     *        <code>arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityAggregate withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The number entities that match the criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number entities that match the criteria for the specified events.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number entities that match the criteria for the specified events.
     * </p>
     * 
     * @return The number entities that match the criteria for the specified events.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number entities that match the criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number entities that match the criteria for the specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityAggregate withCount(Integer count) {
        setCount(count);
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
        if (getEventArn() != null)
            sb.append("EventArn: " + getEventArn() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityAggregate == false)
            return false;
        EntityAggregate other = (EntityAggregate) obj;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public EntityAggregate clone() {
        try {
            return (EntityAggregate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
