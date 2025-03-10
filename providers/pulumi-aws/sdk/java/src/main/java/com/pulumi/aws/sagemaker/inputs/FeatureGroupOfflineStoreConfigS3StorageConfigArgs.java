// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigS3StorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigS3StorageConfigArgs Empty = new FeatureGroupOfflineStoreConfigS3StorageConfigArgs();

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    @Import(name="s3Uri", required=true)
    private Output<String> s3Uri;

    /**
     * @return The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    public Output<String> s3Uri() {
        return this.s3Uri;
    }

    private FeatureGroupOfflineStoreConfigS3StorageConfigArgs() {}

    private FeatureGroupOfflineStoreConfigS3StorageConfigArgs(FeatureGroupOfflineStoreConfigS3StorageConfigArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.s3Uri = $.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureGroupOfflineStoreConfigS3StorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureGroupOfflineStoreConfigS3StorageConfigArgs $;

        public Builder() {
            $ = new FeatureGroupOfflineStoreConfigS3StorageConfigArgs();
        }

        public Builder(FeatureGroupOfflineStoreConfigS3StorageConfigArgs defaults) {
            $ = new FeatureGroupOfflineStoreConfigS3StorageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param s3Uri The S3 URI, or location in Amazon S3, of OfflineStore.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(Output<String> s3Uri) {
            $.s3Uri = s3Uri;
            return this;
        }

        /**
         * @param s3Uri The S3 URI, or location in Amazon S3, of OfflineStore.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(String s3Uri) {
            return s3Uri(Output.of(s3Uri));
        }

        public FeatureGroupOfflineStoreConfigS3StorageConfigArgs build() {
            $.s3Uri = Objects.requireNonNull($.s3Uri, "expected parameter 's3Uri' to be non-null");
            return $;
        }
    }

}
