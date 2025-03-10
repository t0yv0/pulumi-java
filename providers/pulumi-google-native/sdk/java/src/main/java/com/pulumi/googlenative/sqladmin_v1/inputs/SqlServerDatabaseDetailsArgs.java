// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Sql Server database on the Cloud SQL instance.
 * 
 */
public final class SqlServerDatabaseDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlServerDatabaseDetailsArgs Empty = new SqlServerDatabaseDetailsArgs();

    /**
     * The version of SQL Server with which the database is to be made compatible
     * 
     */
    @Import(name="compatibilityLevel")
    private @Nullable Output<Integer> compatibilityLevel;

    /**
     * @return The version of SQL Server with which the database is to be made compatible
     * 
     */
    public Optional<Output<Integer>> compatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }

    /**
     * The recovery model of a SQL Server database
     * 
     */
    @Import(name="recoveryModel")
    private @Nullable Output<String> recoveryModel;

    /**
     * @return The recovery model of a SQL Server database
     * 
     */
    public Optional<Output<String>> recoveryModel() {
        return Optional.ofNullable(this.recoveryModel);
    }

    private SqlServerDatabaseDetailsArgs() {}

    private SqlServerDatabaseDetailsArgs(SqlServerDatabaseDetailsArgs $) {
        this.compatibilityLevel = $.compatibilityLevel;
        this.recoveryModel = $.recoveryModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerDatabaseDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerDatabaseDetailsArgs $;

        public Builder() {
            $ = new SqlServerDatabaseDetailsArgs();
        }

        public Builder(SqlServerDatabaseDetailsArgs defaults) {
            $ = new SqlServerDatabaseDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compatibilityLevel The version of SQL Server with which the database is to be made compatible
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(@Nullable Output<Integer> compatibilityLevel) {
            $.compatibilityLevel = compatibilityLevel;
            return this;
        }

        /**
         * @param compatibilityLevel The version of SQL Server with which the database is to be made compatible
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(Integer compatibilityLevel) {
            return compatibilityLevel(Output.of(compatibilityLevel));
        }

        /**
         * @param recoveryModel The recovery model of a SQL Server database
         * 
         * @return builder
         * 
         */
        public Builder recoveryModel(@Nullable Output<String> recoveryModel) {
            $.recoveryModel = recoveryModel;
            return this;
        }

        /**
         * @param recoveryModel The recovery model of a SQL Server database
         * 
         * @return builder
         * 
         */
        public Builder recoveryModel(String recoveryModel) {
            return recoveryModel(Output.of(recoveryModel));
        }

        public SqlServerDatabaseDetailsArgs build() {
            return $;
        }
    }

}
