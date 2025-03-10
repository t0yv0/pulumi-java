// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.azure.lb.inputs.OutboundRuleFrontendIpConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutboundRuleState extends com.pulumi.resources.ResourceArgs {

    public static final OutboundRuleState Empty = new OutboundRuleState();

    /**
     * The number of outbound ports to be used for NAT. Defaults to `1024`.
     * 
     */
    @Import(name="allocatedOutboundPorts")
    private @Nullable Output<Integer> allocatedOutboundPorts;

    /**
     * @return The number of outbound ports to be used for NAT. Defaults to `1024`.
     * 
     */
    public Optional<Output<Integer>> allocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPoolId")
    private @Nullable Output<String> backendAddressPoolId;

    /**
     * @return The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    public Optional<Output<String>> backendAddressPoolId() {
        return Optional.ofNullable(this.backendAddressPoolId);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Output<Boolean> enableTcpReset;

    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Output<Boolean>> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * One or more `frontend_ip_configuration` blocks as defined below.
     * 
     */
    @Import(name="frontendIpConfigurations")
    private @Nullable Output<List<OutboundRuleFrontendIpConfigurationArgs>> frontendIpConfigurations;

    /**
     * @return One or more `frontend_ip_configuration` blocks as defined below.
     * 
     */
    public Optional<Output<List<OutboundRuleFrontendIpConfigurationArgs>>> frontendIpConfigurations() {
        return Optional.ofNullable(this.frontendIpConfigurations);
    }

    /**
     * The timeout for the TCP idle connection
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return The timeout for the TCP idle connection
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="loadbalancerId")
    private @Nullable Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> loadbalancerId() {
        return Optional.ofNullable(this.loadbalancerId);
    }

    /**
     * Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private OutboundRuleState() {}

    private OutboundRuleState(OutboundRuleState $) {
        this.allocatedOutboundPorts = $.allocatedOutboundPorts;
        this.backendAddressPoolId = $.backendAddressPoolId;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIpConfigurations = $.frontendIpConfigurations;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundRuleState $;

        public Builder() {
            $ = new OutboundRuleState();
        }

        public Builder(OutboundRuleState defaults) {
            $ = new OutboundRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedOutboundPorts The number of outbound ports to be used for NAT. Defaults to `1024`.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            $.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        /**
         * @param allocatedOutboundPorts The number of outbound ports to be used for NAT. Defaults to `1024`.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(Integer allocatedOutboundPorts) {
            return allocatedOutboundPorts(Output.of(allocatedOutboundPorts));
        }

        /**
         * @param backendAddressPoolId The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolId(@Nullable Output<String> backendAddressPoolId) {
            $.backendAddressPoolId = backendAddressPoolId;
            return this;
        }

        /**
         * @param backendAddressPoolId The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolId(String backendAddressPoolId) {
            return backendAddressPoolId(Output.of(backendAddressPoolId));
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        /**
         * @param frontendIpConfigurations One or more `frontend_ip_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(@Nullable Output<List<OutboundRuleFrontendIpConfigurationArgs>> frontendIpConfigurations) {
            $.frontendIpConfigurations = frontendIpConfigurations;
            return this;
        }

        /**
         * @param frontendIpConfigurations One or more `frontend_ip_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(List<OutboundRuleFrontendIpConfigurationArgs> frontendIpConfigurations) {
            return frontendIpConfigurations(Output.of(frontendIpConfigurations));
        }

        /**
         * @param frontendIpConfigurations One or more `frontend_ip_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(OutboundRuleFrontendIpConfigurationArgs... frontendIpConfigurations) {
            return frontendIpConfigurations(List.of(frontendIpConfigurations));
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(@Nullable Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Outbound Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Outbound Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public OutboundRuleState build() {
            return $;
        }
    }

}
