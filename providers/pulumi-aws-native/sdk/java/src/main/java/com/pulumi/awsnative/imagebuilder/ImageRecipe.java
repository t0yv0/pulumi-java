// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.imagebuilder.ImageRecipeArgs;
import com.pulumi.awsnative.imagebuilder.outputs.ImageRecipeAdditionalInstanceConfiguration;
import com.pulumi.awsnative.imagebuilder.outputs.ImageRecipeComponentConfiguration;
import com.pulumi.awsnative.imagebuilder.outputs.ImageRecipeInstanceBlockDeviceMapping;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::ImageRecipe
 * 
 */
@ResourceType(type="aws-native:imagebuilder:ImageRecipe")
public class ImageRecipe extends com.pulumi.resources.CustomResource {
    /**
     * Specify additional settings and launch scripts for your build instances.
     * 
     */
    @Export(name="additionalInstanceConfiguration", type=ImageRecipeAdditionalInstanceConfiguration.class, parameters={})
    private Output</* @Nullable */ ImageRecipeAdditionalInstanceConfiguration> additionalInstanceConfiguration;

    /**
     * @return Specify additional settings and launch scripts for your build instances.
     * 
     */
    public Output<Optional<ImageRecipeAdditionalInstanceConfiguration>> additionalInstanceConfiguration() {
        return Codegen.optional(this.additionalInstanceConfiguration);
    }
    /**
     * The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The block device mappings to apply when creating images from this recipe.
     * 
     */
    @Export(name="blockDeviceMappings", type=List.class, parameters={ImageRecipeInstanceBlockDeviceMapping.class})
    private Output</* @Nullable */ List<ImageRecipeInstanceBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return The block device mappings to apply when creating images from this recipe.
     * 
     */
    public Output<Optional<List<ImageRecipeInstanceBlockDeviceMapping>>> blockDeviceMappings() {
        return Codegen.optional(this.blockDeviceMappings);
    }
    /**
     * The components of the image recipe.
     * 
     */
    @Export(name="components", type=List.class, parameters={ImageRecipeComponentConfiguration.class})
    private Output<List<ImageRecipeComponentConfiguration>> components;

    /**
     * @return The components of the image recipe.
     * 
     */
    public Output<List<ImageRecipeComponentConfiguration>> components() {
        return this.components;
    }
    /**
     * The description of the image recipe.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the image recipe.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the image recipe.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the image recipe.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent image of the image recipe.
     * 
     */
    @Export(name="parentImage", type=String.class, parameters={})
    private Output<String> parentImage;

    /**
     * @return The parent image of the image recipe.
     * 
     */
    public Output<String> parentImage() {
        return this.parentImage;
    }
    /**
     * The tags of the image recipe.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags of the image recipe.
     * 
     */
    public Output<Optional<Object>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The version of the image recipe.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the image recipe.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @Export(name="workingDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> workingDirectory;

    /**
     * @return The working directory to be used during build and test workflows.
     * 
     */
    public Output<Optional<String>> workingDirectory() {
        return Codegen.optional(this.workingDirectory);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageRecipe(String name) {
        this(name, ImageRecipeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageRecipe(String name, ImageRecipeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageRecipe(String name, ImageRecipeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:ImageRecipe", name, args == null ? ImageRecipeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImageRecipe(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:ImageRecipe", name, null, makeResourceOptions(options, id));
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
    public static ImageRecipe get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImageRecipe(name, id, options);
    }
}
