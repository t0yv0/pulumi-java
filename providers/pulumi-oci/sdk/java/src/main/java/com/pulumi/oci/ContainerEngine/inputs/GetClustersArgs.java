// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ContainerEngine.inputs.GetClustersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClustersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersArgs Empty = new GetClustersArgs();

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

    @Import(name="filters")
    private @Nullable List<GetClustersFilter> filters;

    public Optional<List<GetClustersFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name to filter on.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name to filter on.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A cluster lifecycle state to filter on. Can have multiple parameters of this name.
     * 
     */
    @Import(name="states")
    private @Nullable List<String> states;

    /**
     * @return A cluster lifecycle state to filter on. Can have multiple parameters of this name.
     * 
     */
    public Optional<List<String>> states() {
        return Optional.ofNullable(this.states);
    }

    private GetClustersArgs() {}

    private GetClustersArgs(GetClustersArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
        this.states = $.states;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersArgs $;

        public Builder() {
            $ = new GetClustersArgs();
        }

        public Builder(GetClustersArgs defaults) {
            $ = new GetClustersArgs(Objects.requireNonNull(defaults));
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

        public Builder filters(@Nullable List<GetClustersFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetClustersFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name The name to filter on.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param states A cluster lifecycle state to filter on. Can have multiple parameters of this name.
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable List<String> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states A cluster lifecycle state to filter on. Can have multiple parameters of this name.
         * 
         * @return builder
         * 
         */
        public Builder states(String... states) {
            return states(List.of(states));
        }

        public GetClustersArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
