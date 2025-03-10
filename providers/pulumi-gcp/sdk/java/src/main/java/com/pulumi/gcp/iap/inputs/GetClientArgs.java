// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClientArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientArgs Empty = new GetClientArgs();

    /**
     * The name of the brand.
     * 
     */
    @Import(name="brand", required=true)
    private String brand;

    /**
     * @return The name of the brand.
     * 
     */
    public String brand() {
        return this.brand;
    }

    /**
     * The client_id of the brand.
     * 
     */
    @Import(name="clientId", required=true)
    private String clientId;

    /**
     * @return The client_id of the brand.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    private GetClientArgs() {}

    private GetClientArgs(GetClientArgs $) {
        this.brand = $.brand;
        this.clientId = $.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientArgs $;

        public Builder() {
            $ = new GetClientArgs();
        }

        public Builder(GetClientArgs defaults) {
            $ = new GetClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brand The name of the brand.
         * 
         * @return builder
         * 
         */
        public Builder brand(String brand) {
            $.brand = brand;
            return this;
        }

        /**
         * @param clientId The client_id of the brand.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            $.clientId = clientId;
            return this;
        }

        public GetClientArgs build() {
            $.brand = Objects.requireNonNull($.brand, "expected parameter 'brand' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            return $;
        }
    }

}
