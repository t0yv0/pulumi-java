// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesEngineMatchConditionResponse {
    /**
     * @return Describes if this is negate condition or not
     * 
     */
    private final @Nullable Boolean negateCondition;
    /**
     * @return Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    private final List<String> rulesEngineMatchValue;
    /**
     * @return Match Variable
     * 
     */
    private final String rulesEngineMatchVariable;
    /**
     * @return Describes operator to apply to the match condition.
     * 
     */
    private final String rulesEngineOperator;
    /**
     * @return Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    private final @Nullable String selector;
    /**
     * @return List of transforms
     * 
     */
    private final @Nullable List<String> transforms;

    @CustomType.Constructor
    private RulesEngineMatchConditionResponse(
        @CustomType.Parameter("negateCondition") @Nullable Boolean negateCondition,
        @CustomType.Parameter("rulesEngineMatchValue") List<String> rulesEngineMatchValue,
        @CustomType.Parameter("rulesEngineMatchVariable") String rulesEngineMatchVariable,
        @CustomType.Parameter("rulesEngineOperator") String rulesEngineOperator,
        @CustomType.Parameter("selector") @Nullable String selector,
        @CustomType.Parameter("transforms") @Nullable List<String> transforms) {
        this.negateCondition = negateCondition;
        this.rulesEngineMatchValue = rulesEngineMatchValue;
        this.rulesEngineMatchVariable = rulesEngineMatchVariable;
        this.rulesEngineOperator = rulesEngineOperator;
        this.selector = selector;
        this.transforms = transforms;
    }

    /**
     * @return Describes if this is negate condition or not
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    public List<String> rulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }
    /**
     * @return Match Variable
     * 
     */
    public String rulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }
    /**
     * @return Describes operator to apply to the match condition.
     * 
     */
    public String rulesEngineOperator() {
        return this.rulesEngineOperator;
    }
    /**
     * @return Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return List of transforms
     * 
     */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineMatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean negateCondition;
        private List<String> rulesEngineMatchValue;
        private String rulesEngineMatchVariable;
        private String rulesEngineOperator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineMatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negateCondition = defaults.negateCondition;
    	      this.rulesEngineMatchValue = defaults.rulesEngineMatchValue;
    	      this.rulesEngineMatchVariable = defaults.rulesEngineMatchVariable;
    	      this.rulesEngineOperator = defaults.rulesEngineOperator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder rulesEngineMatchValue(List<String> rulesEngineMatchValue) {
            this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
            return this;
        }
        public Builder rulesEngineMatchValue(String... rulesEngineMatchValue) {
            return rulesEngineMatchValue(List.of(rulesEngineMatchValue));
        }
        public Builder rulesEngineMatchVariable(String rulesEngineMatchVariable) {
            this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
            return this;
        }
        public Builder rulesEngineOperator(String rulesEngineOperator) {
            this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
            return this;
        }
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }
        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }        public RulesEngineMatchConditionResponse build() {
            return new RulesEngineMatchConditionResponse(negateCondition, rulesEngineMatchValue, rulesEngineMatchVariable, rulesEngineOperator, selector, transforms);
        }
    }
}
