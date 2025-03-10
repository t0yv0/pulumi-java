// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.timeseriesinsights.IoTHubEventSourceArgs;
import com.pulumi.azurenative.timeseriesinsights.outputs.LocalTimestampResponse;
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
 * An event source that receives its data from an Azure IoTHub.
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * ### CreateEventHubEventSource
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
 *         var ioTHubEventSource = new IoTHubEventSource(&#34;ioTHubEventSource&#34;, IoTHubEventSourceArgs.builder()        
 *             .environmentName(&#34;env1&#34;)
 *             .eventSourceName(&#34;es1&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### EventSourcesCreateEventHubWithCustomEnquedTime
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
 *         var ioTHubEventSource = new IoTHubEventSource(&#34;ioTHubEventSource&#34;, IoTHubEventSourceArgs.builder()        
 *             .environmentName(&#34;env1&#34;)
 *             .eventSourceName(&#34;es1&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
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
 * $ pulumi import azure-native:timeseriesinsights:IoTHubEventSource es1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1/eventSources/es1 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:IoTHubEventSource")
public class IoTHubEventSource extends com.pulumi.resources.CustomResource {
    /**
     * The name of the iot hub&#39;s consumer group that holds the partitions from which events will be read.
     * 
     */
    @Export(name="consumerGroupName", type=String.class, parameters={})
    private Output<String> consumerGroupName;

    /**
     * @return The name of the iot hub&#39;s consumer group that holds the partitions from which events will be read.
     * 
     */
    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }
    /**
     * The time the resource was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the resource was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    @Export(name="eventSourceResourceId", type=String.class, parameters={})
    private Output<String> eventSourceResourceId;

    /**
     * @return The resource id of the event source in Azure Resource Manager.
     * 
     */
    public Output<String> eventSourceResourceId() {
        return this.eventSourceResourceId;
    }
    /**
     * The name of the iot hub.
     * 
     */
    @Export(name="iotHubName", type=String.class, parameters={})
    private Output<String> iotHubName;

    /**
     * @return The name of the iot hub.
     * 
     */
    public Output<String> iotHubName() {
        return this.iotHubName;
    }
    /**
     * The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant &#39;service connect&#39; permissions to the iot hub.
     * 
     */
    @Export(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant &#39;service connect&#39; permissions to the iot hub.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }
    /**
     * The kind of the event source.
     * Expected value is &#39;Microsoft.IoTHub&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the event source.
     * Expected value is &#39;Microsoft.IoTHub&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn&#39;t specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @Export(name="localTimestamp", type=LocalTimestampResponse.class, parameters={})
    private Output</* @Nullable */ LocalTimestampResponse> localTimestamp;

    /**
     * @return An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn&#39;t specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    public Output<Optional<LocalTimestampResponse>> localTimestamp() {
        return Codegen.optional(this.localTimestamp);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    @Export(name="time", type=String.class, parameters={})
    private Output</* @Nullable */ String> time;

    /**
     * @return ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    public Output<Optional<String>> time() {
        return Codegen.optional(this.time);
    }
    /**
     * The event property that will be used as the event source&#39;s timestamp. If a value isn&#39;t specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    @Export(name="timestampPropertyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> timestampPropertyName;

    /**
     * @return The event property that will be used as the event source&#39;s timestamp. If a value isn&#39;t specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    public Output<Optional<String>> timestampPropertyName() {
        return Codegen.optional(this.timestampPropertyName);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IoTHubEventSource(String name) {
        this(name, IoTHubEventSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IoTHubEventSource(String name, IoTHubEventSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IoTHubEventSource(String name, IoTHubEventSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:IoTHubEventSource", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private IoTHubEventSource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:IoTHubEventSource", name, null, makeResourceOptions(options, id));
    }

    private static IoTHubEventSourceArgs makeArgs(IoTHubEventSourceArgs args) {
        var builder = args == null ? IoTHubEventSourceArgs.builder() : IoTHubEventSourceArgs.builder(args);
        return builder
            .kind("Microsoft.IoTHub")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20170228preview:IoTHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20171115:IoTHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20180815preview:IoTHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20200515:IoTHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210331preview:IoTHubEventSource").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210630preview:IoTHubEventSource").build())
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
    public static IoTHubEventSource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IoTHubEventSource(name, id, options);
    }
}
