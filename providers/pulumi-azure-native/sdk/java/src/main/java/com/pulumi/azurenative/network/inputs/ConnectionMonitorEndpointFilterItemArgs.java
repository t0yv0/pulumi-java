// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ConnectionMonitorEndpointFilterItemType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint filter item.
 * 
 */
public final class ConnectionMonitorEndpointFilterItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointFilterItemArgs Empty = new ConnectionMonitorEndpointFilterItemArgs();

    /**
     * The address of the filter item.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address of the filter item.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type;

    /**
     * @return The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
     * 
     */
    public Optional<Output<Either<String,ConnectionMonitorEndpointFilterItemType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConnectionMonitorEndpointFilterItemArgs() {}

    private ConnectionMonitorEndpointFilterItemArgs(ConnectionMonitorEndpointFilterItemArgs $) {
        this.address = $.address;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorEndpointFilterItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorEndpointFilterItemArgs $;

        public Builder() {
            $ = new ConnectionMonitorEndpointFilterItemArgs();
        }

        public Builder(ConnectionMonitorEndpointFilterItemArgs defaults) {
            $ = new ConnectionMonitorEndpointFilterItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the filter item.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the filter item.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param type The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ConnectionMonitorEndpointFilterItemType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ConnectionMonitorEndpointFilterItemType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of item included in the filter. Currently only &#39;AgentAddress&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(ConnectionMonitorEndpointFilterItemType type) {
            return type(Either.ofRight(type));
        }

        public ConnectionMonitorEndpointFilterItemArgs build() {
            return $;
        }
    }

}
