// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.outputs;

import com.pulumi.azurenative.notificationhubs.outputs.AdmCredentialResponse;
import com.pulumi.azurenative.notificationhubs.outputs.ApnsCredentialResponse;
import com.pulumi.azurenative.notificationhubs.outputs.BaiduCredentialResponse;
import com.pulumi.azurenative.notificationhubs.outputs.GcmCredentialResponse;
import com.pulumi.azurenative.notificationhubs.outputs.MpnsCredentialResponse;
import com.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import com.pulumi.azurenative.notificationhubs.outputs.WnsCredentialResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNotificationHubPnsCredentialsResult {
    /**
     * @return The AdmCredential of the created NotificationHub
     * 
     */
    private final @Nullable AdmCredentialResponse admCredential;
    /**
     * @return The ApnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable ApnsCredentialResponse apnsCredential;
    /**
     * @return The BaiduCredential of the created NotificationHub
     * 
     */
    private final @Nullable BaiduCredentialResponse baiduCredential;
    /**
     * @return The GcmCredential of the created NotificationHub
     * 
     */
    private final @Nullable GcmCredentialResponse gcmCredential;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * @return The MpnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable MpnsCredentialResponse mpnsCredential;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return The sku of the created namespace
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return The WnsCredential of the created NotificationHub
     * 
     */
    private final @Nullable WnsCredentialResponse wnsCredential;

    @CustomType.Constructor
    private GetNotificationHubPnsCredentialsResult(
        @CustomType.Parameter("admCredential") @Nullable AdmCredentialResponse admCredential,
        @CustomType.Parameter("apnsCredential") @Nullable ApnsCredentialResponse apnsCredential,
        @CustomType.Parameter("baiduCredential") @Nullable BaiduCredentialResponse baiduCredential,
        @CustomType.Parameter("gcmCredential") @Nullable GcmCredentialResponse gcmCredential,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("mpnsCredential") @Nullable MpnsCredentialResponse mpnsCredential,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("wnsCredential") @Nullable WnsCredentialResponse wnsCredential) {
        this.admCredential = admCredential;
        this.apnsCredential = apnsCredential;
        this.baiduCredential = baiduCredential;
        this.gcmCredential = gcmCredential;
        this.id = id;
        this.location = location;
        this.mpnsCredential = mpnsCredential;
        this.name = name;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.wnsCredential = wnsCredential;
    }

    /**
     * @return The AdmCredential of the created NotificationHub
     * 
     */
    public Optional<AdmCredentialResponse> admCredential() {
        return Optional.ofNullable(this.admCredential);
    }
    /**
     * @return The ApnsCredential of the created NotificationHub
     * 
     */
    public Optional<ApnsCredentialResponse> apnsCredential() {
        return Optional.ofNullable(this.apnsCredential);
    }
    /**
     * @return The BaiduCredential of the created NotificationHub
     * 
     */
    public Optional<BaiduCredentialResponse> baiduCredential() {
        return Optional.ofNullable(this.baiduCredential);
    }
    /**
     * @return The GcmCredential of the created NotificationHub
     * 
     */
    public Optional<GcmCredentialResponse> gcmCredential() {
        return Optional.ofNullable(this.gcmCredential);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The MpnsCredential of the created NotificationHub
     * 
     */
    public Optional<MpnsCredentialResponse> mpnsCredential() {
        return Optional.ofNullable(this.mpnsCredential);
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The sku of the created namespace
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The WnsCredential of the created NotificationHub
     * 
     */
    public Optional<WnsCredentialResponse> wnsCredential() {
        return Optional.ofNullable(this.wnsCredential);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationHubPnsCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdmCredentialResponse admCredential;
        private @Nullable ApnsCredentialResponse apnsCredential;
        private @Nullable BaiduCredentialResponse baiduCredential;
        private @Nullable GcmCredentialResponse gcmCredential;
        private String id;
        private @Nullable String location;
        private @Nullable MpnsCredentialResponse mpnsCredential;
        private String name;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable WnsCredentialResponse wnsCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationHubPnsCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admCredential = defaults.admCredential;
    	      this.apnsCredential = defaults.apnsCredential;
    	      this.baiduCredential = defaults.baiduCredential;
    	      this.gcmCredential = defaults.gcmCredential;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mpnsCredential = defaults.mpnsCredential;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.wnsCredential = defaults.wnsCredential;
        }

        public Builder admCredential(@Nullable AdmCredentialResponse admCredential) {
            this.admCredential = admCredential;
            return this;
        }
        public Builder apnsCredential(@Nullable ApnsCredentialResponse apnsCredential) {
            this.apnsCredential = apnsCredential;
            return this;
        }
        public Builder baiduCredential(@Nullable BaiduCredentialResponse baiduCredential) {
            this.baiduCredential = baiduCredential;
            return this;
        }
        public Builder gcmCredential(@Nullable GcmCredentialResponse gcmCredential) {
            this.gcmCredential = gcmCredential;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder mpnsCredential(@Nullable MpnsCredentialResponse mpnsCredential) {
            this.mpnsCredential = mpnsCredential;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder wnsCredential(@Nullable WnsCredentialResponse wnsCredential) {
            this.wnsCredential = wnsCredential;
            return this;
        }        public GetNotificationHubPnsCredentialsResult build() {
            return new GetNotificationHubPnsCredentialsResult(admCredential, apnsCredential, baiduCredential, gcmCredential, id, location, mpnsCredential, name, sku, tags, type, wnsCredential);
        }
    }
}
