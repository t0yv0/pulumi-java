// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppLogHttpLogFileSystem {
    /**
     * @return The retention period in days.
     * 
     */
    private final Integer retentionInDays;
    /**
     * @return The maximum size in megabytes that log files can use.
     * 
     */
    private final Integer retentionInMb;

    @CustomType.Constructor
    private GetWindowsWebAppLogHttpLogFileSystem(
        @CustomType.Parameter("retentionInDays") Integer retentionInDays,
        @CustomType.Parameter("retentionInMb") Integer retentionInMb) {
        this.retentionInDays = retentionInDays;
        this.retentionInMb = retentionInMb;
    }

    /**
     * @return The retention period in days.
     * 
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * @return The maximum size in megabytes that log files can use.
     * 
     */
    public Integer retentionInMb() {
        return this.retentionInMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppLogHttpLogFileSystem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retentionInDays;
        private Integer retentionInMb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppLogHttpLogFileSystem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.retentionInMb = defaults.retentionInMb;
        }

        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = Objects.requireNonNull(retentionInDays);
            return this;
        }
        public Builder retentionInMb(Integer retentionInMb) {
            this.retentionInMb = Objects.requireNonNull(retentionInMb);
            return this;
        }        public GetWindowsWebAppLogHttpLogFileSystem build() {
            return new GetWindowsWebAppLogHttpLogFileSystem(retentionInDays, retentionInMb);
        }
    }
}
