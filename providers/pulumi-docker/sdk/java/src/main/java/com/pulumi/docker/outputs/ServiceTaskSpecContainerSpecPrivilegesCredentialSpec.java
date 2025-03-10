// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecPrivilegesCredentialSpec {
    private final @Nullable String file;
    private final @Nullable String registry;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecPrivilegesCredentialSpec(
        @CustomType.Parameter("file") @Nullable String file,
        @CustomType.Parameter("registry") @Nullable String registry) {
        this.file = file;
        this.registry = registry;
    }

    public Optional<String> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<String> registry() {
        return Optional.ofNullable(this.registry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String file;
        private @Nullable String registry;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.registry = defaults.registry;
        }

        public Builder file(@Nullable String file) {
            this.file = file;
            return this;
        }
        public Builder registry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }        public ServiceTaskSpecContainerSpecPrivilegesCredentialSpec build() {
            return new ServiceTaskSpecContainerSpecPrivilegesCredentialSpec(file, registry);
        }
    }
}
