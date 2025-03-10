// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Secret {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return Data contains the secret data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    private final @Nullable Map<String,String> data;
    /**
     * @return Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    private final @Nullable Boolean immutable;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * @return stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    private final @Nullable Map<String,String> stringData;
    /**
     * @return Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private Secret(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("data") @Nullable Map<String,String> data,
        @CustomType.Parameter("immutable") @Nullable Boolean immutable,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("stringData") @Nullable Map<String,String> stringData,
        @CustomType.Parameter("type") @Nullable String type) {
        this.apiVersion = apiVersion;
        this.data = data;
        this.immutable = immutable;
        this.kind = kind;
        this.metadata = metadata;
        this.stringData = stringData;
        this.type = type;
    }

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Data contains the secret data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    public Map<String,String> data() {
        return this.data == null ? Map.of() : this.data;
    }
    /**
     * @return Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    public Optional<Boolean> immutable() {
        return Optional.ofNullable(this.immutable);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    public Map<String,String> stringData() {
        return this.stringData == null ? Map.of() : this.stringData;
    }
    /**
     * @return Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Secret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable Map<String,String> data;
        private @Nullable Boolean immutable;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable Map<String,String> stringData;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Secret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.data = defaults.data;
    	      this.immutable = defaults.immutable;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.stringData = defaults.stringData;
    	      this.type = defaults.type;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder data(@Nullable Map<String,String> data) {
            this.data = data;
            return this;
        }
        public Builder immutable(@Nullable Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder stringData(@Nullable Map<String,String> stringData) {
            this.stringData = stringData;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public Secret build() {
            return new Secret(apiVersion, data, immutable, kind, metadata, stringData, type);
        }
    }
}
