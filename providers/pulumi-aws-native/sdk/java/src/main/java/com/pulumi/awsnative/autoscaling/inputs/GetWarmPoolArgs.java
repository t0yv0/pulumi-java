// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWarmPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWarmPoolArgs Empty = new GetWarmPoolArgs();

    @Import(name="autoScalingGroupName", required=true)
    private String autoScalingGroupName;

    public String autoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    private GetWarmPoolArgs() {}

    private GetWarmPoolArgs(GetWarmPoolArgs $) {
        this.autoScalingGroupName = $.autoScalingGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWarmPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWarmPoolArgs $;

        public Builder() {
            $ = new GetWarmPoolArgs();
        }

        public Builder(GetWarmPoolArgs defaults) {
            $ = new GetWarmPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoScalingGroupName(String autoScalingGroupName) {
            $.autoScalingGroupName = autoScalingGroupName;
            return this;
        }

        public GetWarmPoolArgs build() {
            $.autoScalingGroupName = Objects.requireNonNull($.autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
            return $;
        }
    }

}
