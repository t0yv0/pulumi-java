// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BootDiagnosticsResponse {
    /**
     * @return Whether boot diagnostics should be enabled on the Virtual Machine.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Uri of the storage account to use for placing the console output and screenshot. &lt;br&gt;&lt;br&gt;If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     * 
     */
    private final @Nullable String storageUri;

    @CustomType.Constructor
    private BootDiagnosticsResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("storageUri") @Nullable String storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    /**
     * @return Whether boot diagnostics should be enabled on the Virtual Machine.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Uri of the storage account to use for placing the console output and screenshot. &lt;br&gt;&lt;br&gt;If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     * 
     */
    public Optional<String> storageUri() {
        return Optional.ofNullable(this.storageUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder storageUri(@Nullable String storageUri) {
            this.storageUri = storageUri;
            return this;
        }        public BootDiagnosticsResponse build() {
            return new BootDiagnosticsResponse(enabled, storageUri);
        }
    }
}
