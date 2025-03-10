// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrchestratedVirtualMachineScaleSetBootDiagnostics {
    private final @Nullable String storageAccountUri;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetBootDiagnostics(@CustomType.Parameter("storageAccountUri") @Nullable String storageAccountUri) {
        this.storageAccountUri = storageAccountUri;
    }

    public Optional<String> storageAccountUri() {
        return Optional.ofNullable(this.storageAccountUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetBootDiagnostics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageAccountUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetBootDiagnostics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountUri = defaults.storageAccountUri;
        }

        public Builder storageAccountUri(@Nullable String storageAccountUri) {
            this.storageAccountUri = storageAccountUri;
            return this;
        }        public OrchestratedVirtualMachineScaleSetBootDiagnostics build() {
            return new OrchestratedVirtualMachineScaleSetBootDiagnostics(storageAccountUri);
        }
    }
}
