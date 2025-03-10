// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackagingGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackagingGroupArgs Empty = new GetPackagingGroupArgs();

    /**
     * The ID of the PackagingGroup.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the PackagingGroup.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetPackagingGroupArgs() {}

    private GetPackagingGroupArgs(GetPackagingGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackagingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackagingGroupArgs $;

        public Builder() {
            $ = new GetPackagingGroupArgs();
        }

        public Builder(GetPackagingGroupArgs defaults) {
            $ = new GetPackagingGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the PackagingGroup.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetPackagingGroupArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
