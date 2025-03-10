// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayRewriteRuleSetRewriteRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRewriteRuleSet {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private final @Nullable String id;
    /**
     * @return Unique name of the rewrite rule set block
     * 
     */
    private final String name;
    /**
     * @return One or more `rewrite_rule` blocks as defined above.
     * 
     */
    private final @Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules;

    @CustomType.Constructor
    private ApplicationGatewayRewriteRuleSet(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rewriteRules") @Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules) {
        this.id = id;
        this.name = name;
        this.rewriteRules = rewriteRules;
    }

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Unique name of the rewrite rule set block
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return One or more `rewrite_rule` blocks as defined above.
     * 
     */
    public List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules() {
        return this.rewriteRules == null ? List.of() : this.rewriteRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private @Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rewriteRules = defaults.rewriteRules;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rewriteRules(@Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules) {
            this.rewriteRules = rewriteRules;
            return this;
        }
        public Builder rewriteRules(ApplicationGatewayRewriteRuleSetRewriteRule... rewriteRules) {
            return rewriteRules(List.of(rewriteRules));
        }        public ApplicationGatewayRewriteRuleSet build() {
            return new ApplicationGatewayRewriteRuleSet(id, name, rewriteRules);
        }
    }
}
