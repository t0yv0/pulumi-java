// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetHealthCheckLogConfig {
    private final Boolean enable;

    @CustomType.Constructor
    private GetHealthCheckLogConfig(@CustomType.Parameter("enable") Boolean enable) {
        this.enable = enable;
    }

    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }        public GetHealthCheckLogConfig build() {
            return new GetHealthCheckLogConfig(enable);
        }
    }
}
