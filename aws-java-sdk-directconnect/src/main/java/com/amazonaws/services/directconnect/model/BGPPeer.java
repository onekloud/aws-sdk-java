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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * A structure containing information about a BGP peer.
 * </p>
 */
public class BGPPeer implements Serializable, Cloneable {

    private Integer asn;

    private String authKey;

    private String addressFamily;

    private String amazonAddress;

    private String customerAddress;

    private String bgpPeerState;

    private String bgpStatus;

    /**
     * @param asn
     */

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * @return
     */

    public Integer getAsn() {
        return this.asn;
    }

    /**
     * @param asn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withAsn(Integer asn) {
        setAsn(asn);
        return this;
    }

    /**
     * @param authKey
     */

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    /**
     * @return
     */

    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @param authKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withAuthKey(String authKey) {
        setAuthKey(authKey);
        return this;
    }

    /**
     * @param addressFamily
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * @return
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * @param addressFamily
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public BGPPeer withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * @param addressFamily
     * @see AddressFamily
     */

    public void setAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
    }

    /**
     * @param addressFamily
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public BGPPeer withAddressFamily(AddressFamily addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * @param amazonAddress
     */

    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }

    /**
     * @return
     */

    public String getAmazonAddress() {
        return this.amazonAddress;
    }

    /**
     * @param amazonAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withAmazonAddress(String amazonAddress) {
        setAmazonAddress(amazonAddress);
        return this;
    }

    /**
     * @param customerAddress
     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return
     */

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    /**
     * @param customerAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BGPPeer withCustomerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    /**
     * @param bgpPeerState
     * @see BGPPeerState
     */

    public void setBgpPeerState(String bgpPeerState) {
        this.bgpPeerState = bgpPeerState;
    }

    /**
     * @return
     * @see BGPPeerState
     */

    public String getBgpPeerState() {
        return this.bgpPeerState;
    }

    /**
     * @param bgpPeerState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPPeerState
     */

    public BGPPeer withBgpPeerState(String bgpPeerState) {
        setBgpPeerState(bgpPeerState);
        return this;
    }

    /**
     * @param bgpPeerState
     * @see BGPPeerState
     */

    public void setBgpPeerState(BGPPeerState bgpPeerState) {
        this.bgpPeerState = bgpPeerState.toString();
    }

    /**
     * @param bgpPeerState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPPeerState
     */

    public BGPPeer withBgpPeerState(BGPPeerState bgpPeerState) {
        setBgpPeerState(bgpPeerState);
        return this;
    }

    /**
     * @param bgpStatus
     * @see BGPStatus
     */

    public void setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
    }

    /**
     * @return
     * @see BGPStatus
     */

    public String getBgpStatus() {
        return this.bgpStatus;
    }

    /**
     * @param bgpStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPStatus
     */

    public BGPPeer withBgpStatus(String bgpStatus) {
        setBgpStatus(bgpStatus);
        return this;
    }

    /**
     * @param bgpStatus
     * @see BGPStatus
     */

    public void setBgpStatus(BGPStatus bgpStatus) {
        this.bgpStatus = bgpStatus.toString();
    }

    /**
     * @param bgpStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BGPStatus
     */

    public BGPPeer withBgpStatus(BGPStatus bgpStatus) {
        setBgpStatus(bgpStatus);
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
        if (getAsn() != null)
            sb.append("Asn: " + getAsn() + ",");
        if (getAuthKey() != null)
            sb.append("AuthKey: " + getAuthKey() + ",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: " + getAddressFamily() + ",");
        if (getAmazonAddress() != null)
            sb.append("AmazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null)
            sb.append("CustomerAddress: " + getCustomerAddress() + ",");
        if (getBgpPeerState() != null)
            sb.append("BgpPeerState: " + getBgpPeerState() + ",");
        if (getBgpStatus() != null)
            sb.append("BgpStatus: " + getBgpStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BGPPeer == false)
            return false;
        BGPPeer other = (BGPPeer) obj;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAuthKey() == null ^ this.getAuthKey() == null)
            return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null)
            return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getBgpPeerState() == null ^ this.getBgpPeerState() == null)
            return false;
        if (other.getBgpPeerState() != null && other.getBgpPeerState().equals(this.getBgpPeerState()) == false)
            return false;
        if (other.getBgpStatus() == null ^ this.getBgpStatus() == null)
            return false;
        if (other.getBgpStatus() != null && other.getBgpStatus().equals(this.getBgpStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode());
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpPeerState() == null) ? 0 : getBgpPeerState().hashCode());
        hashCode = prime * hashCode + ((getBgpStatus() == null) ? 0 : getBgpStatus().hashCode());
        return hashCode;
    }

    @Override
    public BGPPeer clone() {
        try {
            return (BGPPeer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
