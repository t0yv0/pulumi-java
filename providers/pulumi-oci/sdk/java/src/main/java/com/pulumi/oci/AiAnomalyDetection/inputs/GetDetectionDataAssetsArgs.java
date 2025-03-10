// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiAnomalyDetection.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.AiAnomalyDetection.inputs.GetDetectionDataAssetsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDetectionDataAssetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDetectionDataAssetsArgs Empty = new GetDetectionDataAssetsArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetDetectionDataAssetsFilter> filters;

    public Optional<List<GetDetectionDataAssetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the project for which to list the objects.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return The ID of the project for which to list the objects.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * &lt;b&gt;Filter&lt;/b&gt; results by the specified lifecycle state. Must be a valid state for the resource type.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return &lt;b&gt;Filter&lt;/b&gt; results by the specified lifecycle state. Must be a valid state for the resource type.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDetectionDataAssetsArgs() {}

    private GetDetectionDataAssetsArgs(GetDetectionDataAssetsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.projectId = $.projectId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDetectionDataAssetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDetectionDataAssetsArgs $;

        public Builder() {
            $ = new GetDetectionDataAssetsArgs();
        }

        public Builder(GetDetectionDataAssetsArgs defaults) {
            $ = new GetDetectionDataAssetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetDetectionDataAssetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDetectionDataAssetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param projectId The ID of the project for which to list the objects.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param state &lt;b&gt;Filter&lt;/b&gt; results by the specified lifecycle state. Must be a valid state for the resource type.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDetectionDataAssetsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
