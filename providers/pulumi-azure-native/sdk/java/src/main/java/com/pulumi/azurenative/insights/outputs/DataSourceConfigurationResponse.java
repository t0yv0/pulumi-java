// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.EtwProviderConfigurationResponse;
import com.pulumi.azurenative.insights.outputs.EventLogConfigurationResponse;
import com.pulumi.azurenative.insights.outputs.PerformanceCounterConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceConfigurationResponse {
    /**
     * @return Windows event logs configuration.
     * 
     */
    private final @Nullable List<EventLogConfigurationResponse> eventLogs;
    /**
     * @return Performance counter configuration
     * 
     */
    private final @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;
    /**
     * @return ETW providers configuration
     * 
     */
    private final @Nullable List<EtwProviderConfigurationResponse> providers;

    @CustomType.Constructor
    private DataSourceConfigurationResponse(
        @CustomType.Parameter("eventLogs") @Nullable List<EventLogConfigurationResponse> eventLogs,
        @CustomType.Parameter("perfCounters") @Nullable List<PerformanceCounterConfigurationResponse> perfCounters,
        @CustomType.Parameter("providers") @Nullable List<EtwProviderConfigurationResponse> providers) {
        this.eventLogs = eventLogs;
        this.perfCounters = perfCounters;
        this.providers = providers;
    }

    /**
     * @return Windows event logs configuration.
     * 
     */
    public List<EventLogConfigurationResponse> eventLogs() {
        return this.eventLogs == null ? List.of() : this.eventLogs;
    }
    /**
     * @return Performance counter configuration
     * 
     */
    public List<PerformanceCounterConfigurationResponse> perfCounters() {
        return this.perfCounters == null ? List.of() : this.perfCounters;
    }
    /**
     * @return ETW providers configuration
     * 
     */
    public List<EtwProviderConfigurationResponse> providers() {
        return this.providers == null ? List.of() : this.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventLogConfigurationResponse> eventLogs;
        private @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;
        private @Nullable List<EtwProviderConfigurationResponse> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLogs = defaults.eventLogs;
    	      this.perfCounters = defaults.perfCounters;
    	      this.providers = defaults.providers;
        }

        public Builder eventLogs(@Nullable List<EventLogConfigurationResponse> eventLogs) {
            this.eventLogs = eventLogs;
            return this;
        }
        public Builder eventLogs(EventLogConfigurationResponse... eventLogs) {
            return eventLogs(List.of(eventLogs));
        }
        public Builder perfCounters(@Nullable List<PerformanceCounterConfigurationResponse> perfCounters) {
            this.perfCounters = perfCounters;
            return this;
        }
        public Builder perfCounters(PerformanceCounterConfigurationResponse... perfCounters) {
            return perfCounters(List.of(perfCounters));
        }
        public Builder providers(@Nullable List<EtwProviderConfigurationResponse> providers) {
            this.providers = providers;
            return this;
        }
        public Builder providers(EtwProviderConfigurationResponse... providers) {
            return providers(List.of(providers));
        }        public DataSourceConfigurationResponse build() {
            return new DataSourceConfigurationResponse(eventLogs, perfCounters, providers);
        }
    }
}
