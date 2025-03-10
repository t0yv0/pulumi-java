// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wisdom.KnowledgeBaseArgs;
import com.pulumi.awsnative.wisdom.enums.KnowledgeBaseType;
import com.pulumi.awsnative.wisdom.outputs.KnowledgeBaseRenderingConfiguration;
import com.pulumi.awsnative.wisdom.outputs.KnowledgeBaseServerSideEncryptionConfiguration;
import com.pulumi.awsnative.wisdom.outputs.KnowledgeBaseSourceConfiguration;
import com.pulumi.awsnative.wisdom.outputs.KnowledgeBaseTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of AWS::Wisdom::KnowledgeBase Resource Type
 * 
 */
@ResourceType(type="aws-native:wisdom:KnowledgeBase")
public class KnowledgeBase extends com.pulumi.resources.CustomResource {
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="knowledgeBaseArn", type=String.class, parameters={})
    private Output<String> knowledgeBaseArn;

    public Output<String> knowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }
    @Export(name="knowledgeBaseId", type=String.class, parameters={})
    private Output<String> knowledgeBaseId;

    public Output<String> knowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    @Export(name="knowledgeBaseType", type=KnowledgeBaseType.class, parameters={})
    private Output<KnowledgeBaseType> knowledgeBaseType;

    public Output<KnowledgeBaseType> knowledgeBaseType() {
        return this.knowledgeBaseType;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="renderingConfiguration", type=KnowledgeBaseRenderingConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseRenderingConfiguration> renderingConfiguration;

    public Output<Optional<KnowledgeBaseRenderingConfiguration>> renderingConfiguration() {
        return Codegen.optional(this.renderingConfiguration);
    }
    @Export(name="serverSideEncryptionConfiguration", type=KnowledgeBaseServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    public Output<Optional<KnowledgeBaseServerSideEncryptionConfiguration>> serverSideEncryptionConfiguration() {
        return Codegen.optional(this.serverSideEncryptionConfiguration);
    }
    @Export(name="sourceConfiguration", type=KnowledgeBaseSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseSourceConfiguration> sourceConfiguration;

    public Output<Optional<KnowledgeBaseSourceConfiguration>> sourceConfiguration() {
        return Codegen.optional(this.sourceConfiguration);
    }
    @Export(name="tags", type=List.class, parameters={KnowledgeBaseTag.class})
    private Output</* @Nullable */ List<KnowledgeBaseTag>> tags;

    public Output<Optional<List<KnowledgeBaseTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KnowledgeBase(String name) {
        this(name, KnowledgeBaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KnowledgeBase(String name, KnowledgeBaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KnowledgeBase(String name, KnowledgeBaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:KnowledgeBase", name, args == null ? KnowledgeBaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KnowledgeBase(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:KnowledgeBase", name, null, makeResourceOptions(options, id));
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
    public static KnowledgeBase get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KnowledgeBase(name, id, options);
    }
}
