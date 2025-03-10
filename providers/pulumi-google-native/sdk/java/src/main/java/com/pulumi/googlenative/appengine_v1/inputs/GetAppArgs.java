// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    @Import(name="appId", required=true)
    private String appId;

    public String appId() {
        return this.appId;
    }

    private GetAppArgs() {}

    private GetAppArgs(GetAppArgs $) {
        this.appId = $.appId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppArgs $;

        public Builder() {
            $ = new GetAppArgs();
        }

        public Builder(GetAppArgs defaults) {
            $ = new GetAppArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        public GetAppArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
