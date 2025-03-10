// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.azurenative.hybridnetwork.inputs.SshConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the Linux operating system settings on the virtual machine.
 * 
 */
public final class LinuxConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxConfigurationArgs Empty = new LinuxConfigurationArgs();

    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    @Import(name="ssh")
    private @Nullable Output<SshConfigurationArgs> ssh;

    /**
     * @return Specifies the ssh key configuration for a Linux OS.
     * 
     */
    public Optional<Output<SshConfigurationArgs>> ssh() {
        return Optional.ofNullable(this.ssh);
    }

    private LinuxConfigurationArgs() {}

    private LinuxConfigurationArgs(LinuxConfigurationArgs $) {
        this.ssh = $.ssh;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxConfigurationArgs $;

        public Builder() {
            $ = new LinuxConfigurationArgs();
        }

        public Builder(LinuxConfigurationArgs defaults) {
            $ = new LinuxConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ssh Specifies the ssh key configuration for a Linux OS.
         * 
         * @return builder
         * 
         */
        public Builder ssh(@Nullable Output<SshConfigurationArgs> ssh) {
            $.ssh = ssh;
            return this;
        }

        /**
         * @param ssh Specifies the ssh key configuration for a Linux OS.
         * 
         * @return builder
         * 
         */
        public Builder ssh(SshConfigurationArgs ssh) {
            return ssh(Output.of(ssh));
        }

        public LinuxConfigurationArgs build() {
            return $;
        }
    }

}
