// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize;

import com.pulumi.awsnative.personalize.enums.DatasetType;
import com.pulumi.awsnative.personalize.inputs.DatasetImportJobArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to
     * 
     */
    @Import(name="datasetGroupArn", required=true)
    private Output<String> datasetGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the dataset group to add the dataset to
     * 
     */
    public Output<String> datasetGroupArn() {
        return this.datasetGroupArn;
    }

    @Import(name="datasetImportJob")
    private @Nullable Output<DatasetImportJobArgs> datasetImportJob;

    public Optional<Output<DatasetImportJobArgs>> datasetImportJob() {
        return Optional.ofNullable(this.datasetImportJob);
    }

    /**
     * The type of dataset
     * 
     */
    @Import(name="datasetType", required=true)
    private Output<DatasetType> datasetType;

    /**
     * @return The type of dataset
     * 
     */
    public Output<DatasetType> datasetType() {
        return this.datasetType;
    }

    /**
     * The name for the dataset
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the dataset
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * 
     */
    @Import(name="schemaArn", required=true)
    private Output<String> schemaArn;

    /**
     * @return The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * 
     */
    public Output<String> schemaArn() {
        return this.schemaArn;
    }

    private DatasetArgs() {}

    private DatasetArgs(DatasetArgs $) {
        this.datasetGroupArn = $.datasetGroupArn;
        this.datasetImportJob = $.datasetImportJob;
        this.datasetType = $.datasetType;
        this.name = $.name;
        this.schemaArn = $.schemaArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetArgs $;

        public Builder() {
            $ = new DatasetArgs();
        }

        public Builder(DatasetArgs defaults) {
            $ = new DatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group to add the dataset to
         * 
         * @return builder
         * 
         */
        public Builder datasetGroupArn(Output<String> datasetGroupArn) {
            $.datasetGroupArn = datasetGroupArn;
            return this;
        }

        /**
         * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group to add the dataset to
         * 
         * @return builder
         * 
         */
        public Builder datasetGroupArn(String datasetGroupArn) {
            return datasetGroupArn(Output.of(datasetGroupArn));
        }

        public Builder datasetImportJob(@Nullable Output<DatasetImportJobArgs> datasetImportJob) {
            $.datasetImportJob = datasetImportJob;
            return this;
        }

        public Builder datasetImportJob(DatasetImportJobArgs datasetImportJob) {
            return datasetImportJob(Output.of(datasetImportJob));
        }

        /**
         * @param datasetType The type of dataset
         * 
         * @return builder
         * 
         */
        public Builder datasetType(Output<DatasetType> datasetType) {
            $.datasetType = datasetType;
            return this;
        }

        /**
         * @param datasetType The type of dataset
         * 
         * @return builder
         * 
         */
        public Builder datasetType(DatasetType datasetType) {
            return datasetType(Output.of(datasetType));
        }

        /**
         * @param name The name for the dataset
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the dataset
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schemaArn The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
         * 
         * @return builder
         * 
         */
        public Builder schemaArn(Output<String> schemaArn) {
            $.schemaArn = schemaArn;
            return this;
        }

        /**
         * @param schemaArn The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
         * 
         * @return builder
         * 
         */
        public Builder schemaArn(String schemaArn) {
            return schemaArn(Output.of(schemaArn));
        }

        public DatasetArgs build() {
            $.datasetGroupArn = Objects.requireNonNull($.datasetGroupArn, "expected parameter 'datasetGroupArn' to be non-null");
            $.datasetType = Objects.requireNonNull($.datasetType, "expected parameter 'datasetType' to be non-null");
            $.schemaArn = Objects.requireNonNull($.schemaArn, "expected parameter 'schemaArn' to be non-null");
            return $;
        }
    }

}
