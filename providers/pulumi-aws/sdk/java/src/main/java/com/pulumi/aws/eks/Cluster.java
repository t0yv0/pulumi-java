// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.eks.ClusterArgs;
import com.pulumi.aws.eks.inputs.ClusterState;
import com.pulumi.aws.eks.outputs.ClusterCertificateAuthority;
import com.pulumi.aws.eks.outputs.ClusterEncryptionConfig;
import com.pulumi.aws.eks.outputs.ClusterIdentity;
import com.pulumi.aws.eks.outputs.ClusterKubernetesNetworkConfig;
import com.pulumi.aws.eks.outputs.ClusterVpcConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EKS Cluster.
 * 
 * ## Example Usage
 * ### Basic Usage
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
 *         var example = new Cluster(&#34;example&#34;, ClusterArgs.builder()        
 *             .roleArn(aws_iam_role.getExample().getArn())
 *             .vpcConfig(ClusterVpcConfig.builder()
 *                 .subnetIds(                
 *                     aws_subnet.getExample1().getId(),
 *                     aws_subnet.getExample2().getId())
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;endpoint&#34;, example.getEndpoint());
 *         ctx.export(&#34;kubeconfig-certificate-authority-data&#34;, example.getCertificateAuthority().apply(certificateAuthority -&gt; certificateAuthority.getData()));
 *         }
 * }
 * ```
 * ### Example IAM Role for EKS Cluster
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
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;eks.amazonaws.com&#34;
 *       },
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var example_AmazonEKSClusterPolicy = new RolePolicyAttachment(&#34;example-AmazonEKSClusterPolicy&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/AmazonEKSClusterPolicy&#34;)
 *             .role(example.getName())
 *             .build());
 * 
 *         var example_AmazonEKSVPCResourceController = new RolePolicyAttachment(&#34;example-AmazonEKSVPCResourceController&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/AmazonEKSVPCResourceController&#34;)
 *             .role(example.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Enabling Control Plane Logging
 * 
 * [EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) can be enabled via the `enabled_cluster_log_types` argument. To manage the CloudWatch Log Group retention period, the `aws.cloudwatch.LogGroup` resource can be used.
 * 
 * &gt; The below configuration uses [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) to prevent ordering issues with EKS automatically creating the log group first and a variable for naming consistency. Other ordering and naming methodologies may be more appropriate for your environment.
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
 *         final var config = Config.of();
 *         final var clusterName = config.get(&#34;clusterName&#34;).orElse(&#34;example&#34;);
 *         var exampleLogGroup = new LogGroup(&#34;exampleLogGroup&#34;, LogGroupArgs.builder()        
 *             .retentionInDays(7)
 *             .build());
 * 
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .enabledClusterLogTypes(            
 *                 &#34;api&#34;,
 *                 &#34;audit&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * EKS Clusters can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:eks/cluster:Cluster my_cluster my_cluster
 * ```
 * 
 */
@ResourceType(type="aws:eks/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the cluster.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * 
     */
    @Export(name="certificateAuthorities", type=List.class, parameters={ClusterCertificateAuthority.class})
    private Output<List<ClusterCertificateAuthority>> certificateAuthorities;

    /**
     * @return Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * 
     */
    public Output<List<ClusterCertificateAuthority>> certificateAuthorities() {
        return this.certificateAuthorities;
    }
    /**
     * The first certificate authority. Base64 encoded certificate data required to communicate with your cluster.
     * 
     */
    @Export(name="certificateAuthority", type=ClusterCertificateAuthority.class, parameters={})
    private Output<ClusterCertificateAuthority> certificateAuthority;

    /**
     * @return The first certificate authority. Base64 encoded certificate data required to communicate with your cluster.
     * 
     */
    public Output<ClusterCertificateAuthority> certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Unix epoch timestamp in seconds for when the cluster was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Unix epoch timestamp in seconds for when the cluster was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
     * 
     */
    @Export(name="enabledClusterLogTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledClusterLogTypes;

    /**
     * @return List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
     * 
     */
    public Output<Optional<List<String>>> enabledClusterLogTypes() {
        return Codegen.optional(this.enabledClusterLogTypes);
    }
    /**
     * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
     * 
     */
    @Export(name="encryptionConfig", type=ClusterEncryptionConfig.class, parameters={})
    private Output</* @Nullable */ ClusterEncryptionConfig> encryptionConfig;

    /**
     * @return Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
     * 
     */
    public Output<Optional<ClusterEncryptionConfig>> encryptionConfig() {
        return Codegen.optional(this.encryptionConfig);
    }
    /**
     * Endpoint for your Kubernetes API server.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return Endpoint for your Kubernetes API server.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * 
     */
    @Export(name="identities", type=List.class, parameters={ClusterIdentity.class})
    private Output<List<ClusterIdentity>> identities;

    /**
     * @return Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * 
     */
    public Output<List<ClusterIdentity>> identities() {
        return this.identities;
    }
    /**
     * Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Export(name="kubernetesNetworkConfig", type=ClusterKubernetesNetworkConfig.class, parameters={})
    private Output<ClusterKubernetesNetworkConfig> kubernetesNetworkConfig;

    /**
     * @return Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Output<ClusterKubernetesNetworkConfig> kubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig;
    }
    /**
     * Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Platform version for the cluster.
     * 
     */
    @Export(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return Platform version for the cluster.
     * 
     */
    public Output<String> platformVersion() {
        return this.platformVersion;
    }
    /**
     * ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     * 
     */
    @Export(name="vpcConfig", type=ClusterVpcConfig.class, parameters={})
    private Output<ClusterVpcConfig> vpcConfig;

    /**
     * @return Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     * 
     */
    public Output<ClusterVpcConfig> vpcConfig() {
        return this.vpcConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
