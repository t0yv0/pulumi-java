// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MsixPackageApplicationsResponse {
    /**
     * @return Package Application Id, found in appxmanifest.xml.
     * 
     */
    private final @Nullable String appId;
    /**
     * @return Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     * 
     */
    private final @Nullable String appUserModelID;
    /**
     * @return Description of Package Application.
     * 
     */
    private final @Nullable String description;
    /**
     * @return User friendly name.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * @return User friendly name.
     * 
     */
    private final @Nullable String iconImageName;
    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    private final @Nullable String rawIcon;
    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    private final @Nullable String rawPng;

    @CustomType.Constructor
    private MsixPackageApplicationsResponse(
        @CustomType.Parameter("appId") @Nullable String appId,
        @CustomType.Parameter("appUserModelID") @Nullable String appUserModelID,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("iconImageName") @Nullable String iconImageName,
        @CustomType.Parameter("rawIcon") @Nullable String rawIcon,
        @CustomType.Parameter("rawPng") @Nullable String rawPng) {
        this.appId = appId;
        this.appUserModelID = appUserModelID;
        this.description = description;
        this.friendlyName = friendlyName;
        this.iconImageName = iconImageName;
        this.rawIcon = rawIcon;
        this.rawPng = rawPng;
    }

    /**
     * @return Package Application Id, found in appxmanifest.xml.
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * @return Used to activate Package Application. Consists of Package Name and ApplicationID. Found in appxmanifest.xml.
     * 
     */
    public Optional<String> appUserModelID() {
        return Optional.ofNullable(this.appUserModelID);
    }
    /**
     * @return Description of Package Application.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return User friendly name.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * @return User friendly name.
     * 
     */
    public Optional<String> iconImageName() {
        return Optional.ofNullable(this.iconImageName);
    }
    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Optional<String> rawIcon() {
        return Optional.ofNullable(this.rawIcon);
    }
    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Optional<String> rawPng() {
        return Optional.ofNullable(this.rawPng);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MsixPackageApplicationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String appUserModelID;
        private @Nullable String description;
        private @Nullable String friendlyName;
        private @Nullable String iconImageName;
        private @Nullable String rawIcon;
        private @Nullable String rawPng;

        public Builder() {
    	      // Empty
        }

        public Builder(MsixPackageApplicationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appUserModelID = defaults.appUserModelID;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.iconImageName = defaults.iconImageName;
    	      this.rawIcon = defaults.rawIcon;
    	      this.rawPng = defaults.rawPng;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }
        public Builder appUserModelID(@Nullable String appUserModelID) {
            this.appUserModelID = appUserModelID;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder iconImageName(@Nullable String iconImageName) {
            this.iconImageName = iconImageName;
            return this;
        }
        public Builder rawIcon(@Nullable String rawIcon) {
            this.rawIcon = rawIcon;
            return this;
        }
        public Builder rawPng(@Nullable String rawPng) {
            this.rawPng = rawPng;
            return this;
        }        public MsixPackageApplicationsResponse build() {
            return new MsixPackageApplicationsResponse(appId, appUserModelID, description, friendlyName, iconImageName, rawIcon, rawPng);
        }
    }
}
