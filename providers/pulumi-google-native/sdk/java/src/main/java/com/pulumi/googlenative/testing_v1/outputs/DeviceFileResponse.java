// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.ObbFileResponse;
import com.pulumi.googlenative.testing_v1.outputs.RegularFileResponse;
import java.util.Objects;

@CustomType
public final class DeviceFileResponse {
    /**
     * @return A reference to an opaque binary blob file.
     * 
     */
    private final ObbFileResponse obbFile;
    /**
     * @return A reference to a regular file.
     * 
     */
    private final RegularFileResponse regularFile;

    @CustomType.Constructor
    private DeviceFileResponse(
        @CustomType.Parameter("obbFile") ObbFileResponse obbFile,
        @CustomType.Parameter("regularFile") RegularFileResponse regularFile) {
        this.obbFile = obbFile;
        this.regularFile = regularFile;
    }

    /**
     * @return A reference to an opaque binary blob file.
     * 
     */
    public ObbFileResponse obbFile() {
        return this.obbFile;
    }
    /**
     * @return A reference to a regular file.
     * 
     */
    public RegularFileResponse regularFile() {
        return this.regularFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObbFileResponse obbFile;
        private RegularFileResponse regularFile;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obbFile = defaults.obbFile;
    	      this.regularFile = defaults.regularFile;
        }

        public Builder obbFile(ObbFileResponse obbFile) {
            this.obbFile = Objects.requireNonNull(obbFile);
            return this;
        }
        public Builder regularFile(RegularFileResponse regularFile) {
            this.regularFile = Objects.requireNonNull(regularFile);
            return this;
        }        public DeviceFileResponse build() {
            return new DeviceFileResponse(obbFile, regularFile);
        }
    }
}
