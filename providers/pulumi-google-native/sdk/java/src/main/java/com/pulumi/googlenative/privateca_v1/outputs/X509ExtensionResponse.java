// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1.outputs.ObjectIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class X509ExtensionResponse {
    /**
     * @return Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    private final Boolean critical;
    /**
     * @return The OID for this X.509 extension.
     * 
     */
    private final ObjectIdResponse objectId;
    /**
     * @return The value of this X.509 extension.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private X509ExtensionResponse(
        @CustomType.Parameter("critical") Boolean critical,
        @CustomType.Parameter("objectId") ObjectIdResponse objectId,
        @CustomType.Parameter("value") String value) {
        this.critical = critical;
        this.objectId = objectId;
        this.value = value;
    }

    /**
     * @return Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    public Boolean critical() {
        return this.critical;
    }
    /**
     * @return The OID for this X.509 extension.
     * 
     */
    public ObjectIdResponse objectId() {
        return this.objectId;
    }
    /**
     * @return The value of this X.509 extension.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean critical;
        private ObjectIdResponse objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(Boolean critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }
        public Builder objectId(ObjectIdResponse objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public X509ExtensionResponse build() {
            return new X509ExtensionResponse(critical, objectId, value);
        }
    }
}
