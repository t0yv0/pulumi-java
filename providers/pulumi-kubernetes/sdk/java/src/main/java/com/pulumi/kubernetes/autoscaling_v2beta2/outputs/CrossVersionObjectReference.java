// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrossVersionObjectReference {
    /**
     * @return API version of the referent
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds&#34;
     * 
     */
    private final String kind;
    /**
     * @return Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    private final String name;

    @CustomType.Constructor
    private CrossVersionObjectReference(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
    }

    /**
     * @return API version of the referent
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds&#34;
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossVersionObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CrossVersionObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public CrossVersionObjectReference build() {
            return new CrossVersionObjectReference(apiVersion, kind, name);
        }
    }
}
