// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.HierarchyInformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Represents product details
 * 
 */
public final class ProductDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductDetailsArgs Empty = new ProductDetailsArgs();

    /**
     * Hierarchy of the product which uniquely identifies the product
     * 
     */
    @Import(name="hierarchyInformation", required=true)
    private Output<HierarchyInformationArgs> hierarchyInformation;

    /**
     * @return Hierarchy of the product which uniquely identifies the product
     * 
     */
    public Output<HierarchyInformationArgs> hierarchyInformation() {
        return this.hierarchyInformation;
    }

    private ProductDetailsArgs() {}

    private ProductDetailsArgs(ProductDetailsArgs $) {
        this.hierarchyInformation = $.hierarchyInformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductDetailsArgs $;

        public Builder() {
            $ = new ProductDetailsArgs();
        }

        public Builder(ProductDetailsArgs defaults) {
            $ = new ProductDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hierarchyInformation Hierarchy of the product which uniquely identifies the product
         * 
         * @return builder
         * 
         */
        public Builder hierarchyInformation(Output<HierarchyInformationArgs> hierarchyInformation) {
            $.hierarchyInformation = hierarchyInformation;
            return this;
        }

        /**
         * @param hierarchyInformation Hierarchy of the product which uniquely identifies the product
         * 
         * @return builder
         * 
         */
        public Builder hierarchyInformation(HierarchyInformationArgs hierarchyInformation) {
            return hierarchyInformation(Output.of(hierarchyInformation));
        }

        public ProductDetailsArgs build() {
            $.hierarchyInformation = Objects.requireNonNull($.hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
            return $;
        }
    }

}
