// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
