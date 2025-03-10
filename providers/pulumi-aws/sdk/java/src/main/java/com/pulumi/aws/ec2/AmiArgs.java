// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs;
import com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiArgs Empty = new AmiArgs();

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
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
    private @Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices;

    /**
     * @return Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiEbsBlockDeviceArgs>>> ebsBlockDevices() {
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
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
    private @Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    /**
     * @return Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiEphemeralBlockDeviceArgs>>> ephemeralBlockDevices() {
        return Optional.ofNullable(this.ephemeralBlockDevices);
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

    private AmiArgs() {}

    private AmiArgs(AmiArgs $) {
        this.architecture = $.architecture;
        this.bootMode = $.bootMode;
        this.description = $.description;
        this.ebsBlockDevices = $.ebsBlockDevices;
        this.enaSupport = $.enaSupport;
        this.ephemeralBlockDevices = $.ephemeralBlockDevices;
        this.imageLocation = $.imageLocation;
        this.kernelId = $.kernelId;
        this.name = $.name;
        this.ramdiskId = $.ramdiskId;
        this.rootDeviceName = $.rootDeviceName;
        this.sriovNetSupport = $.sriovNetSupport;
        this.tags = $.tags;
        this.virtualizationType = $.virtualizationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiArgs $;

        public Builder() {
            $ = new AmiArgs();
        }

        public Builder(AmiArgs defaults) {
            $ = new AmiArgs(Objects.requireNonNull(defaults));
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
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(@Nullable Output<List<AmiEbsBlockDeviceArgs>> ebsBlockDevices) {
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
        public Builder ebsBlockDevices(List<AmiEbsBlockDeviceArgs> ebsBlockDevices) {
            return ebsBlockDevices(Output.of(ebsBlockDevices));
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(AmiEbsBlockDeviceArgs... ebsBlockDevices) {
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
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
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
        public Builder ephemeralBlockDevices(List<AmiEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            return ephemeralBlockDevices(Output.of(ephemeralBlockDevices));
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(AmiEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
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

        public AmiArgs build() {
            return $;
        }
    }

}
