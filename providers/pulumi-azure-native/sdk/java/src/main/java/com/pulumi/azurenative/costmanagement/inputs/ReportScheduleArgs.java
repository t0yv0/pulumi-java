// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.RecurrenceType;
import com.pulumi.azurenative.costmanagement.enums.StatusType;
import com.pulumi.azurenative.costmanagement.inputs.ReportRecurrencePeriodArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule associated with a report.
 * 
 */
public final class ReportScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportScheduleArgs Empty = new ReportScheduleArgs();

    /**
     * The schedule recurrence.
     * 
     */
    @Import(name="recurrence", required=true)
    private Output<Either<String,RecurrenceType>> recurrence;

    /**
     * @return The schedule recurrence.
     * 
     */
    public Output<Either<String,RecurrenceType>> recurrence() {
        return this.recurrence;
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @Import(name="recurrencePeriod")
    private @Nullable Output<ReportRecurrencePeriodArgs> recurrencePeriod;

    /**
     * @return Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    public Optional<Output<ReportRecurrencePeriodArgs>> recurrencePeriod() {
        return Optional.ofNullable(this.recurrencePeriod);
    }

    /**
     * The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,StatusType>> status;

    /**
     * @return The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
     * 
     */
    public Optional<Output<Either<String,StatusType>>> status() {
        return Optional.ofNullable(this.status);
    }

    private ReportScheduleArgs() {}

    private ReportScheduleArgs(ReportScheduleArgs $) {
        this.recurrence = $.recurrence;
        this.recurrencePeriod = $.recurrencePeriod;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportScheduleArgs $;

        public Builder() {
            $ = new ReportScheduleArgs();
        }

        public Builder(ReportScheduleArgs defaults) {
            $ = new ReportScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(Output<Either<String,RecurrenceType>> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(Either<String,RecurrenceType> recurrence) {
            return recurrence(Output.of(recurrence));
        }

        /**
         * @param recurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(String recurrence) {
            return recurrence(Either.ofLeft(recurrence));
        }

        /**
         * @param recurrence The schedule recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(RecurrenceType recurrence) {
            return recurrence(Either.ofRight(recurrence));
        }

        /**
         * @param recurrencePeriod Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
         * 
         * @return builder
         * 
         */
        public Builder recurrencePeriod(@Nullable Output<ReportRecurrencePeriodArgs> recurrencePeriod) {
            $.recurrencePeriod = recurrencePeriod;
            return this;
        }

        /**
         * @param recurrencePeriod Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
         * 
         * @return builder
         * 
         */
        public Builder recurrencePeriod(ReportRecurrencePeriodArgs recurrencePeriod) {
            return recurrencePeriod(Output.of(recurrencePeriod));
        }

        /**
         * @param status The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,StatusType>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,StatusType> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
         * 
         * @return builder
         * 
         */
        public Builder status(StatusType status) {
            return status(Either.ofRight(status));
        }

        public ReportScheduleArgs build() {
            $.recurrence = Objects.requireNonNull($.recurrence, "expected parameter 'recurrence' to be non-null");
            return $;
        }
    }

}
