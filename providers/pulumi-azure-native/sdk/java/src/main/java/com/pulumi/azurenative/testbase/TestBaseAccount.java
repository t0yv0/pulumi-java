// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.testbase.TestBaseAccountArgs;
import com.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import com.pulumi.azurenative.testbase.outputs.TestBaseAccountSKUResponse;
import com.pulumi.core.Alias;
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
 * The Test Base Account resource.
 * API Version: 2020-12-16-preview.
 * 
 * ## Example Usage
 * ### TestBaseAccountCreate
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
 *         var testBaseAccount = new TestBaseAccount(&#34;testBaseAccount&#34;, TestBaseAccountArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;contoso-rg1&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;S0&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Standard&#34;)
 *             ))
 *             .testBaseAccountName(&#34;contoso-testBaseAccount1&#34;)
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
 * $ pulumi import azure-native:testbase:TestBaseAccount contoso-testBaseAccount1 /subscriptions/476f61a4-952c-422a-b4db-568a828f35df/resourceGroups/contoso-rg1/providers/Microsoft.TestBase/testBaseAccounts/contoso-testBaseAccount1 
 * ```
 * 
 */
@ResourceType(type="azure-native:testbase:TestBaseAccount")
public class TestBaseAccount extends com.pulumi.resources.CustomResource {
    /**
     * The access level of the Test Base Account.
     * 
     */
    @Export(name="accessLevel", type=String.class, parameters={})
    private Output<String> accessLevel;

    /**
     * @return The access level of the Test Base Account.
     * 
     */
    public Output<String> accessLevel() {
        return this.accessLevel;
    }
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the Test Base Account.
     * 
     */
    @Export(name="sku", type=TestBaseAccountSKUResponse.class, parameters={})
    private Output<TestBaseAccountSKUResponse> sku;

    /**
     * @return The SKU of the Test Base Account.
     * 
     */
    public Output<TestBaseAccountSKUResponse> sku() {
        return this.sku;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TestBaseAccount(String name) {
        this(name, TestBaseAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TestBaseAccount(String name, TestBaseAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TestBaseAccount(String name, TestBaseAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:TestBaseAccount", name, args == null ? TestBaseAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TestBaseAccount(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:TestBaseAccount", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:testbase/v20201216preview:TestBaseAccount").build())
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
    public static TestBaseAccount get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TestBaseAccount(name, id, options);
    }
}
