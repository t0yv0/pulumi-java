// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolArgs Empty = new GetWorkloadIdentityPoolArgs();

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The id of the pool which is the
     * final component of the resource name.
     * 
     */
    @Import(name="workloadIdentityPoolId", required=true)
    private String workloadIdentityPoolId;

    /**
     * @return The id of the pool which is the
     * final component of the resource name.
     * 
     */
    public String workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    private GetWorkloadIdentityPoolArgs() {}

    private GetWorkloadIdentityPoolArgs(GetWorkloadIdentityPoolArgs $) {
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadIdentityPoolArgs $;

        public Builder() {
            $ = new GetWorkloadIdentityPoolArgs();
        }

        public Builder(GetWorkloadIdentityPoolArgs defaults) {
            $ = new GetWorkloadIdentityPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param workloadIdentityPoolId The id of the pool which is the
         * final component of the resource name.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        public GetWorkloadIdentityPoolArgs build() {
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            return $;
        }
    }

}
