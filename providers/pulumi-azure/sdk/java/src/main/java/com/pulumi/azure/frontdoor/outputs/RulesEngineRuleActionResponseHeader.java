// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesEngineRuleActionResponseHeader {
    /**
     * @return can be set to `Overwrite`, `Append` or `Delete`.
     * 
     */
    private final @Nullable String headerActionType;
    /**
     * @return header name (string).
     * 
     */
    private final @Nullable String headerName;
    /**
     * @return value name (string).
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private RulesEngineRuleActionResponseHeader(
        @CustomType.Parameter("headerActionType") @Nullable String headerActionType,
        @CustomType.Parameter("headerName") @Nullable String headerName,
        @CustomType.Parameter("value") @Nullable String value) {
        this.headerActionType = headerActionType;
        this.headerName = headerName;
        this.value = value;
    }

    /**
     * @return can be set to `Overwrite`, `Append` or `Delete`.
     * 
     */
    public Optional<String> headerActionType() {
        return Optional.ofNullable(this.headerActionType);
    }
    /**
     * @return header name (string).
     * 
     */
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    /**
     * @return value name (string).
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineRuleActionResponseHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String headerActionType;
        private @Nullable String headerName;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineRuleActionResponseHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerActionType = defaults.headerActionType;
    	      this.headerName = defaults.headerName;
    	      this.value = defaults.value;
        }

        public Builder headerActionType(@Nullable String headerActionType) {
            this.headerActionType = headerActionType;
            return this;
        }
        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public RulesEngineRuleActionResponseHeader build() {
            return new RulesEngineRuleActionResponseHeader(headerActionType, headerName, value);
        }
    }
}
