// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiConnectionTestLinkResponse {
    /**
     * @return HTTP Method
     * 
     */
    private final @Nullable String method;
    /**
     * @return Test link request URI
     * 
     */
    private final @Nullable String requestUri;

    @CustomType.Constructor
    private ApiConnectionTestLinkResponse(
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("requestUri") @Nullable String requestUri) {
        this.method = method;
        this.requestUri = requestUri;
    }

    /**
     * @return HTTP Method
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Test link request URI
     * 
     */
    public Optional<String> requestUri() {
        return Optional.ofNullable(this.requestUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConnectionTestLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String requestUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConnectionTestLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
        }

        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder requestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }        public ApiConnectionTestLinkResponse build() {
            return new ApiConnectionTestLinkResponse(method, requestUri);
        }
    }
}
