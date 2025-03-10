// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices;

import com.pulumi.azure.recoveryservices.inputs.VaultEncryptionArgs;
import com.pulumi.azure.recoveryservices.inputs.VaultIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * Is cross region restore enabled for this Vault? Only can be `true`, when `storage_mode_type` is `GeoRedundant`. Defaults to `false`.
     * 
     */
    @Import(name="crossRegionRestoreEnabled")
    private @Nullable Output<Boolean> crossRegionRestoreEnabled;

    /**
     * @return Is cross region restore enabled for this Vault? Only can be `true`, when `storage_mode_type` is `GeoRedundant`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> crossRegionRestoreEnabled() {
        return Optional.ofNullable(this.crossRegionRestoreEnabled);
    }

    /**
     * An `encryption` block as defined below. Required with `identity`.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<VaultEncryptionArgs> encryption;

    /**
     * @return An `encryption` block as defined below. Required with `identity`.
     * 
     */
    public Optional<Output<VaultEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<VaultIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<VaultIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Recovery Services Vault. Recovery Service Vault name must be 2 - 50 characters long, start with a letter, contain only letters, numbers and hyphens. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Recovery Services Vault. Recovery Service Vault name must be 2 - 50 characters long, start with a letter, contain only letters, numbers and hyphens. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sets the vault&#39;s SKU. Possible values include: `Standard`, `RS0`.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return Sets the vault&#39;s SKU. Possible values include: `Standard`, `RS0`.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    /**
     * Is soft delete enable for this Vault? Defaults to `true`.
     * 
     */
    @Import(name="softDeleteEnabled")
    private @Nullable Output<Boolean> softDeleteEnabled;

    /**
     * @return Is soft delete enable for this Vault? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> softDeleteEnabled() {
        return Optional.ofNullable(this.softDeleteEnabled);
    }

    /**
     * The storage type of the Recovery Services Vault. Possible values are `GeoRedundant`, `LocallyRedundant` and `ZoneRedundant`. Defaults to `GeoRedundant`.
     * 
     */
    @Import(name="storageModeType")
    private @Nullable Output<String> storageModeType;

    /**
     * @return The storage type of the Recovery Services Vault. Possible values are `GeoRedundant`, `LocallyRedundant` and `ZoneRedundant`. Defaults to `GeoRedundant`.
     * 
     */
    public Optional<Output<String>> storageModeType() {
        return Optional.ofNullable(this.storageModeType);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VaultArgs() {}

    private VaultArgs(VaultArgs $) {
        this.crossRegionRestoreEnabled = $.crossRegionRestoreEnabled;
        this.encryption = $.encryption;
        this.identity = $.identity;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.softDeleteEnabled = $.softDeleteEnabled;
        this.storageModeType = $.storageModeType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultArgs $;

        public Builder() {
            $ = new VaultArgs();
        }

        public Builder(VaultArgs defaults) {
            $ = new VaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossRegionRestoreEnabled Is cross region restore enabled for this Vault? Only can be `true`, when `storage_mode_type` is `GeoRedundant`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionRestoreEnabled(@Nullable Output<Boolean> crossRegionRestoreEnabled) {
            $.crossRegionRestoreEnabled = crossRegionRestoreEnabled;
            return this;
        }

        /**
         * @param crossRegionRestoreEnabled Is cross region restore enabled for this Vault? Only can be `true`, when `storage_mode_type` is `GeoRedundant`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionRestoreEnabled(Boolean crossRegionRestoreEnabled) {
            return crossRegionRestoreEnabled(Output.of(crossRegionRestoreEnabled));
        }

        /**
         * @param encryption An `encryption` block as defined below. Required with `identity`.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<VaultEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption An `encryption` block as defined below. Required with `identity`.
         * 
         * @return builder
         * 
         */
        public Builder encryption(VaultEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<VaultIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(VaultIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault. Recovery Service Vault name must be 2 - 50 characters long, start with a letter, contain only letters, numbers and hyphens. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault. Recovery Service Vault name must be 2 - 50 characters long, start with a letter, contain only letters, numbers and hyphens. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Sets the vault&#39;s SKU. Possible values include: `Standard`, `RS0`.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Sets the vault&#39;s SKU. Possible values include: `Standard`, `RS0`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param softDeleteEnabled Is soft delete enable for this Vault? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteEnabled(@Nullable Output<Boolean> softDeleteEnabled) {
            $.softDeleteEnabled = softDeleteEnabled;
            return this;
        }

        /**
         * @param softDeleteEnabled Is soft delete enable for this Vault? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteEnabled(Boolean softDeleteEnabled) {
            return softDeleteEnabled(Output.of(softDeleteEnabled));
        }

        /**
         * @param storageModeType The storage type of the Recovery Services Vault. Possible values are `GeoRedundant`, `LocallyRedundant` and `ZoneRedundant`. Defaults to `GeoRedundant`.
         * 
         * @return builder
         * 
         */
        public Builder storageModeType(@Nullable Output<String> storageModeType) {
            $.storageModeType = storageModeType;
            return this;
        }

        /**
         * @param storageModeType The storage type of the Recovery Services Vault. Possible values are `GeoRedundant`, `LocallyRedundant` and `ZoneRedundant`. Defaults to `GeoRedundant`.
         * 
         * @return builder
         * 
         */
        public Builder storageModeType(String storageModeType) {
            return storageModeType(Output.of(storageModeType));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VaultArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
