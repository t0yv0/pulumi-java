// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDBProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDBProxyArgs Empty = new GetDBProxyArgs();

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyName", required=true)
    private String dBProxyName;

    /**
     * @return The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    public String dBProxyName() {
        return this.dBProxyName;
    }

    private GetDBProxyArgs() {}

    private GetDBProxyArgs(GetDBProxyArgs $) {
        this.dBProxyName = $.dBProxyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDBProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDBProxyArgs $;

        public Builder() {
            $ = new GetDBProxyArgs();
        }

        public Builder(GetDBProxyArgs defaults) {
            $ = new GetDBProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dBProxyName The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
         * 
         * @return builder
         * 
         */
        public Builder dBProxyName(String dBProxyName) {
            $.dBProxyName = dBProxyName;
            return this;
        }

        public GetDBProxyArgs build() {
            $.dBProxyName = Objects.requireNonNull($.dBProxyName, "expected parameter 'dBProxyName' to be non-null");
            return $;
        }
    }

}
