// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.MediaGraphPemCertificateListResponse;
import com.pulumi.azurenative.media.outputs.MediaGraphTlsValidationOptionsResponse;
import com.pulumi.azurenative.media.outputs.MediaGraphUsernamePasswordCredentialsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MediaGraphTlsEndpointResponse {
    /**
     * @return Polymorphic credentials to present to the endpoint.
     * 
     */
    private final @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphTlsEndpoint&#39;.
     * 
     */
    private final String odataType;
    /**
     * @return What certificates should be trusted when authenticating a TLS connection. Null designates that Azure Media&#39;s source of trust should be used.
     * 
     */
    private final @Nullable MediaGraphPemCertificateListResponse trustedCertificates;
    /**
     * @return Url for the endpoint.
     * 
     */
    private final String url;
    /**
     * @return Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    private final @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

    @CustomType.Constructor
    private MediaGraphTlsEndpointResponse(
        @CustomType.Parameter("credentials") @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("trustedCertificates") @Nullable MediaGraphPemCertificateListResponse trustedCertificates,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("validationOptions") @Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
        this.credentials = credentials;
        this.odataType = odataType;
        this.trustedCertificates = trustedCertificates;
        this.url = url;
        this.validationOptions = validationOptions;
    }

    /**
     * @return Polymorphic credentials to present to the endpoint.
     * 
     */
    public Optional<MediaGraphUsernamePasswordCredentialsResponse> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphTlsEndpoint&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return What certificates should be trusted when authenticating a TLS connection. Null designates that Azure Media&#39;s source of trust should be used.
     * 
     */
    public Optional<MediaGraphPemCertificateListResponse> trustedCertificates() {
        return Optional.ofNullable(this.trustedCertificates);
    }
    /**
     * @return Url for the endpoint.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    public Optional<MediaGraphTlsValidationOptionsResponse> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphTlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
        private String odataType;
        private @Nullable MediaGraphPemCertificateListResponse trustedCertificates;
        private String url;
        private @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphTlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.odataType = defaults.odataType;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder credentials(@Nullable MediaGraphUsernamePasswordCredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder trustedCertificates(@Nullable MediaGraphPemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder validationOptions(@Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }        public MediaGraphTlsEndpointResponse build() {
            return new MediaGraphTlsEndpointResponse(credentials, odataType, trustedCertificates, url, validationOptions);
        }
    }
}
