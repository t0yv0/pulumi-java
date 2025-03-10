// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyTlsCertificate {
    /**
     * @return The ID of the Key Vault, where the secret or certificate is stored.
     * 
     */
    private final String keyVaultSecretId;
    /**
     * @return The name of the certificate.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private FirewallPolicyTlsCertificate(
        @CustomType.Parameter("keyVaultSecretId") String keyVaultSecretId,
        @CustomType.Parameter("name") String name) {
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    /**
     * @return The ID of the Key Vault, where the secret or certificate is stored.
     * 
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }
    /**
     * @return The name of the certificate.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyTlsCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyVaultSecretId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder keyVaultSecretId(String keyVaultSecretId) {
            this.keyVaultSecretId = Objects.requireNonNull(keyVaultSecretId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public FirewallPolicyTlsCertificate build() {
            return new FirewallPolicyTlsCertificate(keyVaultSecretId, name);
        }
    }
}
