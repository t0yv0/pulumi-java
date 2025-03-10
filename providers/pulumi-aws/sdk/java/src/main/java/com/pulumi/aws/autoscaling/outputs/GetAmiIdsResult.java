// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.GetAmiIdsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAmiIdsResult {
    /**
     * @return A list of the Autoscaling Groups Arns in the current region.
     * 
     */
    private final List<String> arns;
    private final @Nullable List<GetAmiIdsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of the Autoscaling Groups in the current region.
     * 
     */
    private final List<String> names;

    @CustomType.Constructor
    private GetAmiIdsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("filters") @Nullable List<GetAmiIdsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("names") List<String> names) {
        this.arns = arns;
        this.filters = filters;
        this.id = id;
        this.names = names;
    }

    /**
     * @return A list of the Autoscaling Groups Arns in the current region.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    public List<GetAmiIdsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of the Autoscaling Groups in the current region.
     * 
     */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetAmiIdsFilter> filters;
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAmiIdsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public GetAmiIdsResult build() {
            return new GetAmiIdsResult(arns, filters, id, names);
        }
    }
}
