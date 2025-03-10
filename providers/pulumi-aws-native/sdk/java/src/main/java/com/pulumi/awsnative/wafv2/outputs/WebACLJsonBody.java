// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.enums.WebACLBodyParsingFallbackBehavior;
import com.pulumi.awsnative.wafv2.enums.WebACLJsonMatchScope;
import com.pulumi.awsnative.wafv2.outputs.WebACLJsonMatchPattern;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLJsonBody {
    private final @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior;
    private final WebACLJsonMatchPattern matchPattern;
    private final WebACLJsonMatchScope matchScope;

    @CustomType.Constructor
    private WebACLJsonBody(
        @CustomType.Parameter("invalidFallbackBehavior") @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior,
        @CustomType.Parameter("matchPattern") WebACLJsonMatchPattern matchPattern,
        @CustomType.Parameter("matchScope") WebACLJsonMatchScope matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = matchPattern;
        this.matchScope = matchScope;
    }

    public Optional<WebACLBodyParsingFallbackBehavior> invalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }
    public WebACLJsonMatchPattern matchPattern() {
        return this.matchPattern;
    }
    public WebACLJsonMatchScope matchScope() {
        return this.matchScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior;
        private WebACLJsonMatchPattern matchPattern;
        private WebACLJsonMatchScope matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder invalidFallbackBehavior(@Nullable WebACLBodyParsingFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }
        public Builder matchPattern(WebACLJsonMatchPattern matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }
        public Builder matchScope(WebACLJsonMatchScope matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }        public WebACLJsonBody build() {
            return new WebACLJsonBody(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
