// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.clouddeploy_v1.outputs.StageResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SerialPipelineResponse {
    /**
     * @return Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    private final List<StageResponse> stages;

    @CustomType.Constructor
    private SerialPipelineResponse(@CustomType.Parameter("stages") List<StageResponse> stages) {
        this.stages = stages;
    }

    /**
     * @return Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    public List<StageResponse> stages() {
        return this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StageResponse> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPipelineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder stages(List<StageResponse> stages) {
            this.stages = Objects.requireNonNull(stages);
            return this;
        }
        public Builder stages(StageResponse... stages) {
            return stages(List.of(stages));
        }        public SerialPipelineResponse build() {
            return new SerialPipelineResponse(stages);
        }
    }
}
