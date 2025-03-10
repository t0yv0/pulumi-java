// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration_v1alpha1.enums.SchedulingNodeAffinityOperator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled. Based on https://cloud.google.com/compute/docs/reference/rest/v1/instances/setScheduling
 * 
 */
public final class SchedulingNodeAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingNodeAffinityArgs Empty = new SchedulingNodeAffinityArgs();

    /**
     * The label key of Node resource to reference.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The label key of Node resource to reference.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator to use for the node resources specified in the `values` parameter.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<SchedulingNodeAffinityOperator> operator;

    /**
     * @return The operator to use for the node resources specified in the `values` parameter.
     * 
     */
    public Optional<Output<SchedulingNodeAffinityOperator>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Corresponds to the label values of Node resource.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SchedulingNodeAffinityArgs() {}

    private SchedulingNodeAffinityArgs(SchedulingNodeAffinityArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingNodeAffinityArgs $;

        public Builder() {
            $ = new SchedulingNodeAffinityArgs();
        }

        public Builder(SchedulingNodeAffinityArgs defaults) {
            $ = new SchedulingNodeAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The label key of Node resource to reference.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The label key of Node resource to reference.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator The operator to use for the node resources specified in the `values` parameter.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<SchedulingNodeAffinityOperator> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for the node resources specified in the `values` parameter.
         * 
         * @return builder
         * 
         */
        public Builder operator(SchedulingNodeAffinityOperator operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values Corresponds to the label values of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Corresponds to the label values of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SchedulingNodeAffinityArgs build() {
            return $;
        }
    }

}
