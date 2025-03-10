// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.enums.DatasetAccessEntryTargetTypesItem;
import com.pulumi.googlenative.bigquery_v2.inputs.DatasetReferenceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetAccessEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetAccessEntryArgs Empty = new DatasetAccessEntryArgs();

    /**
     * [Required] The dataset this entry applies to.
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<DatasetReferenceArgs> dataset;

    /**
     * @return [Required] The dataset this entry applies to.
     * 
     */
    public Optional<Output<DatasetReferenceArgs>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    @Import(name="targetTypes")
    private @Nullable Output<List<DatasetAccessEntryTargetTypesItem>> targetTypes;

    public Optional<Output<List<DatasetAccessEntryTargetTypesItem>>> targetTypes() {
        return Optional.ofNullable(this.targetTypes);
    }

    private DatasetAccessEntryArgs() {}

    private DatasetAccessEntryArgs(DatasetAccessEntryArgs $) {
        this.dataset = $.dataset;
        this.targetTypes = $.targetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetAccessEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessEntryArgs $;

        public Builder() {
            $ = new DatasetAccessEntryArgs();
        }

        public Builder(DatasetAccessEntryArgs defaults) {
            $ = new DatasetAccessEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset [Required] The dataset this entry applies to.
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<DatasetReferenceArgs> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset [Required] The dataset this entry applies to.
         * 
         * @return builder
         * 
         */
        public Builder dataset(DatasetReferenceArgs dataset) {
            return dataset(Output.of(dataset));
        }

        public Builder targetTypes(@Nullable Output<List<DatasetAccessEntryTargetTypesItem>> targetTypes) {
            $.targetTypes = targetTypes;
            return this;
        }

        public Builder targetTypes(List<DatasetAccessEntryTargetTypesItem> targetTypes) {
            return targetTypes(Output.of(targetTypes));
        }

        public Builder targetTypes(DatasetAccessEntryTargetTypesItem... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }

        public DatasetAccessEntryArgs build() {
            return $;
        }
    }

}
