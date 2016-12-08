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

/**
 * <p>
 * The target registered with the Maintenance Window.
 * </p>
 */
public class MaintenanceWindowTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The Maintenance Window ID where the target is registered.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The ID of the target.
     * </p>
     */
    private String windowTargetId;
    /**
     * <p>
     * The type of target.
     * </p>
     */
    private String resourceType;
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
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     */
    private String ownerInformation;

    /**
     * <p>
     * The Maintenance Window ID where the target is registered.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID where the target is registered.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID where the target is registered.
     * </p>
     * 
     * @return The Maintenance Window ID where the target is registered.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID where the target is registered.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID where the target is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @return The ID of the target.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
        return this;
    }

    /**
     * <p>
     * The type of target.
     * </p>
     * 
     * @param resourceType
     *        The type of target.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of target.
     * </p>
     * 
     * @return The type of target.
     * @see MaintenanceWindowResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of target.
     * </p>
     * 
     * @param resourceType
     *        The type of target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public MaintenanceWindowTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of target.
     * </p>
     * 
     * @param resourceType
     *        The type of target.
     * @see MaintenanceWindowResourceType
     */

    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of target.
     * </p>
     * 
     * @param resourceType
     *        The type of target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowResourceType
     */

    public MaintenanceWindowTarget withResourceType(MaintenanceWindowResourceType resourceType) {
        setResourceType(resourceType);
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

    public MaintenanceWindowTarget withTargets(Target... targets) {
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

    public MaintenanceWindowTarget withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *        targets in this Maintenance Window.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @return User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *         targets in this Maintenance Window.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets
     * in this Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that will be included in any CloudWatch events raised while running tasks for these
     *        targets in this Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTarget withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
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
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: " + getWindowTargetId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: " + getOwnerInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTarget == false)
            return false;
        MaintenanceWindowTarget other = (MaintenanceWindowTarget) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null)
            return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowTarget clone() {
        try {
            return (MaintenanceWindowTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
