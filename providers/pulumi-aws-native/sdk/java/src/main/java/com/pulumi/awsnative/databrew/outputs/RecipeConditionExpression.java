// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecipeConditionExpression {
    /**
     * @return Input condition to be applied to the target column
     * 
     */
    private final String condition;
    /**
     * @return Name of the target column
     * 
     */
    private final String targetColumn;
    /**
     * @return Value of the condition
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private RecipeConditionExpression(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("targetColumn") String targetColumn,
        @CustomType.Parameter("value") @Nullable String value) {
        this.condition = condition;
        this.targetColumn = targetColumn;
        this.value = value;
    }

    /**
     * @return Input condition to be applied to the target column
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return Name of the target column
     * 
     */
    public String targetColumn() {
        return this.targetColumn;
    }
    /**
     * @return Value of the condition
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeConditionExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private String targetColumn;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeConditionExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.targetColumn = defaults.targetColumn;
    	      this.value = defaults.value;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder targetColumn(String targetColumn) {
            this.targetColumn = Objects.requireNonNull(targetColumn);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public RecipeConditionExpression build() {
            return new RecipeConditionExpression(condition, targetColumn, value);
        }
    }
}
