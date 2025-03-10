// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs;
import com.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    @Import(name="appNetworkAccessType")
    private @Nullable Output<String> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    public Optional<Output<String>> appNetworkAccessType() {
        return Optional.ofNullable(this.appNetworkAccessType);
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    @Import(name="authMode")
    private @Nullable Output<String> authMode;

    /**
     * @return The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    public Optional<Output<String>> authMode() {
        return Optional.ofNullable(this.authMode);
    }

    /**
     * The default user settings. See Default User Settings below.
     * 
     */
    @Import(name="defaultUserSettings")
    private @Nullable Output<DomainDefaultUserSettingsArgs> defaultUserSettings;

    /**
     * @return The default user settings. See Default User Settings below.
     * 
     */
    public Optional<Output<DomainDefaultUserSettingsArgs>> defaultUserSettings() {
        return Optional.ofNullable(this.defaultUserSettings);
    }

    /**
     * The domain name.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The domain name.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @Import(name="homeEfsFileSystemId")
    private @Nullable Output<String> homeEfsFileSystemId;

    /**
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    public Optional<Output<String>> homeEfsFileSystemId() {
        return Optional.ofNullable(this.homeEfsFileSystemId);
    }

    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<DomainRetentionPolicyArgs> retentionPolicy;

    /**
     * @return The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    public Optional<Output<DomainRetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The SSO managed application instance ID.
     * 
     */
    @Import(name="singleSignOnManagedApplicationInstanceId")
    private @Nullable Output<String> singleSignOnManagedApplicationInstanceId;

    /**
     * @return The SSO managed application instance ID.
     * 
     */
    public Optional<Output<String>> singleSignOnManagedApplicationInstanceId() {
        return Optional.ofNullable(this.singleSignOnManagedApplicationInstanceId);
    }

    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The domain&#39;s URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The domain&#39;s URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.appNetworkAccessType = $.appNetworkAccessType;
        this.arn = $.arn;
        this.authMode = $.authMode;
        this.defaultUserSettings = $.defaultUserSettings;
        this.domainName = $.domainName;
        this.homeEfsFileSystemId = $.homeEfsFileSystemId;
        this.kmsKeyId = $.kmsKeyId;
        this.retentionPolicy = $.retentionPolicy;
        this.singleSignOnManagedApplicationInstanceId = $.singleSignOnManagedApplicationInstanceId;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.url = $.url;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
         * 
         * @return builder
         * 
         */
        public Builder appNetworkAccessType(@Nullable Output<String> appNetworkAccessType) {
            $.appNetworkAccessType = appNetworkAccessType;
            return this;
        }

        /**
         * @param appNetworkAccessType Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
         * 
         * @return builder
         * 
         */
        public Builder appNetworkAccessType(String appNetworkAccessType) {
            return appNetworkAccessType(Output.of(appNetworkAccessType));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Domain.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Domain.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param authMode The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
         * 
         * @return builder
         * 
         */
        public Builder authMode(@Nullable Output<String> authMode) {
            $.authMode = authMode;
            return this;
        }

        /**
         * @param authMode The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
         * 
         * @return builder
         * 
         */
        public Builder authMode(String authMode) {
            return authMode(Output.of(authMode));
        }

        /**
         * @param defaultUserSettings The default user settings. See Default User Settings below.
         * 
         * @return builder
         * 
         */
        public Builder defaultUserSettings(@Nullable Output<DomainDefaultUserSettingsArgs> defaultUserSettings) {
            $.defaultUserSettings = defaultUserSettings;
            return this;
        }

        /**
         * @param defaultUserSettings The default user settings. See Default User Settings below.
         * 
         * @return builder
         * 
         */
        public Builder defaultUserSettings(DomainDefaultUserSettingsArgs defaultUserSettings) {
            return defaultUserSettings(Output.of(defaultUserSettings));
        }

        /**
         * @param domainName The domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param homeEfsFileSystemId The ID of the Amazon Elastic File System (EFS) managed by this Domain.
         * 
         * @return builder
         * 
         */
        public Builder homeEfsFileSystemId(@Nullable Output<String> homeEfsFileSystemId) {
            $.homeEfsFileSystemId = homeEfsFileSystemId;
            return this;
        }

        /**
         * @param homeEfsFileSystemId The ID of the Amazon Elastic File System (EFS) managed by this Domain.
         * 
         * @return builder
         * 
         */
        public Builder homeEfsFileSystemId(String homeEfsFileSystemId) {
            return homeEfsFileSystemId(Output.of(homeEfsFileSystemId));
        }

        /**
         * @param kmsKeyId The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<DomainRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(DomainRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param singleSignOnManagedApplicationInstanceId The SSO managed application instance ID.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnManagedApplicationInstanceId(@Nullable Output<String> singleSignOnManagedApplicationInstanceId) {
            $.singleSignOnManagedApplicationInstanceId = singleSignOnManagedApplicationInstanceId;
            return this;
        }

        /**
         * @param singleSignOnManagedApplicationInstanceId The SSO managed application instance ID.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnManagedApplicationInstanceId(String singleSignOnManagedApplicationInstanceId) {
            return singleSignOnManagedApplicationInstanceId(Output.of(singleSignOnManagedApplicationInstanceId));
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The VPC subnets that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param url The domain&#39;s URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The domain&#39;s URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param vpcId The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DomainState build() {
            return $;
        }
    }

}
