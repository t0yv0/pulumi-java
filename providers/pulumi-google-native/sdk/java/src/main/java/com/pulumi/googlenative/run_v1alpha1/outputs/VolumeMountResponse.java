// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeMountResponse {
    /**
     * @return Path within the container at which the volume should be mounted. Must not contain &#39;:&#39;.
     * 
     */
    private final String mountPath;
    /**
     * @return The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    private final String name;
    /**
     * @return (Optional) Only true is accepted. Defaults to true.
     * 
     */
    private final Boolean readOnly;
    /**
     * @return (Optional) Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    private final String subPath;

    @CustomType.Constructor
    private VolumeMountResponse(
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("readOnly") Boolean readOnly,
        @CustomType.Parameter("subPath") String subPath) {
        this.mountPath = mountPath;
        this.name = name;
        this.readOnly = readOnly;
        this.subPath = subPath;
    }

    /**
     * @return Path within the container at which the volume should be mounted. Must not contain &#39;:&#39;.
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) Only true is accepted. Defaults to true.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return (Optional) Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    public String subPath() {
        return this.subPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;
        private Boolean readOnly;
        private String subPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        public Builder subPath(String subPath) {
            this.subPath = Objects.requireNonNull(subPath);
            return this;
        }        public VolumeMountResponse build() {
            return new VolumeMountResponse(mountPath, name, readOnly, subPath);
        }
    }
}
