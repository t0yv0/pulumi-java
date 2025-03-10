// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.ProjectRepoIdResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RepoIdResponse {
    /**
     * @return A combination of a project ID and a repo name.
     * 
     */
    private final ProjectRepoIdResponse projectRepoId;
    /**
     * @return A server-assigned, globally unique identifier.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private RepoIdResponse(
        @CustomType.Parameter("projectRepoId") ProjectRepoIdResponse projectRepoId,
        @CustomType.Parameter("uid") String uid) {
        this.projectRepoId = projectRepoId;
        this.uid = uid;
    }

    /**
     * @return A combination of a project ID and a repo name.
     * 
     */
    public ProjectRepoIdResponse projectRepoId() {
        return this.projectRepoId;
    }
    /**
     * @return A server-assigned, globally unique identifier.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectRepoIdResponse projectRepoId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(ProjectRepoIdResponse projectRepoId) {
            this.projectRepoId = Objects.requireNonNull(projectRepoId);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public RepoIdResponse build() {
            return new RepoIdResponse(projectRepoId, uid);
        }
    }
}
