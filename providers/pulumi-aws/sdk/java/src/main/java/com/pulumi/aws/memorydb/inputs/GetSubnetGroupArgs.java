// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetGroupArgs Empty = new GetSubnetGroupArgs();

    /**
     * Name of the subnet group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the subnet group.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A map of tags assigned to the subnet group.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags assigned to the subnet group.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSubnetGroupArgs() {}

    private GetSubnetGroupArgs(GetSubnetGroupArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetGroupArgs $;

        public Builder() {
            $ = new GetSubnetGroupArgs();
        }

        public Builder(GetSubnetGroupArgs defaults) {
            $ = new GetSubnetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the subnet group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetSubnetGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
