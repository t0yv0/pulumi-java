// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBrokerNodesNodeInfoList {
    /**
     * @return The attached elastic network interface of the broker
     * 
     */
    private final String attachedEniId;
    /**
     * @return The ID of the broker
     * 
     */
    private final Double brokerId;
    /**
     * @return The client subnet to which this broker node belongs
     * 
     */
    private final String clientSubnet;
    /**
     * @return The client virtual private cloud (VPC) IP address
     * 
     */
    private final String clientVpcIpAddress;
    /**
     * @return Set of endpoints for accessing the broker. This does not include ports
     * 
     */
    private final List<String> endpoints;
    /**
     * @return The Amazon Resource Name (ARN) of the node
     * 
     */
    private final String nodeArn;

    @CustomType.Constructor
    private GetBrokerNodesNodeInfoList(
        @CustomType.Parameter("attachedEniId") String attachedEniId,
        @CustomType.Parameter("brokerId") Double brokerId,
        @CustomType.Parameter("clientSubnet") String clientSubnet,
        @CustomType.Parameter("clientVpcIpAddress") String clientVpcIpAddress,
        @CustomType.Parameter("endpoints") List<String> endpoints,
        @CustomType.Parameter("nodeArn") String nodeArn) {
        this.attachedEniId = attachedEniId;
        this.brokerId = brokerId;
        this.clientSubnet = clientSubnet;
        this.clientVpcIpAddress = clientVpcIpAddress;
        this.endpoints = endpoints;
        this.nodeArn = nodeArn;
    }

    /**
     * @return The attached elastic network interface of the broker
     * 
     */
    public String attachedEniId() {
        return this.attachedEniId;
    }
    /**
     * @return The ID of the broker
     * 
     */
    public Double brokerId() {
        return this.brokerId;
    }
    /**
     * @return The client subnet to which this broker node belongs
     * 
     */
    public String clientSubnet() {
        return this.clientSubnet;
    }
    /**
     * @return The client virtual private cloud (VPC) IP address
     * 
     */
    public String clientVpcIpAddress() {
        return this.clientVpcIpAddress;
    }
    /**
     * @return Set of endpoints for accessing the broker. This does not include ports
     * 
     */
    public List<String> endpoints() {
        return this.endpoints;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the node
     * 
     */
    public String nodeArn() {
        return this.nodeArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerNodesNodeInfoList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedEniId;
        private Double brokerId;
        private String clientSubnet;
        private String clientVpcIpAddress;
        private List<String> endpoints;
        private String nodeArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerNodesNodeInfoList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedEniId = defaults.attachedEniId;
    	      this.brokerId = defaults.brokerId;
    	      this.clientSubnet = defaults.clientSubnet;
    	      this.clientVpcIpAddress = defaults.clientVpcIpAddress;
    	      this.endpoints = defaults.endpoints;
    	      this.nodeArn = defaults.nodeArn;
        }

        public Builder attachedEniId(String attachedEniId) {
            this.attachedEniId = Objects.requireNonNull(attachedEniId);
            return this;
        }
        public Builder brokerId(Double brokerId) {
            this.brokerId = Objects.requireNonNull(brokerId);
            return this;
        }
        public Builder clientSubnet(String clientSubnet) {
            this.clientSubnet = Objects.requireNonNull(clientSubnet);
            return this;
        }
        public Builder clientVpcIpAddress(String clientVpcIpAddress) {
            this.clientVpcIpAddress = Objects.requireNonNull(clientVpcIpAddress);
            return this;
        }
        public Builder endpoints(List<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder nodeArn(String nodeArn) {
            this.nodeArn = Objects.requireNonNull(nodeArn);
            return this;
        }        public GetBrokerNodesNodeInfoList build() {
            return new GetBrokerNodesNodeInfoList(attachedEniId, brokerId, clientSubnet, clientVpcIpAddress, endpoints, nodeArn);
        }
    }
}
