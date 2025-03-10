// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountQueuePropertiesMinuteMetrics {
    /**
     * @return Indicates whether minute metrics are enabled for the Queue service. Changing this forces a new resource.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Indicates whether metrics should generate summary statistics for called API operations.
     * 
     */
    private final @Nullable Boolean includeApis;
    /**
     * @return Specifies the number of days that logs will be retained. Changing this forces a new resource.
     * 
     */
    private final @Nullable Integer retentionPolicyDays;
    /**
     * @return The version of storage analytics to configure. Changing this forces a new resource.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private AccountQueuePropertiesMinuteMetrics(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("includeApis") @Nullable Boolean includeApis,
        @CustomType.Parameter("retentionPolicyDays") @Nullable Integer retentionPolicyDays,
        @CustomType.Parameter("version") String version) {
        this.enabled = enabled;
        this.includeApis = includeApis;
        this.retentionPolicyDays = retentionPolicyDays;
        this.version = version;
    }

    /**
     * @return Indicates whether minute metrics are enabled for the Queue service. Changing this forces a new resource.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Indicates whether metrics should generate summary statistics for called API operations.
     * 
     */
    public Optional<Boolean> includeApis() {
        return Optional.ofNullable(this.includeApis);
    }
    /**
     * @return Specifies the number of days that logs will be retained. Changing this forces a new resource.
     * 
     */
    public Optional<Integer> retentionPolicyDays() {
        return Optional.ofNullable(this.retentionPolicyDays);
    }
    /**
     * @return The version of storage analytics to configure. Changing this forces a new resource.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountQueuePropertiesMinuteMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable Boolean includeApis;
        private @Nullable Integer retentionPolicyDays;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountQueuePropertiesMinuteMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.includeApis = defaults.includeApis;
    	      this.retentionPolicyDays = defaults.retentionPolicyDays;
    	      this.version = defaults.version;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder includeApis(@Nullable Boolean includeApis) {
            this.includeApis = includeApis;
            return this;
        }
        public Builder retentionPolicyDays(@Nullable Integer retentionPolicyDays) {
            this.retentionPolicyDays = retentionPolicyDays;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public AccountQueuePropertiesMinuteMetrics build() {
            return new AccountQueuePropertiesMinuteMetrics(enabled, includeApis, retentionPolicyDays, version);
        }
    }
}
