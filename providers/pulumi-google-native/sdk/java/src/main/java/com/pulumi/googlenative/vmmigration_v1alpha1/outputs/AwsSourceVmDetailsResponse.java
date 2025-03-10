// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsSourceVmDetailsResponse {
    /**
     * @return The firmware type of the source VM.
     * 
     */
    private final String firmware;

    @CustomType.Constructor
    private AwsSourceVmDetailsResponse(@CustomType.Parameter("firmware") String firmware) {
        this.firmware = firmware;
    }

    /**
     * @return The firmware type of the source VM.
     * 
     */
    public String firmware() {
        return this.firmware;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsSourceVmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firmware;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsSourceVmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firmware = defaults.firmware;
        }

        public Builder firmware(String firmware) {
            this.firmware = Objects.requireNonNull(firmware);
            return this;
        }        public AwsSourceVmDetailsResponse build() {
            return new AwsSourceVmDetailsResponse(firmware);
        }
    }
}
