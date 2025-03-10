// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataproc_v1.AutoscalingPolicyArgs;
import com.pulumi.googlenative.dataproc_v1.outputs.BasicAutoscalingAlgorithmResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.InstanceGroupAutoscalingPolicyConfigResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates new autoscaling policy.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1:AutoscalingPolicy")
public class AutoscalingPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="basicAlgorithm", type=BasicAutoscalingAlgorithmResponse.class, parameters={})
    private Output<BasicAutoscalingAlgorithmResponse> basicAlgorithm;

    public Output<BasicAutoscalingAlgorithmResponse> basicAlgorithm() {
        return this.basicAlgorithm;
    }
    /**
     * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an autoscaling policy.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an autoscaling policy.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The &#34;resource name&#34; of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The &#34;resource name&#34; of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    @Export(name="secondaryWorkerConfig", type=InstanceGroupAutoscalingPolicyConfigResponse.class, parameters={})
    private Output<InstanceGroupAutoscalingPolicyConfigResponse> secondaryWorkerConfig;

    /**
     * @return Optional. Describes how the autoscaler will operate for secondary workers.
     * 
     */
    public Output<InstanceGroupAutoscalingPolicyConfigResponse> secondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * 
     */
    @Export(name="workerConfig", type=InstanceGroupAutoscalingPolicyConfigResponse.class, parameters={})
    private Output<InstanceGroupAutoscalingPolicyConfigResponse> workerConfig;

    /**
     * @return Describes how the autoscaler will operate for primary workers.
     * 
     */
    public Output<InstanceGroupAutoscalingPolicyConfigResponse> workerConfig() {
        return this.workerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscalingPolicy(String name) {
        this(name, AutoscalingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:AutoscalingPolicy", name, args == null ? AutoscalingPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoscalingPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:AutoscalingPolicy", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AutoscalingPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingPolicy(name, id, options);
    }
}
