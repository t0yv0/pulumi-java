// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpRouteQueryParameterMatchResponse {
    /**
     * @return The value of the query parameter must exactly match the contents of exact_match. Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    private final String exactMatch;
    /**
     * @return Specifies that the QueryParameterMatcher matches if request contains query parameter, irrespective of whether the parameter has a value or not. Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    private final Boolean presentMatch;
    /**
     * @return The name of the query parameter to match.
     * 
     */
    private final String queryParameter;
    /**
     * @return The value of the query parameter must match the regular expression specified by regex_match. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    private final String regexMatch;

    @CustomType.Constructor
    private HttpRouteQueryParameterMatchResponse(
        @CustomType.Parameter("exactMatch") String exactMatch,
        @CustomType.Parameter("presentMatch") Boolean presentMatch,
        @CustomType.Parameter("queryParameter") String queryParameter,
        @CustomType.Parameter("regexMatch") String regexMatch) {
        this.exactMatch = exactMatch;
        this.presentMatch = presentMatch;
        this.queryParameter = queryParameter;
        this.regexMatch = regexMatch;
    }

    /**
     * @return The value of the query parameter must exactly match the contents of exact_match. Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    public String exactMatch() {
        return this.exactMatch;
    }
    /**
     * @return Specifies that the QueryParameterMatcher matches if request contains query parameter, irrespective of whether the parameter has a value or not. Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    public Boolean presentMatch() {
        return this.presentMatch;
    }
    /**
     * @return The name of the query parameter to match.
     * 
     */
    public String queryParameter() {
        return this.queryParameter;
    }
    /**
     * @return The value of the query parameter must match the regular expression specified by regex_match. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of exact_match, regex_match, or present_match must be set.
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteQueryParameterMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private Boolean presentMatch;
        private String queryParameter;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteQueryParameterMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.queryParameter = defaults.queryParameter;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder exactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }
        public Builder presentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }
        public Builder queryParameter(String queryParameter) {
            this.queryParameter = Objects.requireNonNull(queryParameter);
            return this;
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }        public HttpRouteQueryParameterMatchResponse build() {
            return new HttpRouteQueryParameterMatchResponse(exactMatch, presentMatch, queryParameter, regexMatch);
        }
    }
}
