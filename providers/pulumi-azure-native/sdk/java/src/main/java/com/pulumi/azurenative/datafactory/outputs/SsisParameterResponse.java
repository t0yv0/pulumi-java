// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisParameterResponse {
    /**
     * @return Parameter type.
     * 
     */
    private final @Nullable String dataType;
    /**
     * @return Default value of parameter.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * @return Parameter description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Design default value of parameter.
     * 
     */
    private final @Nullable String designDefaultValue;
    /**
     * @return Parameter id.
     * 
     */
    private final @Nullable Double id;
    /**
     * @return Parameter name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Whether parameter is required.
     * 
     */
    private final @Nullable Boolean required;
    /**
     * @return Whether parameter is sensitive.
     * 
     */
    private final @Nullable Boolean sensitive;
    /**
     * @return Default sensitive value of parameter.
     * 
     */
    private final @Nullable String sensitiveDefaultValue;
    /**
     * @return Parameter value set.
     * 
     */
    private final @Nullable Boolean valueSet;
    /**
     * @return Parameter value type.
     * 
     */
    private final @Nullable String valueType;
    /**
     * @return Parameter reference variable.
     * 
     */
    private final @Nullable String variable;

    @CustomType.Constructor
    private SsisParameterResponse(
        @CustomType.Parameter("dataType") @Nullable String dataType,
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("designDefaultValue") @Nullable String designDefaultValue,
        @CustomType.Parameter("id") @Nullable Double id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("required") @Nullable Boolean required,
        @CustomType.Parameter("sensitive") @Nullable Boolean sensitive,
        @CustomType.Parameter("sensitiveDefaultValue") @Nullable String sensitiveDefaultValue,
        @CustomType.Parameter("valueSet") @Nullable Boolean valueSet,
        @CustomType.Parameter("valueType") @Nullable String valueType,
        @CustomType.Parameter("variable") @Nullable String variable) {
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.designDefaultValue = designDefaultValue;
        this.id = id;
        this.name = name;
        this.required = required;
        this.sensitive = sensitive;
        this.sensitiveDefaultValue = sensitiveDefaultValue;
        this.valueSet = valueSet;
        this.valueType = valueType;
        this.variable = variable;
    }

    /**
     * @return Parameter type.
     * 
     */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * @return Default value of parameter.
     * 
     */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * @return Parameter description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Design default value of parameter.
     * 
     */
    public Optional<String> designDefaultValue() {
        return Optional.ofNullable(this.designDefaultValue);
    }
    /**
     * @return Parameter id.
     * 
     */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Parameter name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Whether parameter is required.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    /**
     * @return Whether parameter is sensitive.
     * 
     */
    public Optional<Boolean> sensitive() {
        return Optional.ofNullable(this.sensitive);
    }
    /**
     * @return Default sensitive value of parameter.
     * 
     */
    public Optional<String> sensitiveDefaultValue() {
        return Optional.ofNullable(this.sensitiveDefaultValue);
    }
    /**
     * @return Parameter value set.
     * 
     */
    public Optional<Boolean> valueSet() {
        return Optional.ofNullable(this.valueSet);
    }
    /**
     * @return Parameter value type.
     * 
     */
    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }
    /**
     * @return Parameter reference variable.
     * 
     */
    public Optional<String> variable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable String designDefaultValue;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean required;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveDefaultValue;
        private @Nullable Boolean valueSet;
        private @Nullable String valueType;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.designDefaultValue = defaults.designDefaultValue;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveDefaultValue = defaults.sensitiveDefaultValue;
    	      this.valueSet = defaults.valueSet;
    	      this.valueType = defaults.valueType;
    	      this.variable = defaults.variable;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder designDefaultValue(@Nullable String designDefaultValue) {
            this.designDefaultValue = designDefaultValue;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        public Builder sensitive(@Nullable Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Builder sensitiveDefaultValue(@Nullable String sensitiveDefaultValue) {
            this.sensitiveDefaultValue = sensitiveDefaultValue;
            return this;
        }
        public Builder valueSet(@Nullable Boolean valueSet) {
            this.valueSet = valueSet;
            return this;
        }
        public Builder valueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }
        public Builder variable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }        public SsisParameterResponse build() {
            return new SsisParameterResponse(dataType, defaultValue, description, designDefaultValue, id, name, required, sensitive, sensitiveDefaultValue, valueSet, valueType, variable);
        }
    }
}
