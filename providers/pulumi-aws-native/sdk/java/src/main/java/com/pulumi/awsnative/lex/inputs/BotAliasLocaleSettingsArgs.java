// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasCodeHookSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * You can use this parameter to specify a specific Lambda function to run different functions in different locales.
 * 
 */
public final class BotAliasLocaleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasLocaleSettingsArgs Empty = new BotAliasLocaleSettingsArgs();

    @Import(name="codeHookSpecification")
    private @Nullable Output<BotAliasCodeHookSpecificationArgs> codeHookSpecification;

    public Optional<Output<BotAliasCodeHookSpecificationArgs>> codeHookSpecification() {
        return Optional.ofNullable(this.codeHookSpecification);
    }

    /**
     * Whether the Lambda code hook is enabled
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the Lambda code hook is enabled
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BotAliasLocaleSettingsArgs() {}

    private BotAliasLocaleSettingsArgs(BotAliasLocaleSettingsArgs $) {
        this.codeHookSpecification = $.codeHookSpecification;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasLocaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLocaleSettingsArgs $;

        public Builder() {
            $ = new BotAliasLocaleSettingsArgs();
        }

        public Builder(BotAliasLocaleSettingsArgs defaults) {
            $ = new BotAliasLocaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder codeHookSpecification(@Nullable Output<BotAliasCodeHookSpecificationArgs> codeHookSpecification) {
            $.codeHookSpecification = codeHookSpecification;
            return this;
        }

        public Builder codeHookSpecification(BotAliasCodeHookSpecificationArgs codeHookSpecification) {
            return codeHookSpecification(Output.of(codeHookSpecification));
        }

        /**
         * @param enabled Whether the Lambda code hook is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the Lambda code hook is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BotAliasLocaleSettingsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
