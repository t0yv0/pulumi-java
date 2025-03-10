// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the offset information for the local timestamp format specified. Should not be specified for LocalTimestampFormat - Embedded.
 * 
 */
public final class LocalTimestampTimeZoneOffsetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalTimestampTimeZoneOffsetArgs Empty = new LocalTimestampTimeZoneOffsetArgs();

    /**
     * The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
     */
    @Import(name="propertyName")
    private @Nullable Output<String> propertyName;

    /**
     * @return The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
     */
    public Optional<Output<String>> propertyName() {
        return Optional.ofNullable(this.propertyName);
    }

    private LocalTimestampTimeZoneOffsetArgs() {}

    private LocalTimestampTimeZoneOffsetArgs(LocalTimestampTimeZoneOffsetArgs $) {
        this.propertyName = $.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalTimestampTimeZoneOffsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalTimestampTimeZoneOffsetArgs $;

        public Builder() {
            $ = new LocalTimestampTimeZoneOffsetArgs();
        }

        public Builder(LocalTimestampTimeZoneOffsetArgs defaults) {
            $ = new LocalTimestampTimeZoneOffsetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param propertyName The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
         * 
         * @return builder
         * 
         */
        public Builder propertyName(@Nullable Output<String> propertyName) {
            $.propertyName = propertyName;
            return this;
        }

        /**
         * @param propertyName The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
         * 
         * @return builder
         * 
         */
        public Builder propertyName(String propertyName) {
            return propertyName(Output.of(propertyName));
        }

        public LocalTimestampTimeZoneOffsetArgs build() {
            return $;
        }
    }

}
