// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.GetRegistryConnectionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryConnectionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryConnectionsArgs Empty = new GetRegistryConnectionsArgs();

    /**
     * Used to filter by the data asset key of the object.
     * 
     */
    @Import(name="dataAssetKey", required=true)
    private String dataAssetKey;

    /**
     * @return Used to filter by the data asset key of the object.
     * 
     */
    public String dataAssetKey() {
        return this.dataAssetKey;
    }

    /**
     * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     * 
     */
    @Import(name="favoritesQueryParam")
    private @Nullable String favoritesQueryParam;

    /**
     * @return If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     * 
     */
    public Optional<String> favoritesQueryParam() {
        return Optional.ofNullable(this.favoritesQueryParam);
    }

    /**
     * Specifies the fields to get for an object.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return Specifies the fields to get for an object.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    @Import(name="filters")
    private @Nullable List<GetRegistryConnectionsFilter> filters;

    public Optional<List<GetRegistryConnectionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Used to filter by the name of the object.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Used to filter by the name of the object.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    /**
     * Type of the object to filter the results with.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Type of the object to filter the results with.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetRegistryConnectionsArgs() {}

    private GetRegistryConnectionsArgs(GetRegistryConnectionsArgs $) {
        this.dataAssetKey = $.dataAssetKey;
        this.favoritesQueryParam = $.favoritesQueryParam;
        this.fields = $.fields;
        this.filters = $.filters;
        this.name = $.name;
        this.registryId = $.registryId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryConnectionsArgs $;

        public Builder() {
            $ = new GetRegistryConnectionsArgs();
        }

        public Builder(GetRegistryConnectionsArgs defaults) {
            $ = new GetRegistryConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataAssetKey Used to filter by the data asset key of the object.
         * 
         * @return builder
         * 
         */
        public Builder dataAssetKey(String dataAssetKey) {
            $.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * @param favoritesQueryParam If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
         * 
         * @return builder
         * 
         */
        public Builder favoritesQueryParam(@Nullable String favoritesQueryParam) {
            $.favoritesQueryParam = favoritesQueryParam;
            return this;
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        public Builder filters(@Nullable List<GetRegistryConnectionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRegistryConnectionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Used to filter by the name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param type Type of the object to filter the results with.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetRegistryConnectionsArgs build() {
            $.dataAssetKey = Objects.requireNonNull($.dataAssetKey, "expected parameter 'dataAssetKey' to be non-null");
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
