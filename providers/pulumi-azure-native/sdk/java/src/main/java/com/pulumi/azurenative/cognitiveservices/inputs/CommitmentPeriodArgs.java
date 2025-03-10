// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cognitive Services account commitment period.
 * 
 */
public final class CommitmentPeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommitmentPeriodArgs Empty = new CommitmentPeriodArgs();

    /**
     * Commitment period commitment count.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Commitment period commitment count.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Commitment period commitment tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return Commitment period commitment tier.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private CommitmentPeriodArgs() {}

    private CommitmentPeriodArgs(CommitmentPeriodArgs $) {
        this.count = $.count;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommitmentPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommitmentPeriodArgs $;

        public Builder() {
            $ = new CommitmentPeriodArgs();
        }

        public Builder(CommitmentPeriodArgs defaults) {
            $ = new CommitmentPeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Commitment period commitment count.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Commitment period commitment count.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param tier Commitment period commitment tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Commitment period commitment tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public CommitmentPeriodArgs build() {
            return $;
        }
    }

}
