// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVolumeDataProtectionReplication {
    /**
     * @return The endpoint type.
     * 
     */
    private final String endpointType;
    /**
     * @return Location of the primary volume.
     * 
     */
    private final String remoteVolumeLocation;
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    private final String remoteVolumeResourceId;
    /**
     * @return Frequency of replication.
     * 
     */
    private final String replicationFrequency;

    @CustomType.Constructor
    private GetVolumeDataProtectionReplication(
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("remoteVolumeLocation") String remoteVolumeLocation,
        @CustomType.Parameter("remoteVolumeResourceId") String remoteVolumeResourceId,
        @CustomType.Parameter("replicationFrequency") String replicationFrequency) {
        this.endpointType = endpointType;
        this.remoteVolumeLocation = remoteVolumeLocation;
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        this.replicationFrequency = replicationFrequency;
    }

    /**
     * @return The endpoint type.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return Location of the primary volume.
     * 
     */
    public String remoteVolumeLocation() {
        return this.remoteVolumeLocation;
    }
    /**
     * @return Resource ID of the primary volume.
     * 
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }
    /**
     * @return Frequency of replication.
     * 
     */
    public String replicationFrequency() {
        return this.replicationFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeDataProtectionReplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private String remoteVolumeLocation;
        private String remoteVolumeResourceId;
        private String replicationFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeDataProtectionReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.remoteVolumeLocation = defaults.remoteVolumeLocation;
    	      this.remoteVolumeResourceId = defaults.remoteVolumeResourceId;
    	      this.replicationFrequency = defaults.replicationFrequency;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder remoteVolumeLocation(String remoteVolumeLocation) {
            this.remoteVolumeLocation = Objects.requireNonNull(remoteVolumeLocation);
            return this;
        }
        public Builder remoteVolumeResourceId(String remoteVolumeResourceId) {
            this.remoteVolumeResourceId = Objects.requireNonNull(remoteVolumeResourceId);
            return this;
        }
        public Builder replicationFrequency(String replicationFrequency) {
            this.replicationFrequency = Objects.requireNonNull(replicationFrequency);
            return this;
        }        public GetVolumeDataProtectionReplication build() {
            return new GetVolumeDataProtectionReplication(endpointType, remoteVolumeLocation, remoteVolumeResourceId, replicationFrequency);
        }
    }
}
