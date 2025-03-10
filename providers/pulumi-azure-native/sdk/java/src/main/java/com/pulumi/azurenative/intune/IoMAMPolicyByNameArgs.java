// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.intune;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IoMAMPolicyByNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final IoMAMPolicyByNameArgs Empty = new IoMAMPolicyByNameArgs();

    @Import(name="accessRecheckOfflineTimeout")
    private @Nullable Output<String> accessRecheckOfflineTimeout;

    public Optional<Output<String>> accessRecheckOfflineTimeout() {
        return Optional.ofNullable(this.accessRecheckOfflineTimeout);
    }

    @Import(name="accessRecheckOnlineTimeout")
    private @Nullable Output<String> accessRecheckOnlineTimeout;

    public Optional<Output<String>> accessRecheckOnlineTimeout() {
        return Optional.ofNullable(this.accessRecheckOnlineTimeout);
    }

    @Import(name="appSharingFromLevel")
    private @Nullable Output<String> appSharingFromLevel;

    public Optional<Output<String>> appSharingFromLevel() {
        return Optional.ofNullable(this.appSharingFromLevel);
    }

    @Import(name="appSharingToLevel")
    private @Nullable Output<String> appSharingToLevel;

    public Optional<Output<String>> appSharingToLevel() {
        return Optional.ofNullable(this.appSharingToLevel);
    }

    @Import(name="authentication")
    private @Nullable Output<String> authentication;

    public Optional<Output<String>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    @Import(name="clipboardSharingLevel")
    private @Nullable Output<String> clipboardSharingLevel;

    public Optional<Output<String>> clipboardSharingLevel() {
        return Optional.ofNullable(this.clipboardSharingLevel);
    }

    @Import(name="dataBackup")
    private @Nullable Output<String> dataBackup;

    public Optional<Output<String>> dataBackup() {
        return Optional.ofNullable(this.dataBackup);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="deviceCompliance")
    private @Nullable Output<String> deviceCompliance;

    public Optional<Output<String>> deviceCompliance() {
        return Optional.ofNullable(this.deviceCompliance);
    }

    @Import(name="fileEncryptionLevel")
    private @Nullable Output<String> fileEncryptionLevel;

    public Optional<Output<String>> fileEncryptionLevel() {
        return Optional.ofNullable(this.fileEncryptionLevel);
    }

    @Import(name="fileSharingSaveAs")
    private @Nullable Output<String> fileSharingSaveAs;

    public Optional<Output<String>> fileSharingSaveAs() {
        return Optional.ofNullable(this.fileSharingSaveAs);
    }

    @Import(name="friendlyName", required=true)
    private Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName;
    }

    /**
     * Location hostName for the tenant
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return Location hostName for the tenant
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * Resource Location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource Location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="managedBrowser")
    private @Nullable Output<String> managedBrowser;

    public Optional<Output<String>> managedBrowser() {
        return Optional.ofNullable(this.managedBrowser);
    }

    @Import(name="offlineWipeTimeout")
    private @Nullable Output<String> offlineWipeTimeout;

    public Optional<Output<String>> offlineWipeTimeout() {
        return Optional.ofNullable(this.offlineWipeTimeout);
    }

    @Import(name="pin")
    private @Nullable Output<String> pin;

    public Optional<Output<String>> pin() {
        return Optional.ofNullable(this.pin);
    }

    @Import(name="pinNumRetry")
    private @Nullable Output<Integer> pinNumRetry;

    public Optional<Output<Integer>> pinNumRetry() {
        return Optional.ofNullable(this.pinNumRetry);
    }

    /**
     * Unique name for the policy
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Unique name for the policy
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Resource Tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="touchId")
    private @Nullable Output<String> touchId;

    public Optional<Output<String>> touchId() {
        return Optional.ofNullable(this.touchId);
    }

    private IoMAMPolicyByNameArgs() {}

    private IoMAMPolicyByNameArgs(IoMAMPolicyByNameArgs $) {
        this.accessRecheckOfflineTimeout = $.accessRecheckOfflineTimeout;
        this.accessRecheckOnlineTimeout = $.accessRecheckOnlineTimeout;
        this.appSharingFromLevel = $.appSharingFromLevel;
        this.appSharingToLevel = $.appSharingToLevel;
        this.authentication = $.authentication;
        this.clipboardSharingLevel = $.clipboardSharingLevel;
        this.dataBackup = $.dataBackup;
        this.description = $.description;
        this.deviceCompliance = $.deviceCompliance;
        this.fileEncryptionLevel = $.fileEncryptionLevel;
        this.fileSharingSaveAs = $.fileSharingSaveAs;
        this.friendlyName = $.friendlyName;
        this.hostName = $.hostName;
        this.location = $.location;
        this.managedBrowser = $.managedBrowser;
        this.offlineWipeTimeout = $.offlineWipeTimeout;
        this.pin = $.pin;
        this.pinNumRetry = $.pinNumRetry;
        this.policyName = $.policyName;
        this.tags = $.tags;
        this.touchId = $.touchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IoMAMPolicyByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IoMAMPolicyByNameArgs $;

        public Builder() {
            $ = new IoMAMPolicyByNameArgs();
        }

        public Builder(IoMAMPolicyByNameArgs defaults) {
            $ = new IoMAMPolicyByNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessRecheckOfflineTimeout(@Nullable Output<String> accessRecheckOfflineTimeout) {
            $.accessRecheckOfflineTimeout = accessRecheckOfflineTimeout;
            return this;
        }

        public Builder accessRecheckOfflineTimeout(String accessRecheckOfflineTimeout) {
            return accessRecheckOfflineTimeout(Output.of(accessRecheckOfflineTimeout));
        }

        public Builder accessRecheckOnlineTimeout(@Nullable Output<String> accessRecheckOnlineTimeout) {
            $.accessRecheckOnlineTimeout = accessRecheckOnlineTimeout;
            return this;
        }

        public Builder accessRecheckOnlineTimeout(String accessRecheckOnlineTimeout) {
            return accessRecheckOnlineTimeout(Output.of(accessRecheckOnlineTimeout));
        }

        public Builder appSharingFromLevel(@Nullable Output<String> appSharingFromLevel) {
            $.appSharingFromLevel = appSharingFromLevel;
            return this;
        }

        public Builder appSharingFromLevel(String appSharingFromLevel) {
            return appSharingFromLevel(Output.of(appSharingFromLevel));
        }

        public Builder appSharingToLevel(@Nullable Output<String> appSharingToLevel) {
            $.appSharingToLevel = appSharingToLevel;
            return this;
        }

        public Builder appSharingToLevel(String appSharingToLevel) {
            return appSharingToLevel(Output.of(appSharingToLevel));
        }

        public Builder authentication(@Nullable Output<String> authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder authentication(String authentication) {
            return authentication(Output.of(authentication));
        }

        public Builder clipboardSharingLevel(@Nullable Output<String> clipboardSharingLevel) {
            $.clipboardSharingLevel = clipboardSharingLevel;
            return this;
        }

        public Builder clipboardSharingLevel(String clipboardSharingLevel) {
            return clipboardSharingLevel(Output.of(clipboardSharingLevel));
        }

        public Builder dataBackup(@Nullable Output<String> dataBackup) {
            $.dataBackup = dataBackup;
            return this;
        }

        public Builder dataBackup(String dataBackup) {
            return dataBackup(Output.of(dataBackup));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder deviceCompliance(@Nullable Output<String> deviceCompliance) {
            $.deviceCompliance = deviceCompliance;
            return this;
        }

        public Builder deviceCompliance(String deviceCompliance) {
            return deviceCompliance(Output.of(deviceCompliance));
        }

        public Builder fileEncryptionLevel(@Nullable Output<String> fileEncryptionLevel) {
            $.fileEncryptionLevel = fileEncryptionLevel;
            return this;
        }

        public Builder fileEncryptionLevel(String fileEncryptionLevel) {
            return fileEncryptionLevel(Output.of(fileEncryptionLevel));
        }

        public Builder fileSharingSaveAs(@Nullable Output<String> fileSharingSaveAs) {
            $.fileSharingSaveAs = fileSharingSaveAs;
            return this;
        }

        public Builder fileSharingSaveAs(String fileSharingSaveAs) {
            return fileSharingSaveAs(Output.of(fileSharingSaveAs));
        }

        public Builder friendlyName(Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param hostName Location hostName for the tenant
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Location hostName for the tenant
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param location Resource Location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource Location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder managedBrowser(@Nullable Output<String> managedBrowser) {
            $.managedBrowser = managedBrowser;
            return this;
        }

        public Builder managedBrowser(String managedBrowser) {
            return managedBrowser(Output.of(managedBrowser));
        }

        public Builder offlineWipeTimeout(@Nullable Output<String> offlineWipeTimeout) {
            $.offlineWipeTimeout = offlineWipeTimeout;
            return this;
        }

        public Builder offlineWipeTimeout(String offlineWipeTimeout) {
            return offlineWipeTimeout(Output.of(offlineWipeTimeout));
        }

        public Builder pin(@Nullable Output<String> pin) {
            $.pin = pin;
            return this;
        }

        public Builder pin(String pin) {
            return pin(Output.of(pin));
        }

        public Builder pinNumRetry(@Nullable Output<Integer> pinNumRetry) {
            $.pinNumRetry = pinNumRetry;
            return this;
        }

        public Builder pinNumRetry(Integer pinNumRetry) {
            return pinNumRetry(Output.of(pinNumRetry));
        }

        /**
         * @param policyName Unique name for the policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Unique name for the policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param tags Resource Tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource Tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder touchId(@Nullable Output<String> touchId) {
            $.touchId = touchId;
            return this;
        }

        public Builder touchId(String touchId) {
            return touchId(Output.of(touchId));
        }

        public IoMAMPolicyByNameArgs build() {
            $.appSharingFromLevel = Codegen.stringProp("appSharingFromLevel").output().arg($.appSharingFromLevel).def("none").getNullable();
            $.appSharingToLevel = Codegen.stringProp("appSharingToLevel").output().arg($.appSharingToLevel).def("none").getNullable();
            $.authentication = Codegen.stringProp("authentication").output().arg($.authentication).def("required").getNullable();
            $.clipboardSharingLevel = Codegen.stringProp("clipboardSharingLevel").output().arg($.clipboardSharingLevel).def("blocked").getNullable();
            $.dataBackup = Codegen.stringProp("dataBackup").output().arg($.dataBackup).def("allow").getNullable();
            $.deviceCompliance = Codegen.stringProp("deviceCompliance").output().arg($.deviceCompliance).def("enable").getNullable();
            $.fileEncryptionLevel = Codegen.stringProp("fileEncryptionLevel").output().arg($.fileEncryptionLevel).def("deviceLocked").getNullable();
            $.fileSharingSaveAs = Codegen.stringProp("fileSharingSaveAs").output().arg($.fileSharingSaveAs).def("allow").getNullable();
            $.friendlyName = Objects.requireNonNull($.friendlyName, "expected parameter 'friendlyName' to be non-null");
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.managedBrowser = Codegen.stringProp("managedBrowser").output().arg($.managedBrowser).def("required").getNullable();
            $.pin = Codegen.stringProp("pin").output().arg($.pin).def("required").getNullable();
            $.touchId = Codegen.stringProp("touchId").output().arg($.touchId).def("enable").getNullable();
            return $;
        }
    }

}
