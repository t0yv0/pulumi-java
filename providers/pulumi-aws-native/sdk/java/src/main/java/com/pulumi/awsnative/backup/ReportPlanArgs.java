// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup;

import com.pulumi.awsnative.backup.inputs.ReportDeliveryChannelPropertiesArgs;
import com.pulumi.awsnative.backup.inputs.ReportPlanTagArgs;
import com.pulumi.awsnative.backup.inputs.ReportSettingPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportPlanArgs Empty = new ReportPlanArgs();

    /**
     * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    @Import(name="reportDeliveryChannel", required=true)
    private Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel;

    /**
     * @return A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    public Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel() {
        return this.reportDeliveryChannel;
    }

    /**
     * An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    @Import(name="reportPlanDescription")
    private @Nullable Output<String> reportPlanDescription;

    /**
     * @return An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    public Optional<Output<String>> reportPlanDescription() {
        return Optional.ofNullable(this.reportPlanDescription);
    }

    /**
     * The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @Import(name="reportPlanName")
    private @Nullable Output<String> reportPlanName;

    /**
     * @return The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    public Optional<Output<String>> reportPlanName() {
        return Optional.ofNullable(this.reportPlanName);
    }

    /**
     * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    @Import(name="reportPlanTags")
    private @Nullable Output<List<ReportPlanTagArgs>> reportPlanTags;

    /**
     * @return Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    public Optional<Output<List<ReportPlanTagArgs>>> reportPlanTags() {
        return Optional.ofNullable(this.reportPlanTags);
    }

    /**
     * Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    @Import(name="reportSetting", required=true)
    private Output<ReportSettingPropertiesArgs> reportSetting;

    /**
     * @return Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    public Output<ReportSettingPropertiesArgs> reportSetting() {
        return this.reportSetting;
    }

    private ReportPlanArgs() {}

    private ReportPlanArgs(ReportPlanArgs $) {
        this.reportDeliveryChannel = $.reportDeliveryChannel;
        this.reportPlanDescription = $.reportPlanDescription;
        this.reportPlanName = $.reportPlanName;
        this.reportPlanTags = $.reportPlanTags;
        this.reportSetting = $.reportSetting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportPlanArgs $;

        public Builder() {
            $ = new ReportPlanArgs();
        }

        public Builder(ReportPlanArgs defaults) {
            $ = new ReportPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportDeliveryChannel A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
         * 
         * @return builder
         * 
         */
        public Builder reportDeliveryChannel(Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel) {
            $.reportDeliveryChannel = reportDeliveryChannel;
            return this;
        }

        /**
         * @param reportDeliveryChannel A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
         * 
         * @return builder
         * 
         */
        public Builder reportDeliveryChannel(ReportDeliveryChannelPropertiesArgs reportDeliveryChannel) {
            return reportDeliveryChannel(Output.of(reportDeliveryChannel));
        }

        /**
         * @param reportPlanDescription An optional description of the report plan with a maximum of 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanDescription(@Nullable Output<String> reportPlanDescription) {
            $.reportPlanDescription = reportPlanDescription;
            return this;
        }

        /**
         * @param reportPlanDescription An optional description of the report plan with a maximum of 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanDescription(String reportPlanDescription) {
            return reportPlanDescription(Output.of(reportPlanDescription));
        }

        /**
         * @param reportPlanName The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder reportPlanName(@Nullable Output<String> reportPlanName) {
            $.reportPlanName = reportPlanName;
            return this;
        }

        /**
         * @param reportPlanName The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder reportPlanName(String reportPlanName) {
            return reportPlanName(Output.of(reportPlanName));
        }

        /**
         * @param reportPlanTags Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanTags(@Nullable Output<List<ReportPlanTagArgs>> reportPlanTags) {
            $.reportPlanTags = reportPlanTags;
            return this;
        }

        /**
         * @param reportPlanTags Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanTags(List<ReportPlanTagArgs> reportPlanTags) {
            return reportPlanTags(Output.of(reportPlanTags));
        }

        /**
         * @param reportPlanTags Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder reportPlanTags(ReportPlanTagArgs... reportPlanTags) {
            return reportPlanTags(List.of(reportPlanTags));
        }

        /**
         * @param reportSetting Identifies the report template for the report. Reports are built using a report template.
         * 
         * @return builder
         * 
         */
        public Builder reportSetting(Output<ReportSettingPropertiesArgs> reportSetting) {
            $.reportSetting = reportSetting;
            return this;
        }

        /**
         * @param reportSetting Identifies the report template for the report. Reports are built using a report template.
         * 
         * @return builder
         * 
         */
        public Builder reportSetting(ReportSettingPropertiesArgs reportSetting) {
            return reportSetting(Output.of(reportSetting));
        }

        public ReportPlanArgs build() {
            $.reportDeliveryChannel = Objects.requireNonNull($.reportDeliveryChannel, "expected parameter 'reportDeliveryChannel' to be non-null");
            $.reportSetting = Objects.requireNonNull($.reportSetting, "expected parameter 'reportSetting' to be non-null");
            return $;
        }
    }

}
