// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.IdentityPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyEncryptionKeyResponse {
    /**
     * @return Managed identity properties used for key encryption.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identityProperties;
    /**
     * @return Type of encryption key used for key encryption.
     * 
     */
    private final String kekType;
    /**
     * @return Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    private final @Nullable String kekUrl;
    /**
     * @return Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    private final @Nullable String kekVaultResourceID;

    @CustomType.Constructor
    private KeyEncryptionKeyResponse(
        @CustomType.Parameter("identityProperties") @Nullable IdentityPropertiesResponse identityProperties,
        @CustomType.Parameter("kekType") String kekType,
        @CustomType.Parameter("kekUrl") @Nullable String kekUrl,
        @CustomType.Parameter("kekVaultResourceID") @Nullable String kekVaultResourceID) {
        this.identityProperties = identityProperties;
        this.kekType = kekType;
        this.kekUrl = kekUrl;
        this.kekVaultResourceID = kekVaultResourceID;
    }

    /**
     * @return Managed identity properties used for key encryption.
     * 
     */
    public Optional<IdentityPropertiesResponse> identityProperties() {
        return Optional.ofNullable(this.identityProperties);
    }
    /**
     * @return Type of encryption key used for key encryption.
     * 
     */
    public String kekType() {
        return this.kekType;
    }
    /**
     * @return Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<String> kekUrl() {
        return Optional.ofNullable(this.kekUrl);
    }
    /**
     * @return Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<String> kekVaultResourceID() {
        return Optional.ofNullable(this.kekVaultResourceID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IdentityPropertiesResponse identityProperties;
        private String kekType;
        private @Nullable String kekUrl;
        private @Nullable String kekVaultResourceID;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProperties = defaults.identityProperties;
    	      this.kekType = defaults.kekType;
    	      this.kekUrl = defaults.kekUrl;
    	      this.kekVaultResourceID = defaults.kekVaultResourceID;
        }

        public Builder identityProperties(@Nullable IdentityPropertiesResponse identityProperties) {
            this.identityProperties = identityProperties;
            return this;
        }
        public Builder kekType(String kekType) {
            this.kekType = Objects.requireNonNull(kekType);
            return this;
        }
        public Builder kekUrl(@Nullable String kekUrl) {
            this.kekUrl = kekUrl;
            return this;
        }
        public Builder kekVaultResourceID(@Nullable String kekVaultResourceID) {
            this.kekVaultResourceID = kekVaultResourceID;
            return this;
        }        public KeyEncryptionKeyResponse build() {
            return new KeyEncryptionKeyResponse(identityProperties, kekType, kekUrl, kekVaultResourceID);
        }
    }
}
