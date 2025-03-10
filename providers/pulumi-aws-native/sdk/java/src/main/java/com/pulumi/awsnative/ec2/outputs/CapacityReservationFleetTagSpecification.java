// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.CapacityReservationFleetTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapacityReservationFleetTagSpecification {
    private final @Nullable String resourceType;
    private final @Nullable List<CapacityReservationFleetTag> tags;

    @CustomType.Constructor
    private CapacityReservationFleetTagSpecification(
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("tags") @Nullable List<CapacityReservationFleetTag> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public List<CapacityReservationFleetTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationFleetTagSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceType;
        private @Nullable List<CapacityReservationFleetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationFleetTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder tags(@Nullable List<CapacityReservationFleetTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(CapacityReservationFleetTag... tags) {
            return tags(List.of(tags));
        }        public CapacityReservationFleetTagSpecification build() {
            return new CapacityReservationFleetTagSpecification(resourceType, tags);
        }
    }
}
