// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.ImageArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User signature.
 * 
 */
public final class SignatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final SignatureArgs Empty = new SignatureArgs();

    /**
     * Optional. An image of the user&#39;s signature.
     * 
     */
    @Import(name="image")
    private @Nullable Output<ImageArgs> image;

    /**
     * @return Optional. An image of the user&#39;s signature.
     * 
     */
    public Optional<Output<ImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Optional. Timestamp of the signature.
     * 
     */
    @Import(name="signatureTime")
    private @Nullable Output<String> signatureTime;

    /**
     * @return Optional. Timestamp of the signature.
     * 
     */
    public Optional<Output<String>> signatureTime() {
        return Optional.ofNullable(this.signatureTime);
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private SignatureArgs() {}

    private SignatureArgs(SignatureArgs $) {
        this.image = $.image;
        this.metadata = $.metadata;
        this.signatureTime = $.signatureTime;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignatureArgs $;

        public Builder() {
            $ = new SignatureArgs();
        }

        public Builder(SignatureArgs defaults) {
            $ = new SignatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param image Optional. An image of the user&#39;s signature.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<ImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Optional. An image of the user&#39;s signature.
         * 
         * @return builder
         * 
         */
        public Builder image(ImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param metadata Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param signatureTime Optional. Timestamp of the signature.
         * 
         * @return builder
         * 
         */
        public Builder signatureTime(@Nullable Output<String> signatureTime) {
            $.signatureTime = signatureTime;
            return this;
        }

        /**
         * @param signatureTime Optional. Timestamp of the signature.
         * 
         * @return builder
         * 
         */
        public Builder signatureTime(String signatureTime) {
            return signatureTime(Output.of(signatureTime));
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public SignatureArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
