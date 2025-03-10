// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An SSL certificate obtained from a certificate authority.
 * 
 */
public final class CertificateRawDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateRawDataArgs Empty = new CertificateRawDataArgs();

    /**
     * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
     */
    @Import(name="publicCertificate")
    private @Nullable Output<String> publicCertificate;

    /**
     * @return PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
     */
    public Optional<Output<String>> publicCertificate() {
        return Optional.ofNullable(this.publicCertificate);
    }

    private CertificateRawDataArgs() {}

    private CertificateRawDataArgs(CertificateRawDataArgs $) {
        this.privateKey = $.privateKey;
        this.publicCertificate = $.publicCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateRawDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateRawDataArgs $;

        public Builder() {
            $ = new CertificateRawDataArgs();
        }

        public Builder(CertificateRawDataArgs defaults) {
            $ = new CertificateRawDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateKey Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param publicCertificate PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
         * 
         * @return builder
         * 
         */
        public Builder publicCertificate(@Nullable Output<String> publicCertificate) {
            $.publicCertificate = publicCertificate;
            return this;
        }

        /**
         * @param publicCertificate PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
         * 
         * @return builder
         * 
         */
        public Builder publicCertificate(String publicCertificate) {
            return publicCertificate(Output.of(publicCertificate));
        }

        public CertificateRawDataArgs build() {
            return $;
        }
    }

}
