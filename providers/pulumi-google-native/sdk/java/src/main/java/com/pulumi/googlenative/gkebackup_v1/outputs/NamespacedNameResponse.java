// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NamespacedNameResponse {
    /**
     * @return The name of the Kubernetes resource.
     * 
     */
    private final String name;
    /**
     * @return The Namespace of the Kubernetes resource.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private NamespacedNameResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * @return The name of the Kubernetes resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Namespace of the Kubernetes resource.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespacedNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespacedNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public NamespacedNameResponse build() {
            return new NamespacedNameResponse(name, namespace);
        }
    }
}
