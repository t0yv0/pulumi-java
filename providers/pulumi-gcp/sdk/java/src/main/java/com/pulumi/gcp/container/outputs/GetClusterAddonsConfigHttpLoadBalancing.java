// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterAddonsConfigHttpLoadBalancing {
    private final Boolean disabled;

    @CustomType.Constructor
    private GetClusterAddonsConfigHttpLoadBalancing(@CustomType.Parameter("disabled") Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigHttpLoadBalancing defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigHttpLoadBalancing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public GetClusterAddonsConfigHttpLoadBalancing build() {
            return new GetClusterAddonsConfigHttpLoadBalancing(disabled);
        }
    }
}
