// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationFsxLustreState extends com.pulumi.resources.ResourceArgs {

    public static final LocationFsxLustreState Empty = new LocationFsxLustreState();

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time that the FSx for Lustre location was created.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time that the FSx for Lustre location was created.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * 
     */
    @Import(name="fsxFilesystemArn")
    private @Nullable Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * 
     */
    public Optional<Output<String>> fsxFilesystemArn() {
        return Optional.ofNullable(this.fsxFilesystemArn);
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
     * 
     */
    @Import(name="securityGroupArns")
    private @Nullable Output<List<String>> securityGroupArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
     * 
     */
    public Optional<Output<List<String>>> securityGroupArns() {
        return Optional.ofNullable(this.securityGroupArns);
    }

    /**
     * Subdirectory to perform actions as source or destination.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The URL of the FSx for Lustre location that was described.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The URL of the FSx for Lustre location that was described.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private LocationFsxLustreState() {}

    private LocationFsxLustreState(LocationFsxLustreState $) {
        this.arn = $.arn;
        this.creationTime = $.creationTime;
        this.fsxFilesystemArn = $.fsxFilesystemArn;
        this.securityGroupArns = $.securityGroupArns;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationFsxLustreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationFsxLustreState $;

        public Builder() {
            $ = new LocationFsxLustreState();
        }

        public Builder(LocationFsxLustreState defaults) {
            $ = new LocationFsxLustreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param creationTime The time that the FSx for Lustre location was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time that the FSx for Lustre location was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Lustre file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(@Nullable Output<String> fsxFilesystemArn) {
            $.fsxFilesystemArn = fsxFilesystemArn;
            return this;
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Lustre file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(String fsxFilesystemArn) {
            return fsxFilesystemArn(Output.of(fsxFilesystemArn));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(@Nullable Output<List<String>> securityGroupArns) {
            $.securityGroupArns = securityGroupArns;
            return this;
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(List<String> securityGroupArns) {
            return securityGroupArns(Output.of(securityGroupArns));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param uri The URL of the FSx for Lustre location that was described.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URL of the FSx for Lustre location that was described.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public LocationFsxLustreState build() {
            return $;
        }
    }

}
