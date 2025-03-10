// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackendServiceBackend {
    private final String balancingMode;
    private final Double capacityScaler;
    /**
     * @return Textual description for the Backend Service.
     * 
     */
    private final String description;
    private final String group;
    private final Integer maxConnections;
    private final Integer maxConnectionsPerEndpoint;
    private final Integer maxConnectionsPerInstance;
    private final Integer maxRate;
    private final Double maxRatePerEndpoint;
    private final Double maxRatePerInstance;
    private final Double maxUtilization;

    @CustomType.Constructor
    private GetBackendServiceBackend(
        @CustomType.Parameter("balancingMode") String balancingMode,
        @CustomType.Parameter("capacityScaler") Double capacityScaler,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("group") String group,
        @CustomType.Parameter("maxConnections") Integer maxConnections,
        @CustomType.Parameter("maxConnectionsPerEndpoint") Integer maxConnectionsPerEndpoint,
        @CustomType.Parameter("maxConnectionsPerInstance") Integer maxConnectionsPerInstance,
        @CustomType.Parameter("maxRate") Integer maxRate,
        @CustomType.Parameter("maxRatePerEndpoint") Double maxRatePerEndpoint,
        @CustomType.Parameter("maxRatePerInstance") Double maxRatePerInstance,
        @CustomType.Parameter("maxUtilization") Double maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.group = group;
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    public String balancingMode() {
        return this.balancingMode;
    }
    public Double capacityScaler() {
        return this.capacityScaler;
    }
    /**
     * @return Textual description for the Backend Service.
     * 
     */
    public String description() {
        return this.description;
    }
    public String group() {
        return this.group;
    }
    public Integer maxConnections() {
        return this.maxConnections;
    }
    public Integer maxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint;
    }
    public Integer maxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance;
    }
    public Integer maxRate() {
        return this.maxRate;
    }
    public Double maxRatePerEndpoint() {
        return this.maxRatePerEndpoint;
    }
    public Double maxRatePerInstance() {
        return this.maxRatePerInstance;
    }
    public Double maxUtilization() {
        return this.maxUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String balancingMode;
        private Double capacityScaler;
        private String description;
        private String group;
        private Integer maxConnections;
        private Integer maxConnectionsPerEndpoint;
        private Integer maxConnectionsPerInstance;
        private Integer maxRate;
        private Double maxRatePerEndpoint;
        private Double maxRatePerInstance;
        private Double maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder balancingMode(String balancingMode) {
            this.balancingMode = Objects.requireNonNull(balancingMode);
            return this;
        }
        public Builder capacityScaler(Double capacityScaler) {
            this.capacityScaler = Objects.requireNonNull(capacityScaler);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxConnectionsPerEndpoint(Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Objects.requireNonNull(maxConnectionsPerEndpoint);
            return this;
        }
        public Builder maxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Objects.requireNonNull(maxConnectionsPerInstance);
            return this;
        }
        public Builder maxRate(Integer maxRate) {
            this.maxRate = Objects.requireNonNull(maxRate);
            return this;
        }
        public Builder maxRatePerEndpoint(Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Objects.requireNonNull(maxRatePerEndpoint);
            return this;
        }
        public Builder maxRatePerInstance(Double maxRatePerInstance) {
            this.maxRatePerInstance = Objects.requireNonNull(maxRatePerInstance);
            return this;
        }
        public Builder maxUtilization(Double maxUtilization) {
            this.maxUtilization = Objects.requireNonNull(maxUtilization);
            return this;
        }        public GetBackendServiceBackend build() {
            return new GetBackendServiceBackend(balancingMode, capacityScaler, description, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
