// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.inputs.GetChannelArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetChannelFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainTopicArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainTopicEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainTopicEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetDomainTopicEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetEventChannelArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerConfigurationArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerDestinationArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerNamespaceArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerRegistrationArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetSystemTopicArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetTopicArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetTopicEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetTopicEventSubscriptionDeliveryAttributesArgs;
import com.pulumi.azurenative.eventgrid.inputs.GetTopicEventSubscriptionFullUrlArgs;
import com.pulumi.azurenative.eventgrid.inputs.ListDomainSharedAccessKeysArgs;
import com.pulumi.azurenative.eventgrid.inputs.ListPartnerNamespaceSharedAccessKeysArgs;
import com.pulumi.azurenative.eventgrid.inputs.ListTopicSharedAccessKeysArgs;
import com.pulumi.azurenative.eventgrid.outputs.GetChannelFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetChannelResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainTopicEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainTopicEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainTopicEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetDomainTopicResult;
import com.pulumi.azurenative.eventgrid.outputs.GetEventChannelResult;
import com.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerConfigurationResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerDestinationResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerNamespaceResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerRegistrationResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicResult;
import com.pulumi.azurenative.eventgrid.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetSystemTopicResult;
import com.pulumi.azurenative.eventgrid.outputs.GetTopicEventSubscriptionDeliveryAttributesResult;
import com.pulumi.azurenative.eventgrid.outputs.GetTopicEventSubscriptionFullUrlResult;
import com.pulumi.azurenative.eventgrid.outputs.GetTopicEventSubscriptionResult;
import com.pulumi.azurenative.eventgrid.outputs.GetTopicResult;
import com.pulumi.azurenative.eventgrid.outputs.ListDomainSharedAccessKeysResult;
import com.pulumi.azurenative.eventgrid.outputs.ListPartnerNamespaceSharedAccessKeysResult;
import com.pulumi.azurenative.eventgrid.outputs.ListTopicSharedAccessKeysResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EventgridFunctions {
    /**
     * Channel info.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args) {
        return getChannel(args, InvokeOptions.Empty);
    }
    /**
     * Channel info.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetChannelFullUrlResult> getChannelFullUrl(GetChannelFullUrlArgs args) {
        return getChannelFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetChannelFullUrlResult> getChannelFullUrl(GetChannelFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getChannelFullUrl", TypeShape.of(GetChannelFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * EventGrid Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionResult> getDomainEventSubscription(GetDomainEventSubscriptionArgs args) {
        return getDomainEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionResult> getDomainEventSubscription(GetDomainEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainEventSubscription", TypeShape.of(GetDomainEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionDeliveryAttributesResult> getDomainEventSubscriptionDeliveryAttributes(GetDomainEventSubscriptionDeliveryAttributesArgs args) {
        return getDomainEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionDeliveryAttributesResult> getDomainEventSubscriptionDeliveryAttributes(GetDomainEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainEventSubscriptionDeliveryAttributes", TypeShape.of(GetDomainEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionFullUrlResult> getDomainEventSubscriptionFullUrl(GetDomainEventSubscriptionFullUrlArgs args) {
        return getDomainEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainEventSubscriptionFullUrlResult> getDomainEventSubscriptionFullUrl(GetDomainEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainEventSubscriptionFullUrl", TypeShape.of(GetDomainEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Domain Topic.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainTopicResult> getDomainTopic(GetDomainTopicArgs args) {
        return getDomainTopic(args, InvokeOptions.Empty);
    }
    /**
     * Domain Topic.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainTopicResult> getDomainTopic(GetDomainTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainTopic", TypeShape.of(GetDomainTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionResult> getDomainTopicEventSubscription(GetDomainTopicEventSubscriptionArgs args) {
        return getDomainTopicEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionResult> getDomainTopicEventSubscription(GetDomainTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainTopicEventSubscription", TypeShape.of(GetDomainTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionDeliveryAttributesResult> getDomainTopicEventSubscriptionDeliveryAttributes(GetDomainTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getDomainTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionDeliveryAttributesResult> getDomainTopicEventSubscriptionDeliveryAttributes(GetDomainTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetDomainTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionFullUrlResult> getDomainTopicEventSubscriptionFullUrl(GetDomainTopicEventSubscriptionFullUrlArgs args) {
        return getDomainTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetDomainTopicEventSubscriptionFullUrlResult> getDomainTopicEventSubscriptionFullUrl(GetDomainTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainTopicEventSubscriptionFullUrl", TypeShape.of(GetDomainTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Channel.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventChannelResult> getEventChannel(GetEventChannelArgs args) {
        return getEventChannel(args, InvokeOptions.Empty);
    }
    /**
     * Event Channel.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventChannelResult> getEventChannel(GetEventChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventChannel", TypeShape.of(GetEventChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args) {
        return getEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscription", TypeShape.of(GetEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionDeliveryAttributesResult> getEventSubscriptionDeliveryAttributes(GetEventSubscriptionDeliveryAttributesArgs args) {
        return getEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionDeliveryAttributesResult> getEventSubscriptionDeliveryAttributes(GetEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscriptionDeliveryAttributes", TypeShape.of(GetEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionFullUrlResult> getEventSubscriptionFullUrl(GetEventSubscriptionFullUrlArgs args) {
        return getEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionFullUrlResult> getEventSubscriptionFullUrl(GetEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscriptionFullUrl", TypeShape.of(GetEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Partner configuration information
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerConfigurationResult> getPartnerConfiguration(GetPartnerConfigurationArgs args) {
        return getPartnerConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Partner configuration information
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerConfigurationResult> getPartnerConfiguration(GetPartnerConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerConfiguration", TypeShape.of(GetPartnerConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Grid Partner Destination.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerDestinationResult> getPartnerDestination(GetPartnerDestinationArgs args) {
        return getPartnerDestination(args, InvokeOptions.Empty);
    }
    /**
     * Event Grid Partner Destination.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerDestinationResult> getPartnerDestination(GetPartnerDestinationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerDestination", TypeShape.of(GetPartnerDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid Partner Namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerNamespaceResult> getPartnerNamespace(GetPartnerNamespaceArgs args) {
        return getPartnerNamespace(args, InvokeOptions.Empty);
    }
    /**
     * EventGrid Partner Namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerNamespaceResult> getPartnerNamespace(GetPartnerNamespaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerNamespace", TypeShape.of(GetPartnerNamespaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about a partner registration.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerRegistrationResult> getPartnerRegistration(GetPartnerRegistrationArgs args) {
        return getPartnerRegistration(args, InvokeOptions.Empty);
    }
    /**
     * Information about a partner registration.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerRegistrationResult> getPartnerRegistration(GetPartnerRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerRegistration", TypeShape.of(GetPartnerRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Grid Partner Topic.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicResult> getPartnerTopic(GetPartnerTopicArgs args) {
        return getPartnerTopic(args, InvokeOptions.Empty);
    }
    /**
     * Event Grid Partner Topic.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicResult> getPartnerTopic(GetPartnerTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopic", TypeShape.of(GetPartnerTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionResult> getPartnerTopicEventSubscription(GetPartnerTopicEventSubscriptionArgs args) {
        return getPartnerTopicEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionResult> getPartnerTopicEventSubscription(GetPartnerTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscription", TypeShape.of(GetPartnerTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> getPartnerTopicEventSubscriptionDeliveryAttributes(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getPartnerTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> getPartnerTopicEventSubscriptionDeliveryAttributes(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetPartnerTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionFullUrlResult> getPartnerTopicEventSubscriptionFullUrl(GetPartnerTopicEventSubscriptionFullUrlArgs args) {
        return getPartnerTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionFullUrlResult> getPartnerTopicEventSubscriptionFullUrl(GetPartnerTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscriptionFullUrl", TypeShape.of(GetPartnerTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid System Topic.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicResult> getSystemTopic(GetSystemTopicArgs args) {
        return getSystemTopic(args, InvokeOptions.Empty);
    }
    /**
     * EventGrid System Topic.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicResult> getSystemTopic(GetSystemTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopic", TypeShape.of(GetSystemTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> getSystemTopicEventSubscription(GetSystemTopicEventSubscriptionArgs args) {
        return getSystemTopicEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> getSystemTopicEventSubscription(GetSystemTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscription", TypeShape.of(GetSystemTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionDeliveryAttributesResult> getSystemTopicEventSubscriptionDeliveryAttributes(GetSystemTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getSystemTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionDeliveryAttributesResult> getSystemTopicEventSubscriptionDeliveryAttributes(GetSystemTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetSystemTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionFullUrlResult> getSystemTopicEventSubscriptionFullUrl(GetSystemTopicEventSubscriptionFullUrlArgs args) {
        return getSystemTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionFullUrlResult> getSystemTopicEventSubscriptionFullUrl(GetSystemTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscriptionFullUrl", TypeShape.of(GetSystemTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args) {
        return getTopic(args, InvokeOptions.Empty);
    }
    /**
     * EventGrid Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionResult> getTopicEventSubscription(GetTopicEventSubscriptionArgs args) {
        return getTopicEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Event Subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionResult> getTopicEventSubscription(GetTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopicEventSubscription", TypeShape.of(GetTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionDeliveryAttributesResult> getTopicEventSubscriptionDeliveryAttributes(GetTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionDeliveryAttributesResult> getTopicEventSubscriptionDeliveryAttributes(GetTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionFullUrlResult> getTopicEventSubscriptionFullUrl(GetTopicEventSubscriptionFullUrlArgs args) {
        return getTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-10-15-preview.
     * 
     */
    public static CompletableFuture<GetTopicEventSubscriptionFullUrlResult> getTopicEventSubscriptionFullUrl(GetTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopicEventSubscriptionFullUrl", TypeShape.of(GetTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListDomainSharedAccessKeysResult> listDomainSharedAccessKeys(ListDomainSharedAccessKeysArgs args) {
        return listDomainSharedAccessKeys(args, InvokeOptions.Empty);
    }
    /**
     * Shared access keys of the Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListDomainSharedAccessKeysResult> listDomainSharedAccessKeys(ListDomainSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listDomainSharedAccessKeys", TypeShape.of(ListDomainSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the partner namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<ListPartnerNamespaceSharedAccessKeysResult> listPartnerNamespaceSharedAccessKeys(ListPartnerNamespaceSharedAccessKeysArgs args) {
        return listPartnerNamespaceSharedAccessKeys(args, InvokeOptions.Empty);
    }
    /**
     * Shared access keys of the partner namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<ListPartnerNamespaceSharedAccessKeysResult> listPartnerNamespaceSharedAccessKeys(ListPartnerNamespaceSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listPartnerNamespaceSharedAccessKeys", TypeShape.of(ListPartnerNamespaceSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListTopicSharedAccessKeysResult> listTopicSharedAccessKeys(ListTopicSharedAccessKeysArgs args) {
        return listTopicSharedAccessKeys(args, InvokeOptions.Empty);
    }
    /**
     * Shared access keys of the Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListTopicSharedAccessKeysResult> listTopicSharedAccessKeys(ListTopicSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listTopicSharedAccessKeys", TypeShape.of(ListTopicSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
}
