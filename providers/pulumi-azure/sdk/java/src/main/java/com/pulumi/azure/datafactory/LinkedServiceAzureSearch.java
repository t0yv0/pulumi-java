// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceAzureSearchArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSearchState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linked Service (connection) between Azure Search Service and Azure Data Factory.
 * 
 * ## Import
 * 
 * Data Factory Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceAzureSearch:LinkedServiceAzureSearch example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceAzureSearch:LinkedServiceAzureSearch")
public class LinkedServiceAzureSearch extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The encrypted credential to connect to Azure Search Service.
     * 
     */
    @Export(name="encryptedCredential", type=String.class, parameters={})
    private Output<String> encryptedCredential;

    /**
     * @return The encrypted credential to connect to Azure Search Service.
     * 
     */
    public Output<String> encryptedCredential() {
        return this.encryptedCredential;
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The key of the Azure Search Service.
     * 
     */
    @Export(name="searchServiceKey", type=String.class, parameters={})
    private Output<String> searchServiceKey;

    /**
     * @return The key of the Azure Search Service.
     * 
     */
    public Output<String> searchServiceKey() {
        return this.searchServiceKey;
    }
    /**
     * The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceAzureSearch(String name) {
        this(name, LinkedServiceAzureSearchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceAzureSearch(String name, LinkedServiceAzureSearchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceAzureSearch(String name, LinkedServiceAzureSearchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceAzureSearch:LinkedServiceAzureSearch", name, args == null ? LinkedServiceAzureSearchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceAzureSearch(String name, Output<String> id, @Nullable LinkedServiceAzureSearchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceAzureSearch:LinkedServiceAzureSearch", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinkedServiceAzureSearch get(String name, Output<String> id, @Nullable LinkedServiceAzureSearchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceAzureSearch(name, id, state, options);
    }
}
