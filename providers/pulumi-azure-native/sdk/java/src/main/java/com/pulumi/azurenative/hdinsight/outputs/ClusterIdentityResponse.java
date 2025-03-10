// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.azurenative.hdinsight.outputs.ClusterIdentityResponseUserAssignedIdentities;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterIdentityResponse {
    /**
     * @return The principal id of cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * @return The type of identity used for the cluster. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    private final @Nullable String type;
    /**
     * @return The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    private final @Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    @CustomType.Constructor
    private ClusterIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * @return The principal id of cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The type of identity used for the cluster. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    public Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityResponse defaults) {
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
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public ClusterIdentityResponse build() {
            return new ClusterIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
