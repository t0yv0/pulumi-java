// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListProductDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListProductDetailsArgs Empty = new ListProductDetailsArgs();

    /**
     * Name of the product.
     * 
     */
    @Import(name="productName", required=true)
    private String productName;

    /**
     * @return Name of the product.
     * 
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
    private String registrationName;

    /**
     * @return Name of the Azure Stack registration.
     * 
     */
    public String registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private String resourceGroup;

    /**
     * @return Name of the resource group.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    private ListProductDetailsArgs() {}

    private ListProductDetailsArgs(ListProductDetailsArgs $) {
        this.productName = $.productName;
        this.registrationName = $.registrationName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListProductDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListProductDetailsArgs $;

        public Builder() {
            $ = new ListProductDetailsArgs();
        }

        public Builder(ListProductDetailsArgs defaults) {
            $ = new ListProductDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param productName Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder productName(String productName) {
            $.productName = productName;
            return this;
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(String registrationName) {
            $.registrationName = registrationName;
            return this;
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public ListProductDetailsArgs build() {
            $.productName = Objects.requireNonNull($.productName, "expected parameter 'productName' to be non-null");
            $.registrationName = Objects.requireNonNull($.registrationName, "expected parameter 'registrationName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
