// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobQueryDestinationTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobQueryDestinationTableArgs Empty = new JobQueryDestinationTableArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this model.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The ID of the project containing this model.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    /**
     * @return The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    public Output<String> tableId() {
        return this.tableId;
    }

    private JobQueryDestinationTableArgs() {}

    private JobQueryDestinationTableArgs(JobQueryDestinationTableArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueryDestinationTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueryDestinationTableArgs $;

        public Builder() {
            $ = new JobQueryDestinationTableArgs();
        }

        public Builder(JobQueryDestinationTableArgs defaults) {
            $ = new JobQueryDestinationTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tableId The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
         * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
         * 
         * @return builder
         * 
         */
        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableId The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
         * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
         * 
         * @return builder
         * 
         */
        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public JobQueryDestinationTableArgs build() {
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
