// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SingleClusterRoutingResponse {
    /**
     * @return Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    private final Boolean allowTransactionalWrites;
    /**
     * @return The cluster to which read/write requests should be routed.
     * 
     */
    private final String clusterId;

    @CustomType.Constructor
    private SingleClusterRoutingResponse(
        @CustomType.Parameter("allowTransactionalWrites") Boolean allowTransactionalWrites,
        @CustomType.Parameter("clusterId") String clusterId) {
        this.allowTransactionalWrites = allowTransactionalWrites;
        this.clusterId = clusterId;
    }

    /**
     * @return Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    public Boolean allowTransactionalWrites() {
        return this.allowTransactionalWrites;
    }
    /**
     * @return The cluster to which read/write requests should be routed.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SingleClusterRoutingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowTransactionalWrites;
        private String clusterId;

        public Builder() {
    	      // Empty
        }

        public Builder(SingleClusterRoutingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTransactionalWrites = defaults.allowTransactionalWrites;
    	      this.clusterId = defaults.clusterId;
        }

        public Builder allowTransactionalWrites(Boolean allowTransactionalWrites) {
            this.allowTransactionalWrites = Objects.requireNonNull(allowTransactionalWrites);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }        public SingleClusterRoutingResponse build() {
            return new SingleClusterRoutingResponse(allowTransactionalWrites, clusterId);
        }
    }
}
