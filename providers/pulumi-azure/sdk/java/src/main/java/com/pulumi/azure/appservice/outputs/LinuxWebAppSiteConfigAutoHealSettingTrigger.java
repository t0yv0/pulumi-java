// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteConfigAutoHealSettingTriggerRequests;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSiteConfigAutoHealSettingTrigger {
    /**
     * @return A `requests` block as defined above.
     * 
     */
    private final @Nullable LinuxWebAppSiteConfigAutoHealSettingTriggerRequests requests;
    /**
     * @return One or more `slow_request` blocks as defined above.
     * 
     */
    private final @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests;
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    private final @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

    @CustomType.Constructor
    private LinuxWebAppSiteConfigAutoHealSettingTrigger(
        @CustomType.Parameter("requests") @Nullable LinuxWebAppSiteConfigAutoHealSettingTriggerRequests requests,
        @CustomType.Parameter("slowRequests") @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests,
        @CustomType.Parameter("statusCodes") @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {
        this.requests = requests;
        this.slowRequests = slowRequests;
        this.statusCodes = statusCodes;
    }

    /**
     * @return A `requests` block as defined above.
     * 
     */
    public Optional<LinuxWebAppSiteConfigAutoHealSettingTriggerRequests> requests() {
        return Optional.ofNullable(this.requests);
    }
    /**
     * @return One or more `slow_request` blocks as defined above.
     * 
     */
    public List<LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests() {
        return this.slowRequests == null ? List.of() : this.slowRequests;
    }
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    public List<LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSiteConfigAutoHealSettingTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxWebAppSiteConfigAutoHealSettingTriggerRequests requests;
        private @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests;
        private @Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppSiteConfigAutoHealSettingTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder requests(@Nullable LinuxWebAppSiteConfigAutoHealSettingTriggerRequests requests) {
            this.requests = requests;
            return this;
        }
        public Builder slowRequests(@Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests) {
            this.slowRequests = slowRequests;
            return this;
        }
        public Builder slowRequests(LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest... slowRequests) {
            return slowRequests(List.of(slowRequests));
        }
        public Builder statusCodes(@Nullable List<LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCode... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }        public LinuxWebAppSiteConfigAutoHealSettingTrigger build() {
            return new LinuxWebAppSiteConfigAutoHealSettingTrigger(requests, slowRequests, statusCodes);
        }
    }
}
