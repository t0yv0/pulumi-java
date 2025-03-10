// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetOpenidConnectProviderResult {
    private final String arn;
    /**
     * @return A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
     * 
     */
    private final List<String> clientIdLists;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Map of resource tags for the IAM OIDC provider.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
     * 
     */
    private final List<String> thumbprintLists;
    private final String url;

    @CustomType.Constructor
    private GetOpenidConnectProviderResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("clientIdLists") List<String> clientIdLists,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("thumbprintLists") List<String> thumbprintLists,
        @CustomType.Parameter("url") String url) {
        this.arn = arn;
        this.clientIdLists = clientIdLists;
        this.id = id;
        this.tags = tags;
        this.thumbprintLists = thumbprintLists;
        this.url = url;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
     * 
     */
    public List<String> clientIdLists() {
        return this.clientIdLists;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Map of resource tags for the IAM OIDC provider.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
     * 
     */
    public List<String> thumbprintLists() {
        return this.thumbprintLists;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenidConnectProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> clientIdLists;
        private String id;
        private Map<String,String> tags;
        private List<String> thumbprintLists;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOpenidConnectProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clientIdLists = defaults.clientIdLists;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
    	      this.thumbprintLists = defaults.thumbprintLists;
    	      this.url = defaults.url;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder clientIdLists(List<String> clientIdLists) {
            this.clientIdLists = Objects.requireNonNull(clientIdLists);
            return this;
        }
        public Builder clientIdLists(String... clientIdLists) {
            return clientIdLists(List.of(clientIdLists));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder thumbprintLists(List<String> thumbprintLists) {
            this.thumbprintLists = Objects.requireNonNull(thumbprintLists);
            return this;
        }
        public Builder thumbprintLists(String... thumbprintLists) {
            return thumbprintLists(List.of(thumbprintLists));
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetOpenidConnectProviderResult build() {
            return new GetOpenidConnectProviderResult(arn, clientIdLists, id, tags, thumbprintLists, url);
        }
    }
}
