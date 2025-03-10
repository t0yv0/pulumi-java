// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1.outputs.NodeConfigDefaultsResponse;
import java.util.Objects;

@CustomType
public final class NodePoolDefaultsResponse {
    /**
     * @return Subset of NodeConfig message that has defaults.
     * 
     */
    private final NodeConfigDefaultsResponse nodeConfigDefaults;

    @CustomType.Constructor
    private NodePoolDefaultsResponse(@CustomType.Parameter("nodeConfigDefaults") NodeConfigDefaultsResponse nodeConfigDefaults) {
        this.nodeConfigDefaults = nodeConfigDefaults;
    }

    /**
     * @return Subset of NodeConfig message that has defaults.
     * 
     */
    public NodeConfigDefaultsResponse nodeConfigDefaults() {
        return this.nodeConfigDefaults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeConfigDefaultsResponse nodeConfigDefaults;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeConfigDefaults = defaults.nodeConfigDefaults;
        }

        public Builder nodeConfigDefaults(NodeConfigDefaultsResponse nodeConfigDefaults) {
            this.nodeConfigDefaults = Objects.requireNonNull(nodeConfigDefaults);
            return this;
        }        public NodePoolDefaultsResponse build() {
            return new NodePoolDefaultsResponse(nodeConfigDefaults);
        }
    }
}
