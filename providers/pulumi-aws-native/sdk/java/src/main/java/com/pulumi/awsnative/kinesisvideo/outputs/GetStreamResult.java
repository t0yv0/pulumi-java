// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisvideo.outputs;

import com.pulumi.awsnative.kinesisvideo.outputs.StreamTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video stream.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The number of hours till which Kinesis Video will retain the data in the stream
     * 
     */
    private final @Nullable Integer dataRetentionInHours;
    /**
     * @return The name of the device that is writing to the stream.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return AWS KMS key ID that Kinesis Video Streams uses to encrypt stream data.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return The media type of the stream. Consumers of the stream can use this information when processing the stream.
     * 
     */
    private final @Nullable String mediaType;
    /**
     * @return An array of key-value pairs associated with the Kinesis Video Stream.
     * 
     */
    private final @Nullable List<StreamTag> tags;

    @CustomType.Constructor
    private GetStreamResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("dataRetentionInHours") @Nullable Integer dataRetentionInHours,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("mediaType") @Nullable String mediaType,
        @CustomType.Parameter("tags") @Nullable List<StreamTag> tags) {
        this.arn = arn;
        this.dataRetentionInHours = dataRetentionInHours;
        this.deviceName = deviceName;
        this.kmsKeyId = kmsKeyId;
        this.mediaType = mediaType;
        this.tags = tags;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Video stream.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The number of hours till which Kinesis Video will retain the data in the stream
     * 
     */
    public Optional<Integer> dataRetentionInHours() {
        return Optional.ofNullable(this.dataRetentionInHours);
    }
    /**
     * @return The name of the device that is writing to the stream.
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return AWS KMS key ID that Kinesis Video Streams uses to encrypt stream data.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The media type of the stream. Consumers of the stream can use this information when processing the stream.
     * 
     */
    public Optional<String> mediaType() {
        return Optional.ofNullable(this.mediaType);
    }
    /**
     * @return An array of key-value pairs associated with the Kinesis Video Stream.
     * 
     */
    public List<StreamTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer dataRetentionInHours;
        private @Nullable String deviceName;
        private @Nullable String kmsKeyId;
        private @Nullable String mediaType;
        private @Nullable List<StreamTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataRetentionInHours = defaults.dataRetentionInHours;
    	      this.deviceName = defaults.deviceName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mediaType = defaults.mediaType;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder dataRetentionInHours(@Nullable Integer dataRetentionInHours) {
            this.dataRetentionInHours = dataRetentionInHours;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder mediaType(@Nullable String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Builder tags(@Nullable List<StreamTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(StreamTag... tags) {
            return tags(List.of(tags));
        }        public GetStreamResult build() {
            return new GetStreamResult(arn, dataRetentionInHours, deviceName, kmsKeyId, mediaType, tags);
        }
    }
}
