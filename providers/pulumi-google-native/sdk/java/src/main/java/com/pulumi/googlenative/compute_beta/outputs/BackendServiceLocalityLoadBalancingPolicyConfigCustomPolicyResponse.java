// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse {
    /**
     * @return An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
     * 
     */
    private final String data;
    /**
     * @return Identifies the custom policy. The value should match the type the custom implementation is registered with on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (e.g. myorg.CustomLbPolicy). The maximum length is 256 characters. Note that specifying the same custom policy more than once for a backend is not a valid configuration and will be rejected.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse(
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("name") String name) {
        this.data = data;
        this.name = name;
    }

    /**
     * @return An optional, arbitrary JSON object with configuration data, understood by a locally installed custom policy implementation.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return Identifies the custom policy. The value should match the type the custom implementation is registered with on the gRPC clients. It should follow protocol buffer message naming conventions and include the full path (e.g. myorg.CustomLbPolicy). The maximum length is 256 characters. Note that specifying the same custom policy more than once for a backend is not a valid configuration and will be rejected.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse build() {
            return new BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse(data, name);
        }
    }
}
