// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersAuroraPostgresql {
    /**
     * @return The database to which to connect.
     * 
     */
    private final String database;
    /**
     * @return The host to which to connect.
     * 
     */
    private final String host;
    /**
     * @return The port to which to connect.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private DataSourceParametersAuroraPostgresql(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.database = database;
        this.host = host;
        this.port = port;
    }

    /**
     * @return The database to which to connect.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The host to which to connect.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The port to which to connect.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAuroraPostgresql defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAuroraPostgresql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceParametersAuroraPostgresql build() {
            return new DataSourceParametersAuroraPostgresql(database, host, port);
        }
    }
}
