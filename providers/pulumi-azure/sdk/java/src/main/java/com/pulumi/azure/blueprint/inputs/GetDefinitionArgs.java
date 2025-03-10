// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefinitionArgs Empty = new GetDefinitionArgs();

    /**
     * The name of the Blueprint.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Blueprint.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the Subscription or Management Group, as the scope at which the blueprint definition is stored.
     * 
     */
    @Import(name="scopeId", required=true)
    private String scopeId;

    /**
     * @return The ID of the Subscription or Management Group, as the scope at which the blueprint definition is stored.
     * 
     */
    public String scopeId() {
        return this.scopeId;
    }

    private GetDefinitionArgs() {}

    private GetDefinitionArgs(GetDefinitionArgs $) {
        this.name = $.name;
        this.scopeId = $.scopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefinitionArgs $;

        public Builder() {
            $ = new GetDefinitionArgs();
        }

        public Builder(GetDefinitionArgs defaults) {
            $ = new GetDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Blueprint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param scopeId The ID of the Subscription or Management Group, as the scope at which the blueprint definition is stored.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(String scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        public GetDefinitionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scopeId = Objects.requireNonNull($.scopeId, "expected parameter 'scopeId' to be non-null");
            return $;
        }
    }

}
