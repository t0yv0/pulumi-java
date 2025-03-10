// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class StaticIpConnectivityResponse {
    @CustomType.Constructor
    private StaticIpConnectivityResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public StaticIpConnectivityResponse build() {
            return new StaticIpConnectivityResponse();
        }
    }
}
