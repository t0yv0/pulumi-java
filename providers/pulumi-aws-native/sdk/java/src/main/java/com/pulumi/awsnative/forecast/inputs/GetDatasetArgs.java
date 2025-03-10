// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.forecast.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetArgs Empty = new GetDatasetArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetDatasetArgs() {}

    private GetDatasetArgs(GetDatasetArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetArgs $;

        public Builder() {
            $ = new GetDatasetArgs();
        }

        public Builder(GetDatasetArgs defaults) {
            $ = new GetDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetDatasetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
