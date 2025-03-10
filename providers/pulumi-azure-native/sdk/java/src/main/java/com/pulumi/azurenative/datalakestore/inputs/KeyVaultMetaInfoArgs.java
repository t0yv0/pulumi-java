// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata information used by account encryption.
 * 
 */
public final class KeyVaultMetaInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultMetaInfoArgs Empty = new KeyVaultMetaInfoArgs();

    /**
     * The name of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyName", required=true)
    private Output<String> encryptionKeyName;

    /**
     * @return The name of the user managed encryption key.
     * 
     */
    public Output<String> encryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * The version of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyVersion", required=true)
    private Output<String> encryptionKeyVersion;

    /**
     * @return The version of the user managed encryption key.
     * 
     */
    public Output<String> encryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    @Import(name="keyVaultResourceId", required=true)
    private Output<String> keyVaultResourceId;

    /**
     * @return The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    public Output<String> keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    private KeyVaultMetaInfoArgs() {}

    private KeyVaultMetaInfoArgs(KeyVaultMetaInfoArgs $) {
        this.encryptionKeyName = $.encryptionKeyName;
        this.encryptionKeyVersion = $.encryptionKeyVersion;
        this.keyVaultResourceId = $.keyVaultResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultMetaInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultMetaInfoArgs $;

        public Builder() {
            $ = new KeyVaultMetaInfoArgs();
        }

        public Builder(KeyVaultMetaInfoArgs defaults) {
            $ = new KeyVaultMetaInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionKeyName The name of the user managed encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyName(Output<String> encryptionKeyName) {
            $.encryptionKeyName = encryptionKeyName;
            return this;
        }

        /**
         * @param encryptionKeyName The name of the user managed encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyName(String encryptionKeyName) {
            return encryptionKeyName(Output.of(encryptionKeyName));
        }

        /**
         * @param encryptionKeyVersion The version of the user managed encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyVersion(Output<String> encryptionKeyVersion) {
            $.encryptionKeyVersion = encryptionKeyVersion;
            return this;
        }

        /**
         * @param encryptionKeyVersion The version of the user managed encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyVersion(String encryptionKeyVersion) {
            return encryptionKeyVersion(Output.of(encryptionKeyVersion));
        }

        /**
         * @param keyVaultResourceId The resource identifier for the user managed Key Vault being used to encrypt.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultResourceId(Output<String> keyVaultResourceId) {
            $.keyVaultResourceId = keyVaultResourceId;
            return this;
        }

        /**
         * @param keyVaultResourceId The resource identifier for the user managed Key Vault being used to encrypt.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultResourceId(String keyVaultResourceId) {
            return keyVaultResourceId(Output.of(keyVaultResourceId));
        }

        public KeyVaultMetaInfoArgs build() {
            $.encryptionKeyName = Objects.requireNonNull($.encryptionKeyName, "expected parameter 'encryptionKeyName' to be non-null");
            $.encryptionKeyVersion = Objects.requireNonNull($.encryptionKeyVersion, "expected parameter 'encryptionKeyVersion' to be non-null");
            $.keyVaultResourceId = Objects.requireNonNull($.keyVaultResourceId, "expected parameter 'keyVaultResourceId' to be non-null");
            return $;
        }
    }

}
