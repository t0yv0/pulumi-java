// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudtrail.EventDataStoreArgs;
import com.pulumi.aws.cloudtrail.inputs.EventDataStoreState;
import com.pulumi.aws.cloudtrail.outputs.EventDataStoreAdvancedEventSelector;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CloudTrail Event Data Store.
 * 
 * More information about event data stores can be found in the [Event Data Store User Guide](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html).
 * 
 * &gt; **Tip:** For an organization event data store you must create this resource in the management account.
 * 
 * ## Example Usage
 * ### Basic
 * 
 * The most simple event data store configuration requires us to only set the `name` and `retention_period` attributes. The event data store will automatically capture all management events. To capture management events from all the regions, `multi_region_enabled` must be `true`.
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
 *         var example = new EventDataStore(&#34;example&#34;, EventDataStoreArgs.builder()        
 *             .retentionPeriod(7)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Data Event Logging
 * 
 * CloudTrail can log [Data Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html) for certain services such as S3 bucket objects and Lambda function invocations. Additional information about data event configuration can be found in the following links:
 * 
 * - [CloudTrail API AdvancedFieldSelector documentation](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html)
 * ### Log all DynamoDB PutEvent actions for a specific DynamoDB table
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
 *         final var table = Output.of(DynamodbFunctions.getTable(GetTableArgs.builder()
 *             .name(&#34;not-important-dynamodb-table&#34;)
 *             .build()));
 * 
 *         var example = new EventDataStore(&#34;example&#34;, EventDataStoreArgs.builder()        
 *             .advancedEventSelectors(EventDataStoreAdvancedEventSelector.builder()
 *                 .name(&#34;Log all DynamoDB PutEvent actions for a specific DynamoDB table&#34;)
 *                 .fieldSelectors(                
 *                     EventDataStoreAdvancedEventSelectorFieldSelector.builder()
 *                         .field(&#34;eventCategory&#34;)
 *                         .equals(&#34;Data&#34;)
 *                         .build(),
 *                     EventDataStoreAdvancedEventSelectorFieldSelector.builder()
 *                         .field(&#34;resources.type&#34;)
 *                         .equals(&#34;AWS::DynamoDB::Table&#34;)
 *                         .build(),
 *                     EventDataStoreAdvancedEventSelectorFieldSelector.builder()
 *                         .field(&#34;eventName&#34;)
 *                         .equals(&#34;PutItem&#34;)
 *                         .build(),
 *                     EventDataStoreAdvancedEventSelectorFieldSelector.builder()
 *                         .field(&#34;resources.ARN&#34;)
 *                         .equals(table.apply(getTableResult -&gt; getTableResult.getArn()))
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Event data stores can be imported using their `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudtrail/eventDataStore:EventDataStore example arn:aws:cloudtrail:us-east-1:123456789123:eventdatastore/22333815-4414-412c-b155-dd254033gfhf
 * ```
 * 
 */
@ResourceType(type="aws:cloudtrail/eventDataStore:EventDataStore")
public class EventDataStore extends com.pulumi.resources.CustomResource {
    /**
     * The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * 
     */
    @Export(name="advancedEventSelectors", type=List.class, parameters={EventDataStoreAdvancedEventSelector.class})
    private Output<List<EventDataStoreAdvancedEventSelector>> advancedEventSelectors;

    /**
     * @return The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * 
     */
    public Output<List<EventDataStoreAdvancedEventSelector>> advancedEventSelectors() {
        return this.advancedEventSelectors;
    }
    /**
     * ARN of the event data store.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the event data store.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
     * 
     */
    @Export(name="multiRegionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multiRegionEnabled;

    /**
     * @return Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
     * 
     */
    public Output<Optional<Boolean>> multiRegionEnabled() {
        return Codegen.optional(this.multiRegionEnabled);
    }
    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
     * 
     */
    @Export(name="organizationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> organizationEnabled;

    /**
     * @return Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> organizationEnabled() {
        return Codegen.optional(this.organizationEnabled);
    }
    /**
     * The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
     * 
     */
    @Export(name="retentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionPeriod;

    /**
     * @return The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
     * 
     */
    public Output<Optional<Integer>> retentionPeriod() {
        return Codegen.optional(this.retentionPeriod);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
     * 
     */
    @Export(name="terminationProtectionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminationProtectionEnabled;

    /**
     * @return Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
     * 
     */
    public Output<Optional<Boolean>> terminationProtectionEnabled() {
        return Codegen.optional(this.terminationProtectionEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventDataStore(String name) {
        this(name, EventDataStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventDataStore(String name, @Nullable EventDataStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventDataStore(String name, @Nullable EventDataStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/eventDataStore:EventDataStore", name, args == null ? EventDataStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventDataStore(String name, Output<String> id, @Nullable EventDataStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/eventDataStore:EventDataStore", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventDataStore get(String name, Output<String> id, @Nullable EventDataStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventDataStore(name, id, state, options);
    }
}
