// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProbeArgs Empty = new ProbeArgs();

    /**
     * The interval, in seconds between probes to the backend endpoint for health status. The default value is 15, the minimum value is 5.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    /**
     * @return The interval, in seconds between probes to the backend endpoint for health status. The default value is 15, the minimum value is 5.
     * 
     */
    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * The ID of the LoadBalancer in which to create the NAT Rule.
     * 
     */
    @Import(name="loadbalancerId", required=true)
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the LoadBalancer in which to create the NAT Rule.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }

    /**
     * Specifies the name of the Probe.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Probe.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of failed probe attempts after which the backend endpoint is removed from rotation. The default value is 2. NumberOfProbes multiplied by intervalInSeconds value must be greater or equal to 10.Endpoints are returned to rotation when at least one probe is successful.
     * 
     */
    @Import(name="numberOfProbes")
    private @Nullable Output<Integer> numberOfProbes;

    /**
     * @return The number of failed probe attempts after which the backend endpoint is removed from rotation. The default value is 2. NumberOfProbes multiplied by intervalInSeconds value must be greater or equal to 10.Endpoints are returned to rotation when at least one probe is successful.
     * 
     */
    public Optional<Output<Integer>> numberOfProbes() {
        return Optional.ofNullable(this.numberOfProbes);
    }

    /**
     * Port on which the Probe queries the backend endpoint. Possible values range from 1 to 65535, inclusive.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port on which the Probe queries the backend endpoint. Possible values range from 1 to 65535, inclusive.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Specifies the protocol of the end point. Possible values are `Http`, `Https` or `Tcp`. If TCP is specified, a received ACK is required for the probe to be successful. If HTTP is specified, a 200 OK response from the specified URI is required for the probe to be successful.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Specifies the protocol of the end point. Possible values are `Http`, `Https` or `Tcp`. If TCP is specified, a received ACK is required for the probe to be successful. If HTTP is specified, a 200 OK response from the specified URI is required for the probe to be successful.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The URI used for requesting health status from the backend endpoint. Required if protocol is set to `Http` or `Https`. Otherwise, it is not allowed.
     * 
     */
    @Import(name="requestPath")
    private @Nullable Output<String> requestPath;

    /**
     * @return The URI used for requesting health status from the backend endpoint. Required if protocol is set to `Http` or `Https`. Otherwise, it is not allowed.
     * 
     */
    public Optional<Output<String>> requestPath() {
        return Optional.ofNullable(this.requestPath);
    }

    private ProbeArgs() {}

    private ProbeArgs(ProbeArgs $) {
        this.intervalInSeconds = $.intervalInSeconds;
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
        this.numberOfProbes = $.numberOfProbes;
        this.port = $.port;
        this.protocol = $.protocol;
        this.requestPath = $.requestPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProbeArgs $;

        public Builder() {
            $ = new ProbeArgs();
        }

        public Builder(ProbeArgs defaults) {
            $ = new ProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param intervalInSeconds The interval, in seconds between probes to the backend endpoint for health status. The default value is 15, the minimum value is 5.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds The interval, in seconds between probes to the backend endpoint for health status. The default value is 15, the minimum value is 5.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param loadbalancerId The ID of the LoadBalancer in which to create the NAT Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the LoadBalancer in which to create the NAT Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the Probe.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Probe.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param numberOfProbes The number of failed probe attempts after which the backend endpoint is removed from rotation. The default value is 2. NumberOfProbes multiplied by intervalInSeconds value must be greater or equal to 10.Endpoints are returned to rotation when at least one probe is successful.
         * 
         * @return builder
         * 
         */
        public Builder numberOfProbes(@Nullable Output<Integer> numberOfProbes) {
            $.numberOfProbes = numberOfProbes;
            return this;
        }

        /**
         * @param numberOfProbes The number of failed probe attempts after which the backend endpoint is removed from rotation. The default value is 2. NumberOfProbes multiplied by intervalInSeconds value must be greater or equal to 10.Endpoints are returned to rotation when at least one probe is successful.
         * 
         * @return builder
         * 
         */
        public Builder numberOfProbes(Integer numberOfProbes) {
            return numberOfProbes(Output.of(numberOfProbes));
        }

        /**
         * @param port Port on which the Probe queries the backend endpoint. Possible values range from 1 to 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port on which the Probe queries the backend endpoint. Possible values range from 1 to 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Specifies the protocol of the end point. Possible values are `Http`, `Https` or `Tcp`. If TCP is specified, a received ACK is required for the probe to be successful. If HTTP is specified, a 200 OK response from the specified URI is required for the probe to be successful.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Specifies the protocol of the end point. Possible values are `Http`, `Https` or `Tcp`. If TCP is specified, a received ACK is required for the probe to be successful. If HTTP is specified, a 200 OK response from the specified URI is required for the probe to be successful.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param requestPath The URI used for requesting health status from the backend endpoint. Required if protocol is set to `Http` or `Https`. Otherwise, it is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(@Nullable Output<String> requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        /**
         * @param requestPath The URI used for requesting health status from the backend endpoint. Required if protocol is set to `Http` or `Https`. Otherwise, it is not allowed.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(String requestPath) {
            return requestPath(Output.of(requestPath));
        }

        public ProbeArgs build() {
            $.loadbalancerId = Objects.requireNonNull($.loadbalancerId, "expected parameter 'loadbalancerId' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
