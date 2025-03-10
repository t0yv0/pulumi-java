// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketV2LifecycleRuleNoncurrentVersionTransition {
    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    private final @Nullable Integer days;
    /**
     * @return Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    private final String storageClass;

    @CustomType.Constructor
    private BucketV2LifecycleRuleNoncurrentVersionTransition(
        @CustomType.Parameter("days") @Nullable Integer days,
        @CustomType.Parameter("storageClass") String storageClass) {
        this.days = days;
        this.storageClass = storageClass;
    }

    /**
     * @return Specifies the number of days noncurrent object versions transition.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2LifecycleRuleNoncurrentVersionTransition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private String storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketV2LifecycleRuleNoncurrentVersionTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }        public BucketV2LifecycleRuleNoncurrentVersionTransition build() {
            return new BucketV2LifecycleRuleNoncurrentVersionTransition(days, storageClass);
        }
    }
}
