// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LinuxWebAppLogsHttpLogsFileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppLogsHttpLogsFileSystemArgs Empty = new LinuxWebAppLogsHttpLogsFileSystemArgs();

    /**
     * The retention period in days. A values of `0` means no retention.
     * 
     */
    @Import(name="retentionInDays", required=true)
    private Output<Integer> retentionInDays;

    /**
     * @return The retention period in days. A values of `0` means no retention.
     * 
     */
    public Output<Integer> retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * The maximum size in megabytes that log files can use.
     * 
     */
    @Import(name="retentionInMb", required=true)
    private Output<Integer> retentionInMb;

    /**
     * @return The maximum size in megabytes that log files can use.
     * 
     */
    public Output<Integer> retentionInMb() {
        return this.retentionInMb;
    }

    private LinuxWebAppLogsHttpLogsFileSystemArgs() {}

    private LinuxWebAppLogsHttpLogsFileSystemArgs(LinuxWebAppLogsHttpLogsFileSystemArgs $) {
        this.retentionInDays = $.retentionInDays;
        this.retentionInMb = $.retentionInMb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppLogsHttpLogsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppLogsHttpLogsFileSystemArgs $;

        public Builder() {
            $ = new LinuxWebAppLogsHttpLogsFileSystemArgs();
        }

        public Builder(LinuxWebAppLogsHttpLogsFileSystemArgs defaults) {
            $ = new LinuxWebAppLogsHttpLogsFileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionInDays The retention period in days. A values of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays The retention period in days. A values of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param retentionInMb The maximum size in megabytes that log files can use.
         * 
         * @return builder
         * 
         */
        public Builder retentionInMb(Output<Integer> retentionInMb) {
            $.retentionInMb = retentionInMb;
            return this;
        }

        /**
         * @param retentionInMb The maximum size in megabytes that log files can use.
         * 
         * @return builder
         * 
         */
        public Builder retentionInMb(Integer retentionInMb) {
            return retentionInMb(Output.of(retentionInMb));
        }

        public LinuxWebAppLogsHttpLogsFileSystemArgs build() {
            $.retentionInDays = Objects.requireNonNull($.retentionInDays, "expected parameter 'retentionInDays' to be non-null");
            $.retentionInMb = Objects.requireNonNull($.retentionInMb, "expected parameter 'retentionInMb' to be non-null");
            return $;
        }
    }

}
