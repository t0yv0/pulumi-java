// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExposureControlFeatureValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExposureControlFeatureValueArgs Empty = new GetExposureControlFeatureValueArgs();

    /**
     * The feature name.
     * 
     */
    @Import(name="featureName")
    private @Nullable String featureName;

    /**
     * @return The feature name.
     * 
     */
    public Optional<String> featureName() {
        return Optional.ofNullable(this.featureName);
    }

    /**
     * The feature type.
     * 
     */
    @Import(name="featureType")
    private @Nullable String featureType;

    /**
     * @return The feature type.
     * 
     */
    public Optional<String> featureType() {
        return Optional.ofNullable(this.featureType);
    }

    /**
     * The location identifier.
     * 
     */
    @Import(name="locationId", required=true)
    private String locationId;

    /**
     * @return The location identifier.
     * 
     */
    public String locationId() {
        return this.locationId;
    }

    private GetExposureControlFeatureValueArgs() {}

    private GetExposureControlFeatureValueArgs(GetExposureControlFeatureValueArgs $) {
        this.featureName = $.featureName;
        this.featureType = $.featureType;
        this.locationId = $.locationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExposureControlFeatureValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExposureControlFeatureValueArgs $;

        public Builder() {
            $ = new GetExposureControlFeatureValueArgs();
        }

        public Builder(GetExposureControlFeatureValueArgs defaults) {
            $ = new GetExposureControlFeatureValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureName The feature name.
         * 
         * @return builder
         * 
         */
        public Builder featureName(@Nullable String featureName) {
            $.featureName = featureName;
            return this;
        }

        /**
         * @param featureType The feature type.
         * 
         * @return builder
         * 
         */
        public Builder featureType(@Nullable String featureType) {
            $.featureType = featureType;
            return this;
        }

        /**
         * @param locationId The location identifier.
         * 
         * @return builder
         * 
         */
        public Builder locationId(String locationId) {
            $.locationId = locationId;
            return this;
        }

        public GetExposureControlFeatureValueArgs build() {
            $.locationId = Objects.requireNonNull($.locationId, "expected parameter 'locationId' to be non-null");
            return $;
        }
    }

}
