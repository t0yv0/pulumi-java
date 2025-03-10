// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceManagerProxy.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ServiceManagerProxy.inputs.GetServiceEnvironmentsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceEnvironmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceEnvironmentsArgs Empty = new GetServiceEnvironmentsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The display name of the resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The display name of the resource.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetServiceEnvironmentsFilter> filters;

    public Optional<List<GetServiceEnvironmentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The unique identifier associated with the service environment.
     * 
     */
    @Import(name="serviceEnvironmentId")
    private @Nullable String serviceEnvironmentId;

    /**
     * @return The unique identifier associated with the service environment.
     * 
     */
    public Optional<String> serviceEnvironmentId() {
        return Optional.ofNullable(this.serviceEnvironmentId);
    }

    /**
     * The environment&#39;s service definition type.  For example, &#34;RGBUOROMS&#34; is the service definition type for &#34;Oracle Retail Order Management Cloud Service&#34;.
     * 
     */
    @Import(name="serviceEnvironmentType")
    private @Nullable String serviceEnvironmentType;

    /**
     * @return The environment&#39;s service definition type.  For example, &#34;RGBUOROMS&#34; is the service definition type for &#34;Oracle Retail Order Management Cloud Service&#34;.
     * 
     */
    public Optional<String> serviceEnvironmentType() {
        return Optional.ofNullable(this.serviceEnvironmentType);
    }

    private GetServiceEnvironmentsArgs() {}

    private GetServiceEnvironmentsArgs(GetServiceEnvironmentsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.serviceEnvironmentId = $.serviceEnvironmentId;
        this.serviceEnvironmentType = $.serviceEnvironmentType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceEnvironmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceEnvironmentsArgs $;

        public Builder() {
            $ = new GetServiceEnvironmentsArgs();
        }

        public Builder(GetServiceEnvironmentsArgs defaults) {
            $ = new GetServiceEnvironmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName The display name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetServiceEnvironmentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetServiceEnvironmentsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param serviceEnvironmentId The unique identifier associated with the service environment.
         * 
         * @return builder
         * 
         */
        public Builder serviceEnvironmentId(@Nullable String serviceEnvironmentId) {
            $.serviceEnvironmentId = serviceEnvironmentId;
            return this;
        }

        /**
         * @param serviceEnvironmentType The environment&#39;s service definition type.  For example, &#34;RGBUOROMS&#34; is the service definition type for &#34;Oracle Retail Order Management Cloud Service&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serviceEnvironmentType(@Nullable String serviceEnvironmentType) {
            $.serviceEnvironmentType = serviceEnvironmentType;
            return this;
        }

        public GetServiceEnvironmentsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
