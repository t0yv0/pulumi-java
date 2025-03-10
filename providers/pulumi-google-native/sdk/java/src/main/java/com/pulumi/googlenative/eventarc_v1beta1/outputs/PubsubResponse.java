// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PubsubResponse {
    /**
     * @return The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    private final String subscription;
    /**
     * @return Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private PubsubResponse(
        @CustomType.Parameter("subscription") String subscription,
        @CustomType.Parameter("topic") String topic) {
        this.subscription = subscription;
        this.topic = topic;
    }

    /**
     * @return The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    public String subscription() {
        return this.subscription;
    }
    /**
     * @return Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder subscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public PubsubResponse build() {
            return new PubsubResponse(subscription, topic);
        }
    }
}
