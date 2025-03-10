// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetModelBiasJobDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelBiasJobDefinitionArgs Empty = new GetModelBiasJobDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Import(name="jobDefinitionArn", required=true)
    private String jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public String jobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    private GetModelBiasJobDefinitionArgs() {}

    private GetModelBiasJobDefinitionArgs(GetModelBiasJobDefinitionArgs $) {
        this.jobDefinitionArn = $.jobDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelBiasJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelBiasJobDefinitionArgs $;

        public Builder() {
            $ = new GetModelBiasJobDefinitionArgs();
        }

        public Builder(GetModelBiasJobDefinitionArgs defaults) {
            $ = new GetModelBiasJobDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobDefinitionArn The Amazon Resource Name (ARN) of job definition.
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionArn(String jobDefinitionArn) {
            $.jobDefinitionArn = jobDefinitionArn;
            return this;
        }

        public GetModelBiasJobDefinitionArgs build() {
            $.jobDefinitionArn = Objects.requireNonNull($.jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
            return $;
        }
    }

}
