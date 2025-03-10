// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.VisualBuilder.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstancesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVbInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVbInstancesArgs Empty = new GetVbInstancesArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetVbInstancesFilter> filters;

    public Optional<List<GetVbInstancesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Life cycle state to query on.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Life cycle state to query on.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetVbInstancesArgs() {}

    private GetVbInstancesArgs(GetVbInstancesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVbInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVbInstancesArgs $;

        public Builder() {
            $ = new GetVbInstancesArgs();
        }

        public Builder(GetVbInstancesArgs defaults) {
            $ = new GetVbInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetVbInstancesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVbInstancesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state Life cycle state to query on.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetVbInstancesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
