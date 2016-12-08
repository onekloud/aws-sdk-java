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
package com.amazonaws.services.stepfunctions;

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

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.services.stepfunctions.model.transform.*;

/**
 * Client for accessing AWS SFN. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Step Functions</fullname>
 * <p>
 * AWS Step Functions is a web service that enables you to coordinate the components of distributed applications and
 * microservices using visual workflows. You build applications from individual components that each perform a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a graphical
 * console to visualize the components of your application as a series of steps. It automatically triggers and tracks
 * each step, and retries when there are errors, so your application executes in order and as expected, every time. Step
 * Functions logs the state of each step, so when things do go wrong, you can diagnose and debug problems quickly.
 * </p>
 * <p>
 * Step Functions manages the operations and underlying infrastructure for you to ensure your application is available
 * at any scale. You can run tasks on the AWS cloud, on your own servers, or an any system that has access to AWS. Step
 * Functions can be accessed and used with the Step Functions console, the AWS SDKs (included with your Beta release
 * invitation email), or an HTTP API (the subject of this document).
 * </p>
 */
@ThreadSafe
public class AWSStepFunctionsClient extends AmazonWebServiceClient implements AWSStepFunctions {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSStepFunctions.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "states";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.0")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ActivityDoesNotExist").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ActivityDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("StateMachineLimitExceeded").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.StateMachineLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidToken").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidTokenException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDefinition").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidDefinitionException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidName").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidNameException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidOutput").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidOutputException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ActivityLimitExceeded").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ActivityLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("StateMachineAlreadyExists").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.StateMachineAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExecutionLimitExceeded").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ExecutionLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidExecutionInput").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidExecutionInputException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidArn").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.InvalidArnException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("StateMachineDeleting").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.StateMachineDeletingException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ActivityWorkerLimitExceeded").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ActivityWorkerLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TaskDoesNotExist").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("TaskTimedOut").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.TaskTimedOutException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExecutionAlreadyExists").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ExecutionAlreadyExistsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("StateMachineDoesNotExist").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.StateMachineDoesNotExistException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExecutionDoesNotExist").withModeledClass(
                            com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.stepfunctions.model.AWSStepFunctionsException.class));

    /**
     * Constructs a new client to invoke service methods on AWS SFN. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AWSStepFunctionsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSStepFunctionsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSStepFunctionsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSStepFunctionsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSStepFunctionsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SFN using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSStepFunctionsClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("states.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/stepfunctions/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/stepfunctions/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an activity.
     * </p>
     * 
     * @param createActivityRequest
     * @return Result of the CreateActivity operation returned by the service.
     * @throws ActivityLimitExceededException
     *         The maximum number of activities has been reached. Existing activities must be deleted before a new
     *         activity can be created.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @sample AWSStepFunctions.CreateActivity
     */
    @Override
    public CreateActivityResult createActivity(CreateActivityRequest createActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(createActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActivityRequest> request = null;
        Response<CreateActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActivityRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a state machine.
     * </p>
     * 
     * @param createStateMachineRequest
     * @return Result of the CreateStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidDefinitionException
     *         The provided Amazon States Language definition is invalid.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @throws StateMachineAlreadyExistsException
     *         A state machine with the same name but a different definition or role ARN already exists.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @throws StateMachineLimitExceededException
     *         The maximum number of state machines has been reached. Existing state machines must be deleted before a
     *         new state machine can be created.
     * @sample AWSStepFunctions.CreateStateMachine
     */
    @Override
    public CreateStateMachineResult createStateMachine(CreateStateMachineRequest createStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(createStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStateMachineRequest> request = null;
        Response<CreateStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStateMachineRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an activity.
     * </p>
     * 
     * @param deleteActivityRequest
     * @return Result of the DeleteActivity operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DeleteActivity
     */
    @Override
    public DeleteActivityResult deleteActivity(DeleteActivityRequest deleteActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActivityRequest> request = null;
        Response<DeleteActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActivityRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a state machine. This is an asynchronous operation-- it sets the state machine's status to "DELETING" and
     * begins the delete process.
     * </p>
     * 
     * @param deleteStateMachineRequest
     * @return Result of the DeleteStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DeleteStateMachine
     */
    @Override
    public DeleteStateMachineResult deleteStateMachine(DeleteStateMachineRequest deleteStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStateMachineRequest> request = null;
        Response<DeleteStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStateMachineRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an activity.
     * </p>
     * 
     * @param describeActivityRequest
     * @return Result of the DescribeActivity operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DescribeActivity
     */
    @Override
    public DescribeActivityResult describeActivity(DescribeActivityRequest describeActivityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActivityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivityRequest> request = null;
        Response<DescribeActivityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivityRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActivityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeActivityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeActivityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an execution.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.DescribeExecution
     */
    @Override
    public DescribeExecutionResult describeExecution(DescribeExecutionRequest describeExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExecutionRequest> request = null;
        Response<DescribeExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a state machine.
     * </p>
     * 
     * @param describeStateMachineRequest
     * @return Result of the DescribeStateMachine operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @sample AWSStepFunctions.DescribeStateMachine
     */
    @Override
    public DescribeStateMachineResult describeStateMachine(DescribeStateMachineRequest describeStateMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStateMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStateMachineRequest> request = null;
        Response<DescribeStateMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStateMachineRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStateMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStateMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStateMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to retrieve a task (with the specified activity ARN) scheduled for execution by a running state
     * machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a
     * task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds
     * on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll will
     * return an empty result, that is, the <code>taskToken</code> returned is an empty string.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
     * time the service may hold the poll request).
     * </p>
     * </important>
     * 
     * @param getActivityTaskRequest
     * @return Result of the GetActivityTask operation returned by the service.
     * @throws ActivityDoesNotExistException
     *         The specified activity does not exist.
     * @throws ActivityWorkerLimitExceededException
     *         The maximum number of workers concurrently polling for activity tasks has been reached.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.GetActivityTask
     */
    @Override
    public GetActivityTaskResult getActivityTask(GetActivityTaskRequest getActivityTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getActivityTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActivityTaskRequest> request = null;
        Response<GetActivityTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActivityTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getActivityTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetActivityTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetActivityTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the history of the specified execution as a list of events. By default, the results are returned in
     * ascending order of the <code>timeStamp</code> of the events. Use the <code>reverseOrder</code> parameter to get
     * the latest events first. The results may be split into multiple pages. To retrieve subsequent pages, make the
     * call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param getExecutionHistoryRequest
     * @return Result of the GetExecutionHistory operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.GetExecutionHistory
     */
    @Override
    public GetExecutionHistoryResult getExecutionHistory(GetExecutionHistoryRequest getExecutionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getExecutionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExecutionHistoryRequest> request = null;
        Response<GetExecutionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExecutionHistoryRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExecutionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExecutionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExecutionHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing activities. The results may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param listActivitiesRequest
     * @return Result of the ListActivities operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.ListActivities
     */
    @Override
    public ListActivitiesResult listActivities(ListActivitiesRequest listActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListActivitiesRequest> request = null;
        Response<ListActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListActivitiesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListActivitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListActivitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the executions of a state machine that meet the filtering criteria. The results may be split into multiple
     * pages. To retrieve subsequent pages, make the call again using the <code>nextToken</code> returned by the
     * previous call.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @sample AWSStepFunctions.ListExecutions
     */
    @Override
    public ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExecutionsRequest> request = null;
        Response<ListExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExecutionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the existing state machines. The results may be split into multiple pages. To retrieve subsequent pages,
     * make the call again using the <code>nextToken</code> returned by the previous call.
     * </p>
     * 
     * @param listStateMachinesRequest
     * @return Result of the ListStateMachines operation returned by the service.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @sample AWSStepFunctions.ListStateMachines
     */
    @Override
    public ListStateMachinesResult listStateMachines(ListStateMachinesRequest listStateMachinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStateMachinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStateMachinesRequest> request = null;
        Response<ListStateMachinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStateMachinesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStateMachinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStateMachinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStateMachinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> failed.
     * </p>
     * 
     * @param sendTaskFailureRequest
     * @return Result of the SendTaskFailure operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskFailure
     */
    @Override
    public SendTaskFailureResult sendTaskFailure(SendTaskFailureRequest sendTaskFailureRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskFailureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskFailureRequest> request = null;
        Response<SendTaskFailureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskFailureRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskFailureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskFailureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskFailureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to report to the service that the task represented by the specified <code>taskToken</code> is
     * still making progress. This action resets the <code>Heartbeat</code> clock. The <code>Heartbeat</code> threshold
     * is specified in the state machine's Amazon States Language definition. This action does not in itself create an
     * event in the execution history. However, if the task times out, the execution history will contain an
     * <code>ActivityTimedOut</code> event.
     * </p>
     * <note>
     * <p>
     * The <code>Timeout</code> of a task, defined in the state machine's Amazon States Language definition, is its
     * maximum allowed duration, regardless of the number of <a>SendTaskHeartbeat</a> requests received.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only useful for long-lived tasks to report the liveliness of the task.
     * </p>
     * </note>
     * 
     * @param sendTaskHeartbeatRequest
     * @return Result of the SendTaskHeartbeat operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskHeartbeat
     */
    @Override
    public SendTaskHeartbeatResult sendTaskHeartbeat(SendTaskHeartbeatRequest sendTaskHeartbeatRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskHeartbeatRequest> request = null;
        Response<SendTaskHeartbeatResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskHeartbeatRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskHeartbeatResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskHeartbeatResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by workers to report that the task identified by the <code>taskToken</code> completed successfully.
     * </p>
     * 
     * @param sendTaskSuccessRequest
     * @return Result of the SendTaskSuccess operation returned by the service.
     * @throws TaskDoesNotExistException
     * @throws InvalidOutputException
     *         The provided JSON output data is invalid.
     * @throws InvalidTokenException
     *         The provided token is invalid.
     * @throws TaskTimedOutException
     * @sample AWSStepFunctions.SendTaskSuccess
     */
    @Override
    public SendTaskSuccessResult sendTaskSuccess(SendTaskSuccessRequest sendTaskSuccessRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTaskSuccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTaskSuccessRequest> request = null;
        Response<SendTaskSuccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTaskSuccessRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTaskSuccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTaskSuccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTaskSuccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a state machine execution.
     * </p>
     * 
     * @param startExecutionRequest
     * @return Result of the StartExecution operation returned by the service.
     * @throws ExecutionLimitExceededException
     *         The maximum number of running executions has been reached. Running executions must end or be stopped
     *         before a new execution can be started.
     * @throws ExecutionAlreadyExistsException
     *         An execution with the same name already exists.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @throws InvalidExecutionInputException
     *         The provided JSON input data is invalid.
     * @throws InvalidNameException
     *         The provided name is invalid.
     * @throws StateMachineDoesNotExistException
     *         The specified state machine does not exist.
     * @throws StateMachineDeletingException
     *         The specified state machine is being deleted.
     * @sample AWSStepFunctions.StartExecution
     */
    @Override
    public StartExecutionResult startExecution(StartExecutionRequest startExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExecutionRequest> request = null;
        Response<StartExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an execution.
     * </p>
     * 
     * @param stopExecutionRequest
     * @return Result of the StopExecution operation returned by the service.
     * @throws ExecutionDoesNotExistException
     *         The specified execution does not exist.
     * @throws InvalidArnException
     *         The provided Amazon Resource Name (ARN) is invalid.
     * @sample AWSStepFunctions.StopExecution
     */
    @Override
    public StopExecutionResult stopExecution(StopExecutionRequest stopExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopExecutionRequest> request = null;
        Response<StopExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopExecutionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopExecutionResultJsonUnmarshaller());
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
