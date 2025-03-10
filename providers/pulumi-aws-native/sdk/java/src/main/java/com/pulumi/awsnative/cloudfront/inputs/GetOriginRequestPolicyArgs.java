// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOriginRequestPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOriginRequestPolicyArgs Empty = new GetOriginRequestPolicyArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetOriginRequestPolicyArgs() {}

    private GetOriginRequestPolicyArgs(GetOriginRequestPolicyArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginRequestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginRequestPolicyArgs $;

        public Builder() {
            $ = new GetOriginRequestPolicyArgs();
        }

        public Builder(GetOriginRequestPolicyArgs defaults) {
            $ = new GetOriginRequestPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetOriginRequestPolicyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
