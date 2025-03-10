// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs;
import com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiCopyState extends com.pulumi.resources.ResourceArgs {

    public static final AmiCopyState Empty = new AmiCopyState();

    /**
     * Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    /**
     * @return Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The ARN of the AMI.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the AMI.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    @Import(name="bootMode")
    private @Nullable Output<String> bootMode;

    /**
     * @return The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public Optional<Output<String>> bootMode() {
        return Optional.ofNullable(this.bootMode);
    }

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A longer, human-readable description for the AMI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ARN of the Outpost to which to copy the AMI.
     * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     * 
     */
    @Import(name="destinationOutpostArn")
    private @Nullable Output<String> destinationOutpostArn;

    /**
     * @return The ARN of the Outpost to which to copy the AMI.
     * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     * 
     */
    public Optional<Output<String>> destinationOutpostArn() {
        return Optional.ofNullable(this.destinationOutpostArn);
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
    private @Nullable Output<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices;

    /**
     * @return Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiCopyEbsBlockDeviceArgs>>> ebsBlockDevices() {
        return Optional.ofNullable(this.ebsBlockDevices);
    }

    /**
     * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enaSupport")
    private @Nullable Output<Boolean> enaSupport;

    /**
     * @return Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enaSupport() {
        return Optional.ofNullable(this.enaSupport);
    }

    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
    private @Nullable Output<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    /**
     * @return Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiCopyEphemeralBlockDeviceArgs>>> ephemeralBlockDevices() {
        return Optional.ofNullable(this.ephemeralBlockDevices);
    }

    @Import(name="hypervisor")
    private @Nullable Output<String> hypervisor;

    public Optional<Output<String>> hypervisor() {
        return Optional.ofNullable(this.hypervisor);
    }

    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Import(name="imageLocation")
    private @Nullable Output<String> imageLocation;

    /**
     * @return Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    public Optional<Output<String>> imageLocation() {
        return Optional.ofNullable(this.imageLocation);
    }

    @Import(name="imageOwnerAlias")
    private @Nullable Output<String> imageOwnerAlias;

    public Optional<Output<String>> imageOwnerAlias() {
        return Optional.ofNullable(this.imageOwnerAlias);
    }

    @Import(name="imageType")
    private @Nullable Output<String> imageType;

    public Optional<Output<String>> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    /**
     * The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Import(name="kernelId")
    private @Nullable Output<String> kernelId;

    /**
     * @return The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    public Optional<Output<String>> kernelId() {
        return Optional.ofNullable(this.kernelId);
    }

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
     * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
     * if this parameter is not specified, the default CMK for EBS is used
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
     * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
     * if this parameter is not specified, the default CMK for EBS is used
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="manageEbsSnapshots")
    private @Nullable Output<Boolean> manageEbsSnapshots;

    public Optional<Output<Boolean>> manageEbsSnapshots() {
        return Optional.ofNullable(this.manageEbsSnapshots);
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    @Import(name="platform")
    private @Nullable Output<String> platform;

    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    @Import(name="platformDetails")
    private @Nullable Output<String> platformDetails;

    public Optional<Output<String>> platformDetails() {
        return Optional.ofNullable(this.platformDetails);
    }

    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    /**
     * The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Import(name="ramdiskId")
    private @Nullable Output<String> ramdiskId;

    /**
     * @return The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    public Optional<Output<String>> ramdiskId() {
        return Optional.ofNullable(this.ramdiskId);
    }

    /**
     * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Import(name="rootDeviceName")
    private @Nullable Output<String> rootDeviceName;

    /**
     * @return The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    public Optional<Output<String>> rootDeviceName() {
        return Optional.ofNullable(this.rootDeviceName);
    }

    @Import(name="rootSnapshotId")
    private @Nullable Output<String> rootSnapshotId;

    public Optional<Output<String>> rootSnapshotId() {
        return Optional.ofNullable(this.rootSnapshotId);
    }

    /**
     * The id of the AMI to copy. This id must be valid in the region
     * given by `source_ami_region`.
     * 
     */
    @Import(name="sourceAmiId")
    private @Nullable Output<String> sourceAmiId;

    /**
     * @return The id of the AMI to copy. This id must be valid in the region
     * given by `source_ami_region`.
     * 
     */
    public Optional<Output<String>> sourceAmiId() {
        return Optional.ofNullable(this.sourceAmiId);
    }

    /**
     * The region from which the AMI will be copied. This may be the
     * same as the AWS provider region in order to create a copy within the same region.
     * 
     */
    @Import(name="sourceAmiRegion")
    private @Nullable Output<String> sourceAmiRegion;

    /**
     * @return The region from which the AMI will be copied. This may be the
     * same as the AWS provider region in order to create a copy within the same region.
     * 
     */
    public Optional<Output<String>> sourceAmiRegion() {
        return Optional.ofNullable(this.sourceAmiRegion);
    }

    /**
     * When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Import(name="sriovNetSupport")
    private @Nullable Output<String> sriovNetSupport;

    /**
     * @return When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    public Optional<Output<String>> sriovNetSupport() {
        return Optional.ofNullable(this.sriovNetSupport);
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

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="usageOperation")
    private @Nullable Output<String> usageOperation;

    public Optional<Output<String>> usageOperation() {
        return Optional.ofNullable(this.usageOperation);
    }

    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Import(name="virtualizationType")
    private @Nullable Output<String> virtualizationType;

    /**
     * @return Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    public Optional<Output<String>> virtualizationType() {
        return Optional.ofNullable(this.virtualizationType);
    }

    private AmiCopyState() {}

    private AmiCopyState(AmiCopyState $) {
        this.architecture = $.architecture;
        this.arn = $.arn;
        this.bootMode = $.bootMode;
        this.description = $.description;
        this.destinationOutpostArn = $.destinationOutpostArn;
        this.ebsBlockDevices = $.ebsBlockDevices;
        this.enaSupport = $.enaSupport;
        this.encrypted = $.encrypted;
        this.ephemeralBlockDevices = $.ephemeralBlockDevices;
        this.hypervisor = $.hypervisor;
        this.imageLocation = $.imageLocation;
        this.imageOwnerAlias = $.imageOwnerAlias;
        this.imageType = $.imageType;
        this.kernelId = $.kernelId;
        this.kmsKeyId = $.kmsKeyId;
        this.manageEbsSnapshots = $.manageEbsSnapshots;
        this.name = $.name;
        this.ownerId = $.ownerId;
        this.platform = $.platform;
        this.platformDetails = $.platformDetails;
        this.public_ = $.public_;
        this.ramdiskId = $.ramdiskId;
        this.rootDeviceName = $.rootDeviceName;
        this.rootSnapshotId = $.rootSnapshotId;
        this.sourceAmiId = $.sourceAmiId;
        this.sourceAmiRegion = $.sourceAmiRegion;
        this.sriovNetSupport = $.sriovNetSupport;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.usageOperation = $.usageOperation;
        this.virtualizationType = $.virtualizationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiCopyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiCopyState $;

        public Builder() {
            $ = new AmiCopyState();
        }

        public Builder(AmiCopyState defaults) {
            $ = new AmiCopyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param arn The ARN of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param bootMode The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
         * 
         * @return builder
         * 
         */
        public Builder bootMode(@Nullable Output<String> bootMode) {
            $.bootMode = bootMode;
            return this;
        }

        /**
         * @param bootMode The boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
         * 
         * @return builder
         * 
         */
        public Builder bootMode(String bootMode) {
            return bootMode(Output.of(bootMode));
        }

        /**
         * @param description A longer, human-readable description for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A longer, human-readable description for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationOutpostArn The ARN of the Outpost to which to copy the AMI.
         * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
         * 
         * @return builder
         * 
         */
        public Builder destinationOutpostArn(@Nullable Output<String> destinationOutpostArn) {
            $.destinationOutpostArn = destinationOutpostArn;
            return this;
        }

        /**
         * @param destinationOutpostArn The ARN of the Outpost to which to copy the AMI.
         * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
         * 
         * @return builder
         * 
         */
        public Builder destinationOutpostArn(String destinationOutpostArn) {
            return destinationOutpostArn(Output.of(destinationOutpostArn));
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(@Nullable Output<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices) {
            $.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(List<AmiCopyEbsBlockDeviceArgs> ebsBlockDevices) {
            return ebsBlockDevices(Output.of(ebsBlockDevices));
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(AmiCopyEbsBlockDeviceArgs... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }

        /**
         * @param enaSupport Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enaSupport(@Nullable Output<Boolean> enaSupport) {
            $.enaSupport = enaSupport;
            return this;
        }

        /**
         * @param enaSupport Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enaSupport(Boolean enaSupport) {
            return enaSupport(Output.of(enaSupport));
        }

        /**
         * @param encrypted Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            $.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(List<AmiCopyEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            return ephemeralBlockDevices(Output.of(ephemeralBlockDevices));
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(AmiCopyEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }

        public Builder hypervisor(@Nullable Output<String> hypervisor) {
            $.hypervisor = hypervisor;
            return this;
        }

        public Builder hypervisor(String hypervisor) {
            return hypervisor(Output.of(hypervisor));
        }

        /**
         * @param imageLocation Path to an S3 object containing an image manifest, e.g., created
         * by the `ec2-upload-bundle` command in the EC2 command line tools.
         * 
         * @return builder
         * 
         */
        public Builder imageLocation(@Nullable Output<String> imageLocation) {
            $.imageLocation = imageLocation;
            return this;
        }

        /**
         * @param imageLocation Path to an S3 object containing an image manifest, e.g., created
         * by the `ec2-upload-bundle` command in the EC2 command line tools.
         * 
         * @return builder
         * 
         */
        public Builder imageLocation(String imageLocation) {
            return imageLocation(Output.of(imageLocation));
        }

        public Builder imageOwnerAlias(@Nullable Output<String> imageOwnerAlias) {
            $.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        public Builder imageOwnerAlias(String imageOwnerAlias) {
            return imageOwnerAlias(Output.of(imageOwnerAlias));
        }

        public Builder imageType(@Nullable Output<String> imageType) {
            $.imageType = imageType;
            return this;
        }

        public Builder imageType(String imageType) {
            return imageType(Output.of(imageType));
        }

        /**
         * @param kernelId The id of the kernel image (AKI) that will be used as the paravirtual
         * kernel in created instances.
         * 
         * @return builder
         * 
         */
        public Builder kernelId(@Nullable Output<String> kernelId) {
            $.kernelId = kernelId;
            return this;
        }

        /**
         * @param kernelId The id of the kernel image (AKI) that will be used as the paravirtual
         * kernel in created instances.
         * 
         * @return builder
         * 
         */
        public Builder kernelId(String kernelId) {
            return kernelId(Output.of(kernelId));
        }

        /**
         * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
         * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
         * if this parameter is not specified, the default CMK for EBS is used
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
         * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
         * if this parameter is not specified, the default CMK for EBS is used
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder manageEbsSnapshots(@Nullable Output<Boolean> manageEbsSnapshots) {
            $.manageEbsSnapshots = manageEbsSnapshots;
            return this;
        }

        public Builder manageEbsSnapshots(Boolean manageEbsSnapshots) {
            return manageEbsSnapshots(Output.of(manageEbsSnapshots));
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        public Builder platformDetails(@Nullable Output<String> platformDetails) {
            $.platformDetails = platformDetails;
            return this;
        }

        public Builder platformDetails(String platformDetails) {
            return platformDetails(Output.of(platformDetails));
        }

        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        /**
         * @param ramdiskId The id of an initrd image (ARI) that will be used when booting the
         * created instances.
         * 
         * @return builder
         * 
         */
        public Builder ramdiskId(@Nullable Output<String> ramdiskId) {
            $.ramdiskId = ramdiskId;
            return this;
        }

        /**
         * @param ramdiskId The id of an initrd image (ARI) that will be used when booting the
         * created instances.
         * 
         * @return builder
         * 
         */
        public Builder ramdiskId(String ramdiskId) {
            return ramdiskId(Output.of(ramdiskId));
        }

        /**
         * @param rootDeviceName The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
         * 
         * @return builder
         * 
         */
        public Builder rootDeviceName(@Nullable Output<String> rootDeviceName) {
            $.rootDeviceName = rootDeviceName;
            return this;
        }

        /**
         * @param rootDeviceName The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
         * 
         * @return builder
         * 
         */
        public Builder rootDeviceName(String rootDeviceName) {
            return rootDeviceName(Output.of(rootDeviceName));
        }

        public Builder rootSnapshotId(@Nullable Output<String> rootSnapshotId) {
            $.rootSnapshotId = rootSnapshotId;
            return this;
        }

        public Builder rootSnapshotId(String rootSnapshotId) {
            return rootSnapshotId(Output.of(rootSnapshotId));
        }

        /**
         * @param sourceAmiId The id of the AMI to copy. This id must be valid in the region
         * given by `source_ami_region`.
         * 
         * @return builder
         * 
         */
        public Builder sourceAmiId(@Nullable Output<String> sourceAmiId) {
            $.sourceAmiId = sourceAmiId;
            return this;
        }

        /**
         * @param sourceAmiId The id of the AMI to copy. This id must be valid in the region
         * given by `source_ami_region`.
         * 
         * @return builder
         * 
         */
        public Builder sourceAmiId(String sourceAmiId) {
            return sourceAmiId(Output.of(sourceAmiId));
        }

        /**
         * @param sourceAmiRegion The region from which the AMI will be copied. This may be the
         * same as the AWS provider region in order to create a copy within the same region.
         * 
         * @return builder
         * 
         */
        public Builder sourceAmiRegion(@Nullable Output<String> sourceAmiRegion) {
            $.sourceAmiRegion = sourceAmiRegion;
            return this;
        }

        /**
         * @param sourceAmiRegion The region from which the AMI will be copied. This may be the
         * same as the AWS provider region in order to create a copy within the same region.
         * 
         * @return builder
         * 
         */
        public Builder sourceAmiRegion(String sourceAmiRegion) {
            return sourceAmiRegion(Output.of(sourceAmiRegion));
        }

        /**
         * @param sriovNetSupport When set to &#34;simple&#34; (the default), enables enhanced networking
         * for created instances. No other value is supported at this time.
         * 
         * @return builder
         * 
         */
        public Builder sriovNetSupport(@Nullable Output<String> sriovNetSupport) {
            $.sriovNetSupport = sriovNetSupport;
            return this;
        }

        /**
         * @param sriovNetSupport When set to &#34;simple&#34; (the default), enables enhanced networking
         * for created instances. No other value is supported at this time.
         * 
         * @return builder
         * 
         */
        public Builder sriovNetSupport(String sriovNetSupport) {
            return sriovNetSupport(Output.of(sriovNetSupport));
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder usageOperation(@Nullable Output<String> usageOperation) {
            $.usageOperation = usageOperation;
            return this;
        }

        public Builder usageOperation(String usageOperation) {
            return usageOperation(Output.of(usageOperation));
        }

        /**
         * @param virtualizationType Keyword to choose what virtualization mode created instances
         * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
         * changes the set of further arguments that are required, as described below.
         * 
         * @return builder
         * 
         */
        public Builder virtualizationType(@Nullable Output<String> virtualizationType) {
            $.virtualizationType = virtualizationType;
            return this;
        }

        /**
         * @param virtualizationType Keyword to choose what virtualization mode created instances
         * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
         * changes the set of further arguments that are required, as described below.
         * 
         * @return builder
         * 
         */
        public Builder virtualizationType(String virtualizationType) {
            return virtualizationType(Output.of(virtualizationType));
        }

        public AmiCopyState build() {
            return $;
        }
    }

}
