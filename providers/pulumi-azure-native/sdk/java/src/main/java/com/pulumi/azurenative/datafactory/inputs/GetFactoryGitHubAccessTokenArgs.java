// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.GitHubClientSecret;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFactoryGitHubAccessTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFactoryGitHubAccessTokenArgs Empty = new GetFactoryGitHubAccessTokenArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * GitHub access code.
     * 
     */
    @Import(name="gitHubAccessCode", required=true)
    private String gitHubAccessCode;

    /**
     * @return GitHub access code.
     * 
     */
    public String gitHubAccessCode() {
        return this.gitHubAccessCode;
    }

    /**
     * GitHub access token base URL.
     * 
     */
    @Import(name="gitHubAccessTokenBaseUrl", required=true)
    private String gitHubAccessTokenBaseUrl;

    /**
     * @return GitHub access token base URL.
     * 
     */
    public String gitHubAccessTokenBaseUrl() {
        return this.gitHubAccessTokenBaseUrl;
    }

    /**
     * GitHub application client ID.
     * 
     */
    @Import(name="gitHubClientId")
    private @Nullable String gitHubClientId;

    /**
     * @return GitHub application client ID.
     * 
     */
    public Optional<String> gitHubClientId() {
        return Optional.ofNullable(this.gitHubClientId);
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @Import(name="gitHubClientSecret")
    private @Nullable GitHubClientSecret gitHubClientSecret;

    /**
     * @return GitHub bring your own app client secret information.
     * 
     */
    public Optional<GitHubClientSecret> gitHubClientSecret() {
        return Optional.ofNullable(this.gitHubClientSecret);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFactoryGitHubAccessTokenArgs() {}

    private GetFactoryGitHubAccessTokenArgs(GetFactoryGitHubAccessTokenArgs $) {
        this.factoryName = $.factoryName;
        this.gitHubAccessCode = $.gitHubAccessCode;
        this.gitHubAccessTokenBaseUrl = $.gitHubAccessTokenBaseUrl;
        this.gitHubClientId = $.gitHubClientId;
        this.gitHubClientSecret = $.gitHubClientSecret;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFactoryGitHubAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFactoryGitHubAccessTokenArgs $;

        public Builder() {
            $ = new GetFactoryGitHubAccessTokenArgs();
        }

        public Builder(GetFactoryGitHubAccessTokenArgs defaults) {
            $ = new GetFactoryGitHubAccessTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param gitHubAccessCode GitHub access code.
         * 
         * @return builder
         * 
         */
        public Builder gitHubAccessCode(String gitHubAccessCode) {
            $.gitHubAccessCode = gitHubAccessCode;
            return this;
        }

        /**
         * @param gitHubAccessTokenBaseUrl GitHub access token base URL.
         * 
         * @return builder
         * 
         */
        public Builder gitHubAccessTokenBaseUrl(String gitHubAccessTokenBaseUrl) {
            $.gitHubAccessTokenBaseUrl = gitHubAccessTokenBaseUrl;
            return this;
        }

        /**
         * @param gitHubClientId GitHub application client ID.
         * 
         * @return builder
         * 
         */
        public Builder gitHubClientId(@Nullable String gitHubClientId) {
            $.gitHubClientId = gitHubClientId;
            return this;
        }

        /**
         * @param gitHubClientSecret GitHub bring your own app client secret information.
         * 
         * @return builder
         * 
         */
        public Builder gitHubClientSecret(@Nullable GitHubClientSecret gitHubClientSecret) {
            $.gitHubClientSecret = gitHubClientSecret;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFactoryGitHubAccessTokenArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.gitHubAccessCode = Objects.requireNonNull($.gitHubAccessCode, "expected parameter 'gitHubAccessCode' to be non-null");
            $.gitHubAccessTokenBaseUrl = Objects.requireNonNull($.gitHubAccessTokenBaseUrl, "expected parameter 'gitHubAccessTokenBaseUrl' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
