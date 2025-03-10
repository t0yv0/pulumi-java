// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AccountQueuePropertiesCorsRule {
    /**
     * @return A list of headers that are allowed to be a part of the cross-origin request.
     * 
     */
    private final List<String> allowedHeaders;
    /**
     * @return A list of HTTP methods that are allowed to be executed by the origin. Valid options are
     * `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * @return A list of origin domains that will be allowed by CORS.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * @return A list of response headers that are exposed to CORS clients.
     * 
     */
    private final List<String> exposedHeaders;
    /**
     * @return The number of seconds the client should cache a preflight response.
     * 
     */
    private final Integer maxAgeInSeconds;

    @CustomType.Constructor
    private AccountQueuePropertiesCorsRule(
        @CustomType.Parameter("allowedHeaders") List<String> allowedHeaders,
        @CustomType.Parameter("allowedMethods") List<String> allowedMethods,
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("exposedHeaders") List<String> exposedHeaders,
        @CustomType.Parameter("maxAgeInSeconds") Integer maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    /**
     * @return A list of headers that are allowed to be a part of the cross-origin request.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * @return A list of HTTP methods that are allowed to be executed by the origin. Valid options are
     * `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return A list of origin domains that will be allowed by CORS.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return A list of response headers that are exposed to CORS clients.
     * 
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }
    /**
     * @return The number of seconds the client should cache a preflight response.
     * 
     */
    public Integer maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountQueuePropertiesCorsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountQueuePropertiesCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder exposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }        public AccountQueuePropertiesCorsRule build() {
            return new AccountQueuePropertiesCorsRule(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}
