// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskEncryptionPropertiesResponse {
    /**
     * @return Algorithm identifier for encryption, default RSA-OAEP.
     * 
     */
    private final @Nullable String encryptionAlgorithm;
    /**
     * @return Indicates whether or not resource disk encryption is enabled.
     * 
     */
    private final @Nullable Boolean encryptionAtHost;
    /**
     * @return Key name that is used for enabling disk encryption.
     * 
     */
    private final @Nullable String keyName;
    /**
     * @return Specific key version that is used for enabling disk encryption.
     * 
     */
    private final @Nullable String keyVersion;
    /**
     * @return Resource ID of Managed Identity that is used to access the key vault.
     * 
     */
    private final @Nullable String msiResourceId;
    /**
     * @return Base key vault URI where the customers key is located eg. https://myvault.vault.azure.net
     * 
     */
    private final @Nullable String vaultUri;

    @CustomType.Constructor
    private DiskEncryptionPropertiesResponse(
        @CustomType.Parameter("encryptionAlgorithm") @Nullable String encryptionAlgorithm,
        @CustomType.Parameter("encryptionAtHost") @Nullable Boolean encryptionAtHost,
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("keyVersion") @Nullable String keyVersion,
        @CustomType.Parameter("msiResourceId") @Nullable String msiResourceId,
        @CustomType.Parameter("vaultUri") @Nullable String vaultUri) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionAtHost = encryptionAtHost;
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.msiResourceId = msiResourceId;
        this.vaultUri = vaultUri;
    }

    /**
     * @return Algorithm identifier for encryption, default RSA-OAEP.
     * 
     */
    public Optional<String> encryptionAlgorithm() {
        return Optional.ofNullable(this.encryptionAlgorithm);
    }
    /**
     * @return Indicates whether or not resource disk encryption is enabled.
     * 
     */
    public Optional<Boolean> encryptionAtHost() {
        return Optional.ofNullable(this.encryptionAtHost);
    }
    /**
     * @return Key name that is used for enabling disk encryption.
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * @return Specific key version that is used for enabling disk encryption.
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    /**
     * @return Resource ID of Managed Identity that is used to access the key vault.
     * 
     */
    public Optional<String> msiResourceId() {
        return Optional.ofNullable(this.msiResourceId);
    }
    /**
     * @return Base key vault URI where the customers key is located eg. https://myvault.vault.azure.net
     * 
     */
    public Optional<String> vaultUri() {
        return Optional.ofNullable(this.vaultUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionAlgorithm;
        private @Nullable Boolean encryptionAtHost;
        private @Nullable String keyName;
        private @Nullable String keyVersion;
        private @Nullable String msiResourceId;
        private @Nullable String vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionAtHost = defaults.encryptionAtHost;
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.msiResourceId = defaults.msiResourceId;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder encryptionAlgorithm(@Nullable String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public Builder encryptionAtHost(@Nullable Boolean encryptionAtHost) {
            this.encryptionAtHost = encryptionAtHost;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder msiResourceId(@Nullable String msiResourceId) {
            this.msiResourceId = msiResourceId;
            return this;
        }
        public Builder vaultUri(@Nullable String vaultUri) {
            this.vaultUri = vaultUri;
            return this;
        }        public DiskEncryptionPropertiesResponse build() {
            return new DiskEncryptionPropertiesResponse(encryptionAlgorithm, encryptionAtHost, keyName, keyVersion, msiResourceId, vaultUri);
        }
    }
}
