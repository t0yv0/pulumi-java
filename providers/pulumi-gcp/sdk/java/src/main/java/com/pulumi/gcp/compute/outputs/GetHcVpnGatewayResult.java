// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetHcVpnGatewayVpnInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHcVpnGatewayResult {
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String network;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;
    private final List<GetHcVpnGatewayVpnInterface> vpnInterfaces;

    @CustomType.Constructor
    private GetHcVpnGatewayResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("vpnInterfaces") List<GetHcVpnGatewayVpnInterface> vpnInterfaces) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.vpnInterfaces = vpnInterfaces;
    }

    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String selfLink() {
        return this.selfLink;
    }
    public List<GetHcVpnGatewayVpnInterface> vpnInterfaces() {
        return this.vpnInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHcVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String network;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;
        private List<GetHcVpnGatewayVpnInterface> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHcVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder vpnInterfaces(List<GetHcVpnGatewayVpnInterface> vpnInterfaces) {
            this.vpnInterfaces = Objects.requireNonNull(vpnInterfaces);
            return this;
        }
        public Builder vpnInterfaces(GetHcVpnGatewayVpnInterface... vpnInterfaces) {
            return vpnInterfaces(List.of(vpnInterfaces));
        }        public GetHcVpnGatewayResult build() {
            return new GetHcVpnGatewayResult(description, id, name, network, project, region, selfLink, vpnInterfaces);
        }
    }
}
