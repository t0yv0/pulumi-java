// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties related to ServiceBus.
 * 
 */
public final class ServiceBusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceBusArgs Empty = new ServiceBusArgs();

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<Either<String,AuthenticationType>> authenticationType;

    /**
     * @return Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    public Optional<Output<Either<String,AuthenticationType>>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="deadLetterSecret")
    private @Nullable Output<String> deadLetterSecret;

    /**
     * @return Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    public Optional<Output<String>> deadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @Import(name="deadLetterUri")
    private @Nullable Output<String> deadLetterUri;

    /**
     * @return Dead letter storage URL for identity-based authentication.
     * 
     */
    public Optional<Output<String>> deadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is &#39;ServiceBus&#39;.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    /**
     * @return The type of Digital Twins endpoint
     * Expected value is &#39;ServiceBus&#39;.
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @Import(name="endpointUri")
    private @Nullable Output<String> endpointUri;

    /**
     * @return The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    public Optional<Output<String>> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    /**
     * The ServiceBus Topic name for identity-based authentication
     * 
     */
    @Import(name="entityPath")
    private @Nullable Output<String> entityPath;

    /**
     * @return The ServiceBus Topic name for identity-based authentication
     * 
     */
    public Optional<Output<String>> entityPath() {
        return Optional.ofNullable(this.entityPath);
    }

    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="primaryConnectionString")
    private @Nullable Output<String> primaryConnectionString;

    /**
     * @return PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    public Optional<Output<String>> primaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }

    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @Import(name="secondaryConnectionString")
    private @Nullable Output<String> secondaryConnectionString;

    /**
     * @return SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    public Optional<Output<String>> secondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }

    private ServiceBusArgs() {}

    private ServiceBusArgs(ServiceBusArgs $) {
        this.authenticationType = $.authenticationType;
        this.deadLetterSecret = $.deadLetterSecret;
        this.deadLetterUri = $.deadLetterUri;
        this.endpointType = $.endpointType;
        this.endpointUri = $.endpointUri;
        this.entityPath = $.entityPath;
        this.primaryConnectionString = $.primaryConnectionString;
        this.secondaryConnectionString = $.secondaryConnectionString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusArgs $;

        public Builder() {
            $ = new ServiceBusArgs();
        }

        public Builder(ServiceBusArgs defaults) {
            $ = new ServiceBusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType Specifies the authentication type being used for connecting to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<Either<String,AuthenticationType>> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Specifies the authentication type being used for connecting to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Either<String,AuthenticationType> authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param authenticationType Specifies the authentication type being used for connecting to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Either.ofLeft(authenticationType));
        }

        /**
         * @param authenticationType Specifies the authentication type being used for connecting to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(AuthenticationType authenticationType) {
            return authenticationType(Either.ofRight(authenticationType));
        }

        /**
         * @param deadLetterSecret Dead letter storage secret for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterSecret(@Nullable Output<String> deadLetterSecret) {
            $.deadLetterSecret = deadLetterSecret;
            return this;
        }

        /**
         * @param deadLetterSecret Dead letter storage secret for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterSecret(String deadLetterSecret) {
            return deadLetterSecret(Output.of(deadLetterSecret));
        }

        /**
         * @param deadLetterUri Dead letter storage URL for identity-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterUri(@Nullable Output<String> deadLetterUri) {
            $.deadLetterUri = deadLetterUri;
            return this;
        }

        /**
         * @param deadLetterUri Dead letter storage URL for identity-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterUri(String deadLetterUri) {
            return deadLetterUri(Output.of(deadLetterUri));
        }

        /**
         * @param endpointType The type of Digital Twins endpoint
         * Expected value is &#39;ServiceBus&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType The type of Digital Twins endpoint
         * Expected value is &#39;ServiceBus&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param endpointUri The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        /**
         * @param endpointUri The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(String endpointUri) {
            return endpointUri(Output.of(endpointUri));
        }

        /**
         * @param entityPath The ServiceBus Topic name for identity-based authentication
         * 
         * @return builder
         * 
         */
        public Builder entityPath(@Nullable Output<String> entityPath) {
            $.entityPath = entityPath;
            return this;
        }

        /**
         * @param entityPath The ServiceBus Topic name for identity-based authentication
         * 
         * @return builder
         * 
         */
        public Builder entityPath(String entityPath) {
            return entityPath(Output.of(entityPath));
        }

        /**
         * @param primaryConnectionString PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(@Nullable Output<String> primaryConnectionString) {
            $.primaryConnectionString = primaryConnectionString;
            return this;
        }

        /**
         * @param primaryConnectionString PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(String primaryConnectionString) {
            return primaryConnectionString(Output.of(primaryConnectionString));
        }

        /**
         * @param secondaryConnectionString SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(@Nullable Output<String> secondaryConnectionString) {
            $.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        /**
         * @param secondaryConnectionString SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            return secondaryConnectionString(Output.of(secondaryConnectionString));
        }

        public ServiceBusArgs build() {
            $.endpointType = Codegen.stringProp("endpointType").output().arg($.endpointType).require();
            return $;
        }
    }

}
