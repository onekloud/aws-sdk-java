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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codebuild.model.*;

/**
 * Interface for accessing AWS CodeBuild.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codebuild.AbstractAWSCodeBuild} instead.
 * </p>
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
public interface AWSCodeBuild {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codebuild";

    /**
     * Overrides the default endpoint for this client ("codebuild.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codebuild.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "codebuild.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codebuild.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "codebuild.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCodeBuild#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
    BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest);

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
    BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest);

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
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

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
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

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
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest);

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
    ListBuildsForProjectResult listBuildsForProject(ListBuildsForProjectRequest listBuildsForProjectRequest);

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return Result of the ListCuratedEnvironmentImages operation returned by the service.
     * @sample AWSCodeBuild.ListCuratedEnvironmentImages
     */
    ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest);

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
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

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
    StartBuildResult startBuild(StartBuildRequest startBuildRequest);

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
    StopBuildResult stopBuild(StopBuildRequest stopBuildRequest);

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
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
