// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PersistentVolumeStatus {
    /**
     * @return message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    private final @Nullable String message;
    /**
     * @return phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    private final @Nullable String phase;
    /**
     * @return reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    private final @Nullable String reason;

    @CustomType.Constructor
    private PersistentVolumeStatus(
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("phase") @Nullable String phase,
        @CustomType.Parameter("reason") @Nullable String reason) {
        this.message = message;
        this.phase = phase;
        this.reason = reason;
    }

    /**
     * @return message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     */
    public Optional<String> phase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * @return reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String phase;
        private @Nullable String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.phase = defaults.phase;
    	      this.reason = defaults.reason;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder phase(@Nullable String phase) {
            this.phase = phase;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }        public PersistentVolumeStatus build() {
            return new PersistentVolumeStatus(message, phase, reason);
        }
    }
}
