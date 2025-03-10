// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * @return The ARN of the issued certificate.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The issued certificate in base 64 PEM-encoded format.
     * 
     */
    private final @Nullable String certificate;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("certificate") @Nullable String certificate) {
        this.arn = arn;
        this.certificate = certificate;
    }

    /**
     * @return The ARN of the issued certificate.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The issued certificate in base 64 PEM-encoded format.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String certificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(arn, certificate);
        }
    }
}
