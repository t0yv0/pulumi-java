// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateConnectivityResponse {
    private final String privateConnectionName;

    @CustomType.Constructor
    private PrivateConnectivityResponse(@CustomType.Parameter("privateConnectionName") String privateConnectionName) {
        this.privateConnectionName = privateConnectionName;
    }

    public String privateConnectionName() {
        return this.privateConnectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateConnectionName = defaults.privateConnectionName;
        }

        public Builder privateConnectionName(String privateConnectionName) {
            this.privateConnectionName = Objects.requireNonNull(privateConnectionName);
            return this;
        }        public PrivateConnectivityResponse build() {
            return new PrivateConnectivityResponse(privateConnectionName);
        }
    }
}
