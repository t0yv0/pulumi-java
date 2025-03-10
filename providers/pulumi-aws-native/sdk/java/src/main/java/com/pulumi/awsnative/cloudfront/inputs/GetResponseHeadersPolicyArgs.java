// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicyArgs Empty = new GetResponseHeadersPolicyArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetResponseHeadersPolicyArgs() {}

    private GetResponseHeadersPolicyArgs(GetResponseHeadersPolicyArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponseHeadersPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponseHeadersPolicyArgs $;

        public Builder() {
            $ = new GetResponseHeadersPolicyArgs();
        }

        public Builder(GetResponseHeadersPolicyArgs defaults) {
            $ = new GetResponseHeadersPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetResponseHeadersPolicyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
