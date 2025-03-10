// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.MysqlColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL table.
 * 
 */
public final class MysqlTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlTableArgs Empty = new MysqlTableArgs();

    /**
     * MySQL columns in the database. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    @Import(name="mysqlColumns")
    private @Nullable Output<List<MysqlColumnArgs>> mysqlColumns;

    /**
     * @return MySQL columns in the database. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    public Optional<Output<List<MysqlColumnArgs>>> mysqlColumns() {
        return Optional.ofNullable(this.mysqlColumns);
    }

    /**
     * Table name.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Table name.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private MysqlTableArgs() {}

    private MysqlTableArgs(MysqlTableArgs $) {
        this.mysqlColumns = $.mysqlColumns;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlTableArgs $;

        public Builder() {
            $ = new MysqlTableArgs();
        }

        public Builder(MysqlTableArgs defaults) {
            $ = new MysqlTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mysqlColumns MySQL columns in the database. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(@Nullable Output<List<MysqlColumnArgs>> mysqlColumns) {
            $.mysqlColumns = mysqlColumns;
            return this;
        }

        /**
         * @param mysqlColumns MySQL columns in the database. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(List<MysqlColumnArgs> mysqlColumns) {
            return mysqlColumns(Output.of(mysqlColumns));
        }

        /**
         * @param mysqlColumns MySQL columns in the database. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(MysqlColumnArgs... mysqlColumns) {
            return mysqlColumns(List.of(mysqlColumns));
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public MysqlTableArgs build() {
            return $;
        }
    }

}
