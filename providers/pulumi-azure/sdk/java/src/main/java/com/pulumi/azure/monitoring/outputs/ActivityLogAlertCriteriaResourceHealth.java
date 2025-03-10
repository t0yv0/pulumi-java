// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ActivityLogAlertCriteriaResourceHealth {
    /**
     * @return The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    private final @Nullable List<String> currents;
    /**
     * @return The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    private final @Nullable List<String> previouses;
    /**
     * @return The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
     * 
     */
    private final @Nullable List<String> reasons;

    @CustomType.Constructor
    private ActivityLogAlertCriteriaResourceHealth(
        @CustomType.Parameter("currents") @Nullable List<String> currents,
        @CustomType.Parameter("previouses") @Nullable List<String> previouses,
        @CustomType.Parameter("reasons") @Nullable List<String> reasons) {
        this.currents = currents;
        this.previouses = previouses;
        this.reasons = reasons;
    }

    /**
     * @return The current resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    public List<String> currents() {
        return this.currents == null ? List.of() : this.currents;
    }
    /**
     * @return The previous resource health statuses that will log an alert. Possible values are `Available`, `Degraded`, `Unavailable` and `Unknown`.
     * 
     */
    public List<String> previouses() {
        return this.previouses == null ? List.of() : this.previouses;
    }
    /**
     * @return The reason that will log an alert. Possible values are `PlatformInitiated` (such as a problem with the resource in an affected region of an Azure incident), `UserInitiated` (such as a shutdown request of a VM) and `Unknown`.
     * 
     */
    public List<String> reasons() {
        return this.reasons == null ? List.of() : this.reasons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityLogAlertCriteriaResourceHealth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> currents;
        private @Nullable List<String> previouses;
        private @Nullable List<String> reasons;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityLogAlertCriteriaResourceHealth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currents = defaults.currents;
    	      this.previouses = defaults.previouses;
    	      this.reasons = defaults.reasons;
        }

        public Builder currents(@Nullable List<String> currents) {
            this.currents = currents;
            return this;
        }
        public Builder currents(String... currents) {
            return currents(List.of(currents));
        }
        public Builder previouses(@Nullable List<String> previouses) {
            this.previouses = previouses;
            return this;
        }
        public Builder previouses(String... previouses) {
            return previouses(List.of(previouses));
        }
        public Builder reasons(@Nullable List<String> reasons) {
            this.reasons = reasons;
            return this;
        }
        public Builder reasons(String... reasons) {
            return reasons(List.of(reasons));
        }        public ActivityLogAlertCriteriaResourceHealth build() {
            return new ActivityLogAlertCriteriaResourceHealth(currents, previouses, reasons);
        }
    }
}
