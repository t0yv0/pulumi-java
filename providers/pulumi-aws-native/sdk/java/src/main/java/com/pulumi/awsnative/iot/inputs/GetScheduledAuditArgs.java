// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledAuditArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledAuditArgs Empty = new GetScheduledAuditArgs();

    /**
     * The name you want to give to the scheduled audit.
     * 
     */
    @Import(name="scheduledAuditName", required=true)
    private String scheduledAuditName;

    /**
     * @return The name you want to give to the scheduled audit.
     * 
     */
    public String scheduledAuditName() {
        return this.scheduledAuditName;
    }

    private GetScheduledAuditArgs() {}

    private GetScheduledAuditArgs(GetScheduledAuditArgs $) {
        this.scheduledAuditName = $.scheduledAuditName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledAuditArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledAuditArgs $;

        public Builder() {
            $ = new GetScheduledAuditArgs();
        }

        public Builder(GetScheduledAuditArgs defaults) {
            $ = new GetScheduledAuditArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduledAuditName The name you want to give to the scheduled audit.
         * 
         * @return builder
         * 
         */
        public Builder scheduledAuditName(String scheduledAuditName) {
            $.scheduledAuditName = scheduledAuditName;
            return this;
        }

        public GetScheduledAuditArgs build() {
            $.scheduledAuditName = Objects.requireNonNull($.scheduledAuditName, "expected parameter 'scheduledAuditName' to be non-null");
            return $;
        }
    }

}
