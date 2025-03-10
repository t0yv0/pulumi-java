// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vmmigration_v1.MigratingVmArgs;
import com.pulumi.googlenative.vmmigration_v1.outputs.AwsSourceVmDetailsResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.CloneJobResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDefaultsResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.CutoverJobResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ReplicationCycleResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ReplicationSyncResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.SchedulePolicyResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new MigratingVm in a given Source.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1:MigratingVm")
public class MigratingVm extends com.pulumi.resources.CustomResource {
    /**
     * Details of the VM from an AWS source.
     * 
     */
    @Export(name="awsSourceVmDetails", type=AwsSourceVmDetailsResponse.class, parameters={})
    private Output<AwsSourceVmDetailsResponse> awsSourceVmDetails;

    /**
     * @return Details of the VM from an AWS source.
     * 
     */
    public Output<AwsSourceVmDetailsResponse> awsSourceVmDetails() {
        return this.awsSourceVmDetails;
    }
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Export(name="computeEngineTargetDefaults", type=ComputeEngineTargetDefaultsResponse.class, parameters={})
    private Output<ComputeEngineTargetDefaultsResponse> computeEngineTargetDefaults;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Output<ComputeEngineTargetDefaultsResponse> computeEngineTargetDefaults() {
        return this.computeEngineTargetDefaults;
    }
    /**
     * The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The percentage progress of the current running replication cycle.
     * 
     */
    @Export(name="currentSyncInfo", type=ReplicationCycleResponse.class, parameters={})
    private Output<ReplicationCycleResponse> currentSyncInfo;

    /**
     * @return The percentage progress of the current running replication cycle.
     * 
     */
    public Output<ReplicationCycleResponse> currentSyncInfo() {
        return this.currentSyncInfo;
    }
    /**
     * The description attached to the migrating VM by the user.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description attached to the migrating VM by the user.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The display name attached to the MigratingVm by the user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name attached to the MigratingVm by the user.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Provides details on the state of the Migrating VM in case of an error in replication.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Migrating VM in case of an error in replication.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The labels of the migrating VM.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the migrating VM.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
     */
    @Export(name="lastSync", type=ReplicationSyncResponse.class, parameters={})
    private Output<ReplicationSyncResponse> lastSync;

    /**
     * @return The most updated snapshot created time in the source that finished replication.
     * 
     */
    public Output<ReplicationSyncResponse> lastSync() {
        return this.lastSync;
    }
    /**
     * The identifier of the MigratingVm.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The identifier of the MigratingVm.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The replication schedule policy.
     * 
     */
    @Export(name="policy", type=SchedulePolicyResponse.class, parameters={})
    private Output<SchedulePolicyResponse> policy;

    /**
     * @return The replication schedule policy.
     * 
     */
    public Output<SchedulePolicyResponse> policy() {
        return this.policy;
    }
    /**
     * The recent clone jobs performed on the migrating VM. This field holds the vm&#39;s last completed clone job and the vm&#39;s running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    @Export(name="recentCloneJobs", type=List.class, parameters={CloneJobResponse.class})
    private Output<List<CloneJobResponse>> recentCloneJobs;

    /**
     * @return The recent clone jobs performed on the migrating VM. This field holds the vm&#39;s last completed clone job and the vm&#39;s running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    public Output<List<CloneJobResponse>> recentCloneJobs() {
        return this.recentCloneJobs;
    }
    /**
     * The recent cutover jobs performed on the migrating VM. This field holds the vm&#39;s last completed cutover job and the vm&#39;s running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    @Export(name="recentCutoverJobs", type=List.class, parameters={CutoverJobResponse.class})
    private Output<List<CutoverJobResponse>> recentCutoverJobs;

    /**
     * @return The recent cutover jobs performed on the migrating VM. This field holds the vm&#39;s last completed cutover job and the vm&#39;s running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the &#34;view&#34; parameter of the Get/List request.
     * 
     */
    public Output<List<CutoverJobResponse>> recentCutoverJobs() {
        return this.recentCutoverJobs;
    }
    /**
     * The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
     */
    @Export(name="sourceVmId", type=String.class, parameters={})
    private Output<String> sourceVmId;

    /**
     * @return The unique ID of the VM in the source. The VM&#39;s name in vSphere can be changed, so this is not the VM&#39;s name but rather its moRef id. This id is of the form vm-.
     * 
     */
    public Output<String> sourceVmId() {
        return this.sourceVmId;
    }
    /**
     * State of the MigratingVm.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the MigratingVm.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The last time the migrating VM state was updated.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The last time the migrating VM state was updated.
     * 
     */
    public Output<String> stateTime() {
        return this.stateTime;
    }
    /**
     * The last time the migrating VM resource was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last time the migrating VM resource was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MigratingVm(String name) {
        this(name, MigratingVmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MigratingVm(String name, MigratingVmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigratingVm(String name, MigratingVmArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:MigratingVm", name, args == null ? MigratingVmArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MigratingVm(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:MigratingVm", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MigratingVm get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MigratingVm(name, id, options);
    }
}
