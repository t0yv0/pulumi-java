// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableView {
    /**
     * @return A query whose result is persisted.
     * 
     */
    private final String query;
    /**
     * @return Specifies whether to use BigQuery&#39;s legacy SQL for this view.
     * The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL.
     * 
     */
    private final @Nullable Boolean useLegacySql;

    @CustomType.Constructor
    private TableView(
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("useLegacySql") @Nullable Boolean useLegacySql) {
        this.query = query;
        this.useLegacySql = useLegacySql;
    }

    /**
     * @return A query whose result is persisted.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return Specifies whether to use BigQuery&#39;s legacy SQL for this view.
     * The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL.
     * 
     */
    public Optional<Boolean> useLegacySql() {
        return Optional.ofNullable(this.useLegacySql);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private @Nullable Boolean useLegacySql;

        public Builder() {
    	      // Empty
        }

        public Builder(TableView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.useLegacySql = defaults.useLegacySql;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }        public TableView build() {
            return new TableView(query, useLegacySql);
        }
    }
}
