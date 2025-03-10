// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationAuthorizationResponse {
    /**
     * @return The provider&#39;s principal identifier. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    private final String principalId;
    /**
     * @return The provider&#39;s role definition identifier. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    private final String roleDefinitionId;

    @CustomType.Constructor
    private ApplicationAuthorizationResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("roleDefinitionId") String roleDefinitionId) {
        this.principalId = principalId;
        this.roleDefinitionId = roleDefinitionId;
    }

    /**
     * @return The provider&#39;s principal identifier. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The provider&#39;s role definition identifier. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }        public ApplicationAuthorizationResponse build() {
            return new ApplicationAuthorizationResponse(principalId, roleDefinitionId);
        }
    }
}
