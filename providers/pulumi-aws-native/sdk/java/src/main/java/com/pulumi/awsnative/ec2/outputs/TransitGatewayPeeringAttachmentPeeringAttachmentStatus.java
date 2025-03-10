// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransitGatewayPeeringAttachmentPeeringAttachmentStatus {
    /**
     * @return The status code.
     * 
     */
    private final @Nullable String code;
    /**
     * @return The status message, if applicable.
     * 
     */
    private final @Nullable String message;

    @CustomType.Constructor
    private TransitGatewayPeeringAttachmentPeeringAttachmentStatus(
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("message") @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return The status code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return The status message, if applicable.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentPeeringAttachmentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public TransitGatewayPeeringAttachmentPeeringAttachmentStatus build() {
            return new TransitGatewayPeeringAttachmentPeeringAttachmentStatus(code, message);
        }
    }
}
