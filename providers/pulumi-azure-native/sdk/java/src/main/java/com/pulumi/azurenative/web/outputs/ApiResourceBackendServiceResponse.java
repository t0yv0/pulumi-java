// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiResourceBackendServiceResponse {
    /**
     * @return The service URL
     * 
     */
    private final @Nullable String serviceUrl;

    @CustomType.Constructor
    private ApiResourceBackendServiceResponse(@CustomType.Parameter("serviceUrl") @Nullable String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    /**
     * @return The service URL
     * 
     */
    public Optional<String> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceBackendServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serviceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceBackendServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceUrl = defaults.serviceUrl;
        }

        public Builder serviceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }        public ApiResourceBackendServiceResponse build() {
            return new ApiResourceBackendServiceResponse(serviceUrl);
        }
    }
}
