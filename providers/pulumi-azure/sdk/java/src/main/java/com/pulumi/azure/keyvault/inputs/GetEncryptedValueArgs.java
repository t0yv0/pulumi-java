// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEncryptedValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncryptedValueArgs Empty = new GetEncryptedValueArgs();

    /**
     * The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    /**
     * @return The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
     * 
     */
    @Import(name="encryptedData")
    private @Nullable String encryptedData;

    /**
     * @return The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
     * 
     */
    public Optional<String> encryptedData() {
        return Optional.ofNullable(this.encryptedData);
    }

    /**
     * The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
     * 
     */
    @Import(name="keyVaultKeyId", required=true)
    private String keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
     * 
     */
    public String keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    /**
     * The plain-text value which should be Encrypted into `encrypted_data`.
     * 
     */
    @Import(name="plainTextValue")
    private @Nullable String plainTextValue;

    /**
     * @return The plain-text value which should be Encrypted into `encrypted_data`.
     * 
     */
    public Optional<String> plainTextValue() {
        return Optional.ofNullable(this.plainTextValue);
    }

    private GetEncryptedValueArgs() {}

    private GetEncryptedValueArgs(GetEncryptedValueArgs $) {
        this.algorithm = $.algorithm;
        this.encryptedData = $.encryptedData;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.plainTextValue = $.plainTextValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncryptedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncryptedValueArgs $;

        public Builder() {
            $ = new GetEncryptedValueArgs();
        }

        public Builder(GetEncryptedValueArgs defaults) {
            $ = new GetEncryptedValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param encryptedData The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
         * 
         * @return builder
         * 
         */
        public Builder encryptedData(@Nullable String encryptedData) {
            $.encryptedData = encryptedData;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param plainTextValue The plain-text value which should be Encrypted into `encrypted_data`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextValue(@Nullable String plainTextValue) {
            $.plainTextValue = plainTextValue;
            return this;
        }

        public GetEncryptedValueArgs build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.keyVaultKeyId = Objects.requireNonNull($.keyVaultKeyId, "expected parameter 'keyVaultKeyId' to be non-null");
            return $;
        }
    }

}
