// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
