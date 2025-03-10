// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.HttpHeaderMatchResponse;
import com.pulumi.googlenative.compute_alpha.outputs.HttpQueryParameterMatchResponse;
import com.pulumi.googlenative.compute_alpha.outputs.MetadataFilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpRouteRuleMatchResponse {
    /**
     * @return For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    private final String fullPathMatch;
    /**
     * @return Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * 
     */
    private final List<HttpHeaderMatchResponse> headerMatches;
    /**
     * @return Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final Boolean ignoreCase;
    /**
     * @return Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final List<MetadataFilterResponse> metadataFilters;
    /**
     * @return For satisfying the matchRule condition, the request&#39;s path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    private final String prefixMatch;
    /**
     * @return Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final List<HttpQueryParameterMatchResponse> queryParameterMatches;
    /**
     * @return For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final String regexMatch;

    @CustomType.Constructor
    private HttpRouteRuleMatchResponse(
        @CustomType.Parameter("fullPathMatch") String fullPathMatch,
        @CustomType.Parameter("headerMatches") List<HttpHeaderMatchResponse> headerMatches,
        @CustomType.Parameter("ignoreCase") Boolean ignoreCase,
        @CustomType.Parameter("metadataFilters") List<MetadataFilterResponse> metadataFilters,
        @CustomType.Parameter("prefixMatch") String prefixMatch,
        @CustomType.Parameter("queryParameterMatches") List<HttpQueryParameterMatchResponse> queryParameterMatches,
        @CustomType.Parameter("regexMatch") String regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    /**
     * @return For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    public String fullPathMatch() {
        return this.fullPathMatch;
    }
    /**
     * @return Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * 
     */
    public List<HttpHeaderMatchResponse> headerMatches() {
        return this.headerMatches;
    }
    /**
     * @return Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public Boolean ignoreCase() {
        return this.ignoreCase;
    }
    /**
     * @return Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public List<MetadataFilterResponse> metadataFilters() {
        return this.metadataFilters;
    }
    /**
     * @return For satisfying the matchRule condition, the request&#39;s path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    public String prefixMatch() {
        return this.prefixMatch;
    }
    /**
     * @return Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public List<HttpQueryParameterMatchResponse> queryParameterMatches() {
        return this.queryParameterMatches;
    }
    /**
     * @return For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullPathMatch;
        private List<HttpHeaderMatchResponse> headerMatches;
        private Boolean ignoreCase;
        private List<MetadataFilterResponse> metadataFilters;
        private String prefixMatch;
        private List<HttpQueryParameterMatchResponse> queryParameterMatches;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(String fullPathMatch) {
            this.fullPathMatch = Objects.requireNonNull(fullPathMatch);
            return this;
        }
        public Builder headerMatches(List<HttpHeaderMatchResponse> headerMatches) {
            this.headerMatches = Objects.requireNonNull(headerMatches);
            return this;
        }
        public Builder headerMatches(HttpHeaderMatchResponse... headerMatches) {
            return headerMatches(List.of(headerMatches));
        }
        public Builder ignoreCase(Boolean ignoreCase) {
            this.ignoreCase = Objects.requireNonNull(ignoreCase);
            return this;
        }
        public Builder metadataFilters(List<MetadataFilterResponse> metadataFilters) {
            this.metadataFilters = Objects.requireNonNull(metadataFilters);
            return this;
        }
        public Builder metadataFilters(MetadataFilterResponse... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
        }
        public Builder prefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }
        public Builder queryParameterMatches(List<HttpQueryParameterMatchResponse> queryParameterMatches) {
            this.queryParameterMatches = Objects.requireNonNull(queryParameterMatches);
            return this;
        }
        public Builder queryParameterMatches(HttpQueryParameterMatchResponse... queryParameterMatches) {
            return queryParameterMatches(List.of(queryParameterMatches));
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }        public HttpRouteRuleMatchResponse build() {
            return new HttpRouteRuleMatchResponse(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
