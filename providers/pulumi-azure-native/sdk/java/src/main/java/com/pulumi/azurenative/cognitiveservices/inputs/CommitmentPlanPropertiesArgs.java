// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.azurenative.cognitiveservices.enums.HostingModel;
import com.pulumi.azurenative.cognitiveservices.inputs.CommitmentPeriodArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account commitment plan.
 * 
 */
public final class CommitmentPlanPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommitmentPlanPropertiesArgs Empty = new CommitmentPlanPropertiesArgs();

    /**
     * AutoRenew commitment plan.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return AutoRenew commitment plan.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * Cognitive Services account commitment period.
     * 
     */
    @Import(name="current")
    private @Nullable Output<CommitmentPeriodArgs> current;

    /**
     * @return Cognitive Services account commitment period.
     * 
     */
    public Optional<Output<CommitmentPeriodArgs>> current() {
        return Optional.ofNullable(this.current);
    }

    /**
     * Account hosting model.
     * 
     */
    @Import(name="hostingModel")
    private @Nullable Output<Either<String,HostingModel>> hostingModel;

    /**
     * @return Account hosting model.
     * 
     */
    public Optional<Output<Either<String,HostingModel>>> hostingModel() {
        return Optional.ofNullable(this.hostingModel);
    }

    /**
     * Cognitive Services account commitment period.
     * 
     */
    @Import(name="next")
    private @Nullable Output<CommitmentPeriodArgs> next;

    /**
     * @return Cognitive Services account commitment period.
     * 
     */
    public Optional<Output<CommitmentPeriodArgs>> next() {
        return Optional.ofNullable(this.next);
    }

    /**
     * Commitment plan type.
     * 
     */
    @Import(name="planType")
    private @Nullable Output<String> planType;

    /**
     * @return Commitment plan type.
     * 
     */
    public Optional<Output<String>> planType() {
        return Optional.ofNullable(this.planType);
    }

    private CommitmentPlanPropertiesArgs() {}

    private CommitmentPlanPropertiesArgs(CommitmentPlanPropertiesArgs $) {
        this.autoRenew = $.autoRenew;
        this.current = $.current;
        this.hostingModel = $.hostingModel;
        this.next = $.next;
        this.planType = $.planType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommitmentPlanPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommitmentPlanPropertiesArgs $;

        public Builder() {
            $ = new CommitmentPlanPropertiesArgs();
        }

        public Builder(CommitmentPlanPropertiesArgs defaults) {
            $ = new CommitmentPlanPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRenew AutoRenew commitment plan.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew AutoRenew commitment plan.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param current Cognitive Services account commitment period.
         * 
         * @return builder
         * 
         */
        public Builder current(@Nullable Output<CommitmentPeriodArgs> current) {
            $.current = current;
            return this;
        }

        /**
         * @param current Cognitive Services account commitment period.
         * 
         * @return builder
         * 
         */
        public Builder current(CommitmentPeriodArgs current) {
            return current(Output.of(current));
        }

        /**
         * @param hostingModel Account hosting model.
         * 
         * @return builder
         * 
         */
        public Builder hostingModel(@Nullable Output<Either<String,HostingModel>> hostingModel) {
            $.hostingModel = hostingModel;
            return this;
        }

        /**
         * @param hostingModel Account hosting model.
         * 
         * @return builder
         * 
         */
        public Builder hostingModel(Either<String,HostingModel> hostingModel) {
            return hostingModel(Output.of(hostingModel));
        }

        /**
         * @param hostingModel Account hosting model.
         * 
         * @return builder
         * 
         */
        public Builder hostingModel(String hostingModel) {
            return hostingModel(Either.ofLeft(hostingModel));
        }

        /**
         * @param hostingModel Account hosting model.
         * 
         * @return builder
         * 
         */
        public Builder hostingModel(HostingModel hostingModel) {
            return hostingModel(Either.ofRight(hostingModel));
        }

        /**
         * @param next Cognitive Services account commitment period.
         * 
         * @return builder
         * 
         */
        public Builder next(@Nullable Output<CommitmentPeriodArgs> next) {
            $.next = next;
            return this;
        }

        /**
         * @param next Cognitive Services account commitment period.
         * 
         * @return builder
         * 
         */
        public Builder next(CommitmentPeriodArgs next) {
            return next(Output.of(next));
        }

        /**
         * @param planType Commitment plan type.
         * 
         * @return builder
         * 
         */
        public Builder planType(@Nullable Output<String> planType) {
            $.planType = planType;
            return this;
        }

        /**
         * @param planType Commitment plan type.
         * 
         * @return builder
         * 
         */
        public Builder planType(String planType) {
            return planType(Output.of(planType));
        }

        public CommitmentPlanPropertiesArgs build() {
            return $;
        }
    }

}
