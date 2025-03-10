// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.azurenative.servicebus.outputs.MessageCountDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicResult {
    /**
     * @return Last time the message was sent, or a request was received, for this topic.
     * 
     */
    private final String accessedAt;
    /**
     * @return ISO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    private final @Nullable String autoDeleteOnIdle;
    /**
     * @return Message count details
     * 
     */
    private final MessageCountDetailsResponse countDetails;
    /**
     * @return Exact time the message was created.
     * 
     */
    private final String createdAt;
    /**
     * @return ISO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    private final @Nullable String defaultMessageTimeToLive;
    /**
     * @return ISO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    private final @Nullable String duplicateDetectionHistoryTimeWindow;
    /**
     * @return Value that indicates whether server-side batched operations are enabled.
     * 
     */
    private final @Nullable Boolean enableBatchedOperations;
    /**
     * @return Value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    private final @Nullable Boolean enableExpress;
    /**
     * @return Value that indicates whether the topic to be partitioned across multiple message brokers is enabled.
     * 
     */
    private final @Nullable Boolean enablePartitioning;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024.
     * 
     */
    private final @Nullable Integer maxSizeInMegabytes;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Value indicating if this topic requires duplicate detection.
     * 
     */
    private final @Nullable Boolean requiresDuplicateDetection;
    /**
     * @return Size of the topic, in bytes.
     * 
     */
    private final Double sizeInBytes;
    /**
     * @return Enumerates the possible values for the status of a messaging entity.
     * 
     */
    private final @Nullable String status;
    /**
     * @return Number of subscriptions.
     * 
     */
    private final Integer subscriptionCount;
    /**
     * @return Value that indicates whether the topic supports ordering.
     * 
     */
    private final @Nullable Boolean supportOrdering;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return The exact time the message was updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetTopicResult(
        @CustomType.Parameter("accessedAt") String accessedAt,
        @CustomType.Parameter("autoDeleteOnIdle") @Nullable String autoDeleteOnIdle,
        @CustomType.Parameter("countDetails") MessageCountDetailsResponse countDetails,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("defaultMessageTimeToLive") @Nullable String defaultMessageTimeToLive,
        @CustomType.Parameter("duplicateDetectionHistoryTimeWindow") @Nullable String duplicateDetectionHistoryTimeWindow,
        @CustomType.Parameter("enableBatchedOperations") @Nullable Boolean enableBatchedOperations,
        @CustomType.Parameter("enableExpress") @Nullable Boolean enableExpress,
        @CustomType.Parameter("enablePartitioning") @Nullable Boolean enablePartitioning,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("maxSizeInMegabytes") @Nullable Integer maxSizeInMegabytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requiresDuplicateDetection") @Nullable Boolean requiresDuplicateDetection,
        @CustomType.Parameter("sizeInBytes") Double sizeInBytes,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("subscriptionCount") Integer subscriptionCount,
        @CustomType.Parameter("supportOrdering") @Nullable Boolean supportOrdering,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.accessedAt = accessedAt;
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.countDetails = countDetails;
        this.createdAt = createdAt;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.enableExpress = enableExpress;
        this.enablePartitioning = enablePartitioning;
        this.id = id;
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        this.name = name;
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        this.sizeInBytes = sizeInBytes;
        this.status = status;
        this.subscriptionCount = subscriptionCount;
        this.supportOrdering = supportOrdering;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * @return Last time the message was sent, or a request was received, for this topic.
     * 
     */
    public String accessedAt() {
        return this.accessedAt;
    }
    /**
     * @return ISO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    public Optional<String> autoDeleteOnIdle() {
        return Optional.ofNullable(this.autoDeleteOnIdle);
    }
    /**
     * @return Message count details
     * 
     */
    public MessageCountDetailsResponse countDetails() {
        return this.countDetails;
    }
    /**
     * @return Exact time the message was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return ISO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    public Optional<String> defaultMessageTimeToLive() {
        return Optional.ofNullable(this.defaultMessageTimeToLive);
    }
    /**
     * @return ISO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    public Optional<String> duplicateDetectionHistoryTimeWindow() {
        return Optional.ofNullable(this.duplicateDetectionHistoryTimeWindow);
    }
    /**
     * @return Value that indicates whether server-side batched operations are enabled.
     * 
     */
    public Optional<Boolean> enableBatchedOperations() {
        return Optional.ofNullable(this.enableBatchedOperations);
    }
    /**
     * @return Value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    public Optional<Boolean> enableExpress() {
        return Optional.ofNullable(this.enableExpress);
    }
    /**
     * @return Value that indicates whether the topic to be partitioned across multiple message brokers is enabled.
     * 
     */
    public Optional<Boolean> enablePartitioning() {
        return Optional.ofNullable(this.enablePartitioning);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024.
     * 
     */
    public Optional<Integer> maxSizeInMegabytes() {
        return Optional.ofNullable(this.maxSizeInMegabytes);
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value indicating if this topic requires duplicate detection.
     * 
     */
    public Optional<Boolean> requiresDuplicateDetection() {
        return Optional.ofNullable(this.requiresDuplicateDetection);
    }
    /**
     * @return Size of the topic, in bytes.
     * 
     */
    public Double sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * @return Enumerates the possible values for the status of a messaging entity.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Number of subscriptions.
     * 
     */
    public Integer subscriptionCount() {
        return this.subscriptionCount;
    }
    /**
     * @return Value that indicates whether the topic supports ordering.
     * 
     */
    public Optional<Boolean> supportOrdering() {
        return Optional.ofNullable(this.supportOrdering);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The exact time the message was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessedAt;
        private @Nullable String autoDeleteOnIdle;
        private MessageCountDetailsResponse countDetails;
        private String createdAt;
        private @Nullable String defaultMessageTimeToLive;
        private @Nullable String duplicateDetectionHistoryTimeWindow;
        private @Nullable Boolean enableBatchedOperations;
        private @Nullable Boolean enableExpress;
        private @Nullable Boolean enablePartitioning;
        private String id;
        private @Nullable Integer maxSizeInMegabytes;
        private String name;
        private @Nullable Boolean requiresDuplicateDetection;
        private Double sizeInBytes;
        private @Nullable String status;
        private Integer subscriptionCount;
        private @Nullable Boolean supportOrdering;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessedAt = defaults.accessedAt;
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.countDetails = defaults.countDetails;
    	      this.createdAt = defaults.createdAt;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.id = defaults.id;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.name = defaults.name;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.subscriptionCount = defaults.subscriptionCount;
    	      this.supportOrdering = defaults.supportOrdering;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder accessedAt(String accessedAt) {
            this.accessedAt = Objects.requireNonNull(accessedAt);
            return this;
        }
        public Builder autoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }
        public Builder countDetails(MessageCountDetailsResponse countDetails) {
            this.countDetails = Objects.requireNonNull(countDetails);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder defaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }
        public Builder enableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }
        public Builder enableExpress(@Nullable Boolean enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }
        public Builder enablePartitioning(@Nullable Boolean enablePartitioning) {
            this.enablePartitioning = enablePartitioning;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder maxSizeInMegabytes(@Nullable Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requiresDuplicateDetection(@Nullable Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }
        public Builder sizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder subscriptionCount(Integer subscriptionCount) {
            this.subscriptionCount = Objects.requireNonNull(subscriptionCount);
            return this;
        }
        public Builder supportOrdering(@Nullable Boolean supportOrdering) {
            this.supportOrdering = supportOrdering;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetTopicResult build() {
            return new GetTopicResult(accessedAt, autoDeleteOnIdle, countDetails, createdAt, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, enableExpress, enablePartitioning, id, maxSizeInMegabytes, name, requiresDuplicateDetection, sizeInBytes, status, subscriptionCount, supportOrdering, type, updatedAt);
        }
    }
}
