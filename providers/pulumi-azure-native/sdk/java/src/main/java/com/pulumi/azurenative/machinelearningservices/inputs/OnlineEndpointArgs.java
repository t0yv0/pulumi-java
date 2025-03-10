// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.EndpointAuthMode;
import com.pulumi.azurenative.machinelearningservices.inputs.EndpointAuthKeysArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Online endpoint configuration
 * 
 */
public final class OnlineEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineEndpointArgs Empty = new OnlineEndpointArgs();

    /**
     * [Required] Inference endpoint authentication mode type
     * 
     */
    @Import(name="authMode", required=true)
    private Output<Either<String,EndpointAuthMode>> authMode;

    /**
     * @return [Required] Inference endpoint authentication mode type
     * 
     */
    public Output<Either<String,EndpointAuthMode>> authMode() {
        return this.authMode;
    }

    /**
     * Description of the inference endpoint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the inference endpoint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * EndpointAuthKeys to set initially on an Endpoint.
     * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<EndpointAuthKeysArgs> keys;

    /**
     * @return EndpointAuthKeys to set initially on an Endpoint.
     * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
     * 
     */
    public Optional<Output<EndpointAuthKeysArgs>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * ARM resource ID of the compute if it exists.
     * optional
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return ARM resource ID of the compute if it exists.
     * optional
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    @Import(name="traffic")
    private @Nullable Output<Map<String,Integer>> traffic;

    /**
     * @return Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    public Optional<Output<Map<String,Integer>>> traffic() {
        return Optional.ofNullable(this.traffic);
    }

    private OnlineEndpointArgs() {}

    private OnlineEndpointArgs(OnlineEndpointArgs $) {
        this.authMode = $.authMode;
        this.description = $.description;
        this.keys = $.keys;
        this.properties = $.properties;
        this.target = $.target;
        this.traffic = $.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineEndpointArgs $;

        public Builder() {
            $ = new OnlineEndpointArgs();
        }

        public Builder(OnlineEndpointArgs defaults) {
            $ = new OnlineEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authMode [Required] Inference endpoint authentication mode type
         * 
         * @return builder
         * 
         */
        public Builder authMode(Output<Either<String,EndpointAuthMode>> authMode) {
            $.authMode = authMode;
            return this;
        }

        /**
         * @param authMode [Required] Inference endpoint authentication mode type
         * 
         * @return builder
         * 
         */
        public Builder authMode(Either<String,EndpointAuthMode> authMode) {
            return authMode(Output.of(authMode));
        }

        /**
         * @param authMode [Required] Inference endpoint authentication mode type
         * 
         * @return builder
         * 
         */
        public Builder authMode(String authMode) {
            return authMode(Either.ofLeft(authMode));
        }

        /**
         * @param authMode [Required] Inference endpoint authentication mode type
         * 
         * @return builder
         * 
         */
        public Builder authMode(EndpointAuthMode authMode) {
            return authMode(Either.ofRight(authMode));
        }

        /**
         * @param description Description of the inference endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the inference endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param keys EndpointAuthKeys to set initially on an Endpoint.
         * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<EndpointAuthKeysArgs> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys EndpointAuthKeys to set initially on an Endpoint.
         * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
         * 
         * @return builder
         * 
         */
        public Builder keys(EndpointAuthKeysArgs keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param properties Property dictionary. Properties can be added, but not removed or altered.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Property dictionary. Properties can be added, but not removed or altered.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param target ARM resource ID of the compute if it exists.
         * optional
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target ARM resource ID of the compute if it exists.
         * optional
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param traffic Traffic rules on how the traffic will be routed across deployments.
         * 
         * @return builder
         * 
         */
        public Builder traffic(@Nullable Output<Map<String,Integer>> traffic) {
            $.traffic = traffic;
            return this;
        }

        /**
         * @param traffic Traffic rules on how the traffic will be routed across deployments.
         * 
         * @return builder
         * 
         */
        public Builder traffic(Map<String,Integer> traffic) {
            return traffic(Output.of(traffic));
        }

        public OnlineEndpointArgs build() {
            $.authMode = Objects.requireNonNull($.authMode, "expected parameter 'authMode' to be non-null");
            return $;
        }
    }

}
