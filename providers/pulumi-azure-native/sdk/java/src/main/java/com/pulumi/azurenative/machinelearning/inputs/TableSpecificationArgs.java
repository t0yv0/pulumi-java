// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.ColumnSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The swagger 2.0 schema describing a single service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class TableSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableSpecificationArgs Empty = new TableSpecificationArgs();

    /**
     * Swagger schema description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Swagger schema description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The format, if &#39;type&#39; is not &#39;object&#39;
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return The format, if &#39;type&#39; is not &#39;object&#39;
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The set of columns within the data table.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,ColumnSpecificationArgs>> properties;

    /**
     * @return The set of columns within the data table.
     * 
     */
    public Optional<Output<Map<String,ColumnSpecificationArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Swagger schema title.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Swagger schema title.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The type of the entity described in swagger.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the entity described in swagger.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TableSpecificationArgs() {}

    private TableSpecificationArgs(TableSpecificationArgs $) {
        this.description = $.description;
        this.format = $.format;
        this.properties = $.properties;
        this.title = $.title;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableSpecificationArgs $;

        public Builder() {
            $ = new TableSpecificationArgs();
        }

        public Builder(TableSpecificationArgs defaults) {
            $ = new TableSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Swagger schema description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Swagger schema description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param format The format, if &#39;type&#39; is not &#39;object&#39;
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format, if &#39;type&#39; is not &#39;object&#39;
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param properties The set of columns within the data table.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,ColumnSpecificationArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The set of columns within the data table.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,ColumnSpecificationArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param title Swagger schema title.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Swagger schema title.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param type The type of the entity described in swagger.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the entity described in swagger.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TableSpecificationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).def("object").require();
            return $;
        }
    }

}
