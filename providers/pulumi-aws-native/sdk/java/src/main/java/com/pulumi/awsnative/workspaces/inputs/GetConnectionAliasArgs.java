// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.workspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionAliasArgs Empty = new GetConnectionAliasArgs();

    @Import(name="aliasId", required=true)
    private String aliasId;

    public String aliasId() {
        return this.aliasId;
    }

    private GetConnectionAliasArgs() {}

    private GetConnectionAliasArgs(GetConnectionAliasArgs $) {
        this.aliasId = $.aliasId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionAliasArgs $;

        public Builder() {
            $ = new GetConnectionAliasArgs();
        }

        public Builder(GetConnectionAliasArgs defaults) {
            $ = new GetConnectionAliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliasId(String aliasId) {
            $.aliasId = aliasId;
            return this;
        }

        public GetConnectionAliasArgs build() {
            $.aliasId = Objects.requireNonNull($.aliasId, "expected parameter 'aliasId' to be non-null");
            return $;
        }
    }

}
