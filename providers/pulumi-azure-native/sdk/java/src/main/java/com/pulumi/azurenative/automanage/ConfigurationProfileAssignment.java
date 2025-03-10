// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automanage.ConfigurationProfileAssignmentArgs;
import com.pulumi.azurenative.automanage.outputs.ConfigurationProfileAssignmentPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configuration profile assignment is an association between a VM and automanage profile configuration.
 * API Version: 2020-06-30-preview.
 * 
 * ## Example Usage
 * ### Create or update configuration profile assignment
 * 
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
 *         var configurationProfileAssignment = new ConfigurationProfileAssignment(&#34;configurationProfileAssignment&#34;, ConfigurationProfileAssignmentArgs.builder()        
 *             .configurationProfileAssignmentName(&#34;default&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;accountId&#34;, &#34;/subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automanage/accounts/AutomanageAccount&#34;),
 *                 Map.entry(&#34;configurationProfile&#34;, &#34;Azure virtual machine best practices – Production&#34;),
 *                 Map.entry(&#34;configurationProfilePreferenceId&#34;, &#34;/subscriptions/subscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.Automanage/configurationProfilePreferences/defaultProfilePreference&#34;)
 *             ))
 *             .resourceGroupName(&#34;myResourceGroupName&#34;)
 *             .vmName(&#34;myVMName&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automanage:ConfigurationProfileAssignment default /subscriptions/subscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.Compute/virtualMachines/myvm/providers/Microsoft.Automanage/AutomanageAssignments/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:automanage:ConfigurationProfileAssignment")
public class ConfigurationProfileAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of the configuration profile assignment.
     * 
     */
    @Export(name="properties", type=ConfigurationProfileAssignmentPropertiesResponse.class, parameters={})
    private Output<ConfigurationProfileAssignmentPropertiesResponse> properties;

    /**
     * @return Properties of the configuration profile assignment.
     * 
     */
    public Output<ConfigurationProfileAssignmentPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationProfileAssignment(String name) {
        this(name, ConfigurationProfileAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationProfileAssignment(String name, ConfigurationProfileAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationProfileAssignment(String name, ConfigurationProfileAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automanage:ConfigurationProfileAssignment", name, args == null ? ConfigurationProfileAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationProfileAssignment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automanage:ConfigurationProfileAssignment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automanage/v20200630preview:ConfigurationProfileAssignment").build()),
                Output.of(Alias.builder().type("azure-native:automanage/v20210430preview:ConfigurationProfileAssignment").build())
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
    public static ConfigurationProfileAssignment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationProfileAssignment(name, id, options);
    }
}
