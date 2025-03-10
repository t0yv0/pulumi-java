// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.orbital.ContactArgs;
import com.pulumi.azurenative.orbital.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Customer creates a contact resource for a spacecraft resource.
 * API Version: 2021-04-04-preview.
 * 
 * ## Example Usage
 * ### Create a contact
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
 *         var contact = new Contact(&#34;contact&#34;, ContactArgs.builder()        
 *             .contactName(&#34;contact1&#34;)
 *             .contactProfile(Map.of(&#34;id&#34;, &#34;/subscriptions/subId/resourceGroups/rg/Microsoft.Orbital/contactProfiles/AQUA_DIRECTPLAYBACK_WITH_UPLINK&#34;))
 *             .groundStationName(&#34;westus_gs1&#34;)
 *             .reservationEndTime(&#34;2020-07-16T20:55:00.00Z&#34;)
 *             .reservationStartTime(&#34;2020-07-16T20:35:00.00Z&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .spacecraftName(&#34;AQUA&#34;)
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
 * $ pulumi import azure-native:orbital:Contact contact1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Orbital/spacecrafts/AQUA/contacts/contact1 
 * ```
 * 
 */
@ResourceType(type="azure-native:orbital:Contact")
public class Contact extends com.pulumi.resources.CustomResource {
    /**
     * The reference to the contact profile resource.
     * 
     */
    @Export(name="contactProfile", type=ResourceReferenceResponse.class, parameters={})
    private Output<ResourceReferenceResponse> contactProfile;

    /**
     * @return The reference to the contact profile resource.
     * 
     */
    public Output<ResourceReferenceResponse> contactProfile() {
        return this.contactProfile;
    }
    /**
     * Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     */
    @Export(name="endAzimuthDegrees", type=Double.class, parameters={})
    private Output<Double> endAzimuthDegrees;

    /**
     * @return Azimuth of the antenna at the end of the contact in decimal degrees.
     * 
     */
    public Output<Double> endAzimuthDegrees() {
        return this.endAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact end.
     * 
     */
    @Export(name="endElevationDegrees", type=Double.class, parameters={})
    private Output<Double> endElevationDegrees;

    /**
     * @return Spacecraft elevation above the horizon at contact end.
     * 
     */
    public Output<Double> endElevationDegrees() {
        return this.endElevationDegrees;
    }
    /**
     * Any error message while scheduling a contact.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return Any error message while scheduling a contact.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Azure Ground Station name.
     * 
     */
    @Export(name="groundStationName", type=String.class, parameters={})
    private Output<String> groundStationName;

    /**
     * @return Azure Ground Station name.
     * 
     */
    public Output<String> groundStationName() {
        return this.groundStationName;
    }
    /**
     * Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    @Export(name="maximumElevationDegrees", type=Double.class, parameters={})
    private Output<Double> maximumElevationDegrees;

    /**
     * @return Maximum elevation of the antenna during the contact in decimal degrees.
     * 
     */
    public Output<Double> maximumElevationDegrees() {
        return this.maximumElevationDegrees;
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
     * Reservation end time of a contact.
     * 
     */
    @Export(name="reservationEndTime", type=String.class, parameters={})
    private Output<String> reservationEndTime;

    /**
     * @return Reservation end time of a contact.
     * 
     */
    public Output<String> reservationEndTime() {
        return this.reservationEndTime;
    }
    /**
     * Reservation start time of a contact.
     * 
     */
    @Export(name="reservationStartTime", type=String.class, parameters={})
    private Output<String> reservationStartTime;

    /**
     * @return Reservation start time of a contact.
     * 
     */
    public Output<String> reservationStartTime() {
        return this.reservationStartTime;
    }
    /**
     * Receive end time of a contact.
     * 
     */
    @Export(name="rxEndTime", type=String.class, parameters={})
    private Output<String> rxEndTime;

    /**
     * @return Receive end time of a contact.
     * 
     */
    public Output<String> rxEndTime() {
        return this.rxEndTime;
    }
    /**
     * Receive start time of a contact.
     * 
     */
    @Export(name="rxStartTime", type=String.class, parameters={})
    private Output<String> rxStartTime;

    /**
     * @return Receive start time of a contact.
     * 
     */
    public Output<String> rxStartTime() {
        return this.rxStartTime;
    }
    /**
     * Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     */
    @Export(name="startAzimuthDegrees", type=Double.class, parameters={})
    private Output<Double> startAzimuthDegrees;

    /**
     * @return Azimuth of the antenna at the start of the contact in decimal degrees.
     * 
     */
    public Output<Double> startAzimuthDegrees() {
        return this.startAzimuthDegrees;
    }
    /**
     * Spacecraft elevation above the horizon at contact start.
     * 
     */
    @Export(name="startElevationDegrees", type=Double.class, parameters={})
    private Output<Double> startElevationDegrees;

    /**
     * @return Spacecraft elevation above the horizon at contact start.
     * 
     */
    public Output<Double> startElevationDegrees() {
        return this.startElevationDegrees;
    }
    /**
     * Status of a contact.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of a contact.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * Transmit end time of a contact.
     * 
     */
    @Export(name="txEndTime", type=String.class, parameters={})
    private Output<String> txEndTime;

    /**
     * @return Transmit end time of a contact.
     * 
     */
    public Output<String> txEndTime() {
        return this.txEndTime;
    }
    /**
     * Transmit start time of a contact.
     * 
     */
    @Export(name="txStartTime", type=String.class, parameters={})
    private Output<String> txStartTime;

    /**
     * @return Transmit start time of a contact.
     * 
     */
    public Output<String> txStartTime() {
        return this.txStartTime;
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
    public Contact(String name) {
        this(name, ContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Contact(String name, ContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Contact(String name, ContactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Contact", name, args == null ? ContactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Contact(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Contact", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:orbital/v20210404preview:Contact").build())
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
    public static Contact get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Contact(name, id, options);
    }
}
