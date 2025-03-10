// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate {
    /**
     * @return A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    private final String name;
    private final String thumbprint;

    @CustomType.Constructor
    private VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("thumbprint") String thumbprint) {
        this.name = name;
        this.thumbprint = thumbprint;
    }

    /**
     * @return A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    public String name() {
        return this.name;
    }
    public String thumbprint() {
        return this.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }        public VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate build() {
            return new VirtualNetworkGatewayVpnClientConfigurationRevokedCertificate(name, thumbprint);
        }
    }
}
