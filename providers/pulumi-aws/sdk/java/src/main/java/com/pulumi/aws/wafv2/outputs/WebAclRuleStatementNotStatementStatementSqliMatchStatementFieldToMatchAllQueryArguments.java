// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments {
    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments build() {
            return new WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments();
        }
    }
}
