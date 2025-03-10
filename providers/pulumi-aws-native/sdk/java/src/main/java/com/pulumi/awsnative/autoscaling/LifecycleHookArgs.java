// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LifecycleHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecycleHookArgs Empty = new LifecycleHookArgs();

    /**
     * The name of the Auto Scaling group for the lifecycle hook.
     * 
     */
    @Import(name="autoScalingGroupName", required=true)
    private Output<String> autoScalingGroupName;

    /**
     * @return The name of the Auto Scaling group for the lifecycle hook.
     * 
     */
    public Output<String> autoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON (default).
     * 
     */
    @Import(name="defaultResult")
    private @Nullable Output<String> defaultResult;

    /**
     * @return The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON (default).
     * 
     */
    public Optional<Output<String>> defaultResult() {
        return Optional.ofNullable(this.defaultResult);
    }

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
     * 
     */
    @Import(name="heartbeatTimeout")
    private @Nullable Output<Integer> heartbeatTimeout;

    /**
     * @return The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
     * 
     */
    public Optional<Output<Integer>> heartbeatTimeout() {
        return Optional.ofNullable(this.heartbeatTimeout);
    }

    /**
     * The name of the lifecycle hook.
     * 
     */
    @Import(name="lifecycleHookName")
    private @Nullable Output<String> lifecycleHookName;

    /**
     * @return The name of the lifecycle hook.
     * 
     */
    public Optional<Output<String>> lifecycleHookName() {
        return Optional.ofNullable(this.lifecycleHookName);
    }

    /**
     * The instance state to which you want to attach the lifecycle hook.
     * 
     */
    @Import(name="lifecycleTransition", required=true)
    private Output<String> lifecycleTransition;

    /**
     * @return The instance state to which you want to attach the lifecycle hook.
     * 
     */
    public Output<String> lifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
     * 
     */
    @Import(name="notificationMetadata")
    private @Nullable Output<String> notificationMetadata;

    /**
     * @return Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
     * 
     */
    public Optional<Output<String>> notificationMetadata() {
        return Optional.ofNullable(this.notificationMetadata);
    }

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata.
     * 
     */
    @Import(name="notificationTargetARN")
    private @Nullable Output<String> notificationTargetARN;

    /**
     * @return The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata.
     * 
     */
    public Optional<Output<String>> notificationTargetARN() {
        return Optional.ofNullable(this.notificationTargetARN);
    }

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
     * 
     */
    @Import(name="roleARN")
    private @Nullable Output<String> roleARN;

    /**
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
     * 
     */
    public Optional<Output<String>> roleARN() {
        return Optional.ofNullable(this.roleARN);
    }

    private LifecycleHookArgs() {}

    private LifecycleHookArgs(LifecycleHookArgs $) {
        this.autoScalingGroupName = $.autoScalingGroupName;
        this.defaultResult = $.defaultResult;
        this.heartbeatTimeout = $.heartbeatTimeout;
        this.lifecycleHookName = $.lifecycleHookName;
        this.lifecycleTransition = $.lifecycleTransition;
        this.notificationMetadata = $.notificationMetadata;
        this.notificationTargetARN = $.notificationTargetARN;
        this.roleARN = $.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleHookArgs $;

        public Builder() {
            $ = new LifecycleHookArgs();
        }

        public Builder(LifecycleHookArgs defaults) {
            $ = new LifecycleHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingGroupName The name of the Auto Scaling group for the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingGroupName(Output<String> autoScalingGroupName) {
            $.autoScalingGroupName = autoScalingGroupName;
            return this;
        }

        /**
         * @param autoScalingGroupName The name of the Auto Scaling group for the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingGroupName(String autoScalingGroupName) {
            return autoScalingGroupName(Output.of(autoScalingGroupName));
        }

        /**
         * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON (default).
         * 
         * @return builder
         * 
         */
        public Builder defaultResult(@Nullable Output<String> defaultResult) {
            $.defaultResult = defaultResult;
            return this;
        }

        /**
         * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON (default).
         * 
         * @return builder
         * 
         */
        public Builder defaultResult(String defaultResult) {
            return defaultResult(Output.of(defaultResult));
        }

        /**
         * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
         * 
         * @return builder
         * 
         */
        public Builder heartbeatTimeout(@Nullable Output<Integer> heartbeatTimeout) {
            $.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
         * 
         * @return builder
         * 
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            return heartbeatTimeout(Output.of(heartbeatTimeout));
        }

        /**
         * @param lifecycleHookName The name of the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleHookName(@Nullable Output<String> lifecycleHookName) {
            $.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * @param lifecycleHookName The name of the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            return lifecycleHookName(Output.of(lifecycleHookName));
        }

        /**
         * @param lifecycleTransition The instance state to which you want to attach the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleTransition(Output<String> lifecycleTransition) {
            $.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * @param lifecycleTransition The instance state to which you want to attach the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            return lifecycleTransition(Output.of(lifecycleTransition));
        }

        /**
         * @param notificationMetadata Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
         * 
         * @return builder
         * 
         */
        public Builder notificationMetadata(@Nullable Output<String> notificationMetadata) {
            $.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * @param notificationMetadata Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
         * 
         * @return builder
         * 
         */
        public Builder notificationMetadata(String notificationMetadata) {
            return notificationMetadata(Output.of(notificationMetadata));
        }

        /**
         * @param notificationTargetARN The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargetARN(@Nullable Output<String> notificationTargetARN) {
            $.notificationTargetARN = notificationTargetARN;
            return this;
        }

        /**
         * @param notificationTargetARN The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargetARN(String notificationTargetARN) {
            return notificationTargetARN(Output.of(notificationTargetARN));
        }

        /**
         * @param roleARN The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
         * 
         * @return builder
         * 
         */
        public Builder roleARN(@Nullable Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        /**
         * @param roleARN The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
         * 
         * @return builder
         * 
         */
        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public LifecycleHookArgs build() {
            $.autoScalingGroupName = Objects.requireNonNull($.autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
            $.lifecycleTransition = Objects.requireNonNull($.lifecycleTransition, "expected parameter 'lifecycleTransition' to be non-null");
            return $;
        }
    }

}
