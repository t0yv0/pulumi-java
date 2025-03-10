// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import com.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPrivateEndpointConnectionSlotResult {
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    private final @Nullable ArmIdWrapperResponse privateEndpoint;
    /**
     * @return The state of a private link connection
     * 
     */
    private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
    private final String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebAppPrivateEndpointConnectionSlotResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable ArmIdWrapperResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.ipAddresses = ipAddresses;
        this.kind = kind;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    public Optional<ArmIdWrapperResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return The state of a private link connection
     * 
     */
    public Optional<PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable List<String> ipAddresses;
        private @Nullable String kind;
        private String name;
        private @Nullable ArmIdWrapperResponse privateEndpoint;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable ArmIdWrapperResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebAppPrivateEndpointConnectionSlotResult build() {
            return new GetWebAppPrivateEndpointConnectionSlotResult(id, ipAddresses, kind, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
