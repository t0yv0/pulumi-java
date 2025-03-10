// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2LikelihoodAdjustmentFixedLikelihood;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message for specifying an adjustment to the likelihood of a finding as part of a detection rule.
 * 
 */
public final class GooglePrivacyDlpV2LikelihoodAdjustmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LikelihoodAdjustmentArgs Empty = new GooglePrivacyDlpV2LikelihoodAdjustmentArgs();

    /**
     * Set the likelihood of a finding to a fixed value.
     * 
     */
    @Import(name="fixedLikelihood")
    private @Nullable Output<GooglePrivacyDlpV2LikelihoodAdjustmentFixedLikelihood> fixedLikelihood;

    /**
     * @return Set the likelihood of a finding to a fixed value.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2LikelihoodAdjustmentFixedLikelihood>> fixedLikelihood() {
        return Optional.ofNullable(this.fixedLikelihood);
    }

    /**
     * Increase or decrease the likelihood by the specified number of levels. For example, if a finding would be `POSSIBLE` without the detection rule and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment of 1 followed by an adjustment of -1 when base likelihood is `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
     * 
     */
    @Import(name="relativeLikelihood")
    private @Nullable Output<Integer> relativeLikelihood;

    /**
     * @return Increase or decrease the likelihood by the specified number of levels. For example, if a finding would be `POSSIBLE` without the detection rule and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment of 1 followed by an adjustment of -1 when base likelihood is `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
     * 
     */
    public Optional<Output<Integer>> relativeLikelihood() {
        return Optional.ofNullable(this.relativeLikelihood);
    }

    private GooglePrivacyDlpV2LikelihoodAdjustmentArgs() {}

    private GooglePrivacyDlpV2LikelihoodAdjustmentArgs(GooglePrivacyDlpV2LikelihoodAdjustmentArgs $) {
        this.fixedLikelihood = $.fixedLikelihood;
        this.relativeLikelihood = $.relativeLikelihood;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2LikelihoodAdjustmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LikelihoodAdjustmentArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2LikelihoodAdjustmentArgs();
        }

        public Builder(GooglePrivacyDlpV2LikelihoodAdjustmentArgs defaults) {
            $ = new GooglePrivacyDlpV2LikelihoodAdjustmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedLikelihood Set the likelihood of a finding to a fixed value.
         * 
         * @return builder
         * 
         */
        public Builder fixedLikelihood(@Nullable Output<GooglePrivacyDlpV2LikelihoodAdjustmentFixedLikelihood> fixedLikelihood) {
            $.fixedLikelihood = fixedLikelihood;
            return this;
        }

        /**
         * @param fixedLikelihood Set the likelihood of a finding to a fixed value.
         * 
         * @return builder
         * 
         */
        public Builder fixedLikelihood(GooglePrivacyDlpV2LikelihoodAdjustmentFixedLikelihood fixedLikelihood) {
            return fixedLikelihood(Output.of(fixedLikelihood));
        }

        /**
         * @param relativeLikelihood Increase or decrease the likelihood by the specified number of levels. For example, if a finding would be `POSSIBLE` without the detection rule and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment of 1 followed by an adjustment of -1 when base likelihood is `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder relativeLikelihood(@Nullable Output<Integer> relativeLikelihood) {
            $.relativeLikelihood = relativeLikelihood;
            return this;
        }

        /**
         * @param relativeLikelihood Increase or decrease the likelihood by the specified number of levels. For example, if a finding would be `POSSIBLE` without the detection rule and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment of 1 followed by an adjustment of -1 when base likelihood is `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder relativeLikelihood(Integer relativeLikelihood) {
            return relativeLikelihood(Output.of(relativeLikelihood));
        }

        public GooglePrivacyDlpV2LikelihoodAdjustmentArgs build() {
            return $;
        }
    }

}
