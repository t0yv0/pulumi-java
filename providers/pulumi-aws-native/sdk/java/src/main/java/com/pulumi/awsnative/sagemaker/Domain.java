// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.DomainArgs;
import com.pulumi.awsnative.sagemaker.enums.DomainAppNetworkAccessType;
import com.pulumi.awsnative.sagemaker.enums.DomainAppSecurityGroupManagement;
import com.pulumi.awsnative.sagemaker.enums.DomainAuthMode;
import com.pulumi.awsnative.sagemaker.outputs.DomainSettings;
import com.pulumi.awsnative.sagemaker.outputs.DomainTag;
import com.pulumi.awsnative.sagemaker.outputs.DomainUserSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::Domain
 * 
 */
@ResourceType(type="aws-native:sagemaker:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    @Export(name="appNetworkAccessType", type=DomainAppNetworkAccessType.class, parameters={})
    private Output</* @Nullable */ DomainAppNetworkAccessType> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    public Output<Optional<DomainAppNetworkAccessType>> appNetworkAccessType() {
        return Codegen.optional(this.appNetworkAccessType);
    }
    /**
     * The entity that creates and manages the required security groups for inter-app communication in VPCOnly mode. Required when CreateDomain.AppNetworkAccessType is VPCOnly and DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn is provided.
     * 
     */
    @Export(name="appSecurityGroupManagement", type=DomainAppSecurityGroupManagement.class, parameters={})
    private Output</* @Nullable */ DomainAppSecurityGroupManagement> appSecurityGroupManagement;

    /**
     * @return The entity that creates and manages the required security groups for inter-app communication in VPCOnly mode. Required when CreateDomain.AppNetworkAccessType is VPCOnly and DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn is provided.
     * 
     */
    public Output<Optional<DomainAppSecurityGroupManagement>> appSecurityGroupManagement() {
        return Codegen.optional(this.appSecurityGroupManagement);
    }
    /**
     * The mode of authentication that members use to access the domain.
     * 
     */
    @Export(name="authMode", type=DomainAuthMode.class, parameters={})
    private Output<DomainAuthMode> authMode;

    /**
     * @return The mode of authentication that members use to access the domain.
     * 
     */
    public Output<DomainAuthMode> authMode() {
        return this.authMode;
    }
    /**
     * The default user settings.
     * 
     */
    @Export(name="defaultUserSettings", type=DomainUserSettings.class, parameters={})
    private Output<DomainUserSettings> defaultUserSettings;

    /**
     * @return The default user settings.
     * 
     */
    public Output<DomainUserSettings> defaultUserSettings() {
        return this.defaultUserSettings;
    }
    /**
     * The Amazon Resource Name (ARN) of the created domain.
     * 
     */
    @Export(name="domainArn", type=String.class, parameters={})
    private Output<String> domainArn;

    /**
     * @return The Amazon Resource Name (ARN) of the created domain.
     * 
     */
    public Output<String> domainArn() {
        return this.domainArn;
    }
    /**
     * The domain name.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The domain name.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * A name for the domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return A name for the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    @Export(name="domainSettings", type=DomainSettings.class, parameters={})
    private Output</* @Nullable */ DomainSettings> domainSettings;

    public Output<Optional<DomainSettings>> domainSettings() {
        return Codegen.optional(this.domainSettings);
    }
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @Export(name="homeEfsFileSystemId", type=String.class, parameters={})
    private Output<String> homeEfsFileSystemId;

    /**
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    public Output<String> homeEfsFileSystemId() {
        return this.homeEfsFileSystemId;
    }
    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * The ID of the security group that authorizes traffic between the RSessionGateway apps and the RStudioServerPro app.
     * 
     */
    @Export(name="securityGroupIdForDomainBoundary", type=String.class, parameters={})
    private Output<String> securityGroupIdForDomainBoundary;

    /**
     * @return The ID of the security group that authorizes traffic between the RSessionGateway apps and the RStudioServerPro app.
     * 
     */
    public Output<String> securityGroupIdForDomainBoundary() {
        return this.securityGroupIdForDomainBoundary;
    }
    /**
     * The SSO managed application instance ID.
     * 
     */
    @Export(name="singleSignOnManagedApplicationInstanceId", type=String.class, parameters={})
    private Output<String> singleSignOnManagedApplicationInstanceId;

    /**
     * @return The SSO managed application instance ID.
     * 
     */
    public Output<String> singleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId;
    }
    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DomainTag.class})
    private Output</* @Nullable */ List<DomainTag>> tags;

    /**
     * @return A list of tags to apply to the user profile.
     * 
     */
    public Output<Optional<List<DomainTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The URL to the created domain.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL to the created domain.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
