// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The EventHub consumer group name.
 * 
 */
public final class EventHubConsumerGroupNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventHubConsumerGroupNameArgs Empty = new EventHubConsumerGroupNameArgs();

    /**
     * EventHub consumer group name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return EventHub consumer group name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private EventHubConsumerGroupNameArgs() {}

    private EventHubConsumerGroupNameArgs(EventHubConsumerGroupNameArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubConsumerGroupNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubConsumerGroupNameArgs $;

        public Builder() {
            $ = new EventHubConsumerGroupNameArgs();
        }

        public Builder(EventHubConsumerGroupNameArgs defaults) {
            $ = new EventHubConsumerGroupNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name EventHub consumer group name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name EventHub consumer group name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EventHubConsumerGroupNameArgs build() {
            return $;
        }
    }

}
