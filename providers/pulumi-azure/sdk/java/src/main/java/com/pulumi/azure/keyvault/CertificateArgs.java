// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault;

import com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs;
import com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * A `certificate` block as defined below, used to Import an existing certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<CertificateCertificateArgs> certificate;

    /**
     * @return A `certificate` block as defined below, used to Import an existing certificate.
     * 
     */
    public Optional<Output<CertificateCertificateArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * A `certificate_policy` block as defined below.
     * 
     */
    @Import(name="certificatePolicy")
    private @Nullable Output<CertificateCertificatePolicyArgs> certificatePolicy;

    /**
     * @return A `certificate_policy` block as defined below.
     * 
     */
    public Optional<Output<CertificateCertificatePolicyArgs>> certificatePolicy() {
        return Optional.ofNullable(this.certificatePolicy);
    }

    /**
     * The ID of the Key Vault where the Certificate should be created.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault where the Certificate should be created.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.certificate = $.certificate;
        this.certificatePolicy = $.certificatePolicy;
        this.keyVaultId = $.keyVaultId;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate A `certificate` block as defined below, used to Import an existing certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<CertificateCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate A `certificate` block as defined below, used to Import an existing certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(CertificateCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificatePolicy A `certificate_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificatePolicy(@Nullable Output<CertificateCertificatePolicyArgs> certificatePolicy) {
            $.certificatePolicy = certificatePolicy;
            return this;
        }

        /**
         * @param certificatePolicy A `certificate_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificatePolicy(CertificateCertificatePolicyArgs certificatePolicy) {
            return certificatePolicy(Output.of(certificatePolicy));
        }

        /**
         * @param keyVaultId The ID of the Key Vault where the Certificate should be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault where the Certificate should be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param name Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Key Vault Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CertificateArgs build() {
            $.keyVaultId = Objects.requireNonNull($.keyVaultId, "expected parameter 'keyVaultId' to be non-null");
            return $;
        }
    }

}
