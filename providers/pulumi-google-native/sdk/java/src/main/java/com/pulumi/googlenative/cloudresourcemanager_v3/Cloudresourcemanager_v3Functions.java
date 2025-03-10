// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetFolderArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetFolderIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetLienArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetOrganizationIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetProjectArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetProjectIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetTagKeyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetTagKeyIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetTagValueArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.inputs.GetTagValueIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetFolderIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetFolderResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetLienResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetOrganizationIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetProjectIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetProjectResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetTagKeyIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetTagKeyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetTagValueIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v3.outputs.GetTagValueResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudresourcemanager_v3Functions {
    /**
     * Retrieves a folder identified by the supplied resource name. Valid folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderResult> getFolder(GetFolderArgs args) {
        return getFolder(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a folder identified by the supplied resource name. Valid folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderResult> getFolder(GetFolderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getFolder", TypeShape.of(GetFolderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the folder&#39;s resource name, for example: &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderIamPolicyResult> getFolderIamPolicy(GetFolderIamPolicyArgs args) {
        return getFolderIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the folder&#39;s resource name, for example: &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderIamPolicyResult> getFolderIamPolicy(GetFolderIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getFolderIamPolicy", TypeShape.of(GetFolderIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission `resourcemanager.projects.get`
     * 
     */
    public static CompletableFuture<GetLienResult> getLien(GetLienArgs args) {
        return getLien(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission `resourcemanager.projects.get`
     * 
     */
    public static CompletableFuture<GetLienResult> getLien(GetLienArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getLien", TypeShape.of(GetLienResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for an organization resource. The policy may be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, for example: &#34;organizations/123&#34;. Authorization requires the IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization.
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args) {
        return getOrganizationIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for an organization resource. The policy may be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, for example: &#34;organizations/123&#34;. Authorization requires the IAM permission `resourcemanager.organizations.getIamPolicy` on the specified organization.
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getOrganizationIamPolicy", TypeShape.of(GetOrganizationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the project identified by the specified `name` (for example, `projects/415104041262`). The caller must have `resourcemanager.projects.get` permission for this project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject() {
        return getProject(GetProjectArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the project identified by the specified `name` (for example, `projects/415104041262`). The caller must have `resourcemanager.projects.get` permission for this project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the project identified by the specified `name` (for example, `projects/415104041262`). The caller must have `resourcemanager.projects.get` permission for this project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the IAM access control policy for the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123. Permission is denied if the policy or the resource do not exist.
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicy() {
        return getProjectIamPolicy(GetProjectIamPolicyArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Returns the IAM access control policy for the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123. Permission is denied if the policy or the resource do not exist.
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args) {
        return getProjectIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Returns the IAM access control policy for the specified project, in the format `projects/{ProjectIdOrNumber}` e.g. projects/123. Permission is denied if the policy or the resource do not exist.
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a TagKey. This method will return `PERMISSION_DENIED` if the key does not exist or the user does not have permission to view it.
     * 
     */
    public static CompletableFuture<GetTagKeyResult> getTagKey(GetTagKeyArgs args) {
        return getTagKey(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a TagKey. This method will return `PERMISSION_DENIED` if the key does not exist or the user does not have permission to view it.
     * 
     */
    public static CompletableFuture<GetTagKeyResult> getTagKey(GetTagKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getTagKey", TypeShape.of(GetTagKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a TagKey. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagKey&#39;s resource name. For example, &#34;tagKeys/1234&#34;. The caller must have `cloudresourcemanager.googleapis.com/tagKeys.getIamPolicy` permission on the specified TagKey.
     * 
     */
    public static CompletableFuture<GetTagKeyIamPolicyResult> getTagKeyIamPolicy(GetTagKeyIamPolicyArgs args) {
        return getTagKeyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a TagKey. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagKey&#39;s resource name. For example, &#34;tagKeys/1234&#34;. The caller must have `cloudresourcemanager.googleapis.com/tagKeys.getIamPolicy` permission on the specified TagKey.
     * 
     */
    public static CompletableFuture<GetTagKeyIamPolicyResult> getTagKeyIamPolicy(GetTagKeyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getTagKeyIamPolicy", TypeShape.of(GetTagKeyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves TagValue. If the TagValue or namespaced name does not exist, or if the user does not have permission to view it, this method will return `PERMISSION_DENIED`.
     * 
     */
    public static CompletableFuture<GetTagValueResult> getTagValue(GetTagValueArgs args) {
        return getTagValue(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves TagValue. If the TagValue or namespaced name does not exist, or if the user does not have permission to view it, this method will return `PERMISSION_DENIED`.
     * 
     */
    public static CompletableFuture<GetTagValueResult> getTagValue(GetTagValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getTagValue", TypeShape.of(GetTagValueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a TagValue. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagValue&#39;s resource name. For example: `tagValues/1234`. The caller must have the `cloudresourcemanager.googleapis.com/tagValues.getIamPolicy` permission on the identified TagValue to get the access control policy.
     * 
     */
    public static CompletableFuture<GetTagValueIamPolicyResult> getTagValueIamPolicy(GetTagValueIamPolicyArgs args) {
        return getTagValueIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a TagValue. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the TagValue&#39;s resource name. For example: `tagValues/1234`. The caller must have the `cloudresourcemanager.googleapis.com/tagValues.getIamPolicy` permission on the identified TagValue to get the access control policy.
     * 
     */
    public static CompletableFuture<GetTagValueIamPolicyResult> getTagValueIamPolicy(GetTagValueIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v3:getTagValueIamPolicy", TypeShape.of(GetTagValueIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
