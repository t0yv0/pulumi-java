// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.enums.HeaderMatchType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes header information for http route matching.
 * 
 */
public final class HttpRouteMatchHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteMatchHeaderArgs Empty = new HttpRouteMatchHeaderArgs();

    /**
     * Name of header to match in request.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of header to match in request.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * how to match header value
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,HeaderMatchType>> type;

    /**
     * @return how to match header value
     * 
     */
    public Optional<Output<Either<String,HeaderMatchType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Value of header to match in request.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of header to match in request.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private HttpRouteMatchHeaderArgs() {}

    private HttpRouteMatchHeaderArgs(HttpRouteMatchHeaderArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteMatchHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteMatchHeaderArgs $;

        public Builder() {
            $ = new HttpRouteMatchHeaderArgs();
        }

        public Builder(HttpRouteMatchHeaderArgs defaults) {
            $ = new HttpRouteMatchHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of header to match in request.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of header to match in request.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type how to match header value
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,HeaderMatchType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type how to match header value
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,HeaderMatchType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type how to match header value
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type how to match header value
         * 
         * @return builder
         * 
         */
        public Builder type(HeaderMatchType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param value Value of header to match in request.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of header to match in request.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HttpRouteMatchHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
