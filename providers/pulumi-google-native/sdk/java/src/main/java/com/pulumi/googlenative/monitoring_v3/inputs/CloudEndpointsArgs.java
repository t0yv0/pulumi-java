// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud Endpoints service. Learn more at https://cloud.google.com/endpoints.
 * 
 */
public final class CloudEndpointsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudEndpointsArgs Empty = new CloudEndpointsArgs();

    /**
     * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private CloudEndpointsArgs() {}

    private CloudEndpointsArgs(CloudEndpointsArgs $) {
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudEndpointsArgs $;

        public Builder() {
            $ = new CloudEndpointsArgs();
        }

        public Builder(CloudEndpointsArgs defaults) {
            $ = new CloudEndpointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param service The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource: https://cloud.google.com/monitoring/api/resources#tag_api
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public CloudEndpointsArgs build() {
            return $;
        }
    }

}
