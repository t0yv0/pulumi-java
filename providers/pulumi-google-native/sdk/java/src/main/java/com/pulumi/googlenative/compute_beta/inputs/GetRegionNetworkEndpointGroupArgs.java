// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNetworkEndpointGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionNetworkEndpointGroupArgs Empty = new GetRegionNetworkEndpointGroupArgs();

    @Import(name="networkEndpointGroup", required=true)
    private String networkEndpointGroup;

    public String networkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetRegionNetworkEndpointGroupArgs() {}

    private GetRegionNetworkEndpointGroupArgs(GetRegionNetworkEndpointGroupArgs $) {
        this.networkEndpointGroup = $.networkEndpointGroup;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new GetRegionNetworkEndpointGroupArgs();
        }

        public Builder(GetRegionNetworkEndpointGroupArgs defaults) {
            $ = new GetRegionNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            $.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRegionNetworkEndpointGroupArgs build() {
            $.networkEndpointGroup = Objects.requireNonNull($.networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
