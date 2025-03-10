// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamArgs Empty = new GetStreamArgs();

    /**
     * The name of the Kinesis Stream.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Kinesis Stream.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A map of tags to assigned to the stream.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags to assigned to the stream.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetStreamArgs() {}

    private GetStreamArgs(GetStreamArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamArgs $;

        public Builder() {
            $ = new GetStreamArgs();
        }

        public Builder(GetStreamArgs defaults) {
            $ = new GetStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Kinesis Stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A map of tags to assigned to the stream.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetStreamArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
