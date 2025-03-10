// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.greengrassv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.greengrassv2.ComponentVersionArgs;
import com.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaFunctionRecipeSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for Greengrass component version.
 * 
 */
@ResourceType(type="aws-native:greengrassv2:ComponentVersion")
public class ComponentVersion extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="componentName", type=String.class, parameters={})
    private Output<String> componentName;

    public Output<String> componentName() {
        return this.componentName;
    }
    @Export(name="componentVersion", type=String.class, parameters={})
    private Output<String> componentVersion;

    public Output<String> componentVersion() {
        return this.componentVersion;
    }
    @Export(name="inlineRecipe", type=String.class, parameters={})
    private Output</* @Nullable */ String> inlineRecipe;

    public Output<Optional<String>> inlineRecipe() {
        return Codegen.optional(this.inlineRecipe);
    }
    @Export(name="lambdaFunction", type=ComponentVersionLambdaFunctionRecipeSource.class, parameters={})
    private Output</* @Nullable */ ComponentVersionLambdaFunctionRecipeSource> lambdaFunction;

    public Output<Optional<ComponentVersionLambdaFunctionRecipeSource>> lambdaFunction() {
        return Codegen.optional(this.lambdaFunction);
    }
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    public Output<Optional<Object>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ComponentVersion(String name) {
        this(name, ComponentVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ComponentVersion(String name, @Nullable ComponentVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ComponentVersion(String name, @Nullable ComponentVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:greengrassv2:ComponentVersion", name, args == null ? ComponentVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ComponentVersion(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:greengrassv2:ComponentVersion", name, null, makeResourceOptions(options, id));
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
    public static ComponentVersion get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ComponentVersion(name, id, options);
    }
}
