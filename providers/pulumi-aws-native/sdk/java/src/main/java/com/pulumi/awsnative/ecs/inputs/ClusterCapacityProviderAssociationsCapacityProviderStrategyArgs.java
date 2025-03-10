// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.ClusterCapacityProviderAssociationsCapacityProvider;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs Empty = new ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs();

    @Import(name="base")
    private @Nullable Output<Integer> base;

    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    @Import(name="capacityProvider", required=true)
    private Output<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>> capacityProvider;

    public Output<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>> capacityProvider() {
        return this.capacityProvider;
    }

    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs() {}

    private ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs(ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs $;

        public Builder() {
            $ = new ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs();
        }

        public Builder(ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs defaults) {
            $ = new ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        public Builder capacityProvider(Output<Either<ClusterCapacityProviderAssociationsCapacityProvider,String>> capacityProvider) {
            $.capacityProvider = capacityProvider;
            return this;
        }

        public Builder capacityProvider(Either<ClusterCapacityProviderAssociationsCapacityProvider,String> capacityProvider) {
            return capacityProvider(Output.of(capacityProvider));
        }

        public Builder capacityProvider(ClusterCapacityProviderAssociationsCapacityProvider capacityProvider) {
            return capacityProvider(Either.ofLeft(capacityProvider));
        }

        public Builder capacityProvider(String capacityProvider) {
            return capacityProvider(Either.ofRight(capacityProvider));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ClusterCapacityProviderAssociationsCapacityProviderStrategyArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            return $;
        }
    }

}
