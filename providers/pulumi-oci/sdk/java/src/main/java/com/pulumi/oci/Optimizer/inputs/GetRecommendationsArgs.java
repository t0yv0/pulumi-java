// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Optimizer.inputs.GetRecommendationsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRecommendationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecommendationsArgs Empty = new GetRecommendationsArgs();

    /**
     * The unique OCID associated with the category.
     * 
     */
    @Import(name="categoryId", required=true)
    private String categoryId;

    /**
     * @return The unique OCID associated with the category.
     * 
     */
    public String categoryId() {
        return this.categoryId;
    }

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
     * 
     */
    @Import(name="compartmentIdInSubtree", required=true)
    private Boolean compartmentIdInSubtree;

    /**
     * @return When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
     * 
     */
    public Boolean compartmentIdInSubtree() {
        return this.compartmentIdInSubtree;
    }

    @Import(name="filters")
    private @Nullable List<GetRecommendationsFilter> filters;

    public Optional<List<GetRecommendationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Optional. A filter that returns results that match the name specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Optional. A filter that returns results that match the name specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter that returns results that match the lifecycle state specified.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter that returns results that match the lifecycle state specified.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A filter that returns recommendations that match the status specified.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return A filter that returns recommendations that match the status specified.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetRecommendationsArgs() {}

    private GetRecommendationsArgs(GetRecommendationsArgs $) {
        this.categoryId = $.categoryId;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.filters = $.filters;
        this.name = $.name;
        this.state = $.state;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecommendationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecommendationsArgs $;

        public Builder() {
            $ = new GetRecommendationsArgs();
        }

        public Builder(GetRecommendationsArgs defaults) {
            $ = new GetRecommendationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categoryId The unique OCID associated with the category.
         * 
         * @return builder
         * 
         */
        public Builder categoryId(String categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        public Builder filters(@Nullable List<GetRecommendationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRecommendationsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Optional. A filter that returns results that match the name specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state A filter that returns results that match the lifecycle state specified.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param status A filter that returns recommendations that match the status specified.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetRecommendationsArgs build() {
            $.categoryId = Objects.requireNonNull($.categoryId, "expected parameter 'categoryId' to be non-null");
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.compartmentIdInSubtree = Objects.requireNonNull($.compartmentIdInSubtree, "expected parameter 'compartmentIdInSubtree' to be non-null");
            return $;
        }
    }

}
