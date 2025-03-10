// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.JobInputAssetResponse;
import com.pulumi.azurenative.media.outputs.JobInputClipResponse;
import com.pulumi.azurenative.media.outputs.JobInputHttpResponse;
import com.pulumi.azurenative.media.outputs.JobInputSequenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JobInputsResponse {
    /**
     * @return List of inputs to a Job.
     * 
     */
    private final @Nullable List<Object> inputs;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private JobInputsResponse(
        @CustomType.Parameter("inputs") @Nullable List<Object> inputs,
        @CustomType.Parameter("odataType") String odataType) {
        this.inputs = inputs;
        this.odataType = odataType;
    }

    /**
     * @return List of inputs to a Job.
     * 
     */
    public List<Object> inputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputs&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> inputs;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.odataType = defaults.odataType;
        }

        public Builder inputs(@Nullable List<Object> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(Object... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public JobInputsResponse build() {
            return new JobInputsResponse(inputs, odataType);
        }
    }
}
