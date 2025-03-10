// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsAdtAPIArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsCompArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsForEDMArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsForMIPPolicySyncArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsForSCCPowershellArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetPrivateEndpointConnectionsSecArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForEDMUploadArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForM365ComplianceCenterArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForM365SecurityCenterArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForMIPPolicySyncArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForO365ManagementActivityAPIArgs;
import com.pulumi.azurenative.securityandcompliance.inputs.GetprivateLinkServicesForSCCPowershellArgs;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsAdtAPIResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsCompResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsForEDMResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsForMIPPolicySyncResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsForSCCPowershellResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetPrivateEndpointConnectionsSecResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForEDMUploadResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForM365ComplianceCenterResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForM365SecurityCenterResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForMIPPolicySyncResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForO365ManagementActivityAPIResult;
import com.pulumi.azurenative.securityandcompliance.outputs.GetprivateLinkServicesForSCCPowershellResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SecurityandcomplianceFunctions {
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsAdtAPIResult> getPrivateEndpointConnectionsAdtAPI(GetPrivateEndpointConnectionsAdtAPIArgs args) {
        return getPrivateEndpointConnectionsAdtAPI(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsAdtAPIResult> getPrivateEndpointConnectionsAdtAPI(GetPrivateEndpointConnectionsAdtAPIArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsAdtAPI", TypeShape.of(GetPrivateEndpointConnectionsAdtAPIResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsCompResult> getPrivateEndpointConnectionsComp(GetPrivateEndpointConnectionsCompArgs args) {
        return getPrivateEndpointConnectionsComp(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsCompResult> getPrivateEndpointConnectionsComp(GetPrivateEndpointConnectionsCompArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsComp", TypeShape.of(GetPrivateEndpointConnectionsCompResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForEDMResult> getPrivateEndpointConnectionsForEDM(GetPrivateEndpointConnectionsForEDMArgs args) {
        return getPrivateEndpointConnectionsForEDM(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForEDMResult> getPrivateEndpointConnectionsForEDM(GetPrivateEndpointConnectionsForEDMArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsForEDM", TypeShape.of(GetPrivateEndpointConnectionsForEDMResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForMIPPolicySyncResult> getPrivateEndpointConnectionsForMIPPolicySync(GetPrivateEndpointConnectionsForMIPPolicySyncArgs args) {
        return getPrivateEndpointConnectionsForMIPPolicySync(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForMIPPolicySyncResult> getPrivateEndpointConnectionsForMIPPolicySync(GetPrivateEndpointConnectionsForMIPPolicySyncArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsForMIPPolicySync", TypeShape.of(GetPrivateEndpointConnectionsForMIPPolicySyncResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForSCCPowershellResult> getPrivateEndpointConnectionsForSCCPowershell(GetPrivateEndpointConnectionsForSCCPowershellArgs args) {
        return getPrivateEndpointConnectionsForSCCPowershell(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsForSCCPowershellResult> getPrivateEndpointConnectionsForSCCPowershell(GetPrivateEndpointConnectionsForSCCPowershellArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsForSCCPowershell", TypeShape.of(GetPrivateEndpointConnectionsForSCCPowershellResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsSecResult> getPrivateEndpointConnectionsSec(GetPrivateEndpointConnectionsSecArgs args) {
        return getPrivateEndpointConnectionsSec(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionsSecResult> getPrivateEndpointConnectionsSec(GetPrivateEndpointConnectionsSecArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getPrivateEndpointConnectionsSec", TypeShape.of(GetPrivateEndpointConnectionsSecResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForEDMUploadResult> getprivateLinkServicesForEDMUpload(GetprivateLinkServicesForEDMUploadArgs args) {
        return getprivateLinkServicesForEDMUpload(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForEDMUploadResult> getprivateLinkServicesForEDMUpload(GetprivateLinkServicesForEDMUploadArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForEDMUpload", TypeShape.of(GetprivateLinkServicesForEDMUploadResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365ComplianceCenterResult> getprivateLinkServicesForM365ComplianceCenter(GetprivateLinkServicesForM365ComplianceCenterArgs args) {
        return getprivateLinkServicesForM365ComplianceCenter(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365ComplianceCenterResult> getprivateLinkServicesForM365ComplianceCenter(GetprivateLinkServicesForM365ComplianceCenterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForM365ComplianceCenter", TypeShape.of(GetprivateLinkServicesForM365ComplianceCenterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365SecurityCenterResult> getprivateLinkServicesForM365SecurityCenter(GetprivateLinkServicesForM365SecurityCenterArgs args) {
        return getprivateLinkServicesForM365SecurityCenter(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForM365SecurityCenterResult> getprivateLinkServicesForM365SecurityCenter(GetprivateLinkServicesForM365SecurityCenterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForM365SecurityCenter", TypeShape.of(GetprivateLinkServicesForM365SecurityCenterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForMIPPolicySyncResult> getprivateLinkServicesForMIPPolicySync(GetprivateLinkServicesForMIPPolicySyncArgs args) {
        return getprivateLinkServicesForMIPPolicySync(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForMIPPolicySyncResult> getprivateLinkServicesForMIPPolicySync(GetprivateLinkServicesForMIPPolicySyncArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForMIPPolicySync", TypeShape.of(GetprivateLinkServicesForMIPPolicySyncResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForO365ManagementActivityAPIResult> getprivateLinkServicesForO365ManagementActivityAPI(GetprivateLinkServicesForO365ManagementActivityAPIArgs args) {
        return getprivateLinkServicesForO365ManagementActivityAPI(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForO365ManagementActivityAPIResult> getprivateLinkServicesForO365ManagementActivityAPI(GetprivateLinkServicesForO365ManagementActivityAPIArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForO365ManagementActivityAPI", TypeShape.of(GetprivateLinkServicesForO365ManagementActivityAPIResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForSCCPowershellResult> getprivateLinkServicesForSCCPowershell(GetprivateLinkServicesForSCCPowershellArgs args) {
        return getprivateLinkServicesForSCCPowershell(args, InvokeOptions.Empty);
    }
    /**
     * The description of the service.
     * API Version: 2021-03-08.
     * 
     */
    public static CompletableFuture<GetprivateLinkServicesForSCCPowershellResult> getprivateLinkServicesForSCCPowershell(GetprivateLinkServicesForSCCPowershellArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityandcompliance:getprivateLinkServicesForSCCPowershell", TypeShape.of(GetprivateLinkServicesForSCCPowershellResult.class), args, Utilities.withVersion(options));
    }
}
