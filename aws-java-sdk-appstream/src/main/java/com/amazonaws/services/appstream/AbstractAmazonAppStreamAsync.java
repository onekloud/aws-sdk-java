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
package com.amazonaws.services.appstream;

import com.amazonaws.services.appstream.model.*;

/**
 * Abstract implementation of {@code AmazonAppStreamAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonAppStreamAsync extends AbstractAmazonAppStream implements AmazonAppStreamAsync {

    protected AbstractAmazonAppStreamAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest request) {

        return associateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateFleetRequest, AssociateFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest request) {

        return createStreamingURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingURLRequest, CreateStreamingURLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request) {

        return describeFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest request) {

        return describeSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest request) {

        return disassociateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateFleetRequest, DisassociateFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest request) {

        return expireSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<ExpireSessionRequest, ExpireSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest request) {

        return listAssociatedFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedFleetsRequest, ListAssociatedFleetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest request) {

        return listAssociatedStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedStacksRequest, ListAssociatedStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest request) {

        return startFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFleetRequest, StartFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest request) {

        return stopFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<StopFleetRequest, StopFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest request) {

        return updateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
