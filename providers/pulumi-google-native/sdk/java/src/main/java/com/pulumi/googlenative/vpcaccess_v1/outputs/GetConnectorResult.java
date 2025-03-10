// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vpcaccess_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vpcaccess_v1.outputs.SubnetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectorResult {
    /**
     * @return List of projects using the connector.
     * 
     */
    private final List<String> connectedProjects;
    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    private final String ipCidrRange;
    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    private final String machineType;
    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    private final Integer maxInstances;
    /**
     * @return Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    private final Integer maxThroughput;
    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    private final Integer minInstances;
    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    private final Integer minThroughput;
    /**
     * @return The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    private final String name;
    /**
     * @return Name of a VPC network.
     * 
     */
    private final String network;
    /**
     * @return State of the VPC access connector.
     * 
     */
    private final String state;
    /**
     * @return The subnet in which to house the VPC Access Connector.
     * 
     */
    private final SubnetResponse subnet;

    @CustomType.Constructor
    private GetConnectorResult(
        @CustomType.Parameter("connectedProjects") List<String> connectedProjects,
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("maxInstances") Integer maxInstances,
        @CustomType.Parameter("maxThroughput") Integer maxThroughput,
        @CustomType.Parameter("minInstances") Integer minInstances,
        @CustomType.Parameter("minThroughput") Integer minThroughput,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnet") SubnetResponse subnet) {
        this.connectedProjects = connectedProjects;
        this.ipCidrRange = ipCidrRange;
        this.machineType = machineType;
        this.maxInstances = maxInstances;
        this.maxThroughput = maxThroughput;
        this.minInstances = minInstances;
        this.minThroughput = minThroughput;
        this.name = name;
        this.network = network;
        this.state = state;
        this.subnet = subnet;
    }

    /**
     * @return List of projects using the connector.
     * 
     */
    public List<String> connectedProjects() {
        return this.connectedProjects;
    }
    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Integer maxInstances() {
        return this.maxInstances;
    }
    /**
     * @return Maximum throughput of the connector in Mbps. Default is 300, max is 1000.
     * 
     */
    public Integer maxThroughput() {
        return this.maxThroughput;
    }
    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Integer minInstances() {
        return this.minInstances;
    }
    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    public Integer minThroughput() {
        return this.minThroughput;
    }
    /**
     * @return The resource name in the format `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of a VPC network.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return State of the VPC access connector.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The subnet in which to house the VPC Access Connector.
     * 
     */
    public SubnetResponse subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> connectedProjects;
        private String ipCidrRange;
        private String machineType;
        private Integer maxInstances;
        private Integer maxThroughput;
        private Integer minInstances;
        private Integer minThroughput;
        private String name;
        private String network;
        private String state;
        private SubnetResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedProjects = defaults.connectedProjects;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.machineType = defaults.machineType;
    	      this.maxInstances = defaults.maxInstances;
    	      this.maxThroughput = defaults.maxThroughput;
    	      this.minInstances = defaults.minInstances;
    	      this.minThroughput = defaults.minThroughput;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
        }

        public Builder connectedProjects(List<String> connectedProjects) {
            this.connectedProjects = Objects.requireNonNull(connectedProjects);
            return this;
        }
        public Builder connectedProjects(String... connectedProjects) {
            return connectedProjects(List.of(connectedProjects));
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public Builder maxThroughput(Integer maxThroughput) {
            this.maxThroughput = Objects.requireNonNull(maxThroughput);
            return this;
        }
        public Builder minInstances(Integer minInstances) {
            this.minInstances = Objects.requireNonNull(minInstances);
            return this;
        }
        public Builder minThroughput(Integer minThroughput) {
            this.minThroughput = Objects.requireNonNull(minThroughput);
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnet(SubnetResponse subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }        public GetConnectorResult build() {
            return new GetConnectorResult(connectedProjects, ipCidrRange, machineType, maxInstances, maxThroughput, minInstances, minThroughput, name, network, state, subnet);
        }
    }
}
