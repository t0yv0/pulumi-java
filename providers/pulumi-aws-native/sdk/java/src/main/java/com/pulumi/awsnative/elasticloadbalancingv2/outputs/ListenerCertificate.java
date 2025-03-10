// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerCertificate {
    private final @Nullable String certificateArn;

    @CustomType.Constructor
    private ListenerCertificate(@CustomType.Parameter("certificateArn") @Nullable String certificateArn) {
        this.certificateArn = certificateArn;
    }

    public Optional<String> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }        public ListenerCertificate build() {
            return new ListenerCertificate(certificateArn);
        }
    }
}
