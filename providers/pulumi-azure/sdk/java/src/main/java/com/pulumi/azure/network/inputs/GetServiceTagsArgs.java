// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceTagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTagsArgs Empty = new GetServiceTagsArgs();

    /**
     * The Azure Region where the Service Tags exists. This value is not used to filter the results but for specifying the region to request. For filtering by region use `location_filter` instead.  More information can be found here: [Service Tags URL parameters](https://docs.microsoft.com/en-us/rest/api/virtualnetwork/servicetags/list#uri-parameters).
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The Azure Region where the Service Tags exists. This value is not used to filter the results but for specifying the region to request. For filtering by region use `location_filter` instead.  More information can be found here: [Service Tags URL parameters](https://docs.microsoft.com/en-us/rest/api/virtualnetwork/servicetags/list#uri-parameters).
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * Changes the scope of the service tags. Can be any value that is also valid for `location`. If this field is empty then all address prefixes are considered instead of only location specific ones.
     * 
     */
    @Import(name="locationFilter")
    private @Nullable String locationFilter;

    /**
     * @return Changes the scope of the service tags. Can be any value that is also valid for `location`. If this field is empty then all address prefixes are considered instead of only location specific ones.
     * 
     */
    public Optional<String> locationFilter() {
        return Optional.ofNullable(this.locationFilter);
    }

    /**
     * The type of the service for which address prefixes will be fetched. Available service tags can be found here: [Available service tags](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    @Import(name="service", required=true)
    private String service;

    /**
     * @return The type of the service for which address prefixes will be fetched. Available service tags can be found here: [Available service tags](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    public String service() {
        return this.service;
    }

    private GetServiceTagsArgs() {}

    private GetServiceTagsArgs(GetServiceTagsArgs $) {
        this.location = $.location;
        this.locationFilter = $.locationFilter;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTagsArgs $;

        public Builder() {
            $ = new GetServiceTagsArgs();
        }

        public Builder(GetServiceTagsArgs defaults) {
            $ = new GetServiceTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the Service Tags exists. This value is not used to filter the results but for specifying the region to request. For filtering by region use `location_filter` instead.  More information can be found here: [Service Tags URL parameters](https://docs.microsoft.com/en-us/rest/api/virtualnetwork/servicetags/list#uri-parameters).
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param locationFilter Changes the scope of the service tags. Can be any value that is also valid for `location`. If this field is empty then all address prefixes are considered instead of only location specific ones.
         * 
         * @return builder
         * 
         */
        public Builder locationFilter(@Nullable String locationFilter) {
            $.locationFilter = locationFilter;
            return this;
        }

        /**
         * @param service The type of the service for which address prefixes will be fetched. Available service tags can be found here: [Available service tags](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview#available-service-tags).
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public GetServiceTagsArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
