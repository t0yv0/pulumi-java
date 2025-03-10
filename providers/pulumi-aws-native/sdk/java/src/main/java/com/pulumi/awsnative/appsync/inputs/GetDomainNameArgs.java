// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appsync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDomainNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainNameArgs Empty = new GetDomainNameArgs();

    @Import(name="domainName", required=true)
    private String domainName;

    public String domainName() {
        return this.domainName;
    }

    private GetDomainNameArgs() {}

    private GetDomainNameArgs(GetDomainNameArgs $) {
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainNameArgs $;

        public Builder() {
            $ = new GetDomainNameArgs();
        }

        public Builder(GetDomainNameArgs defaults) {
            $ = new GetDomainNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        public GetDomainNameArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
