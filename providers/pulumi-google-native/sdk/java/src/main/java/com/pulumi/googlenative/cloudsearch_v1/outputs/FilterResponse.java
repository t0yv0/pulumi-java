// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudsearch_v1.outputs.CompositeFilterResponse;
import com.pulumi.googlenative.cloudsearch_v1.outputs.ValueFilterResponse;
import java.util.Objects;

@CustomType
public final class FilterResponse {
    private final CompositeFilterResponse compositeFilter;
    private final ValueFilterResponse valueFilter;

    @CustomType.Constructor
    private FilterResponse(
        @CustomType.Parameter("compositeFilter") CompositeFilterResponse compositeFilter,
        @CustomType.Parameter("valueFilter") ValueFilterResponse valueFilter) {
        this.compositeFilter = compositeFilter;
        this.valueFilter = valueFilter;
    }

    public CompositeFilterResponse compositeFilter() {
        return this.compositeFilter;
    }
    public ValueFilterResponse valueFilter() {
        return this.valueFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompositeFilterResponse compositeFilter;
        private ValueFilterResponse valueFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeFilter = defaults.compositeFilter;
    	      this.valueFilter = defaults.valueFilter;
        }

        public Builder compositeFilter(CompositeFilterResponse compositeFilter) {
            this.compositeFilter = Objects.requireNonNull(compositeFilter);
            return this;
        }
        public Builder valueFilter(ValueFilterResponse valueFilter) {
            this.valueFilter = Objects.requireNonNull(valueFilter);
            return this;
        }        public FilterResponse build() {
            return new FilterResponse(compositeFilter, valueFilter);
        }
    }
}
