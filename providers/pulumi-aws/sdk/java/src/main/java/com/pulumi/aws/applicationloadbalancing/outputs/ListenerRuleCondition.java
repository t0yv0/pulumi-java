// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionHostHeader;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionHttpHeader;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionHttpRequestMethod;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionPathPattern;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionQueryString;
import com.pulumi.aws.applicationloadbalancing.outputs.ListenerRuleConditionSourceIp;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleCondition {
    /**
     * @return Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    private final @Nullable ListenerRuleConditionHostHeader hostHeader;
    /**
     * @return HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    private final @Nullable ListenerRuleConditionHttpHeader httpHeader;
    /**
     * @return Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    private final @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod;
    /**
     * @return Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    private final @Nullable ListenerRuleConditionPathPattern pathPattern;
    /**
     * @return Query strings to match. Query String block fields documented below.
     * 
     */
    private final @Nullable List<ListenerRuleConditionQueryString> queryStrings;
    /**
     * @return Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    private final @Nullable ListenerRuleConditionSourceIp sourceIp;

    @CustomType.Constructor
    private ListenerRuleCondition(
        @CustomType.Parameter("hostHeader") @Nullable ListenerRuleConditionHostHeader hostHeader,
        @CustomType.Parameter("httpHeader") @Nullable ListenerRuleConditionHttpHeader httpHeader,
        @CustomType.Parameter("httpRequestMethod") @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod,
        @CustomType.Parameter("pathPattern") @Nullable ListenerRuleConditionPathPattern pathPattern,
        @CustomType.Parameter("queryStrings") @Nullable List<ListenerRuleConditionQueryString> queryStrings,
        @CustomType.Parameter("sourceIp") @Nullable ListenerRuleConditionSourceIp sourceIp) {
        this.hostHeader = hostHeader;
        this.httpHeader = httpHeader;
        this.httpRequestMethod = httpRequestMethod;
        this.pathPattern = pathPattern;
        this.queryStrings = queryStrings;
        this.sourceIp = sourceIp;
    }

    /**
     * @return Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    public Optional<ListenerRuleConditionHostHeader> hostHeader() {
        return Optional.ofNullable(this.hostHeader);
    }
    /**
     * @return HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    public Optional<ListenerRuleConditionHttpHeader> httpHeader() {
        return Optional.ofNullable(this.httpHeader);
    }
    /**
     * @return Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    public Optional<ListenerRuleConditionHttpRequestMethod> httpRequestMethod() {
        return Optional.ofNullable(this.httpRequestMethod);
    }
    /**
     * @return Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    public Optional<ListenerRuleConditionPathPattern> pathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }
    /**
     * @return Query strings to match. Query String block fields documented below.
     * 
     */
    public List<ListenerRuleConditionQueryString> queryStrings() {
        return this.queryStrings == null ? List.of() : this.queryStrings;
    }
    /**
     * @return Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    public Optional<ListenerRuleConditionSourceIp> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleConditionHostHeader hostHeader;
        private @Nullable ListenerRuleConditionHttpHeader httpHeader;
        private @Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod;
        private @Nullable ListenerRuleConditionPathPattern pathPattern;
        private @Nullable List<ListenerRuleConditionQueryString> queryStrings;
        private @Nullable ListenerRuleConditionSourceIp sourceIp;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostHeader = defaults.hostHeader;
    	      this.httpHeader = defaults.httpHeader;
    	      this.httpRequestMethod = defaults.httpRequestMethod;
    	      this.pathPattern = defaults.pathPattern;
    	      this.queryStrings = defaults.queryStrings;
    	      this.sourceIp = defaults.sourceIp;
        }

        public Builder hostHeader(@Nullable ListenerRuleConditionHostHeader hostHeader) {
            this.hostHeader = hostHeader;
            return this;
        }
        public Builder httpHeader(@Nullable ListenerRuleConditionHttpHeader httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }
        public Builder httpRequestMethod(@Nullable ListenerRuleConditionHttpRequestMethod httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }
        public Builder pathPattern(@Nullable ListenerRuleConditionPathPattern pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }
        public Builder queryStrings(@Nullable List<ListenerRuleConditionQueryString> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public Builder queryStrings(ListenerRuleConditionQueryString... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }
        public Builder sourceIp(@Nullable ListenerRuleConditionSourceIp sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }        public ListenerRuleCondition build() {
            return new ListenerRuleCondition(hostHeader, httpHeader, httpRequestMethod, pathPattern, queryStrings, sourceIp);
        }
    }
}
