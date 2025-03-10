// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.personalize.SchemaArgs;
import com.pulumi.awsnative.personalize.enums.SchemaDomain;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Personalize::Schema.
 * 
 */
@ResourceType(type="aws-native:personalize:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * The domain of a Domain dataset group.
     * 
     */
    @Export(name="domain", type=SchemaDomain.class, parameters={})
    private Output</* @Nullable */ SchemaDomain> domain;

    /**
     * @return The domain of a Domain dataset group.
     * 
     */
    public Output<Optional<SchemaDomain>> domain() {
        return Codegen.optional(this.domain);
    }
    /**
     * Name for the schema.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name for the schema.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A schema in Avro JSON format.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return A schema in Avro JSON format.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Arn for the schema.
     * 
     */
    @Export(name="schemaArn", type=String.class, parameters={})
    private Output<String> schemaArn;

    /**
     * @return Arn for the schema.
     * 
     */
    public Output<String> schemaArn() {
        return this.schemaArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:personalize:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:personalize:Schema", name, null, makeResourceOptions(options, id));
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
    public static Schema get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, options);
    }
}
