// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Apm;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Apm.inputs.GetApmDomainArgs;
import com.pulumi.oci.Apm.inputs.GetApmDomainsArgs;
import com.pulumi.oci.Apm.inputs.GetDataKeysArgs;
import com.pulumi.oci.Apm.outputs.GetApmDomainResult;
import com.pulumi.oci.Apm.outputs.GetApmDomainsResult;
import com.pulumi.oci.Apm.outputs.GetDataKeysResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ApmFunctions {
    /**
     * This data source provides details about a specific Apm Domain resource in Oracle Cloud Infrastructure Apm service.
     * 
     * Gets the details of the APM domain specified by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApmDomainResult> getApmDomain(GetApmDomainArgs args) {
        return getApmDomain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Apm Domain resource in Oracle Cloud Infrastructure Apm service.
     * 
     * Gets the details of the APM domain specified by OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApmDomainResult> getApmDomain(GetApmDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Apm/getApmDomain:getApmDomain", TypeShape.of(GetApmDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Apm Domains in Oracle Cloud Infrastructure Apm service.
     * 
     * Lists all APM domains for the specified tenant compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApmDomainsResult> getApmDomains(GetApmDomainsArgs args) {
        return getApmDomains(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Apm Domains in Oracle Cloud Infrastructure Apm service.
     * 
     * Lists all APM domains for the specified tenant compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApmDomainsResult> getApmDomains(GetApmDomainsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Apm/getApmDomains:getApmDomains", TypeShape.of(GetApmDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Data Keys in Oracle Cloud Infrastructure Apm service.
     * 
     * Lists all Data Keys for the specified APM domain. The caller may filter the list by specifying the &#39;dataKeyType&#39;
     * query parameter.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDataKeysResult> getDataKeys(GetDataKeysArgs args) {
        return getDataKeys(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Data Keys in Oracle Cloud Infrastructure Apm service.
     * 
     * Lists all Data Keys for the specified APM domain. The caller may filter the list by specifying the &#39;dataKeyType&#39;
     * query parameter.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDataKeysResult> getDataKeys(GetDataKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Apm/getDataKeys:getDataKeys", TypeShape.of(GetDataKeysResult.class), args, Utilities.withVersion(options));
    }
}
