// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kubernetes.ConnectedClusterArgs;
import com.pulumi.azurenative.kubernetes.outputs.ConnectedClusterIdentityResponse;
import com.pulumi.azurenative.kubernetes.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a connected cluster.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### CreateClusterExample
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var connectedCluster = new ConnectedCluster(&#34;connectedCluster&#34;, ConnectedClusterArgs.builder()        
 *             .agentPublicKeyCertificate(&#34;MIICYzCCAcygAwIBAgIBADANBgkqhkiG9w0BAQUFADAuMQswCQYDVQQGEwJVUzEMMAoGA1UEChMDSUJNMREwDwYDVQQLEwhMb2NhbCBDQTAeFw05OTEyMjIwNTAwMDBaFw0wMDEyMjMwNDU5NTlaMC4xCzAJBgNVBAYTAlVTMQwwCgYDVQQKEwNJQk0xETAPBgNVBAsTCExvY2FsIENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2bZEo7xGaX2/0GHkrNFZvlxBou9v1Jmt/PDiTMPve8r9FeJAQ0QdvFST/0JPQYD20rH0bimdDLgNdNynmyRoS2S/IInfpmf69iyc2G0TPyRvmHIiOZbdCd+YBHQi1adkj17NDcWj6S14tVurFX73zx0sNoMS79q3tuXKrDsxeuwIDAQABo4GQMIGNMEsGCVUdDwGG+EIBDQQ+EzxHZW5lcmF0ZWQgYnkgdGhlIFNlY3VyZVdheSBTZWN1cml0eSBTZXJ2ZXIgZm9yIE9TLzM5MCAoUkFDRikwDgYDVR0PAQH/BAQDAgAGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFJ3+ocRyCTJw067dLSwr/nalx6YMMA0GCSqGSIb3DQEBBQUAA4GBAMaQzt+zaj1GU77yzlr8iiMBXgdQrwsZZWJo5exnAucJAEYQZmOfyLiM D6oYq+ZnfvM0n8G/Y79q8nhwvuxpYOnRSAXFp6xSkrIOeZtJMY1h00LKp/JX3Ng1svZ2agE126JHsQ0bhzN5TKsYfbwfTwfjdWAGy6Vf1nYi/rO+ryMO&#34;)
 *             .clusterName(&#34;testCluster&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .location(&#34;East US&#34;)
 *             .resourceGroupName(&#34;k8sc-rg&#34;)
 *             .tags()
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kubernetes:ConnectedCluster connectedCluster1 /subscriptions/1bfbb5d0-917e-4346-9026-1d3b344417f5/resourceGroups/akkeshar/providers/Microsoft.Kubernetes/connectedClusters/connectedCluster1 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetes:ConnectedCluster")
public class ConnectedCluster extends com.pulumi.resources.CustomResource {
    /**
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
     */
    @Export(name="agentPublicKeyCertificate", type=String.class, parameters={})
    private Output<String> agentPublicKeyCertificate;

    /**
     * @return Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
     */
    public Output<String> agentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }
    /**
     * Version of the agent running on the connected cluster resource
     * 
     */
    @Export(name="agentVersion", type=String.class, parameters={})
    private Output<String> agentVersion;

    /**
     * @return Version of the agent running on the connected cluster resource
     * 
     */
    public Output<String> agentVersion() {
        return this.agentVersion;
    }
    /**
     * Represents the connectivity status of the connected cluster.
     * 
     */
    @Export(name="connectivityStatus", type=String.class, parameters={})
    private Output<String> connectivityStatus;

    /**
     * @return Represents the connectivity status of the connected cluster.
     * 
     */
    public Output<String> connectivityStatus() {
        return this.connectivityStatus;
    }
    /**
     * The Kubernetes distribution running on this connected cluster.
     * 
     */
    @Export(name="distribution", type=String.class, parameters={})
    private Output</* @Nullable */ String> distribution;

    /**
     * @return The Kubernetes distribution running on this connected cluster.
     * 
     */
    public Output<Optional<String>> distribution() {
        return Codegen.optional(this.distribution);
    }
    /**
     * The identity of the connected cluster.
     * 
     */
    @Export(name="identity", type=ConnectedClusterIdentityResponse.class, parameters={})
    private Output<ConnectedClusterIdentityResponse> identity;

    /**
     * @return The identity of the connected cluster.
     * 
     */
    public Output<ConnectedClusterIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
     */
    @Export(name="infrastructure", type=String.class, parameters={})
    private Output</* @Nullable */ String> infrastructure;

    /**
     * @return The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
     */
    public Output<Optional<String>> infrastructure() {
        return Codegen.optional(this.infrastructure);
    }
    /**
     * The Kubernetes version of the connected cluster resource
     * 
     */
    @Export(name="kubernetesVersion", type=String.class, parameters={})
    private Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version of the connected cluster resource
     * 
     */
    public Output<String> kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * Time representing the last instance when heart beat was received from the cluster
     * 
     */
    @Export(name="lastConnectivityTime", type=String.class, parameters={})
    private Output<String> lastConnectivityTime;

    /**
     * @return Time representing the last instance when heart beat was received from the cluster
     * 
     */
    public Output<String> lastConnectivityTime() {
        return this.lastConnectivityTime;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Expiration time of the managed identity certificate
     * 
     */
    @Export(name="managedIdentityCertificateExpirationTime", type=String.class, parameters={})
    private Output<String> managedIdentityCertificateExpirationTime;

    /**
     * @return Expiration time of the managed identity certificate
     * 
     */
    public Output<String> managedIdentityCertificateExpirationTime() {
        return this.managedIdentityCertificateExpirationTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Connected cluster offering
     * 
     */
    @Export(name="offering", type=String.class, parameters={})
    private Output<String> offering;

    /**
     * @return Connected cluster offering
     * 
     */
    public Output<String> offering() {
        return this.offering;
    }
    /**
     * Provisioning state of the connected cluster resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state of the connected cluster resource.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Number of CPU cores present in the connected cluster resource
     * 
     */
    @Export(name="totalCoreCount", type=Integer.class, parameters={})
    private Output<Integer> totalCoreCount;

    /**
     * @return Number of CPU cores present in the connected cluster resource
     * 
     */
    public Output<Integer> totalCoreCount() {
        return this.totalCoreCount;
    }
    /**
     * Number of nodes present in the connected cluster resource
     * 
     */
    @Export(name="totalNodeCount", type=Integer.class, parameters={})
    private Output<Integer> totalNodeCount;

    /**
     * @return Number of nodes present in the connected cluster resource
     * 
     */
    public Output<Integer> totalNodeCount() {
        return this.totalNodeCount;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectedCluster(String name) {
        this(name, ConnectedClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectedCluster(String name, ConnectedClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectedCluster(String name, ConnectedClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetes:ConnectedCluster", name, args == null ? ConnectedClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectedCluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetes:ConnectedCluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kubernetes/v20200101preview:ConnectedCluster").build()),
                Output.of(Alias.builder().type("azure-native:kubernetes/v20210301:ConnectedCluster").build()),
                Output.of(Alias.builder().type("azure-native:kubernetes/v20210401preview:ConnectedCluster").build()),
                Output.of(Alias.builder().type("azure-native:kubernetes/v20211001:ConnectedCluster").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConnectedCluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectedCluster(name, id, options);
    }
}
