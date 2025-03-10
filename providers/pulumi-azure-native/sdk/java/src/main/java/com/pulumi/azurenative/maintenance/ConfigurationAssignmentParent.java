// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maintenance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.maintenance.ConfigurationAssignmentParentArgs;
import com.pulumi.azurenative.maintenance.outputs.SystemDataResponse;
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
 * Configuration Assignment
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * ### ConfigurationAssignments_CreateOrUpdateParent
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
 *         var configurationAssignmentParent = new ConfigurationAssignmentParent(&#34;configurationAssignmentParent&#34;, ConfigurationAssignmentParentArgs.builder()        
 *             .configurationAssignmentName(&#34;workervmPolicy&#34;)
 *             .maintenanceConfigurationId(&#34;/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/policy1&#34;)
 *             .providerName(&#34;Microsoft.Compute&#34;)
 *             .resourceGroupName(&#34;examplerg&#34;)
 *             .resourceName(&#34;smdvm1&#34;)
 *             .resourceParentName(&#34;smdtest1&#34;)
 *             .resourceParentType(&#34;virtualMachineScaleSets&#34;)
 *             .resourceType(&#34;virtualMachines&#34;)
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
 * $ pulumi import azure-native:maintenance:ConfigurationAssignmentParent workervmPolicy /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Compute/virtualMachineScaleSets/smdtest1/virtualMachines/smdvm1/providers/Microsoft.Maintenance/configurationAssignments/workervmPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:maintenance:ConfigurationAssignmentParent")
public class ConfigurationAssignmentParent extends com.pulumi.resources.CustomResource {
    /**
     * Location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the resource
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The maintenance configuration Id
     * 
     */
    @Export(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    /**
     * @return The maintenance configuration Id
     * 
     */
    public Output<Optional<String>> maintenanceConfigurationId() {
        return Codegen.optional(this.maintenanceConfigurationId);
    }
    /**
     * Name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique resourceId
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The unique resourceId
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Type of the resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationAssignmentParent(String name) {
        this(name, ConfigurationAssignmentParentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationAssignmentParent(String name, ConfigurationAssignmentParentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationAssignmentParent(String name, ConfigurationAssignmentParentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:ConfigurationAssignmentParent", name, args == null ? ConfigurationAssignmentParentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationAssignmentParent(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:ConfigurationAssignmentParent", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:maintenance/v20210401preview:ConfigurationAssignmentParent").build()),
                Output.of(Alias.builder().type("azure-native:maintenance/v20210901preview:ConfigurationAssignmentParent").build())
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
    public static ConfigurationAssignmentParent get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationAssignmentParent(name, id, options);
    }
}
