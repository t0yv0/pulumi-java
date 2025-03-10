// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudActiveDeploymentArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudActiveDeploymentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Active Azure Spring Cloud Deployment.
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .build());
 * 
 *         var exampleSpringCloudApp = new SpringCloudApp(&#34;exampleSpringCloudApp&#34;, SpringCloudAppArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .serviceName(exampleSpringCloudService.getName())
 *             .identity(SpringCloudAppIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSpringCloudJavaDeployment = new SpringCloudJavaDeployment(&#34;exampleSpringCloudJavaDeployment&#34;, SpringCloudJavaDeploymentArgs.builder()        
 *             .springCloudAppId(exampleSpringCloudApp.getId())
 *             .instanceCount(2)
 *             .jvmOptions(&#34;-XX:+PrintGC&#34;)
 *             .runtimeVersion(&#34;Java_11&#34;)
 *             .quota(SpringCloudJavaDeploymentQuota.builder()
 *                 .cpu(&#34;2&#34;)
 *                 .memory(&#34;4Gi&#34;)
 *                 .build())
 *             .environmentVariables(Map.of(&#34;Env&#34;, &#34;Staging&#34;))
 *             .build());
 * 
 *         var exampleSpringCloudActiveDeployment = new SpringCloudActiveDeployment(&#34;exampleSpringCloudActiveDeployment&#34;, SpringCloudActiveDeploymentArgs.builder()        
 *             .springCloudAppId(exampleSpringCloudApp.getId())
 *             .deploymentName(exampleSpringCloudJavaDeployment.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Active Deployment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/Spring/service1/apps/app1
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment")
public class SpringCloudActiveDeployment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of Spring Cloud Deployment which is going to be active.
     * 
     */
    @Export(name="deploymentName", type=String.class, parameters={})
    private Output<String> deploymentName;

    /**
     * @return Specifies the name of Spring Cloud Deployment which is going to be active.
     * 
     */
    public Output<String> deploymentName() {
        return this.deploymentName;
    }
    /**
     * Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="springCloudAppId", type=String.class, parameters={})
    private Output<String> springCloudAppId;

    /**
     * @return Specifies the id of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> springCloudAppId() {
        return this.springCloudAppId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudActiveDeployment(String name) {
        this(name, SpringCloudActiveDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudActiveDeployment(String name, SpringCloudActiveDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudActiveDeployment(String name, SpringCloudActiveDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment", name, args == null ? SpringCloudActiveDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudActiveDeployment(String name, Output<String> id, @Nullable SpringCloudActiveDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudActiveDeployment:SpringCloudActiveDeployment", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudActiveDeployment get(String name, Output<String> id, @Nullable SpringCloudActiveDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudActiveDeployment(name, id, state, options);
    }
}
