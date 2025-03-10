// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.awsnative.appflow.enums.FlowTriggerType;
import com.pulumi.awsnative.appflow.outputs.FlowScheduledTriggerProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowTriggerConfig {
    /**
     * @return Details required based on the type of trigger
     * 
     */
    private final @Nullable FlowScheduledTriggerProperties triggerProperties;
    /**
     * @return Trigger type of the flow
     * 
     */
    private final FlowTriggerType triggerType;

    @CustomType.Constructor
    private FlowTriggerConfig(
        @CustomType.Parameter("triggerProperties") @Nullable FlowScheduledTriggerProperties triggerProperties,
        @CustomType.Parameter("triggerType") FlowTriggerType triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = triggerType;
    }

    /**
     * @return Details required based on the type of trigger
     * 
     */
    public Optional<FlowScheduledTriggerProperties> triggerProperties() {
        return Optional.ofNullable(this.triggerProperties);
    }
    /**
     * @return Trigger type of the flow
     * 
     */
    public FlowTriggerType triggerType() {
        return this.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowScheduledTriggerProperties triggerProperties;
        private FlowTriggerType triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder triggerProperties(@Nullable FlowScheduledTriggerProperties triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }
        public Builder triggerType(FlowTriggerType triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }        public FlowTriggerConfig build() {
            return new FlowTriggerConfig(triggerProperties, triggerType);
        }
    }
}
