// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCompositeAlarmArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCompositeAlarmArgs Empty = new GetCompositeAlarmArgs();

    /**
     * The name of the Composite Alarm
     * 
     */
    @Import(name="alarmName", required=true)
    private String alarmName;

    /**
     * @return The name of the Composite Alarm
     * 
     */
    public String alarmName() {
        return this.alarmName;
    }

    private GetCompositeAlarmArgs() {}

    private GetCompositeAlarmArgs(GetCompositeAlarmArgs $) {
        this.alarmName = $.alarmName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCompositeAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCompositeAlarmArgs $;

        public Builder() {
            $ = new GetCompositeAlarmArgs();
        }

        public Builder(GetCompositeAlarmArgs defaults) {
            $ = new GetCompositeAlarmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alarmName The name of the Composite Alarm
         * 
         * @return builder
         * 
         */
        public Builder alarmName(String alarmName) {
            $.alarmName = alarmName;
            return this;
        }

        public GetCompositeAlarmArgs build() {
            $.alarmName = Objects.requireNonNull($.alarmName, "expected parameter 'alarmName' to be non-null");
            return $;
        }
    }

}
