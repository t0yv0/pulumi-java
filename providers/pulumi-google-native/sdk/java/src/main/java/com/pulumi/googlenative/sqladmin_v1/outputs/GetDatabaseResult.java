// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin_v1.outputs.SqlServerDatabaseDetailsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseResult {
    /**
     * @return The Cloud SQL charset value.
     * 
     */
    private final String charset;
    /**
     * @return The Cloud SQL collation value.
     * 
     */
    private final String collation;
    /**
     * @return This field is deprecated and will be removed from a future version of the API.
     * 
     * @deprecated
     * This field is deprecated and will be removed from a future version of the API.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed from a future version of the API. */
    private final String etag;
    /**
     * @return The name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    private final String instance;
    /**
     * @return This is always `sql#database`.
     * 
     */
    private final String kind;
    /**
     * @return The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
     * 
     */
    private final String name;
    /**
     * @return The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable.
     * 
     */
    private final String project;
    /**
     * @return The URI of this resource.
     * 
     */
    private final String selfLink;
    private final SqlServerDatabaseDetailsResponse sqlserverDatabaseDetails;

    @CustomType.Constructor
    private GetDatabaseResult(
        @CustomType.Parameter("charset") String charset,
        @CustomType.Parameter("collation") String collation,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("instance") String instance,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sqlserverDatabaseDetails") SqlServerDatabaseDetailsResponse sqlserverDatabaseDetails) {
        this.charset = charset;
        this.collation = collation;
        this.etag = etag;
        this.instance = instance;
        this.kind = kind;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.sqlserverDatabaseDetails = sqlserverDatabaseDetails;
    }

    /**
     * @return The Cloud SQL charset value.
     * 
     */
    public String charset() {
        return this.charset;
    }
    /**
     * @return The Cloud SQL collation value.
     * 
     */
    public String collation() {
        return this.collation;
    }
    /**
     * @return This field is deprecated and will be removed from a future version of the API.
     * 
     * @deprecated
     * This field is deprecated and will be removed from a future version of the API.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed from a future version of the API. */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return This is always `sql#database`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The URI of this resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    public SqlServerDatabaseDetailsResponse sqlserverDatabaseDetails() {
        return this.sqlserverDatabaseDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String charset;
        private String collation;
        private String etag;
        private String instance;
        private String kind;
        private String name;
        private String project;
        private String selfLink;
        private SqlServerDatabaseDetailsResponse sqlserverDatabaseDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.collation = defaults.collation;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sqlserverDatabaseDetails = defaults.sqlserverDatabaseDetails;
        }

        public Builder charset(String charset) {
            this.charset = Objects.requireNonNull(charset);
            return this;
        }
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sqlserverDatabaseDetails(SqlServerDatabaseDetailsResponse sqlserverDatabaseDetails) {
            this.sqlserverDatabaseDetails = Objects.requireNonNull(sqlserverDatabaseDetails);
            return this;
        }        public GetDatabaseResult build() {
            return new GetDatabaseResult(charset, collation, etag, instance, kind, name, project, selfLink, sqlserverDatabaseDetails);
        }
    }
}
