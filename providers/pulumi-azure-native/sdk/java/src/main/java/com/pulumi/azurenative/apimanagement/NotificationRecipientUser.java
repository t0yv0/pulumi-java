// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.NotificationRecipientUserArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Recipient User details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### ApiManagementCreateNotificationRecipientUser
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
 *         var notificationRecipientUser = new NotificationRecipientUser(&#34;notificationRecipientUser&#34;, NotificationRecipientUserArgs.builder()        
 *             .notificationName(&#34;RequestPublisherNotificationMessage&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceName(&#34;apimService1&#34;)
 *             .userId(&#34;576823d0a40f7e74ec07d642&#34;)
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
 * $ pulumi import azure-native:apimanagement:NotificationRecipientUser 576823d0a40f7e74ec07d642 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/notifications/RequestPublisherNotificationMessage/recipientUsers/576823d0a40f7e74ec07d642 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:NotificationRecipientUser")
public class NotificationRecipientUser extends com.pulumi.resources.CustomResource {
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
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * API Management UserId subscribed to notification.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output</* @Nullable */ String> userId;

    /**
     * @return API Management UserId subscribed to notification.
     * 
     */
    public Output<Optional<String>> userId() {
        return Codegen.optional(this.userId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRecipientUser(String name) {
        this(name, NotificationRecipientUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRecipientUser(String name, NotificationRecipientUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRecipientUser(String name, NotificationRecipientUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NotificationRecipientUser", name, args == null ? NotificationRecipientUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationRecipientUser(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NotificationRecipientUser", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:NotificationRecipientUser").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:NotificationRecipientUser").build())
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
    public static NotificationRecipientUser get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRecipientUser(name, id, options);
    }
}
