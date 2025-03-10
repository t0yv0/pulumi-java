// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.certificatemanager_v1.outputs.ManagedCertificateResponse;
import com.pulumi.googlenative.certificatemanager_v1.outputs.SelfManagedCertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    /**
     * @return The creation timestamp of a Certificate.
     * 
     */
    private final String createTime;
    /**
     * @return One or more paragraphs of text description of a certificate.
     * 
     */
    private final String description;
    /**
     * @return The expiry timestamp of a Certificate.
     * 
     */
    private final String expireTime;
    /**
     * @return Set of labels associated with a Certificate.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return If set, contains configuration and state of a managed certificate.
     * 
     */
    private final ManagedCertificateResponse managed;
    /**
     * @return A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    private final String name;
    /**
     * @return The PEM-encoded certificate chain.
     * 
     */
    private final String pemCertificate;
    /**
     * @return The list of Subject Alternative Names of dnsName type defined in the certificate (see RFC 5280 4.2.1.6). Managed certificates that haven&#39;t been provisioned yet have this field populated with a value of the managed.domains field.
     * 
     */
    private final List<String> sanDnsnames;
    /**
     * @return Immutable. The scope of the certificate.
     * 
     */
    private final String scope;
    /**
     * @return If set, defines data of a self-managed certificate.
     * 
     */
    private final SelfManagedCertificateResponse selfManaged;
    /**
     * @return The last update timestamp of a Certificate.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("managed") ManagedCertificateResponse managed,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pemCertificate") String pemCertificate,
        @CustomType.Parameter("sanDnsnames") List<String> sanDnsnames,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("selfManaged") SelfManagedCertificateResponse selfManaged,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.expireTime = expireTime;
        this.labels = labels;
        this.managed = managed;
        this.name = name;
        this.pemCertificate = pemCertificate;
        this.sanDnsnames = sanDnsnames;
        this.scope = scope;
        this.selfManaged = selfManaged;
        this.updateTime = updateTime;
    }

    /**
     * @return The creation timestamp of a Certificate.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return One or more paragraphs of text description of a certificate.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expiry timestamp of a Certificate.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Set of labels associated with a Certificate.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return If set, contains configuration and state of a managed certificate.
     * 
     */
    public ManagedCertificateResponse managed() {
        return this.managed;
    }
    /**
     * @return A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The PEM-encoded certificate chain.
     * 
     */
    public String pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * @return The list of Subject Alternative Names of dnsName type defined in the certificate (see RFC 5280 4.2.1.6). Managed certificates that haven&#39;t been provisioned yet have this field populated with a value of the managed.domains field.
     * 
     */
    public List<String> sanDnsnames() {
        return this.sanDnsnames;
    }
    /**
     * @return Immutable. The scope of the certificate.
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return If set, defines data of a self-managed certificate.
     * 
     */
    public SelfManagedCertificateResponse selfManaged() {
        return this.selfManaged;
    }
    /**
     * @return The last update timestamp of a Certificate.
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
        private String createTime;
        private String description;
        private String expireTime;
        private Map<String,String> labels;
        private ManagedCertificateResponse managed;
        private String name;
        private String pemCertificate;
        private List<String> sanDnsnames;
        private String scope;
        private SelfManagedCertificateResponse selfManaged;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.pemCertificate = defaults.pemCertificate;
    	      this.sanDnsnames = defaults.sanDnsnames;
    	      this.scope = defaults.scope;
    	      this.selfManaged = defaults.selfManaged;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder managed(ManagedCertificateResponse managed) {
            this.managed = Objects.requireNonNull(managed);
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
        public Builder sanDnsnames(List<String> sanDnsnames) {
            this.sanDnsnames = Objects.requireNonNull(sanDnsnames);
            return this;
        }
        public Builder sanDnsnames(String... sanDnsnames) {
            return sanDnsnames(List.of(sanDnsnames));
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder selfManaged(SelfManagedCertificateResponse selfManaged) {
            this.selfManaged = Objects.requireNonNull(selfManaged);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(createTime, description, expireTime, labels, managed, name, pemCertificate, sanDnsnames, scope, selfManaged, updateTime);
        }
    }
}
