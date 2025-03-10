// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.inputs.GetAccountArgs;
import com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs;
import com.pulumi.azure.storage.inputs.GetAccountSASArgs;
import com.pulumi.azure.storage.inputs.GetBlobArgs;
import com.pulumi.azure.storage.inputs.GetEncryptionScopeArgs;
import com.pulumi.azure.storage.inputs.GetPolicyArgs;
import com.pulumi.azure.storage.inputs.GetShareArgs;
import com.pulumi.azure.storage.inputs.GetStorageContainerArgs;
import com.pulumi.azure.storage.inputs.GetSyncArgs;
import com.pulumi.azure.storage.inputs.GetSyncGroupArgs;
import com.pulumi.azure.storage.inputs.GetTableEntityArgs;
import com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASResult;
import com.pulumi.azure.storage.outputs.GetAccountResult;
import com.pulumi.azure.storage.outputs.GetAccountSASResult;
import com.pulumi.azure.storage.outputs.GetBlobResult;
import com.pulumi.azure.storage.outputs.GetEncryptionScopeResult;
import com.pulumi.azure.storage.outputs.GetPolicyResult;
import com.pulumi.azure.storage.outputs.GetShareResult;
import com.pulumi.azure.storage.outputs.GetStorageContainerResult;
import com.pulumi.azure.storage.outputs.GetSyncGroupResult;
import com.pulumi.azure.storage.outputs.GetSyncResult;
import com.pulumi.azure.storage.outputs.GetTableEntityResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class StorageFunctions {
    /**
     * Use this data source to access information about an existing Storage Account.
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
     *         final var example = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;packerimages&#34;)
     *             .resourceGroupName(&#34;packer-storage&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;storageAccountTier&#34;, example.apply(getAccountResult -&gt; getAccountResult.getAccountTier()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Account.
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
     *         final var example = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;packerimages&#34;)
     *             .resourceGroupName(&#34;packer-storage&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;storageAccountTier&#34;, example.apply(getAccountResult -&gt; getAccountResult.getAccountTier()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
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
     *         var rg = new ResourceGroup(&#34;rg&#34;, ResourceGroupArgs.builder()        
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         var storage = new Account(&#34;storage&#34;, AccountArgs.builder()        
     *             .resourceGroupName(rg.getName())
     *             .location(rg.getLocation())
     *             .accountTier(&#34;Standard&#34;)
     *             .accountReplicationType(&#34;LRS&#34;)
     *             .build());
     * 
     *         var container = new Container(&#34;container&#34;, ContainerArgs.builder()        
     *             .storageAccountName(storage.getName())
     *             .containerAccessType(&#34;private&#34;)
     *             .build());
     * 
     *         final var example = StorageFunctions.getAccountBlobContainerSAS(GetAccountBlobContainerSASArgs.builder()
     *             .connectionString(storage.getPrimaryConnectionString())
     *             .containerName(container.getName())
     *             .httpsOnly(true)
     *             .ipAddress(&#34;168.1.5.65&#34;)
     *             .start(&#34;2018-03-21&#34;)
     *             .expiry(&#34;2018-03-21&#34;)
     *             .permissions(GetAccountBlobContainerSASPermissions.builder()
     *                 .read(true)
     *                 .add(true)
     *                 .create(false)
     *                 .write(false)
     *                 .delete(true)
     *                 .list(true)
     *                 .build())
     *             .cacheControl(&#34;max-age=5&#34;)
     *             .contentDisposition(&#34;inline&#34;)
     *             .contentEncoding(&#34;deflate&#34;)
     *             .contentLanguage(&#34;en-US&#34;)
     *             .contentType(&#34;application/json&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sasUrlQueryString&#34;, example.apply(getAccountBlobContainerSASResult -&gt; getAccountBlobContainerSASResult).apply(example -&gt; example.apply(getAccountBlobContainerSASResult -&gt; getAccountBlobContainerSASResult.getSas())));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountBlobContainerSASResult> getAccountBlobContainerSAS(GetAccountBlobContainerSASArgs args) {
        return getAccountBlobContainerSAS(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
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
     *         var rg = new ResourceGroup(&#34;rg&#34;, ResourceGroupArgs.builder()        
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         var storage = new Account(&#34;storage&#34;, AccountArgs.builder()        
     *             .resourceGroupName(rg.getName())
     *             .location(rg.getLocation())
     *             .accountTier(&#34;Standard&#34;)
     *             .accountReplicationType(&#34;LRS&#34;)
     *             .build());
     * 
     *         var container = new Container(&#34;container&#34;, ContainerArgs.builder()        
     *             .storageAccountName(storage.getName())
     *             .containerAccessType(&#34;private&#34;)
     *             .build());
     * 
     *         final var example = StorageFunctions.getAccountBlobContainerSAS(GetAccountBlobContainerSASArgs.builder()
     *             .connectionString(storage.getPrimaryConnectionString())
     *             .containerName(container.getName())
     *             .httpsOnly(true)
     *             .ipAddress(&#34;168.1.5.65&#34;)
     *             .start(&#34;2018-03-21&#34;)
     *             .expiry(&#34;2018-03-21&#34;)
     *             .permissions(GetAccountBlobContainerSASPermissions.builder()
     *                 .read(true)
     *                 .add(true)
     *                 .create(false)
     *                 .write(false)
     *                 .delete(true)
     *                 .list(true)
     *                 .build())
     *             .cacheControl(&#34;max-age=5&#34;)
     *             .contentDisposition(&#34;inline&#34;)
     *             .contentEncoding(&#34;deflate&#34;)
     *             .contentLanguage(&#34;en-US&#34;)
     *             .contentType(&#34;application/json&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sasUrlQueryString&#34;, example.apply(getAccountBlobContainerSASResult -&gt; getAccountBlobContainerSASResult).apply(example -&gt; example.apply(getAccountBlobContainerSASResult -&gt; getAccountBlobContainerSASResult.getSas())));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountBlobContainerSASResult> getAccountBlobContainerSAS(GetAccountBlobContainerSASArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getAccountBlobContainerSAS:getAccountBlobContainerSAS", TypeShape.of(GetAccountBlobContainerSASResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     * Note that this is an [Account SAS](https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-an-account-sas)
     * and *not* a [Service SAS](https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-a-service-sas).
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
     *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
     *             .resourceGroupName(exampleResourceGroup.getName())
     *             .location(&#34;westus&#34;)
     *             .accountTier(&#34;Standard&#34;)
     *             .accountReplicationType(&#34;GRS&#34;)
     *             .tags(Map.of(&#34;environment&#34;, &#34;staging&#34;))
     *             .build());
     * 
     *         final var exampleAccountSAS = StorageFunctions.getAccountSAS(GetAccountSASArgs.builder()
     *             .connectionString(exampleAccount.getPrimaryConnectionString())
     *             .httpsOnly(true)
     *             .signedVersion(&#34;2017-07-29&#34;)
     *             .resourceTypes(GetAccountSASResourceTypes.builder()
     *                 .service(true)
     *                 .container(false)
     *                 .object(false)
     *                 .build())
     *             .services(GetAccountSASServices.builder()
     *                 .blob(true)
     *                 .queue(false)
     *                 .table(false)
     *                 .file(false)
     *                 .build())
     *             .start(&#34;2018-03-21T00:00:00Z&#34;)
     *             .expiry(&#34;2020-03-21T00:00:00Z&#34;)
     *             .permissions(GetAccountSASPermissions.builder()
     *                 .read(true)
     *                 .write(true)
     *                 .delete(false)
     *                 .list(false)
     *                 .add(true)
     *                 .create(true)
     *                 .update(false)
     *                 .process(false)
     *                 .tag(false)
     *                 .filter(false)
     *                 .build())
     *             .build());
     * 
     *         ctx.export(&#34;sasUrlQueryString&#34;, exampleAccountSAS.apply(getAccountSASResult -&gt; getAccountSASResult).apply(exampleAccountSAS -&gt; exampleAccountSAS.apply(getAccountSASResult -&gt; getAccountSASResult.getSas())));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountSASResult> getAccountSAS(GetAccountSASArgs args) {
        return getAccountSAS(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     * Note that this is an [Account SAS](https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-an-account-sas)
     * and *not* a [Service SAS](https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-a-service-sas).
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
     *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
     *             .location(&#34;West Europe&#34;)
     *             .build());
     * 
     *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
     *             .resourceGroupName(exampleResourceGroup.getName())
     *             .location(&#34;westus&#34;)
     *             .accountTier(&#34;Standard&#34;)
     *             .accountReplicationType(&#34;GRS&#34;)
     *             .tags(Map.of(&#34;environment&#34;, &#34;staging&#34;))
     *             .build());
     * 
     *         final var exampleAccountSAS = StorageFunctions.getAccountSAS(GetAccountSASArgs.builder()
     *             .connectionString(exampleAccount.getPrimaryConnectionString())
     *             .httpsOnly(true)
     *             .signedVersion(&#34;2017-07-29&#34;)
     *             .resourceTypes(GetAccountSASResourceTypes.builder()
     *                 .service(true)
     *                 .container(false)
     *                 .object(false)
     *                 .build())
     *             .services(GetAccountSASServices.builder()
     *                 .blob(true)
     *                 .queue(false)
     *                 .table(false)
     *                 .file(false)
     *                 .build())
     *             .start(&#34;2018-03-21T00:00:00Z&#34;)
     *             .expiry(&#34;2020-03-21T00:00:00Z&#34;)
     *             .permissions(GetAccountSASPermissions.builder()
     *                 .read(true)
     *                 .write(true)
     *                 .delete(false)
     *                 .list(false)
     *                 .add(true)
     *                 .create(true)
     *                 .update(false)
     *                 .process(false)
     *                 .tag(false)
     *                 .filter(false)
     *                 .build())
     *             .build());
     * 
     *         ctx.export(&#34;sasUrlQueryString&#34;, exampleAccountSAS.apply(getAccountSASResult -&gt; getAccountSASResult).apply(exampleAccountSAS -&gt; exampleAccountSAS.apply(getAccountSASResult -&gt; getAccountSASResult.getSas())));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountSASResult> getAccountSAS(GetAccountSASArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getAccountSAS:getAccountSAS", TypeShape.of(GetAccountSASResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Blob.
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
     *         final var example = Output.of(StorageFunctions.getBlob(GetBlobArgs.builder()
     *             .name(&#34;example-blob-name&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .storageContainerName(&#34;example-storage-container-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBlobResult> getBlob(GetBlobArgs args) {
        return getBlob(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Blob.
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
     *         final var example = Output.of(StorageFunctions.getBlob(GetBlobArgs.builder()
     *             .name(&#34;example-blob-name&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .storageContainerName(&#34;example-storage-container-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBlobResult> getBlob(GetBlobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getBlob:getBlob", TypeShape.of(GetBlobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Encryption Scope.
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
     *         final var exampleAccount = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;storageaccountname&#34;)
     *             .resourceGroupName(&#34;resourcegroupname&#34;)
     *             .build()));
     * 
     *         final var exampleEncryptionScope = Output.of(StorageFunctions.getEncryptionScope(GetEncryptionScopeArgs.builder()
     *             .name(&#34;existingStorageES&#34;)
     *             .storageAccountId(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleEncryptionScope.apply(getEncryptionScopeResult -&gt; getEncryptionScopeResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEncryptionScopeResult> getEncryptionScope(GetEncryptionScopeArgs args) {
        return getEncryptionScope(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Encryption Scope.
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
     *         final var exampleAccount = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;storageaccountname&#34;)
     *             .resourceGroupName(&#34;resourcegroupname&#34;)
     *             .build()));
     * 
     *         final var exampleEncryptionScope = Output.of(StorageFunctions.getEncryptionScope(GetEncryptionScopeArgs.builder()
     *             .name(&#34;existingStorageES&#34;)
     *             .storageAccountId(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleEncryptionScope.apply(getEncryptionScopeResult -&gt; getEncryptionScopeResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEncryptionScopeResult> getEncryptionScope(GetEncryptionScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getEncryptionScope:getEncryptionScope", TypeShape.of(GetEncryptionScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Management Policy.
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
     *         final var exampleAccount = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;storageaccountname&#34;)
     *             .resourceGroupName(&#34;resourcegroupname&#34;)
     *             .build()));
     * 
     *         final var examplePolicy = Output.of(StorageFunctions.getPolicy(GetPolicyArgs.builder()
     *             .storageAccountId(azurerm_storage_account.getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args) {
        return getPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Management Policy.
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
     *         final var exampleAccount = Output.of(StorageFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;storageaccountname&#34;)
     *             .resourceGroupName(&#34;resourcegroupname&#34;)
     *             .build()));
     * 
     *         final var examplePolicy = Output.of(StorageFunctions.getPolicy(GetPolicyArgs.builder()
     *             .storageAccountId(azurerm_storage_account.getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getPolicy:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing File Share.
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
     *         final var example = Output.of(StorageFunctions.getShare(GetShareArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .storageAccountName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getShareResult -&gt; getShareResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args) {
        return getShare(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing File Share.
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
     *         final var example = Output.of(StorageFunctions.getShare(GetShareArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .storageAccountName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getShareResult -&gt; getShareResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetShareResult> getShare(GetShareArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getShare:getShare", TypeShape.of(GetShareResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Container.
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
     *         final var example = Output.of(StorageFunctions.getStorageContainer(GetStorageContainerArgs.builder()
     *             .name(&#34;example-container-name&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStorageContainerResult> getStorageContainer(GetStorageContainerArgs args) {
        return getStorageContainer(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Container.
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
     *         final var example = Output.of(StorageFunctions.getStorageContainer(GetStorageContainerArgs.builder()
     *             .name(&#34;example-container-name&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStorageContainerResult> getStorageContainer(GetStorageContainerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getStorageContainer:getStorageContainer", TypeShape.of(GetStorageContainerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Sync.
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
     *         final var example = Output.of(StorageFunctions.getSync(GetSyncArgs.builder()
     *             .name(&#34;existingStorageSyncName&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getSyncResult -&gt; getSyncResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSyncResult> getSync(GetSyncArgs args) {
        return getSync(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Sync.
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
     *         final var example = Output.of(StorageFunctions.getSync(GetSyncArgs.builder()
     *             .name(&#34;existingStorageSyncName&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getSyncResult -&gt; getSyncResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSyncResult> getSync(GetSyncArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getSync:getSync", TypeShape.of(GetSyncResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Sync Group.
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
     *         final var example = Output.of(StorageFunctions.getSyncGroup(GetSyncGroupArgs.builder()
     *             .name(&#34;existing-ss-group&#34;)
     *             .storageSyncId(&#34;existing-ss-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getSyncGroupResult -&gt; getSyncGroupResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSyncGroupResult> getSyncGroup(GetSyncGroupArgs args) {
        return getSyncGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Sync Group.
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
     *         final var example = Output.of(StorageFunctions.getSyncGroup(GetSyncGroupArgs.builder()
     *             .name(&#34;existing-ss-group&#34;)
     *             .storageSyncId(&#34;existing-ss-id&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getSyncGroupResult -&gt; getSyncGroupResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSyncGroupResult> getSyncGroup(GetSyncGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getSyncGroup:getSyncGroup", TypeShape.of(GetSyncGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Storage Table Entity.
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
     *         final var example = Output.of(StorageFunctions.getTableEntity(GetTableEntityArgs.builder()
     *             .partitionKey(&#34;example-partition-key&#34;)
     *             .rowKey(&#34;example-row-key&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .tableName(&#34;example-table-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTableEntityResult> getTableEntity(GetTableEntityArgs args) {
        return getTableEntity(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Storage Table Entity.
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
     *         final var example = Output.of(StorageFunctions.getTableEntity(GetTableEntityArgs.builder()
     *             .partitionKey(&#34;example-partition-key&#34;)
     *             .rowKey(&#34;example-row-key&#34;)
     *             .storageAccountName(&#34;example-storage-account-name&#34;)
     *             .tableName(&#34;example-table-name&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTableEntityResult> getTableEntity(GetTableEntityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:storage/getTableEntity:getTableEntity", TypeShape.of(GetTableEntityResult.class), args, Utilities.withVersion(options));
    }
}
