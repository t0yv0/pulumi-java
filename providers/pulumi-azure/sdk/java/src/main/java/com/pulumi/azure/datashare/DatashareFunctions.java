// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datashare.inputs.GetAccountArgs;
import com.pulumi.azure.datashare.inputs.GetDatasetBlobStorageArgs;
import com.pulumi.azure.datashare.inputs.GetDatasetDataLakeGen2Args;
import com.pulumi.azure.datashare.inputs.GetDatasetKustoClusterArgs;
import com.pulumi.azure.datashare.inputs.GetDatasetKustoDatabaseArgs;
import com.pulumi.azure.datashare.inputs.GetShareArgs;
import com.pulumi.azure.datashare.outputs.GetAccountResult;
import com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageResult;
import com.pulumi.azure.datashare.outputs.GetDatasetDataLakeGen2Result;
import com.pulumi.azure.datashare.outputs.GetDatasetKustoClusterResult;
import com.pulumi.azure.datashare.outputs.GetDatasetKustoDatabaseResult;
import com.pulumi.azure.datashare.outputs.GetShareResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatashareFunctions {
    /**
     * Use this data source to access information about an existing Data Share Account.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAccountResult -&gt; getAccountResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share Account.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAccountResult -&gt; getAccountResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Data Share Blob Storage Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetBlobStorage(GetDatasetBlobStorageArgs.builder()
     *             .name(&#34;example-dsbsds&#34;)
     *             .dataShareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetBlobStorageResult -&gt; getDatasetBlobStorageResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetBlobStorageResult> getDatasetBlobStorage(GetDatasetBlobStorageArgs args) {
        return getDatasetBlobStorage(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share Blob Storage Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetBlobStorage(GetDatasetBlobStorageArgs.builder()
     *             .name(&#34;example-dsbsds&#34;)
     *             .dataShareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetBlobStorageResult -&gt; getDatasetBlobStorageResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetBlobStorageResult> getDatasetBlobStorage(GetDatasetBlobStorageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getDatasetBlobStorage:getDatasetBlobStorage", TypeShape.of(GetDatasetBlobStorageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetDataLakeGen2(GetDatasetDataLakeGen2Args.builder()
     *             .name(&#34;example-dsdlg2ds&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetDataLakeGen2Result -&gt; getDatasetDataLakeGen2Result.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetDataLakeGen2Result> getDatasetDataLakeGen2(GetDatasetDataLakeGen2Args args) {
        return getDatasetDataLakeGen2(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetDataLakeGen2(GetDatasetDataLakeGen2Args.builder()
     *             .name(&#34;example-dsdlg2ds&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetDataLakeGen2Result -&gt; getDatasetDataLakeGen2Result.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetDataLakeGen2Result> getDatasetDataLakeGen2(GetDatasetDataLakeGen2Args args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getDatasetDataLakeGen2:getDatasetDataLakeGen2", TypeShape.of(GetDatasetDataLakeGen2Result.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Data Share Kusto Cluster Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetKustoCluster(GetDatasetKustoClusterArgs.builder()
     *             .name(&#34;example-dskc&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetKustoClusterResult -&gt; getDatasetKustoClusterResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetKustoClusterResult> getDatasetKustoCluster(GetDatasetKustoClusterArgs args) {
        return getDatasetKustoCluster(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share Kusto Cluster Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetKustoCluster(GetDatasetKustoClusterArgs.builder()
     *             .name(&#34;example-dskc&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetKustoClusterResult -&gt; getDatasetKustoClusterResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetKustoClusterResult> getDatasetKustoCluster(GetDatasetKustoClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getDatasetKustoCluster:getDatasetKustoCluster", TypeShape.of(GetDatasetKustoClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Data Share Kusto Database Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetKustoDatabase(GetDatasetKustoDatabaseArgs.builder()
     *             .name(&#34;example-dskdds&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetKustoDatabaseResult -&gt; getDatasetKustoDatabaseResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetKustoDatabaseResult> getDatasetKustoDatabase(GetDatasetKustoDatabaseArgs args) {
        return getDatasetKustoDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share Kusto Database Dataset.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(DatashareFunctions.getDatasetKustoDatabase(GetDatasetKustoDatabaseArgs.builder()
     *             .name(&#34;example-dskdds&#34;)
     *             .shareId(&#34;example-share-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getDatasetKustoDatabaseResult -&gt; getDatasetKustoDatabaseResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatasetKustoDatabaseResult> getDatasetKustoDatabase(GetDatasetKustoDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getDatasetKustoDatabase:getDatasetKustoDatabase", TypeShape.of(GetDatasetKustoDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Data Share.
     * 
     * ## Example Usage
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
     *         final var exampleAccount = Output.of(DatashareFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         final var exampleShare = Output.of(DatashareFunctions.getShare(GetShareArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .accountId(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleShare.apply(getShareResult -&gt; getShareResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args) {
        return getShare(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Data Share.
     * 
     * ## Example Usage
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
     *         final var exampleAccount = Output.of(DatashareFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         final var exampleShare = Output.of(DatashareFunctions.getShare(GetShareArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .accountId(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleShare.apply(getShareResult -&gt; getShareResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:datashare/getShare:getShare", TypeShape.of(GetShareResult.class), args, Utilities.withVersion(options));
    }
}
