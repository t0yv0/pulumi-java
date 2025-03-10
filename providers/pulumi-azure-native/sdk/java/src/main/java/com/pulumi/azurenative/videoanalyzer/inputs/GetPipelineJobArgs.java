// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineJobArgs Empty = new GetPipelineJobArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The pipeline job name.
     * 
     */
    @Import(name="pipelineJobName", required=true)
    private String pipelineJobName;

    /**
     * @return The pipeline job name.
     * 
     */
    public String pipelineJobName() {
        return this.pipelineJobName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPipelineJobArgs() {}

    private GetPipelineJobArgs(GetPipelineJobArgs $) {
        this.accountName = $.accountName;
        this.pipelineJobName = $.pipelineJobName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineJobArgs $;

        public Builder() {
            $ = new GetPipelineJobArgs();
        }

        public Builder(GetPipelineJobArgs defaults) {
            $ = new GetPipelineJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param pipelineJobName The pipeline job name.
         * 
         * @return builder
         * 
         */
        public Builder pipelineJobName(String pipelineJobName) {
            $.pipelineJobName = pipelineJobName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPipelineJobArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.pipelineJobName = Objects.requireNonNull($.pipelineJobName, "expected parameter 'pipelineJobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
