// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AutomaticResponse {
    @CustomType.Constructor
    private AutomaticResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public AutomaticResponse build() {
            return new AutomaticResponse();
        }
    }
}
