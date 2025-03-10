// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceAdditionalLocationVirtualNetworkConfiguration {
    /**
     * @return The id of the subnet that will be used for the API Management.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private ServiceAdditionalLocationVirtualNetworkConfiguration(@CustomType.Parameter("subnetId") String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * @return The id of the subnet that will be used for the API Management.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAdditionalLocationVirtualNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAdditionalLocationVirtualNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public ServiceAdditionalLocationVirtualNetworkConfiguration build() {
            return new ServiceAdditionalLocationVirtualNetworkConfiguration(subnetId);
        }
    }
}
