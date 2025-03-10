// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RegionSslCertificateType;
import com.pulumi.googlenative.compute_alpha.inputs.SslCertificateManagedSslCertificateArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SslCertificateSelfManagedSslCertificateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionSslCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionSslCertificateArgs Empty = new RegionSslCertificateArgs();

    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration and status of a managed SSL certificate.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<SslCertificateManagedSslCertificateArgs> managed;

    /**
     * @return Configuration and status of a managed SSL certificate.
     * 
     */
    public Optional<Output<SslCertificateManagedSslCertificateArgs>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
     */
    @Import(name="selfManaged")
    private @Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged;

    /**
     * @return Configuration and status of a self-managed SSL certificate.
     * 
     */
    public Optional<Output<SslCertificateSelfManagedSslCertificateArgs>> selfManaged() {
        return Optional.ofNullable(this.selfManaged);
    }

    /**
     * (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    @Import(name="type")
    private @Nullable Output<RegionSslCertificateType> type;

    /**
     * @return (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    public Optional<Output<RegionSslCertificateType>> type() {
        return Optional.ofNullable(this.type);
    }

    private RegionSslCertificateArgs() {}

    private RegionSslCertificateArgs(RegionSslCertificateArgs $) {
        this.certificate = $.certificate;
        this.description = $.description;
        this.managed = $.managed;
        this.name = $.name;
        this.privateKey = $.privateKey;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.selfManaged = $.selfManaged;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionSslCertificateArgs $;

        public Builder() {
            $ = new RegionSslCertificateArgs();
        }

        public Builder(RegionSslCertificateArgs defaults) {
            $ = new RegionSslCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param managed Configuration and status of a managed SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<SslCertificateManagedSslCertificateArgs> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed Configuration and status of a managed SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder managed(SslCertificateManagedSslCertificateArgs managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateKey A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param selfManaged Configuration and status of a self-managed SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder selfManaged(@Nullable Output<SslCertificateSelfManagedSslCertificateArgs> selfManaged) {
            $.selfManaged = selfManaged;
            return this;
        }

        /**
         * @param selfManaged Configuration and status of a self-managed SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder selfManaged(SslCertificateSelfManagedSslCertificateArgs selfManaged) {
            return selfManaged(Output.of(selfManaged));
        }

        /**
         * @param type (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RegionSslCertificateType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Optional) Specifies the type of SSL certificate, either &#34;SELF_MANAGED&#34; or &#34;MANAGED&#34;. If not specified, the certificate is self-managed and the fields certificate and private_key are used.
         * 
         * @return builder
         * 
         */
        public Builder type(RegionSslCertificateType type) {
            return type(Output.of(type));
        }

        public RegionSslCertificateArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
