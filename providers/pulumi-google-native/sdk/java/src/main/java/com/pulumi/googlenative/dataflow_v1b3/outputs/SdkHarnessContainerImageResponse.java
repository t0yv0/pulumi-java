// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SdkHarnessContainerImageResponse {
    /**
     * @return The set of capabilities enumerated in the above Environment proto. See also https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
     * 
     */
    private final List<String> capabilities;
    /**
     * @return A docker container image that resides in Google Container Registry.
     * 
     */
    private final String containerImage;
    /**
     * @return Environment ID for the Beam runner API proto Environment that corresponds to the current SDK Harness.
     * 
     */
    private final String environmentId;
    /**
     * @return If true, recommends the Dataflow service to use only one core per SDK container instance with this image. If false (or unset) recommends using more than one core per SDK container instance with this image for efficiency. Note that Dataflow service may choose to override this property if needed.
     * 
     */
    private final Boolean useSingleCorePerContainer;

    @CustomType.Constructor
    private SdkHarnessContainerImageResponse(
        @CustomType.Parameter("capabilities") List<String> capabilities,
        @CustomType.Parameter("containerImage") String containerImage,
        @CustomType.Parameter("environmentId") String environmentId,
        @CustomType.Parameter("useSingleCorePerContainer") Boolean useSingleCorePerContainer) {
        this.capabilities = capabilities;
        this.containerImage = containerImage;
        this.environmentId = environmentId;
        this.useSingleCorePerContainer = useSingleCorePerContainer;
    }

    /**
     * @return The set of capabilities enumerated in the above Environment proto. See also https://github.com/apache/beam/blob/master/model/pipeline/src/main/proto/beam_runner_api.proto
     * 
     */
    public List<String> capabilities() {
        return this.capabilities;
    }
    /**
     * @return A docker container image that resides in Google Container Registry.
     * 
     */
    public String containerImage() {
        return this.containerImage;
    }
    /**
     * @return Environment ID for the Beam runner API proto Environment that corresponds to the current SDK Harness.
     * 
     */
    public String environmentId() {
        return this.environmentId;
    }
    /**
     * @return If true, recommends the Dataflow service to use only one core per SDK container instance with this image. If false (or unset) recommends using more than one core per SDK container instance with this image for efficiency. Note that Dataflow service may choose to override this property if needed.
     * 
     */
    public Boolean useSingleCorePerContainer() {
        return this.useSingleCorePerContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SdkHarnessContainerImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> capabilities;
        private String containerImage;
        private String environmentId;
        private Boolean useSingleCorePerContainer;

        public Builder() {
    	      // Empty
        }

        public Builder(SdkHarnessContainerImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.containerImage = defaults.containerImage;
    	      this.environmentId = defaults.environmentId;
    	      this.useSingleCorePerContainer = defaults.useSingleCorePerContainer;
        }

        public Builder capabilities(List<String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder containerImage(String containerImage) {
            this.containerImage = Objects.requireNonNull(containerImage);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder useSingleCorePerContainer(Boolean useSingleCorePerContainer) {
            this.useSingleCorePerContainer = Objects.requireNonNull(useSingleCorePerContainer);
            return this;
        }        public SdkHarnessContainerImageResponse build() {
            return new SdkHarnessContainerImageResponse(capabilities, containerImage, environmentId, useSingleCorePerContainer);
        }
    }
}
