// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Utilities;
import com.pulumi.oci.Waf.inputs.GetFirewallsArgs;
import com.pulumi.oci.Waf.inputs.GetNetworkAddressListArgs;
import com.pulumi.oci.Waf.inputs.GetNetworkAddressListsArgs;
import com.pulumi.oci.Waf.inputs.GetProtectionCapabilitiesArgs;
import com.pulumi.oci.Waf.inputs.GetProtectionCapabilityGroupTagsArgs;
import com.pulumi.oci.Waf.inputs.GetWebAppFirewallArgs;
import com.pulumi.oci.Waf.inputs.GetWebAppFirewallPoliciesArgs;
import com.pulumi.oci.Waf.inputs.GetWebAppFirewallPolicyArgs;
import com.pulumi.oci.Waf.outputs.GetFirewallsResult;
import com.pulumi.oci.Waf.outputs.GetNetworkAddressListResult;
import com.pulumi.oci.Waf.outputs.GetNetworkAddressListsResult;
import com.pulumi.oci.Waf.outputs.GetProtectionCapabilitiesResult;
import com.pulumi.oci.Waf.outputs.GetProtectionCapabilityGroupTagsResult;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPoliciesResult;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPolicyResult;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallResult;
import java.util.concurrent.CompletableFuture;

public final class WafFunctions {
    /**
     * This data source provides the list of Web App Firewalls in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all WebAppFirewalls in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFirewallsResult> getFirewalls(GetFirewallsArgs args) {
        return getFirewalls(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Web App Firewalls in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all WebAppFirewalls in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFirewallsResult> getFirewalls(GetFirewallsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getFirewalls:getFirewalls", TypeShape.of(GetFirewallsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Network Address List resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a NetworkAddressList by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkAddressListResult> getNetworkAddressList(GetNetworkAddressListArgs args) {
        return getNetworkAddressList(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Network Address List resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a NetworkAddressList by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkAddressListResult> getNetworkAddressList(GetNetworkAddressListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getNetworkAddressList:getNetworkAddressList", TypeShape.of(GetNetworkAddressListResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Network Address Lists in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all NetworkAddressLists in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkAddressListsResult> getNetworkAddressLists(GetNetworkAddressListsArgs args) {
        return getNetworkAddressLists(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Network Address Lists in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all NetworkAddressLists in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetNetworkAddressListsResult> getNetworkAddressLists(GetNetworkAddressListsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getNetworkAddressLists:getNetworkAddressLists", TypeShape.of(GetNetworkAddressListsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Protection Capabilities in Oracle Cloud Infrastructure Waf service.
     * 
     * Lists of protection capabilities filtered by query parameters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtectionCapabilitiesResult> getProtectionCapabilities(GetProtectionCapabilitiesArgs args) {
        return getProtectionCapabilities(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Protection Capabilities in Oracle Cloud Infrastructure Waf service.
     * 
     * Lists of protection capabilities filtered by query parameters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtectionCapabilitiesResult> getProtectionCapabilities(GetProtectionCapabilitiesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getProtectionCapabilities:getProtectionCapabilities", TypeShape.of(GetProtectionCapabilitiesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Protection Capability Group Tags in Oracle Cloud Infrastructure Waf service.
     * 
     * Lists of available group tags filtered by query parameters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtectionCapabilityGroupTagsResult> getProtectionCapabilityGroupTags(GetProtectionCapabilityGroupTagsArgs args) {
        return getProtectionCapabilityGroupTags(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Protection Capability Group Tags in Oracle Cloud Infrastructure Waf service.
     * 
     * Lists of available group tags filtered by query parameters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtectionCapabilityGroupTagsResult> getProtectionCapabilityGroupTags(GetProtectionCapabilityGroupTagsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getProtectionCapabilityGroupTags:getProtectionCapabilityGroupTags", TypeShape.of(GetProtectionCapabilityGroupTagsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Web App Firewall resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a WebAppFirewall by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallResult> getWebAppFirewall(GetWebAppFirewallArgs args) {
        return getWebAppFirewall(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Web App Firewall resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a WebAppFirewall by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallResult> getWebAppFirewall(GetWebAppFirewallArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getWebAppFirewall:getWebAppFirewall", TypeShape.of(GetWebAppFirewallResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Web App Firewall Policies in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all WebAppFirewallPolicies in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallPoliciesResult> getWebAppFirewallPolicies(GetWebAppFirewallPoliciesArgs args) {
        return getWebAppFirewallPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Web App Firewall Policies in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a list of all WebAppFirewallPolicies in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallPoliciesResult> getWebAppFirewallPolicies(GetWebAppFirewallPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getWebAppFirewallPolicies:getWebAppFirewallPolicies", TypeShape.of(GetWebAppFirewallPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Web App Firewall Policy resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a WebAppFirewallPolicy with the given OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallPolicyResult> getWebAppFirewallPolicy(GetWebAppFirewallPolicyArgs args) {
        return getWebAppFirewallPolicy(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Web App Firewall Policy resource in Oracle Cloud Infrastructure Waf service.
     * 
     * Gets a WebAppFirewallPolicy with the given OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetWebAppFirewallPolicyResult> getWebAppFirewallPolicy(GetWebAppFirewallPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Waf/getWebAppFirewallPolicy:getWebAppFirewallPolicy", TypeShape.of(GetWebAppFirewallPolicyResult.class), args, Utilities.withVersion(options));
    }
}
