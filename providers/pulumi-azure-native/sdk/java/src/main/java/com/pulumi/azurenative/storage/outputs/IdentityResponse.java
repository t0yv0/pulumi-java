// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.UserAssignedIdentityResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IdentityResponse {
    /**
     * @return The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant ID of resource.
     * 
     */
    private final String tenantId;
    /**
     * @return The identity type.
     * 
     */
    private final String type;
    /**
     * @return Gets or sets a list of key value pairs that describe the set of User Assigned identities that will be used with this storage account. The key is the ARM resource identifier of the identity. Only 1 User Assigned identity is permitted here.
     * 
     */
    private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    @CustomType.Constructor
    private IdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * @return The principal ID of resource identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant ID of resource.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The identity type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Gets or sets a list of key value pairs that describe the set of User Assigned identities that will be used with this storage account. The key is the ARM resource identifier of the identity. Only 1 User Assigned identity is permitted here.
     * 
     */
    public Map<String,UserAssignedIdentityResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
