// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kubernetesconfiguration.SourceControlConfigurationArgs;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ComplianceStatusResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.HelmOperatorPropertiesResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The SourceControl Configuration object returned in Get &amp; Put response.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create Source Control Configuration
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
 *         var sourceControlConfiguration = new SourceControlConfiguration(&#34;sourceControlConfiguration&#34;, SourceControlConfigurationArgs.builder()        
 *             .clusterName(&#34;clusterName1&#34;)
 *             .clusterResourceName(&#34;connectedClusters&#34;)
 *             .clusterRp(&#34;Microsoft.Kubernetes&#34;)
 *             .configurationProtectedSettings(Map.of(&#34;protectedSetting1Key&#34;, &#34;protectedSetting1Value&#34;))
 *             .enableHelmOperator(true)
 *             .helmOperatorProperties(Map.ofEntries(
 *                 Map.entry(&#34;chartValues&#34;, &#34;--set git.ssh.secretName=flux-git-deploy --set tillerNamespace=kube-system&#34;),
 *                 Map.entry(&#34;chartVersion&#34;, &#34;0.3.0&#34;)
 *             ))
 *             .operatorInstanceName(&#34;SRSGitHubFluxOp-01&#34;)
 *             .operatorNamespace(&#34;SRS_Namespace&#34;)
 *             .operatorParams(&#34;--git-email=xyzgituser@users.srs.github.com&#34;)
 *             .operatorScope(&#34;namespace&#34;)
 *             .operatorType(&#34;Flux&#34;)
 *             .repositoryUrl(&#34;git@github.com:k8sdeveloper425/flux-get-started&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sourceControlConfigurationName(&#34;SRS_GitHubConfig&#34;)
 *             .sshKnownHostsContents(&#34;c3NoLmRldi5henVyZS5jb20gc3NoLXJzYSBBQUFBQjNOemFDMXljMkVBQUFBREFRQUJBQUFCQVFDN0hyMW9UV3FOcU9sekdKT2ZHSjROYWtWeUl6ZjFyWFlkNGQ3d282akJsa0x2Q0E0b2RCbEwwbURVeVowL1FVZlRUcWV1K3RtMjJnT3N2K1ZyVlRNazZ2d1JVNzVnWS95OXV0NU1iM2JSNUJWNThkS1h5cTlBOVVlQjVDYWtlaG41WmdtNngxbUtvVnlmK0ZGbjI2aVlxWEpSZ3pJWlpjWjVWNmhyRTBRZzM5a1ptNGF6NDhvMEFVYmY2U3A0U0xkdm51TWEyc1ZOd0hCYm9TN0VKa201N1hRUFZVMy9RcHlOTEhiV0Rkend0cmxTK2V6MzBTM0FkWWhMS0VPeEFHOHdlT255cnRMSkFVZW45bVRrb2w4b0lJMWVkZjdtV1diV1ZmMG5CbWx5MjErblpjbUNUSVNRQnRkY3lQYUVubzdmRlFNREQyNi9zMGxmS29iNEt3OEg=&#34;)
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
 * $ pulumi import azure-native:kubernetesconfiguration:SourceControlConfiguration SRS_GitHubConfig /subscriptions/subId1/resourceGroups/rg1/providers/Microsoft.Kubernetes/connectedClusters/clusterName1/providers/Microsoft.KubernetesConfiguration/sourceControlConfigurations/SRS_GitHubConfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetesconfiguration:SourceControlConfiguration")
public class SourceControlConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Compliance Status of the Configuration
     * 
     */
    @Export(name="complianceStatus", type=ComplianceStatusResponse.class, parameters={})
    private Output<ComplianceStatusResponse> complianceStatus;

    /**
     * @return Compliance Status of the Configuration
     * 
     */
    public Output<ComplianceStatusResponse> complianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Name-value pairs of protected configuration settings for the configuration
     * 
     */
    @Export(name="configurationProtectedSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationProtectedSettings;

    /**
     * @return Name-value pairs of protected configuration settings for the configuration
     * 
     */
    public Output<Optional<Map<String,String>>> configurationProtectedSettings() {
        return Codegen.optional(this.configurationProtectedSettings);
    }
    /**
     * Option to enable Helm Operator for this git configuration.
     * 
     */
    @Export(name="enableHelmOperator", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableHelmOperator;

    /**
     * @return Option to enable Helm Operator for this git configuration.
     * 
     */
    public Output<Optional<Boolean>> enableHelmOperator() {
        return Codegen.optional(this.enableHelmOperator);
    }
    /**
     * Properties for Helm operator.
     * 
     */
    @Export(name="helmOperatorProperties", type=HelmOperatorPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ HelmOperatorPropertiesResponse> helmOperatorProperties;

    /**
     * @return Properties for Helm operator.
     * 
     */
    public Output<Optional<HelmOperatorPropertiesResponse>> helmOperatorProperties() {
        return Codegen.optional(this.helmOperatorProperties);
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
     * Instance name of the operator - identifying the specific configuration.
     * 
     */
    @Export(name="operatorInstanceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatorInstanceName;

    /**
     * @return Instance name of the operator - identifying the specific configuration.
     * 
     */
    public Output<Optional<String>> operatorInstanceName() {
        return Codegen.optional(this.operatorInstanceName);
    }
    /**
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @Export(name="operatorNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatorNamespace;

    /**
     * @return The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    public Output<Optional<String>> operatorNamespace() {
        return Codegen.optional(this.operatorNamespace);
    }
    /**
     * Any Parameters for the Operator instance in string format.
     * 
     */
    @Export(name="operatorParams", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatorParams;

    /**
     * @return Any Parameters for the Operator instance in string format.
     * 
     */
    public Output<Optional<String>> operatorParams() {
        return Codegen.optional(this.operatorParams);
    }
    /**
     * Scope at which the operator will be installed.
     * 
     */
    @Export(name="operatorScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatorScope;

    /**
     * @return Scope at which the operator will be installed.
     * 
     */
    public Output<Optional<String>> operatorScope() {
        return Codegen.optional(this.operatorScope);
    }
    /**
     * Type of the operator
     * 
     */
    @Export(name="operatorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatorType;

    /**
     * @return Type of the operator
     * 
     */
    public Output<Optional<String>> operatorType() {
        return Codegen.optional(this.operatorType);
    }
    /**
     * The provisioning state of the resource provider.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource provider.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Key associated with this SourceControl configuration (either generated within the cluster or provided by the user).
     * 
     */
    @Export(name="repositoryPublicKey", type=String.class, parameters={})
    private Output<String> repositoryPublicKey;

    /**
     * @return Public Key associated with this SourceControl configuration (either generated within the cluster or provided by the user).
     * 
     */
    public Output<String> repositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    /**
     * Url of the SourceControl Repository.
     * 
     */
    @Export(name="repositoryUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryUrl;

    /**
     * @return Url of the SourceControl Repository.
     * 
     */
    public Output<Optional<String>> repositoryUrl() {
        return Codegen.optional(this.repositoryUrl);
    }
    /**
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    @Export(name="sshKnownHostsContents", type=String.class, parameters={})
    private Output</* @Nullable */ String> sshKnownHostsContents;

    /**
     * @return Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    public Output<Optional<String>> sshKnownHostsContents() {
        return Codegen.optional(this.sshKnownHostsContents);
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public SourceControlConfiguration(String name) {
        this(name, SourceControlConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceControlConfiguration(String name, SourceControlConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceControlConfiguration(String name, SourceControlConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:SourceControlConfiguration", name, args == null ? SourceControlConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SourceControlConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:SourceControlConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20191101preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20200701preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20201001preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20210301:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20210501preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20211101preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20220101preview:SourceControlConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20220301:SourceControlConfiguration").build())
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
    public static SourceControlConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SourceControlConfiguration(name, id, options);
    }
}
