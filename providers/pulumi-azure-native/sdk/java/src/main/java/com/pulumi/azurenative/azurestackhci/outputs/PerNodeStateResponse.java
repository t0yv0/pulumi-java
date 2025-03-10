// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PerNodeStateResponse {
    /**
     * @return Fully qualified resource ID for the Arc agent of this node.
     * 
     */
    private final String arcInstance;
    /**
     * @return Name of the Node in HCI Cluster
     * 
     */
    private final String name;
    /**
     * @return State of Arc agent in this node.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private PerNodeStateResponse(
        @CustomType.Parameter("arcInstance") String arcInstance,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.arcInstance = arcInstance;
        this.name = name;
        this.state = state;
    }

    /**
     * @return Fully qualified resource ID for the Arc agent of this node.
     * 
     */
    public String arcInstance() {
        return this.arcInstance;
    }
    /**
     * @return Name of the Node in HCI Cluster
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of Arc agent in this node.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerNodeStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arcInstance;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PerNodeStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcInstance = defaults.arcInstance;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder arcInstance(String arcInstance) {
            this.arcInstance = Objects.requireNonNull(arcInstance);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public PerNodeStateResponse build() {
            return new PerNodeStateResponse(arcInstance, name, state);
        }
    }
}
