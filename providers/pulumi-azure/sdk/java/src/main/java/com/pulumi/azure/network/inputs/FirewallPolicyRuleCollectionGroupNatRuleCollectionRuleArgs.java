// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs Empty = new FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs();

    /**
     * The destination IP address (including CIDR).
     * 
     */
    @Import(name="destinationAddress")
    private @Nullable Output<String> destinationAddress;

    /**
     * @return The destination IP address (including CIDR).
     * 
     */
    public Optional<Output<String>> destinationAddress() {
        return Optional.ofNullable(this.destinationAddress);
    }

    /**
     * Specifies a list of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<String>> destinationPorts;

    /**
     * @return Specifies a list of destination ports.
     * 
     */
    public Optional<Output<List<String>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * The name which should be used for this rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    @Import(name="protocols", required=true)
    private Output<List<String>> protocols;

    /**
     * @return Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    public Output<List<String>> protocols() {
        return this.protocols;
    }

    /**
     * Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * Specifies a list of source IP groups.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    /**
     * @return Specifies a list of source IP groups.
     * 
     */
    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    /**
     * Specifies the translated address.
     * 
     */
    @Import(name="translatedAddress")
    private @Nullable Output<String> translatedAddress;

    /**
     * @return Specifies the translated address.
     * 
     */
    public Optional<Output<String>> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }

    /**
     * Specifies the translated FQDN.
     * 
     */
    @Import(name="translatedFqdn")
    private @Nullable Output<String> translatedFqdn;

    /**
     * @return Specifies the translated FQDN.
     * 
     */
    public Optional<Output<String>> translatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }

    /**
     * Specifies the translated port.
     * 
     */
    @Import(name="translatedPort", required=true)
    private Output<Integer> translatedPort;

    /**
     * @return Specifies the translated port.
     * 
     */
    public Output<Integer> translatedPort() {
        return this.translatedPort;
    }

    private FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs() {}

    private FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs(FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs $) {
        this.destinationAddress = $.destinationAddress;
        this.destinationPorts = $.destinationPorts;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.translatedAddress = $.translatedAddress;
        this.translatedFqdn = $.translatedFqdn;
        this.translatedPort = $.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs();
        }

        public Builder(FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs defaults) {
            $ = new FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationAddress The destination IP address (including CIDR).
         * 
         * @return builder
         * 
         */
        public Builder destinationAddress(@Nullable Output<String> destinationAddress) {
            $.destinationAddress = destinationAddress;
            return this;
        }

        /**
         * @param destinationAddress The destination IP address (including CIDR).
         * 
         * @return builder
         * 
         */
        public Builder destinationAddress(String destinationAddress) {
            return destinationAddress(Output.of(destinationAddress));
        }

        /**
         * @param destinationPorts Specifies a list of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts Specifies a list of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(List<String> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param destinationPorts Specifies a list of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param name The name which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        /**
         * @param translatedAddress Specifies the translated address.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            $.translatedAddress = translatedAddress;
            return this;
        }

        /**
         * @param translatedAddress Specifies the translated address.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(String translatedAddress) {
            return translatedAddress(Output.of(translatedAddress));
        }

        /**
         * @param translatedFqdn Specifies the translated FQDN.
         * 
         * @return builder
         * 
         */
        public Builder translatedFqdn(@Nullable Output<String> translatedFqdn) {
            $.translatedFqdn = translatedFqdn;
            return this;
        }

        /**
         * @param translatedFqdn Specifies the translated FQDN.
         * 
         * @return builder
         * 
         */
        public Builder translatedFqdn(String translatedFqdn) {
            return translatedFqdn(Output.of(translatedFqdn));
        }

        /**
         * @param translatedPort Specifies the translated port.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(Output<Integer> translatedPort) {
            $.translatedPort = translatedPort;
            return this;
        }

        /**
         * @param translatedPort Specifies the translated port.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(Integer translatedPort) {
            return translatedPort(Output.of(translatedPort));
        }

        public FirewallPolicyRuleCollectionGroupNatRuleCollectionRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocols = Objects.requireNonNull($.protocols, "expected parameter 'protocols' to be non-null");
            $.translatedPort = Objects.requireNonNull($.translatedPort, "expected parameter 'translatedPort' to be non-null");
            return $;
        }
    }

}
