// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SchemaVersionMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaVersionMetadataArgs Empty = new SchemaVersionMetadataArgs();

    /**
     * Metadata key
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Metadata key
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    @Import(name="schemaVersionId", required=true)
    private Output<String> schemaVersionId;

    /**
     * @return Represents the version ID associated with the schema version.
     * 
     */
    public Output<String> schemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * Metadata value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Metadata value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SchemaVersionMetadataArgs() {}

    private SchemaVersionMetadataArgs(SchemaVersionMetadataArgs $) {
        this.key = $.key;
        this.schemaVersionId = $.schemaVersionId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaVersionMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaVersionMetadataArgs $;

        public Builder() {
            $ = new SchemaVersionMetadataArgs();
        }

        public Builder(SchemaVersionMetadataArgs defaults) {
            $ = new SchemaVersionMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Metadata key
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Metadata key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param schemaVersionId Represents the version ID associated with the schema version.
         * 
         * @return builder
         * 
         */
        public Builder schemaVersionId(Output<String> schemaVersionId) {
            $.schemaVersionId = schemaVersionId;
            return this;
        }

        /**
         * @param schemaVersionId Represents the version ID associated with the schema version.
         * 
         * @return builder
         * 
         */
        public Builder schemaVersionId(String schemaVersionId) {
            return schemaVersionId(Output.of(schemaVersionId));
        }

        /**
         * @param value Metadata value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Metadata value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SchemaVersionMetadataArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.schemaVersionId = Objects.requireNonNull($.schemaVersionId, "expected parameter 'schemaVersionId' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
