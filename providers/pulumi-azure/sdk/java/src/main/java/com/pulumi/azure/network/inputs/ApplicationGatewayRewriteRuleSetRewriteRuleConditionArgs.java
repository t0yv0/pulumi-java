// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs Empty = new ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs();

    /**
     * Perform a case in-sensitive comparison. Defaults to `false`
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    /**
     * @return Perform a case in-sensitive comparison. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * Negate the result of the condition evaluation. Defaults to `false`
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return Negate the result of the condition evaluation. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    /**
     * @return The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    /**
     * The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
     * 
     */
    @Import(name="variable", required=true)
    private Output<String> variable;

    /**
     * @return The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
     * 
     */
    public Output<String> variable() {
        return this.variable;
    }

    private ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs() {}

    private ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs(ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs $) {
        this.ignoreCase = $.ignoreCase;
        this.negate = $.negate;
        this.pattern = $.pattern;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs $;

        public Builder() {
            $ = new ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs();
        }

        public Builder(ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs defaults) {
            $ = new ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreCase Perform a case in-sensitive comparison. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * @param ignoreCase Perform a case in-sensitive comparison. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        /**
         * @param negate Negate the result of the condition evaluation. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate Negate the result of the condition evaluation. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param pattern The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
         * 
         * @return builder
         * 
         */
        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param variable The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
         * 
         * @return builder
         * 
         */
        public Builder variable(Output<String> variable) {
            $.variable = variable;
            return this;
        }

        /**
         * @param variable The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
         * 
         * @return builder
         * 
         */
        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public ApplicationGatewayRewriteRuleSetRewriteRuleConditionArgs build() {
            $.pattern = Objects.requireNonNull($.pattern, "expected parameter 'pattern' to be non-null");
            $.variable = Objects.requireNonNull($.variable, "expected parameter 'variable' to be non-null");
            return $;
        }
    }

}
