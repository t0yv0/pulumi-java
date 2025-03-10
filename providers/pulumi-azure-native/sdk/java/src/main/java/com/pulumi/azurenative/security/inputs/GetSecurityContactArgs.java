// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityContactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityContactArgs Empty = new GetSecurityContactArgs();

    /**
     * Name of the security contact object
     * 
     */
    @Import(name="securityContactName", required=true)
    private String securityContactName;

    /**
     * @return Name of the security contact object
     * 
     */
    public String securityContactName() {
        return this.securityContactName;
    }

    private GetSecurityContactArgs() {}

    private GetSecurityContactArgs(GetSecurityContactArgs $) {
        this.securityContactName = $.securityContactName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityContactArgs $;

        public Builder() {
            $ = new GetSecurityContactArgs();
        }

        public Builder(GetSecurityContactArgs defaults) {
            $ = new GetSecurityContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityContactName Name of the security contact object
         * 
         * @return builder
         * 
         */
        public Builder securityContactName(String securityContactName) {
            $.securityContactName = securityContactName;
            return this;
        }

        public GetSecurityContactArgs build() {
            $.securityContactName = Objects.requireNonNull($.securityContactName, "expected parameter 'securityContactName' to be non-null");
            return $;
        }
    }

}
