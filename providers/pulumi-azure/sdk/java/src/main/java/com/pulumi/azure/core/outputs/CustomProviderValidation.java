// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomProviderValidation {
    /**
     * @return The endpoint where the validation specification is located.
     * 
     */
    private final String specification;

    @CustomType.Constructor
    private CustomProviderValidation(@CustomType.Parameter("specification") String specification) {
        this.specification = specification;
    }

    /**
     * @return The endpoint where the validation specification is located.
     * 
     */
    public String specification() {
        return this.specification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomProviderValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String specification;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomProviderValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specification = defaults.specification;
        }

        public Builder specification(String specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }        public CustomProviderValidation build() {
            return new CustomProviderValidation(specification);
        }
    }
}
