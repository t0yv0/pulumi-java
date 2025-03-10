// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.NetworkLoadBalancer;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetBackendHealthArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetBackendSetArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetBackendSetHealthArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetBackendSetsArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetBackendsArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetListenerArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetListenersArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancerArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancerHealthArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancersArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancersPoliciesArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.GetNetworkLoadBalancersProtocolsArgs;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetBackendHealthResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetBackendSetHealthResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetBackendSetResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetBackendSetsResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetBackendsResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetListenerResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetListenersResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetNetworkLoadBalancerHealthResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetNetworkLoadBalancerResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetNetworkLoadBalancersPoliciesResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetNetworkLoadBalancersProtocolsResult;
import com.pulumi.oci.NetworkLoadBalancer.outputs.GetNetworkLoadBalancersResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class NetworkLoadBalancerFunctions {
    /**
     * This data source provides details about a specific Backend Health resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the current health status of the specified backend server.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendHealthResult> getBackendHealth(GetBackendHealthArgs args) {
        return getBackendHealth(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Backend Health resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the current health status of the specified backend server.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendHealthResult> getBackendHealth(GetBackendHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getBackendHealth:getBackendHealth", TypeShape.of(GetBackendHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Backend Set resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the configuration information for the specified backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetResult> getBackendSet(GetBackendSetArgs args) {
        return getBackendSet(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Backend Set resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the configuration information for the specified backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetResult> getBackendSet(GetBackendSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getBackendSet:getBackendSet", TypeShape.of(GetBackendSetResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetBackendSetHealthResult> getBackendSetHealth(GetBackendSetHealthArgs args) {
        return getBackendSetHealth(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBackendSetHealthResult> getBackendSetHealth(GetBackendSetHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getBackendSetHealth:getBackendSetHealth", TypeShape.of(GetBackendSetHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Backend Sets in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists all backend sets associated with a given network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetsResult> getBackendSets(GetBackendSetsArgs args) {
        return getBackendSets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Backend Sets in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists all backend sets associated with a given network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetsResult> getBackendSets(GetBackendSetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getBackendSets:getBackendSets", TypeShape.of(GetBackendSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Backends in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists the backend servers for a given network load balancer and backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendsResult> getBackends(GetBackendsArgs args) {
        return getBackends(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Backends in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists the backend servers for a given network load balancer and backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendsResult> getBackends(GetBackendsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getBackends:getBackends", TypeShape.of(GetBackendsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Listener resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves listener properties associated with a given network load balancer and listener name.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args) {
        return getListener(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Listener resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves listener properties associated with a given network load balancer and listener name.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getListener:getListener", TypeShape.of(GetListenerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Listeners in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists all listeners associated with a given network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenersResult> getListeners(GetListenersArgs args) {
        return getListeners(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Listeners in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists all listeners associated with a given network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenersResult> getListeners(GetListenersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getListeners:getListeners", TypeShape.of(GetListenersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Network Load Balancer resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves network load balancer configuration information by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancerResult> getNetworkLoadBalancer(GetNetworkLoadBalancerArgs args) {
        return getNetworkLoadBalancer(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Network Load Balancer resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves network load balancer configuration information by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancerResult> getNetworkLoadBalancer(GetNetworkLoadBalancerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getNetworkLoadBalancer:getNetworkLoadBalancer", TypeShape.of(GetNetworkLoadBalancerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Network Load Balancer Health resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the health status for the specified network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancerHealthResult> getNetworkLoadBalancerHealth(GetNetworkLoadBalancerHealthArgs args) {
        return getNetworkLoadBalancerHealth(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Network Load Balancer Health resource in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Retrieves the health status for the specified network load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancerHealthResult> getNetworkLoadBalancerHealth(GetNetworkLoadBalancerHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getNetworkLoadBalancerHealth:getNetworkLoadBalancerHealth", TypeShape.of(GetNetworkLoadBalancerHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Network Load Balancers in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Returns a list of network load balancers.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersResult> getNetworkLoadBalancers(GetNetworkLoadBalancersArgs args) {
        return getNetworkLoadBalancers(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Load Balancers in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Returns a list of network load balancers.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersResult> getNetworkLoadBalancers(GetNetworkLoadBalancersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getNetworkLoadBalancers:getNetworkLoadBalancers", TypeShape.of(GetNetworkLoadBalancersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Network Load Balancers Policies in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists the available network load balancer policies.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersPoliciesResult> getNetworkLoadBalancersPolicies() {
        return getNetworkLoadBalancersPolicies(GetNetworkLoadBalancersPoliciesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Load Balancers Policies in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists the available network load balancer policies.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersPoliciesResult> getNetworkLoadBalancersPolicies(GetNetworkLoadBalancersPoliciesArgs args) {
        return getNetworkLoadBalancersPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Load Balancers Policies in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * Lists the available network load balancer policies.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersPoliciesResult> getNetworkLoadBalancersPolicies(GetNetworkLoadBalancersPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getNetworkLoadBalancersPolicies:getNetworkLoadBalancersPolicies", TypeShape.of(GetNetworkLoadBalancersPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Network Load Balancers Protocols in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * This API has been deprecated so it won&#39;t return the updated list of supported protocls.
     * Lists all supported traffic protocols.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersProtocolsResult> getNetworkLoadBalancersProtocols() {
        return getNetworkLoadBalancersProtocols(GetNetworkLoadBalancersProtocolsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Load Balancers Protocols in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * This API has been deprecated so it won&#39;t return the updated list of supported protocls.
     * Lists all supported traffic protocols.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersProtocolsResult> getNetworkLoadBalancersProtocols(GetNetworkLoadBalancersProtocolsArgs args) {
        return getNetworkLoadBalancersProtocols(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Load Balancers Protocols in Oracle Cloud Infrastructure Network Load Balancer service.
     * 
     * This API has been deprecated so it won&#39;t return the updated list of supported protocls.
     * Lists all supported traffic protocols.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkLoadBalancersProtocolsResult> getNetworkLoadBalancersProtocols(GetNetworkLoadBalancersProtocolsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:NetworkLoadBalancer/getNetworkLoadBalancersProtocols:getNetworkLoadBalancersProtocols", TypeShape.of(GetNetworkLoadBalancersProtocolsResult.class), args, Utilities.withVersion(options));
    }
}
