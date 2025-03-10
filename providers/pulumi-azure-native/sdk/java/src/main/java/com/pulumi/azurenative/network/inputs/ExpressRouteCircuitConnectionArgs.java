// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.Ipv6CircuitConnectionConfigArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * 
 */
public final class ExpressRouteCircuitConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitConnectionArgs Empty = new ExpressRouteCircuitConnectionArgs();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable Output<String> addressPrefix;

    /**
     * @return /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    public Optional<Output<String>> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * The authorization key.
     * 
     */
    @Import(name="authorizationKey")
    private @Nullable Output<String> authorizationKey;

    /**
     * @return The authorization key.
     * 
     */
    public Optional<Output<String>> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @Import(name="expressRouteCircuitPeering")
    private @Nullable Output<SubResourceArgs> expressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    public Optional<Output<SubResourceArgs>> expressRouteCircuitPeering() {
        return Optional.ofNullable(this.expressRouteCircuitPeering);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @Import(name="ipv6CircuitConnectionConfig")
    private @Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;

    /**
     * @return IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    public Optional<Output<Ipv6CircuitConnectionConfigArgs>> ipv6CircuitConnectionConfig() {
        return Optional.ofNullable(this.ipv6CircuitConnectionConfig);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Import(name="peerExpressRouteCircuitPeering")
    private @Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    public Optional<Output<SubResourceArgs>> peerExpressRouteCircuitPeering() {
        return Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }

    private ExpressRouteCircuitConnectionArgs() {}

    private ExpressRouteCircuitConnectionArgs(ExpressRouteCircuitConnectionArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.authorizationKey = $.authorizationKey;
        this.expressRouteCircuitPeering = $.expressRouteCircuitPeering;
        this.id = $.id;
        this.ipv6CircuitConnectionConfig = $.ipv6CircuitConnectionConfig;
        this.name = $.name;
        this.peerExpressRouteCircuitPeering = $.peerExpressRouteCircuitPeering;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitConnectionArgs $;

        public Builder() {
            $ = new ExpressRouteCircuitConnectionArgs();
        }

        public Builder(ExpressRouteCircuitConnectionArgs defaults) {
            $ = new ExpressRouteCircuitConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix /29 IP address space to carve out Customer addresses for tunnels.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param addressPrefix /29 IP address space to carve out Customer addresses for tunnels.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        /**
         * @param authorizationKey The authorization key.
         * 
         * @return builder
         * 
         */
        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            $.authorizationKey = authorizationKey;
            return this;
        }

        /**
         * @param authorizationKey The authorization key.
         * 
         * @return builder
         * 
         */
        public Builder authorizationKey(String authorizationKey) {
            return authorizationKey(Output.of(authorizationKey));
        }

        /**
         * @param expressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteCircuitPeering(@Nullable Output<SubResourceArgs> expressRouteCircuitPeering) {
            $.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        /**
         * @param expressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
         * 
         * @return builder
         * 
         */
        public Builder expressRouteCircuitPeering(SubResourceArgs expressRouteCircuitPeering) {
            return expressRouteCircuitPeering(Output.of(expressRouteCircuitPeering));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipv6CircuitConnectionConfig IPv6 Address PrefixProperties of the express route circuit connection.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CircuitConnectionConfig(@Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig) {
            $.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
            return this;
        }

        /**
         * @param ipv6CircuitConnectionConfig IPv6 Address PrefixProperties of the express route circuit connection.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CircuitConnectionConfig(Ipv6CircuitConnectionConfigArgs ipv6CircuitConnectionConfig) {
            return ipv6CircuitConnectionConfig(Output.of(ipv6CircuitConnectionConfig));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerExpressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the peered circuit.
         * 
         * @return builder
         * 
         */
        public Builder peerExpressRouteCircuitPeering(@Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering) {
            $.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        /**
         * @param peerExpressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the peered circuit.
         * 
         * @return builder
         * 
         */
        public Builder peerExpressRouteCircuitPeering(SubResourceArgs peerExpressRouteCircuitPeering) {
            return peerExpressRouteCircuitPeering(Output.of(peerExpressRouteCircuitPeering));
        }

        public ExpressRouteCircuitConnectionArgs build() {
            return $;
        }
    }

}
