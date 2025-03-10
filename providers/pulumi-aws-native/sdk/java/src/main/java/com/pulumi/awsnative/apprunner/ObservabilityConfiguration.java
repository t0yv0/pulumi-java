// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apprunner.ObservabilityConfigurationArgs;
import com.pulumi.awsnative.apprunner.outputs.ObservabilityConfigurationTag;
import com.pulumi.awsnative.apprunner.outputs.ObservabilityConfigurationTraceConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::AppRunner::ObservabilityConfiguration resource  is an AWS App Runner resource type that specifies an App Runner observability configuration
 * 
 */
@ResourceType(type="aws-native:apprunner:ObservabilityConfiguration")
public class ObservabilityConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * It&#39;s set to true for the configuration with the highest Revision among all configurations that share the same Name. It&#39;s set to false otherwise.
     * 
     */
    @Export(name="latest", type=Boolean.class, parameters={})
    private Output<Boolean> latest;

    /**
     * @return It&#39;s set to true for the configuration with the highest Revision among all configurations that share the same Name. It&#39;s set to false otherwise.
     * 
     */
    public Output<Boolean> latest() {
        return this.latest;
    }
    /**
     * The Amazon Resource Name (ARN) of this ObservabilityConfiguration
     * 
     */
    @Export(name="observabilityConfigurationArn", type=String.class, parameters={})
    private Output<String> observabilityConfigurationArn;

    /**
     * @return The Amazon Resource Name (ARN) of this ObservabilityConfiguration
     * 
     */
    public Output<String> observabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }
    /**
     * A name for the observability configuration. When you use it for the first time in an AWS Region, App Runner creates revision number 1 of this name. When you use the same name in subsequent calls, App Runner creates incremental revisions of the configuration.
     * 
     */
    @Export(name="observabilityConfigurationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> observabilityConfigurationName;

    /**
     * @return A name for the observability configuration. When you use it for the first time in an AWS Region, App Runner creates revision number 1 of this name. When you use the same name in subsequent calls, App Runner creates incremental revisions of the configuration.
     * 
     */
    public Output<Optional<String>> observabilityConfigurationName() {
        return Codegen.optional(this.observabilityConfigurationName);
    }
    /**
     * The revision of this observability configuration. It&#39;s unique among all the active configurations (&#39;Status&#39;: &#39;ACTIVE&#39;) that share the same ObservabilityConfigurationName.
     * 
     */
    @Export(name="observabilityConfigurationRevision", type=Integer.class, parameters={})
    private Output<Integer> observabilityConfigurationRevision;

    /**
     * @return The revision of this observability configuration. It&#39;s unique among all the active configurations (&#39;Status&#39;: &#39;ACTIVE&#39;) that share the same ObservabilityConfigurationName.
     * 
     */
    public Output<Integer> observabilityConfigurationRevision() {
        return this.observabilityConfigurationRevision;
    }
    /**
     * A list of metadata items that you can associate with your observability configuration resource. A tag is a key-value pair.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ObservabilityConfigurationTag.class})
    private Output</* @Nullable */ List<ObservabilityConfigurationTag>> tags;

    /**
     * @return A list of metadata items that you can associate with your observability configuration resource. A tag is a key-value pair.
     * 
     */
    public Output<Optional<List<ObservabilityConfigurationTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing.
     * 
     */
    @Export(name="traceConfiguration", type=ObservabilityConfigurationTraceConfiguration.class, parameters={})
    private Output</* @Nullable */ ObservabilityConfigurationTraceConfiguration> traceConfiguration;

    /**
     * @return The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing.
     * 
     */
    public Output<Optional<ObservabilityConfigurationTraceConfiguration>> traceConfiguration() {
        return Codegen.optional(this.traceConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObservabilityConfiguration(String name) {
        this(name, ObservabilityConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObservabilityConfiguration(String name, @Nullable ObservabilityConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObservabilityConfiguration(String name, @Nullable ObservabilityConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:ObservabilityConfiguration", name, args == null ? ObservabilityConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObservabilityConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:ObservabilityConfiguration", name, null, makeResourceOptions(options, id));
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
    public static ObservabilityConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObservabilityConfiguration(name, id, options);
    }
}
