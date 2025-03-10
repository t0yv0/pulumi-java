// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.RulesEngineMatchVariable;
import com.pulumi.azurenative.network.enums.RulesEngineOperator;
import com.pulumi.azurenative.network.enums.Transform;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define a match condition
 * 
 */
public final class RulesEngineMatchConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesEngineMatchConditionArgs Empty = new RulesEngineMatchConditionArgs();

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return Describes if this is negate condition or not
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    @Import(name="rulesEngineMatchValue", required=true)
    private Output<List<String>> rulesEngineMatchValue;

    /**
     * @return Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    public Output<List<String>> rulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }

    /**
     * Match Variable
     * 
     */
    @Import(name="rulesEngineMatchVariable", required=true)
    private Output<Either<String,RulesEngineMatchVariable>> rulesEngineMatchVariable;

    /**
     * @return Match Variable
     * 
     */
    public Output<Either<String,RulesEngineMatchVariable>> rulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }

    /**
     * Describes operator to apply to the match condition.
     * 
     */
    @Import(name="rulesEngineOperator", required=true)
    private Output<Either<String,RulesEngineOperator>> rulesEngineOperator;

    /**
     * @return Describes operator to apply to the match condition.
     * 
     */
    public Output<Either<String,RulesEngineOperator>> rulesEngineOperator() {
        return this.rulesEngineOperator;
    }

    /**
     * Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<Either<String,Transform>>> transforms;

    /**
     * @return List of transforms
     * 
     */
    public Optional<Output<List<Either<String,Transform>>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private RulesEngineMatchConditionArgs() {}

    private RulesEngineMatchConditionArgs(RulesEngineMatchConditionArgs $) {
        this.negateCondition = $.negateCondition;
        this.rulesEngineMatchValue = $.rulesEngineMatchValue;
        this.rulesEngineMatchVariable = $.rulesEngineMatchVariable;
        this.rulesEngineOperator = $.rulesEngineOperator;
        this.selector = $.selector;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineMatchConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineMatchConditionArgs $;

        public Builder() {
            $ = new RulesEngineMatchConditionArgs();
        }

        public Builder(RulesEngineMatchConditionArgs defaults) {
            $ = new RulesEngineMatchConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param negateCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        /**
         * @param rulesEngineMatchValue Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchValue(Output<List<String>> rulesEngineMatchValue) {
            $.rulesEngineMatchValue = rulesEngineMatchValue;
            return this;
        }

        /**
         * @param rulesEngineMatchValue Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchValue(List<String> rulesEngineMatchValue) {
            return rulesEngineMatchValue(Output.of(rulesEngineMatchValue));
        }

        /**
         * @param rulesEngineMatchValue Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchValue(String... rulesEngineMatchValue) {
            return rulesEngineMatchValue(List.of(rulesEngineMatchValue));
        }

        /**
         * @param rulesEngineMatchVariable Match Variable
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchVariable(Output<Either<String,RulesEngineMatchVariable>> rulesEngineMatchVariable) {
            $.rulesEngineMatchVariable = rulesEngineMatchVariable;
            return this;
        }

        /**
         * @param rulesEngineMatchVariable Match Variable
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchVariable(Either<String,RulesEngineMatchVariable> rulesEngineMatchVariable) {
            return rulesEngineMatchVariable(Output.of(rulesEngineMatchVariable));
        }

        /**
         * @param rulesEngineMatchVariable Match Variable
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchVariable(String rulesEngineMatchVariable) {
            return rulesEngineMatchVariable(Either.ofLeft(rulesEngineMatchVariable));
        }

        /**
         * @param rulesEngineMatchVariable Match Variable
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineMatchVariable(RulesEngineMatchVariable rulesEngineMatchVariable) {
            return rulesEngineMatchVariable(Either.ofRight(rulesEngineMatchVariable));
        }

        /**
         * @param rulesEngineOperator Describes operator to apply to the match condition.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineOperator(Output<Either<String,RulesEngineOperator>> rulesEngineOperator) {
            $.rulesEngineOperator = rulesEngineOperator;
            return this;
        }

        /**
         * @param rulesEngineOperator Describes operator to apply to the match condition.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineOperator(Either<String,RulesEngineOperator> rulesEngineOperator) {
            return rulesEngineOperator(Output.of(rulesEngineOperator));
        }

        /**
         * @param rulesEngineOperator Describes operator to apply to the match condition.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineOperator(String rulesEngineOperator) {
            return rulesEngineOperator(Either.ofLeft(rulesEngineOperator));
        }

        /**
         * @param rulesEngineOperator Describes operator to apply to the match condition.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineOperator(RulesEngineOperator rulesEngineOperator) {
            return rulesEngineOperator(Either.ofRight(rulesEngineOperator));
        }

        /**
         * @param selector Name of selector in RequestHeader or RequestBody to be matched
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Name of selector in RequestHeader or RequestBody to be matched
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param transforms List of transforms
         * 
         * @return builder
         * 
         */
        public Builder transforms(@Nullable Output<List<Either<String,Transform>>> transforms) {
            $.transforms = transforms;
            return this;
        }

        /**
         * @param transforms List of transforms
         * 
         * @return builder
         * 
         */
        public Builder transforms(List<Either<String,Transform>> transforms) {
            return transforms(Output.of(transforms));
        }

        /**
         * @param transforms List of transforms
         * 
         * @return builder
         * 
         */
        public Builder transforms(Either<String,Transform>... transforms) {
            return transforms(List.of(transforms));
        }

        public RulesEngineMatchConditionArgs build() {
            $.rulesEngineMatchValue = Objects.requireNonNull($.rulesEngineMatchValue, "expected parameter 'rulesEngineMatchValue' to be non-null");
            $.rulesEngineMatchVariable = Objects.requireNonNull($.rulesEngineMatchVariable, "expected parameter 'rulesEngineMatchVariable' to be non-null");
            $.rulesEngineOperator = Objects.requireNonNull($.rulesEngineOperator, "expected parameter 'rulesEngineOperator' to be non-null");
            return $;
        }
    }

}
