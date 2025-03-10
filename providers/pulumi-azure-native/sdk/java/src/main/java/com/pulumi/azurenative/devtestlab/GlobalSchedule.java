// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.devtestlab.GlobalScheduleArgs;
import com.pulumi.azurenative.devtestlab.outputs.DayDetailsResponse;
import com.pulumi.azurenative.devtestlab.outputs.HourDetailsResponse;
import com.pulumi.azurenative.devtestlab.outputs.NotificationSettingsResponse;
import com.pulumi.azurenative.devtestlab.outputs.WeekDetailsResponse;
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
 * A schedule.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * ### GlobalSchedules_CreateOrUpdate
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
 *         var globalSchedule = new GlobalSchedule(&#34;globalSchedule&#34;, GlobalScheduleArgs.builder()        
 *             .name(&#34;labvmautostart&#34;)
 *             .resourceGroupName(&#34;resourceGroupName&#34;)
 *             .status(&#34;Enabled&#34;)
 *             .taskType(&#34;LabVmsStartupTask&#34;)
 *             .timeZoneId(&#34;Hawaiian Standard Time&#34;)
 *             .weeklyRecurrence(Map.ofEntries(
 *                 Map.entry(&#34;time&#34;, &#34;0700&#34;),
 *                 Map.entry(&#34;weekdays&#34;,                 
 *                     &#34;Monday&#34;,
 *                     &#34;Tuesday&#34;,
 *                     &#34;Wednesday&#34;,
 *                     &#34;Thursday&#34;,
 *                     &#34;Friday&#34;,
 *                     &#34;Saturday&#34;)
 *             ))
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
 * $ pulumi import azure-native:devtestlab:GlobalSchedule LabVmAutoStart /subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{labName}/schedules/labvmautostart 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:GlobalSchedule")
public class GlobalSchedule extends com.pulumi.resources.CustomResource {
    /**
     * The creation date of the schedule.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the schedule.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Export(name="dailyRecurrence", type=DayDetailsResponse.class, parameters={})
    private Output</* @Nullable */ DayDetailsResponse> dailyRecurrence;

    /**
     * @return If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    public Output<Optional<DayDetailsResponse>> dailyRecurrence() {
        return Codegen.optional(this.dailyRecurrence);
    }
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Export(name="hourlyRecurrence", type=HourDetailsResponse.class, parameters={})
    private Output</* @Nullable */ HourDetailsResponse> hourlyRecurrence;

    /**
     * @return If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    public Output<Optional<HourDetailsResponse>> hourlyRecurrence() {
        return Codegen.optional(this.hourlyRecurrence);
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Notification settings.
     * 
     */
    @Export(name="notificationSettings", type=NotificationSettingsResponse.class, parameters={})
    private Output</* @Nullable */ NotificationSettingsResponse> notificationSettings;

    /**
     * @return Notification settings.
     * 
     */
    public Output<Optional<NotificationSettingsResponse>> notificationSettings() {
        return Codegen.optional(this.notificationSettings);
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Export(name="targetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceId;

    /**
     * @return The resource ID to which the schedule belongs
     * 
     */
    public Output<Optional<String>> targetResourceId() {
        return Codegen.optional(this.targetResourceId);
    }
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Export(name="taskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> taskType;

    /**
     * @return The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    public Output<Optional<String>> taskType() {
        return Codegen.optional(this.taskType);
    }
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Export(name="timeZoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeZoneId;

    /**
     * @return The time zone ID (e.g. Pacific Standard time).
     * 
     */
    public Output<Optional<String>> timeZoneId() {
        return Codegen.optional(this.timeZoneId);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> uniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Export(name="weeklyRecurrence", type=WeekDetailsResponse.class, parameters={})
    private Output</* @Nullable */ WeekDetailsResponse> weeklyRecurrence;

    /**
     * @return If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    public Output<Optional<WeekDetailsResponse>> weeklyRecurrence() {
        return Codegen.optional(this.weeklyRecurrence);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalSchedule(String name) {
        this(name, GlobalScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalSchedule(String name, GlobalScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalSchedule(String name, GlobalScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:GlobalSchedule", name, args == null ? GlobalScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalSchedule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:GlobalSchedule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devtestlab/v20160515:GlobalSchedule").build()),
                Output.of(Alias.builder().type("azure-native:devtestlab/v20180915:GlobalSchedule").build())
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
    public static GlobalSchedule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalSchedule(name, id, options);
    }
}
