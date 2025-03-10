// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.amplifyuibuilder.ThemeArgs;
import com.pulumi.awsnative.amplifyuibuilder.outputs.ThemeTags;
import com.pulumi.awsnative.amplifyuibuilder.outputs.ThemeValues;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of AWS::AmplifyUIBuilder::Theme Resource Type
 * 
 */
@ResourceType(type="aws-native:amplifyuibuilder:Theme")
public class Theme extends com.pulumi.resources.CustomResource {
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="environmentName", type=String.class, parameters={})
    private Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName;
    }
    @Export(name="modifiedAt", type=String.class, parameters={})
    private Output<String> modifiedAt;

    public Output<String> modifiedAt() {
        return this.modifiedAt;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="overrides", type=List.class, parameters={ThemeValues.class})
    private Output</* @Nullable */ List<ThemeValues>> overrides;

    public Output<Optional<List<ThemeValues>>> overrides() {
        return Codegen.optional(this.overrides);
    }
    @Export(name="tags", type=ThemeTags.class, parameters={})
    private Output</* @Nullable */ ThemeTags> tags;

    public Output<Optional<ThemeTags>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="values", type=List.class, parameters={ThemeValues.class})
    private Output<List<ThemeValues>> values;

    public Output<List<ThemeValues>> values() {
        return this.values;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Theme(String name) {
        this(name, ThemeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Theme(String name, ThemeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Theme(String name, ThemeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Theme", name, args == null ? ThemeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Theme(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Theme", name, null, makeResourceOptions(options, id));
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
    public static Theme get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Theme(name, id, options);
    }
}
