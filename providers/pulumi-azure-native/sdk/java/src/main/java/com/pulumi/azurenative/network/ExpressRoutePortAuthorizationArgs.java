// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRoutePortAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRoutePortAuthorizationArgs Empty = new ExpressRoutePortAuthorizationArgs();

    /**
     * The name of the authorization.
     * 
     */
    @Import(name="authorizationName")
    private @Nullable Output<String> authorizationName;

    /**
     * @return The name of the authorization.
     * 
     */
    public Optional<Output<String>> authorizationName() {
        return Optional.ofNullable(this.authorizationName);
    }

    /**
     * The name of the express route port.
     * 
     */
    @Import(name="expressRoutePortName", required=true)
    private Output<String> expressRoutePortName;

    /**
     * @return The name of the express route port.
     * 
     */
    public Output<String> expressRoutePortName() {
        return this.expressRoutePortName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ExpressRoutePortAuthorizationArgs() {}

    private ExpressRoutePortAuthorizationArgs(ExpressRoutePortAuthorizationArgs $) {
        this.authorizationName = $.authorizationName;
        this.expressRoutePortName = $.expressRoutePortName;
        this.id = $.id;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRoutePortAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRoutePortAuthorizationArgs $;

        public Builder() {
            $ = new ExpressRoutePortAuthorizationArgs();
        }

        public Builder(ExpressRoutePortAuthorizationArgs defaults) {
            $ = new ExpressRoutePortAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationName The name of the authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationName(@Nullable Output<String> authorizationName) {
            $.authorizationName = authorizationName;
            return this;
        }

        /**
         * @param authorizationName The name of the authorization.
         * 
         * @return builder
         * 
         */
        public Builder authorizationName(String authorizationName) {
            return authorizationName(Output.of(authorizationName));
        }

        /**
         * @param expressRoutePortName The name of the express route port.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(Output<String> expressRoutePortName) {
            $.expressRoutePortName = expressRoutePortName;
            return this;
        }

        /**
         * @param expressRoutePortName The name of the express route port.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(String expressRoutePortName) {
            return expressRoutePortName(Output.of(expressRoutePortName));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ExpressRoutePortAuthorizationArgs build() {
            $.expressRoutePortName = Objects.requireNonNull($.expressRoutePortName, "expected parameter 'expressRoutePortName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
