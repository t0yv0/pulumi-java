// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.azure.appplatform.outputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuth;
import com.pulumi.azure.appplatform.outputs.SpringCloudServiceConfigServerGitSettingRepository;
import com.pulumi.azure.appplatform.outputs.SpringCloudServiceConfigServerGitSettingSshAuth;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudServiceConfigServerGitSetting {
    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    private final @Nullable SpringCloudServiceConfigServerGitSettingHttpBasicAuth httpBasicAuth;
    /**
     * @return The default label of the Git repository, should be the branch name, tag name, or commit-id of the repository.
     * 
     */
    private final @Nullable String label;
    /**
     * @return One or more `repository` blocks as defined below.
     * 
     */
    private final @Nullable List<SpringCloudServiceConfigServerGitSettingRepository> repositories;
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    private final @Nullable List<String> searchPaths;
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    private final @Nullable SpringCloudServiceConfigServerGitSettingSshAuth sshAuth;
    /**
     * @return The URI of the default Git repository used as the Config Server back end, should be started with `http://`, `https://`, `git@`, or `ssh://`.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private SpringCloudServiceConfigServerGitSetting(
        @CustomType.Parameter("httpBasicAuth") @Nullable SpringCloudServiceConfigServerGitSettingHttpBasicAuth httpBasicAuth,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("repositories") @Nullable List<SpringCloudServiceConfigServerGitSettingRepository> repositories,
        @CustomType.Parameter("searchPaths") @Nullable List<String> searchPaths,
        @CustomType.Parameter("sshAuth") @Nullable SpringCloudServiceConfigServerGitSettingSshAuth sshAuth,
        @CustomType.Parameter("uri") String uri) {
        this.httpBasicAuth = httpBasicAuth;
        this.label = label;
        this.repositories = repositories;
        this.searchPaths = searchPaths;
        this.sshAuth = sshAuth;
        this.uri = uri;
    }

    /**
     * @return A `http_basic_auth` block as defined below.
     * 
     */
    public Optional<SpringCloudServiceConfigServerGitSettingHttpBasicAuth> httpBasicAuth() {
        return Optional.ofNullable(this.httpBasicAuth);
    }
    /**
     * @return The default label of the Git repository, should be the branch name, tag name, or commit-id of the repository.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return One or more `repository` blocks as defined below.
     * 
     */
    public List<SpringCloudServiceConfigServerGitSettingRepository> repositories() {
        return this.repositories == null ? List.of() : this.repositories;
    }
    /**
     * @return An array of strings used to search subdirectories of the Git repository.
     * 
     */
    public List<String> searchPaths() {
        return this.searchPaths == null ? List.of() : this.searchPaths;
    }
    /**
     * @return A `ssh_auth` block as defined below.
     * 
     */
    public Optional<SpringCloudServiceConfigServerGitSettingSshAuth> sshAuth() {
        return Optional.ofNullable(this.sshAuth);
    }
    /**
     * @return The URI of the default Git repository used as the Config Server back end, should be started with `http://`, `https://`, `git@`, or `ssh://`.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudServiceConfigServerGitSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpringCloudServiceConfigServerGitSettingHttpBasicAuth httpBasicAuth;
        private @Nullable String label;
        private @Nullable List<SpringCloudServiceConfigServerGitSettingRepository> repositories;
        private @Nullable List<String> searchPaths;
        private @Nullable SpringCloudServiceConfigServerGitSettingSshAuth sshAuth;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(SpringCloudServiceConfigServerGitSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpBasicAuth = defaults.httpBasicAuth;
    	      this.label = defaults.label;
    	      this.repositories = defaults.repositories;
    	      this.searchPaths = defaults.searchPaths;
    	      this.sshAuth = defaults.sshAuth;
    	      this.uri = defaults.uri;
        }

        public Builder httpBasicAuth(@Nullable SpringCloudServiceConfigServerGitSettingHttpBasicAuth httpBasicAuth) {
            this.httpBasicAuth = httpBasicAuth;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder repositories(@Nullable List<SpringCloudServiceConfigServerGitSettingRepository> repositories) {
            this.repositories = repositories;
            return this;
        }
        public Builder repositories(SpringCloudServiceConfigServerGitSettingRepository... repositories) {
            return repositories(List.of(repositories));
        }
        public Builder searchPaths(@Nullable List<String> searchPaths) {
            this.searchPaths = searchPaths;
            return this;
        }
        public Builder searchPaths(String... searchPaths) {
            return searchPaths(List.of(searchPaths));
        }
        public Builder sshAuth(@Nullable SpringCloudServiceConfigServerGitSettingSshAuth sshAuth) {
            this.sshAuth = sshAuth;
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public SpringCloudServiceConfigServerGitSetting build() {
            return new SpringCloudServiceConfigServerGitSetting(httpBasicAuth, label, repositories, searchPaths, sshAuth, uri);
        }
    }
}
