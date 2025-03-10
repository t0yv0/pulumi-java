// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomErrorRuleResponse {
    /**
     * @return Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    private final Boolean isErrorType;
    /**
     * @return Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @CustomType.Constructor
    private CustomErrorRuleResponse(
        @CustomType.Parameter("isErrorType") Boolean isErrorType,
        @CustomType.Parameter("selector") String selector) {
        this.isErrorType = isErrorType;
        this.selector = selector;
    }

    /**
     * @return Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    public Boolean isErrorType() {
        return this.isErrorType;
    }
    /**
     * @return Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public String selector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isErrorType;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isErrorType = defaults.isErrorType;
    	      this.selector = defaults.selector;
        }

        public Builder isErrorType(Boolean isErrorType) {
            this.isErrorType = Objects.requireNonNull(isErrorType);
            return this;
        }
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }        public CustomErrorRuleResponse build() {
            return new CustomErrorRuleResponse(isErrorType, selector);
        }
    }
}
