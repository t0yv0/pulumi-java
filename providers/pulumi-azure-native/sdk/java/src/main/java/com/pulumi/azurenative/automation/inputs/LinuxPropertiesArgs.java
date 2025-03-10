// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.LinuxUpdateClasses;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linux specific update configuration.
 * 
 */
public final class LinuxPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxPropertiesArgs Empty = new LinuxPropertiesArgs();

    /**
     * packages excluded from the software update configuration.
     * 
     */
    @Import(name="excludedPackageNameMasks")
    private @Nullable Output<List<String>> excludedPackageNameMasks;

    /**
     * @return packages excluded from the software update configuration.
     * 
     */
    public Optional<Output<List<String>>> excludedPackageNameMasks() {
        return Optional.ofNullable(this.excludedPackageNameMasks);
    }

    /**
     * Update classifications included in the software update configuration.
     * 
     */
    @Import(name="includedPackageClassifications")
    private @Nullable Output<Either<String,LinuxUpdateClasses>> includedPackageClassifications;

    /**
     * @return Update classifications included in the software update configuration.
     * 
     */
    public Optional<Output<Either<String,LinuxUpdateClasses>>> includedPackageClassifications() {
        return Optional.ofNullable(this.includedPackageClassifications);
    }

    /**
     * packages included from the software update configuration.
     * 
     */
    @Import(name="includedPackageNameMasks")
    private @Nullable Output<List<String>> includedPackageNameMasks;

    /**
     * @return packages included from the software update configuration.
     * 
     */
    public Optional<Output<List<String>>> includedPackageNameMasks() {
        return Optional.ofNullable(this.includedPackageNameMasks);
    }

    /**
     * Reboot setting for the software update configuration.
     * 
     */
    @Import(name="rebootSetting")
    private @Nullable Output<String> rebootSetting;

    /**
     * @return Reboot setting for the software update configuration.
     * 
     */
    public Optional<Output<String>> rebootSetting() {
        return Optional.ofNullable(this.rebootSetting);
    }

    private LinuxPropertiesArgs() {}

    private LinuxPropertiesArgs(LinuxPropertiesArgs $) {
        this.excludedPackageNameMasks = $.excludedPackageNameMasks;
        this.includedPackageClassifications = $.includedPackageClassifications;
        this.includedPackageNameMasks = $.includedPackageNameMasks;
        this.rebootSetting = $.rebootSetting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxPropertiesArgs $;

        public Builder() {
            $ = new LinuxPropertiesArgs();
        }

        public Builder(LinuxPropertiesArgs defaults) {
            $ = new LinuxPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedPackageNameMasks packages excluded from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackageNameMasks(@Nullable Output<List<String>> excludedPackageNameMasks) {
            $.excludedPackageNameMasks = excludedPackageNameMasks;
            return this;
        }

        /**
         * @param excludedPackageNameMasks packages excluded from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackageNameMasks(List<String> excludedPackageNameMasks) {
            return excludedPackageNameMasks(Output.of(excludedPackageNameMasks));
        }

        /**
         * @param excludedPackageNameMasks packages excluded from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder excludedPackageNameMasks(String... excludedPackageNameMasks) {
            return excludedPackageNameMasks(List.of(excludedPackageNameMasks));
        }

        /**
         * @param includedPackageClassifications Update classifications included in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageClassifications(@Nullable Output<Either<String,LinuxUpdateClasses>> includedPackageClassifications) {
            $.includedPackageClassifications = includedPackageClassifications;
            return this;
        }

        /**
         * @param includedPackageClassifications Update classifications included in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageClassifications(Either<String,LinuxUpdateClasses> includedPackageClassifications) {
            return includedPackageClassifications(Output.of(includedPackageClassifications));
        }

        /**
         * @param includedPackageClassifications Update classifications included in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageClassifications(String includedPackageClassifications) {
            return includedPackageClassifications(Either.ofLeft(includedPackageClassifications));
        }

        /**
         * @param includedPackageClassifications Update classifications included in the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageClassifications(LinuxUpdateClasses includedPackageClassifications) {
            return includedPackageClassifications(Either.ofRight(includedPackageClassifications));
        }

        /**
         * @param includedPackageNameMasks packages included from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageNameMasks(@Nullable Output<List<String>> includedPackageNameMasks) {
            $.includedPackageNameMasks = includedPackageNameMasks;
            return this;
        }

        /**
         * @param includedPackageNameMasks packages included from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageNameMasks(List<String> includedPackageNameMasks) {
            return includedPackageNameMasks(Output.of(includedPackageNameMasks));
        }

        /**
         * @param includedPackageNameMasks packages included from the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder includedPackageNameMasks(String... includedPackageNameMasks) {
            return includedPackageNameMasks(List.of(includedPackageNameMasks));
        }

        /**
         * @param rebootSetting Reboot setting for the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder rebootSetting(@Nullable Output<String> rebootSetting) {
            $.rebootSetting = rebootSetting;
            return this;
        }

        /**
         * @param rebootSetting Reboot setting for the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder rebootSetting(String rebootSetting) {
            return rebootSetting(Output.of(rebootSetting));
        }

        public LinuxPropertiesArgs build() {
            return $;
        }
    }

}
