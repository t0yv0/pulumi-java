// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLExcludedRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLRuleGroupReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLRuleGroupReferenceStatementArgs Empty = new WebACLRuleGroupReferenceStatementArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    @Import(name="excludedRules")
    private @Nullable Output<List<WebACLExcludedRuleArgs>> excludedRules;

    public Optional<Output<List<WebACLExcludedRuleArgs>>> excludedRules() {
        return Optional.ofNullable(this.excludedRules);
    }

    private WebACLRuleGroupReferenceStatementArgs() {}

    private WebACLRuleGroupReferenceStatementArgs(WebACLRuleGroupReferenceStatementArgs $) {
        this.arn = $.arn;
        this.excludedRules = $.excludedRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLRuleGroupReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLRuleGroupReferenceStatementArgs $;

        public Builder() {
            $ = new WebACLRuleGroupReferenceStatementArgs();
        }

        public Builder(WebACLRuleGroupReferenceStatementArgs defaults) {
            $ = new WebACLRuleGroupReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder excludedRules(@Nullable Output<List<WebACLExcludedRuleArgs>> excludedRules) {
            $.excludedRules = excludedRules;
            return this;
        }

        public Builder excludedRules(List<WebACLExcludedRuleArgs> excludedRules) {
            return excludedRules(Output.of(excludedRules));
        }

        public Builder excludedRules(WebACLExcludedRuleArgs... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }

        public WebACLRuleGroupReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
