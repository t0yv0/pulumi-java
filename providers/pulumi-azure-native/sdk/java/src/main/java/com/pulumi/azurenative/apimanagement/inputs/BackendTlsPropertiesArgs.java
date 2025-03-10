// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties controlling TLS Certificate Validation.
 * 
 */
public final class BackendTlsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendTlsPropertiesArgs Empty = new BackendTlsPropertiesArgs();

    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateChain")
    private @Nullable Output<Boolean> validateCertificateChain;

    /**
     * @return Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Output<Boolean>> validateCertificateChain() {
        return Optional.ofNullable(this.validateCertificateChain);
    }

    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateName")
    private @Nullable Output<Boolean> validateCertificateName;

    /**
     * @return Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Output<Boolean>> validateCertificateName() {
        return Optional.ofNullable(this.validateCertificateName);
    }

    private BackendTlsPropertiesArgs() {}

    private BackendTlsPropertiesArgs(BackendTlsPropertiesArgs $) {
        this.validateCertificateChain = $.validateCertificateChain;
        this.validateCertificateName = $.validateCertificateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendTlsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendTlsPropertiesArgs $;

        public Builder() {
            $ = new BackendTlsPropertiesArgs();
        }

        public Builder(BackendTlsPropertiesArgs defaults) {
            $ = new BackendTlsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param validateCertificateChain Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificateChain(@Nullable Output<Boolean> validateCertificateChain) {
            $.validateCertificateChain = validateCertificateChain;
            return this;
        }

        /**
         * @param validateCertificateChain Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificateChain(Boolean validateCertificateChain) {
            return validateCertificateChain(Output.of(validateCertificateChain));
        }

        /**
         * @param validateCertificateName Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificateName(@Nullable Output<Boolean> validateCertificateName) {
            $.validateCertificateName = validateCertificateName;
            return this;
        }

        /**
         * @param validateCertificateName Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificateName(Boolean validateCertificateName) {
            return validateCertificateName(Output.of(validateCertificateName));
        }

        public BackendTlsPropertiesArgs build() {
            $.validateCertificateChain = Codegen.booleanProp("validateCertificateChain").output().arg($.validateCertificateChain).def(true).getNullable();
            $.validateCertificateName = Codegen.booleanProp("validateCertificateName").output().arg($.validateCertificateName).def(true).getNullable();
            return $;
        }
    }

}
