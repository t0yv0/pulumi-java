// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class SimulationApplicationTags {
    @CustomType.Constructor
    private SimulationApplicationTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public SimulationApplicationTags build() {
            return new SimulationApplicationTags();
        }
    }
}
