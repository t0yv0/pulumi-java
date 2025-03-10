// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FacetOptionsResponse {
    /**
     * @return Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100.
     * 
     */
    private final Integer numFacetBuckets;
    /**
     * @return If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets.
     * 
     */
    private final String objectType;
    /**
     * @return Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
     * 
     */
    private final String operatorName;
    /**
     * @return Source name to facet on. Format: datasources/{source_id} If empty, all data sources will be used.
     * 
     */
    private final String sourceName;

    @CustomType.Constructor
    private FacetOptionsResponse(
        @CustomType.Parameter("numFacetBuckets") Integer numFacetBuckets,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("operatorName") String operatorName,
        @CustomType.Parameter("sourceName") String sourceName) {
        this.numFacetBuckets = numFacetBuckets;
        this.objectType = objectType;
        this.operatorName = operatorName;
        this.sourceName = sourceName;
    }

    /**
     * @return Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100.
     * 
     */
    public Integer numFacetBuckets() {
        return this.numFacetBuckets;
    }
    /**
     * @return If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets.
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    /**
     * @return Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
     * 
     */
    public String operatorName() {
        return this.operatorName;
    }
    /**
     * @return Source name to facet on. Format: datasources/{source_id} If empty, all data sources will be used.
     * 
     */
    public String sourceName() {
        return this.sourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacetOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numFacetBuckets;
        private String objectType;
        private String operatorName;
        private String sourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(FacetOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numFacetBuckets = defaults.numFacetBuckets;
    	      this.objectType = defaults.objectType;
    	      this.operatorName = defaults.operatorName;
    	      this.sourceName = defaults.sourceName;
        }

        public Builder numFacetBuckets(Integer numFacetBuckets) {
            this.numFacetBuckets = Objects.requireNonNull(numFacetBuckets);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder operatorName(String operatorName) {
            this.operatorName = Objects.requireNonNull(operatorName);
            return this;
        }
        public Builder sourceName(String sourceName) {
            this.sourceName = Objects.requireNonNull(sourceName);
            return this;
        }        public FacetOptionsResponse build() {
            return new FacetOptionsResponse(numFacetBuckets, objectType, operatorName, sourceName);
        }
    }
}
