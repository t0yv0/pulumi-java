// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync;

import com.pulumi.awsnative.datasync.enums.LocationS3S3StorageClass;
import com.pulumi.awsnative.datasync.inputs.LocationS3S3ConfigArgs;
import com.pulumi.awsnative.datasync.inputs.LocationS3TagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationS3Args extends com.pulumi.resources.ResourceArgs {

    public static final LocationS3Args Empty = new LocationS3Args();

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * 
     */
    @Import(name="s3BucketArn", required=true)
    private Output<String> s3BucketArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * 
     */
    public Output<String> s3BucketArn() {
        return this.s3BucketArn;
    }

    @Import(name="s3Config", required=true)
    private Output<LocationS3S3ConfigArgs> s3Config;

    public Output<LocationS3S3ConfigArgs> s3Config() {
        return this.s3Config;
    }

    /**
     * The Amazon S3 storage class you want to store your files in when this location is used as a task destination.
     * 
     */
    @Import(name="s3StorageClass")
    private @Nullable Output<LocationS3S3StorageClass> s3StorageClass;

    /**
     * @return The Amazon S3 storage class you want to store your files in when this location is used as a task destination.
     * 
     */
    public Optional<Output<LocationS3S3StorageClass>> s3StorageClass() {
        return Optional.ofNullable(this.s3StorageClass);
    }

    /**
     * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<LocationS3TagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<LocationS3TagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LocationS3Args() {}

    private LocationS3Args(LocationS3Args $) {
        this.s3BucketArn = $.s3BucketArn;
        this.s3Config = $.s3Config;
        this.s3StorageClass = $.s3StorageClass;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationS3Args $;

        public Builder() {
            $ = new LocationS3Args();
        }

        public Builder(LocationS3Args defaults) {
            $ = new LocationS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3BucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(Output<String> s3BucketArn) {
            $.s3BucketArn = s3BucketArn;
            return this;
        }

        /**
         * @param s3BucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(String s3BucketArn) {
            return s3BucketArn(Output.of(s3BucketArn));
        }

        public Builder s3Config(Output<LocationS3S3ConfigArgs> s3Config) {
            $.s3Config = s3Config;
            return this;
        }

        public Builder s3Config(LocationS3S3ConfigArgs s3Config) {
            return s3Config(Output.of(s3Config));
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class you want to store your files in when this location is used as a task destination.
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(@Nullable Output<LocationS3S3StorageClass> s3StorageClass) {
            $.s3StorageClass = s3StorageClass;
            return this;
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class you want to store your files in when this location is used as a task destination.
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(LocationS3S3StorageClass s3StorageClass) {
            return s3StorageClass(Output.of(s3StorageClass));
        }

        /**
         * @param subdirectory A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<LocationS3TagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<LocationS3TagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(LocationS3TagArgs... tags) {
            return tags(List.of(tags));
        }

        public LocationS3Args build() {
            $.s3BucketArn = Objects.requireNonNull($.s3BucketArn, "expected parameter 's3BucketArn' to be non-null");
            $.s3Config = Objects.requireNonNull($.s3Config, "expected parameter 's3Config' to be non-null");
            return $;
        }
    }

}
