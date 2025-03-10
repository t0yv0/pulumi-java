// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse {
    /**
     * @return Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;. For instance a certificate can be self-signed using the following command, ```openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile &lt;(printf &#34;\nsubjectAltName=&#39;DNS:www.example.com&#39;&#34;)```
     * 
     */
    private final List<String> allowedCaCerts;
    /**
     * @return The password for HTTP Basic authentication.
     * 
     */
    private final String password;
    /**
     * @return The HTTP request headers to send together with webhook requests.
     * 
     */
    private final Map<String,String> requestHeaders;
    /**
     * @return The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    private final String uri;
    /**
     * @return The user name for HTTP Basic authentication.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(
        @CustomType.Parameter("allowedCaCerts") List<String> allowedCaCerts,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("requestHeaders") Map<String,String> requestHeaders,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("username") String username) {
        this.allowedCaCerts = allowedCaCerts;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = uri;
        this.username = username;
    }

    /**
     * @return Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store. If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates. N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;. For instance a certificate can be self-signed using the following command, ```openssl x509 -req -days 200 -in example.com.csr \ -signkey example.com.key \ -out example.com.crt \ -extfile &lt;(printf &#34;\nsubjectAltName=&#39;DNS:www.example.com&#39;&#34;)```
     * 
     */
    public List<String> allowedCaCerts() {
        return this.allowedCaCerts;
    }
    /**
     * @return The password for HTTP Basic authentication.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The HTTP request headers to send together with webhook requests.
     * 
     */
    public Map<String,String> requestHeaders() {
        return this.requestHeaders;
    }
    /**
     * @return The webhook URI for receiving POST requests. It must use https protocol.
     * 
     */
    public String uri() {
        return this.uri;
    }
    /**
     * @return The user name for HTTP Basic authentication.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCaCerts;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder allowedCaCerts(List<String> allowedCaCerts) {
            this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
            return this;
        }
        public Builder allowedCaCerts(String... allowedCaCerts) {
            return allowedCaCerts(List.of(allowedCaCerts));
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder requestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
