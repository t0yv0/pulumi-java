// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleRequestBodyCondition {
    /**
     * @return List of string values. This is required if `operator` is not `Any`.
     * 
     */
    private final @Nullable List<String> matchValues;
    /**
     * @return Defaults to `false`.
     * 
     */
    private final @Nullable Boolean negateCondition;
    /**
     * @return Valid values are `Any`, `BeginsWith`, `Contains`, `EndsWith`, `Equal`, `GreaterThan`, `GreaterThanOrEqual`, `LessThan` and `LessThanOrEqual`.
     * 
     */
    private final String operator;
    /**
     * @return Valid values are `Lowercase` and `Uppercase`.
     * 
     */
    private final @Nullable List<String> transforms;

    @CustomType.Constructor
    private EndpointDeliveryRuleRequestBodyCondition(
        @CustomType.Parameter("matchValues") @Nullable List<String> matchValues,
        @CustomType.Parameter("negateCondition") @Nullable Boolean negateCondition,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("transforms") @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.operator = operator;
        this.transforms = transforms;
    }

    /**
     * @return List of string values. This is required if `operator` is not `Any`.
     * 
     */
    public List<String> matchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }
    /**
     * @return Defaults to `false`.
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return Valid values are `Any`, `BeginsWith`, `Contains`, `EndsWith`, `Equal`, `GreaterThan`, `GreaterThanOrEqual`, `LessThan` and `LessThanOrEqual`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Valid values are `Lowercase` and `Uppercase`.
     * 
     */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleRequestBodyCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeliveryRuleRequestBodyCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }        public EndpointDeliveryRuleRequestBodyCondition build() {
            return new EndpointDeliveryRuleRequestBodyCondition(matchValues, negateCondition, operator, transforms);
        }
    }
}
