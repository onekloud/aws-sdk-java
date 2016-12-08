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
package com.amazonaws.services.route53;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.services.route53.waiters.AmazonRoute53Waiters;

/**
 * Interface for accessing Route 53.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53.AbstractAmazonRoute53} instead.
 * </p>
 */
public interface AmazonRoute53 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53";

    /**
     * Overrides the default endpoint for this client ("https://route53.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53.amazonaws.com") or a full URL, including the protocol (ex:
     * "https://route53.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "route53.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://route53.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRoute53#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     * Associates an Amazon VPC with a private hosted zone.
     * </p>
     * <important>
     * <p>
     * To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public
     * hosted zone into a private hosted zone.
     * </p>
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include a document with an <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response contains a <code>ChangeInfo</code> data type that you can use to track the progress of the
     * request.
     * </p>
     * <note>
     * <p>
     * If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was
     * created by using a different account, the AWS account that created the private hosted zone must first submit a
     * <code>CreateVPCAssociationAuthorization</code> request. Then the account that created the VPC must submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * </note>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to associate a VPC with a private hosted zone.
     * @return Result of the AssociateVPCWithHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws NotAuthorizedException
     *         Associating the specified VPC with the specified hosted zone has not been authorized.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PublicZoneVPCAssociationException
     *         You're trying to associate a VPC with a public hosted zone. Amazon Route 53 doesn't support associating a
     *         VPC with a public hosted zone.
     * @throws ConflictingDomainExistsException
     *         You specified an Amazon VPC that you're already using for another hosted zone, and the domain that you
     *         specified for one of the hosted zones is a subdomain of the domain that you specified for the other
     *         hosted zone. For example, you can't use the same Amazon VPC for the hosted zones for example.com and
     *         test.example.com.
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @sample AmazonRoute53.AssociateVPCWithHostedZone
     */
    AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest);

    /**
     * <p>
     * Create, change, update, or delete authoritative DNS information on all Amazon Route 53 servers. Send a
     * <code>POST</code> request to:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>Amazon Route 53 hosted Zone ID</i>/rrset</code> resource.
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. When using the Amazon Route 53 API to change resource record sets, Amazon Route 53 either makes all or
     * none of the changes in a change batch request. This ensures that Amazon Route 53 never partially implements the
     * intended changes to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, a change batch request that deletes the <code>CNAME</code> record for www.example.com and creates an
     * alias resource record set for www.example.com. Amazon Route 53 deletes the first resource record set and creates
     * the second resource record set in a single operation. If either the <code>DELETE</code> or the
     * <code>CREATE</code> action fails, then both changes (plus any other changes in the batch) fail, and the original
     * <code>CNAME</code> record continues to exist.
     * </p>
     * <important>
     * <p>
     * Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
     * single change batch. If you attempt to delete the same change batch more than once, Amazon Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </important> <note>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Amazon Route 53 console or the API actions for traffic policies and traffic policy instances. Save the
     * configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as
     * example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones.
     * You can roll back the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route DNS
     * Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Use <code>ChangeResourceRecordsSetsRequest</code> to perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes an existing resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set does not already exist, AWS creates it. If a resource set does
     * exist, Amazon Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The values that you need to include in the request depend on the type of resource record set that you're
     * creating, deleting, or updating:
     * </p>
     * <p>
     * <b>Basic resource record sets (excluding alias, failover, geolocation, latency, and weighted resource record
     * sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Failover, geolocation, latency, or weighted resource record sets (excluding alias resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Alias resource record sets (including failover alias, geolocation alias, latency alias, and weighted alias
     * resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AliasTarget</code> (includes <code>DNSName</code>, <code>EvaluateTargetHealth</code>, and
     * <code>HostedZoneId</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code> (for failover, geolocation, latency, and weighted resource record sets)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Amazon Route 53 propagates your changes to all
     * of the Amazon Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code>
     * returns a status of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status
     * of <code>INSYNC</code>. Changes generally propagate to all Amazon Route 53 name servers in a few minutes. In rare
     * circumstances, propagation can take up to 30 minutes. For more information, see <a>GetChange</a>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains change information for the resource record set.
     * @return Result of the ChangeResourceRecordSets operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws InvalidChangeBatchException
     *         This exception contains a list of messages that might contain one or more error messages. Each error
     *         message indicates one error in the change batch.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @sample AmazonRoute53.ChangeResourceRecordSets
     */
    ChangeResourceRecordSetsResult changeResourceRecordSets(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest
     *        A complex type that contains information about the tags that you want to add, edit, or delete.
     * @return Result of the ChangeTagsForResource operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ChangeTagsForResource
     */
    ChangeTagsForResourceResult changeTagsForResource(ChangeTagsForResourceRequest changeTagsForResourceRequest);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the <code>/2013-04-01/healthcheck</code>
     * resource. The request body must include a document with a <code>CreateHealthCheckRequest</code> element. The
     * response returns the <code>CreateHealthCheckResponse</code> element, containing the health check ID specified
     * when adding health check to a resource record set. For information about adding health checks to resource record
     * sets, see <a>ResourceRecordSet$HealthCheckId</a> in <a>ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * If you are registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to an Amazon Route 53 health check.
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP
     * address, you must assign a public IP address to the instance in the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure a health checker to check the health of an external resource that the instance relies on, such
     * as a database server.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is
     * based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the
     * Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to the metric, and then create a health check that
     * is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the
     * CloudWatch console, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @return Result of the CreateHealthCheck operation returned by the service.
     * @throws TooManyHealthChecksException
     *         You have reached the maximum number of active health checks for an AWS account. The default limit is 100.
     *         To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS
     *         Support Center.
     * @throws HealthCheckAlreadyExistsException
     *         The health check you're attempting to create already exists.</p>
     *         <p>
     *         Amazon Route 53 returns this error when a health check has already been created with the specified value
     *         for <code>CallerReference</code>.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.CreateHealthCheck
     */
    CreateHealthCheckResult createHealthCheck(CreateHealthCheckRequest createHealthCheckRequest);

    /**
     * <p>
     * Creates a new public hosted zone, used to specify how the Domain Name System (DNS) routes traffic on the Internet
     * for a domain, such as example.com, and its subdomains.
     * </p>
     * <important>
     * <p>
     * Public hosted zones can't be converted to a private hosted zone or vice versa. Instead, create a new hosted zone
     * with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone</code> resource. The request body must
     * include a document with a <code>CreateHostedZoneRequest</code> element. The response returns the
     * <code>CreateHostedZoneResponse</code> element containing metadata about the hosted zone.
     * </p>
     * <p>
     * Fore more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD).
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information
     * about SOA and NS records, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Amazon
     * Route 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Amazon Route 53, you must update the name servers with
     * your registrar to make Amazon Route 53 your DNS service. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/creating-migrating.html">Configuring Amazon Route
     * 53 as your DNS Service</a> in the <i>Amazon Route 53 Developer's Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating a zone, its initial status is <code>PENDING</code>. This means that it is not yet available on all
     * DNS servers. The status of the zone changes to <code>INSYNC</code> when the NS and SOA records are available on
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, specify an optional DelegationSetId, and
     * Amazon Route 53 would assign those 4 NS records for the zone, instead of allotting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type containing the hosted zone request information.
     * @return Result of the CreateHostedZone operation returned by the service.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @throws HostedZoneAlreadyExistsException
     *         The hosted zone you are trying to create already exists. Amazon Route 53 returns this error when a hosted
     *         zone has already been created with the specified <code>CallerReference</code>.
     * @throws TooManyHostedZonesException
     *         This hosted zone can't be created because the hosted zone limit is exceeded. To request a limit increase,
     *         go to the Amazon Route 53 <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws DelegationSetNotAvailableException
     *         You can create a hosted zone that has the same name as an existing hosted zone (example.com is common),
     *         but there is a limit to the number of hosted zones that have the same name. If you get this error, Amazon
     *         Route 53 has reached that limit. If you own the domain name and Amazon Route 53 generates this error,
     *         contact Customer Support.
     * @throws ConflictingDomainExistsException
     *         You specified an Amazon VPC that you're already using for another hosted zone, and the domain that you
     *         specified for one of the hosted zones is a subdomain of the domain that you specified for the other
     *         hosted zone. For example, you can't use the same Amazon VPC for the hosted zones for example.com and
     *         test.example.com.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @sample AmazonRoute53.CreateHostedZone
     */
    CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest createHostedZoneRequest);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
     * zoned ID is specified, <code>CreateReusableDelegationSet</code> marks the delegation set associated with that
     * zone as reusable
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/delegationset</code> resource. The request body must
     * include a document with a <code>CreateReusableDelegationSetRequest</code> element.
     * </p>
     * <note>
     * <p>
     * A reusable delegation set can't be associated with a private hosted zone/
     * </p>
     * </note>
     * <p>
     * For more information, including a procedure on how to create and configure a reusable delegation set (also known
     * as white label name servers), see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @return Result of the CreateReusableDelegationSet operation returned by the service.
     * @throws DelegationSetAlreadyCreatedException
     *         A delegation set with the same owner and caller reference combination has already been created.
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @throws HostedZoneNotFoundException
     *         The specified HostedZone can't be found.
     * @throws InvalidArgumentException
     *         Parameter name and problem.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws DelegationSetNotAvailableException
     *         You can create a hosted zone that has the same name as an existing hosted zone (example.com is common),
     *         but there is a limit to the number of hosted zones that have the same name. If you get this error, Amazon
     *         Route 53 has reached that limit. If you own the domain name and Amazon Route 53 generates this error,
     *         contact Customer Support.
     * @throws DelegationSetAlreadyReusableException
     *         The specified delegation set has already been marked as reusable.
     * @sample AmazonRoute53.CreateReusableDelegationSet
     */
    CreateReusableDelegationSetResult createReusableDelegationSet(CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy</code> resource. The request body must
     * include a document with a <code>CreateTrafficPolicyRequest</code> element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains information about the new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy that you want to create.
     * @return Result of the CreateTrafficPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TooManyTrafficPoliciesException
     *         You've created the maximum number of traffic policies that can be created for the current AWS account.
     *         You can request an increase to the limit on the <a href="http://aws.amazon.com/route53-request/">Contact
     *         Us</a> page.
     * @throws TrafficPolicyAlreadyExistsException
     *         A traffic policy that has the same value for <code>Name</code> already exists.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in the <code>Document</code> element is
     *         invalid.
     * @sample AmazonRoute53.CreateTrafficPolicy
     */
    CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy
     * version. In addition, <code>CreateTrafficPolicyInstance</code> associates the resource record sets with a
     * specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds
     * to DNS queries for the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance</code> resource. The request body
     * must include a document with a <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains information about the traffic policy
     * instance.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to create based on a
     *        specified traffic policy.
     * @return Result of the CreateTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TooManyTrafficPolicyInstancesException
     *         You've created the maximum number of traffic policy instances that can be created for the current AWS
     *         account. You can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a> page.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws TrafficPolicyInstanceAlreadyExistsException
     *         Traffic policy instance with given Id already exists.
     * @sample AmazonRoute53.CreateTrafficPolicyInstance
     */
    CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you
     * specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new
     * version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a
     * traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic
     * policy.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource. The request body
     * includes a document with a <code>CreateTrafficPolicyVersionRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyVersionResponse</code> element, which contains information about the new version of the
     * traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy for which you want to create a new
     *        version.
     * @return Result of the CreateTrafficPolicyVersion operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same time that you did. Retry the request.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in the <code>Document</code> element is
     *         invalid.
     * @sample AmazonRoute53.CreateTrafficPolicyVersion
     */
    CreateTrafficPolicyVersionResult createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest);

    /**
     * <p>
     * Authorizes the AWS account that created a specified VPC to submit an <code>AssociateVPCWithHostedZone</code>
     * request to associate the VPC with a specified hosted zone that was created by a different account. To submit a
     * <code>CreateVPCAssociationAuthorization</code> request, you must use the account that created the hosted zone.
     * After you authorize the association, use the account that created the VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * <note>
     * <p>
     * If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created
     * by using a different account, you must submit one authorization request for each VPC.
     * </p>
     * </note>
     * <p>
     * Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The request body must
     * include a document with a <code>CreateVPCAssociationAuthorizationRequest</code> element. The response contains
     * information about the authorization.
     * </p>
     * 
     * @param createVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to authorize associating a VPC with your
     *        private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by
     *        using different accounts.
     * @return Result of the CreateVPCAssociationAuthorization operation returned by the service.
     * @throws TooManyVPCAssociationAuthorizationsException
     *         You've created the maximum number of authorizations that can be created for the specified hosted zone. To
     *         authorize another VPC to be associated with the hosted zone, submit a
     *         <code>DeleteVPCAssociationAuthorization</code> request to remove an existing authorization. To get a list
     *         of existing authorizations, submit a <code>ListVPCAssociationAuthorizations</code> request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.CreateVPCAssociationAuthorization
     */
    CreateVPCAssociationAuthorizationResult createVPCAssociationAuthorization(CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Deletes a health check. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * </important>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check. Send a <code>DELETE</code> request to the
     *        <code>/2013-04-01/DeleteHealthCheckRequest</code> resource.
     * @return Result of the DeleteHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws HealthCheckInUseException
     *         The health check ID for this health check is referenced in the <code>HealthCheckId</code> element in one
     *         of the resource record sets in one of the hosted zones that are owned by the current AWS account.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteHealthCheck
     */
    DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * <p>
     * Deletes a hosted zone. Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Delete a hosted zone only if there are no resource record sets other than the default SOA record and NS resource
     * record sets. If the hosted zone contains other resource record sets, delete them before deleting the hosted zone.
     * If you try to delete a hosted zone that contains other resource record sets, Amazon Route 53 denies your request
     * with a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.
     * </p>
     * </important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone that you want to delete.
     * @return Result of the DeleteHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws HostedZoneNotEmptyException
     *         The hosted zone contains resource records that are not SOA or NS records.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @sample AmazonRoute53.DeleteHostedZone
     */
    DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest deleteHostedZoneRequest);

    /**
     * <p>
     * Deletes a reusable delegation set. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if there are no associated hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, run the
     * <a>GetReusableDelegationSet</a> action and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @return Result of the DeleteReusableDelegationSet operation returned by the service.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetInUseException
     *         The specified delegation contains associated hosted zones which must be deleted before the reusable
     *         delegation set can be deleted.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteReusableDelegationSet
     */
    DeleteReusableDelegationSetResult deleteReusableDelegationSet(DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return Result of the DeleteTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws TrafficPolicyInUseException
     *         One or more traffic policy instances were created by using the specified traffic policy.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same time that you did. Retry the request.
     * @sample AmazonRoute53.DeleteTrafficPolicy
     */
    DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/trafficpolicy/<i>traffic policy instance ID</i> </code> resource.
     * </p>
     * <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy instance that you want to delete.
     * @return Result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @sample AmazonRoute53.DeleteTrafficPolicyInstance
     */
    DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Removes authorization to submit an <code>AssociateVPCWithHostedZone</code> request to associate a specified VPC
     * with a hosted zone that was created by a different account. You must use the account that created the hosted zone
     * to submit a <code>DeleteVPCAssociationAuthorization</code> request.
     * </p>
     * <important>
     * <p>
     * Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon
     * Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone,
     * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC from the hosted zone. If you want to
     * delete an existing association, use <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </important>
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/deauthorizevpcassociation</code> resource. The request body
     * must include a document with a <code>DeleteVPCAssociationAuthorizationRequest</code> element.
     * </p>
     * 
     * @param deleteVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to remove authorization to associate a VPC that
     *        was created by one AWS account with a hosted zone that was created with a different AWS account.
     * @return Result of the DeleteVPCAssociationAuthorization operation returned by the service.
     * @throws VPCAssociationAuthorizationNotFoundException
     *         The VPC that you specified is not authorized to be associated with the hosted zone.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DeleteVPCAssociationAuthorization
     */
    DeleteVPCAssociationAuthorizationResult deleteVPCAssociationAuthorization(DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone.
     * </p>
     * <note>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </note>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include a document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response includes a <code>DisassociateVPCFromHostedZoneResponse</code> element.
     * </p>
     * <important>
     * <p>
     * You can't disassociate a VPC from a private hosted zone when only one VPC is associated with the hosted zone. You
     * also can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </important>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the VPC that you want to disassociate from a specified
     *        private hosted zone.
     * @return Result of the DisassociateVPCFromHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidVPCIdException
     *         The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access
     *         this VPC.
     * @throws VPCAssociationNotFoundException
     *         The specified VPC and hosted zone are not currently associated.
     * @throws LastVPCAssociationException
     *         The VPC that you're trying to disassociate from the private hosted zone is the last VPC that is
     *         associated with the hosted zone. Amazon Route 53 doesn't support disassociating the last VPC from a
     *         hosted zone.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.DisassociateVPCFromHostedZone
     */
    DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not replicated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have replicated to all Amazon Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return Result of the GetChange operation returned by the service.
     * @throws NoSuchChangeException
     *         A change with the specified change ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetChange
     */
    GetChangeResult getChange(GetChangeRequest getChangeRequest);

    /**
     * <p>
     * Retrieves a list of the IP ranges used by Amazon Route 53 health checkers to check the health of your resources.
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/checkeripranges</code> resource.
     * Use these IP addresses to configure router and firewall rules to allow health checkers to check the health of
     * your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return Result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53.GetCheckerIpRanges
     */
    GetCheckerIpRangesResult getCheckerIpRanges(GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRanges(GetCheckerIpRangesRequest)
     */
    GetCheckerIpRangesResult getCheckerIpRanges();

    /**
     * <p>
     * Retrieves a single geo location. Send a <code>GET</code> request to the <code>/2013-04-01/geolocation</code>
     * resource with one of these options: continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get a geo location.
     * @return Result of the GetGeoLocation operation returned by the service.
     * @throws NoSuchGeoLocationException
     *         Amazon Route 53 doesn't support the specified geolocation.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetGeoLocation
     */
    GetGeoLocationResult getGeoLocation(GetGeoLocationRequest getGeoLocationRequest);

    /**
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocation(GetGeoLocationRequest)
     */
    GetGeoLocationResult getGeoLocation();

    /**
     * <p>
     * Gets information about a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource. For more information about using the
     * console to perform this operation, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        This action gets information about a specified health check.</p>
     *        <p>
     *        Send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/gethealthcheckrequest</code> resource.
     *        </p>
     *        <p>
     *        For information about getting information about a health check using the Amazon Route 53 console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *        Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return Result of the GetHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this Amazon Route 53 endpoint. Please consider
     *         using a newer endpoint or a tool that does so.
     * @sample AmazonRoute53.GetHealthCheck
     */
    GetHealthCheckResult getHealthCheck(GetHealthCheckRequest getHealthCheckRequest);

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheckcount</code> resource.
     * @return Result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53.GetHealthCheckCount
     */
    GetHealthCheckCountResult getHealthCheckCount(GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCount(GetHealthCheckCountRequest)
     */
    GetHealthCheckCountResult getHealthCheckCount();

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why it failed most recently (if at all), you can
     * get the failure reason for the most recent failure. Send a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/healthcheck/<i>health check ID</i>/lastfailurereason</code> resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        This action gets the reason that a specified health check failed most recently.</p>
     *        <p>
     *        To get the reason for the last failure of a health check, send a GET request to the
     *        /2013-04-01/healthcheck/health check ID/lastfailurereason resource.
     *        </p>
     *        <p>
     *        For information about viewing the last failure reason for a health check using the Amazon Route 53
     *        console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-monitor-view-status.html"
     *        >Viewing Health Check Status and the Reason for Health Check Failures</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.
     * @return Result of the GetHealthCheckLastFailureReason operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHealthCheckLastFailureReason
     */
    GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

    /**
     * <p>
     * Gets status of a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i>/status</code> resource. You can use this call to get a
     * health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get health check status for a health check.
     * @return Result of the GetHealthCheckStatus operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHealthCheckStatus
     */
    GetHealthCheckStatusResult getHealthCheckStatus(GetHealthCheckStatusRequest getHealthCheckStatusRequest);

    /**
     * <p>
     * Retrieves the delegation set for a hosted zone, including the four name servers assigned to the hosted zone. Send
     * a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @return Result of the GetHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHostedZone
     */
    GetHostedZoneResult getHostedZone(GetHostedZoneRequest getHostedZoneRequest);

    /**
     * <p>
     * Retrieves a count of all your hosted zones. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzonecount</code> resource.
     * @return Result of the GetHostedZoneCount operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetHostedZoneCount
     */
    GetHostedZoneCountResult getHostedZoneCount(GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCount(GetHostedZoneCountRequest)
     */
    GetHostedZoneCountResult getHostedZoneCount();

    /**
     * <p>
     * Retrieves the reusable delegation set. Send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a <code>GetReusableDelegationSet</code> request.
     * @return Result of the GetReusableDelegationSet operation returned by the service.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetReusableDelegationSet
     */
    GetReusableDelegationSetResult getReusableDelegationSet(GetReusableDelegationSetRequest getReusableDelegationSetRequest);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get the information, send a GET request to
     *        the /2013-04-01/trafficpolicy resource, and specify the ID and the version of the traffic policy.
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetTrafficPolicy
     */
    GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance/<i>Id</i> </code> resource.
     * @return Result of the GetTrafficPolicyInstance operation returned by the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.GetTrafficPolicyInstance
     */
    GetTrafficPolicyInstanceResult getTrafficPolicyInstance(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code> request to the
     * <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a <code>GET</code> request to the
     *        <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * @return Result of the GetTrafficPolicyInstanceCount operation returned by the service.
     * @sample AmazonRoute53.GetTrafficPolicyInstanceCount
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation.
     *
     * @see #getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest)
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount();

    /**
     * <p>
     * Retrieves a list of supported geo locations. Send a <code>GET</code> request to the
     * <code>/2013-04-01/geolocations</code> resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element for each location that Amazon Route 53 supports.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        To get a list of geographic locations that Amazon Route 53 supports for geolocation, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/geolocations</code> resource.
     *        The response to this request includes a <code>GeoLocationDetails</code> element for each location that
     *        Amazon Route 53 supports.</p>
     *        <p>
     *        Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     *        country (for example, states or provinces), the subdivisions for that country are listed in alphabetical
     *        order immediately after the corresponding country.
     * @return Result of the ListGeoLocations operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListGeoLocations
     */
    ListGeoLocationsResult listGeoLocations(ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocations(ListGeoLocationsRequest)
     */
    ListGeoLocationsResult listGeoLocations();

    /**
     * <p>
     * Retrieve a list of your health checks. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a <code>HealthChecks</code>
     * element with zero or more <code>HealthCheck</code> child elements. By default, the list of health checks is
     * displayed on a single page. You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the health check that
     * the list begins with.
     * </p>
     * <p>
     * For information about listing health checks using the Amazon Route 53 console, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a>.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a
     *        <code>HealthChecks</code> element with zero or more <code>HealthCheck</code> child elements. By default,
     *        the list of health checks is displayed on a single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     *        control the health check that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @return Result of the ListHealthChecks operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this Amazon Route 53 endpoint. Please consider
     *         using a newer endpoint or a tool that does so.
     * @sample AmazonRoute53.ListHealthChecks
     */
    ListHealthChecksResult listHealthChecks(ListHealthChecksRequest listHealthChecksRequest);

    /**
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecks(ListHealthChecksRequest)
     */
    ListHealthChecksResult listHealthChecks();

    /**
     * <p>
     * To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100. The response includes four values that
     * help navigate from one group of <code>maxitems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxItems</code> is the value specified for the <code>maxitems</code> parameter in the request that produced
     * the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current AWS
     * account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and specify
     * the value of the <code>NextMarker</code> element in the marker parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, the <code>NextMarker</code> element is omitted from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code> element
     * matches the value that you specified in the <code>marker</code> parameter in the previous request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a HostedZone child
     *        element for each hosted zone that was created by the current AWS account.</p>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you
     *        can use the maxitems parameter to list them in groups of up to 100. The response includes four values that
     *        help you navigate from one group of maxitems hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxItems</code> is the value that you specified for the <code>maxitems</code> parameter in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more hosted zones
     *        associated with the current AWS account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current
     *        AWS account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and
     *        specify the value of the <code>NextMarker</code> element in the marker parameter.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, the <code>NextMarker</code> element is omitted from the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code>
     *        element matches the value that you specified in the <code>marker</code> parameter in the previous request.
     *        </p>
     *        </li>
     * @return Result of the ListHostedZones operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchDelegationSetException
     *         A reusable delegation set with the specified ID does not exist.
     * @throws DelegationSetNotReusableException
     *         A reusable delegation set with the specified ID does not exist.
     * @sample AmazonRoute53.ListHostedZones
     */
    ListHostedZonesResult listHostedZones(ListHostedZonesRequest listHostedZonesRequest);

    /**
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZones(ListHostedZonesRequest)
     */
    ListHostedZonesResult listHostedZones();

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonesbyname</code> resource. The response includes a <code>HostedZones</code> child
     * element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for example.com, specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that help
     * navigate from one group of <code>MaxItems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if any,
     * specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the request that produced the
     * current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     * <code>maxitems</code> parameter in the request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, this response includes the last hosted zone that is associated with the
     * current account. The <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements are omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain name
     * and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to
     * list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByNameRequest
     *        To retrieve a list of your public and private hosted zones in ASCII order by domain name, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/hostedzonesbyname</code>
     *        resource. The response to this request includes a <code>HostedZone</code> child element for each hosted
     *        zone that was created by the current AWS account. <code>ListHostedZonesByName</code> sorts hosted zones by
     *        name with the labels reversed, for example:</p>
     *        <p>
     *        <code>com.example.www.</code>
     *        </p>
     *        <p>
     *        Note the trailing dot, which can change the sort order in some circumstances.
     *        </p>
     *        <p>
     *        If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes
     *        the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in
     *        its database. For example, to create a hosted zone for exämple.com, you specify
     *        <code>ex\344mple.com</code> for the domain name. <code>ListHostedZonesByName</code> alphabetizes it as:
     *        <code>com.ex\344mple</code>. The labels are reversed, and it's alphabetized using the escaped value. For
     *        more information about valid domain name formats, including internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, you can use
     *        the <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that
     *        help you navigate from one group of <code>MaxItems</code> hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if
     *        any, that you specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     *        <code>maxitems</code> parameter in the request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated
     *        with the current Amazon Route 53 account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account. The <code>NextDNSName</code> element and
     *        <code>NextHostedZoneId</code> elements are omitted from the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain
     *        name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If
     *        you want to list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify
     *        the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     *        <code>hostedzoneid</code> parameters, respectively.
     *        </p>
     *        </li>
     * @return Result of the ListHostedZonesByName operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidDomainNameException
     *         The specified domain name is not valid.
     * @sample AmazonRoute53.ListHostedZonesByName
     */
    ListHostedZonesByNameResult listHostedZonesByName(ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByName(ListHostedZonesByNameRequest)
     */
    ListHostedZonesByNameResult listHostedZonesByName();

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements. The action sorts results first by
     * DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * When multiple records have the same DNS name, the action sorts results by the record type.
     * </p>
     * <p>
     * You can use the name and type elements to adjust the beginning position of the list of resource record sets
     * returned:
     * </p>
     * <dl>
     * <dt>If you do not specify Name or Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set that the hosted zone contains.
     * </p>
     * </dd>
     * <dt>If you specify Name but not Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>.
     * </p>
     * </dd>
     * <dt>If you specify Type but not Name</dt>
     * <dd>
     * <p>
     * Amazon Route 53 returns the <code>InvalidInput</code> error.
     * </p>
     * </dd>
     * <dt>If you specify both Name and Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>, and whose type is greater than or equal to <code>Type</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @return Result of the ListResourceRecordSets operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListResourceRecordSets
     */
    ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest listResourceRecordSetsRequest);

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple <code>DelegationSet</code> child elements. By
     * default, the list of delegation sets is displayed on a single page. You can control the length of the page that
     * is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     * control the delegation set that the list begins with.
     * </p>
     * <note>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Amazon Route 53
     * returns only the first 100.
     * </p>
     * </note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     *        <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     *        <code>DelegationSets</code> element with zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a single page. You can control the length of
     *        the page that is displayed by using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the delegation set that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @return Result of the ListReusableDelegationSets operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListReusableDelegationSets
     */
    ListReusableDelegationSetsResult listReusableDelegationSets(ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * Simplified method form for invoking the ListReusableDelegationSets operation.
     *
     * @see #listReusableDelegationSets(ListReusableDelegationSetsRequest)
     */
    ListReusableDelegationSetsResult listReusableDelegationSets();

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list of the tags that are associated with an
     *        individual resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     *        A complex type that contains information about the health checks or hosted zones for which you want to
     *        list tags.
     * @return Result of the ListTagsForResources operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResources
     */
    ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policies
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy that is
     * associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyIdMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic policies. If you want to list more traffic
     * policies, make another call to <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the <code>TrafficPolicyIdMarker</code> element is omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to list the traffic policies that are
     *        associated with the current AWS account.
     * @return Result of the ListTrafficPolicies operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.ListTrafficPolicies
     */
    ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPolicies(ListTrafficPoliciesRequest)
     */
    ListTrafficPoliciesResult listTrafficPolicies();

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using the current AWS account.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return Result of the ListTrafficPolicyInstances operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstances
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances operation.
     *
     * @see #listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest)
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances();

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource and include the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>, there are more traffic policy instances
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyInstanceNameMarker</b> and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a specified hosted zone.
     * @return Result of the ListTrafficPolicyInstancesByHostedZone operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByHostedZone
     */
    ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using a specify traffic policy version.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Route 53 API version</i>/trafficpolicyinstance</code> resource
     * and include the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the response represent the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return Result of the ListTrafficPolicyInstancesByPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByPolicy
     */
    ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource
     * and specify the ID of the traffic policy for which you want to list versions.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * versions associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy version that is
     * associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyVersionMarker</b>
     * </p>
     * <p>
     * The ID of the next traffic policy version that is associated with the current AWS account. If you want to list
     * more traffic policies, make another call to <code>ListTrafficPolicyVersions</code>, and specify the value of the
     * <code>TrafficPolicyVersionMarker</code> element in the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits the
     * <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @return Result of the ListTrafficPolicyVersions operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyVersions
     */
    ListTrafficPolicyVersionsResult listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
     * zone because you've submitted one or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The response to this
     * request includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 50 VPCs per page. To return fewer VPCs per page, include the
     * <code>MaxResults</code> parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i> </code>
     * </p>
     * <p>
     * If the response includes a <code>NextToken</code> element, there are more VPCs to list. To get the next page of
     * VPCs, submit another <code>ListVPCAssociationAuthorizations</code> request, and include the value of the
     * <code>NextToken</code> element from the response in the <code>NextToken</code> request parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i>&amp;NextToken=<i/> </code>
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest
     *        A complex type that contains information about that can be associated with your hosted zone.
     * @return Result of the ListVPCAssociationAuthorizations operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws InvalidPaginationTokenException
     * @sample AmazonRoute53.ListVPCAssociationAuthorizations
     */
    ListVPCAssociationAuthorizationsResult listVPCAssociationAuthorizations(ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest);

    /**
     * <p>
     * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.
     * You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet
     * mask.
     * </p>
     * 
     * @param testDNSAnswerRequest
     *        Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and
     *        type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and
     *        a subnet mask. </p>
     *        <p>
     *        <b>Parameters</b>
     *        </p>
     *        <dl>
     *        <dt>hostedzoneid</dt>
     *        <dd>
     *        <p>
     *        The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordname</dt>
     *        <dd>
     *        <p>
     *        The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordtype</dt>
     *        <dd>
     *        <p>
     *        The type of the resource record set.
     *        </p>
     *        </dd>
     *        <dt>resolverip (optional)</dt>
     *        <dd>
     *        <p>
     *        If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *        If you omit this value, <code>TestDNSAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *        East region.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetip (optional)</dt>
     *        <dd>
     *        <p>
     *        If the resolver that you specified for <code>resolverip</code> supports EDNS0, specify the IP address of a
     *        client in the applicable location.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetmask (optional)</dt>
     *        <dd>
     *        <p>
     *        If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *        of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you
     *        specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *        <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from
     *        <code>192.0.2.0/24</code>. The default value is 24 bits.
     *        </p>
     *        </dd>
     * @return Result of the TestDNSAnswer operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.TestDNSAnswer
     */
    TestDNSAnswerResult testDNSAnswer(TestDNSAnswerRequest testDNSAnswerRequest);

    /**
     * <p>
     * Updates an existing health check.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * The request body must include a document with an <code>UpdateHealthCheckRequest</code> element. For more
     * information about updating health checks, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @return Result of the UpdateHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws HealthCheckVersionMismatchException
     *         The value of <code>HealthCheckVersion</code> in the request doesn't match the value of
     *         <code>HealthCheckVersion</code> in the health check.
     * @sample AmazonRoute53.UpdateHealthCheck
     */
    UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest updateHealthCheckRequest);

    /**
     * <p>
     * Updates the hosted zone comment. Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains the hosted zone request information.
     * @return Result of the UpdateHostedZoneComment operation returned by the service.
     * @throws NoSuchHostedZoneException
     *         No hosted zone exists with the ID that you specified.
     * @throws InvalidInputException
     *         The input is not valid.
     * @sample AmazonRoute53.UpdateHostedZoneComment
     */
    UpdateHostedZoneCommentResult updateHostedZoneComment(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include a document with an <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy for which you want to update the
     *        comment.
     * @return Result of the UpdateTrafficPolicyComment operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same time that you did. Retry the request.
     * @sample AmazonRoute53.UpdateTrafficPolicyComment
     */
    UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were created based on the settings in a
     * specified traffic policy version.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance/<i>traffic policy ID</i> </code>
     * resource. The request body must include a document with an <code>UpdateTrafficPolicyInstanceRequest</code>
     * element.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Amazon Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how substantial the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Amazon Route 53 starts to respond to DNS queries for
     * the root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 deletes the old group of resource record sets that are associated with the root resource record
     * set name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to update based on a
     *        specified traffic policy instance.
     * @return Result of the UpdateTrafficPolicyInstance operation returned by the service.
     * @throws InvalidInputException
     *         The input is not valid.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws PriorRequestNotCompleteException
     *         If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent
     *         requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>).
     *         If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in
     *         intervals of increasing duration, before you try the request again.
     * @throws ConflictingTypesException
     *         You tried to update a traffic policy instance by using a traffic policy version that has a different DNS
     *         type than the current type for the instance. You specified the type in the JSON document in the
     *         <code>CreateTrafficPolicy</code> or <code>CreateTrafficPolicyVersion</code>request.
     * @sample AmazonRoute53.UpdateTrafficPolicyInstance
     */
    UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

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

    AmazonRoute53Waiters waiters();

}
