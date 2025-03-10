// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databox.JobArgs;
import com.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxDiskJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxHeavyJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.JobDeliveryInfoResponse;
import com.pulumi.azurenative.databox.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.databox.outputs.SkuResponse;
import com.pulumi.azurenative.databox.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Job Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### JobsCreate
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;Public SDK Test&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;testing@microsoft.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;1234567890&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;1234&#34;)
 *                 )),
 *                 Map.entry(&#34;dataImportDetails&#34;, Map.of(&#34;accountDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                     Map.entry(&#34;storageAccountId&#34;, &#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourcegroups/databoxbvt/providers/Microsoft.Storage/storageAccounts/databoxbvttestaccount&#34;)
 *                 ))),
 *                 Map.entry(&#34;jobDetailsType&#34;, &#34;DataBox&#34;),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;Commercial&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;Unit 1&#34;)
 *                 ))
 *             ))
 *             .jobName(&#34;SdkJob952&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;SdkRg5154&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;DataBox&#34;))
 *             .transferType(&#34;ImportToAzure&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### JobsCreateDevicePassword
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;Public SDK Test&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;testing@microsoft.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;1234567890&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;1234&#34;)
 *                 )),
 *                 Map.entry(&#34;dataImportDetails&#34;, Map.of(&#34;accountDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                     Map.entry(&#34;sharePassword&#34;, &#34;&lt;sharePassword&gt;&#34;),
 *                     Map.entry(&#34;storageAccountId&#34;, &#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/databoxbvt1/providers/Microsoft.Storage/storageAccounts/databoxbvttestaccount2&#34;)
 *                 ))),
 *                 Map.entry(&#34;devicePassword&#34;, &#34;&lt;devicePassword&gt;&#34;),
 *                 Map.entry(&#34;jobDetailsType&#34;, &#34;DataBox&#34;),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;Commercial&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;Unit 1&#34;)
 *                 ))
 *             ))
 *             .jobName(&#34;SdkJob9640&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;SdkRg7478&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;DataBox&#34;))
 *             .transferType(&#34;ImportToAzure&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### JobsCreateDoubleEncryption
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;Public SDK Test&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;testing@microsoft.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;1234567890&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;1234&#34;)
 *                 )),
 *                 Map.entry(&#34;dataImportDetails&#34;, Map.of(&#34;accountDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                     Map.entry(&#34;storageAccountId&#34;, &#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourcegroups/databoxbvt/providers/Microsoft.Storage/storageAccounts/databoxbvttestaccount&#34;)
 *                 ))),
 *                 Map.entry(&#34;jobDetailsType&#34;, &#34;DataBox&#34;),
 *                 Map.entry(&#34;preferences&#34;, Map.of(&#34;encryptionPreferences&#34;, Map.of(&#34;doubleEncryption&#34;, &#34;Enabled&#34;))),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;Commercial&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;Unit 1&#34;)
 *                 ))
 *             ))
 *             .jobName(&#34;SdkJob6599&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;SdkRg608&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;DataBox&#34;))
 *             .transferType(&#34;ImportToAzure&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### JobsCreateExport
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;Public SDK Test&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;testing@microsoft.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;1234567890&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;1234&#34;)
 *                 )),
 *                 Map.entry(&#34;dataExportDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;accountDetails&#34;, Map.ofEntries(
 *                         Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                         Map.entry(&#34;storageAccountId&#34;, &#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/akvenkat/providers/Microsoft.Storage/storageAccounts/aaaaaa2&#34;)
 *                     )),
 *                     Map.entry(&#34;transferConfiguration&#34;, Map.ofEntries(
 *                         Map.entry(&#34;transferAllDetails&#34;, Map.of(&#34;include&#34;, Map.ofEntries(
 *                             Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                             Map.entry(&#34;transferAllBlobs&#34;, true),
 *                             Map.entry(&#34;transferAllFiles&#34;, true)
 *                         ))),
 *                         Map.entry(&#34;transferConfigurationType&#34;, &#34;TransferAll&#34;)
 *                     ))
 *                 )),
 *                 Map.entry(&#34;jobDetailsType&#34;, &#34;DataBox&#34;),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;Commercial&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;Unit 1&#34;)
 *                 ))
 *             ))
 *             .jobName(&#34;SdkJob6429&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;SdkRg8091&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;DataBox&#34;))
 *             .transferType(&#34;ExportFromAzure&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### JobsCreateWithUserAssignedIdentity
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;contactDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;contactName&#34;, &#34;Public SDK Test&#34;),
 *                     Map.entry(&#34;emailList&#34;, &#34;testing@microsoft.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;1234567890&#34;),
 *                     Map.entry(&#34;phoneExtension&#34;, &#34;1234&#34;)
 *                 )),
 *                 Map.entry(&#34;dataImportDetails&#34;, Map.of(&#34;accountDetails&#34;, Map.ofEntries(
 *                     Map.entry(&#34;dataAccountType&#34;, &#34;StorageAccount&#34;),
 *                     Map.entry(&#34;storageAccountId&#34;, &#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/databoxbvt1/providers/Microsoft.Storage/storageAccounts/databoxbvttestaccount2&#34;)
 *                 ))),
 *                 Map.entry(&#34;jobDetailsType&#34;, &#34;DataBox&#34;),
 *                 Map.entry(&#34;shippingAddress&#34;, Map.ofEntries(
 *                     Map.entry(&#34;addressType&#34;, &#34;Commercial&#34;),
 *                     Map.entry(&#34;city&#34;, &#34;San Francisco&#34;),
 *                     Map.entry(&#34;companyName&#34;, &#34;Microsoft&#34;),
 *                     Map.entry(&#34;country&#34;, &#34;US&#34;),
 *                     Map.entry(&#34;postalCode&#34;, &#34;94107&#34;),
 *                     Map.entry(&#34;stateOrProvince&#34;, &#34;CA&#34;),
 *                     Map.entry(&#34;streetAddress1&#34;, &#34;16 TOWNSEND ST&#34;),
 *                     Map.entry(&#34;streetAddress2&#34;, &#34;Unit 1&#34;)
 *                 ))
 *             ))
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/akvenkat/providers/Microsoft.ManagedIdentity/userAssignedIdentities/sdkIdentity&#34;, ))
 *             ))
 *             .jobName(&#34;SdkJob5337&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;SdkRg7552&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;DataBox&#34;))
 *             .transferType(&#34;ImportToAzure&#34;)
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
 * $ pulumi import azure-native:databox:Job SdkJob5337 /subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/SdkRg7552/providers/Microsoft.DataBox/jobs/SdkJob5337 
 * ```
 * 
 */
@ResourceType(type="azure-native:databox:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * Reason for cancellation.
     * 
     */
    @Export(name="cancellationReason", type=String.class, parameters={})
    private Output<String> cancellationReason;

    /**
     * @return Reason for cancellation.
     * 
     */
    public Output<String> cancellationReason() {
        return this.cancellationReason;
    }
    /**
     * Delivery Info of Job.
     * 
     */
    @Export(name="deliveryInfo", type=JobDeliveryInfoResponse.class, parameters={})
    private Output</* @Nullable */ JobDeliveryInfoResponse> deliveryInfo;

    /**
     * @return Delivery Info of Job.
     * 
     */
    public Output<Optional<JobDeliveryInfoResponse>> deliveryInfo() {
        return Codegen.optional(this.deliveryInfo);
    }
    /**
     * Delivery type of Job.
     * 
     */
    @Export(name="deliveryType", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryType;

    /**
     * @return Delivery type of Job.
     * 
     */
    public Output<Optional<String>> deliveryType() {
        return Codegen.optional(this.deliveryType);
    }
    /**
     * Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    @Export(name="details", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> details;

    /**
     * @return Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    public Output<Optional<Object>> details() {
        return Codegen.optional(this.details);
    }
    /**
     * Top level error for the job.
     * 
     */
    @Export(name="error", type=CloudErrorResponse.class, parameters={})
    private Output<CloudErrorResponse> error;

    /**
     * @return Top level error for the job.
     * 
     */
    public Output<CloudErrorResponse> error() {
        return this.error;
    }
    /**
     * Msi identity of the resource
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return Msi identity of the resource
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Describes whether the job is cancellable or not.
     * 
     */
    @Export(name="isCancellable", type=Boolean.class, parameters={})
    private Output<Boolean> isCancellable;

    /**
     * @return Describes whether the job is cancellable or not.
     * 
     */
    public Output<Boolean> isCancellable() {
        return this.isCancellable;
    }
    /**
     * Flag to indicate cancellation of scheduled job.
     * 
     */
    @Export(name="isCancellableWithoutFee", type=Boolean.class, parameters={})
    private Output<Boolean> isCancellableWithoutFee;

    /**
     * @return Flag to indicate cancellation of scheduled job.
     * 
     */
    public Output<Boolean> isCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }
    /**
     * Describes whether the job is deletable or not.
     * 
     */
    @Export(name="isDeletable", type=Boolean.class, parameters={})
    private Output<Boolean> isDeletable;

    /**
     * @return Describes whether the job is deletable or not.
     * 
     */
    public Output<Boolean> isDeletable() {
        return this.isDeletable;
    }
    /**
     * Is Prepare To Ship Enabled on this job
     * 
     */
    @Export(name="isPrepareToShipEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPrepareToShipEnabled;

    /**
     * @return Is Prepare To Ship Enabled on this job
     * 
     */
    public Output<Boolean> isPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }
    /**
     * Describes whether the shipping address is editable or not.
     * 
     */
    @Export(name="isShippingAddressEditable", type=Boolean.class, parameters={})
    private Output<Boolean> isShippingAddressEditable;

    /**
     * @return Describes whether the shipping address is editable or not.
     * 
     */
    public Output<Boolean> isShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }
    /**
     * The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The sku type.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku type.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * Name of the stage which is in progress.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Name of the stage which is in progress.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of the data transfer.
     * 
     */
    @Export(name="transferType", type=String.class, parameters={})
    private Output<String> transferType;

    /**
     * @return Type of the data transfer.
     * 
     */
    public Output<String> transferType() {
        return this.transferType;
    }
    /**
     * Type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databox:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databox:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databox/v20180101:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20190901:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20200401:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20201101:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20210301:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20210501:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20210801preview:Job").build()),
                Output.of(Alias.builder().type("azure-native:databox/v20211201:Job").build())
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
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
