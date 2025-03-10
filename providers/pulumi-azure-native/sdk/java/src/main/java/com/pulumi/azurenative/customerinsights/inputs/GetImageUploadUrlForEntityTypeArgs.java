// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageUploadUrlForEntityTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageUploadUrlForEntityTypeArgs Empty = new GetImageUploadUrlForEntityTypeArgs();

    /**
     * Type of entity. Can be Profile or Interaction.
     * 
     */
    @Import(name="entityType")
    private @Nullable String entityType;

    /**
     * @return Type of entity. Can be Profile or Interaction.
     * 
     */
    public Optional<String> entityType() {
        return Optional.ofNullable(this.entityType);
    }

    /**
     * Name of the entity type.
     * 
     */
    @Import(name="entityTypeName")
    private @Nullable String entityTypeName;

    /**
     * @return Name of the entity type.
     * 
     */
    public Optional<String> entityTypeName() {
        return Optional.ofNullable(this.entityTypeName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * Relative path of the image.
     * 
     */
    @Import(name="relativePath")
    private @Nullable String relativePath;

    /**
     * @return Relative path of the image.
     * 
     */
    public Optional<String> relativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetImageUploadUrlForEntityTypeArgs() {}

    private GetImageUploadUrlForEntityTypeArgs(GetImageUploadUrlForEntityTypeArgs $) {
        this.entityType = $.entityType;
        this.entityTypeName = $.entityTypeName;
        this.hubName = $.hubName;
        this.relativePath = $.relativePath;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageUploadUrlForEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageUploadUrlForEntityTypeArgs $;

        public Builder() {
            $ = new GetImageUploadUrlForEntityTypeArgs();
        }

        public Builder(GetImageUploadUrlForEntityTypeArgs defaults) {
            $ = new GetImageUploadUrlForEntityTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityType Type of entity. Can be Profile or Interaction.
         * 
         * @return builder
         * 
         */
        public Builder entityType(@Nullable String entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityTypeName Name of the entity type.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(@Nullable String entityTypeName) {
            $.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param relativePath Relative path of the image.
         * 
         * @return builder
         * 
         */
        public Builder relativePath(@Nullable String relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetImageUploadUrlForEntityTypeArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
