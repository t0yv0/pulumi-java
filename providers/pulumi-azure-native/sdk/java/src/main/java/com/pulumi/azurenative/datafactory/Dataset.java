// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datafactory.DatasetArgs;
import com.pulumi.azurenative.datafactory.outputs.AmazonMWSObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AmazonRdsForOracleTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AmazonRdsForSqlServerTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AmazonRedshiftTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AmazonS3DatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AvroDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureBlobDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureBlobFSDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDataExplorerTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureMariaDBTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureMySqlTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureSearchIndexDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureSqlDWTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureSqlMITableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureSqlTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.BinaryDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CassandraTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsEntityDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ConcurObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiCollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CosmosDbSqlApiCollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CouchbaseTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.CustomDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.Db2TableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DelimitedTextDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DocumentDbCollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DrillTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DynamicsAXResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DynamicsCrmEntityDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.DynamicsEntityDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.EloquaObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ExcelDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.FileShareDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.GoogleAdWordsObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.GoogleBigQueryObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.GreenplumTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.HBaseObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.HiveObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.HttpDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.HubspotObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ImpalaObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.InformixTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.JiraObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.JsonDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MagentoObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MariaDBTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MarketoObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MicrosoftAccessTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MongoDbAtlasCollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MongoDbCollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MongoDbV2CollectionDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.MySqlTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.NetezzaTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ODataResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.OdbcTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.Office365DatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.OracleServiceCloudObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.OracleTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.OrcDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ParquetDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.PaypalObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.PhoenixObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.PostgreSqlTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.PrestoObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.QuickBooksObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.RelationalTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ResponsysObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.RestResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SalesforceMarketingCloudObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SalesforceObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapBwCubeDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapEccResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapHanaTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapOpenHubTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SapTableResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ServiceNowObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SharePointOnlineListResourceDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ShopifyObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SnowflakeDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SparkObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SqlServerTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SquareObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.SybaseTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.TeradataTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.VerticaTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.WebTableDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.XeroObjectDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.XmlDatasetResponse;
import com.pulumi.azurenative.datafactory.outputs.ZohoObjectDatasetResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Dataset resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * ### Datasets_Create
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
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .datasetName(&#34;exampleDataset&#34;)
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;fileName&#34;, Map.ofEntries(
 *                     Map.entry(&#34;type&#34;, &#34;Expression&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;@dataset().MyFileName&#34;)
 *                 )),
 *                 Map.entry(&#34;folderPath&#34;, Map.ofEntries(
 *                     Map.entry(&#34;type&#34;, &#34;Expression&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;@dataset().MyFolderPath&#34;)
 *                 )),
 *                 Map.entry(&#34;format&#34;, Map.of(&#34;type&#34;, &#34;TextFormat&#34;)),
 *                 Map.entry(&#34;linkedServiceName&#34;, Map.ofEntries(
 *                     Map.entry(&#34;referenceName&#34;, &#34;exampleLinkedService&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;LinkedServiceReference&#34;)
 *                 )),
 *                 Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                     Map.entry(&#34;MyFileName&#34;, Map.of(&#34;type&#34;, &#34;String&#34;)),
 *                     Map.entry(&#34;MyFolderPath&#34;, Map.of(&#34;type&#34;, &#34;String&#34;))
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;AzureBlob&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Datasets_Update
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
 *         var dataset = new Dataset(&#34;dataset&#34;, DatasetArgs.builder()        
 *             .datasetName(&#34;exampleDataset&#34;)
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Example description&#34;),
 *                 Map.entry(&#34;fileName&#34;, Map.ofEntries(
 *                     Map.entry(&#34;type&#34;, &#34;Expression&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;@dataset().MyFileName&#34;)
 *                 )),
 *                 Map.entry(&#34;folderPath&#34;, Map.ofEntries(
 *                     Map.entry(&#34;type&#34;, &#34;Expression&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;@dataset().MyFolderPath&#34;)
 *                 )),
 *                 Map.entry(&#34;format&#34;, Map.of(&#34;type&#34;, &#34;TextFormat&#34;)),
 *                 Map.entry(&#34;linkedServiceName&#34;, Map.ofEntries(
 *                     Map.entry(&#34;referenceName&#34;, &#34;exampleLinkedService&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;LinkedServiceReference&#34;)
 *                 )),
 *                 Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                     Map.entry(&#34;MyFileName&#34;, Map.of(&#34;type&#34;, &#34;String&#34;)),
 *                     Map.entry(&#34;MyFolderPath&#34;, Map.of(&#34;type&#34;, &#34;String&#34;))
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;AzureBlob&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
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
 * $ pulumi import azure-native:datafactory:Dataset exampleDataset /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName/datasets/exampleDataset 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:Dataset")
public class Dataset extends com.pulumi.resources.CustomResource {
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Dataset properties.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Dataset properties.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dataset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Dataset", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20170901preview:Dataset").build()),
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:Dataset").build())
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
    public static Dataset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
