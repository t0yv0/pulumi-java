// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key vault properties.
 * 
 */
public final class KeyVaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return The name of the key associated with the Log Analytics cluster.
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * Selected key minimum required size.
     * 
     */
    @Import(name="keyRsaSize")
    private @Nullable Output<Integer> keyRsaSize;

    /**
     * @return Selected key minimum required size.
     * 
     */
    public Optional<Output<Integer>> keyRsaSize() {
        return Optional.ofNullable(this.keyRsaSize);
    }

    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
     */
    @Import(name="keyVaultUri")
    private @Nullable Output<String> keyVaultUri;

    /**
     * @return The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
     */
    public Optional<Output<String>> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return The version of the key associated with the Log Analytics cluster.
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    private KeyVaultPropertiesArgs() {}

    private KeyVaultPropertiesArgs(KeyVaultPropertiesArgs $) {
        this.keyName = $.keyName;
        this.keyRsaSize = $.keyRsaSize;
        this.keyVaultUri = $.keyVaultUri;
        this.keyVersion = $.keyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultPropertiesArgs $;

        public Builder() {
            $ = new KeyVaultPropertiesArgs();
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
            $ = new KeyVaultPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of the key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of the key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyRsaSize Selected key minimum required size.
         * 
         * @return builder
         * 
         */
        public Builder keyRsaSize(@Nullable Output<Integer> keyRsaSize) {
            $.keyRsaSize = keyRsaSize;
            return this;
        }

        /**
         * @param keyRsaSize Selected key minimum required size.
         * 
         * @return builder
         * 
         */
        public Builder keyRsaSize(Integer keyRsaSize) {
            return keyRsaSize(Output.of(keyRsaSize));
        }

        /**
         * @param keyVaultUri The Key Vault uri which holds they key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(@Nullable Output<String> keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param keyVaultUri The Key Vault uri which holds they key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(String keyVaultUri) {
            return keyVaultUri(Output.of(keyVaultUri));
        }

        /**
         * @param keyVersion The version of the key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion The version of the key associated with the Log Analytics cluster.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        public KeyVaultPropertiesArgs build() {
            return $;
        }
    }

}
