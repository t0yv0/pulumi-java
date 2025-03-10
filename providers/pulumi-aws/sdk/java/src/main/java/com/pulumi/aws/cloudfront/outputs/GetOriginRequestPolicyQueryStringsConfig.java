// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyQueryStringsConfigQueryString;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOriginRequestPolicyQueryStringsConfig {
    private final String queryStringBehavior;
    private final List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings;

    @CustomType.Constructor
    private GetOriginRequestPolicyQueryStringsConfig(
        @CustomType.Parameter("queryStringBehavior") String queryStringBehavior,
        @CustomType.Parameter("queryStrings") List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = queryStringBehavior;
        this.queryStrings = queryStrings;
    }

    public String queryStringBehavior() {
        return this.queryStringBehavior;
    }
    public List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings() {
        return this.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }
        public Builder queryStrings(List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public Builder queryStrings(GetOriginRequestPolicyQueryStringsConfigQueryString... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }        public GetOriginRequestPolicyQueryStringsConfig build() {
            return new GetOriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
