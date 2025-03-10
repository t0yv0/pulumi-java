// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.DeleteOptions;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a network interface reference.
 * 
 */
public final class NetworkInterfaceReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceReferenceArgs Empty = new NetworkInterfaceReferenceArgs();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
    private @Nullable Output<Either<String,DeleteOptions>> deleteOption;

    /**
     * @return Specify what happens to the network interface when the VM is deleted
     * 
     */
    public Optional<Output<Either<String,DeleteOptions>>> deleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    private NetworkInterfaceReferenceArgs() {}

    private NetworkInterfaceReferenceArgs(NetworkInterfaceReferenceArgs $) {
        this.deleteOption = $.deleteOption;
        this.id = $.id;
        this.primary = $.primary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceReferenceArgs $;

        public Builder() {
            $ = new NetworkInterfaceReferenceArgs();
        }

        public Builder(NetworkInterfaceReferenceArgs defaults) {
            $ = new NetworkInterfaceReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOption Specify what happens to the network interface when the VM is deleted
         * 
         * @return builder
         * 
         */
        public Builder deleteOption(@Nullable Output<Either<String,DeleteOptions>> deleteOption) {
            $.deleteOption = deleteOption;
            return this;
        }

        /**
         * @param deleteOption Specify what happens to the network interface when the VM is deleted
         * 
         * @return builder
         * 
         */
        public Builder deleteOption(Either<String,DeleteOptions> deleteOption) {
            return deleteOption(Output.of(deleteOption));
        }

        /**
         * @param deleteOption Specify what happens to the network interface when the VM is deleted
         * 
         * @return builder
         * 
         */
        public Builder deleteOption(String deleteOption) {
            return deleteOption(Either.ofLeft(deleteOption));
        }

        /**
         * @param deleteOption Specify what happens to the network interface when the VM is deleted
         * 
         * @return builder
         * 
         */
        public Builder deleteOption(DeleteOptions deleteOption) {
            return deleteOption(Either.ofRight(deleteOption));
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param primary Specifies the primary network interface in case the virtual machine has more than 1 network interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Specifies the primary network interface in case the virtual machine has more than 1 network interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        public NetworkInterfaceReferenceArgs build() {
            return $;
        }
    }

}
