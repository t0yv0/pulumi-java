// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybriddata.JobDefinitionArgs;
import com.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import com.pulumi.azurenative.hybriddata.outputs.ScheduleResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Job Definition.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * ### JobDefinitions_CreateOrUpdatePUT83
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
 *         var jobDefinition = new JobDefinition(&#34;jobDefinition&#34;, JobDefinitionArgs.builder()        
 *             .dataManagerName(&#34;TestAzureSDKOperations&#34;)
 *             .dataServiceInput(Map.ofEntries(
 *                 Map.entry(&#34;AzureStorageType&#34;, &#34;Blob&#34;),
 *                 Map.entry(&#34;BackupChoice&#34;, &#34;UseExistingLatest&#34;),
 *                 Map.entry(&#34;ContainerName&#34;, &#34;containerfromtest&#34;),
 *                 Map.entry(&#34;DeviceName&#34;, &#34;8600-SHG0997877L71FC&#34;),
 *                 Map.entry(&#34;FileNameFilter&#34;, &#34;*&#34;),
 *                 Map.entry(&#34;IsDirectoryMode&#34;, false),
 *                 Map.entry(&#34;RootDirectories&#34;, &#34;\\&#34;),
 *                 Map.entry(&#34;VolumeNames&#34;, &#34;TestAutomation&#34;)
 *             ))
 *             .dataServiceName(&#34;DataTransformation&#34;)
 *             .dataSinkId(&#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStores/TestAzureStorage1&#34;)
 *             .dataSourceId(&#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStores/TestStorSimpleSource1&#34;)
 *             .jobDefinitionName(&#34;jobdeffromtestcode1&#34;)
 *             .resourceGroupName(&#34;ResourceGroupForSDKTest&#34;)
 *             .runLocation(&#34;westus&#34;)
 *             .state(&#34;Enabled&#34;)
 *             .userConfirmation(&#34;Required&#34;)
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
 * $ pulumi import azure-native:hybriddata:JobDefinition jobdeffromtestcode1 /subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataServices/DataTransformation/jobDefinitions/jobdeffromtestcode1 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybriddata:JobDefinition")
public class JobDefinition extends com.pulumi.resources.CustomResource {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @Export(name="customerSecrets", type=List.class, parameters={CustomerSecretResponse.class})
    private Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets;

    /**
     * @return List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    public Output<Optional<List<CustomerSecretResponse>>> customerSecrets() {
        return Codegen.optional(this.customerSecrets);
    }
    /**
     * A generic json used differently by each data service type.
     * 
     */
    @Export(name="dataServiceInput", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> dataServiceInput;

    /**
     * @return A generic json used differently by each data service type.
     * 
     */
    public Output<Optional<Object>> dataServiceInput() {
        return Codegen.optional(this.dataServiceInput);
    }
    /**
     * Data Sink Id associated to the job definition.
     * 
     */
    @Export(name="dataSinkId", type=String.class, parameters={})
    private Output<String> dataSinkId;

    /**
     * @return Data Sink Id associated to the job definition.
     * 
     */
    public Output<String> dataSinkId() {
        return this.dataSinkId;
    }
    /**
     * Data Source Id associated to the job definition.
     * 
     */
    @Export(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    /**
     * @return Data Source Id associated to the job definition.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Last modified time of the job definition.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Last modified time of the job definition.
     * 
     */
    public Output<Optional<String>> lastModifiedTime() {
        return Codegen.optional(this.lastModifiedTime);
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
     * This is the preferred geo location for the job to run.
     * 
     */
    @Export(name="runLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> runLocation;

    /**
     * @return This is the preferred geo location for the job to run.
     * 
     */
    public Output<Optional<String>> runLocation() {
        return Codegen.optional(this.runLocation);
    }
    /**
     * Schedule for running the job definition
     * 
     */
    @Export(name="schedules", type=List.class, parameters={ScheduleResponse.class})
    private Output</* @Nullable */ List<ScheduleResponse>> schedules;

    /**
     * @return Schedule for running the job definition
     * 
     */
    public Output<Optional<List<ScheduleResponse>>> schedules() {
        return Codegen.optional(this.schedules);
    }
    /**
     * State of the job definition.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the job definition.
     * 
     */
    public Output<String> state() {
        return this.state;
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
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    @Export(name="userConfirmation", type=String.class, parameters={})
    private Output</* @Nullable */ String> userConfirmation;

    /**
     * @return Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    public Output<Optional<String>> userConfirmation() {
        return Codegen.optional(this.userConfirmation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobDefinition(String name) {
        this(name, JobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobDefinition(String name, JobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobDefinition(String name, JobDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, args == null ? JobDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobDefinition(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybriddata/v20160601:JobDefinition").build()),
                Output.of(Alias.builder().type("azure-native:hybriddata/v20190601:JobDefinition").build())
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
    public static JobDefinition get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobDefinition(name, id, options);
    }
}
