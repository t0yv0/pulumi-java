// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetVmClusterUpdateHistoryEntriesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVmClusterUpdateHistoryEntriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterUpdateHistoryEntriesArgs Empty = new GetVmClusterUpdateHistoryEntriesArgs();

    @Import(name="filters")
    private @Nullable List<GetVmClusterUpdateHistoryEntriesFilter> filters;

    public Optional<List<GetVmClusterUpdateHistoryEntriesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A filter to return only resources that match the given update type exactly.
     * 
     */
    @Import(name="updateType")
    private @Nullable String updateType;

    /**
     * @return A filter to return only resources that match the given update type exactly.
     * 
     */
    public Optional<String> updateType() {
        return Optional.ofNullable(this.updateType);
    }

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="vmClusterId", required=true)
    private String vmClusterId;

    /**
     * @return The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String vmClusterId() {
        return this.vmClusterId;
    }

    private GetVmClusterUpdateHistoryEntriesArgs() {}

    private GetVmClusterUpdateHistoryEntriesArgs(GetVmClusterUpdateHistoryEntriesArgs $) {
        this.filters = $.filters;
        this.state = $.state;
        this.updateType = $.updateType;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterUpdateHistoryEntriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterUpdateHistoryEntriesArgs $;

        public Builder() {
            $ = new GetVmClusterUpdateHistoryEntriesArgs();
        }

        public Builder(GetVmClusterUpdateHistoryEntriesArgs defaults) {
            $ = new GetVmClusterUpdateHistoryEntriesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVmClusterUpdateHistoryEntriesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVmClusterUpdateHistoryEntriesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param updateType A filter to return only resources that match the given update type exactly.
         * 
         * @return builder
         * 
         */
        public Builder updateType(@Nullable String updateType) {
            $.updateType = updateType;
            return this;
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        public GetVmClusterUpdateHistoryEntriesArgs build() {
            $.vmClusterId = Objects.requireNonNull($.vmClusterId, "expected parameter 'vmClusterId' to be non-null");
            return $;
        }
    }

}
