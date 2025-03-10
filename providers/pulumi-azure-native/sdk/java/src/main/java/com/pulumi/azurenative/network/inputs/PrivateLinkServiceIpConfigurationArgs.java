// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.IPAllocationMethod;
import com.pulumi.azurenative.network.enums.IPVersion;
import com.pulumi.azurenative.network.inputs.SubnetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link service ip configuration.
 * 
 */
public final class PrivateLinkServiceIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceIpConfigurationArgs Empty = new PrivateLinkServiceIpConfigurationArgs();

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
     * The name of private link service ip configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of private link service ip configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether the ip configuration is primary or not.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Whether the ip configuration is primary or not.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable Output<String> privateIPAddress;

    /**
     * @return The private IP address of the IP configuration.
     * 
     */
    public Optional<Output<String>> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    @Import(name="privateIPAddressVersion")
    private @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;

    /**
     * @return Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     */
    public Optional<Output<Either<String,IPVersion>>> privateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
    private @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    /**
     * @return The private IP address allocation method.
     * 
     */
    public Optional<Output<Either<String,IPAllocationMethod>>> privateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubnetArgs> subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Optional<Output<SubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private PrivateLinkServiceIpConfigurationArgs() {}

    private PrivateLinkServiceIpConfigurationArgs(PrivateLinkServiceIpConfigurationArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.primary = $.primary;
        this.privateIPAddress = $.privateIPAddress;
        this.privateIPAddressVersion = $.privateIPAddressVersion;
        this.privateIPAllocationMethod = $.privateIPAllocationMethod;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceIpConfigurationArgs $;

        public Builder() {
            $ = new PrivateLinkServiceIpConfigurationArgs();
        }

        public Builder(PrivateLinkServiceIpConfigurationArgs defaults) {
            $ = new PrivateLinkServiceIpConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param name The name of private link service ip configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of private link service ip configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primary Whether the ip configuration is primary or not.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Whether the ip configuration is primary or not.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param privateIPAddress The private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAddress The private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(String privateIPAddress) {
            return privateIPAddress(Output.of(privateIPAddress));
        }

        /**
         * @param privateIPAddressVersion Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(@Nullable Output<Either<String,IPVersion>> privateIPAddressVersion) {
            $.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        /**
         * @param privateIPAddressVersion Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(Either<String,IPVersion> privateIPAddressVersion) {
            return privateIPAddressVersion(Output.of(privateIPAddressVersion));
        }

        /**
         * @param privateIPAddressVersion Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(String privateIPAddressVersion) {
            return privateIPAddressVersion(Either.ofLeft(privateIPAddressVersion));
        }

        /**
         * @param privateIPAddressVersion Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(IPVersion privateIPAddressVersion) {
            return privateIPAddressVersion(Either.ofRight(privateIPAddressVersion));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(@Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            $.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            return privateIPAllocationMethod(Output.of(privateIPAllocationMethod));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(String privateIPAllocationMethod) {
            return privateIPAllocationMethod(Either.ofLeft(privateIPAllocationMethod));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
            return privateIPAllocationMethod(Either.ofRight(privateIPAllocationMethod));
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(SubnetArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public PrivateLinkServiceIpConfigurationArgs build() {
            return $;
        }
    }

}
