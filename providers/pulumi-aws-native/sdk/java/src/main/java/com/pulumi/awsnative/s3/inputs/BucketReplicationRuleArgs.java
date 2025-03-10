// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketReplicationRuleStatus;
import com.pulumi.awsnative.s3.inputs.BucketDeleteMarkerReplicationArgs;
import com.pulumi.awsnative.s3.inputs.BucketReplicationDestinationArgs;
import com.pulumi.awsnative.s3.inputs.BucketReplicationRuleFilterArgs;
import com.pulumi.awsnative.s3.inputs.BucketSourceSelectionCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 * 
 */
public final class BucketReplicationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationRuleArgs Empty = new BucketReplicationRuleArgs();

    @Import(name="deleteMarkerReplication")
    private @Nullable Output<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication;

    public Optional<Output<BucketDeleteMarkerReplicationArgs>> deleteMarkerReplication() {
        return Optional.ofNullable(this.deleteMarkerReplication);
    }

    @Import(name="destination", required=true)
    private Output<BucketReplicationDestinationArgs> destination;

    public Output<BucketReplicationDestinationArgs> destination() {
        return this.destination;
    }

    @Import(name="filter")
    private @Nullable Output<BucketReplicationRuleFilterArgs> filter;

    public Optional<Output<BucketReplicationRuleFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A unique identifier for the rule.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A unique identifier for the rule.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="sourceSelectionCriteria")
    private @Nullable Output<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria;

    public Optional<Output<BucketSourceSelectionCriteriaArgs>> sourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }

    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @Import(name="status", required=true)
    private Output<BucketReplicationRuleStatus> status;

    /**
     * @return Specifies whether the rule is enabled.
     * 
     */
    public Output<BucketReplicationRuleStatus> status() {
        return this.status;
    }

    private BucketReplicationRuleArgs() {}

    private BucketReplicationRuleArgs(BucketReplicationRuleArgs $) {
        this.deleteMarkerReplication = $.deleteMarkerReplication;
        this.destination = $.destination;
        this.filter = $.filter;
        this.id = $.id;
        this.prefix = $.prefix;
        this.priority = $.priority;
        this.sourceSelectionCriteria = $.sourceSelectionCriteria;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationRuleArgs $;

        public Builder() {
            $ = new BucketReplicationRuleArgs();
        }

        public Builder(BucketReplicationRuleArgs defaults) {
            $ = new BucketReplicationRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteMarkerReplication(@Nullable Output<BucketDeleteMarkerReplicationArgs> deleteMarkerReplication) {
            $.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        public Builder deleteMarkerReplication(BucketDeleteMarkerReplicationArgs deleteMarkerReplication) {
            return deleteMarkerReplication(Output.of(deleteMarkerReplication));
        }

        public Builder destination(Output<BucketReplicationDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(BucketReplicationDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder filter(@Nullable Output<BucketReplicationRuleFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(BucketReplicationRuleFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param id A unique identifier for the rule.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A unique identifier for the rule.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param prefix An object key name prefix that identifies the object or objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An object key name prefix that identifies the object or objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder sourceSelectionCriteria(@Nullable Output<BucketSourceSelectionCriteriaArgs> sourceSelectionCriteria) {
            $.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder sourceSelectionCriteria(BucketSourceSelectionCriteriaArgs sourceSelectionCriteria) {
            return sourceSelectionCriteria(Output.of(sourceSelectionCriteria));
        }

        /**
         * @param status Specifies whether the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<BucketReplicationRuleStatus> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies whether the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(BucketReplicationRuleStatus status) {
            return status(Output.of(status));
        }

        public BucketReplicationRuleArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
