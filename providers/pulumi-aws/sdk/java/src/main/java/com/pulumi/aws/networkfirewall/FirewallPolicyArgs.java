// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall;

import com.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    /**
     * A friendly description of the firewall policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A friendly description of the firewall policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    @Import(name="firewallPolicy", required=true)
    private Output<FirewallPolicyFirewallPolicyArgs> firewallPolicy;

    /**
     * @return A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    public Output<FirewallPolicyFirewallPolicyArgs> firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * A friendly name of the firewall policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name of the firewall policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FirewallPolicyArgs() {}

    private FirewallPolicyArgs(FirewallPolicyArgs $) {
        this.description = $.description;
        this.firewallPolicy = $.firewallPolicy;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyArgs $;

        public Builder() {
            $ = new FirewallPolicyArgs();
        }

        public Builder(FirewallPolicyArgs defaults) {
            $ = new FirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A friendly description of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A friendly description of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(Output<FirewallPolicyFirewallPolicyArgs> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        /**
         * @param firewallPolicy A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicy(FirewallPolicyFirewallPolicyArgs firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        /**
         * @param name A friendly name of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name of the firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FirewallPolicyArgs build() {
            $.firewallPolicy = Objects.requireNonNull($.firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
            return $;
        }
    }

}
