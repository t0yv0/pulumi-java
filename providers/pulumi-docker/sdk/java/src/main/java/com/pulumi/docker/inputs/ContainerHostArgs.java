// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ContainerHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerHostArgs Empty = new ContainerHostArgs();

    /**
     * Hostname to add
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Hostname to add
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * IP address this hostname should resolve to.
     * 
     */
    @Import(name="ip", required=true)
    private Output<String> ip;

    /**
     * @return IP address this hostname should resolve to.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }

    private ContainerHostArgs() {}

    private ContainerHostArgs(ContainerHostArgs $) {
        this.host = $.host;
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerHostArgs $;

        public Builder() {
            $ = new ContainerHostArgs();
        }

        public Builder(ContainerHostArgs defaults) {
            $ = new ContainerHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Hostname to add
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname to add
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param ip IP address this hostname should resolve to.
         * 
         * @return builder
         * 
         */
        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip IP address this hostname should resolve to.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public ContainerHostArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
