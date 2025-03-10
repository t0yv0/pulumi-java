// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.enums.DistributionArchitecture;
import com.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This represents a particular channel of distribution for a given package. E.g., Debian&#39;s jessie-backports dpkg mirror.
 * 
 */
public final class DistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionArgs Empty = new DistributionArgs();

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<DistributionArchitecture> architecture;

    /**
     * @return The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    public Optional<Output<DistributionArchitecture>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Import(name="cpeUri", required=true)
    private Output<String> cpeUri;

    /**
     * @return The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    public Output<String> cpeUri() {
        return this.cpeUri;
    }

    /**
     * The distribution channel-specific description of this package.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The distribution channel-specific description of this package.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    @Import(name="latestVersion")
    private @Nullable Output<VersionArgs> latestVersion;

    /**
     * @return The latest available version of this package in this distribution channel.
     * 
     */
    public Optional<Output<VersionArgs>> latestVersion() {
        return Optional.ofNullable(this.latestVersion);
    }

    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    @Import(name="maintainer")
    private @Nullable Output<String> maintainer;

    /**
     * @return A freeform string denoting the maintainer of this package.
     * 
     */
    public Optional<Output<String>> maintainer() {
        return Optional.ofNullable(this.maintainer);
    }

    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The distribution channel-specific homepage for this package.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private DistributionArgs() {}

    private DistributionArgs(DistributionArgs $) {
        this.architecture = $.architecture;
        this.cpeUri = $.cpeUri;
        this.description = $.description;
        this.latestVersion = $.latestVersion;
        this.maintainer = $.maintainer;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionArgs $;

        public Builder() {
            $ = new DistributionArgs();
        }

        public Builder(DistributionArgs defaults) {
            $ = new DistributionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The CPU architecture for which packages in this distribution channel were built.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<DistributionArchitecture> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The CPU architecture for which packages in this distribution channel were built.
         * 
         * @return builder
         * 
         */
        public Builder architecture(DistributionArchitecture architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param cpeUri The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        /**
         * @param cpeUri The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        /**
         * @param description The distribution channel-specific description of this package.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The distribution channel-specific description of this package.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param latestVersion The latest available version of this package in this distribution channel.
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(@Nullable Output<VersionArgs> latestVersion) {
            $.latestVersion = latestVersion;
            return this;
        }

        /**
         * @param latestVersion The latest available version of this package in this distribution channel.
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(VersionArgs latestVersion) {
            return latestVersion(Output.of(latestVersion));
        }

        /**
         * @param maintainer A freeform string denoting the maintainer of this package.
         * 
         * @return builder
         * 
         */
        public Builder maintainer(@Nullable Output<String> maintainer) {
            $.maintainer = maintainer;
            return this;
        }

        /**
         * @param maintainer A freeform string denoting the maintainer of this package.
         * 
         * @return builder
         * 
         */
        public Builder maintainer(String maintainer) {
            return maintainer(Output.of(maintainer));
        }

        /**
         * @param url The distribution channel-specific homepage for this package.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The distribution channel-specific homepage for this package.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public DistributionArgs build() {
            $.cpeUri = Objects.requireNonNull($.cpeUri, "expected parameter 'cpeUri' to be non-null");
            return $;
        }
    }

}
