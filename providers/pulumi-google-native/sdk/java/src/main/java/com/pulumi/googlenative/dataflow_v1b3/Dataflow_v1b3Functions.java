// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataflow_v1b3.inputs.GetJobArgs;
import com.pulumi.googlenative.dataflow_v1b3.inputs.GetTemplateArgs;
import com.pulumi.googlenative.dataflow_v1b3.outputs.GetJobResult;
import com.pulumi.googlenative.dataflow_v1b3.outputs.GetTemplateResult;
import java.util.concurrent.CompletableFuture;

public final class Dataflow_v1b3Functions {
    /**
     * Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in `us-central1`.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    /**
     * Gets the state of the specified Cloud Dataflow job. To get the state of a job, we recommend using `projects.locations.jobs.get` with a [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.get` is not recommended, as you can only get the state of jobs that are running in `us-central1`.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataflow/v1b3:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the template associated with a template.
     * 
     */
    public static CompletableFuture<GetTemplateResult> getTemplate(GetTemplateArgs args) {
        return getTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Get the template associated with a template.
     * 
     */
    public static CompletableFuture<GetTemplateResult> getTemplate(GetTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataflow/v1b3:getTemplate", TypeShape.of(GetTemplateResult.class), args, Utilities.withVersion(options));
    }
}
