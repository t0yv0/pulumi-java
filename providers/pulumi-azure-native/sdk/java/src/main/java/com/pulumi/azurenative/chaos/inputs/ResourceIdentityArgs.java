// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.azurenative.chaos.enums.ResourceIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The managed identity of a resource.
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * String of the resource identity type.
     * 
     */
    @Import(name="type", required=true)
    private Output<ResourceIdentityType> type;

    /**
     * @return String of the resource identity type.
     * 
     */
    public Output<ResourceIdentityType> type() {
        return this.type;
    }

    private ResourceIdentityArgs() {}

    private ResourceIdentityArgs(ResourceIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityArgs $;

        public Builder() {
            $ = new ResourceIdentityArgs();
        }

        public Builder(ResourceIdentityArgs defaults) {
            $ = new ResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type String of the resource identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<ResourceIdentityType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type String of the resource identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(ResourceIdentityType type) {
            return type(Output.of(type));
        }

        public ResourceIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
