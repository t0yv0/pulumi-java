// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.WidgetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the layout properties and content for a column.
 * 
 */
public final class ColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final ColumnArgs Empty = new ColumnArgs();

    /**
     * The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<String> weight;

    /**
     * @return The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    public Optional<Output<String>> weight() {
        return Optional.ofNullable(this.weight);
    }

    /**
     * The display widgets arranged vertically in this column.
     * 
     */
    @Import(name="widgets")
    private @Nullable Output<List<WidgetArgs>> widgets;

    /**
     * @return The display widgets arranged vertically in this column.
     * 
     */
    public Optional<Output<List<WidgetArgs>>> widgets() {
        return Optional.ofNullable(this.widgets);
    }

    private ColumnArgs() {}

    private ColumnArgs(ColumnArgs $) {
        this.weight = $.weight;
        this.widgets = $.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColumnArgs $;

        public Builder() {
            $ = new ColumnArgs();
        }

        public Builder(ColumnArgs defaults) {
            $ = new ColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param weight The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<String> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
         * 
         * @return builder
         * 
         */
        public Builder weight(String weight) {
            return weight(Output.of(weight));
        }

        /**
         * @param widgets The display widgets arranged vertically in this column.
         * 
         * @return builder
         * 
         */
        public Builder widgets(@Nullable Output<List<WidgetArgs>> widgets) {
            $.widgets = widgets;
            return this;
        }

        /**
         * @param widgets The display widgets arranged vertically in this column.
         * 
         * @return builder
         * 
         */
        public Builder widgets(List<WidgetArgs> widgets) {
            return widgets(Output.of(widgets));
        }

        /**
         * @param widgets The display widgets arranged vertically in this column.
         * 
         * @return builder
         * 
         */
        public Builder widgets(WidgetArgs... widgets) {
            return widgets(List.of(widgets));
        }

        public ColumnArgs build() {
            return $;
        }
    }

}
