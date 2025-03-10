// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.azure.frontdoor.inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyManagedRuleOverrideRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyManagedRuleOverrideRuleArgs Empty = new FirewallPolicyManagedRuleOverrideRuleArgs();

    /**
     * The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Is the managed rule override enabled or disabled. Defaults to `false`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the managed rule override enabled or disabled. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * One or more `exclusion` blocks as defined below.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<List<FirewallPolicyManagedRuleOverrideRuleExclusionArgs>> exclusions;

    /**
     * @return One or more `exclusion` blocks as defined below.
     * 
     */
    public Optional<Output<List<FirewallPolicyManagedRuleOverrideRuleExclusionArgs>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * Identifier for the managed rule.
     * 
     */
    @Import(name="ruleId", required=true)
    private Output<String> ruleId;

    /**
     * @return Identifier for the managed rule.
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }

    private FirewallPolicyManagedRuleOverrideRuleArgs() {}

    private FirewallPolicyManagedRuleOverrideRuleArgs(FirewallPolicyManagedRuleOverrideRuleArgs $) {
        this.action = $.action;
        this.enabled = $.enabled;
        this.exclusions = $.exclusions;
        this.ruleId = $.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyManagedRuleOverrideRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyManagedRuleOverrideRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyManagedRuleOverrideRuleArgs();
        }

        public Builder(FirewallPolicyManagedRuleOverrideRuleArgs defaults) {
            $ = new FirewallPolicyManagedRuleOverrideRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to be applied when the rule matches. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param enabled Is the managed rule override enabled or disabled. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the managed rule override enabled or disabled. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<List<FirewallPolicyManagedRuleOverrideRuleExclusionArgs>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(List<FirewallPolicyManagedRuleOverrideRuleExclusionArgs> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param exclusions One or more `exclusion` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(FirewallPolicyManagedRuleOverrideRuleExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }

        /**
         * @param ruleId Identifier for the managed rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId Identifier for the managed rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public FirewallPolicyManagedRuleOverrideRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            return $;
        }
    }

}
