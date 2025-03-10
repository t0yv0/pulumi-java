// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scvmm;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.scvmm.CloudArgs;
import com.pulumi.azurenative.scvmm.outputs.CloudCapacityResponse;
import com.pulumi.azurenative.scvmm.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.scvmm.outputs.StorageQoSPolicyResponse;
import com.pulumi.azurenative.scvmm.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Clouds resource definition.
 * API Version: 2020-06-05-preview.
 * 
 * ## Example Usage
 * ### CreateCloud
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
 *         var cloud = new Cloud(&#34;cloud&#34;, CloudArgs.builder()        
 *             .cloudName(&#34;HRCloud&#34;)
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.Arc/customLocations/contoso&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;customLocation&#34;)
 *             ))
 *             .location(&#34;East US&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .uuid(&#34;aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee&#34;)
 *             .vmmServerId(&#34;/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/VMMServers/ContosoVMMServer&#34;)
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
 * $ pulumi import azure-native:scvmm:Cloud HRCloud /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/Clouds/HRCloud 
 * ```
 * 
 */
@ResourceType(type="azure-native:scvmm:Cloud")
public class Cloud extends com.pulumi.resources.CustomResource {
    /**
     * Capacity of the cloud.
     * 
     */
    @Export(name="cloudCapacity", type=CloudCapacityResponse.class, parameters={})
    private Output<CloudCapacityResponse> cloudCapacity;

    /**
     * @return Capacity of the cloud.
     * 
     */
    public Output<CloudCapacityResponse> cloudCapacity() {
        return this.cloudCapacity;
    }
    /**
     * Name of the cloud in VMMServer.
     * 
     */
    @Export(name="cloudName", type=String.class, parameters={})
    private Output<String> cloudName;

    /**
     * @return Name of the cloud in VMMServer.
     * 
     */
    public Output<String> cloudName() {
        return this.cloudName;
    }
    /**
     * The extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output<ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location.
     * 
     */
    public Output<ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Gets or sets the inventory Item ID for the resource.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the resource.
     * 
     */
    public Output<Optional<String>> inventoryItemId() {
        return Codegen.optional(this.inventoryItemId);
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * List of QoS policies available for the cloud.
     * 
     */
    @Export(name="storageQoSPolicies", type=List.class, parameters={StorageQoSPolicyResponse.class})
    private Output<List<StorageQoSPolicyResponse>> storageQoSPolicies;

    /**
     * @return List of QoS policies available for the cloud.
     * 
     */
    public Output<List<StorageQoSPolicyResponse>> storageQoSPolicies() {
        return this.storageQoSPolicies;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Unique ID of the cloud.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output</* @Nullable */ String> uuid;

    /**
     * @return Unique ID of the cloud.
     * 
     */
    public Output<Optional<String>> uuid() {
        return Codegen.optional(this.uuid);
    }
    /**
     * ARM Id of the vmmServer resource in which this resource resides.
     * 
     */
    @Export(name="vmmServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmmServerId;

    /**
     * @return ARM Id of the vmmServer resource in which this resource resides.
     * 
     */
    public Output<Optional<String>> vmmServerId() {
        return Codegen.optional(this.vmmServerId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cloud(String name) {
        this(name, CloudArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cloud(String name, CloudArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cloud(String name, CloudArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:Cloud", name, args == null ? CloudArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cloud(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:Cloud", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:scvmm/v20200605preview:Cloud").build())
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
    public static Cloud get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cloud(name, id, options);
    }
}
