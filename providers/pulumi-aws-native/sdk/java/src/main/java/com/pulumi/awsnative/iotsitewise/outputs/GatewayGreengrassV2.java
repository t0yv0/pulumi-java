// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayGreengrassV2 {
    /**
     * @return The name of the CoreDevice in GreenGrass V2.
     * 
     */
    private final String coreDeviceThingName;

    @CustomType.Constructor
    private GatewayGreengrassV2(@CustomType.Parameter("coreDeviceThingName") String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * @return The name of the CoreDevice in GreenGrass V2.
     * 
     */
    public String coreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGreengrassV2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coreDeviceThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayGreengrassV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreDeviceThingName = defaults.coreDeviceThingName;
        }

        public Builder coreDeviceThingName(String coreDeviceThingName) {
            this.coreDeviceThingName = Objects.requireNonNull(coreDeviceThingName);
            return this;
        }        public GatewayGreengrassV2 build() {
            return new GatewayGreengrassV2(coreDeviceThingName);
        }
    }
}
