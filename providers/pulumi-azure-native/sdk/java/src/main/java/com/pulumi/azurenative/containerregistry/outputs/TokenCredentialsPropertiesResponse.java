// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.TokenCertificateResponse;
import com.pulumi.azurenative.containerregistry.outputs.TokenPasswordResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TokenCredentialsPropertiesResponse {
    private final @Nullable List<TokenCertificateResponse> certificates;
    private final @Nullable List<TokenPasswordResponse> passwords;

    @CustomType.Constructor
    private TokenCredentialsPropertiesResponse(
        @CustomType.Parameter("certificates") @Nullable List<TokenCertificateResponse> certificates,
        @CustomType.Parameter("passwords") @Nullable List<TokenPasswordResponse> passwords) {
        this.certificates = certificates;
        this.passwords = passwords;
    }

    public List<TokenCertificateResponse> certificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    public List<TokenPasswordResponse> passwords() {
        return this.passwords == null ? List.of() : this.passwords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenCredentialsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TokenCertificateResponse> certificates;
        private @Nullable List<TokenPasswordResponse> passwords;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenCredentialsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.passwords = defaults.passwords;
        }

        public Builder certificates(@Nullable List<TokenCertificateResponse> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(TokenCertificateResponse... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder passwords(@Nullable List<TokenPasswordResponse> passwords) {
            this.passwords = passwords;
            return this;
        }
        public Builder passwords(TokenPasswordResponse... passwords) {
            return passwords(List.of(passwords));
        }        public TokenCredentialsPropertiesResponse build() {
            return new TokenCredentialsPropertiesResponse(certificates, passwords);
        }
    }
}
