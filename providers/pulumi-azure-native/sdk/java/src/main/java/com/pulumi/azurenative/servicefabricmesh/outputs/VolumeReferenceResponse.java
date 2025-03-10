// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeReferenceResponse {
    /**
     * @return The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    private final String destinationPath;
    /**
     * @return Name of the volume being referenced.
     * 
     */
    private final String name;
    /**
     * @return The flag indicating whether the volume is read only. Default is &#39;false&#39;.
     * 
     */
    private final @Nullable Boolean readOnly;

    @CustomType.Constructor
    private VolumeReferenceResponse(
        @CustomType.Parameter("destinationPath") String destinationPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly) {
        this.destinationPath = destinationPath;
        this.name = name;
        this.readOnly = readOnly;
    }

    /**
     * @return The path within the container at which the volume should be mounted. Only valid path characters are allowed.
     * 
     */
    public String destinationPath() {
        return this.destinationPath;
    }
    /**
     * @return Name of the volume being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The flag indicating whether the volume is read only. Default is &#39;false&#39;.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationPath;
        private String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPath = defaults.destinationPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder destinationPath(String destinationPath) {
            this.destinationPath = Objects.requireNonNull(destinationPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }        public VolumeReferenceResponse build() {
            return new VolumeReferenceResponse(destinationPath, name, readOnly);
        }
    }
}
