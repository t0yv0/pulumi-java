// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeArtifactRemoteResponse {
    /**
     * @return Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to the checksum of the artifact. If the checksum is not empty and it doesn&#39;t match the artifact then the recipe installation fails before running any of the steps.
     * 
     */
    private final String checksum;
    /**
     * @return URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private SoftwareRecipeArtifactRemoteResponse(
        @CustomType.Parameter("checksum") String checksum,
        @CustomType.Parameter("uri") String uri) {
        this.checksum = checksum;
        this.uri = uri;
    }

    /**
     * @return Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to the checksum of the artifact. If the checksum is not empty and it doesn&#39;t match the artifact then the recipe installation fails before running any of the steps.
     * 
     */
    public String checksum() {
        return this.checksum;
    }
    /**
     * @return URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArtifactRemoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArtifactRemoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.uri = defaults.uri;
        }

        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public SoftwareRecipeArtifactRemoteResponse build() {
            return new SoftwareRecipeArtifactRemoteResponse(checksum, uri);
        }
    }
}
