// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.EnableStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Notification settings for a schedule.
 * 
 */
public final class NotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationSettingsArgs Empty = new NotificationSettingsArgs();

    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    @Import(name="emailRecipient")
    private @Nullable Output<String> emailRecipient;

    /**
     * @return The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    public Optional<Output<String>> emailRecipient() {
        return Optional.ofNullable(this.emailRecipient);
    }

    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    @Import(name="notificationLocale")
    private @Nullable Output<String> notificationLocale;

    /**
     * @return The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    public Optional<Output<String>> notificationLocale() {
        return Optional.ofNullable(this.notificationLocale);
    }

    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,EnableStatus>> status;

    /**
     * @return If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * 
     */
    public Optional<Output<Either<String,EnableStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Time in minutes before event at which notification will be sent.
     * 
     */
    @Import(name="timeInMinutes")
    private @Nullable Output<Integer> timeInMinutes;

    /**
     * @return Time in minutes before event at which notification will be sent.
     * 
     */
    public Optional<Output<Integer>> timeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }

    /**
     * The webhook URL to which the notification will be sent.
     * 
     */
    @Import(name="webhookUrl")
    private @Nullable Output<String> webhookUrl;

    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    public Optional<Output<String>> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    private NotificationSettingsArgs() {}

    private NotificationSettingsArgs(NotificationSettingsArgs $) {
        this.emailRecipient = $.emailRecipient;
        this.notificationLocale = $.notificationLocale;
        this.status = $.status;
        this.timeInMinutes = $.timeInMinutes;
        this.webhookUrl = $.webhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationSettingsArgs $;

        public Builder() {
            $ = new NotificationSettingsArgs();
        }

        public Builder(NotificationSettingsArgs defaults) {
            $ = new NotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailRecipient The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
         * 
         * @return builder
         * 
         */
        public Builder emailRecipient(@Nullable Output<String> emailRecipient) {
            $.emailRecipient = emailRecipient;
            return this;
        }

        /**
         * @param emailRecipient The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
         * 
         * @return builder
         * 
         */
        public Builder emailRecipient(String emailRecipient) {
            return emailRecipient(Output.of(emailRecipient));
        }

        /**
         * @param notificationLocale The locale to use when sending a notification (fallback for unsupported languages is EN).
         * 
         * @return builder
         * 
         */
        public Builder notificationLocale(@Nullable Output<String> notificationLocale) {
            $.notificationLocale = notificationLocale;
            return this;
        }

        /**
         * @param notificationLocale The locale to use when sending a notification (fallback for unsupported languages is EN).
         * 
         * @return builder
         * 
         */
        public Builder notificationLocale(String notificationLocale) {
            return notificationLocale(Output.of(notificationLocale));
        }

        /**
         * @param status If notifications are enabled for this schedule (i.e. Enabled, Disabled).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,EnableStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status If notifications are enabled for this schedule (i.e. Enabled, Disabled).
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,EnableStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status If notifications are enabled for this schedule (i.e. Enabled, Disabled).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status If notifications are enabled for this schedule (i.e. Enabled, Disabled).
         * 
         * @return builder
         * 
         */
        public Builder status(EnableStatus status) {
            return status(Either.ofRight(status));
        }

        /**
         * @param timeInMinutes Time in minutes before event at which notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder timeInMinutes(@Nullable Output<Integer> timeInMinutes) {
            $.timeInMinutes = timeInMinutes;
            return this;
        }

        /**
         * @param timeInMinutes Time in minutes before event at which notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder timeInMinutes(Integer timeInMinutes) {
            return timeInMinutes(Output.of(timeInMinutes));
        }

        /**
         * @param webhookUrl The webhook URL to which the notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(@Nullable Output<String> webhookUrl) {
            $.webhookUrl = webhookUrl;
            return this;
        }

        /**
         * @param webhookUrl The webhook URL to which the notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(String webhookUrl) {
            return webhookUrl(Output.of(webhookUrl));
        }

        public NotificationSettingsArgs build() {
            $.status = Codegen.stringProp("status").left(EnableStatus.class).output().arg($.status).def("Disabled").getNullable();
            return $;
        }
    }

}
