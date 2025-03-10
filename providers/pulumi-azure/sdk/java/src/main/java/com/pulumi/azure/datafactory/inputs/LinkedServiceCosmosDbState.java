// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceCosmosDbState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceCosmosDbState Empty = new LinkedServiceCosmosDbState();

    /**
     * The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
     * 
     */
    @Import(name="accountEndpoint")
    private @Nullable Output<String> accountEndpoint;

    /**
     * @return The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
     * 
     */
    public Optional<Output<String>> accountEndpoint() {
        return Optional.ofNullable(this.accountEndpoint);
    }

    /**
     * The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    /**
     * @return The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
     * 
     */
    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The name of the database. Required if `connection_string` is unspecified.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The name of the database. Required if `connection_string` is unspecified.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private LinkedServiceCosmosDbState() {}

    private LinkedServiceCosmosDbState(LinkedServiceCosmosDbState $) {
        this.accountEndpoint = $.accountEndpoint;
        this.accountKey = $.accountKey;
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.connectionString = $.connectionString;
        this.dataFactoryId = $.dataFactoryId;
        this.database = $.database;
        this.description = $.description;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceCosmosDbState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceCosmosDbState $;

        public Builder() {
            $ = new LinkedServiceCosmosDbState();
        }

        public Builder(LinkedServiceCosmosDbState defaults) {
            $ = new LinkedServiceCosmosDbState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountEndpoint The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder accountEndpoint(@Nullable Output<String> accountEndpoint) {
            $.accountEndpoint = accountEndpoint;
            return this;
        }

        /**
         * @param accountEndpoint The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder accountEndpoint(String accountEndpoint) {
            return accountEndpoint(Output.of(accountEndpoint));
        }

        /**
         * @param accountKey The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectionString The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param database The name of the database. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The name of the database. Required if `connection_string` is unspecified.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public LinkedServiceCosmosDbState build() {
            return $;
        }
    }

}
