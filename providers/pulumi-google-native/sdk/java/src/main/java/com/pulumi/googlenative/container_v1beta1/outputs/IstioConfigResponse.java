// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IstioConfigResponse {
    /**
     * @return The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    private final String auth;
    /**
     * @return Whether Istio is enabled for this cluster.
     * 
     */
    private final Boolean disabled;

    @CustomType.Constructor
    private IstioConfigResponse(
        @CustomType.Parameter("auth") String auth,
        @CustomType.Parameter("disabled") Boolean disabled) {
        this.auth = auth;
        this.disabled = disabled;
    }

    /**
     * @return The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    public String auth() {
        return this.auth;
    }
    /**
     * @return Whether Istio is enabled for this cluster.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IstioConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String auth;
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(IstioConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder auth(String auth) {
            this.auth = Objects.requireNonNull(auth);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public IstioConfigResponse build() {
            return new IstioConfigResponse(auth, disabled);
        }
    }
}
