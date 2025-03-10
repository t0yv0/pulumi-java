// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.azurenative.avs.outputs.WorkloadNetworkSegmentPortVifResponse;
import com.pulumi.azurenative.avs.outputs.WorkloadNetworkSegmentSubnetResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadNetworkSegmentResult {
    /**
     * @return Gateway which to connect segment to.
     * 
     */
    private final @Nullable String connectedGateway;
    /**
     * @return Display name of the segment.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Port Vif which segment is associated with.
     * 
     */
    private final List<WorkloadNetworkSegmentPortVifResponse> portVif;
    /**
     * @return The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * @return NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * @return Segment status.
     * 
     */
    private final String status;
    /**
     * @return Subnet which to connect segment to.
     * 
     */
    private final @Nullable WorkloadNetworkSegmentSubnetResponse subnet;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkloadNetworkSegmentResult(
        @CustomType.Parameter("connectedGateway") @Nullable String connectedGateway,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("portVif") List<WorkloadNetworkSegmentPortVifResponse> portVif,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("revision") @Nullable Double revision,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subnet") @Nullable WorkloadNetworkSegmentSubnetResponse subnet,
        @CustomType.Parameter("type") String type) {
        this.connectedGateway = connectedGateway;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.portVif = portVif;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.status = status;
        this.subnet = subnet;
        this.type = type;
    }

    /**
     * @return Gateway which to connect segment to.
     * 
     */
    public Optional<String> connectedGateway() {
        return Optional.ofNullable(this.connectedGateway);
    }
    /**
     * @return Display name of the segment.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Port Vif which segment is associated with.
     * 
     */
    public List<WorkloadNetworkSegmentPortVifResponse> portVif() {
        return this.portVif;
    }
    /**
     * @return The provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return NSX revision number.
     * 
     */
    public Optional<Double> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Segment status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Subnet which to connect segment to.
     * 
     */
    public Optional<WorkloadNetworkSegmentSubnetResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkSegmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectedGateway;
        private @Nullable String displayName;
        private String id;
        private String name;
        private List<WorkloadNetworkSegmentPortVifResponse> portVif;
        private String provisioningState;
        private @Nullable Double revision;
        private String status;
        private @Nullable WorkloadNetworkSegmentSubnetResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkSegmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedGateway = defaults.connectedGateway;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.portVif = defaults.portVif;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder connectedGateway(@Nullable String connectedGateway) {
            this.connectedGateway = connectedGateway;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder portVif(List<WorkloadNetworkSegmentPortVifResponse> portVif) {
            this.portVif = Objects.requireNonNull(portVif);
            return this;
        }
        public Builder portVif(WorkloadNetworkSegmentPortVifResponse... portVif) {
            return portVif(List.of(portVif));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder revision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subnet(@Nullable WorkloadNetworkSegmentSubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkloadNetworkSegmentResult build() {
            return new GetWorkloadNetworkSegmentResult(connectedGateway, displayName, id, name, portVif, provisioningState, revision, status, subnet, type);
        }
    }
}
