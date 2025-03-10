// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sql.inputs.GetBackupRunArgs;
import com.pulumi.gcp.sql.inputs.GetCaCertsArgs;
import com.pulumi.gcp.sql.inputs.GetDatabaseInstanceArgs;
import com.pulumi.gcp.sql.outputs.GetBackupRunResult;
import com.pulumi.gcp.sql.outputs.GetCaCertsResult;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class SqlFunctions {
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
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
     *         final var backup = Output.of(SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.getMain().getName())
     *             .mostRecent(true)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupRunResult> getBackupRun(GetBackupRunArgs args) {
        return getBackupRun(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance backup run.
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
     *         final var backup = Output.of(SqlFunctions.getBackupRun(GetBackupRunArgs.builder()
     *             .instance(google_sql_database_instance.getMain().getName())
     *             .mostRecent(true)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBackupRunResult> getBackupRun(GetBackupRunArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getBackupRun:getBackupRun", TypeShape.of(GetBackupRunResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static CompletableFuture<GetCaCertsResult> getCaCerts(GetCaCertsArgs args) {
        return getCaCerts(args, InvokeOptions.Empty);
    }
    /**
     * Get all of the trusted Certificate Authorities (CAs) for the specified SQL database instance. For more information see the
     * [official documentation](https://cloud.google.com/sql/)
     * and
     * [API](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/instances/listServerCas).
     * 
     */
    public static CompletableFuture<GetCaCertsResult> getCaCerts(GetCaCertsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getCaCerts:getCaCerts", TypeShape.of(GetCaCertsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
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
     *         final var qa = Output.of(SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstanceResult> getDatabaseInstance(GetDatabaseInstanceArgs args) {
        return getDatabaseInstance(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Cloud SQL instance.
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
     *         final var qa = Output.of(SqlFunctions.getDatabaseInstance(GetDatabaseInstanceArgs.builder()
     *             .name(&#34;test-sql-instance&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseInstanceResult> getDatabaseInstance(GetDatabaseInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:sql/getDatabaseInstance:getDatabaseInstance", TypeShape.of(GetDatabaseInstanceResult.class), args, Utilities.withVersion(options));
    }
}
