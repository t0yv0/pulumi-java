// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceIpConfigurationArgs;
import com.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesAutoApprovalArgs;
import com.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesVisibilityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private link service resource.
 * 
 */
public final class PrivateLinkServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceArgs Empty = new PrivateLinkServiceArgs();

    /**
     * The auto-approval list of the private link service.
     * 
     */
    @Import(name="autoApproval")
    private @Nullable Output<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval;

    /**
     * @return The auto-approval list of the private link service.
     * 
     */
    public Optional<Output<PrivateLinkServicePropertiesAutoApprovalArgs>> autoApproval() {
        return Optional.ofNullable(this.autoApproval);
    }

    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    @Import(name="enableProxyProtocol")
    private @Nullable Output<Boolean> enableProxyProtocol;

    /**
     * @return Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    public Optional<Output<Boolean>> enableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return The extended location of the load balancer.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The list of Fqdn.
     * 
     */
    @Import(name="fqdns")
    private @Nullable Output<List<String>> fqdns;

    /**
     * @return The list of Fqdn.
     * 
     */
    public Optional<Output<List<String>>> fqdns() {
        return Optional.ofNullable(this.fqdns);
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
     * An array of private link service IP configurations.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations;

    /**
     * @return An array of private link service IP configurations.
     * 
     */
    public Optional<Output<List<PrivateLinkServiceIpConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    @Import(name="loadBalancerFrontendIpConfigurations")
    private @Nullable Output<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations;

    /**
     * @return An array of references to the load balancer IP configurations.
     * 
     */
    public Optional<Output<List<FrontendIPConfigurationArgs>>> loadBalancerFrontendIpConfigurations() {
        return Optional.ofNullable(this.loadBalancerFrontendIpConfigurations);
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
     * The visibility list of the private link service.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<PrivateLinkServicePropertiesVisibilityArgs> visibility;

    /**
     * @return The visibility list of the private link service.
     * 
     */
    public Optional<Output<PrivateLinkServicePropertiesVisibilityArgs>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private PrivateLinkServiceArgs() {}

    private PrivateLinkServiceArgs(PrivateLinkServiceArgs $) {
        this.autoApproval = $.autoApproval;
        this.enableProxyProtocol = $.enableProxyProtocol;
        this.extendedLocation = $.extendedLocation;
        this.fqdns = $.fqdns;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.loadBalancerFrontendIpConfigurations = $.loadBalancerFrontendIpConfigurations;
        this.location = $.location;
        this.tags = $.tags;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceArgs $;

        public Builder() {
            $ = new PrivateLinkServiceArgs();
        }

        public Builder(PrivateLinkServiceArgs defaults) {
            $ = new PrivateLinkServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoApproval The auto-approval list of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder autoApproval(@Nullable Output<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval) {
            $.autoApproval = autoApproval;
            return this;
        }

        /**
         * @param autoApproval The auto-approval list of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder autoApproval(PrivateLinkServicePropertiesAutoApprovalArgs autoApproval) {
            return autoApproval(Output.of(autoApproval));
        }

        /**
         * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(@Nullable Output<Boolean> enableProxyProtocol) {
            $.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        /**
         * @param enableProxyProtocol Whether the private link service is enabled for proxy protocol or not.
         * 
         * @return builder
         * 
         */
        public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
            return enableProxyProtocol(Output.of(enableProxyProtocol));
        }

        /**
         * @param extendedLocation The extended location of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation The extended location of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param fqdns The list of Fqdn.
         * 
         * @return builder
         * 
         */
        public Builder fqdns(@Nullable Output<List<String>> fqdns) {
            $.fqdns = fqdns;
            return this;
        }

        /**
         * @param fqdns The list of Fqdn.
         * 
         * @return builder
         * 
         */
        public Builder fqdns(List<String> fqdns) {
            return fqdns(Output.of(fqdns));
        }

        /**
         * @param fqdns The list of Fqdn.
         * 
         * @return builder
         * 
         */
        public Builder fqdns(String... fqdns) {
            return fqdns(List.of(fqdns));
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
         * @param ipConfigurations An array of private link service IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(@Nullable Output<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations An array of private link service IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<PrivateLinkServiceIpConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations An array of private link service IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(PrivateLinkServiceIpConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerFrontendIpConfigurations(@Nullable Output<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations) {
            $.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
            return this;
        }

        /**
         * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationArgs> loadBalancerFrontendIpConfigurations) {
            return loadBalancerFrontendIpConfigurations(Output.of(loadBalancerFrontendIpConfigurations));
        }

        /**
         * @param loadBalancerFrontendIpConfigurations An array of references to the load balancer IP configurations.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerFrontendIpConfigurations(FrontendIPConfigurationArgs... loadBalancerFrontendIpConfigurations) {
            return loadBalancerFrontendIpConfigurations(List.of(loadBalancerFrontendIpConfigurations));
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
         * @param visibility The visibility list of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<PrivateLinkServicePropertiesVisibilityArgs> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility The visibility list of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder visibility(PrivateLinkServicePropertiesVisibilityArgs visibility) {
            return visibility(Output.of(visibility));
        }

        public PrivateLinkServiceArgs build() {
            return $;
        }
    }

}
