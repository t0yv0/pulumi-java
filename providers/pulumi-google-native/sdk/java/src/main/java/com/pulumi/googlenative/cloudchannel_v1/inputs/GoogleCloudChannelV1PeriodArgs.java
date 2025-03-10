// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudchannel_v1.enums.GoogleCloudChannelV1PeriodPeriodType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents period in days/months/years.
 * 
 */
public final class GoogleCloudChannelV1PeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1PeriodArgs Empty = new GoogleCloudChannelV1PeriodArgs();

    /**
     * Total duration of Period Type defined.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return Total duration of Period Type defined.
     * 
     */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Period Type.
     * 
     */
    @Import(name="periodType")
    private @Nullable Output<GoogleCloudChannelV1PeriodPeriodType> periodType;

    /**
     * @return Period Type.
     * 
     */
    public Optional<Output<GoogleCloudChannelV1PeriodPeriodType>> periodType() {
        return Optional.ofNullable(this.periodType);
    }

    private GoogleCloudChannelV1PeriodArgs() {}

    private GoogleCloudChannelV1PeriodArgs(GoogleCloudChannelV1PeriodArgs $) {
        this.duration = $.duration;
        this.periodType = $.periodType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudChannelV1PeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1PeriodArgs $;

        public Builder() {
            $ = new GoogleCloudChannelV1PeriodArgs();
        }

        public Builder(GoogleCloudChannelV1PeriodArgs defaults) {
            $ = new GoogleCloudChannelV1PeriodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Total duration of Period Type defined.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Total duration of Period Type defined.
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param periodType Period Type.
         * 
         * @return builder
         * 
         */
        public Builder periodType(@Nullable Output<GoogleCloudChannelV1PeriodPeriodType> periodType) {
            $.periodType = periodType;
            return this;
        }

        /**
         * @param periodType Period Type.
         * 
         * @return builder
         * 
         */
        public Builder periodType(GoogleCloudChannelV1PeriodPeriodType periodType) {
            return periodType(Output.of(periodType));
        }

        public GoogleCloudChannelV1PeriodArgs build() {
            return $;
        }
    }

}
