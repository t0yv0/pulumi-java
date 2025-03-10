// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.attestation.inputs.GetAttestationProviderArgs;
import com.pulumi.azurenative.attestation.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.attestation.outputs.GetAttestationProviderResult;
import com.pulumi.azurenative.attestation.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AttestationFunctions {
    /**
     * Attestation service response message.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAttestationProviderResult> getAttestationProvider(GetAttestationProviderArgs args) {
        return getAttestationProvider(args, InvokeOptions.Empty);
    }
    /**
     * Attestation service response message.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAttestationProviderResult> getAttestationProvider(GetAttestationProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:attestation:getAttestationProvider", TypeShape.of(GetAttestationProviderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:attestation:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
}
