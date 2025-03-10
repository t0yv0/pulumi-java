// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetAutonomousDatabasesFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutonomousDatabasesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousDatabasesArgs Empty = new GetAutonomousDatabasesArgs();

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseId")
    private @Nullable String autonomousContainerDatabaseId;

    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<String> autonomousContainerDatabaseId() {
        return Optional.ofNullable(this.autonomousContainerDatabaseId);
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only autonomous database resources that match the specified dbVersion.
     * 
     */
    @Import(name="dbVersion")
    private @Nullable String dbVersion;

    /**
     * @return A filter to return only autonomous database resources that match the specified dbVersion.
     * 
     */
    public Optional<String> dbVersion() {
        return Optional.ofNullable(this.dbVersion);
    }

    /**
     * A filter to return only autonomous database resources that match the specified workload type.
     * 
     */
    @Import(name="dbWorkload")
    private @Nullable String dbWorkload;

    /**
     * @return A filter to return only autonomous database resources that match the specified workload type.
     * 
     */
    public Optional<String> dbWorkload() {
        return Optional.ofNullable(this.dbWorkload);
    }

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetAutonomousDatabasesFilter> filters;

    public Optional<List<GetAutonomousDatabasesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given Infrastructure Type.
     * 
     */
    @Import(name="infrastructureType")
    private @Nullable String infrastructureType;

    /**
     * @return A filter to return only resources that match the given Infrastructure Type.
     * 
     */
    public Optional<String> infrastructureType() {
        return Optional.ofNullable(this.infrastructureType);
    }

    /**
     * A filter to return only resources that have Data Guard enabled.
     * 
     */
    @Import(name="isDataGuardEnabled")
    private @Nullable Boolean isDataGuardEnabled;

    /**
     * @return A filter to return only resources that have Data Guard enabled.
     * 
     */
    public Optional<Boolean> isDataGuardEnabled() {
        return Optional.ofNullable(this.isDataGuardEnabled);
    }

    /**
     * Filter on the value of the resource&#39;s &#39;isFreeTier&#39; property. A value of `true` returns only Always Free resources. A value of `false` excludes Always Free resources from the returned results. Omitting this parameter returns both Always Free and paid resources.
     * 
     */
    @Import(name="isFreeTier")
    private @Nullable Boolean isFreeTier;

    /**
     * @return Filter on the value of the resource&#39;s &#39;isFreeTier&#39; property. A value of `true` returns only Always Free resources. A value of `false` excludes Always Free resources from the returned results. Omitting this parameter returns both Always Free and paid resources.
     * 
     */
    public Optional<Boolean> isFreeTier() {
        return Optional.ofNullable(this.isFreeTier);
    }

    /**
     * Filter on the value of the resource&#39;s &#39;isRefreshableClone&#39; property. A value of `true` returns only refreshable clones. A value of `false` excludes refreshable clones from the returned results. Omitting this parameter returns both refreshable clones and databases that are not refreshable clones.
     * 
     */
    @Import(name="isRefreshableClone")
    private @Nullable Boolean isRefreshableClone;

    /**
     * @return Filter on the value of the resource&#39;s &#39;isRefreshableClone&#39; property. A value of `true` returns only refreshable clones. A value of `false` excludes refreshable clones from the returned results. Omitting this parameter returns both refreshable clones and databases that are not refreshable clones.
     * 
     */
    public Optional<Boolean> isRefreshableClone() {
        return Optional.ofNullable(this.isRefreshableClone);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetAutonomousDatabasesArgs() {}

    private GetAutonomousDatabasesArgs(GetAutonomousDatabasesArgs $) {
        this.autonomousContainerDatabaseId = $.autonomousContainerDatabaseId;
        this.compartmentId = $.compartmentId;
        this.dbVersion = $.dbVersion;
        this.dbWorkload = $.dbWorkload;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.infrastructureType = $.infrastructureType;
        this.isDataGuardEnabled = $.isDataGuardEnabled;
        this.isFreeTier = $.isFreeTier;
        this.isRefreshableClone = $.isRefreshableClone;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousDatabasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousDatabasesArgs $;

        public Builder() {
            $ = new GetAutonomousDatabasesArgs();
        }

        public Builder(GetAutonomousDatabasesArgs defaults) {
            $ = new GetAutonomousDatabasesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(@Nullable String autonomousContainerDatabaseId) {
            $.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param dbVersion A filter to return only autonomous database resources that match the specified dbVersion.
         * 
         * @return builder
         * 
         */
        public Builder dbVersion(@Nullable String dbVersion) {
            $.dbVersion = dbVersion;
            return this;
        }

        /**
         * @param dbWorkload A filter to return only autonomous database resources that match the specified workload type.
         * 
         * @return builder
         * 
         */
        public Builder dbWorkload(@Nullable String dbWorkload) {
            $.dbWorkload = dbWorkload;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetAutonomousDatabasesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAutonomousDatabasesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param infrastructureType A filter to return only resources that match the given Infrastructure Type.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureType(@Nullable String infrastructureType) {
            $.infrastructureType = infrastructureType;
            return this;
        }

        /**
         * @param isDataGuardEnabled A filter to return only resources that have Data Guard enabled.
         * 
         * @return builder
         * 
         */
        public Builder isDataGuardEnabled(@Nullable Boolean isDataGuardEnabled) {
            $.isDataGuardEnabled = isDataGuardEnabled;
            return this;
        }

        /**
         * @param isFreeTier Filter on the value of the resource&#39;s &#39;isFreeTier&#39; property. A value of `true` returns only Always Free resources. A value of `false` excludes Always Free resources from the returned results. Omitting this parameter returns both Always Free and paid resources.
         * 
         * @return builder
         * 
         */
        public Builder isFreeTier(@Nullable Boolean isFreeTier) {
            $.isFreeTier = isFreeTier;
            return this;
        }

        /**
         * @param isRefreshableClone Filter on the value of the resource&#39;s &#39;isRefreshableClone&#39; property. A value of `true` returns only refreshable clones. A value of `false` excludes refreshable clones from the returned results. Omitting this parameter returns both refreshable clones and databases that are not refreshable clones.
         * 
         * @return builder
         * 
         */
        public Builder isRefreshableClone(@Nullable Boolean isRefreshableClone) {
            $.isRefreshableClone = isRefreshableClone;
            return this;
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetAutonomousDatabasesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
