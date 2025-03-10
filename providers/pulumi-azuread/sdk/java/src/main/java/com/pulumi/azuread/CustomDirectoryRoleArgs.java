// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.inputs.CustomDirectoryRolePermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDirectoryRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDirectoryRoleArgs Empty = new CustomDirectoryRoleArgs();

    /**
     * The description of the custom directory role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the custom directory role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the custom directory role.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the custom directory role.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates whether the role is enabled for assignment.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether the role is enabled for assignment.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A collection of `permissions` blocks as documented below.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<CustomDirectoryRolePermissionArgs>> permissions;

    /**
     * @return A collection of `permissions` blocks as documented below.
     * 
     */
    public Output<List<CustomDirectoryRolePermissionArgs>> permissions() {
        return this.permissions;
    }

    /**
     * Custom template identifier that is typically used if one needs an identifier to be the same across different directories. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return Custom template identifier that is typically used if one needs an identifier to be the same across different directories. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * - The version of the role definition. This can be any arbitrary string between 1-128 characters.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return - The version of the role definition. This can be any arbitrary string between 1-128 characters.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private CustomDirectoryRoleArgs() {}

    private CustomDirectoryRoleArgs(CustomDirectoryRoleArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.permissions = $.permissions;
        this.templateId = $.templateId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDirectoryRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDirectoryRoleArgs $;

        public Builder() {
            $ = new CustomDirectoryRoleArgs();
        }

        public Builder(CustomDirectoryRoleArgs defaults) {
            $ = new CustomDirectoryRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the custom directory role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the custom directory role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the custom directory role.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the custom directory role.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Indicates whether the role is enabled for assignment.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether the role is enabled for assignment.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param permissions A collection of `permissions` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<CustomDirectoryRolePermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions A collection of `permissions` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<CustomDirectoryRolePermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions A collection of `permissions` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(CustomDirectoryRolePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param templateId Custom template identifier that is typically used if one needs an identifier to be the same across different directories. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId Custom template identifier that is typically used if one needs an identifier to be the same across different directories. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param version - The version of the role definition. This can be any arbitrary string between 1-128 characters.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version - The version of the role definition. This can be any arbitrary string between 1-128 characters.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public CustomDirectoryRoleArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
