// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.InstanceSpecResponse;
import java.util.Objects;

@CustomType
public final class InstanceTemplateSpecResponse {
    /**
     * @return Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    private final InstanceSpecResponse spec;

    @CustomType.Constructor
    private InstanceTemplateSpecResponse(@CustomType.Parameter("spec") InstanceSpecResponse spec) {
        this.spec = spec;
    }

    /**
     * @return Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    public InstanceSpecResponse spec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSpecResponse spec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spec = defaults.spec;
        }

        public Builder spec(InstanceSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }        public InstanceTemplateSpecResponse build() {
            return new InstanceTemplateSpecResponse(spec);
        }
    }
}
