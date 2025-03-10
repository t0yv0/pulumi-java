// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.outputs;

import com.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyCookiesConfig;
import com.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyHeadersConfig;
import com.pulumi.awsnative.cloudfront.outputs.OriginRequestPolicyQueryStringsConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginRequestPolicyConfig {
    private final @Nullable String comment;
    private final OriginRequestPolicyCookiesConfig cookiesConfig;
    private final OriginRequestPolicyHeadersConfig headersConfig;
    private final String name;
    private final OriginRequestPolicyQueryStringsConfig queryStringsConfig;

    @CustomType.Constructor
    private OriginRequestPolicyConfig(
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("cookiesConfig") OriginRequestPolicyCookiesConfig cookiesConfig,
        @CustomType.Parameter("headersConfig") OriginRequestPolicyHeadersConfig headersConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("queryStringsConfig") OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
        this.comment = comment;
        this.cookiesConfig = cookiesConfig;
        this.headersConfig = headersConfig;
        this.name = name;
        this.queryStringsConfig = queryStringsConfig;
    }

    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public OriginRequestPolicyCookiesConfig cookiesConfig() {
        return this.cookiesConfig;
    }
    public OriginRequestPolicyHeadersConfig headersConfig() {
        return this.headersConfig;
    }
    public String name() {
        return this.name;
    }
    public OriginRequestPolicyQueryStringsConfig queryStringsConfig() {
        return this.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private OriginRequestPolicyCookiesConfig cookiesConfig;
        private OriginRequestPolicyHeadersConfig headersConfig;
        private String name;
        private OriginRequestPolicyQueryStringsConfig queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.headersConfig = defaults.headersConfig;
    	      this.name = defaults.name;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder cookiesConfig(OriginRequestPolicyCookiesConfig cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }
        public Builder headersConfig(OriginRequestPolicyHeadersConfig headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder queryStringsConfig(OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }        public OriginRequestPolicyConfig build() {
            return new OriginRequestPolicyConfig(comment, cookiesConfig, headersConfig, name, queryStringsConfig);
        }
    }
}
