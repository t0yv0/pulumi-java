// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelsRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelsRegistrationArgs Empty = new ChannelsRegistrationArgs();

    /**
     * The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
     * 
     */
    @Import(name="cmkKeyVaultUrl")
    private @Nullable Output<String> cmkKeyVaultUrl;

    /**
     * @return The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
     * 
     */
    public Optional<Output<String>> cmkKeyVaultUrl() {
        return Optional.ofNullable(this.cmkKeyVaultUrl);
    }

    /**
     * The description of the Bot Channels Registration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Bot Channels Registration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Application Insights API Key to associate with the Bot Channels Registration.
     * 
     */
    @Import(name="developerAppInsightsApiKey")
    private @Nullable Output<String> developerAppInsightsApiKey;

    /**
     * @return The Application Insights API Key to associate with the Bot Channels Registration.
     * 
     */
    public Optional<Output<String>> developerAppInsightsApiKey() {
        return Optional.ofNullable(this.developerAppInsightsApiKey);
    }

    /**
     * The Application Insights Application ID to associate with the Bot Channels Registration.
     * 
     */
    @Import(name="developerAppInsightsApplicationId")
    private @Nullable Output<String> developerAppInsightsApplicationId;

    /**
     * @return The Application Insights Application ID to associate with the Bot Channels Registration.
     * 
     */
    public Optional<Output<String>> developerAppInsightsApplicationId() {
        return Optional.ofNullable(this.developerAppInsightsApplicationId);
    }

    /**
     * The Application Insights Key to associate with the Bot Channels Registration.
     * 
     */
    @Import(name="developerAppInsightsKey")
    private @Nullable Output<String> developerAppInsightsKey;

    /**
     * @return The Application Insights Key to associate with the Bot Channels Registration.
     * 
     */
    public Optional<Output<String>> developerAppInsightsKey() {
        return Optional.ofNullable(this.developerAppInsightsKey);
    }

    /**
     * The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The Bot Channels Registration endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The Bot Channels Registration endpoint.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The icon URL to visually identify the Bot Channels Registration.
     * 
     */
    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    /**
     * @return The icon URL to visually identify the Bot Channels Registration.
     * 
     */
    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    /**
     * Is the Bot Channels Registration in an isolated network?
     * 
     */
    @Import(name="isolatedNetworkEnabled")
    private @Nullable Output<Boolean> isolatedNetworkEnabled;

    /**
     * @return Is the Bot Channels Registration in an isolated network?
     * 
     */
    public Optional<Output<Boolean>> isolatedNetworkEnabled() {
        return Optional.ofNullable(this.isolatedNetworkEnabled);
    }

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="microsoftAppId", required=true)
    private Output<String> microsoftAppId;

    /**
     * @return The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> microsoftAppId() {
        return this.microsoftAppId;
    }

    /**
     * Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sku() {
        return this.sku;
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

    private ChannelsRegistrationArgs() {}

    private ChannelsRegistrationArgs(ChannelsRegistrationArgs $) {
        this.cmkKeyVaultUrl = $.cmkKeyVaultUrl;
        this.description = $.description;
        this.developerAppInsightsApiKey = $.developerAppInsightsApiKey;
        this.developerAppInsightsApplicationId = $.developerAppInsightsApplicationId;
        this.developerAppInsightsKey = $.developerAppInsightsKey;
        this.displayName = $.displayName;
        this.endpoint = $.endpoint;
        this.iconUrl = $.iconUrl;
        this.isolatedNetworkEnabled = $.isolatedNetworkEnabled;
        this.location = $.location;
        this.microsoftAppId = $.microsoftAppId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelsRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelsRegistrationArgs $;

        public Builder() {
            $ = new ChannelsRegistrationArgs();
        }

        public Builder(ChannelsRegistrationArgs defaults) {
            $ = new ChannelsRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cmkKeyVaultUrl The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
         * 
         * @return builder
         * 
         */
        public Builder cmkKeyVaultUrl(@Nullable Output<String> cmkKeyVaultUrl) {
            $.cmkKeyVaultUrl = cmkKeyVaultUrl;
            return this;
        }

        /**
         * @param cmkKeyVaultUrl The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
         * 
         * @return builder
         * 
         */
        public Builder cmkKeyVaultUrl(String cmkKeyVaultUrl) {
            return cmkKeyVaultUrl(Output.of(cmkKeyVaultUrl));
        }

        /**
         * @param description The description of the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param developerAppInsightsApiKey The Application Insights API Key to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApiKey(@Nullable Output<String> developerAppInsightsApiKey) {
            $.developerAppInsightsApiKey = developerAppInsightsApiKey;
            return this;
        }

        /**
         * @param developerAppInsightsApiKey The Application Insights API Key to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApiKey(String developerAppInsightsApiKey) {
            return developerAppInsightsApiKey(Output.of(developerAppInsightsApiKey));
        }

        /**
         * @param developerAppInsightsApplicationId The Application Insights Application ID to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApplicationId(@Nullable Output<String> developerAppInsightsApplicationId) {
            $.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
            return this;
        }

        /**
         * @param developerAppInsightsApplicationId The Application Insights Application ID to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApplicationId(String developerAppInsightsApplicationId) {
            return developerAppInsightsApplicationId(Output.of(developerAppInsightsApplicationId));
        }

        /**
         * @param developerAppInsightsKey The Application Insights Key to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsKey(@Nullable Output<String> developerAppInsightsKey) {
            $.developerAppInsightsKey = developerAppInsightsKey;
            return this;
        }

        /**
         * @param developerAppInsightsKey The Application Insights Key to associate with the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsKey(String developerAppInsightsKey) {
            return developerAppInsightsKey(Output.of(developerAppInsightsKey));
        }

        /**
         * @param displayName The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param endpoint The Bot Channels Registration endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The Bot Channels Registration endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param iconUrl The icon URL to visually identify the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        /**
         * @param iconUrl The icon URL to visually identify the Bot Channels Registration.
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        /**
         * @param isolatedNetworkEnabled Is the Bot Channels Registration in an isolated network?
         * 
         * @return builder
         * 
         */
        public Builder isolatedNetworkEnabled(@Nullable Output<Boolean> isolatedNetworkEnabled) {
            $.isolatedNetworkEnabled = isolatedNetworkEnabled;
            return this;
        }

        /**
         * @param isolatedNetworkEnabled Is the Bot Channels Registration in an isolated network?
         * 
         * @return builder
         * 
         */
        public Builder isolatedNetworkEnabled(Boolean isolatedNetworkEnabled) {
            return isolatedNetworkEnabled(Output.of(isolatedNetworkEnabled));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param microsoftAppId The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder microsoftAppId(Output<String> microsoftAppId) {
            $.microsoftAppId = microsoftAppId;
            return this;
        }

        /**
         * @param microsoftAppId The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder microsoftAppId(String microsoftAppId) {
            return microsoftAppId(Output.of(microsoftAppId));
        }

        /**
         * @param name Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
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

        public ChannelsRegistrationArgs build() {
            $.microsoftAppId = Objects.requireNonNull($.microsoftAppId, "expected parameter 'microsoftAppId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
