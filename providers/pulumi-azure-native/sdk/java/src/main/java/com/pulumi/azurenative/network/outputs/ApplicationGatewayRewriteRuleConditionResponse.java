// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRewriteRuleConditionResponse {
    /**
     * @return Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     * 
     */
    private final @Nullable Boolean ignoreCase;
    /**
     * @return Setting this value as truth will force to check the negation of the condition given by the user.
     * 
     */
    private final @Nullable Boolean negate;
    /**
     * @return The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    private final @Nullable String pattern;
    /**
     * @return The condition parameter of the RewriteRuleCondition.
     * 
     */
    private final @Nullable String variable;

    @CustomType.Constructor
    private ApplicationGatewayRewriteRuleConditionResponse(
        @CustomType.Parameter("ignoreCase") @Nullable Boolean ignoreCase,
        @CustomType.Parameter("negate") @Nullable Boolean negate,
        @CustomType.Parameter("pattern") @Nullable String pattern,
        @CustomType.Parameter("variable") @Nullable String variable) {
        this.ignoreCase = ignoreCase;
        this.negate = negate;
        this.pattern = pattern;
        this.variable = variable;
    }

    /**
     * @return Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     * 
     */
    public Optional<Boolean> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    /**
     * @return Setting this value as truth will force to check the negation of the condition given by the user.
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    /**
     * @return The condition parameter of the RewriteRuleCondition.
     * 
     */
    public Optional<String> variable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreCase;
        private @Nullable Boolean negate;
        private @Nullable String pattern;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.negate = defaults.negate;
    	      this.pattern = defaults.pattern;
    	      this.variable = defaults.variable;
        }

        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Builder negate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }
        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }
        public Builder variable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }        public ApplicationGatewayRewriteRuleConditionResponse build() {
            return new ApplicationGatewayRewriteRuleConditionResponse(ignoreCase, negate, pattern, variable);
        }
    }
}
