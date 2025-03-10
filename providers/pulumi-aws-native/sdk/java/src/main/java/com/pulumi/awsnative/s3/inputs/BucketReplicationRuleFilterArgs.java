// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketReplicationRuleAndOperatorArgs;
import com.pulumi.awsnative.s3.inputs.BucketTagFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationRuleFilterArgs Empty = new BucketReplicationRuleFilterArgs();

    @Import(name="and")
    private @Nullable Output<BucketReplicationRuleAndOperatorArgs> and;

    public Optional<Output<BucketReplicationRuleAndOperatorArgs>> and() {
        return Optional.ofNullable(this.and);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="tagFilter")
    private @Nullable Output<BucketTagFilterArgs> tagFilter;

    public Optional<Output<BucketTagFilterArgs>> tagFilter() {
        return Optional.ofNullable(this.tagFilter);
    }

    private BucketReplicationRuleFilterArgs() {}

    private BucketReplicationRuleFilterArgs(BucketReplicationRuleFilterArgs $) {
        this.and = $.and;
        this.prefix = $.prefix;
        this.tagFilter = $.tagFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationRuleFilterArgs $;

        public Builder() {
            $ = new BucketReplicationRuleFilterArgs();
        }

        public Builder(BucketReplicationRuleFilterArgs defaults) {
            $ = new BucketReplicationRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder and(@Nullable Output<BucketReplicationRuleAndOperatorArgs> and) {
            $.and = and;
            return this;
        }

        public Builder and(BucketReplicationRuleAndOperatorArgs and) {
            return and(Output.of(and));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder tagFilter(@Nullable Output<BucketTagFilterArgs> tagFilter) {
            $.tagFilter = tagFilter;
            return this;
        }

        public Builder tagFilter(BucketTagFilterArgs tagFilter) {
            return tagFilter(Output.of(tagFilter));
        }

        public BucketReplicationRuleFilterArgs build() {
            return $;
        }
    }

}
