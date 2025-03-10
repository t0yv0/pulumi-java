// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.DedicatedHostInstanceViewWithNameResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DedicatedHostGroupInstanceViewResponse {
    /**
     * @return List of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    private final @Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts;

    @CustomType.Constructor
    private DedicatedHostGroupInstanceViewResponse(@CustomType.Parameter("hosts") @Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts) {
        this.hosts = hosts;
    }

    /**
     * @return List of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    public List<DedicatedHostInstanceViewWithNameResponse> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostGroupInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostGroupInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
        }

        public Builder hosts(@Nullable List<DedicatedHostInstanceViewWithNameResponse> hosts) {
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(DedicatedHostInstanceViewWithNameResponse... hosts) {
            return hosts(List.of(hosts));
        }        public DedicatedHostGroupInstanceViewResponse build() {
            return new DedicatedHostGroupInstanceViewResponse(hosts);
        }
    }
}
