// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.ConfigMapNodeConfigSource;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeConfigSource {
    /**
     * @return ConfigMap is a reference to a Node&#39;s ConfigMap
     * 
     */
    private final @Nullable ConfigMapNodeConfigSource configMap;

    @CustomType.Constructor
    private NodeConfigSource(@CustomType.Parameter("configMap") @Nullable ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
    }

    /**
     * @return ConfigMap is a reference to a Node&#39;s ConfigMap
     * 
     */
    public Optional<ConfigMapNodeConfigSource> configMap() {
        return Optional.ofNullable(this.configMap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigMapNodeConfigSource configMap;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
        }

        public Builder configMap(@Nullable ConfigMapNodeConfigSource configMap) {
            this.configMap = configMap;
            return this;
        }        public NodeConfigSource build() {
            return new NodeConfigSource(configMap);
        }
    }
}
