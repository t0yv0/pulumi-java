// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IsNotNullAdvancedFilterResponse {
    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;IsNotNull&#39;.
     * 
     */
    private final String operatorType;

    @CustomType.Constructor
    private IsNotNullAdvancedFilterResponse(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operatorType") String operatorType) {
        this.key = key;
        this.operatorType = operatorType;
    }

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;IsNotNull&#39;.
     * 
     */
    public String operatorType() {
        return this.operatorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IsNotNullAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;

        public Builder() {
    	      // Empty
        }

        public Builder(IsNotNullAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }        public IsNotNullAdvancedFilterResponse build() {
            return new IsNotNullAdvancedFilterResponse(key, operatorType);
        }
    }
}
