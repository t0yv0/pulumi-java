// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.SqlDBTableDataSetMappingArgs;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A SQL DB Table data set mapping.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### DataSetMappings_Create
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
 *         var sqlDBTableDataSetMapping = new SqlDBTableDataSetMapping(&#34;sqlDBTableDataSetMapping&#34;, SqlDBTableDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDB_Create
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
 *         var sqlDBTableDataSetMapping = new SqlDBTableDataSetMapping(&#34;sqlDBTableDataSetMapping&#34;, SqlDBTableDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetId(&#34;a08f184b-0567-4b11-ba22-a1199336d226&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .databaseName(&#34;Database1&#34;)
 *             .kind(&#34;SqlDBTable&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .schemaName(&#34;dbo&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .sqlServerResourceId(&#34;/subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.Sql/servers/Server1&#34;)
 *             .tableName(&#34;Table1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDWDataSetToAdlsGen2File_Create
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
 *         var sqlDBTableDataSetMapping = new SqlDBTableDataSetMapping(&#34;sqlDBTableDataSetMapping&#34;, SqlDBTableDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDW_Create
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
 *         var sqlDBTableDataSetMapping = new SqlDBTableDataSetMapping(&#34;sqlDBTableDataSetMapping&#34;, SqlDBTableDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SynapseWorkspaceSqlPoolTable_Create
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
 *         var sqlDBTableDataSetMapping = new SqlDBTableDataSetMapping(&#34;sqlDBTableDataSetMapping&#34;, SqlDBTableDataSetMappingArgs.builder()        
 *             .accountName(&#34;consumerAccount&#34;)
 *             .dataSetMappingName(&#34;datasetMappingName1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
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
 * $ pulumi import azure-native:datashare:SqlDBTableDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:SqlDBTableDataSetMapping")
public class SqlDBTableDataSetMapping extends com.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * DatabaseName name of the sink data set
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return DatabaseName name of the sink data set
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Kind of data set mapping.
     * Expected value is &#39;SqlDBTable&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;SqlDBTable&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return Schema of the table. Default value is dbo.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * Resource id of SQL server
     * 
     */
    @Export(name="sqlServerResourceId", type=String.class, parameters={})
    private Output<String> sqlServerResourceId;

    /**
     * @return Resource id of SQL server
     * 
     */
    public Output<String> sqlServerResourceId() {
        return this.sqlServerResourceId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * SQL DB table name.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return SQL DB table name.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlDBTableDataSetMapping(String name) {
        this(name, SqlDBTableDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDBTableDataSetMapping(String name, SqlDBTableDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDBTableDataSetMapping(String name, SqlDBTableDataSetMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDBTableDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SqlDBTableDataSetMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDBTableDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static SqlDBTableDataSetMappingArgs makeArgs(SqlDBTableDataSetMappingArgs args) {
        var builder = args == null ? SqlDBTableDataSetMappingArgs.builder() : SqlDBTableDataSetMappingArgs.builder(args);
        return builder
            .kind("SqlDBTable")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:SqlDBTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:SqlDBTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:SqlDBTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:SqlDBTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:SqlDBTableDataSetMapping").build())
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
    public static SqlDBTableDataSetMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlDBTableDataSetMapping(name, id, options);
    }
}
