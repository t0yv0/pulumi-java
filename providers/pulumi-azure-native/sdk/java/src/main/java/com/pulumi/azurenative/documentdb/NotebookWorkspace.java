// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.NotebookWorkspaceArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A notebook workspace resource
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * ### CosmosDBNotebookWorkspaceCreate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var notebookWorkspace = new NotebookWorkspace(&#34;notebookWorkspace&#34;, NotebookWorkspaceArgs.builder()        
 *             .accountName(&#34;ddb1&#34;)
 *             .notebookWorkspaceName(&#34;default&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:NotebookWorkspace default /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/notebookWorkspaces/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:NotebookWorkspace")
public class NotebookWorkspace extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the endpoint of Notebook server.
     * 
     */
    @Export(name="notebookServerEndpoint", type=String.class, parameters={})
    private Output<String> notebookServerEndpoint;

    /**
     * @return Specifies the endpoint of Notebook server.
     * 
     */
    public Output<String> notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }
    /**
     * Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotebookWorkspace(String name) {
        this(name, NotebookWorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotebookWorkspace(String name, NotebookWorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotebookWorkspace(String name, NotebookWorkspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:NotebookWorkspace", name, args == null ? NotebookWorkspaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotebookWorkspace(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:NotebookWorkspace", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:NotebookWorkspace").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:NotebookWorkspace").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotebookWorkspace get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotebookWorkspace(name, id, options);
    }
}
