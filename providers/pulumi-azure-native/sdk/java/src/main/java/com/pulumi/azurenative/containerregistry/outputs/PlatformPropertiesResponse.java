// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PlatformPropertiesResponse {
    /**
     * @return The OS architecture.
     * 
     */
    private final @Nullable String architecture;
    /**
     * @return The operating system type required for the run.
     * 
     */
    private final String os;
    /**
     * @return Variant of the CPU.
     * 
     */
    private final @Nullable String variant;

    @CustomType.Constructor
    private PlatformPropertiesResponse(
        @CustomType.Parameter("architecture") @Nullable String architecture,
        @CustomType.Parameter("os") String os,
        @CustomType.Parameter("variant") @Nullable String variant) {
        this.architecture = architecture;
        this.os = os;
        this.variant = variant;
    }

    /**
     * @return The OS architecture.
     * 
     */
    public Optional<String> architecture() {
        return Optional.ofNullable(this.architecture);
    }
    /**
     * @return The operating system type required for the run.
     * 
     */
    public String os() {
        return this.os;
    }
    /**
     * @return Variant of the CPU.
     * 
     */
    public Optional<String> variant() {
        return Optional.ofNullable(this.variant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String architecture;
        private String os;
        private @Nullable String variant;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
    	      this.variant = defaults.variant;
        }

        public Builder architecture(@Nullable String architecture) {
            this.architecture = architecture;
            return this;
        }
        public Builder os(String os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }
        public Builder variant(@Nullable String variant) {
            this.variant = variant;
            return this;
        }        public PlatformPropertiesResponse build() {
            return new PlatformPropertiesResponse(architecture, os, variant);
        }
    }
}
