// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureADPartnerClientAuthenticationResponse {
    /**
     * @return The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    private final @Nullable String azureActiveDirectoryApplicationIdOrUri;
    /**
     * @return The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    private final @Nullable String azureActiveDirectoryTenantId;
    /**
     * @return Type of client authentication
     * Expected value is &#39;AzureAD&#39;.
     * 
     */
    private final String clientAuthenticationType;

    @CustomType.Constructor
    private AzureADPartnerClientAuthenticationResponse(
        @CustomType.Parameter("azureActiveDirectoryApplicationIdOrUri") @Nullable String azureActiveDirectoryApplicationIdOrUri,
        @CustomType.Parameter("azureActiveDirectoryTenantId") @Nullable String azureActiveDirectoryTenantId,
        @CustomType.Parameter("clientAuthenticationType") String clientAuthenticationType) {
        this.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
        this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
        this.clientAuthenticationType = clientAuthenticationType;
    }

    /**
     * @return The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<String> azureActiveDirectoryApplicationIdOrUri() {
        return Optional.ofNullable(this.azureActiveDirectoryApplicationIdOrUri);
    }
    /**
     * @return The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<String> azureActiveDirectoryTenantId() {
        return Optional.ofNullable(this.azureActiveDirectoryTenantId);
    }
    /**
     * @return Type of client authentication
     * Expected value is &#39;AzureAD&#39;.
     * 
     */
    public String clientAuthenticationType() {
        return this.clientAuthenticationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureADPartnerClientAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureActiveDirectoryApplicationIdOrUri;
        private @Nullable String azureActiveDirectoryTenantId;
        private String clientAuthenticationType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureADPartnerClientAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureActiveDirectoryApplicationIdOrUri = defaults.azureActiveDirectoryApplicationIdOrUri;
    	      this.azureActiveDirectoryTenantId = defaults.azureActiveDirectoryTenantId;
    	      this.clientAuthenticationType = defaults.clientAuthenticationType;
        }

        public Builder azureActiveDirectoryApplicationIdOrUri(@Nullable String azureActiveDirectoryApplicationIdOrUri) {
            this.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
            return this;
        }
        public Builder azureActiveDirectoryTenantId(@Nullable String azureActiveDirectoryTenantId) {
            this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
            return this;
        }
        public Builder clientAuthenticationType(String clientAuthenticationType) {
            this.clientAuthenticationType = Objects.requireNonNull(clientAuthenticationType);
            return this;
        }        public AzureADPartnerClientAuthenticationResponse build() {
            return new AzureADPartnerClientAuthenticationResponse(azureActiveDirectoryApplicationIdOrUri, azureActiveDirectoryTenantId, clientAuthenticationType);
        }
    }
}
