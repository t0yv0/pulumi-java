// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.enums.EC2FleetCapacityRebalanceReplacementStrategy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetCapacityRebalanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EC2FleetCapacityRebalanceArgs Empty = new EC2FleetCapacityRebalanceArgs();

    @Import(name="replacementStrategy")
    private @Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy;

    public Optional<Output<EC2FleetCapacityRebalanceReplacementStrategy>> replacementStrategy() {
        return Optional.ofNullable(this.replacementStrategy);
    }

    @Import(name="terminationDelay")
    private @Nullable Output<Integer> terminationDelay;

    public Optional<Output<Integer>> terminationDelay() {
        return Optional.ofNullable(this.terminationDelay);
    }

    private EC2FleetCapacityRebalanceArgs() {}

    private EC2FleetCapacityRebalanceArgs(EC2FleetCapacityRebalanceArgs $) {
        this.replacementStrategy = $.replacementStrategy;
        this.terminationDelay = $.terminationDelay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetCapacityRebalanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetCapacityRebalanceArgs $;

        public Builder() {
            $ = new EC2FleetCapacityRebalanceArgs();
        }

        public Builder(EC2FleetCapacityRebalanceArgs defaults) {
            $ = new EC2FleetCapacityRebalanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder replacementStrategy(@Nullable Output<EC2FleetCapacityRebalanceReplacementStrategy> replacementStrategy) {
            $.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder replacementStrategy(EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy) {
            return replacementStrategy(Output.of(replacementStrategy));
        }

        public Builder terminationDelay(@Nullable Output<Integer> terminationDelay) {
            $.terminationDelay = terminationDelay;
            return this;
        }

        public Builder terminationDelay(Integer terminationDelay) {
            return terminationDelay(Output.of(terminationDelay));
        }

        public EC2FleetCapacityRebalanceArgs build() {
            return $;
        }
    }

}
