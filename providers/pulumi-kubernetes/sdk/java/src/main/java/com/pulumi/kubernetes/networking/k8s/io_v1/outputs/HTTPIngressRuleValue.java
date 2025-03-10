// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.k8s.io_v1.outputs.HTTPIngressPath;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HTTPIngressRuleValue {
    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    private final List<HTTPIngressPath> paths;

    @CustomType.Constructor
    private HTTPIngressRuleValue(@CustomType.Parameter("paths") List<HTTPIngressPath> paths) {
        this.paths = paths;
    }

    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    public List<HTTPIngressPath> paths() {
        return this.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HTTPIngressPath> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressRuleValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder paths(List<HTTPIngressPath> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(HTTPIngressPath... paths) {
            return paths(List.of(paths));
        }        public HTTPIngressRuleValue build() {
            return new HTTPIngressRuleValue(paths);
        }
    }
}
