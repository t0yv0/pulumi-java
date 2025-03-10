// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitFileSourceResponse {
    /**
     * @return The full resource name of the bitbucket server config. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`.
     * 
     */
    private final String bitbucketServerConfig;
    /**
     * @return The full resource name of the github enterprise config. Format: `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`. `projects/{project}/githubEnterpriseConfigs/{id}`.
     * 
     */
    private final String githubEnterpriseConfig;
    /**
     * @return The path of the file, with the repo root as the root of the path.
     * 
     */
    private final String path;
    /**
     * @return See RepoType above.
     * 
     */
    private final String repoType;
    /**
     * @return The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    private final String revision;
    /**
     * @return The URI of the repo. Either uri or repository can be specified. If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GitFileSourceResponse(
        @CustomType.Parameter("bitbucketServerConfig") String bitbucketServerConfig,
        @CustomType.Parameter("githubEnterpriseConfig") String githubEnterpriseConfig,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("repoType") String repoType,
        @CustomType.Parameter("revision") String revision,
        @CustomType.Parameter("uri") String uri) {
        this.bitbucketServerConfig = bitbucketServerConfig;
        this.githubEnterpriseConfig = githubEnterpriseConfig;
        this.path = path;
        this.repoType = repoType;
        this.revision = revision;
        this.uri = uri;
    }

    /**
     * @return The full resource name of the bitbucket server config. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`.
     * 
     */
    public String bitbucketServerConfig() {
        return this.bitbucketServerConfig;
    }
    /**
     * @return The full resource name of the github enterprise config. Format: `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`. `projects/{project}/githubEnterpriseConfigs/{id}`.
     * 
     */
    public String githubEnterpriseConfig() {
        return this.githubEnterpriseConfig;
    }
    /**
     * @return The path of the file, with the repo root as the root of the path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return See RepoType above.
     * 
     */
    public String repoType() {
        return this.repoType;
    }
    /**
     * @return The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    public String revision() {
        return this.revision;
    }
    /**
     * @return The URI of the repo. Either uri or repository can be specified. If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitFileSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bitbucketServerConfig;
        private String githubEnterpriseConfig;
        private String path;
        private String repoType;
        private String revision;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitFileSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitbucketServerConfig = defaults.bitbucketServerConfig;
    	      this.githubEnterpriseConfig = defaults.githubEnterpriseConfig;
    	      this.path = defaults.path;
    	      this.repoType = defaults.repoType;
    	      this.revision = defaults.revision;
    	      this.uri = defaults.uri;
        }

        public Builder bitbucketServerConfig(String bitbucketServerConfig) {
            this.bitbucketServerConfig = Objects.requireNonNull(bitbucketServerConfig);
            return this;
        }
        public Builder githubEnterpriseConfig(String githubEnterpriseConfig) {
            this.githubEnterpriseConfig = Objects.requireNonNull(githubEnterpriseConfig);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder repoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GitFileSourceResponse build() {
            return new GitFileSourceResponse(bitbucketServerConfig, githubEnterpriseConfig, path, repoType, revision, uri);
        }
    }
}
