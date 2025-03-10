// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs();

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
    private Output<Boolean> override;

    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Output<Boolean> override() {
        return this.override;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy", required=true)
    private Output<String> referrerPolicy;

    /**
     * @return The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    public Output<String> referrerPolicy() {
        return this.referrerPolicy;
    }

    private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs() {}

    private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs $) {
        this.override = $.override;
        this.referrerPolicy = $.referrerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs();
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs defaults) {
            $ = new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param override A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        /**
         * @param override A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        /**
         * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
         * 
         * @return builder
         * 
         */
        public Builder referrerPolicy(Output<String> referrerPolicy) {
            $.referrerPolicy = referrerPolicy;
            return this;
        }

        /**
         * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
         * 
         * @return builder
         * 
         */
        public Builder referrerPolicy(String referrerPolicy) {
            return referrerPolicy(Output.of(referrerPolicy));
        }

        public ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs build() {
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            $.referrerPolicy = Objects.requireNonNull($.referrerPolicy, "expected parameter 'referrerPolicy' to be non-null");
            return $;
        }
    }

}
