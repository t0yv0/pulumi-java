// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ManagedRuleExclusionMatchVariable;
import com.pulumi.azurenative.network.enums.ManagedRuleExclusionSelectorMatchOperator;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Exclude variables from managed rule evaluation.
 * 
 */
public final class ManagedRuleExclusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedRuleExclusionArgs Empty = new ManagedRuleExclusionArgs();

    /**
     * The variable type to be excluded.
     * 
     */
    @Import(name="matchVariable", required=true)
    private Output<Either<String,ManagedRuleExclusionMatchVariable>> matchVariable;

    /**
     * @return The variable type to be excluded.
     * 
     */
    public Output<Either<String,ManagedRuleExclusionMatchVariable>> matchVariable() {
        return this.matchVariable;
    }

    /**
     * Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selector", required=true)
    private Output<String> selector;

    /**
     * @return Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    public Output<String> selector() {
        return this.selector;
    }

    /**
     * Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selectorMatchOperator", required=true)
    private Output<Either<String,ManagedRuleExclusionSelectorMatchOperator>> selectorMatchOperator;

    /**
     * @return Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    public Output<Either<String,ManagedRuleExclusionSelectorMatchOperator>> selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    private ManagedRuleExclusionArgs() {}

    private ManagedRuleExclusionArgs(ManagedRuleExclusionArgs $) {
        this.matchVariable = $.matchVariable;
        this.selector = $.selector;
        this.selectorMatchOperator = $.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedRuleExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedRuleExclusionArgs $;

        public Builder() {
            $ = new ManagedRuleExclusionArgs();
        }

        public Builder(ManagedRuleExclusionArgs defaults) {
            $ = new ManagedRuleExclusionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchVariable The variable type to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(Output<Either<String,ManagedRuleExclusionMatchVariable>> matchVariable) {
            $.matchVariable = matchVariable;
            return this;
        }

        /**
         * @param matchVariable The variable type to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(Either<String,ManagedRuleExclusionMatchVariable> matchVariable) {
            return matchVariable(Output.of(matchVariable));
        }

        /**
         * @param matchVariable The variable type to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(String matchVariable) {
            return matchVariable(Either.ofLeft(matchVariable));
        }

        /**
         * @param matchVariable The variable type to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(ManagedRuleExclusionMatchVariable matchVariable) {
            return matchVariable(Either.ofRight(matchVariable));
        }

        /**
         * @param selector Selector value for which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selector(Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selector value for which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param selectorMatchOperator Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(Output<Either<String,ManagedRuleExclusionSelectorMatchOperator>> selectorMatchOperator) {
            $.selectorMatchOperator = selectorMatchOperator;
            return this;
        }

        /**
         * @param selectorMatchOperator Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(Either<String,ManagedRuleExclusionSelectorMatchOperator> selectorMatchOperator) {
            return selectorMatchOperator(Output.of(selectorMatchOperator));
        }

        /**
         * @param selectorMatchOperator Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(String selectorMatchOperator) {
            return selectorMatchOperator(Either.ofLeft(selectorMatchOperator));
        }

        /**
         * @param selectorMatchOperator Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
         * 
         * @return builder
         * 
         */
        public Builder selectorMatchOperator(ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator) {
            return selectorMatchOperator(Either.ofRight(selectorMatchOperator));
        }

        public ManagedRuleExclusionArgs build() {
            $.matchVariable = Objects.requireNonNull($.matchVariable, "expected parameter 'matchVariable' to be non-null");
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.selectorMatchOperator = Objects.requireNonNull($.selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
            return $;
        }
    }

}
