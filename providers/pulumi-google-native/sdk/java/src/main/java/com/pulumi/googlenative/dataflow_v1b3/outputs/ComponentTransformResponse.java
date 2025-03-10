// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ComponentTransformResponse {
    /**
     * @return Dataflow service generated name for this source.
     * 
     */
    private final String name;
    /**
     * @return User name for the original user transform with which this transform is most closely associated.
     * 
     */
    private final String originalTransform;
    /**
     * @return Human-readable name for this transform; may be user or system generated.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private ComponentTransformResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("originalTransform") String originalTransform,
        @CustomType.Parameter("userName") String userName) {
        this.name = name;
        this.originalTransform = originalTransform;
        this.userName = userName;
    }

    /**
     * @return Dataflow service generated name for this source.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return User name for the original user transform with which this transform is most closely associated.
     * 
     */
    public String originalTransform() {
        return this.originalTransform;
    }
    /**
     * @return Human-readable name for this transform; may be user or system generated.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentTransformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransform;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentTransformResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransform = defaults.originalTransform;
    	      this.userName = defaults.userName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder originalTransform(String originalTransform) {
            this.originalTransform = Objects.requireNonNull(originalTransform);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public ComponentTransformResponse build() {
            return new ComponentTransformResponse(name, originalTransform, userName);
        }
    }
}
