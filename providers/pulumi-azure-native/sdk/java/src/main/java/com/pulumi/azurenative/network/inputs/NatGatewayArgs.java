// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.NatGatewaySkuArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Nat Gateway resource.
 * 
 */
public final class NatGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final NatGatewayArgs Empty = new NatGatewayArgs();

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
     * The idle timeout of the nat gateway.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return The idle timeout of the nat gateway.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    @Import(name="publicIpAddresses")
    private @Nullable Output<List<SubResourceArgs>> publicIpAddresses;

    /**
     * @return An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> publicIpAddresses() {
        return Optional.ofNullable(this.publicIpAddresses);
    }

    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    @Import(name="publicIpPrefixes")
    private @Nullable Output<List<SubResourceArgs>> publicIpPrefixes;

    /**
     * @return An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> publicIpPrefixes() {
        return Optional.ofNullable(this.publicIpPrefixes);
    }

    /**
     * The nat gateway SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<NatGatewaySkuArgs> sku;

    /**
     * @return The nat gateway SKU.
     * 
     */
    public Optional<Output<NatGatewaySkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private NatGatewayArgs() {}

    private NatGatewayArgs(NatGatewayArgs $) {
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.location = $.location;
        this.publicIpAddresses = $.publicIpAddresses;
        this.publicIpPrefixes = $.publicIpPrefixes;
        this.sku = $.sku;
        this.tags = $.tags;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatGatewayArgs $;

        public Builder() {
            $ = new NatGatewayArgs();
        }

        public Builder(NatGatewayArgs defaults) {
            $ = new NatGatewayArgs(Objects.requireNonNull(defaults));
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
         * @param idleTimeoutInMinutes The idle timeout of the nat gateway.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The idle timeout of the nat gateway.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param publicIpAddresses An array of public ip addresses associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(@Nullable Output<List<SubResourceArgs>> publicIpAddresses) {
            $.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * @param publicIpAddresses An array of public ip addresses associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(List<SubResourceArgs> publicIpAddresses) {
            return publicIpAddresses(Output.of(publicIpAddresses));
        }

        /**
         * @param publicIpAddresses An array of public ip addresses associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddresses(SubResourceArgs... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }

        /**
         * @param publicIpPrefixes An array of public ip prefixes associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixes(@Nullable Output<List<SubResourceArgs>> publicIpPrefixes) {
            $.publicIpPrefixes = publicIpPrefixes;
            return this;
        }

        /**
         * @param publicIpPrefixes An array of public ip prefixes associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixes(List<SubResourceArgs> publicIpPrefixes) {
            return publicIpPrefixes(Output.of(publicIpPrefixes));
        }

        /**
         * @param publicIpPrefixes An array of public ip prefixes associated with the nat gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixes(SubResourceArgs... publicIpPrefixes) {
            return publicIpPrefixes(List.of(publicIpPrefixes));
        }

        /**
         * @param sku The nat gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<NatGatewaySkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The nat gateway SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(NatGatewaySkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zones A list of availability zones denoting the zone in which Nat Gateway should be deployed.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones denoting the zone in which Nat Gateway should be deployed.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones denoting the zone in which Nat Gateway should be deployed.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public NatGatewayArgs build() {
            return $;
        }
    }

}
