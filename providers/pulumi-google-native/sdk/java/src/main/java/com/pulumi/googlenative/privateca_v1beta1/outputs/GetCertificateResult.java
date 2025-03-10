// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1beta1.outputs.CertificateConfigResponse;
import com.pulumi.googlenative.privateca_v1beta1.outputs.CertificateDescriptionResponse;
import com.pulumi.googlenative.privateca_v1beta1.outputs.RevocationDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    /**
     * @return A structured description of the issued X.509 certificate.
     * 
     */
    private final CertificateDescriptionResponse certificateDescription;
    /**
     * @return Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    private final CertificateConfigResponse config;
    /**
     * @return The time at which this Certificate was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    private final String lifetime;
    /**
     * @return The resource path for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*{@literal /}certificates/*`.
     * 
     */
    private final String name;
    /**
     * @return The pem-encoded, signed X.509 certificate.
     * 
     */
    private final String pemCertificate;
    /**
     * @return The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    private final List<String> pemCertificateChain;
    /**
     * @return Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    private final String pemCsr;
    /**
     * @return Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    private final RevocationDetailsResponse revocationDetails;
    /**
     * @return The time at which this Certificate was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("certificateDescription") CertificateDescriptionResponse certificateDescription,
        @CustomType.Parameter("config") CertificateConfigResponse config,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifetime") String lifetime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pemCertificate") String pemCertificate,
        @CustomType.Parameter("pemCertificateChain") List<String> pemCertificateChain,
        @CustomType.Parameter("pemCsr") String pemCsr,
        @CustomType.Parameter("revocationDetails") RevocationDetailsResponse revocationDetails,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.certificateDescription = certificateDescription;
        this.config = config;
        this.createTime = createTime;
        this.labels = labels;
        this.lifetime = lifetime;
        this.name = name;
        this.pemCertificate = pemCertificate;
        this.pemCertificateChain = pemCertificateChain;
        this.pemCsr = pemCsr;
        this.revocationDetails = revocationDetails;
        this.updateTime = updateTime;
    }

    /**
     * @return A structured description of the issued X.509 certificate.
     * 
     */
    public CertificateDescriptionResponse certificateDescription() {
        return this.certificateDescription;
    }
    /**
     * @return Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    public CertificateConfigResponse config() {
        return this.config;
    }
    /**
     * @return The time at which this Certificate was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    public String lifetime() {
        return this.lifetime;
    }
    /**
     * @return The resource path for this Certificate in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*{@literal /}certificates/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The pem-encoded, signed X.509 certificate.
     * 
     */
    public String pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * @return The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
     * 
     */
    public List<String> pemCertificateChain() {
        return this.pemCertificateChain;
    }
    /**
     * @return Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    public String pemCsr() {
        return this.pemCsr;
    }
    /**
     * @return Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * 
     */
    public RevocationDetailsResponse revocationDetails() {
        return this.revocationDetails;
    }
    /**
     * @return The time at which this Certificate was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateDescriptionResponse certificateDescription;
        private CertificateConfigResponse config;
        private String createTime;
        private Map<String,String> labels;
        private String lifetime;
        private String name;
        private String pemCertificate;
        private List<String> pemCertificateChain;
        private String pemCsr;
        private RevocationDetailsResponse revocationDetails;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateDescription = defaults.certificateDescription;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.name = defaults.name;
    	      this.pemCertificate = defaults.pemCertificate;
    	      this.pemCertificateChain = defaults.pemCertificateChain;
    	      this.pemCsr = defaults.pemCsr;
    	      this.revocationDetails = defaults.revocationDetails;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder certificateDescription(CertificateDescriptionResponse certificateDescription) {
            this.certificateDescription = Objects.requireNonNull(certificateDescription);
            return this;
        }
        public Builder config(CertificateConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pemCertificate(String pemCertificate) {
            this.pemCertificate = Objects.requireNonNull(pemCertificate);
            return this;
        }
        public Builder pemCertificateChain(List<String> pemCertificateChain) {
            this.pemCertificateChain = Objects.requireNonNull(pemCertificateChain);
            return this;
        }
        public Builder pemCertificateChain(String... pemCertificateChain) {
            return pemCertificateChain(List.of(pemCertificateChain));
        }
        public Builder pemCsr(String pemCsr) {
            this.pemCsr = Objects.requireNonNull(pemCsr);
            return this;
        }
        public Builder revocationDetails(RevocationDetailsResponse revocationDetails) {
            this.revocationDetails = Objects.requireNonNull(revocationDetails);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(certificateDescription, config, createTime, labels, lifetime, name, pemCertificate, pemCertificateChain, pemCsr, revocationDetails, updateTime);
        }
    }
}
