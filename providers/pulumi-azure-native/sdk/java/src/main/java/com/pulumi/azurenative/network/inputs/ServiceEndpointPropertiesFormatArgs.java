// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The service endpoint properties.
 * 
 */
public final class ServiceEndpointPropertiesFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPropertiesFormatArgs Empty = new ServiceEndpointPropertiesFormatArgs();

    /**
     * A list of locations.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return A list of locations.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * The type of the endpoint service.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The type of the endpoint service.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private ServiceEndpointPropertiesFormatArgs() {}

    private ServiceEndpointPropertiesFormatArgs(ServiceEndpointPropertiesFormatArgs $) {
        this.locations = $.locations;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEndpointPropertiesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEndpointPropertiesFormatArgs $;

        public Builder() {
            $ = new ServiceEndpointPropertiesFormatArgs();
        }

        public Builder(ServiceEndpointPropertiesFormatArgs defaults) {
            $ = new ServiceEndpointPropertiesFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locations A list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations A list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations A list of locations.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param service The type of the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The type of the endpoint service.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ServiceEndpointPropertiesFormatArgs build() {
            return $;
        }
    }

}
