// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MembershipStateResponse {
    /**
     * @return The current state of the Membership resource.
     * 
     */
    private final String code;

    @CustomType.Constructor
    private MembershipStateResponse(@CustomType.Parameter("code") String code) {
        this.code = code;
    }

    /**
     * @return The current state of the Membership resource.
     * 
     */
    public String code() {
        return this.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }        public MembershipStateResponse build() {
            return new MembershipStateResponse(code);
        }
    }
}
