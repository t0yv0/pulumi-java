// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.InstanceSpecArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InstanceTemplateSpec describes the data an instance should have when created from a template.
 * 
 */
public final class InstanceTemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateSpecArgs Empty = new InstanceTemplateSpecArgs();

    /**
     * Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    @Import(name="spec")
    private @Nullable Output<InstanceSpecArgs> spec;

    /**
     * @return Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    public Optional<Output<InstanceSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private InstanceTemplateSpecArgs() {}

    private InstanceTemplateSpecArgs(InstanceTemplateSpecArgs $) {
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateSpecArgs $;

        public Builder() {
            $ = new InstanceTemplateSpecArgs();
        }

        public Builder(InstanceTemplateSpecArgs defaults) {
            $ = new InstanceTemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param spec Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<InstanceSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
         * 
         * @return builder
         * 
         */
        public Builder spec(InstanceSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public InstanceTemplateSpecArgs build() {
            return $;
        }
    }

}
