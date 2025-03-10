// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExcludedServicesConfigResponse {
    /**
     * @return The config id of excluded services.
     * 
     */
    private final @Nullable String excludedServicesConfigId;
    /**
     * @return The list of excluded services.
     * 
     */
    private final @Nullable String excludedServicesList;

    @CustomType.Constructor
    private ExcludedServicesConfigResponse(
        @CustomType.Parameter("excludedServicesConfigId") @Nullable String excludedServicesConfigId,
        @CustomType.Parameter("excludedServicesList") @Nullable String excludedServicesList) {
        this.excludedServicesConfigId = excludedServicesConfigId;
        this.excludedServicesList = excludedServicesList;
    }

    /**
     * @return The config id of excluded services.
     * 
     */
    public Optional<String> excludedServicesConfigId() {
        return Optional.ofNullable(this.excludedServicesConfigId);
    }
    /**
     * @return The list of excluded services.
     * 
     */
    public Optional<String> excludedServicesList() {
        return Optional.ofNullable(this.excludedServicesList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExcludedServicesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String excludedServicesConfigId;
        private @Nullable String excludedServicesList;

        public Builder() {
    	      // Empty
        }

        public Builder(ExcludedServicesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedServicesConfigId = defaults.excludedServicesConfigId;
    	      this.excludedServicesList = defaults.excludedServicesList;
        }

        public Builder excludedServicesConfigId(@Nullable String excludedServicesConfigId) {
            this.excludedServicesConfigId = excludedServicesConfigId;
            return this;
        }
        public Builder excludedServicesList(@Nullable String excludedServicesList) {
            this.excludedServicesList = excludedServicesList;
            return this;
        }        public ExcludedServicesConfigResponse build() {
            return new ExcludedServicesConfigResponse(excludedServicesConfigId, excludedServicesList);
        }
    }
}
