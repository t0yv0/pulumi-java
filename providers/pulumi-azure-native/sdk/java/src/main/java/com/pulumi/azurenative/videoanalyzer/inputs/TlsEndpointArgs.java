// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.PemCertificateListArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.SecureIotDeviceRemoteTunnelArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.TlsValidationOptionsArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.UsernamePasswordCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TLS endpoint describes an endpoint that the pipeline can connect to over TLS transport (data is encrypted in transit).
 * 
 */
public final class TlsEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsEndpointArgs Empty = new TlsEndpointArgs();

    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<UsernamePasswordCredentialsArgs> credentials;

    /**
     * @return Credentials to be presented to the endpoint.
     * 
     */
    public Output<UsernamePasswordCredentialsArgs> credentials() {
        return this.credentials;
    }

    /**
     * List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
     * 
     */
    @Import(name="trustedCertificates")
    private @Nullable Output<PemCertificateListArgs> trustedCertificates;

    /**
     * @return List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
     * 
     */
    public Optional<Output<PemCertificateListArgs>> trustedCertificates() {
        return Optional.ofNullable(this.trustedCertificates);
    }

    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    @Import(name="tunnel")
    private @Nullable Output<SecureIotDeviceRemoteTunnelArgs> tunnel;

    /**
     * @return Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    public Optional<Output<SecureIotDeviceRemoteTunnelArgs>> tunnel() {
        return Optional.ofNullable(this.tunnel);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The endpoint URL for Video Analyzer to connect to.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    @Import(name="validationOptions")
    private @Nullable Output<TlsValidationOptionsArgs> validationOptions;

    /**
     * @return Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    public Optional<Output<TlsValidationOptionsArgs>> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    private TlsEndpointArgs() {}

    private TlsEndpointArgs(TlsEndpointArgs $) {
        this.credentials = $.credentials;
        this.trustedCertificates = $.trustedCertificates;
        this.tunnel = $.tunnel;
        this.type = $.type;
        this.url = $.url;
        this.validationOptions = $.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsEndpointArgs $;

        public Builder() {
            $ = new TlsEndpointArgs();
        }

        public Builder(TlsEndpointArgs defaults) {
            $ = new TlsEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials Credentials to be presented to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<UsernamePasswordCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Credentials to be presented to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder credentials(UsernamePasswordCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param trustedCertificates List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
         * 
         * @return builder
         * 
         */
        public Builder trustedCertificates(@Nullable Output<PemCertificateListArgs> trustedCertificates) {
            $.trustedCertificates = trustedCertificates;
            return this;
        }

        /**
         * @param trustedCertificates List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer&#39;s list of trusted authorities should be used.
         * 
         * @return builder
         * 
         */
        public Builder trustedCertificates(PemCertificateListArgs trustedCertificates) {
            return trustedCertificates(Output.of(trustedCertificates));
        }

        /**
         * @param tunnel Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
         * 
         * @return builder
         * 
         */
        public Builder tunnel(@Nullable Output<SecureIotDeviceRemoteTunnelArgs> tunnel) {
            $.tunnel = tunnel;
            return this;
        }

        /**
         * @param tunnel Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
         * 
         * @return builder
         * 
         */
        public Builder tunnel(SecureIotDeviceRemoteTunnelArgs tunnel) {
            return tunnel(Output.of(tunnel));
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.TlsEndpoint&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url The endpoint URL for Video Analyzer to connect to.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The endpoint URL for Video Analyzer to connect to.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param validationOptions Validation options to use when authenticating a TLS connection. By default, strict validation is used.
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(@Nullable Output<TlsValidationOptionsArgs> validationOptions) {
            $.validationOptions = validationOptions;
            return this;
        }

        /**
         * @param validationOptions Validation options to use when authenticating a TLS connection. By default, strict validation is used.
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(TlsValidationOptionsArgs validationOptions) {
            return validationOptions(Output.of(validationOptions));
        }

        public TlsEndpointArgs build() {
            $.credentials = Objects.requireNonNull($.credentials, "expected parameter 'credentials' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
