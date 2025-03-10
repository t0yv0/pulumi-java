// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.MetastoreServiceHiveMetastoreConfigKerberosConfig;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetastoreServiceHiveMetastoreConfig {
    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml).
     * The mappings override system defaults (some keys cannot be overridden)
     * 
     */
    private final @Nullable Map<String,String> configOverrides;
    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetastoreServiceHiveMetastoreConfigKerberosConfig kerberosConfig;
    /**
     * @return The Hive metastore schema version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private MetastoreServiceHiveMetastoreConfig(
        @CustomType.Parameter("configOverrides") @Nullable Map<String,String> configOverrides,
        @CustomType.Parameter("kerberosConfig") @Nullable MetastoreServiceHiveMetastoreConfigKerberosConfig kerberosConfig,
        @CustomType.Parameter("version") String version) {
        this.configOverrides = configOverrides;
        this.kerberosConfig = kerberosConfig;
        this.version = version;
    }

    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml).
     * The mappings override system defaults (some keys cannot be overridden)
     * 
     */
    public Map<String,String> configOverrides() {
        return this.configOverrides == null ? Map.of() : this.configOverrides;
    }
    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * Structure is documented below.
     * 
     */
    public Optional<MetastoreServiceHiveMetastoreConfigKerberosConfig> kerberosConfig() {
        return Optional.ofNullable(this.kerberosConfig);
    }
    /**
     * @return The Hive metastore schema version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> configOverrides;
        private @Nullable MetastoreServiceHiveMetastoreConfigKerberosConfig kerberosConfig;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configOverrides = defaults.configOverrides;
    	      this.kerberosConfig = defaults.kerberosConfig;
    	      this.version = defaults.version;
        }

        public Builder configOverrides(@Nullable Map<String,String> configOverrides) {
            this.configOverrides = configOverrides;
            return this;
        }
        public Builder kerberosConfig(@Nullable MetastoreServiceHiveMetastoreConfigKerberosConfig kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public MetastoreServiceHiveMetastoreConfig build() {
            return new MetastoreServiceHiveMetastoreConfig(configOverrides, kerberosConfig, version);
        }
    }
}
