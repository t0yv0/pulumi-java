// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppSiteConfigApplicationStackDocker {
    /**
     * @return The name of the Docker image used.
     * 
     */
    private final String imageName;
    /**
     * @return The image tag of the image used.
     * 
     */
    private final String imageTag;
    /**
     * @return The password for the account to use to connect to the registry.
     * 
     */
    private final String registryPassword;
    /**
     * @return The URL of the docker registry.
     * 
     */
    private final String registryUrl;
    /**
     * @return The username used for connections to the registry.
     * 
     */
    private final String registryUsername;

    @CustomType.Constructor
    private GetLinuxFunctionAppSiteConfigApplicationStackDocker(
        @CustomType.Parameter("imageName") String imageName,
        @CustomType.Parameter("imageTag") String imageTag,
        @CustomType.Parameter("registryPassword") String registryPassword,
        @CustomType.Parameter("registryUrl") String registryUrl,
        @CustomType.Parameter("registryUsername") String registryUsername) {
        this.imageName = imageName;
        this.imageTag = imageTag;
        this.registryPassword = registryPassword;
        this.registryUrl = registryUrl;
        this.registryUsername = registryUsername;
    }

    /**
     * @return The name of the Docker image used.
     * 
     */
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return The image tag of the image used.
     * 
     */
    public String imageTag() {
        return this.imageTag;
    }
    /**
     * @return The password for the account to use to connect to the registry.
     * 
     */
    public String registryPassword() {
        return this.registryPassword;
    }
    /**
     * @return The URL of the docker registry.
     * 
     */
    public String registryUrl() {
        return this.registryUrl;
    }
    /**
     * @return The username used for connections to the registry.
     * 
     */
    public String registryUsername() {
        return this.registryUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppSiteConfigApplicationStackDocker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageName;
        private String imageTag;
        private String registryPassword;
        private String registryUrl;
        private String registryUsername;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxFunctionAppSiteConfigApplicationStackDocker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.imageTag = defaults.imageTag;
    	      this.registryPassword = defaults.registryPassword;
    	      this.registryUrl = defaults.registryUrl;
    	      this.registryUsername = defaults.registryUsername;
        }

        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder imageTag(String imageTag) {
            this.imageTag = Objects.requireNonNull(imageTag);
            return this;
        }
        public Builder registryPassword(String registryPassword) {
            this.registryPassword = Objects.requireNonNull(registryPassword);
            return this;
        }
        public Builder registryUrl(String registryUrl) {
            this.registryUrl = Objects.requireNonNull(registryUrl);
            return this;
        }
        public Builder registryUsername(String registryUsername) {
            this.registryUsername = Objects.requireNonNull(registryUsername);
            return this;
        }        public GetLinuxFunctionAppSiteConfigApplicationStackDocker build() {
            return new GetLinuxFunctionAppSiteConfigApplicationStackDocker(imageName, imageTag, registryPassword, registryUrl, registryUsername);
        }
    }
}
