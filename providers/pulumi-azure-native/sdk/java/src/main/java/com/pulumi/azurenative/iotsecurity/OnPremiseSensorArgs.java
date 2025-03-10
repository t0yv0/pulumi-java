// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.iotsecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnPremiseSensorArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnPremiseSensorArgs Empty = new OnPremiseSensorArgs();

    /**
     * Name of the on-premise IoT sensor
     * 
     */
    @Import(name="onPremiseSensorName")
    private @Nullable Output<String> onPremiseSensorName;

    /**
     * @return Name of the on-premise IoT sensor
     * 
     */
    public Optional<Output<String>> onPremiseSensorName() {
        return Optional.ofNullable(this.onPremiseSensorName);
    }

    private OnPremiseSensorArgs() {}

    private OnPremiseSensorArgs(OnPremiseSensorArgs $) {
        this.onPremiseSensorName = $.onPremiseSensorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnPremiseSensorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnPremiseSensorArgs $;

        public Builder() {
            $ = new OnPremiseSensorArgs();
        }

        public Builder(OnPremiseSensorArgs defaults) {
            $ = new OnPremiseSensorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onPremiseSensorName Name of the on-premise IoT sensor
         * 
         * @return builder
         * 
         */
        public Builder onPremiseSensorName(@Nullable Output<String> onPremiseSensorName) {
            $.onPremiseSensorName = onPremiseSensorName;
            return this;
        }

        /**
         * @param onPremiseSensorName Name of the on-premise IoT sensor
         * 
         * @return builder
         * 
         */
        public Builder onPremiseSensorName(String onPremiseSensorName) {
            return onPremiseSensorName(Output.of(onPremiseSensorName));
        }

        public OnPremiseSensorArgs build() {
            return $;
        }
    }

}
