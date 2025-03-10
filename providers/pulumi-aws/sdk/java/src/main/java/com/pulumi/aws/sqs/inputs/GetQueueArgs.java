// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sqs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueArgs Empty = new GetQueueArgs();

    /**
     * The name of the queue to match.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the queue to match.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags for the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetQueueArgs() {}

    private GetQueueArgs(GetQueueArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueueArgs $;

        public Builder() {
            $ = new GetQueueArgs();
        }

        public Builder(GetQueueArgs defaults) {
            $ = new GetQueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the queue to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetQueueArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
