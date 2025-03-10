// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.enums.BackendRulePathTranslation;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A backend rule provides configuration for an individual API element.
 * 
 */
public final class BackendRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendRuleArgs Empty = new BackendRuleArgs();

    /**
     * The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
     * 
     */
    @Import(name="deadline")
    private @Nullable Output<Double> deadline;

    /**
     * @return The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
     * 
     */
    public Optional<Output<Double>> deadline() {
        return Optional.ofNullable(this.deadline);
    }

    /**
     * When disable_auth is true, a JWT ID token won&#39;t be generated and the original &#34;Authorization&#34; HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
     * 
     */
    @Import(name="disableAuth")
    private @Nullable Output<Boolean> disableAuth;

    /**
     * @return When disable_auth is true, a JWT ID token won&#39;t be generated and the original &#34;Authorization&#34; HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
     * 
     */
    public Optional<Output<Boolean>> disableAuth() {
        return Optional.ofNullable(this.disableAuth);
    }

    /**
     * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP &#34;authorization&#34; header, and sent to the backend.
     * 
     */
    @Import(name="jwtAudience")
    private @Nullable Output<String> jwtAudience;

    /**
     * @return The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP &#34;authorization&#34; header, and sent to the backend.
     * 
     */
    public Optional<Output<String>> jwtAudience() {
        return Optional.ofNullable(this.jwtAudience);
    }

    /**
     * The number of seconds to wait for the completion of a long running operation. The default is no deadline.
     * 
     */
    @Import(name="operationDeadline")
    private @Nullable Output<Double> operationDeadline;

    /**
     * @return The number of seconds to wait for the completion of a long running operation. The default is no deadline.
     * 
     */
    public Optional<Output<Double>> operationDeadline() {
        return Optional.ofNullable(this.operationDeadline);
    }

    @Import(name="pathTranslation")
    private @Nullable Output<BackendRulePathTranslation> pathTranslation;

    public Optional<Output<BackendRulePathTranslation>> pathTranslation() {
        return Optional.ofNullable(this.pathTranslation);
    }

    /**
     * The protocol used for sending a request to the backend. The supported values are &#34;http/1.1&#34; and &#34;h2&#34;. The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to &#34;h2&#34; for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol used for sending a request to the backend. The supported values are &#34;http/1.1&#34; and &#34;h2&#34;. The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to &#34;h2&#34; for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private BackendRuleArgs() {}

    private BackendRuleArgs(BackendRuleArgs $) {
        this.address = $.address;
        this.deadline = $.deadline;
        this.disableAuth = $.disableAuth;
        this.jwtAudience = $.jwtAudience;
        this.operationDeadline = $.operationDeadline;
        this.pathTranslation = $.pathTranslation;
        this.protocol = $.protocol;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendRuleArgs $;

        public Builder() {
            $ = new BackendRuleArgs();
        }

        public Builder(BackendRuleArgs defaults) {
            $ = new BackendRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the API backend. The scheme is used to determine the backend protocol and security. The following schemes are accepted: SCHEME PROTOCOL SECURITY http:// HTTP None https:// HTTP TLS grpc:// gRPC None grpcs:// gRPC TLS It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting behaviors across platforms. If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with TLS For HTTP backends, use protocol to specify the protocol version.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param deadline The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder deadline(@Nullable Output<Double> deadline) {
            $.deadline = deadline;
            return this;
        }

        /**
         * @param deadline The number of seconds to wait for a response from a request. The default varies based on the request protocol and deployment environment.
         * 
         * @return builder
         * 
         */
        public Builder deadline(Double deadline) {
            return deadline(Output.of(deadline));
        }

        /**
         * @param disableAuth When disable_auth is true, a JWT ID token won&#39;t be generated and the original &#34;Authorization&#34; HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
         * 
         * @return builder
         * 
         */
        public Builder disableAuth(@Nullable Output<Boolean> disableAuth) {
            $.disableAuth = disableAuth;
            return this;
        }

        /**
         * @param disableAuth When disable_auth is true, a JWT ID token won&#39;t be generated and the original &#34;Authorization&#34; HTTP header will be preserved. If the header is used to carry the original token and is expected by the backend, this field must be set to true to preserve the header.
         * 
         * @return builder
         * 
         */
        public Builder disableAuth(Boolean disableAuth) {
            return disableAuth(Output.of(disableAuth));
        }

        /**
         * @param jwtAudience The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP &#34;authorization&#34; header, and sent to the backend.
         * 
         * @return builder
         * 
         */
        public Builder jwtAudience(@Nullable Output<String> jwtAudience) {
            $.jwtAudience = jwtAudience;
            return this;
        }

        /**
         * @param jwtAudience The JWT audience is used when generating a JWT ID token for the backend. This ID token will be added in the HTTP &#34;authorization&#34; header, and sent to the backend.
         * 
         * @return builder
         * 
         */
        public Builder jwtAudience(String jwtAudience) {
            return jwtAudience(Output.of(jwtAudience));
        }

        /**
         * @param operationDeadline The number of seconds to wait for the completion of a long running operation. The default is no deadline.
         * 
         * @return builder
         * 
         */
        public Builder operationDeadline(@Nullable Output<Double> operationDeadline) {
            $.operationDeadline = operationDeadline;
            return this;
        }

        /**
         * @param operationDeadline The number of seconds to wait for the completion of a long running operation. The default is no deadline.
         * 
         * @return builder
         * 
         */
        public Builder operationDeadline(Double operationDeadline) {
            return operationDeadline(Output.of(operationDeadline));
        }

        public Builder pathTranslation(@Nullable Output<BackendRulePathTranslation> pathTranslation) {
            $.pathTranslation = pathTranslation;
            return this;
        }

        public Builder pathTranslation(BackendRulePathTranslation pathTranslation) {
            return pathTranslation(Output.of(pathTranslation));
        }

        /**
         * @param protocol The protocol used for sending a request to the backend. The supported values are &#34;http/1.1&#34; and &#34;h2&#34;. The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to &#34;h2&#34; for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used for sending a request to the backend. The supported values are &#34;http/1.1&#34; and &#34;h2&#34;. The default value is inferred from the scheme in the address field: SCHEME PROTOCOL http:// http/1.1 https:// http/1.1 grpc:// h2 grpcs:// h2 For secure HTTP backends (https://) that support HTTP/2, set this field to &#34;h2&#34; for improved performance. Configuring this field to non-default values is only supported for secure HTTP backends. This field will be ignored for all other backends. See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids for more details on the supported values.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public BackendRuleArgs build() {
            return $;
        }
    }

}
