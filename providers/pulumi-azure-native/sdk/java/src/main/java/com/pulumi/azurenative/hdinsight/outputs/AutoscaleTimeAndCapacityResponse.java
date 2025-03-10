// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleTimeAndCapacityResponse {
    /**
     * @return The maximum instance count of the cluster
     * 
     */
    private final @Nullable Integer maxInstanceCount;
    /**
     * @return The minimum instance count of the cluster
     * 
     */
    private final @Nullable Integer minInstanceCount;
    /**
     * @return 24-hour time in the form xx:xx
     * 
     */
    private final @Nullable String time;

    @CustomType.Constructor
    private AutoscaleTimeAndCapacityResponse(
        @CustomType.Parameter("maxInstanceCount") @Nullable Integer maxInstanceCount,
        @CustomType.Parameter("minInstanceCount") @Nullable Integer minInstanceCount,
        @CustomType.Parameter("time") @Nullable String time) {
        this.maxInstanceCount = maxInstanceCount;
        this.minInstanceCount = minInstanceCount;
        this.time = time;
    }

    /**
     * @return The maximum instance count of the cluster
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * @return The minimum instance count of the cluster
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }
    /**
     * @return 24-hour time in the form xx:xx
     * 
     */
    public Optional<String> time() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleTimeAndCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleTimeAndCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.time = defaults.time;
        }

        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }
        public Builder time(@Nullable String time) {
            this.time = time;
            return this;
        }        public AutoscaleTimeAndCapacityResponse build() {
            return new AutoscaleTimeAndCapacityResponse(maxInstanceCount, minInstanceCount, time);
        }
    }
}
