// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ZypperRepositoryResponse {
    /**
     * @return The location of the repository directory.
     * 
     */
    private final String baseUrl;
    /**
     * @return The display name of the repository.
     * 
     */
    private final String displayName;
    /**
     * @return URIs of GPG keys.
     * 
     */
    private final List<String> gpgKeys;

    @CustomType.Constructor
    private ZypperRepositoryResponse(
        @CustomType.Parameter("baseUrl") String baseUrl,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("gpgKeys") List<String> gpgKeys) {
        this.baseUrl = baseUrl;
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
    }

    /**
     * @return The location of the repository directory.
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }
    /**
     * @return The display name of the repository.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return URIs of GPG keys.
     * 
     */
    public List<String> gpgKeys() {
        return this.gpgKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZypperRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ZypperRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder gpgKeys(List<String> gpgKeys) {
            this.gpgKeys = Objects.requireNonNull(gpgKeys);
            return this;
        }
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }        public ZypperRepositoryResponse build() {
            return new ZypperRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
