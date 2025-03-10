// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RequestMirrorPolicyResponse {
    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final String backendService;

    @CustomType.Constructor
    private RequestMirrorPolicyResponse(@CustomType.Parameter("backendService") String backendService) {
        this.backendService = backendService;
    }

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public String backendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }        public RequestMirrorPolicyResponse build() {
            return new RequestMirrorPolicyResponse(backendService);
        }
    }
}
