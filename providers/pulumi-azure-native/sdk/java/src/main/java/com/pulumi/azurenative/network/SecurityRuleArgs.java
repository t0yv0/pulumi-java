// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.SecurityRuleAccess;
import com.pulumi.azurenative.network.enums.SecurityRuleDirection;
import com.pulumi.azurenative.network.enums.SecurityRuleProtocol;
import com.pulumi.azurenative.network.inputs.ApplicationSecurityGroupArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityRuleArgs Empty = new SecurityRuleArgs();

    /**
     * The network traffic is allowed or denied.
     * 
     */
    @Import(name="access", required=true)
    private Output<Either<String,SecurityRuleAccess>> access;

    /**
     * @return The network traffic is allowed or denied.
     * 
     */
    public Output<Either<String,SecurityRuleAccess>> access() {
        return this.access;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used.
     * 
     */
    @Import(name="destinationAddressPrefix")
    private @Nullable Output<String> destinationAddressPrefix;

    /**
     * @return The destination address prefix. CIDR or destination IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used.
     * 
     */
    public Optional<Output<String>> destinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @Import(name="destinationAddressPrefixes")
    private @Nullable Output<List<String>> destinationAddressPrefixes;

    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public Optional<Output<List<String>>> destinationAddressPrefixes() {
        return Optional.ofNullable(this.destinationAddressPrefixes);
    }

    /**
     * The application security group specified as destination.
     * 
     */
    @Import(name="destinationApplicationSecurityGroups")
    private @Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups;

    /**
     * @return The application security group specified as destination.
     * 
     */
    public Optional<Output<List<ApplicationSecurityGroupArgs>>> destinationApplicationSecurityGroups() {
        return Optional.ofNullable(this.destinationApplicationSecurityGroups);
    }

    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
     * 
     */
    @Import(name="destinationPortRange")
    private @Nullable Output<String> destinationPortRange;

    /**
     * @return The destination port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
     * 
     */
    public Optional<Output<String>> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }

    /**
     * The destination port ranges.
     * 
     */
    @Import(name="destinationPortRanges")
    private @Nullable Output<List<String>> destinationPortRanges;

    /**
     * @return The destination port ranges.
     * 
     */
    public Optional<Output<List<String>>> destinationPortRanges() {
        return Optional.ofNullable(this.destinationPortRanges);
    }

    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @Import(name="direction", required=true)
    private Output<Either<String,SecurityRuleDirection>> direction;

    /**
     * @return The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    public Output<Either<String,SecurityRuleDirection>> direction() {
        return this.direction;
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
     * The name of the network security group.
     * 
     */
    @Import(name="networkSecurityGroupName", required=true)
    private Output<String> networkSecurityGroupName;

    /**
     * @return The name of the network security group.
     * 
     */
    public Output<String> networkSecurityGroupName() {
        return this.networkSecurityGroupName;
    }

    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,SecurityRuleProtocol>> protocol;

    /**
     * @return Network protocol this rule applies to.
     * 
     */
    public Output<Either<String,SecurityRuleProtocol>> protocol() {
        return this.protocol;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the security rule.
     * 
     */
    @Import(name="securityRuleName")
    private @Nullable Output<String> securityRuleName;

    /**
     * @return The name of the security rule.
     * 
     */
    public Optional<Output<String>> securityRuleName() {
        return Optional.ofNullable(this.securityRuleName);
    }

    /**
     * The CIDR or source IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    @Import(name="sourceAddressPrefix")
    private @Nullable Output<String> sourceAddressPrefix;

    /**
     * @return The CIDR or source IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    public Optional<Output<String>> sourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @Import(name="sourceAddressPrefixes")
    private @Nullable Output<List<String>> sourceAddressPrefixes;

    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    public Optional<Output<List<String>>> sourceAddressPrefixes() {
        return Optional.ofNullable(this.sourceAddressPrefixes);
    }

    /**
     * The application security group specified as source.
     * 
     */
    @Import(name="sourceApplicationSecurityGroups")
    private @Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups;

    /**
     * @return The application security group specified as source.
     * 
     */
    public Optional<Output<List<ApplicationSecurityGroupArgs>>> sourceApplicationSecurityGroups() {
        return Optional.ofNullable(this.sourceApplicationSecurityGroups);
    }

    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
     * 
     */
    @Import(name="sourcePortRange")
    private @Nullable Output<String> sourcePortRange;

    /**
     * @return The source port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
     * 
     */
    public Optional<Output<String>> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    /**
     * The source port ranges.
     * 
     */
    @Import(name="sourcePortRanges")
    private @Nullable Output<List<String>> sourcePortRanges;

    /**
     * @return The source port ranges.
     * 
     */
    public Optional<Output<List<String>>> sourcePortRanges() {
        return Optional.ofNullable(this.sourcePortRanges);
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SecurityRuleArgs() {}

    private SecurityRuleArgs(SecurityRuleArgs $) {
        this.access = $.access;
        this.description = $.description;
        this.destinationAddressPrefix = $.destinationAddressPrefix;
        this.destinationAddressPrefixes = $.destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = $.destinationApplicationSecurityGroups;
        this.destinationPortRange = $.destinationPortRange;
        this.destinationPortRanges = $.destinationPortRanges;
        this.direction = $.direction;
        this.id = $.id;
        this.name = $.name;
        this.networkSecurityGroupName = $.networkSecurityGroupName;
        this.priority = $.priority;
        this.protocol = $.protocol;
        this.resourceGroupName = $.resourceGroupName;
        this.securityRuleName = $.securityRuleName;
        this.sourceAddressPrefix = $.sourceAddressPrefix;
        this.sourceAddressPrefixes = $.sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = $.sourceApplicationSecurityGroups;
        this.sourcePortRange = $.sourcePortRange;
        this.sourcePortRanges = $.sourcePortRanges;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityRuleArgs $;

        public Builder() {
            $ = new SecurityRuleArgs();
        }

        public Builder(SecurityRuleArgs defaults) {
            $ = new SecurityRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access The network traffic is allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder access(Output<Either<String,SecurityRuleAccess>> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access The network traffic is allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder access(Either<String,SecurityRuleAccess> access) {
            return access(Output.of(access));
        }

        /**
         * @param access The network traffic is allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Either.ofLeft(access));
        }

        /**
         * @param access The network traffic is allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder access(SecurityRuleAccess access) {
            return access(Either.ofRight(access));
        }

        /**
         * @param description A description for this rule. Restricted to 140 chars.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this rule. Restricted to 140 chars.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationAddressPrefix The destination address prefix. CIDR or destination IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressPrefix(@Nullable Output<String> destinationAddressPrefix) {
            $.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        /**
         * @param destinationAddressPrefix The destination address prefix. CIDR or destination IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressPrefix(String destinationAddressPrefix) {
            return destinationAddressPrefix(Output.of(destinationAddressPrefix));
        }

        /**
         * @param destinationAddressPrefixes The destination address prefixes. CIDR or destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressPrefixes(@Nullable Output<List<String>> destinationAddressPrefixes) {
            $.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }

        /**
         * @param destinationAddressPrefixes The destination address prefixes. CIDR or destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressPrefixes(List<String> destinationAddressPrefixes) {
            return destinationAddressPrefixes(Output.of(destinationAddressPrefixes));
        }

        /**
         * @param destinationAddressPrefixes The destination address prefixes. CIDR or destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddressPrefixes(String... destinationAddressPrefixes) {
            return destinationAddressPrefixes(List.of(destinationAddressPrefixes));
        }

        /**
         * @param destinationApplicationSecurityGroups The application security group specified as destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationApplicationSecurityGroups(@Nullable Output<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups) {
            $.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }

        /**
         * @param destinationApplicationSecurityGroups The application security group specified as destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationApplicationSecurityGroups(List<ApplicationSecurityGroupArgs> destinationApplicationSecurityGroups) {
            return destinationApplicationSecurityGroups(Output.of(destinationApplicationSecurityGroups));
        }

        /**
         * @param destinationApplicationSecurityGroups The application security group specified as destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationApplicationSecurityGroups(ApplicationSecurityGroupArgs... destinationApplicationSecurityGroups) {
            return destinationApplicationSecurityGroups(List.of(destinationApplicationSecurityGroups));
        }

        /**
         * @param destinationPortRange The destination port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRange(@Nullable Output<String> destinationPortRange) {
            $.destinationPortRange = destinationPortRange;
            return this;
        }

        /**
         * @param destinationPortRange The destination port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRange(String destinationPortRange) {
            return destinationPortRange(Output.of(destinationPortRange));
        }

        /**
         * @param destinationPortRanges The destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(@Nullable Output<List<String>> destinationPortRanges) {
            $.destinationPortRanges = destinationPortRanges;
            return this;
        }

        /**
         * @param destinationPortRanges The destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(List<String> destinationPortRanges) {
            return destinationPortRanges(Output.of(destinationPortRanges));
        }

        /**
         * @param destinationPortRanges The destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }

        /**
         * @param direction The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<Either<String,SecurityRuleDirection>> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
         * 
         * @return builder
         * 
         */
        public Builder direction(Either<String,SecurityRuleDirection> direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param direction The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Either.ofLeft(direction));
        }

        /**
         * @param direction The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
         * 
         * @return builder
         * 
         */
        public Builder direction(SecurityRuleDirection direction) {
            return direction(Either.ofRight(direction));
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
         * @param networkSecurityGroupName The name of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupName(Output<String> networkSecurityGroupName) {
            $.networkSecurityGroupName = networkSecurityGroupName;
            return this;
        }

        /**
         * @param networkSecurityGroupName The name of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupName(String networkSecurityGroupName) {
            return networkSecurityGroupName(Output.of(networkSecurityGroupName));
        }

        /**
         * @param priority The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param protocol Network protocol this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<Either<String,SecurityRuleProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Network protocol this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,SecurityRuleProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol Network protocol this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol Network protocol this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder protocol(SecurityRuleProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityRuleName The name of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder securityRuleName(@Nullable Output<String> securityRuleName) {
            $.securityRuleName = securityRuleName;
            return this;
        }

        /**
         * @param securityRuleName The name of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder securityRuleName(String securityRuleName) {
            return securityRuleName(Output.of(securityRuleName));
        }

        /**
         * @param sourceAddressPrefix The CIDR or source IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used. If this is an ingress rule, specifies where network traffic originates from.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressPrefix(@Nullable Output<String> sourceAddressPrefix) {
            $.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        /**
         * @param sourceAddressPrefix The CIDR or source IP range. Asterisk &#39;*&#39; can also be used to match all source IPs. Default tags such as &#39;VirtualNetwork&#39;, &#39;AzureLoadBalancer&#39; and &#39;Internet&#39; can also be used. If this is an ingress rule, specifies where network traffic originates from.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            return sourceAddressPrefix(Output.of(sourceAddressPrefix));
        }

        /**
         * @param sourceAddressPrefixes The CIDR or source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressPrefixes(@Nullable Output<List<String>> sourceAddressPrefixes) {
            $.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }

        /**
         * @param sourceAddressPrefixes The CIDR or source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressPrefixes(List<String> sourceAddressPrefixes) {
            return sourceAddressPrefixes(Output.of(sourceAddressPrefixes));
        }

        /**
         * @param sourceAddressPrefixes The CIDR or source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddressPrefixes(String... sourceAddressPrefixes) {
            return sourceAddressPrefixes(List.of(sourceAddressPrefixes));
        }

        /**
         * @param sourceApplicationSecurityGroups The application security group specified as source.
         * 
         * @return builder
         * 
         */
        public Builder sourceApplicationSecurityGroups(@Nullable Output<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups) {
            $.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }

        /**
         * @param sourceApplicationSecurityGroups The application security group specified as source.
         * 
         * @return builder
         * 
         */
        public Builder sourceApplicationSecurityGroups(List<ApplicationSecurityGroupArgs> sourceApplicationSecurityGroups) {
            return sourceApplicationSecurityGroups(Output.of(sourceApplicationSecurityGroups));
        }

        /**
         * @param sourceApplicationSecurityGroups The application security group specified as source.
         * 
         * @return builder
         * 
         */
        public Builder sourceApplicationSecurityGroups(ApplicationSecurityGroupArgs... sourceApplicationSecurityGroups) {
            return sourceApplicationSecurityGroups(List.of(sourceApplicationSecurityGroups));
        }

        /**
         * @param sourcePortRange The source port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(@Nullable Output<String> sourcePortRange) {
            $.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * @param sourcePortRange The source port or range. Integer or range between 0 and 65535. Asterisk &#39;*&#39; can also be used to match all ports.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(String sourcePortRange) {
            return sourcePortRange(Output.of(sourcePortRange));
        }

        /**
         * @param sourcePortRanges The source port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(@Nullable Output<List<String>> sourcePortRanges) {
            $.sourcePortRanges = sourcePortRanges;
            return this;
        }

        /**
         * @param sourcePortRanges The source port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            return sourcePortRanges(Output.of(sourcePortRanges));
        }

        /**
         * @param sourcePortRanges The source port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }

        /**
         * @param type The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SecurityRuleArgs build() {
            $.access = Objects.requireNonNull($.access, "expected parameter 'access' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.networkSecurityGroupName = Objects.requireNonNull($.networkSecurityGroupName, "expected parameter 'networkSecurityGroupName' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
