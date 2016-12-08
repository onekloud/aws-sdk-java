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
 * </p>
 */
public class TelemetryRecord implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * </p>
     */
    private Integer segmentsReceivedCount;
    /**
     * <p>
     * </p>
     */
    private Integer segmentsSentCount;
    /**
     * <p>
     * </p>
     */
    private Integer segmentsSpilloverCount;
    /**
     * <p>
     * </p>
     */
    private Integer segmentsRejectedCount;
    /**
     * <p>
     * </p>
     */
    private BackendConnectionErrors backendConnectionErrors;

    /**
     * <p>
     * </p>
     * 
     * @param timestamp
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * </p>
     * 
     * @param timestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsReceivedCount
     */

    public void setSegmentsReceivedCount(Integer segmentsReceivedCount) {
        this.segmentsReceivedCount = segmentsReceivedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getSegmentsReceivedCount() {
        return this.segmentsReceivedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsReceivedCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withSegmentsReceivedCount(Integer segmentsReceivedCount) {
        setSegmentsReceivedCount(segmentsReceivedCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsSentCount
     */

    public void setSegmentsSentCount(Integer segmentsSentCount) {
        this.segmentsSentCount = segmentsSentCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getSegmentsSentCount() {
        return this.segmentsSentCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsSentCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withSegmentsSentCount(Integer segmentsSentCount) {
        setSegmentsSentCount(segmentsSentCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsSpilloverCount
     */

    public void setSegmentsSpilloverCount(Integer segmentsSpilloverCount) {
        this.segmentsSpilloverCount = segmentsSpilloverCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getSegmentsSpilloverCount() {
        return this.segmentsSpilloverCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsSpilloverCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withSegmentsSpilloverCount(Integer segmentsSpilloverCount) {
        setSegmentsSpilloverCount(segmentsSpilloverCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsRejectedCount
     */

    public void setSegmentsRejectedCount(Integer segmentsRejectedCount) {
        this.segmentsRejectedCount = segmentsRejectedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getSegmentsRejectedCount() {
        return this.segmentsRejectedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param segmentsRejectedCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withSegmentsRejectedCount(Integer segmentsRejectedCount) {
        setSegmentsRejectedCount(segmentsRejectedCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param backendConnectionErrors
     */

    public void setBackendConnectionErrors(BackendConnectionErrors backendConnectionErrors) {
        this.backendConnectionErrors = backendConnectionErrors;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public BackendConnectionErrors getBackendConnectionErrors() {
        return this.backendConnectionErrors;
    }

    /**
     * <p>
     * </p>
     * 
     * @param backendConnectionErrors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelemetryRecord withBackendConnectionErrors(BackendConnectionErrors backendConnectionErrors) {
        setBackendConnectionErrors(backendConnectionErrors);
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
        if (getSegmentsReceivedCount() != null)
            sb.append("SegmentsReceivedCount: " + getSegmentsReceivedCount() + ",");
        if (getSegmentsSentCount() != null)
            sb.append("SegmentsSentCount: " + getSegmentsSentCount() + ",");
        if (getSegmentsSpilloverCount() != null)
            sb.append("SegmentsSpilloverCount: " + getSegmentsSpilloverCount() + ",");
        if (getSegmentsRejectedCount() != null)
            sb.append("SegmentsRejectedCount: " + getSegmentsRejectedCount() + ",");
        if (getBackendConnectionErrors() != null)
            sb.append("BackendConnectionErrors: " + getBackendConnectionErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelemetryRecord == false)
            return false;
        TelemetryRecord other = (TelemetryRecord) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getSegmentsReceivedCount() == null ^ this.getSegmentsReceivedCount() == null)
            return false;
        if (other.getSegmentsReceivedCount() != null && other.getSegmentsReceivedCount().equals(this.getSegmentsReceivedCount()) == false)
            return false;
        if (other.getSegmentsSentCount() == null ^ this.getSegmentsSentCount() == null)
            return false;
        if (other.getSegmentsSentCount() != null && other.getSegmentsSentCount().equals(this.getSegmentsSentCount()) == false)
            return false;
        if (other.getSegmentsSpilloverCount() == null ^ this.getSegmentsSpilloverCount() == null)
            return false;
        if (other.getSegmentsSpilloverCount() != null && other.getSegmentsSpilloverCount().equals(this.getSegmentsSpilloverCount()) == false)
            return false;
        if (other.getSegmentsRejectedCount() == null ^ this.getSegmentsRejectedCount() == null)
            return false;
        if (other.getSegmentsRejectedCount() != null && other.getSegmentsRejectedCount().equals(this.getSegmentsRejectedCount()) == false)
            return false;
        if (other.getBackendConnectionErrors() == null ^ this.getBackendConnectionErrors() == null)
            return false;
        if (other.getBackendConnectionErrors() != null && other.getBackendConnectionErrors().equals(this.getBackendConnectionErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSegmentsReceivedCount() == null) ? 0 : getSegmentsReceivedCount().hashCode());
        hashCode = prime * hashCode + ((getSegmentsSentCount() == null) ? 0 : getSegmentsSentCount().hashCode());
        hashCode = prime * hashCode + ((getSegmentsSpilloverCount() == null) ? 0 : getSegmentsSpilloverCount().hashCode());
        hashCode = prime * hashCode + ((getSegmentsRejectedCount() == null) ? 0 : getSegmentsRejectedCount().hashCode());
        hashCode = prime * hashCode + ((getBackendConnectionErrors() == null) ? 0 : getBackendConnectionErrors().hashCode());
        return hashCode;
    }

    @Override
    public TelemetryRecord clone() {
        try {
            return (TelemetryRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
