// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlobInventoryPolicyRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyRuleFilterArgs Empty = new BlobInventoryPolicyRuleFilterArgs();

    /**
     * A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
     * 
     */
    @Import(name="blobTypes", required=true)
    private Output<List<String>> blobTypes;

    /**
     * @return A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
     * 
     */
    public Output<List<String>> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Includes blob versions in blob inventory or not? Defaults to `false`.
     * 
     */
    @Import(name="includeBlobVersions")
    private @Nullable Output<Boolean> includeBlobVersions;

    /**
     * @return Includes blob versions in blob inventory or not? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> includeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }

    /**
     * Includes blob snapshots in blob inventory or not? Defaults to `false`.
     * 
     */
    @Import(name="includeSnapshots")
    private @Nullable Output<Boolean> includeSnapshots;

    /**
     * @return Includes blob snapshots in blob inventory or not? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> includeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }

    /**
     * A set of strings for blob prefixes to be matched.
     * 
     */
    @Import(name="prefixMatches")
    private @Nullable Output<List<String>> prefixMatches;

    /**
     * @return A set of strings for blob prefixes to be matched.
     * 
     */
    public Optional<Output<List<String>>> prefixMatches() {
        return Optional.ofNullable(this.prefixMatches);
    }

    private BlobInventoryPolicyRuleFilterArgs() {}

    private BlobInventoryPolicyRuleFilterArgs(BlobInventoryPolicyRuleFilterArgs $) {
        this.blobTypes = $.blobTypes;
        this.includeBlobVersions = $.includeBlobVersions;
        this.includeSnapshots = $.includeSnapshots;
        this.prefixMatches = $.prefixMatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobInventoryPolicyRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyRuleFilterArgs $;

        public Builder() {
            $ = new BlobInventoryPolicyRuleFilterArgs();
        }

        public Builder(BlobInventoryPolicyRuleFilterArgs defaults) {
            $ = new BlobInventoryPolicyRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobTypes A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(Output<List<String>> blobTypes) {
            $.blobTypes = blobTypes;
            return this;
        }

        /**
         * @param blobTypes A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(List<String> blobTypes) {
            return blobTypes(Output.of(blobTypes));
        }

        /**
         * @param blobTypes A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
         * 
         * @return builder
         * 
         */
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }

        /**
         * @param includeBlobVersions Includes blob versions in blob inventory or not? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeBlobVersions(@Nullable Output<Boolean> includeBlobVersions) {
            $.includeBlobVersions = includeBlobVersions;
            return this;
        }

        /**
         * @param includeBlobVersions Includes blob versions in blob inventory or not? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeBlobVersions(Boolean includeBlobVersions) {
            return includeBlobVersions(Output.of(includeBlobVersions));
        }

        /**
         * @param includeSnapshots Includes blob snapshots in blob inventory or not? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeSnapshots(@Nullable Output<Boolean> includeSnapshots) {
            $.includeSnapshots = includeSnapshots;
            return this;
        }

        /**
         * @param includeSnapshots Includes blob snapshots in blob inventory or not? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeSnapshots(Boolean includeSnapshots) {
            return includeSnapshots(Output.of(includeSnapshots));
        }

        /**
         * @param prefixMatches A set of strings for blob prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(@Nullable Output<List<String>> prefixMatches) {
            $.prefixMatches = prefixMatches;
            return this;
        }

        /**
         * @param prefixMatches A set of strings for blob prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(List<String> prefixMatches) {
            return prefixMatches(Output.of(prefixMatches));
        }

        /**
         * @param prefixMatches A set of strings for blob prefixes to be matched.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatches(String... prefixMatches) {
            return prefixMatches(List.of(prefixMatches));
        }

        public BlobInventoryPolicyRuleFilterArgs build() {
            $.blobTypes = Objects.requireNonNull($.blobTypes, "expected parameter 'blobTypes' to be non-null");
            return $;
        }
    }

}
