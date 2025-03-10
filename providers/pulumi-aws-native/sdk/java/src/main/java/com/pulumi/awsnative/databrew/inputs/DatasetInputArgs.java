// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.DatasetDataCatalogInputDefinitionArgs;
import com.pulumi.awsnative.databrew.inputs.DatasetDatabaseInputDefinitionArgs;
import com.pulumi.awsnative.databrew.inputs.DatasetMetadataArgs;
import com.pulumi.awsnative.databrew.inputs.DatasetS3LocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input
 * 
 */
public final class DatasetInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetInputArgs Empty = new DatasetInputArgs();

    @Import(name="dataCatalogInputDefinition")
    private @Nullable Output<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;

    public Optional<Output<DatasetDataCatalogInputDefinitionArgs>> dataCatalogInputDefinition() {
        return Optional.ofNullable(this.dataCatalogInputDefinition);
    }

    @Import(name="databaseInputDefinition")
    private @Nullable Output<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition;

    public Optional<Output<DatasetDatabaseInputDefinitionArgs>> databaseInputDefinition() {
        return Optional.ofNullable(this.databaseInputDefinition);
    }

    @Import(name="metadata")
    private @Nullable Output<DatasetMetadataArgs> metadata;

    public Optional<Output<DatasetMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    @Import(name="s3InputDefinition")
    private @Nullable Output<DatasetS3LocationArgs> s3InputDefinition;

    public Optional<Output<DatasetS3LocationArgs>> s3InputDefinition() {
        return Optional.ofNullable(this.s3InputDefinition);
    }

    private DatasetInputArgs() {}

    private DatasetInputArgs(DatasetInputArgs $) {
        this.dataCatalogInputDefinition = $.dataCatalogInputDefinition;
        this.databaseInputDefinition = $.databaseInputDefinition;
        this.metadata = $.metadata;
        this.s3InputDefinition = $.s3InputDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetInputArgs $;

        public Builder() {
            $ = new DatasetInputArgs();
        }

        public Builder(DatasetInputArgs defaults) {
            $ = new DatasetInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataCatalogInputDefinition(@Nullable Output<DatasetDataCatalogInputDefinitionArgs> dataCatalogInputDefinition) {
            $.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder dataCatalogInputDefinition(DatasetDataCatalogInputDefinitionArgs dataCatalogInputDefinition) {
            return dataCatalogInputDefinition(Output.of(dataCatalogInputDefinition));
        }

        public Builder databaseInputDefinition(@Nullable Output<DatasetDatabaseInputDefinitionArgs> databaseInputDefinition) {
            $.databaseInputDefinition = databaseInputDefinition;
            return this;
        }

        public Builder databaseInputDefinition(DatasetDatabaseInputDefinitionArgs databaseInputDefinition) {
            return databaseInputDefinition(Output.of(databaseInputDefinition));
        }

        public Builder metadata(@Nullable Output<DatasetMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(DatasetMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder s3InputDefinition(@Nullable Output<DatasetS3LocationArgs> s3InputDefinition) {
            $.s3InputDefinition = s3InputDefinition;
            return this;
        }

        public Builder s3InputDefinition(DatasetS3LocationArgs s3InputDefinition) {
            return s3InputDefinition(Output.of(s3InputDefinition));
        }

        public DatasetInputArgs build() {
            return $;
        }
    }

}
