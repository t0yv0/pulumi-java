// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretResponse {
    /**
     * @return Encrypted (using device public key) secret value.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;
    /**
     * @return Id of the Key-Vault where secret is stored (ex: secrets/AuthClientSecret/82ef4346187a4033a10d629cde07d740).
     * 
     */
    private final @Nullable String keyVaultId;

    @CustomType.Constructor
    private SecretResponse(
        @CustomType.Parameter("encryptedSecret") @Nullable AsymmetricEncryptedSecretResponse encryptedSecret,
        @CustomType.Parameter("keyVaultId") @Nullable String keyVaultId) {
        this.encryptedSecret = encryptedSecret;
        this.keyVaultId = keyVaultId;
    }

    /**
     * @return Encrypted (using device public key) secret value.
     * 
     */
    public Optional<AsymmetricEncryptedSecretResponse> encryptedSecret() {
        return Optional.ofNullable(this.encryptedSecret);
    }
    /**
     * @return Id of the Key-Vault where secret is stored (ex: secrets/AuthClientSecret/82ef4346187a4033a10d629cde07d740).
     * 
     */
    public Optional<String> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;
        private @Nullable String keyVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedSecret = defaults.encryptedSecret;
    	      this.keyVaultId = defaults.keyVaultId;
        }

        public Builder encryptedSecret(@Nullable AsymmetricEncryptedSecretResponse encryptedSecret) {
            this.encryptedSecret = encryptedSecret;
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }        public SecretResponse build() {
            return new SecretResponse(encryptedSecret, keyVaultId);
        }
    }
}
