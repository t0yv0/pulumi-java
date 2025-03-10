// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AcceleratorConfigResponse {
    /**
     * @return The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    private final Integer acceleratorCount;
    /**
     * @return Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See Compute Engine AcceleratorTypes (https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes)Examples * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 * nvidia-tesla-k80Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, nvidia-tesla-k80.
     * 
     */
    private final String acceleratorTypeUri;

    @CustomType.Constructor
    private AcceleratorConfigResponse(
        @CustomType.Parameter("acceleratorCount") Integer acceleratorCount,
        @CustomType.Parameter("acceleratorTypeUri") String acceleratorTypeUri) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorTypeUri = acceleratorTypeUri;
    }

    /**
     * @return The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    public Integer acceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * @return Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See Compute Engine AcceleratorTypes (https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes)Examples * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 * nvidia-tesla-k80Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, nvidia-tesla-k80.
     * 
     */
    public String acceleratorTypeUri() {
        return this.acceleratorTypeUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorTypeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorTypeUri = defaults.acceleratorTypeUri;
        }

        public Builder acceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }
        public Builder acceleratorTypeUri(String acceleratorTypeUri) {
            this.acceleratorTypeUri = Objects.requireNonNull(acceleratorTypeUri);
            return this;
        }        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(acceleratorCount, acceleratorTypeUri);
        }
    }
}
