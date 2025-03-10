// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs Empty = new InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs();

    @Import(name="externalIpv6")
    private @Nullable Output<String> externalIpv6;

    public Optional<Output<String>> externalIpv6() {
        return Optional.ofNullable(this.externalIpv6);
    }

    @Import(name="externalIpv6PrefixLength")
    private @Nullable Output<String> externalIpv6PrefixLength;

    public Optional<Output<String>> externalIpv6PrefixLength() {
        return Optional.ofNullable(this.externalIpv6PrefixLength);
    }

    @Import(name="networkTier", required=true)
    private Output<String> networkTier;

    public Output<String> networkTier() {
        return this.networkTier;
    }

    @Import(name="publicPtrDomainName")
    private @Nullable Output<String> publicPtrDomainName;

    public Optional<Output<String>> publicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    private InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs() {}

    private InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs $) {
        this.externalIpv6 = $.externalIpv6;
        this.externalIpv6PrefixLength = $.externalIpv6PrefixLength;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs $;

        public Builder() {
            $ = new InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs();
        }

        public Builder(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs defaults) {
            $ = new InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalIpv6(@Nullable Output<String> externalIpv6) {
            $.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder externalIpv6(String externalIpv6) {
            return externalIpv6(Output.of(externalIpv6));
        }

        public Builder externalIpv6PrefixLength(@Nullable Output<String> externalIpv6PrefixLength) {
            $.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder externalIpv6PrefixLength(String externalIpv6PrefixLength) {
            return externalIpv6PrefixLength(Output.of(externalIpv6PrefixLength));
        }

        public Builder networkTier(Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            return publicPtrDomainName(Output.of(publicPtrDomainName));
        }

        public InstanceFromTemplateNetworkInterfaceIpv6AccessConfigArgs build() {
            $.networkTier = Objects.requireNonNull($.networkTier, "expected parameter 'networkTier' to be non-null");
            return $;
        }
    }

}
