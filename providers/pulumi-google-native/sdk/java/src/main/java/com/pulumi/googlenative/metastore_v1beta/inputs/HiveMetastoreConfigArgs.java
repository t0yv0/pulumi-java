// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1beta.enums.HiveMetastoreConfigEndpointProtocol;
import com.pulumi.googlenative.metastore_v1beta.inputs.KerberosConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies configuration information specific to running Hive metastore software as the metastore service.
 * 
 */
public final class HiveMetastoreConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HiveMetastoreConfigArgs Empty = new HiveMetastoreConfigArgs();

    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    @Import(name="auxiliaryVersions")
    private @Nullable Output<Map<String,String>> auxiliaryVersions;

    /**
     * @return A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    public Optional<Output<Map<String,String>>> auxiliaryVersions() {
        return Optional.ofNullable(this.auxiliaryVersions);
    }

    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
     * 
     */
    @Import(name="configOverrides")
    private @Nullable Output<Map<String,String>> configOverrides;

    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
     * 
     */
    public Optional<Output<Map<String,String>>> configOverrides() {
        return Optional.ofNullable(this.configOverrides);
    }

    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    @Import(name="endpointProtocol")
    private @Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol;

    /**
     * @return The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    public Optional<Output<HiveMetastoreConfigEndpointProtocol>> endpointProtocol() {
        return Optional.ofNullable(this.endpointProtocol);
    }

    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
     * 
     */
    @Import(name="kerberosConfig")
    private @Nullable Output<KerberosConfigArgs> kerberosConfig;

    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
     * 
     */
    public Optional<Output<KerberosConfigArgs>> kerberosConfig() {
        return Optional.ofNullable(this.kerberosConfig);
    }

    /**
     * Immutable. The Hive metastore schema version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Immutable. The Hive metastore schema version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private HiveMetastoreConfigArgs() {}

    private HiveMetastoreConfigArgs(HiveMetastoreConfigArgs $) {
        this.auxiliaryVersions = $.auxiliaryVersions;
        this.configOverrides = $.configOverrides;
        this.endpointProtocol = $.endpointProtocol;
        this.kerberosConfig = $.kerberosConfig;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HiveMetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HiveMetastoreConfigArgs $;

        public Builder() {
            $ = new HiveMetastoreConfigArgs();
        }

        public Builder(HiveMetastoreConfigArgs defaults) {
            $ = new HiveMetastoreConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auxiliaryVersions A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder auxiliaryVersions(@Nullable Output<Map<String,String>> auxiliaryVersions) {
            $.auxiliaryVersions = auxiliaryVersions;
            return this;
        }

        /**
         * @param auxiliaryVersions A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder auxiliaryVersions(Map<String,String> auxiliaryVersions) {
            return auxiliaryVersions(Output.of(auxiliaryVersions));
        }

        /**
         * @param configOverrides A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
         * 
         * @return builder
         * 
         */
        public Builder configOverrides(@Nullable Output<Map<String,String>> configOverrides) {
            $.configOverrides = configOverrides;
            return this;
        }

        /**
         * @param configOverrides A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
         * 
         * @return builder
         * 
         */
        public Builder configOverrides(Map<String,String> configOverrides) {
            return configOverrides(Output.of(configOverrides));
        }

        /**
         * @param endpointProtocol The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
         * 
         * @return builder
         * 
         */
        public Builder endpointProtocol(@Nullable Output<HiveMetastoreConfigEndpointProtocol> endpointProtocol) {
            $.endpointProtocol = endpointProtocol;
            return this;
        }

        /**
         * @param endpointProtocol The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
         * 
         * @return builder
         * 
         */
        public Builder endpointProtocol(HiveMetastoreConfigEndpointProtocol endpointProtocol) {
            return endpointProtocol(Output.of(endpointProtocol));
        }

        /**
         * @param kerberosConfig Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(@Nullable Output<KerberosConfigArgs> kerberosConfig) {
            $.kerberosConfig = kerberosConfig;
            return this;
        }

        /**
         * @param kerberosConfig Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(KerberosConfigArgs kerberosConfig) {
            return kerberosConfig(Output.of(kerberosConfig));
        }

        /**
         * @param version Immutable. The Hive metastore schema version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Immutable. The Hive metastore schema version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public HiveMetastoreConfigArgs build() {
            return $;
        }
    }

}
