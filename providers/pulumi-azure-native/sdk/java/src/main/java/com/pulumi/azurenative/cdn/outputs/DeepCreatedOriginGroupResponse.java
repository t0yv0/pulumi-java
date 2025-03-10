// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.HealthProbeParametersResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.ResponseBasedOriginErrorDetectionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeepCreatedOriginGroupResponse {
    /**
     * @return Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    private final @Nullable HealthProbeParametersResponse healthProbeSettings;
    /**
     * @return Origin group name which must be unique within the endpoint.
     * 
     */
    private final String name;
    /**
     * @return The source of the content being delivered via CDN within given origin group.
     * 
     */
    private final List<ResourceReferenceResponse> origins;
    /**
     * @return The JSON object that contains the properties to determine origin health using real requests/responses.This property is currently not supported.
     * 
     */
    private final @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;
    /**
     * @return Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    private final @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    @CustomType.Constructor
    private DeepCreatedOriginGroupResponse(
        @CustomType.Parameter("healthProbeSettings") @Nullable HealthProbeParametersResponse healthProbeSettings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("origins") List<ResourceReferenceResponse> origins,
        @CustomType.Parameter("responseBasedOriginErrorDetectionSettings") @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings,
        @CustomType.Parameter("trafficRestorationTimeToHealedOrNewEndpointsInMinutes") @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.healthProbeSettings = healthProbeSettings;
        this.name = name;
        this.origins = origins;
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    /**
     * @return Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    public Optional<HealthProbeParametersResponse> healthProbeSettings() {
        return Optional.ofNullable(this.healthProbeSettings);
    }
    /**
     * @return Origin group name which must be unique within the endpoint.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The source of the content being delivered via CDN within given origin group.
     * 
     */
    public List<ResourceReferenceResponse> origins() {
        return this.origins;
    }
    /**
     * @return The JSON object that contains the properties to determine origin health using real requests/responses.This property is currently not supported.
     * 
     */
    public Optional<ResponseBasedOriginErrorDetectionParametersResponse> responseBasedOriginErrorDetectionSettings() {
        return Optional.ofNullable(this.responseBasedOriginErrorDetectionSettings);
    }
    /**
     * @return Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    public Optional<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return Optional.ofNullable(this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeepCreatedOriginGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthProbeParametersResponse healthProbeSettings;
        private String name;
        private List<ResourceReferenceResponse> origins;
        private @Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings;
        private @Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeepCreatedOriginGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.name = defaults.name;
    	      this.origins = defaults.origins;
    	      this.responseBasedOriginErrorDetectionSettings = defaults.responseBasedOriginErrorDetectionSettings;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        }

        public Builder healthProbeSettings(@Nullable HealthProbeParametersResponse healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder origins(List<ResourceReferenceResponse> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }
        public Builder origins(ResourceReferenceResponse... origins) {
            return origins(List.of(origins));
        }
        public Builder responseBasedOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersResponse responseBasedOriginErrorDetectionSettings) {
            this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
            return this;
        }
        public Builder trafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }        public DeepCreatedOriginGroupResponse build() {
            return new DeepCreatedOriginGroupResponse(healthProbeSettings, name, origins, responseBasedOriginErrorDetectionSettings, trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
    }
}
