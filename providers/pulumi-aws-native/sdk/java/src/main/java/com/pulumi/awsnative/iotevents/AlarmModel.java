// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotevents.AlarmModelArgs;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmCapabilities;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmEventActions;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmRule;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::IoTEvents::AlarmModel resource creates a alarm model. AWS IoT Events alarms help you monitor your data for changes. The data can be metrics that you measure for your equipment and processes. You can create alarms that send notifications when a threshold is breached. Alarms help you detect issues, streamline maintenance, and optimize performance of your equipment and processes.
 * 
 * Alarms are instances of alarm models. The alarm model specifies what to detect, when to send notifications, who gets notified, and more. You can also specify one or more supported actions that occur when the alarm state changes. AWS IoT Events routes input attributes derived from your data to the appropriate alarms. If the data that you&#39;re monitoring is outside the specified range, the alarm is invoked. You can also acknowledge the alarms or set them to the snooze mode.
 * 
 */
@ResourceType(type="aws-native:iotevents:AlarmModel")
public class AlarmModel extends com.pulumi.resources.CustomResource {
    @Export(name="alarmCapabilities", type=AlarmModelAlarmCapabilities.class, parameters={})
    private Output</* @Nullable */ AlarmModelAlarmCapabilities> alarmCapabilities;

    public Output<Optional<AlarmModelAlarmCapabilities>> alarmCapabilities() {
        return Codegen.optional(this.alarmCapabilities);
    }
    @Export(name="alarmEventActions", type=AlarmModelAlarmEventActions.class, parameters={})
    private Output</* @Nullable */ AlarmModelAlarmEventActions> alarmEventActions;

    public Output<Optional<AlarmModelAlarmEventActions>> alarmEventActions() {
        return Codegen.optional(this.alarmEventActions);
    }
    /**
     * A brief description of the alarm model.
     * 
     */
    @Export(name="alarmModelDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alarmModelDescription;

    /**
     * @return A brief description of the alarm model.
     * 
     */
    public Output<Optional<String>> alarmModelDescription() {
        return Codegen.optional(this.alarmModelDescription);
    }
    /**
     * The name of the alarm model.
     * 
     */
    @Export(name="alarmModelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alarmModelName;

    /**
     * @return The name of the alarm model.
     * 
     */
    public Output<Optional<String>> alarmModelName() {
        return Codegen.optional(this.alarmModelName);
    }
    @Export(name="alarmRule", type=AlarmModelAlarmRule.class, parameters={})
    private Output<AlarmModelAlarmRule> alarmRule;

    public Output<AlarmModelAlarmRule> alarmRule() {
        return this.alarmRule;
    }
    /**
     * The value used to identify a alarm instance. When a device or system sends input, a new alarm instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding alarm instance based on this identifying information.
     * 
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct alarm instance, the device must send a message payload that contains the same attribute-value.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output</* @Nullable */ String> key;

    /**
     * @return The value used to identify a alarm instance. When a device or system sends input, a new alarm instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding alarm instance based on this identifying information.
     * 
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct alarm instance, the device must send a message payload that contains the same attribute-value.
     * 
     */
    public Output<Optional<String>> key() {
        return Codegen.optional(this.key);
    }
    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A non-negative integer that reflects the severity level of the alarm.
     * 
     */
    @Export(name="severity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> severity;

    /**
     * @return A non-negative integer that reflects the severity level of the alarm.
     * 
     */
    public Output<Optional<Integer>> severity() {
        return Codegen.optional(this.severity);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    @Export(name="tags", type=List.class, parameters={AlarmModelTag.class})
    private Output</* @Nullable */ List<AlarmModelTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public Output<Optional<List<AlarmModelTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlarmModel(String name) {
        this(name, AlarmModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlarmModel(String name, AlarmModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlarmModel(String name, AlarmModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:AlarmModel", name, args == null ? AlarmModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlarmModel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:AlarmModel", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AlarmModel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlarmModel(name, id, options);
    }
}
