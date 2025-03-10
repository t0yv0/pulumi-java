// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse {
    /**
     * @return If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    private final Boolean allowAllBundleIds;
    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    private final List<String> allowedBundleIds;

    @CustomType.Constructor
    private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse(
        @CustomType.Parameter("allowAllBundleIds") Boolean allowAllBundleIds,
        @CustomType.Parameter("allowedBundleIds") List<String> allowedBundleIds) {
        this.allowAllBundleIds = allowAllBundleIds;
        this.allowedBundleIds = allowedBundleIds;
    }

    /**
     * @return If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    public Boolean allowAllBundleIds() {
        return this.allowAllBundleIds;
    }
    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    public List<String> allowedBundleIds() {
        return this.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAllBundleIds;
        private List<String> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowAllBundleIds(Boolean allowAllBundleIds) {
            this.allowAllBundleIds = Objects.requireNonNull(allowAllBundleIds);
            return this;
        }
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse(allowAllBundleIds, allowedBundleIds);
        }
    }
}
