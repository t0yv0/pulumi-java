// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerAzureADOnlyAuthenticationResult {
    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    private final Boolean azureADOnlyAuthentication;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerAzureADOnlyAuthenticationResult(
        @CustomType.Parameter("azureADOnlyAuthentication") Boolean azureADOnlyAuthentication,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAzureADOnlyAuthenticationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean azureADOnlyAuthentication;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAzureADOnlyAuthenticationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerAzureADOnlyAuthenticationResult build() {
            return new GetServerAzureADOnlyAuthenticationResult(azureADOnlyAuthentication, id, name, type);
        }
    }
}
