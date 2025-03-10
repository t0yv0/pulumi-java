// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The detector information. By default this is not populated, unless it&#39;s specified in expandDetector
 * 
 */
public final class DetectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorArgs Empty = new DetectorArgs();

    /**
     * The Smart Detector description. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Smart Detector description. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The detector id.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The detector id.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The Smart Detector image path. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    @Import(name="imagePaths")
    private @Nullable Output<List<String>> imagePaths;

    /**
     * @return The Smart Detector image path. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    public Optional<Output<List<String>>> imagePaths() {
        return Optional.ofNullable(this.imagePaths);
    }

    /**
     * The Smart Detector name. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Smart Detector name. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The detector&#39;s parameters.&#39;
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return The detector&#39;s parameters.&#39;
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The Smart Detector supported resource types. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    @Import(name="supportedResourceTypes")
    private @Nullable Output<List<String>> supportedResourceTypes;

    /**
     * @return The Smart Detector supported resource types. By default this is not populated, unless it&#39;s specified in expandDetector
     * 
     */
    public Optional<Output<List<String>>> supportedResourceTypes() {
        return Optional.ofNullable(this.supportedResourceTypes);
    }

    private DetectorArgs() {}

    private DetectorArgs(DetectorArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.imagePaths = $.imagePaths;
        this.name = $.name;
        this.parameters = $.parameters;
        this.supportedResourceTypes = $.supportedResourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorArgs $;

        public Builder() {
            $ = new DetectorArgs();
        }

        public Builder(DetectorArgs defaults) {
            $ = new DetectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The Smart Detector description. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Smart Detector description. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id The detector id.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The detector id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param imagePaths The Smart Detector image path. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder imagePaths(@Nullable Output<List<String>> imagePaths) {
            $.imagePaths = imagePaths;
            return this;
        }

        /**
         * @param imagePaths The Smart Detector image path. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder imagePaths(List<String> imagePaths) {
            return imagePaths(Output.of(imagePaths));
        }

        /**
         * @param imagePaths The Smart Detector image path. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder imagePaths(String... imagePaths) {
            return imagePaths(List.of(imagePaths));
        }

        /**
         * @param name The Smart Detector name. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Smart Detector name. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The detector&#39;s parameters.&#39;
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The detector&#39;s parameters.&#39;
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param supportedResourceTypes The Smart Detector supported resource types. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder supportedResourceTypes(@Nullable Output<List<String>> supportedResourceTypes) {
            $.supportedResourceTypes = supportedResourceTypes;
            return this;
        }

        /**
         * @param supportedResourceTypes The Smart Detector supported resource types. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder supportedResourceTypes(List<String> supportedResourceTypes) {
            return supportedResourceTypes(Output.of(supportedResourceTypes));
        }

        /**
         * @param supportedResourceTypes The Smart Detector supported resource types. By default this is not populated, unless it&#39;s specified in expandDetector
         * 
         * @return builder
         * 
         */
        public Builder supportedResourceTypes(String... supportedResourceTypes) {
            return supportedResourceTypes(List.of(supportedResourceTypes));
        }

        public DetectorArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
