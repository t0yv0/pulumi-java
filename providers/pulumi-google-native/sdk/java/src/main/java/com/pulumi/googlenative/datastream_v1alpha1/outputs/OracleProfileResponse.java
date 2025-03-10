// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class OracleProfileResponse {
    /**
     * @return Connection string attributes
     * 
     */
    private final Map<String,String> connectionAttributes;
    /**
     * @return Database for the Oracle connection.
     * 
     */
    private final String databaseService;
    /**
     * @return Hostname for the Oracle connection.
     * 
     */
    private final String hostname;
    /**
     * @return Password for the Oracle connection.
     * 
     */
    private final String password;
    /**
     * @return Port for the Oracle connection, default value is 1521.
     * 
     */
    private final Integer port;
    /**
     * @return Username for the Oracle connection.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private OracleProfileResponse(
        @CustomType.Parameter("connectionAttributes") Map<String,String> connectionAttributes,
        @CustomType.Parameter("databaseService") String databaseService,
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("username") String username) {
        this.connectionAttributes = connectionAttributes;
        this.databaseService = databaseService;
        this.hostname = hostname;
        this.password = password;
        this.port = port;
        this.username = username;
    }

    /**
     * @return Connection string attributes
     * 
     */
    public Map<String,String> connectionAttributes() {
        return this.connectionAttributes;
    }
    /**
     * @return Database for the Oracle connection.
     * 
     */
    public String databaseService() {
        return this.databaseService;
    }
    /**
     * @return Hostname for the Oracle connection.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Password for the Oracle connection.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Port for the Oracle connection, default value is 1521.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Username for the Oracle connection.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> connectionAttributes;
        private String databaseService;
        private String hostname;
        private String password;
        private Integer port;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttributes = defaults.connectionAttributes;
    	      this.databaseService = defaults.databaseService;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.username = defaults.username;
        }

        public Builder connectionAttributes(Map<String,String> connectionAttributes) {
            this.connectionAttributes = Objects.requireNonNull(connectionAttributes);
            return this;
        }
        public Builder databaseService(String databaseService) {
            this.databaseService = Objects.requireNonNull(databaseService);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public OracleProfileResponse build() {
            return new OracleProfileResponse(connectionAttributes, databaseService, hostname, password, port, username);
        }
    }
}
