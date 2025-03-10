// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.PubSubArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NotificationConfig is the configuration of notifications.
 * 
 */
public final class NotificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    /**
     * Notification config for Pub/Sub.
     * 
     */
    @Import(name="pubsub")
    private @Nullable Output<PubSubArgs> pubsub;

    /**
     * @return Notification config for Pub/Sub.
     * 
     */
    public Optional<Output<PubSubArgs>> pubsub() {
        return Optional.ofNullable(this.pubsub);
    }

    private NotificationConfigArgs() {}

    private NotificationConfigArgs(NotificationConfigArgs $) {
        this.pubsub = $.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationConfigArgs $;

        public Builder() {
            $ = new NotificationConfigArgs();
        }

        public Builder(NotificationConfigArgs defaults) {
            $ = new NotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pubsub Notification config for Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder pubsub(@Nullable Output<PubSubArgs> pubsub) {
            $.pubsub = pubsub;
            return this;
        }

        /**
         * @param pubsub Notification config for Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder pubsub(PubSubArgs pubsub) {
            return pubsub(Output.of(pubsub));
        }

        public NotificationConfigArgs build() {
            return $;
        }
    }

}
