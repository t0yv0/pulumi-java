// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TimeoutConfigProperties {
    private final Integer inProgressTimeoutInMinutes;

    @CustomType.Constructor
    private TimeoutConfigProperties(@CustomType.Parameter("inProgressTimeoutInMinutes") Integer inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
    }

    public Integer inProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeoutConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer inProgressTimeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeoutConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inProgressTimeoutInMinutes = defaults.inProgressTimeoutInMinutes;
        }

        public Builder inProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = Objects.requireNonNull(inProgressTimeoutInMinutes);
            return this;
        }        public TimeoutConfigProperties build() {
            return new TimeoutConfigProperties(inProgressTimeoutInMinutes);
        }
    }
}
