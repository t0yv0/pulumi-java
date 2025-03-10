// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppBackupConfigurationArgs;
import com.pulumi.azurenative.web.outputs.BackupScheduleResponse;
import com.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Description of a backup which will be performed.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppBackupConfiguration myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/backup 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppBackupConfiguration")
public class WebAppBackupConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Name of the backup.
     * 
     */
    @Export(name="backupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupName;

    /**
     * @return Name of the backup.
     * 
     */
    public Output<Optional<String>> backupName() {
        return Codegen.optional(this.backupName);
    }
    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Export(name="backupSchedule", type=BackupScheduleResponse.class, parameters={})
    private Output</* @Nullable */ BackupScheduleResponse> backupSchedule;

    /**
     * @return Schedule for the backup if it is executed periodically.
     * 
     */
    public Output<Optional<BackupScheduleResponse>> backupSchedule() {
        return Codegen.optional(this.backupSchedule);
    }
    /**
     * Databases included in the backup.
     * 
     */
    @Export(name="databases", type=List.class, parameters={DatabaseBackupSettingResponse.class})
    private Output</* @Nullable */ List<DatabaseBackupSettingResponse>> databases;

    /**
     * @return Databases included in the backup.
     * 
     */
    public Output<Optional<List<DatabaseBackupSettingResponse>>> databases() {
        return Codegen.optional(this.databases);
    }
    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * SAS URL to the container.
     * 
     */
    @Export(name="storageAccountUrl", type=String.class, parameters={})
    private Output<String> storageAccountUrl;

    /**
     * @return SAS URL to the container.
     * 
     */
    public Output<String> storageAccountUrl() {
        return this.storageAccountUrl;
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
    public WebAppBackupConfiguration(String name) {
        this(name, WebAppBackupConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppBackupConfiguration(String name, WebAppBackupConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppBackupConfiguration(String name, WebAppBackupConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppBackupConfiguration", name, args == null ? WebAppBackupConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppBackupConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppBackupConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppBackupConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppBackupConfiguration").build())
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
    public static WebAppBackupConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppBackupConfiguration(name, id, options);
    }
}
