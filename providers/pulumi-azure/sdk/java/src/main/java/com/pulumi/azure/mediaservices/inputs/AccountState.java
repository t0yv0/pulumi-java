// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mediaservices.inputs;

import com.pulumi.azure.mediaservices.inputs.AccountIdentityArgs;
import com.pulumi.azure.mediaservices.inputs.AccountKeyDeliveryAccessControlArgs;
import com.pulumi.azure.mediaservices.inputs.AccountStorageAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<AccountIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<AccountIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * A `key_delivery_access_control` block as defined below.
     * 
     */
    @Import(name="keyDeliveryAccessControl")
    private @Nullable Output<AccountKeyDeliveryAccessControlArgs> keyDeliveryAccessControl;

    /**
     * @return A `key_delivery_access_control` block as defined below.
     * 
     */
    public Optional<Output<AccountKeyDeliveryAccessControlArgs>> keyDeliveryAccessControl() {
        return Optional.ofNullable(this.keyDeliveryAccessControl);
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
     * Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<AccountStorageAccountArgs>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Optional<Output<List<AccountStorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * Specifies the storage authentication type.
     * Possible value is  `ManagedIdentity` or `System`.
     * 
     */
    @Import(name="storageAuthenticationType")
    private @Nullable Output<String> storageAuthenticationType;

    /**
     * @return Specifies the storage authentication type.
     * Possible value is  `ManagedIdentity` or `System`.
     * 
     */
    public Optional<Output<String>> storageAuthenticationType() {
        return Optional.ofNullable(this.storageAuthenticationType);
    }

    /**
     * A mapping of tags assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.identity = $.identity;
        this.keyDeliveryAccessControl = $.keyDeliveryAccessControl;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccounts = $.storageAccounts;
        this.storageAuthenticationType = $.storageAuthenticationType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<AccountIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(AccountIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyDeliveryAccessControl A `key_delivery_access_control` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder keyDeliveryAccessControl(@Nullable Output<AccountKeyDeliveryAccessControlArgs> keyDeliveryAccessControl) {
            $.keyDeliveryAccessControl = keyDeliveryAccessControl;
            return this;
        }

        /**
         * @param keyDeliveryAccessControl A `key_delivery_access_control` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder keyDeliveryAccessControl(AccountKeyDeliveryAccessControlArgs keyDeliveryAccessControl) {
            return keyDeliveryAccessControl(Output.of(keyDeliveryAccessControl));
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
         * @param name Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<AccountStorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<AccountStorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts One or more `storage_account` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(AccountStorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param storageAuthenticationType Specifies the storage authentication type.
         * Possible value is  `ManagedIdentity` or `System`.
         * 
         * @return builder
         * 
         */
        public Builder storageAuthenticationType(@Nullable Output<String> storageAuthenticationType) {
            $.storageAuthenticationType = storageAuthenticationType;
            return this;
        }

        /**
         * @param storageAuthenticationType Specifies the storage authentication type.
         * Possible value is  `ManagedIdentity` or `System`.
         * 
         * @return builder
         * 
         */
        public Builder storageAuthenticationType(String storageAuthenticationType) {
            return storageAuthenticationType(Output.of(storageAuthenticationType));
        }

        /**
         * @param tags A mapping of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AccountState build() {
            return $;
        }
    }

}
