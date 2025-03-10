// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs;
import com.pulumi.azure.keyvault.inputs.CertifiateCertificateAttributeArgs;
import com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertifiateState extends com.pulumi.resources.ResourceArgs {

    public static final CertifiateState Empty = new CertifiateState();

    /**
     * A `certificate` block as defined below, used to Import an existing certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<CertifiateCertificateArgs> certificate;

    /**
     * @return A `certificate` block as defined below, used to Import an existing certificate.
     * 
     */
    public Optional<Output<CertifiateCertificateArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * A `certificate_attribute` block as defined below.
     * 
     */
    @Import(name="certificateAttributes")
    private @Nullable Output<List<CertifiateCertificateAttributeArgs>> certificateAttributes;

    /**
     * @return A `certificate_attribute` block as defined below.
     * 
     */
    public Optional<Output<List<CertifiateCertificateAttributeArgs>>> certificateAttributes() {
        return Optional.ofNullable(this.certificateAttributes);
    }

    /**
     * The raw Key Vault Certificate data represented as a hexadecimal string.
     * 
     */
    @Import(name="certificateData")
    private @Nullable Output<String> certificateData;

    /**
     * @return The raw Key Vault Certificate data represented as a hexadecimal string.
     * 
     */
    public Optional<Output<String>> certificateData() {
        return Optional.ofNullable(this.certificateData);
    }

    /**
     * The Base64 encoded Key Vault Certificate data.
     * 
     */
    @Import(name="certificateDataBase64")
    private @Nullable Output<String> certificateDataBase64;

    /**
     * @return The Base64 encoded Key Vault Certificate data.
     * 
     */
    public Optional<Output<String>> certificateDataBase64() {
        return Optional.ofNullable(this.certificateDataBase64);
    }

    /**
     * A `certificate_policy` block as defined below.
     * 
     */
    @Import(name="certificatePolicy")
    private @Nullable Output<CertifiateCertificatePolicyArgs> certificatePolicy;

    /**
     * @return A `certificate_policy` block as defined below.
     * 
     */
    public Optional<Output<CertifiateCertificatePolicyArgs>> certificatePolicy() {
        return Optional.ofNullable(this.certificatePolicy);
    }

    /**
     * The ID of the Key Vault where the Certificate should be created.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault where the Certificate should be created.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
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
     * The ID of the associated Key Vault Secret.
     * 
     */
    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    /**
     * @return The ID of the associated Key Vault Secret.
     * 
     */
    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
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

    /**
     * The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * The current version of the Key Vault Certificate.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The current version of the Key Vault Certificate.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The Base ID of the Key Vault Certificate.
     * 
     */
    @Import(name="versionlessId")
    private @Nullable Output<String> versionlessId;

    /**
     * @return The Base ID of the Key Vault Certificate.
     * 
     */
    public Optional<Output<String>> versionlessId() {
        return Optional.ofNullable(this.versionlessId);
    }

    /**
     * The Base ID of the Key Vault Secret.
     * 
     */
    @Import(name="versionlessSecretId")
    private @Nullable Output<String> versionlessSecretId;

    /**
     * @return The Base ID of the Key Vault Secret.
     * 
     */
    public Optional<Output<String>> versionlessSecretId() {
        return Optional.ofNullable(this.versionlessSecretId);
    }

    private CertifiateState() {}

    private CertifiateState(CertifiateState $) {
        this.certificate = $.certificate;
        this.certificateAttributes = $.certificateAttributes;
        this.certificateData = $.certificateData;
        this.certificateDataBase64 = $.certificateDataBase64;
        this.certificatePolicy = $.certificatePolicy;
        this.keyVaultId = $.keyVaultId;
        this.name = $.name;
        this.secretId = $.secretId;
        this.tags = $.tags;
        this.thumbprint = $.thumbprint;
        this.version = $.version;
        this.versionlessId = $.versionlessId;
        this.versionlessSecretId = $.versionlessSecretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertifiateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertifiateState $;

        public Builder() {
            $ = new CertifiateState();
        }

        public Builder(CertifiateState defaults) {
            $ = new CertifiateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate A `certificate` block as defined below, used to Import an existing certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<CertifiateCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate A `certificate` block as defined below, used to Import an existing certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(CertifiateCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateAttributes A `certificate_attribute` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificateAttributes(@Nullable Output<List<CertifiateCertificateAttributeArgs>> certificateAttributes) {
            $.certificateAttributes = certificateAttributes;
            return this;
        }

        /**
         * @param certificateAttributes A `certificate_attribute` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificateAttributes(List<CertifiateCertificateAttributeArgs> certificateAttributes) {
            return certificateAttributes(Output.of(certificateAttributes));
        }

        /**
         * @param certificateAttributes A `certificate_attribute` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificateAttributes(CertifiateCertificateAttributeArgs... certificateAttributes) {
            return certificateAttributes(List.of(certificateAttributes));
        }

        /**
         * @param certificateData The raw Key Vault Certificate data represented as a hexadecimal string.
         * 
         * @return builder
         * 
         */
        public Builder certificateData(@Nullable Output<String> certificateData) {
            $.certificateData = certificateData;
            return this;
        }

        /**
         * @param certificateData The raw Key Vault Certificate data represented as a hexadecimal string.
         * 
         * @return builder
         * 
         */
        public Builder certificateData(String certificateData) {
            return certificateData(Output.of(certificateData));
        }

        /**
         * @param certificateDataBase64 The Base64 encoded Key Vault Certificate data.
         * 
         * @return builder
         * 
         */
        public Builder certificateDataBase64(@Nullable Output<String> certificateDataBase64) {
            $.certificateDataBase64 = certificateDataBase64;
            return this;
        }

        /**
         * @param certificateDataBase64 The Base64 encoded Key Vault Certificate data.
         * 
         * @return builder
         * 
         */
        public Builder certificateDataBase64(String certificateDataBase64) {
            return certificateDataBase64(Output.of(certificateDataBase64));
        }

        /**
         * @param certificatePolicy A `certificate_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificatePolicy(@Nullable Output<CertifiateCertificatePolicyArgs> certificatePolicy) {
            $.certificatePolicy = certificatePolicy;
            return this;
        }

        /**
         * @param certificatePolicy A `certificate_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificatePolicy(CertifiateCertificatePolicyArgs certificatePolicy) {
            return certificatePolicy(Output.of(certificatePolicy));
        }

        /**
         * @param keyVaultId The ID of the Key Vault where the Certificate should be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
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
         * @param secretId The ID of the associated Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId The ID of the associated Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
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

        /**
         * @param thumbprint The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The X509 Thumbprint of the Key Vault Certificate represented as a hexadecimal string.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param version The current version of the Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The current version of the Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param versionlessId The Base ID of the Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionlessId(@Nullable Output<String> versionlessId) {
            $.versionlessId = versionlessId;
            return this;
        }

        /**
         * @param versionlessId The Base ID of the Key Vault Certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionlessId(String versionlessId) {
            return versionlessId(Output.of(versionlessId));
        }

        /**
         * @param versionlessSecretId The Base ID of the Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder versionlessSecretId(@Nullable Output<String> versionlessSecretId) {
            $.versionlessSecretId = versionlessSecretId;
            return this;
        }

        /**
         * @param versionlessSecretId The Base ID of the Key Vault Secret.
         * 
         * @return builder
         * 
         */
        public Builder versionlessSecretId(String versionlessSecretId) {
            return versionlessSecretId(Output.of(versionlessSecretId));
        }

        public CertifiateState build() {
            return $;
        }
    }

}
