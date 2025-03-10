// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupArgs Empty = new GetRuleGroupArgs();

    @Import(name="ruleGroupArn", required=true)
    private String ruleGroupArn;

    public String ruleGroupArn() {
        return this.ruleGroupArn;
    }

    private GetRuleGroupArgs() {}

    private GetRuleGroupArgs(GetRuleGroupArgs $) {
        this.ruleGroupArn = $.ruleGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleGroupArgs $;

        public Builder() {
            $ = new GetRuleGroupArgs();
        }

        public Builder(GetRuleGroupArgs defaults) {
            $ = new GetRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleGroupArn(String ruleGroupArn) {
            $.ruleGroupArn = ruleGroupArn;
            return this;
        }

        public GetRuleGroupArgs build() {
            $.ruleGroupArn = Objects.requireNonNull($.ruleGroupArn, "expected parameter 'ruleGroupArn' to be non-null");
            return $;
        }
    }

}
