// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudErrorBodyResponse {
    /**
     * @return Error code string.
     * 
     */
    private final String code;
    /**
     * @return More detailed error information.
     * 
     */
    private final @Nullable List<CloudErrorBodyResponse> details;
    /**
     * @return Descriptive error information.
     * 
     */
    private final String message;
    /**
     * @return Error target
     * 
     */
    private final @Nullable String target;

    @CustomType.Constructor
    private CloudErrorBodyResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("details") @Nullable List<CloudErrorBodyResponse> details,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("target") @Nullable String target) {
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    /**
     * @return Error code string.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return More detailed error information.
     * 
     */
    public List<CloudErrorBodyResponse> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return Descriptive error information.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Error target
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<CloudErrorBodyResponse> details;
        private String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder details(@Nullable List<CloudErrorBodyResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(CloudErrorBodyResponse... details) {
            return details(List.of(details));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public CloudErrorBodyResponse build() {
            return new CloudErrorBodyResponse(code, details, message, target);
        }
    }
}
