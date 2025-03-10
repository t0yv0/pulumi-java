// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options for manually scaling a model.
 * 
 */
public final class GoogleCloudMlV1__ManualScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__ManualScalingArgs Empty = new GoogleCloudMlV1__ManualScalingArgs();

    /**
     * The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<Integer> nodes;

    /**
     * @return The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
     * 
     */
    public Optional<Output<Integer>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    private GoogleCloudMlV1__ManualScalingArgs() {}

    private GoogleCloudMlV1__ManualScalingArgs(GoogleCloudMlV1__ManualScalingArgs $) {
        this.nodes = $.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__ManualScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__ManualScalingArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1__ManualScalingArgs();
        }

        public Builder(GoogleCloudMlV1__ManualScalingArgs defaults) {
            $ = new GoogleCloudMlV1__ManualScalingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodes The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<Integer> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
         * 
         * @return builder
         * 
         */
        public Builder nodes(Integer nodes) {
            return nodes(Output.of(nodes));
        }

        public GoogleCloudMlV1__ManualScalingArgs build() {
            return $;
        }
    }

}
