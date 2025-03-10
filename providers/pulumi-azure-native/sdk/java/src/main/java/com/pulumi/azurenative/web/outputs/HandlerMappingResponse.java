// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HandlerMappingResponse {
    /**
     * @return Command-line arguments to be passed to the script processor.
     * 
     */
    private final @Nullable String arguments;
    /**
     * @return Requests with this extension will be handled using the specified FastCGI application.
     * 
     */
    private final @Nullable String extension;
    /**
     * @return The absolute path to the FastCGI application.
     * 
     */
    private final @Nullable String scriptProcessor;

    @CustomType.Constructor
    private HandlerMappingResponse(
        @CustomType.Parameter("arguments") @Nullable String arguments,
        @CustomType.Parameter("extension") @Nullable String extension,
        @CustomType.Parameter("scriptProcessor") @Nullable String scriptProcessor) {
        this.arguments = arguments;
        this.extension = extension;
        this.scriptProcessor = scriptProcessor;
    }

    /**
     * @return Command-line arguments to be passed to the script processor.
     * 
     */
    public Optional<String> arguments() {
        return Optional.ofNullable(this.arguments);
    }
    /**
     * @return Requests with this extension will be handled using the specified FastCGI application.
     * 
     */
    public Optional<String> extension() {
        return Optional.ofNullable(this.extension);
    }
    /**
     * @return The absolute path to the FastCGI application.
     * 
     */
    public Optional<String> scriptProcessor() {
        return Optional.ofNullable(this.scriptProcessor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HandlerMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arguments;
        private @Nullable String extension;
        private @Nullable String scriptProcessor;

        public Builder() {
    	      // Empty
        }

        public Builder(HandlerMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.extension = defaults.extension;
    	      this.scriptProcessor = defaults.scriptProcessor;
        }

        public Builder arguments(@Nullable String arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder extension(@Nullable String extension) {
            this.extension = extension;
            return this;
        }
        public Builder scriptProcessor(@Nullable String scriptProcessor) {
            this.scriptProcessor = scriptProcessor;
            return this;
        }        public HandlerMappingResponse build() {
            return new HandlerMappingResponse(arguments, extension, scriptProcessor);
        }
    }
}
