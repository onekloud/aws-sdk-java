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
package com.amazonaws.services.codebuild;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.services.codebuild.model.transform.*;

/**
 * Client for accessing AWS CodeBuild. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully-managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
 * tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for the most popular programming languages
 * and build tools such as Apach Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests, and you pay
 * only for the build time you consume. For more information about AWS CodeBuild, see the <i>AWS CodeBuild User
 * Guide</i>.
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild will run a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i>
 * represents a combination of operating system, programming language runtime, and tools that AWS CodeBuild will use to
 * run a build. Also, you can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each build project name representing a single
 * build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified build project, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSCodeBuildClient extends AmazonWebServiceClient implements AWSCodeBuild {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeBuild.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codebuild";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                            com.amazonaws.services.codebuild.model.ResourceNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                            com.amazonaws.services.codebuild.model.InvalidInputException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AccountLimitExceededException").withModeledClass(
                            com.amazonaws.services.codebuild.model.AccountLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                            com.amazonaws.services.codebuild.model.ResourceAlreadyExistsException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.codebuild.model.AWSCodeBuildException.class));

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCodeBuildClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCodeBuildClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSCodeBuildClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AWSCodeBuildClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeBuild using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeBuildClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codebuild.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codebuild/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codebuild/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets information about one or more builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return Result of the BatchGetBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetBuilds
     */
    @Override
    public BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetBuildsRequest> request = null;
        Response<BatchGetBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetBuildsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetBuildsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetBuildsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return Result of the BatchGetProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetProjects
     */
    @Override
    public BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetProjectsRequest> request = null;
        Response<BatchGetProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetProjectsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceAlreadyExistsException
     *         The specified AWS resource cannot be created, because an AWS resource with the same settings already
     *         exists.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.CreateProject
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a build project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.DeleteProject
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return Result of the ListBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListBuilds
     */
    @Override
    public ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsRequest> request = null;
        Response<ListBuildsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuildsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuildsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuildsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return Result of the ListBuildsForProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.ListBuildsForProject
     */
    @Override
    public ListBuildsForProjectResult listBuildsForProject(ListBuildsForProjectRequest listBuildsForProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuildsForProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsForProjectRequest> request = null;
        Response<ListBuildsForProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsForProjectRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuildsForProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuildsForProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuildsForProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return Result of the ListCuratedEnvironmentImages operation returned by the service.
     * @sample AWSCodeBuild.ListCuratedEnvironmentImages
     */
    @Override
    public ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCuratedEnvironmentImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCuratedEnvironmentImagesRequest> request = null;
        Response<ListCuratedEnvironmentImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCuratedEnvironmentImagesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCuratedEnvironmentImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCuratedEnvironmentImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCuratedEnvironmentImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of build project names, with each build project name representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListProjects
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return Result of the StartBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.StartBuild
     */
    @Override
    public StartBuildResult startBuild(StartBuildRequest startBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(startBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBuildRequest> request = null;
        Response<StartBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBuildRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBuildResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * <note>
     * <p>
     * Completed builds cannot be stopped.
     * </p>
     * </note>
     * 
     * @param stopBuildRequest
     * @return Result of the StopBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.StopBuild
     */
    @Override
    public StopBuildResult stopBuild(StopBuildRequest stopBuildRequest) {

        ExecutionContext executionContext = createExecutionContext(stopBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBuildRequest> request = null;
        Response<StopBuildResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBuildRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopBuildRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopBuildResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopBuildResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the settings of an existing build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.UpdateProject
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
