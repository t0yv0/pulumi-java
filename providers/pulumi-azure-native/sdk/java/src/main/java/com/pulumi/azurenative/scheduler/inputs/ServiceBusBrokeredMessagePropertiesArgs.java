// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusBrokeredMessagePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceBusBrokeredMessagePropertiesArgs Empty = new ServiceBusBrokeredMessagePropertiesArgs();

    /**
     * Gets or sets the content type.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return Gets or sets the content type.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Gets or sets the correlation ID.
     * 
     */
    @Import(name="correlationId")
    private @Nullable Output<String> correlationId;

    /**
     * @return Gets or sets the correlation ID.
     * 
     */
    public Optional<Output<String>> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }

    /**
     * Gets or sets the force persistence.
     * 
     */
    @Import(name="forcePersistence")
    private @Nullable Output<Boolean> forcePersistence;

    /**
     * @return Gets or sets the force persistence.
     * 
     */
    public Optional<Output<Boolean>> forcePersistence() {
        return Optional.ofNullable(this.forcePersistence);
    }

    /**
     * Gets or sets the label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Gets or sets the label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Gets or sets the message ID.
     * 
     */
    @Import(name="messageId")
    private @Nullable Output<String> messageId;

    /**
     * @return Gets or sets the message ID.
     * 
     */
    public Optional<Output<String>> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * Gets or sets the partition key.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<String> partitionKey;

    /**
     * @return Gets or sets the partition key.
     * 
     */
    public Optional<Output<String>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * Gets or sets the reply to.
     * 
     */
    @Import(name="replyTo")
    private @Nullable Output<String> replyTo;

    /**
     * @return Gets or sets the reply to.
     * 
     */
    public Optional<Output<String>> replyTo() {
        return Optional.ofNullable(this.replyTo);
    }

    /**
     * Gets or sets the reply to session ID.
     * 
     */
    @Import(name="replyToSessionId")
    private @Nullable Output<String> replyToSessionId;

    /**
     * @return Gets or sets the reply to session ID.
     * 
     */
    public Optional<Output<String>> replyToSessionId() {
        return Optional.ofNullable(this.replyToSessionId);
    }

    /**
     * Gets or sets the scheduled enqueue time UTC.
     * 
     */
    @Import(name="scheduledEnqueueTimeUtc")
    private @Nullable Output<String> scheduledEnqueueTimeUtc;

    /**
     * @return Gets or sets the scheduled enqueue time UTC.
     * 
     */
    public Optional<Output<String>> scheduledEnqueueTimeUtc() {
        return Optional.ofNullable(this.scheduledEnqueueTimeUtc);
    }

    /**
     * Gets or sets the session ID.
     * 
     */
    @Import(name="sessionId")
    private @Nullable Output<String> sessionId;

    /**
     * @return Gets or sets the session ID.
     * 
     */
    public Optional<Output<String>> sessionId() {
        return Optional.ofNullable(this.sessionId);
    }

    /**
     * Gets or sets the time to live.
     * 
     */
    @Import(name="timeToLive")
    private @Nullable Output<String> timeToLive;

    /**
     * @return Gets or sets the time to live.
     * 
     */
    public Optional<Output<String>> timeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    /**
     * Gets or sets the to.
     * 
     */
    @Import(name="to")
    private @Nullable Output<String> to;

    /**
     * @return Gets or sets the to.
     * 
     */
    public Optional<Output<String>> to() {
        return Optional.ofNullable(this.to);
    }

    /**
     * Gets or sets the via partition key.
     * 
     */
    @Import(name="viaPartitionKey")
    private @Nullable Output<String> viaPartitionKey;

    /**
     * @return Gets or sets the via partition key.
     * 
     */
    public Optional<Output<String>> viaPartitionKey() {
        return Optional.ofNullable(this.viaPartitionKey);
    }

    private ServiceBusBrokeredMessagePropertiesArgs() {}

    private ServiceBusBrokeredMessagePropertiesArgs(ServiceBusBrokeredMessagePropertiesArgs $) {
        this.contentType = $.contentType;
        this.correlationId = $.correlationId;
        this.forcePersistence = $.forcePersistence;
        this.label = $.label;
        this.messageId = $.messageId;
        this.partitionKey = $.partitionKey;
        this.replyTo = $.replyTo;
        this.replyToSessionId = $.replyToSessionId;
        this.scheduledEnqueueTimeUtc = $.scheduledEnqueueTimeUtc;
        this.sessionId = $.sessionId;
        this.timeToLive = $.timeToLive;
        this.to = $.to;
        this.viaPartitionKey = $.viaPartitionKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusBrokeredMessagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusBrokeredMessagePropertiesArgs $;

        public Builder() {
            $ = new ServiceBusBrokeredMessagePropertiesArgs();
        }

        public Builder(ServiceBusBrokeredMessagePropertiesArgs defaults) {
            $ = new ServiceBusBrokeredMessagePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Gets or sets the content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Gets or sets the content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param correlationId Gets or sets the correlation ID.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(@Nullable Output<String> correlationId) {
            $.correlationId = correlationId;
            return this;
        }

        /**
         * @param correlationId Gets or sets the correlation ID.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(String correlationId) {
            return correlationId(Output.of(correlationId));
        }

        /**
         * @param forcePersistence Gets or sets the force persistence.
         * 
         * @return builder
         * 
         */
        public Builder forcePersistence(@Nullable Output<Boolean> forcePersistence) {
            $.forcePersistence = forcePersistence;
            return this;
        }

        /**
         * @param forcePersistence Gets or sets the force persistence.
         * 
         * @return builder
         * 
         */
        public Builder forcePersistence(Boolean forcePersistence) {
            return forcePersistence(Output.of(forcePersistence));
        }

        /**
         * @param label Gets or sets the label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Gets or sets the label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param messageId Gets or sets the message ID.
         * 
         * @return builder
         * 
         */
        public Builder messageId(@Nullable Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param messageId Gets or sets the message ID.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        /**
         * @param partitionKey Gets or sets the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey Gets or sets the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param replyTo Gets or sets the reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyTo(@Nullable Output<String> replyTo) {
            $.replyTo = replyTo;
            return this;
        }

        /**
         * @param replyTo Gets or sets the reply to.
         * 
         * @return builder
         * 
         */
        public Builder replyTo(String replyTo) {
            return replyTo(Output.of(replyTo));
        }

        /**
         * @param replyToSessionId Gets or sets the reply to session ID.
         * 
         * @return builder
         * 
         */
        public Builder replyToSessionId(@Nullable Output<String> replyToSessionId) {
            $.replyToSessionId = replyToSessionId;
            return this;
        }

        /**
         * @param replyToSessionId Gets or sets the reply to session ID.
         * 
         * @return builder
         * 
         */
        public Builder replyToSessionId(String replyToSessionId) {
            return replyToSessionId(Output.of(replyToSessionId));
        }

        /**
         * @param scheduledEnqueueTimeUtc Gets or sets the scheduled enqueue time UTC.
         * 
         * @return builder
         * 
         */
        public Builder scheduledEnqueueTimeUtc(@Nullable Output<String> scheduledEnqueueTimeUtc) {
            $.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
            return this;
        }

        /**
         * @param scheduledEnqueueTimeUtc Gets or sets the scheduled enqueue time UTC.
         * 
         * @return builder
         * 
         */
        public Builder scheduledEnqueueTimeUtc(String scheduledEnqueueTimeUtc) {
            return scheduledEnqueueTimeUtc(Output.of(scheduledEnqueueTimeUtc));
        }

        /**
         * @param sessionId Gets or sets the session ID.
         * 
         * @return builder
         * 
         */
        public Builder sessionId(@Nullable Output<String> sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        /**
         * @param sessionId Gets or sets the session ID.
         * 
         * @return builder
         * 
         */
        public Builder sessionId(String sessionId) {
            return sessionId(Output.of(sessionId));
        }

        /**
         * @param timeToLive Gets or sets the time to live.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(@Nullable Output<String> timeToLive) {
            $.timeToLive = timeToLive;
            return this;
        }

        /**
         * @param timeToLive Gets or sets the time to live.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(String timeToLive) {
            return timeToLive(Output.of(timeToLive));
        }

        /**
         * @param to Gets or sets the to.
         * 
         * @return builder
         * 
         */
        public Builder to(@Nullable Output<String> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to Gets or sets the to.
         * 
         * @return builder
         * 
         */
        public Builder to(String to) {
            return to(Output.of(to));
        }

        /**
         * @param viaPartitionKey Gets or sets the via partition key.
         * 
         * @return builder
         * 
         */
        public Builder viaPartitionKey(@Nullable Output<String> viaPartitionKey) {
            $.viaPartitionKey = viaPartitionKey;
            return this;
        }

        /**
         * @param viaPartitionKey Gets or sets the via partition key.
         * 
         * @return builder
         * 
         */
        public Builder viaPartitionKey(String viaPartitionKey) {
            return viaPartitionKey(Output.of(viaPartitionKey));
        }

        public ServiceBusBrokeredMessagePropertiesArgs build() {
            return $;
        }
    }

}
