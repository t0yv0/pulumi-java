// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InternalCheckerResponse {
    /**
     * @return The checker&#39;s human-readable name. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    private final String displayName;
    /**
     * @return The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
     * 
     */
    private final String gcpZone;
    /**
     * @return A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Stackdriver Workspace project for the Uptime check config associated with the internal checker.
     * 
     */
    private final String name;
    /**
     * @return The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
     * 
     */
    private final String network;
    /**
     * @return The GCP project ID where the internal checker lives. Not necessary the same as the Workspace project.
     * 
     */
    private final String peerProjectId;
    /**
     * @return The current operational state of the internal checker.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private InternalCheckerResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("gcpZone") String gcpZone,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("peerProjectId") String peerProjectId,
        @CustomType.Parameter("state") String state) {
        this.displayName = displayName;
        this.gcpZone = gcpZone;
        this.name = name;
        this.network = network;
        this.peerProjectId = peerProjectId;
        this.state = state;
    }

    /**
     * @return The checker&#39;s human-readable name. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified.
     * 
     */
    public String gcpZone() {
        return this.gcpZone;
    }
    /**
     * @return A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Stackdriver Workspace project for the Uptime check config associated with the internal checker.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: &#34;default&#34;).
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The GCP project ID where the internal checker lives. Not necessary the same as the Workspace project.
     * 
     */
    public String peerProjectId() {
        return this.peerProjectId;
    }
    /**
     * @return The current operational state of the internal checker.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InternalCheckerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String gcpZone;
        private String name;
        private String network;
        private String peerProjectId;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(InternalCheckerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.gcpZone = defaults.gcpZone;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerProjectId = defaults.peerProjectId;
    	      this.state = defaults.state;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder gcpZone(String gcpZone) {
            this.gcpZone = Objects.requireNonNull(gcpZone);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder peerProjectId(String peerProjectId) {
            this.peerProjectId = Objects.requireNonNull(peerProjectId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public InternalCheckerResponse build() {
            return new InternalCheckerResponse(displayName, gcpZone, name, network, peerProjectId, state);
        }
    }
}
