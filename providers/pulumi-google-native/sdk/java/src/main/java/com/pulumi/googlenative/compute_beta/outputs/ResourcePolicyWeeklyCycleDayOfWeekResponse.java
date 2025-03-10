// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyWeeklyCycleDayOfWeekResponse {
    /**
     * @return Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    private final String day;
    /**
     * @return [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    private final String duration;
    /**
     * @return Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private ResourcePolicyWeeklyCycleDayOfWeekResponse(
        @CustomType.Parameter("day") String day,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("startTime") String startTime) {
        this.day = day;
        this.duration = duration;
        this.startTime = startTime;
    }

    /**
     * @return Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public ResourcePolicyWeeklyCycleDayOfWeekResponse build() {
            return new ResourcePolicyWeeklyCycleDayOfWeekResponse(day, duration, startTime);
        }
    }
}
