// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.InboundEndpointIPConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InboundEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundEndpointArgs Empty = new InboundEndpointArgs();

    /**
     * The name of the DNS resolver.
     * 
     */
    @Import(name="dnsResolverName", required=true)
    private Output<String> dnsResolverName;

    /**
     * @return The name of the DNS resolver.
     * 
     */
    public Output<String> dnsResolverName() {
        return this.dnsResolverName;
    }

    /**
     * The name of the inbound endpoint for the DNS resolver.
     * 
     */
    @Import(name="inboundEndpointName")
    private @Nullable Output<String> inboundEndpointName;

    /**
     * @return The name of the inbound endpoint for the DNS resolver.
     * 
     */
    public Optional<Output<String>> inboundEndpointName() {
        return Optional.ofNullable(this.inboundEndpointName);
    }

    /**
     * IP configurations for the inbound endpoint.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<InboundEndpointIPConfigurationArgs>> ipConfigurations;

    /**
     * @return IP configurations for the inbound endpoint.
     * 
     */
    public Optional<Output<List<InboundEndpointIPConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    private InboundEndpointArgs() {}

    private InboundEndpointArgs(InboundEndpointArgs $) {
        this.dnsResolverName = $.dnsResolverName;
        this.inboundEndpointName = $.inboundEndpointName;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundEndpointArgs $;

        public Builder() {
            $ = new InboundEndpointArgs();
        }

        public Builder(InboundEndpointArgs defaults) {
            $ = new InboundEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsResolverName The name of the DNS resolver.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolverName(Output<String> dnsResolverName) {
            $.dnsResolverName = dnsResolverName;
            return this;
        }

        /**
         * @param dnsResolverName The name of the DNS resolver.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolverName(String dnsResolverName) {
            return dnsResolverName(Output.of(dnsResolverName));
        }

        /**
         * @param inboundEndpointName The name of the inbound endpoint for the DNS resolver.
         * 
         * @return builder
         * 
         */
        public Builder inboundEndpointName(@Nullable Output<String> inboundEndpointName) {
            $.inboundEndpointName = inboundEndpointName;
            return this;
        }

        /**
         * @param inboundEndpointName The name of the inbound endpoint for the DNS resolver.
         * 
         * @return builder
         * 
         */
        public Builder inboundEndpointName(String inboundEndpointName) {
            return inboundEndpointName(Output.of(inboundEndpointName));
        }

        /**
         * @param ipConfigurations IP configurations for the inbound endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(@Nullable Output<List<InboundEndpointIPConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations IP configurations for the inbound endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<InboundEndpointIPConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations IP configurations for the inbound endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(InboundEndpointIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        public InboundEndpointArgs build() {
            $.dnsResolverName = Objects.requireNonNull($.dnsResolverName, "expected parameter 'dnsResolverName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
