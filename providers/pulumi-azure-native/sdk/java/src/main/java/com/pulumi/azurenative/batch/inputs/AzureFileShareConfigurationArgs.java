// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFileShareConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFileShareConfigurationArgs Empty = new AzureFileShareConfigurationArgs();

    @Import(name="accountKey", required=true)
    private Output<String> accountKey;

    public Output<String> accountKey() {
        return this.accountKey;
    }

    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * This is of the form &#39;https://{account}.file.core.windows.net/&#39;.
     * 
     */
    @Import(name="azureFileUrl", required=true)
    private Output<String> azureFileUrl;

    /**
     * @return This is of the form &#39;https://{account}.file.core.windows.net/&#39;.
     * 
     */
    public Output<String> azureFileUrl() {
        return this.azureFileUrl;
    }

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    /**
     * @return These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private Output<String> relativeMountPath;

    /**
     * @return All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    private AzureFileShareConfigurationArgs() {}

    private AzureFileShareConfigurationArgs(AzureFileShareConfigurationArgs $) {
        this.accountKey = $.accountKey;
        this.accountName = $.accountName;
        this.azureFileUrl = $.azureFileUrl;
        this.mountOptions = $.mountOptions;
        this.relativeMountPath = $.relativeMountPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFileShareConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFileShareConfigurationArgs $;

        public Builder() {
            $ = new AzureFileShareConfigurationArgs();
        }

        public Builder(AzureFileShareConfigurationArgs defaults) {
            $ = new AzureFileShareConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountKey(Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param azureFileUrl This is of the form &#39;https://{account}.file.core.windows.net/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder azureFileUrl(Output<String> azureFileUrl) {
            $.azureFileUrl = azureFileUrl;
            return this;
        }

        /**
         * @param azureFileUrl This is of the form &#39;https://{account}.file.core.windows.net/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder azureFileUrl(String azureFileUrl) {
            return azureFileUrl(Output.of(azureFileUrl));
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(String relativeMountPath) {
            return relativeMountPath(Output.of(relativeMountPath));
        }

        public AzureFileShareConfigurationArgs build() {
            $.accountKey = Objects.requireNonNull($.accountKey, "expected parameter 'accountKey' to be non-null");
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.azureFileUrl = Objects.requireNonNull($.azureFileUrl, "expected parameter 'azureFileUrl' to be non-null");
            $.relativeMountPath = Objects.requireNonNull($.relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
            return $;
        }
    }

}
