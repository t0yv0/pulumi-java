// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.edgeorder.OrderItemByNameArgs;
import com.pulumi.azurenative.edgeorder.outputs.AddressDetailsResponse;
import com.pulumi.azurenative.edgeorder.outputs.OrderItemDetailsResponse;
import com.pulumi.azurenative.edgeorder.outputs.SystemDataResponse;
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
 * Represents order item contract
 * API Version: 2021-12-01.
 * 
 * ## Example Usage
 * ### CreateOrderItem
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
 *         var orderItemByName = new OrderItemByName(&#34;orderItemByName&#34;, OrderItemByNameArgs.builder()        
 *             .addressDetails(Map.of(&#34;forwardAddress&#34;, Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;XXXX XXXX&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;xxxx@xxxx.xxx&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;0000000000&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;&#34;)
 *                 )),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;None&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;UNIT 1&#34;)
 *                 ))
 *             )))
 *             .location(&#34;eastus&#34;)
 *             .orderId(&#34;/subscriptions/YourSubscriptionId/resourceGroups/YourResourceGroupName/providers/Microsoft.EdgeOrder/locations/eastus/orders/TestOrderName2&#34;)
 *             .orderItemDetails(Map.ofEntries(
 *                 Map.entry(&#34;orderItemType&#34;, &#34;Purchase&#34;),
 *                 Map.entry(&#34;preferences&#34;, Map.of(&#34;transportPreferences&#34;, Map.of(&#34;preferredShipmentType&#34;, &#34;MicrosoftManaged&#34;))),
 *                 Map.entry(&#34;productDetails&#34;, Map.of(&#34;hierarchyInformation&#34;, Map.ofEntries(
 *                     Map.entry(&#34;configurationName&#34;, &#34;edgep_base&#34;),
 *                     Map.entry(&#34;productFamilyName&#34;, &#34;azurestackedge&#34;),
 *                     Map.entry(&#34;productLineName&#34;, &#34;azurestackedge&#34;),
 *                     Map.entry(&#34;productName&#34;, &#34;azurestackedgegpu&#34;)
 *                 )))
 *             ))
 *             .orderItemName(&#34;TestOrderItemName2&#34;)
 *             .resourceGroupName(&#34;YourResourceGroupName&#34;)
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
 * $ pulumi import azure-native:edgeorder:OrderItemByName TestOrderItemName2 /subscriptions/YourSubscriptionId/resourceGroups/YourResourceGroupName/providers/Microsoft.EdgeOrder/orderItems/TestOrderItemName2 
 * ```
 * 
 */
@ResourceType(type="azure-native:edgeorder:OrderItemByName")
public class OrderItemByName extends com.pulumi.resources.CustomResource {
    /**
     * Represents shipping and return address for order item
     * 
     */
    @Export(name="addressDetails", type=AddressDetailsResponse.class, parameters={})
    private Output<AddressDetailsResponse> addressDetails;

    /**
     * @return Represents shipping and return address for order item
     * 
     */
    public Output<AddressDetailsResponse> addressDetails() {
        return this.addressDetails;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Id of the order to which order item belongs to
     * 
     */
    @Export(name="orderId", type=String.class, parameters={})
    private Output<String> orderId;

    /**
     * @return Id of the order to which order item belongs to
     * 
     */
    public Output<String> orderId() {
        return this.orderId;
    }
    /**
     * Represents order item details.
     * 
     */
    @Export(name="orderItemDetails", type=OrderItemDetailsResponse.class, parameters={})
    private Output<OrderItemDetailsResponse> orderItemDetails;

    /**
     * @return Represents order item details.
     * 
     */
    public Output<OrderItemDetailsResponse> orderItemDetails() {
        return this.orderItemDetails;
    }
    /**
     * Start time of order item
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Start time of order item
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * Represents resource creation and update time
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Represents resource creation and update time
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public OrderItemByName(String name) {
        this(name, OrderItemByNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrderItemByName(String name, OrderItemByNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrderItemByName(String name, OrderItemByNameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:edgeorder:OrderItemByName", name, args == null ? OrderItemByNameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrderItemByName(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:edgeorder:OrderItemByName", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:edgeorder/v20201201preview:OrderItemByName").build()),
                Output.of(Alias.builder().type("azure-native:edgeorder/v20211201:OrderItemByName").build())
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
    public static OrderItemByName get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrderItemByName(name, id, options);
    }
}
