// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v2beta.enums.EventTriggerRetryPolicy;
import com.pulumi.googlenative.cloudfunctions_v2beta.inputs.EventFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes EventTrigger, used to request events to be sent from another service.
 * 
 */
public final class EventTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTriggerArgs Empty = new EventTriggerArgs();

    /**
     * Criteria used to filter events.
     * 
     */
    @Import(name="eventFilters")
    private @Nullable Output<List<EventFilterArgs>> eventFilters;

    /**
     * @return Criteria used to filter events.
     * 
     */
    public Optional<Output<List<EventFilterArgs>>> eventFilters() {
        return Optional.ofNullable(this.eventFilters);
    }

    /**
     * The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
     * 
     */
    @Import(name="eventType", required=true)
    private Output<String> eventType;

    /**
     * @return The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
     * 
     */
    public Output<String> eventType() {
        return this.eventType;
    }

    /**
     * Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
     * 
     */
    @Import(name="pubsubTopic")
    private @Nullable Output<String> pubsubTopic;

    /**
     * @return Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
     * 
     */
    public Optional<Output<String>> pubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }

    /**
     * Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<EventTriggerRetryPolicy> retryPolicy;

    /**
     * @return Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
     * 
     */
    public Optional<Output<EventTriggerRetryPolicy>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
     * 
     */
    @Import(name="triggerRegion")
    private @Nullable Output<String> triggerRegion;

    /**
     * @return The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
     * 
     */
    public Optional<Output<String>> triggerRegion() {
        return Optional.ofNullable(this.triggerRegion);
    }

    private EventTriggerArgs() {}

    private EventTriggerArgs(EventTriggerArgs $) {
        this.eventFilters = $.eventFilters;
        this.eventType = $.eventType;
        this.pubsubTopic = $.pubsubTopic;
        this.retryPolicy = $.retryPolicy;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.triggerRegion = $.triggerRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTriggerArgs $;

        public Builder() {
            $ = new EventTriggerArgs();
        }

        public Builder(EventTriggerArgs defaults) {
            $ = new EventTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventFilters Criteria used to filter events.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(@Nullable Output<List<EventFilterArgs>> eventFilters) {
            $.eventFilters = eventFilters;
            return this;
        }

        /**
         * @param eventFilters Criteria used to filter events.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(List<EventFilterArgs> eventFilters) {
            return eventFilters(Output.of(eventFilters));
        }

        /**
         * @param eventFilters Criteria used to filter events.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(EventFilterArgs... eventFilters) {
            return eventFilters(List.of(eventFilters));
        }

        /**
         * @param eventType The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
         * 
         * @return builder
         * 
         */
        public Builder eventType(Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
         * 
         * @return builder
         * 
         */
        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param pubsubTopic Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project}/topics/{topic}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        /**
         * @param retryPolicy Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<EventTriggerRetryPolicy> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(EventTriggerRetryPolicy retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param serviceAccountEmail Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Optional. The email of the trigger&#39;s service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number}-compute@developer.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param triggerRegion The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
         * 
         * @return builder
         * 
         */
        public Builder triggerRegion(@Nullable Output<String> triggerRegion) {
            $.triggerRegion = triggerRegion;
            return this;
        }

        /**
         * @param triggerRegion The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
         * 
         * @return builder
         * 
         */
        public Builder triggerRegion(String triggerRegion) {
            return triggerRegion(Output.of(triggerRegion));
        }

        public EventTriggerArgs build() {
            $.eventType = Objects.requireNonNull($.eventType, "expected parameter 'eventType' to be non-null");
            return $;
        }
    }

}
