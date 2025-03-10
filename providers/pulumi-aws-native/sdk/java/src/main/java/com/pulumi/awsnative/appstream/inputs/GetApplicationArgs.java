// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetApplicationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
