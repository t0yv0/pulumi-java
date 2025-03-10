// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementByteMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementGeoMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementLabelMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs();

    /**
     * Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    /**
     * @return Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementByteMatchStatementArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    /**
     * @return Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementGeoMatchStatementArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    /**
     * @return Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    /**
     * @return Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementLabelMatchStatementArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    /**
     * @return Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    /**
     * @return Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    /**
     * @return Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs $) {
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        /**
         * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        /**
         * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        /**
         * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        /**
         * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        /**
         * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        /**
         * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementArgs build() {
            return $;
        }
    }

}
