// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs;
import com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GCPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final GCPolicyState Empty = new GCPolicyState();

    /**
     * The name of the column family.
     * 
     */
    @Import(name="columnFamily")
    private @Nullable Output<String> columnFamily;

    /**
     * @return The name of the column family.
     * 
     */
    public Optional<Output<String>> columnFamily() {
        return Optional.ofNullable(this.columnFamily);
    }

    /**
     * Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
     * 
     */
    @Import(name="gcRules")
    private @Nullable Output<String> gcRules;

    /**
     * @return Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
     * 
     */
    public Optional<Output<String>> gcRules() {
        return Optional.ofNullable(this.gcRules);
    }

    /**
     * The name of the Bigtable instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the Bigtable instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * GC policy that applies to all cells older than the given age.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<GCPolicyMaxAgeArgs> maxAge;

    /**
     * @return GC policy that applies to all cells older than the given age.
     * 
     */
    public Optional<Output<GCPolicyMaxAgeArgs>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    /**
     * GC policy that applies to all versions of a cell except for the most recent.
     * 
     */
    @Import(name="maxVersions")
    private @Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions;

    /**
     * @return GC policy that applies to all versions of a cell except for the most recent.
     * 
     */
    public Optional<Output<List<GCPolicyMaxVersionArgs>>> maxVersions() {
        return Optional.ofNullable(this.maxVersions);
    }

    /**
     * If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return The name of the table.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private GCPolicyState() {}

    private GCPolicyState(GCPolicyState $) {
        this.columnFamily = $.columnFamily;
        this.gcRules = $.gcRules;
        this.instanceName = $.instanceName;
        this.maxAge = $.maxAge;
        this.maxVersions = $.maxVersions;
        this.mode = $.mode;
        this.project = $.project;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GCPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GCPolicyState $;

        public Builder() {
            $ = new GCPolicyState();
        }

        public Builder(GCPolicyState defaults) {
            $ = new GCPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnFamily The name of the column family.
         * 
         * @return builder
         * 
         */
        public Builder columnFamily(@Nullable Output<String> columnFamily) {
            $.columnFamily = columnFamily;
            return this;
        }

        /**
         * @param columnFamily The name of the column family.
         * 
         * @return builder
         * 
         */
        public Builder columnFamily(String columnFamily) {
            return columnFamily(Output.of(columnFamily));
        }

        /**
         * @param gcRules Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
         * 
         * @return builder
         * 
         */
        public Builder gcRules(@Nullable Output<String> gcRules) {
            $.gcRules = gcRules;
            return this;
        }

        /**
         * @param gcRules Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
         * 
         * @return builder
         * 
         */
        public Builder gcRules(String gcRules) {
            return gcRules(Output.of(gcRules));
        }

        /**
         * @param instanceName The name of the Bigtable instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the Bigtable instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param maxAge GC policy that applies to all cells older than the given age.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<GCPolicyMaxAgeArgs> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge GC policy that applies to all cells older than the given age.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(GCPolicyMaxAgeArgs maxAge) {
            return maxAge(Output.of(maxAge));
        }

        /**
         * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
         * 
         * @return builder
         * 
         */
        public Builder maxVersions(@Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions) {
            $.maxVersions = maxVersions;
            return this;
        }

        /**
         * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
         * 
         * @return builder
         * 
         */
        public Builder maxVersions(List<GCPolicyMaxVersionArgs> maxVersions) {
            return maxVersions(Output.of(maxVersions));
        }

        /**
         * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
         * 
         * @return builder
         * 
         */
        public Builder maxVersions(GCPolicyMaxVersionArgs... maxVersions) {
            return maxVersions(List.of(maxVersions));
        }

        /**
         * @param mode If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param table The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public GCPolicyState build() {
            return $;
        }
    }

}
