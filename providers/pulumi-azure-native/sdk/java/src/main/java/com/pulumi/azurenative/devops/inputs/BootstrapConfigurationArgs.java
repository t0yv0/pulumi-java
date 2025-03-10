// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devops.inputs;

import com.pulumi.azurenative.devops.inputs.CodeRepositoryArgs;
import com.pulumi.azurenative.devops.inputs.PipelineTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration used to bootstrap a Pipeline.
 * 
 */
public final class BootstrapConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BootstrapConfigurationArgs Empty = new BootstrapConfigurationArgs();

    /**
     * Repository containing the source code for the pipeline. Currently only &#39;azurePipeline&#39; pipeline type supports this.
     * 
     */
    @Import(name="sourceRepository")
    private @Nullable Output<CodeRepositoryArgs> sourceRepository;

    /**
     * @return Repository containing the source code for the pipeline. Currently only &#39;azurePipeline&#39; pipeline type supports this.
     * 
     */
    public Optional<Output<CodeRepositoryArgs>> sourceRepository() {
        return Optional.ofNullable(this.sourceRepository);
    }

    /**
     * Template used to bootstrap the pipeline.
     * 
     */
    @Import(name="template", required=true)
    private Output<PipelineTemplateArgs> template;

    /**
     * @return Template used to bootstrap the pipeline.
     * 
     */
    public Output<PipelineTemplateArgs> template() {
        return this.template;
    }

    private BootstrapConfigurationArgs() {}

    private BootstrapConfigurationArgs(BootstrapConfigurationArgs $) {
        this.sourceRepository = $.sourceRepository;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BootstrapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BootstrapConfigurationArgs $;

        public Builder() {
            $ = new BootstrapConfigurationArgs();
        }

        public Builder(BootstrapConfigurationArgs defaults) {
            $ = new BootstrapConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceRepository Repository containing the source code for the pipeline. Currently only &#39;azurePipeline&#39; pipeline type supports this.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(@Nullable Output<CodeRepositoryArgs> sourceRepository) {
            $.sourceRepository = sourceRepository;
            return this;
        }

        /**
         * @param sourceRepository Repository containing the source code for the pipeline. Currently only &#39;azurePipeline&#39; pipeline type supports this.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(CodeRepositoryArgs sourceRepository) {
            return sourceRepository(Output.of(sourceRepository));
        }

        /**
         * @param template Template used to bootstrap the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<PipelineTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Template used to bootstrap the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder template(PipelineTemplateArgs template) {
            return template(Output.of(template));
        }

        public BootstrapConfigurationArgs build() {
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
