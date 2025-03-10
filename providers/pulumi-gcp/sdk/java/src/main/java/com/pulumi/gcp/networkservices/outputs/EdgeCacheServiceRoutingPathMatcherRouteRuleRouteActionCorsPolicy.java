// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy {
    /**
     * @return In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * @return Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    private final @Nullable List<String> allowHeaders;
    /**
     * @return Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    private final @Nullable List<String> allowMethods;
    /**
     * @return Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    private final @Nullable List<String> allowOrigins;
    /**
     * @return If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * @return Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * @return Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private final String maxAge;

    @CustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy(
        @CustomType.Parameter("allowCredentials") @Nullable Boolean allowCredentials,
        @CustomType.Parameter("allowHeaders") @Nullable List<String> allowHeaders,
        @CustomType.Parameter("allowMethods") @Nullable List<String> allowMethods,
        @CustomType.Parameter("allowOrigins") @Nullable List<String> allowOrigins,
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("exposeHeaders") @Nullable List<String> exposeHeaders,
        @CustomType.Parameter("maxAge") String maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    /**
     * @return In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * @return Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    public List<String> allowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * @return Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    public List<String> allowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * @return Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    public List<String> allowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * @return If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * @return Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public String maxAge() {
        return this.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOrigins;
        private @Nullable Boolean disabled;
        private @Nullable List<String> exposeHeaders;
        private String maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        public Builder maxAge(String maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy(allowCredentials, allowHeaders, allowMethods, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
