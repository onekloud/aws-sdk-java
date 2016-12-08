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
package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a DDoS attack.
 * </p>
 */
public class AttackDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     */
    private String attackId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * </p>
     */
    private java.util.List<SubResourceSummary> subResources;
    /**
     * <p>
     * The time the attack started, in the format 2016-12-16T13:50Z.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the attack ended, in the format 2016-12-16T13:50Z.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     */
    private java.util.List<SummarizedCounter> attackCounters;
    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     */
    private java.util.List<Mitigation> mitigations;

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) of the attack.
     */

    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @return The unique identifier (ID) of the attack.
     */

    public String getAttackId() {
        return this.attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) of the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withAttackId(String attackId) {
        setAttackId(attackId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource that was attacked.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the resource that was attacked.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource that was attacked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * </p>
     * 
     * @return If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     */

    public java.util.List<SubResourceSummary> getSubResources() {
        return subResources;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * </p>
     * 
     * @param subResources
     *        If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     */

    public void setSubResources(java.util.Collection<SubResourceSummary> subResources) {
        if (subResources == null) {
            this.subResources = null;
            return;
        }

        this.subResources = new java.util.ArrayList<SubResourceSummary>(subResources);
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubResources(java.util.Collection)} or {@link #withSubResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subResources
     *        If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withSubResources(SubResourceSummary... subResources) {
        if (this.subResources == null) {
            setSubResources(new java.util.ArrayList<SubResourceSummary>(subResources.length));
        }
        for (SubResourceSummary ele : subResources) {
            this.subResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * </p>
     * 
     * @param subResources
     *        If applicable, additional detail about the resource being attacked, for example, IP address or URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withSubResources(java.util.Collection<SubResourceSummary> subResources) {
        setSubResources(subResources);
        return this;
    }

    /**
     * <p>
     * The time the attack started, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @param startTime
     *        The time the attack started, in the format 2016-12-16T13:50Z.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the attack started, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @return The time the attack started, in the format 2016-12-16T13:50Z.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the attack started, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @param startTime
     *        The time the attack started, in the format 2016-12-16T13:50Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the attack ended, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @param endTime
     *        The time the attack ended, in the format 2016-12-16T13:50Z.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the attack ended, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @return The time the attack ended, in the format 2016-12-16T13:50Z.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the attack ended, in the format 2016-12-16T13:50Z.
     * </p>
     * 
     * @param endTime
     *        The time the attack ended, in the format 2016-12-16T13:50Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * 
     * @return List of counters that describe the attack for the specified time period.
     */

    public java.util.List<SummarizedCounter> getAttackCounters() {
        return attackCounters;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * 
     * @param attackCounters
     *        List of counters that describe the attack for the specified time period.
     */

    public void setAttackCounters(java.util.Collection<SummarizedCounter> attackCounters) {
        if (attackCounters == null) {
            this.attackCounters = null;
            return;
        }

        this.attackCounters = new java.util.ArrayList<SummarizedCounter>(attackCounters);
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttackCounters(java.util.Collection)} or {@link #withAttackCounters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attackCounters
     *        List of counters that describe the attack for the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withAttackCounters(SummarizedCounter... attackCounters) {
        if (this.attackCounters == null) {
            setAttackCounters(new java.util.ArrayList<SummarizedCounter>(attackCounters.length));
        }
        for (SummarizedCounter ele : attackCounters) {
            this.attackCounters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * 
     * @param attackCounters
     *        List of counters that describe the attack for the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withAttackCounters(java.util.Collection<SummarizedCounter> attackCounters) {
        setAttackCounters(attackCounters);
        return this;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * 
     * @return List of mitigation actions taken for the attack.
     */

    public java.util.List<Mitigation> getMitigations() {
        return mitigations;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * 
     * @param mitigations
     *        List of mitigation actions taken for the attack.
     */

    public void setMitigations(java.util.Collection<Mitigation> mitigations) {
        if (mitigations == null) {
            this.mitigations = null;
            return;
        }

        this.mitigations = new java.util.ArrayList<Mitigation>(mitigations);
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMitigations(java.util.Collection)} or {@link #withMitigations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mitigations
     *        List of mitigation actions taken for the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withMitigations(Mitigation... mitigations) {
        if (this.mitigations == null) {
            setMitigations(new java.util.ArrayList<Mitigation>(mitigations.length));
        }
        for (Mitigation ele : mitigations) {
            this.mitigations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * 
     * @param mitigations
     *        List of mitigation actions taken for the attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackDetail withMitigations(java.util.Collection<Mitigation> mitigations) {
        setMitigations(mitigations);
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
        if (getAttackId() != null)
            sb.append("AttackId: " + getAttackId() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getSubResources() != null)
            sb.append("SubResources: " + getSubResources() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getAttackCounters() != null)
            sb.append("AttackCounters: " + getAttackCounters() + ",");
        if (getMitigations() != null)
            sb.append("Mitigations: " + getMitigations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackDetail == false)
            return false;
        AttackDetail other = (AttackDetail) obj;
        if (other.getAttackId() == null ^ this.getAttackId() == null)
            return false;
        if (other.getAttackId() != null && other.getAttackId().equals(this.getAttackId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSubResources() == null ^ this.getSubResources() == null)
            return false;
        if (other.getSubResources() != null && other.getSubResources().equals(this.getSubResources()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getAttackCounters() == null ^ this.getAttackCounters() == null)
            return false;
        if (other.getAttackCounters() != null && other.getAttackCounters().equals(this.getAttackCounters()) == false)
            return false;
        if (other.getMitigations() == null ^ this.getMitigations() == null)
            return false;
        if (other.getMitigations() != null && other.getMitigations().equals(this.getMitigations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackId() == null) ? 0 : getAttackId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSubResources() == null) ? 0 : getSubResources().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getAttackCounters() == null) ? 0 : getAttackCounters().hashCode());
        hashCode = prime * hashCode + ((getMitigations() == null) ? 0 : getMitigations().hashCode());
        return hashCode;
    }

    @Override
    public AttackDetail clone() {
        try {
            return (AttackDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
