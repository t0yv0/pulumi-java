// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.WorkflowAccessKeyArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * API Version: 2015-02-01-preview.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:WorkflowAccessKey myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/accessKeys/{accessKeyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:WorkflowAccessKey")
public class WorkflowAccessKey extends com.pulumi.resources.CustomResource {
    /**
     * Gets the workflow access key name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the workflow access key name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets the not-after time.
     * 
     */
    @Export(name="notAfter", type=String.class, parameters={})
    private Output</* @Nullable */ String> notAfter;

    /**
     * @return Gets or sets the not-after time.
     * 
     */
    public Output<Optional<String>> notAfter() {
        return Codegen.optional(this.notAfter);
    }
    /**
     * Gets or sets the not-before time.
     * 
     */
    @Export(name="notBefore", type=String.class, parameters={})
    private Output</* @Nullable */ String> notBefore;

    /**
     * @return Gets or sets the not-before time.
     * 
     */
    public Output<Optional<String>> notBefore() {
        return Codegen.optional(this.notBefore);
    }
    /**
     * Gets the workflow access key type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the workflow access key type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkflowAccessKey(String name) {
        this(name, WorkflowAccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkflowAccessKey(String name, WorkflowAccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkflowAccessKey(String name, WorkflowAccessKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, args == null ? WorkflowAccessKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkflowAccessKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20150201preview:WorkflowAccessKey").build())
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
    public static WorkflowAccessKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkflowAccessKey(name, id, options);
    }
}
