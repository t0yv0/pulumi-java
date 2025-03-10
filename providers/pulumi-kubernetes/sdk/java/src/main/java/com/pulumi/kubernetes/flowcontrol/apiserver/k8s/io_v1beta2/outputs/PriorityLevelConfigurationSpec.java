// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.LimitedPriorityLevelConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PriorityLevelConfigurationSpec {
    /**
     * @return `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `&#34;Limited&#34;`.
     * 
     */
    private final @Nullable LimitedPriorityLevelConfiguration limited;
    /**
     * @return `type` indicates whether this priority level is subject to limitation on request execution.  A value of `&#34;Exempt&#34;` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `&#34;Limited&#34;` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PriorityLevelConfigurationSpec(
        @CustomType.Parameter("limited") @Nullable LimitedPriorityLevelConfiguration limited,
        @CustomType.Parameter("type") String type) {
        this.limited = limited;
        this.type = type;
    }

    /**
     * @return `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `&#34;Limited&#34;`.
     * 
     */
    public Optional<LimitedPriorityLevelConfiguration> limited() {
        return Optional.ofNullable(this.limited);
    }
    /**
     * @return `type` indicates whether this priority level is subject to limitation on request execution.  A value of `&#34;Exempt&#34;` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `&#34;Limited&#34;` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LimitedPriorityLevelConfiguration limited;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limited = defaults.limited;
    	      this.type = defaults.type;
        }

        public Builder limited(@Nullable LimitedPriorityLevelConfiguration limited) {
            this.limited = limited;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PriorityLevelConfigurationSpec build() {
            return new PriorityLevelConfigurationSpec(limited, type);
        }
    }
}
