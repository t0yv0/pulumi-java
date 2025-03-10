// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterCapacityProviderAssociationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterCapacityProviderAssociationsArgs Empty = new GetClusterCapacityProviderAssociationsArgs();

    @Import(name="cluster", required=true)
    private String cluster;

    public String cluster() {
        return this.cluster;
    }

    private GetClusterCapacityProviderAssociationsArgs() {}

    private GetClusterCapacityProviderAssociationsArgs(GetClusterCapacityProviderAssociationsArgs $) {
        this.cluster = $.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterCapacityProviderAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterCapacityProviderAssociationsArgs $;

        public Builder() {
            $ = new GetClusterCapacityProviderAssociationsArgs();
        }

        public Builder(GetClusterCapacityProviderAssociationsArgs defaults) {
            $ = new GetClusterCapacityProviderAssociationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cluster(String cluster) {
            $.cluster = cluster;
            return this;
        }

        public GetClusterCapacityProviderAssociationsArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}
