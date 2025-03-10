// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Opsi.inputs.GetHostInsightsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostInsightsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostInsightsArgs Empty = new GetHostInsightsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return A flag to search all resources within a given compartment and all sub-compartments.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * Unique Enterprise Manager bridge identifier
     * 
     */
    @Import(name="enterpriseManagerBridgeId")
    private @Nullable String enterpriseManagerBridgeId;

    /**
     * @return Unique Enterprise Manager bridge identifier
     * 
     */
    public Optional<String> enterpriseManagerBridgeId() {
        return Optional.ofNullable(this.enterpriseManagerBridgeId);
    }

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
     * 
     */
    @Import(name="exadataInsightId")
    private @Nullable String exadataInsightId;

    /**
     * @return [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
     * 
     */
    public Optional<String> exadataInsightId() {
        return Optional.ofNullable(this.exadataInsightId);
    }

    @Import(name="filters")
    private @Nullable List<GetHostInsightsFilter> filters;

    public Optional<List<GetHostInsightsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Filter by one or more host types. Possible value is EXTERNAL-HOST.
     * 
     */
    @Import(name="hostTypes")
    private @Nullable List<String> hostTypes;

    /**
     * @return Filter by one or more host types. Possible value is EXTERNAL-HOST.
     * 
     */
    public Optional<List<String>> hostTypes() {
        return Optional.ofNullable(this.hostTypes);
    }

    /**
     * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Lifecycle states
     * 
     */
    @Import(name="states")
    private @Nullable List<String> states;

    /**
     * @return Lifecycle states
     * 
     */
    public Optional<List<String>> states() {
        return Optional.ofNullable(this.states);
    }

    /**
     * Resource Status
     * 
     */
    @Import(name="statuses")
    private @Nullable List<String> statuses;

    /**
     * @return Resource Status
     * 
     */
    public Optional<List<String>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private GetHostInsightsArgs() {}

    private GetHostInsightsArgs(GetHostInsightsArgs $) {
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.enterpriseManagerBridgeId = $.enterpriseManagerBridgeId;
        this.exadataInsightId = $.exadataInsightId;
        this.filters = $.filters;
        this.hostTypes = $.hostTypes;
        this.id = $.id;
        this.states = $.states;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostInsightsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostInsightsArgs $;

        public Builder() {
            $ = new GetHostInsightsArgs();
        }

        public Builder(GetHostInsightsArgs defaults) {
            $ = new GetHostInsightsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree A flag to search all resources within a given compartment and all sub-compartments.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param enterpriseManagerBridgeId Unique Enterprise Manager bridge identifier
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerBridgeId(@Nullable String enterpriseManagerBridgeId) {
            $.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }

        /**
         * @param exadataInsightId [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
         * 
         * @return builder
         * 
         */
        public Builder exadataInsightId(@Nullable String exadataInsightId) {
            $.exadataInsightId = exadataInsightId;
            return this;
        }

        public Builder filters(@Nullable List<GetHostInsightsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetHostInsightsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param hostTypes Filter by one or more host types. Possible value is EXTERNAL-HOST.
         * 
         * @return builder
         * 
         */
        public Builder hostTypes(@Nullable List<String> hostTypes) {
            $.hostTypes = hostTypes;
            return this;
        }

        /**
         * @param hostTypes Filter by one or more host types. Possible value is EXTERNAL-HOST.
         * 
         * @return builder
         * 
         */
        public Builder hostTypes(String... hostTypes) {
            return hostTypes(List.of(hostTypes));
        }

        /**
         * @param id Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param states Lifecycle states
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable List<String> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states Lifecycle states
         * 
         * @return builder
         * 
         */
        public Builder states(String... states) {
            return states(List.of(states));
        }

        /**
         * @param statuses Resource Status
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<String> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses Resource Status
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        public GetHostInsightsArgs build() {
            return $;
        }
    }

}
