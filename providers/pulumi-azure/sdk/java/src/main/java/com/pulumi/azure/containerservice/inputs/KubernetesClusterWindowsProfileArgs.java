// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterWindowsProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterWindowsProfileArgs Empty = new KubernetesClusterWindowsProfileArgs();

    /**
     * The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
     * 
     */
    @Import(name="adminPassword")
    private @Nullable Output<String> adminPassword;

    /**
     * @return The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
     * 
     */
    public Optional<Output<String>> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }

    /**
     * The Admin Username for Windows VMs.
     * 
     */
    @Import(name="adminUsername", required=true)
    private Output<String> adminUsername;

    /**
     * @return The Admin Username for Windows VMs.
     * 
     */
    public Output<String> adminUsername() {
        return this.adminUsername;
    }

    /**
     * Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
     * 
     */
    @Import(name="license")
    private @Nullable Output<String> license;

    /**
     * @return Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
     * 
     */
    public Optional<Output<String>> license() {
        return Optional.ofNullable(this.license);
    }

    private KubernetesClusterWindowsProfileArgs() {}

    private KubernetesClusterWindowsProfileArgs(KubernetesClusterWindowsProfileArgs $) {
        this.adminPassword = $.adminPassword;
        this.adminUsername = $.adminUsername;
        this.license = $.license;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterWindowsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterWindowsProfileArgs $;

        public Builder() {
            $ = new KubernetesClusterWindowsProfileArgs();
        }

        public Builder(KubernetesClusterWindowsProfileArgs defaults) {
            $ = new KubernetesClusterWindowsProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminPassword The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param adminUsername The Admin Username for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(Output<String> adminUsername) {
            $.adminUsername = adminUsername;
            return this;
        }

        /**
         * @param adminUsername The Admin Username for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(String adminUsername) {
            return adminUsername(Output.of(adminUsername));
        }

        /**
         * @param license Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
         * 
         * @return builder
         * 
         */
        public Builder license(@Nullable Output<String> license) {
            $.license = license;
            return this;
        }

        /**
         * @param license Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
         * 
         * @return builder
         * 
         */
        public Builder license(String license) {
            return license(Output.of(license));
        }

        public KubernetesClusterWindowsProfileArgs build() {
            $.adminUsername = Objects.requireNonNull($.adminUsername, "expected parameter 'adminUsername' to be non-null");
            return $;
        }
    }

}
