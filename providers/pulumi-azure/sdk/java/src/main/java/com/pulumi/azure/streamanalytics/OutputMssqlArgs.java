// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputMssqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputMssqlArgs Empty = new OutputMssqlArgs();

    @Import(name="database", required=true)
    private Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * The max batch count to write to the SQL Database. Defaults to `10000`. Possible values are between `1` and `1073741824`.
     * 
     */
    @Import(name="maxBatchCount")
    private @Nullable Output<Double> maxBatchCount;

    /**
     * @return The max batch count to write to the SQL Database. Defaults to `10000`. Possible values are between `1` and `1073741824`.
     * 
     */
    public Optional<Output<Double>> maxBatchCount() {
        return Optional.ofNullable(this.maxBatchCount);
    }

    /**
     * The max writer count for the SQL Database. Defaults to `1`. Possible values are `0` which bases the writer count on the query partition and `1` which corresponds to a single writer.
     * 
     */
    @Import(name="maxWriterCount")
    private @Nullable Output<Double> maxWriterCount;

    /**
     * @return The max writer count for the SQL Database. Defaults to `1`. Possible values are `0` which bases the writer count on the query partition and `1` which corresponds to a single writer.
     * 
     */
    public Optional<Output<Double>> maxWriterCount() {
        return Optional.ofNullable(this.maxWriterCount);
    }

    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Password used together with username, to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password used together with username, to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SQL server url. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The SQL server url. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName", required=true)
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    /**
     * Table in the database that the output points to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="table", required=true)
    private Output<String> table;

    /**
     * @return Table in the database that the output points to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> table() {
        return this.table;
    }

    /**
     * Username used to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return Username used to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private OutputMssqlArgs() {}

    private OutputMssqlArgs(OutputMssqlArgs $) {
        this.database = $.database;
        this.maxBatchCount = $.maxBatchCount;
        this.maxWriterCount = $.maxWriterCount;
        this.name = $.name;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.server = $.server;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
        this.table = $.table;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputMssqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputMssqlArgs $;

        public Builder() {
            $ = new OutputMssqlArgs();
        }

        public Builder(OutputMssqlArgs defaults) {
            $ = new OutputMssqlArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param maxBatchCount The max batch count to write to the SQL Database. Defaults to `10000`. Possible values are between `1` and `1073741824`.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchCount(@Nullable Output<Double> maxBatchCount) {
            $.maxBatchCount = maxBatchCount;
            return this;
        }

        /**
         * @param maxBatchCount The max batch count to write to the SQL Database. Defaults to `10000`. Possible values are between `1` and `1073741824`.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchCount(Double maxBatchCount) {
            return maxBatchCount(Output.of(maxBatchCount));
        }

        /**
         * @param maxWriterCount The max writer count for the SQL Database. Defaults to `1`. Possible values are `0` which bases the writer count on the query partition and `1` which corresponds to a single writer.
         * 
         * @return builder
         * 
         */
        public Builder maxWriterCount(@Nullable Output<Double> maxWriterCount) {
            $.maxWriterCount = maxWriterCount;
            return this;
        }

        /**
         * @param maxWriterCount The max writer count for the SQL Database. Defaults to `1`. Possible values are `0` which bases the writer count on the query partition and `1` which corresponds to a single writer.
         * 
         * @return builder
         * 
         */
        public Builder maxWriterCount(Double maxWriterCount) {
            return maxWriterCount(Output.of(maxWriterCount));
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password Password used together with username, to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password used together with username, to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param server The SQL server url. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The SQL server url. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        /**
         * @param table Table in the database that the output points to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder table(Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Table in the database that the output points to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        /**
         * @param user Username used to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Username used to login to the Microsoft SQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public OutputMssqlArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.streamAnalyticsJobName = Objects.requireNonNull($.streamAnalyticsJobName, "expected parameter 'streamAnalyticsJobName' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}
