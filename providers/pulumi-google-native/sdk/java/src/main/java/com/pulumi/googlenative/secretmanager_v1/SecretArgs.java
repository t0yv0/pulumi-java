// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1.inputs.ReplicationArgs;
import com.pulumi.googlenative.secretmanager_v1.inputs.RotationArgs;
import com.pulumi.googlenative.secretmanager_v1.inputs.TopicArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Optional. Etag of the currently stored Secret.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. Etag of the currently stored Secret.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    @Import(name="replication", required=true)
    private Output<ReplicationArgs> replication;

    /**
     * @return Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    public Output<ReplicationArgs> replication() {
        return this.replication;
    }

    /**
     * Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    @Import(name="rotation")
    private @Nullable Output<RotationArgs> rotation;

    /**
     * @return Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    public Optional<Output<RotationArgs>> rotation() {
        return Optional.ofNullable(this.rotation);
    }

    /**
     * Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    /**
     * Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    @Import(name="topics")
    private @Nullable Output<List<TopicArgs>> topics;

    /**
     * @return Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    public Optional<Output<List<TopicArgs>>> topics() {
        return Optional.ofNullable(this.topics);
    }

    /**
     * Input only. The TTL for the Secret.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    /**
     * @return Input only. The TTL for the Secret.
     * 
     */
    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.etag = $.etag;
        this.expireTime = $.expireTime;
        this.labels = $.labels;
        this.project = $.project;
        this.replication = $.replication;
        this.rotation = $.rotation;
        this.secretId = $.secretId;
        this.topics = $.topics;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag Optional. Etag of the currently stored Secret.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. Etag of the currently stored Secret.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param expireTime Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param labels The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param replication Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
         * 
         * @return builder
         * 
         */
        public Builder replication(Output<ReplicationArgs> replication) {
            $.replication = replication;
            return this;
        }

        /**
         * @param replication Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
         * 
         * @return builder
         * 
         */
        public Builder replication(ReplicationArgs replication) {
            return replication(Output.of(replication));
        }

        /**
         * @param rotation Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
         * 
         * @return builder
         * 
         */
        public Builder rotation(@Nullable Output<RotationArgs> rotation) {
            $.rotation = rotation;
            return this;
        }

        /**
         * @param rotation Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
         * 
         * @return builder
         * 
         */
        public Builder rotation(RotationArgs rotation) {
            return rotation(Output.of(rotation));
        }

        /**
         * @param secretId Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param topics Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
         * 
         * @return builder
         * 
         */
        public Builder topics(@Nullable Output<List<TopicArgs>> topics) {
            $.topics = topics;
            return this;
        }

        /**
         * @param topics Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
         * 
         * @return builder
         * 
         */
        public Builder topics(List<TopicArgs> topics) {
            return topics(Output.of(topics));
        }

        /**
         * @param topics Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
         * 
         * @return builder
         * 
         */
        public Builder topics(TopicArgs... topics) {
            return topics(List.of(topics));
        }

        /**
         * @param ttl Input only. The TTL for the Secret.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Input only. The TTL for the Secret.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        public SecretArgs build() {
            $.replication = Objects.requireNonNull($.replication, "expected parameter 'replication' to be non-null");
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
