// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupAndStatement {
    private final List<RuleGroupStatement> statements;

    @CustomType.Constructor
    private RuleGroupAndStatement(@CustomType.Parameter("statements") List<RuleGroupStatement> statements) {
        this.statements = statements;
    }

    public List<RuleGroupStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(RuleGroupStatement... statements) {
            return statements(List.of(statements));
        }        public RuleGroupAndStatement build() {
            return new RuleGroupAndStatement(statements);
        }
    }
}
