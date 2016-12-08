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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class SegmentDemographics implements Serializable, Cloneable {

    /** The app version criteria for the segment. */
    private SetDimension appVersion;
    /** The device type criteria for the segment. */
    private SetDimension deviceType;
    /** The device make criteria for the segment. */
    private SetDimension make;
    /** The device model criteria for the segment. */
    private SetDimension model;
    /** The device platform criteria for the segment. */
    private SetDimension platform;

    /**
     * The app version criteria for the segment.
     * 
     * @param appVersion
     *        The app version criteria for the segment.
     */

    public void setAppVersion(SetDimension appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * The app version criteria for the segment.
     * 
     * @return The app version criteria for the segment.
     */

    public SetDimension getAppVersion() {
        return this.appVersion;
    }

    /**
     * The app version criteria for the segment.
     * 
     * @param appVersion
     *        The app version criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDemographics withAppVersion(SetDimension appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * The device type criteria for the segment.
     * 
     * @param deviceType
     *        The device type criteria for the segment.
     */

    public void setDeviceType(SetDimension deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * The device type criteria for the segment.
     * 
     * @return The device type criteria for the segment.
     */

    public SetDimension getDeviceType() {
        return this.deviceType;
    }

    /**
     * The device type criteria for the segment.
     * 
     * @param deviceType
     *        The device type criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDemographics withDeviceType(SetDimension deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * The device make criteria for the segment.
     * 
     * @param make
     *        The device make criteria for the segment.
     */

    public void setMake(SetDimension make) {
        this.make = make;
    }

    /**
     * The device make criteria for the segment.
     * 
     * @return The device make criteria for the segment.
     */

    public SetDimension getMake() {
        return this.make;
    }

    /**
     * The device make criteria for the segment.
     * 
     * @param make
     *        The device make criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDemographics withMake(SetDimension make) {
        setMake(make);
        return this;
    }

    /**
     * The device model criteria for the segment.
     * 
     * @param model
     *        The device model criteria for the segment.
     */

    public void setModel(SetDimension model) {
        this.model = model;
    }

    /**
     * The device model criteria for the segment.
     * 
     * @return The device model criteria for the segment.
     */

    public SetDimension getModel() {
        return this.model;
    }

    /**
     * The device model criteria for the segment.
     * 
     * @param model
     *        The device model criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDemographics withModel(SetDimension model) {
        setModel(model);
        return this;
    }

    /**
     * The device platform criteria for the segment.
     * 
     * @param platform
     *        The device platform criteria for the segment.
     */

    public void setPlatform(SetDimension platform) {
        this.platform = platform;
    }

    /**
     * The device platform criteria for the segment.
     * 
     * @return The device platform criteria for the segment.
     */

    public SetDimension getPlatform() {
        return this.platform;
    }

    /**
     * The device platform criteria for the segment.
     * 
     * @param platform
     *        The device platform criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDemographics withPlatform(SetDimension platform) {
        setPlatform(platform);
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
        if (getAppVersion() != null)
            sb.append("AppVersion: " + getAppVersion() + ",");
        if (getDeviceType() != null)
            sb.append("DeviceType: " + getDeviceType() + ",");
        if (getMake() != null)
            sb.append("Make: " + getMake() + ",");
        if (getModel() != null)
            sb.append("Model: " + getModel() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDemographics == false)
            return false;
        SegmentDemographics other = (SegmentDemographics) obj;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getMake() == null ^ this.getMake() == null)
            return false;
        if (other.getMake() != null && other.getMake().equals(this.getMake()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getMake() == null) ? 0 : getMake().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public SegmentDemographics clone() {
        try {
            return (SegmentDemographics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
