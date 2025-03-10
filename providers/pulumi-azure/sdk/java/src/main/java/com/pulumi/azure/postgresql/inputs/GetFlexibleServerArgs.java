// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlexibleServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleServerArgs Empty = new GetFlexibleServerArgs();

    /**
     * The name of this PostgreSQL Flexible Server.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this PostgreSQL Flexible Server.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the PostgreSQL Flexible Server exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the PostgreSQL Flexible Server exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFlexibleServerArgs() {}

    private GetFlexibleServerArgs(GetFlexibleServerArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleServerArgs $;

        public Builder() {
            $ = new GetFlexibleServerArgs();
        }

        public Builder(GetFlexibleServerArgs defaults) {
            $ = new GetFlexibleServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this PostgreSQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the PostgreSQL Flexible Server exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFlexibleServerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
