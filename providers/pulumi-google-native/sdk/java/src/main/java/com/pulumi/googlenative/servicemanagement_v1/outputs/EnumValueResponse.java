// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EnumValueResponse {
    /**
     * @return Enum value name.
     * 
     */
    private final String name;
    /**
     * @return Enum value number.
     * 
     */
    private final Integer number;
    /**
     * @return Protocol buffer options.
     * 
     */
    private final List<OptionResponse> options;

    @CustomType.Constructor
    private EnumValueResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("number") Integer number,
        @CustomType.Parameter("options") List<OptionResponse> options) {
        this.name = name;
        this.number = number;
        this.options = options;
    }

    /**
     * @return Enum value name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Enum value number.
     * 
     */
    public Integer number() {
        return this.number;
    }
    /**
     * @return Protocol buffer options.
     * 
     */
    public List<OptionResponse> options() {
        return this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer number;
        private List<OptionResponse> options;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.options = defaults.options;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }        public EnumValueResponse build() {
            return new EnumValueResponse(name, number, options);
        }
    }
}
