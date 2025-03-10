// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse {
    /**
     * @return Cannot contain duplicates or the query term. Can specify up to 100 terms.
     * 
     */
    private final List<String> doNotAssociateTerms;
    /**
     * @return Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
     * 
     */
    private final List<String> queryTerms;
    /**
     * @return Will be [deprecated = true] post migration;
     * 
     */
    private final List<String> terms;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse(
        @CustomType.Parameter("doNotAssociateTerms") List<String> doNotAssociateTerms,
        @CustomType.Parameter("queryTerms") List<String> queryTerms,
        @CustomType.Parameter("terms") List<String> terms) {
        this.doNotAssociateTerms = doNotAssociateTerms;
        this.queryTerms = queryTerms;
        this.terms = terms;
    }

    /**
     * @return Cannot contain duplicates or the query term. Can specify up to 100 terms.
     * 
     */
    public List<String> doNotAssociateTerms() {
        return this.doNotAssociateTerms;
    }
    /**
     * @return Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
     * 
     */
    public List<String> queryTerms() {
        return this.queryTerms;
    }
    /**
     * @return Will be [deprecated = true] post migration;
     * 
     */
    public List<String> terms() {
        return this.terms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> doNotAssociateTerms;
        private List<String> queryTerms;
        private List<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotAssociateTerms = defaults.doNotAssociateTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.terms = defaults.terms;
        }

        public Builder doNotAssociateTerms(List<String> doNotAssociateTerms) {
            this.doNotAssociateTerms = Objects.requireNonNull(doNotAssociateTerms);
            return this;
        }
        public Builder doNotAssociateTerms(String... doNotAssociateTerms) {
            return doNotAssociateTerms(List.of(doNotAssociateTerms));
        }
        public Builder queryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }
        public Builder queryTerms(String... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }
        public Builder terms(List<String> terms) {
            this.terms = Objects.requireNonNull(terms);
            return this;
        }
        public Builder terms(String... terms) {
            return terms(List.of(terms));
        }        public GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse build() {
            return new GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse(doNotAssociateTerms, queryTerms, terms);
        }
    }
}
