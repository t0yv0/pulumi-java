// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs();

    /**
     * Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    @Import(name="forward", required=true)
    private Output<String> forward;

    /**
     * @return Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    public Output<String> forward() {
        return this.forward;
    }

    /**
     * If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    @Import(name="whitelistedNames")
    private @Nullable Output<List<String>> whitelistedNames;

    /**
     * @return If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    public Optional<Output<List<String>>> whitelistedNames() {
        return Optional.ofNullable(this.whitelistedNames);
    }

    private DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs() {}

    private DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs $) {
        this.forward = $.forward;
        this.whitelistedNames = $.whitelistedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs $;

        public Builder() {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs();
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs defaults) {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forward Specifies whether you want CloudFront to forward
         * cookies to the origin that is associated with this cache behavior. You can
         * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
         * subsequent `whitelisted_names`
         * 
         * @return builder
         * 
         */
        public Builder forward(Output<String> forward) {
            $.forward = forward;
            return this;
        }

        /**
         * @param forward Specifies whether you want CloudFront to forward
         * cookies to the origin that is associated with this cache behavior. You can
         * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
         * subsequent `whitelisted_names`
         * 
         * @return builder
         * 
         */
        public Builder forward(String forward) {
            return forward(Output.of(forward));
        }

        /**
         * @param whitelistedNames If you have specified `whitelist` to
         * `forward`, the whitelisted cookies that you want CloudFront to forward to
         * your origin.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedNames(@Nullable Output<List<String>> whitelistedNames) {
            $.whitelistedNames = whitelistedNames;
            return this;
        }

        /**
         * @param whitelistedNames If you have specified `whitelist` to
         * `forward`, the whitelisted cookies that you want CloudFront to forward to
         * your origin.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedNames(List<String> whitelistedNames) {
            return whitelistedNames(Output.of(whitelistedNames));
        }

        /**
         * @param whitelistedNames If you have specified `whitelist` to
         * `forward`, the whitelisted cookies that you want CloudFront to forward to
         * your origin.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedNames(String... whitelistedNames) {
            return whitelistedNames(List.of(whitelistedNames));
        }

        public DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs build() {
            $.forward = Objects.requireNonNull($.forward, "expected parameter 'forward' to be non-null");
            return $;
        }
    }

}
