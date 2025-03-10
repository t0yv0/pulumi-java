// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.configuration;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.configuration.ConfigurationAggregatorArgs;
import com.pulumi.awsnative.configuration.outputs.ConfigurationAggregatorAccountAggregationSource;
import com.pulumi.awsnative.configuration.outputs.ConfigurationAggregatorOrganizationAggregationSource;
import com.pulumi.awsnative.configuration.outputs.ConfigurationAggregatorTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Config::ConfigurationAggregator
 * 
 */
@ResourceType(type="aws-native:configuration:ConfigurationAggregator")
public class ConfigurationAggregator extends com.pulumi.resources.CustomResource {
    @Export(name="accountAggregationSources", type=List.class, parameters={ConfigurationAggregatorAccountAggregationSource.class})
    private Output</* @Nullable */ List<ConfigurationAggregatorAccountAggregationSource>> accountAggregationSources;

    public Output<Optional<List<ConfigurationAggregatorAccountAggregationSource>>> accountAggregationSources() {
        return Codegen.optional(this.accountAggregationSources);
    }
    /**
     * The Amazon Resource Name (ARN) of the aggregator.
     * 
     */
    @Export(name="configurationAggregatorArn", type=String.class, parameters={})
    private Output<String> configurationAggregatorArn;

    /**
     * @return The Amazon Resource Name (ARN) of the aggregator.
     * 
     */
    public Output<String> configurationAggregatorArn() {
        return this.configurationAggregatorArn;
    }
    /**
     * The name of the aggregator.
     * 
     */
    @Export(name="configurationAggregatorName", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationAggregatorName;

    /**
     * @return The name of the aggregator.
     * 
     */
    public Output<Optional<String>> configurationAggregatorName() {
        return Codegen.optional(this.configurationAggregatorName);
    }
    @Export(name="organizationAggregationSource", type=ConfigurationAggregatorOrganizationAggregationSource.class, parameters={})
    private Output</* @Nullable */ ConfigurationAggregatorOrganizationAggregationSource> organizationAggregationSource;

    public Output<Optional<ConfigurationAggregatorOrganizationAggregationSource>> organizationAggregationSource() {
        return Codegen.optional(this.organizationAggregationSource);
    }
    /**
     * The tags for the configuration aggregator.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ConfigurationAggregatorTag.class})
    private Output</* @Nullable */ List<ConfigurationAggregatorTag>> tags;

    /**
     * @return The tags for the configuration aggregator.
     * 
     */
    public Output<Optional<List<ConfigurationAggregatorTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationAggregator(String name) {
        this(name, ConfigurationAggregatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationAggregator(String name, @Nullable ConfigurationAggregatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationAggregator(String name, @Nullable ConfigurationAggregatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:configuration:ConfigurationAggregator", name, args == null ? ConfigurationAggregatorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationAggregator(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:configuration:ConfigurationAggregator", name, null, makeResourceOptions(options, id));
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
    public static ConfigurationAggregator get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationAggregator(name, id, options);
    }
}
