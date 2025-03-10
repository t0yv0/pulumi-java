// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hanaonazure.ProviderInstanceArgs;
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
 * A provider instance associated with a SAP monitor.
 * API Version: 2020-02-07-preview.
 * 
 * ## Example Usage
 * ### Create a SAP Monitor
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
 *         var providerInstance = new ProviderInstance(&#34;providerInstance&#34;, ProviderInstanceArgs.builder()        
 *             .metadata(&#34;{\&#34;key\&#34;:\&#34;value\&#34;}&#34;)
 *             .properties(&#34;{\&#34;hostname\&#34;:\&#34;10.0.0.6\&#34;,\&#34;dbName\&#34;:\&#34;SYSTEMDB\&#34;,\&#34;sqlPort\&#34;:30013,\&#34;dbUsername\&#34;:\&#34;SYSTEM\&#34;,\&#34;dbPassword\&#34;:\&#34;PASSWORD\&#34;}&#34;)
 *             .providerInstanceName(&#34;myProviderInstance&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sapMonitorName(&#34;mySapMonitor&#34;)
 *             .type(&#34;hana&#34;)
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
 * $ pulumi import azure-native:hanaonazure:ProviderInstance myProviderInstance /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.HanaOnAzure/sapMonitors/mySapMonitor/providerInstances/myProviderInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:hanaonazure:ProviderInstance")
public class ProviderInstance extends com.pulumi.resources.CustomResource {
    /**
     * A JSON string containing metadata of the provider instance.
     * 
     */
    @Export(name="metadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> metadata;

    /**
     * @return A JSON string containing metadata of the provider instance.
     * 
     */
    public Output<Optional<String>> metadata() {
        return Codegen.optional(this.metadata);
    }
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
     * A JSON string containing the properties of the provider instance.
     * 
     */
    @Export(name="properties", type=String.class, parameters={})
    private Output<String> properties;

    /**
     * @return A JSON string containing the properties of the provider instance.
     * 
     */
    public Output<String> properties() {
        return this.properties;
    }
    /**
     * State of provisioning of the provider instance
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of provisioning of the provider instance
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
    public ProviderInstance(String name) {
        this(name, ProviderInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProviderInstance(String name, ProviderInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProviderInstance(String name, ProviderInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:ProviderInstance", name, args == null ? ProviderInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProviderInstance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:ProviderInstance", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hanaonazure/v20200207preview:ProviderInstance").build())
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
    public static ProviderInstance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProviderInstance(name, id, options);
    }
}
