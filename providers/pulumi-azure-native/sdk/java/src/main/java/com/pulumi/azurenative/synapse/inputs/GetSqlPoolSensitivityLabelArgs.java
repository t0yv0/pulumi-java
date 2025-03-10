// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlPoolSensitivityLabelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlPoolSensitivityLabelArgs Empty = new GetSqlPoolSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @Import(name="columnName", required=true)
    private String columnName;

    /**
     * @return The name of the column.
     * 
     */
    public String columnName() {
        return this.columnName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schema.
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    /**
     * @return The name of the schema.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @Import(name="sensitivityLabelSource", required=true)
    private String sensitivityLabelSource;

    /**
     * @return The source of the sensitivity label.
     * 
     */
    public String sensitivityLabelSource() {
        return this.sensitivityLabelSource;
    }

    /**
     * SQL pool name
     * 
     */
    @Import(name="sqlPoolName", required=true)
    private String sqlPoolName;

    /**
     * @return SQL pool name
     * 
     */
    public String sqlPoolName() {
        return this.sqlPoolName;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    /**
     * @return The name of the table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetSqlPoolSensitivityLabelArgs() {}

    private GetSqlPoolSensitivityLabelArgs(GetSqlPoolSensitivityLabelArgs $) {
        this.columnName = $.columnName;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
        this.sensitivityLabelSource = $.sensitivityLabelSource;
        this.sqlPoolName = $.sqlPoolName;
        this.tableName = $.tableName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlPoolSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlPoolSensitivityLabelArgs $;

        public Builder() {
            $ = new GetSqlPoolSensitivityLabelArgs();
        }

        public Builder(GetSqlPoolSensitivityLabelArgs defaults) {
            $ = new GetSqlPoolSensitivityLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName The name of the column.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param schemaName The name of the schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param sensitivityLabelSource The source of the sensitivity label.
         * 
         * @return builder
         * 
         */
        public Builder sensitivityLabelSource(String sensitivityLabelSource) {
            $.sensitivityLabelSource = sensitivityLabelSource;
            return this;
        }

        /**
         * @param sqlPoolName SQL pool name
         * 
         * @return builder
         * 
         */
        public Builder sqlPoolName(String sqlPoolName) {
            $.sqlPoolName = sqlPoolName;
            return this;
        }

        /**
         * @param tableName The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetSqlPoolSensitivityLabelArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            $.sensitivityLabelSource = Objects.requireNonNull($.sensitivityLabelSource, "expected parameter 'sensitivityLabelSource' to be non-null");
            $.sqlPoolName = Objects.requireNonNull($.sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
