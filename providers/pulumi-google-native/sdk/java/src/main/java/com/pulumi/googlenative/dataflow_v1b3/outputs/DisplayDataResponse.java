// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DisplayDataResponse {
    /**
     * @return Contains value if the data is of a boolean type.
     * 
     */
    private final Boolean boolValue;
    /**
     * @return Contains value if the data is of duration type.
     * 
     */
    private final String durationValue;
    /**
     * @return Contains value if the data is of float type.
     * 
     */
    private final Double floatValue;
    /**
     * @return Contains value if the data is of int64 type.
     * 
     */
    private final String int64Value;
    /**
     * @return Contains value if the data is of java class type.
     * 
     */
    private final String javaClassValue;
    /**
     * @return The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    private final String key;
    /**
     * @return An optional label to display in a dax UI for the element.
     * 
     */
    private final String label;
    /**
     * @return The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    private final String namespace;
    /**
     * @return A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    private final String shortStrValue;
    /**
     * @return Contains value if the data is of string type.
     * 
     */
    private final String strValue;
    /**
     * @return Contains value if the data is of timestamp type.
     * 
     */
    private final String timestampValue;
    /**
     * @return An optional full URL.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private DisplayDataResponse(
        @CustomType.Parameter("boolValue") Boolean boolValue,
        @CustomType.Parameter("durationValue") String durationValue,
        @CustomType.Parameter("floatValue") Double floatValue,
        @CustomType.Parameter("int64Value") String int64Value,
        @CustomType.Parameter("javaClassValue") String javaClassValue,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("shortStrValue") String shortStrValue,
        @CustomType.Parameter("strValue") String strValue,
        @CustomType.Parameter("timestampValue") String timestampValue,
        @CustomType.Parameter("url") String url) {
        this.boolValue = boolValue;
        this.durationValue = durationValue;
        this.floatValue = floatValue;
        this.int64Value = int64Value;
        this.javaClassValue = javaClassValue;
        this.key = key;
        this.label = label;
        this.namespace = namespace;
        this.shortStrValue = shortStrValue;
        this.strValue = strValue;
        this.timestampValue = timestampValue;
        this.url = url;
    }

    /**
     * @return Contains value if the data is of a boolean type.
     * 
     */
    public Boolean boolValue() {
        return this.boolValue;
    }
    /**
     * @return Contains value if the data is of duration type.
     * 
     */
    public String durationValue() {
        return this.durationValue;
    }
    /**
     * @return Contains value if the data is of float type.
     * 
     */
    public Double floatValue() {
        return this.floatValue;
    }
    /**
     * @return Contains value if the data is of int64 type.
     * 
     */
    public String int64Value() {
        return this.int64Value;
    }
    /**
     * @return Contains value if the data is of java class type.
     * 
     */
    public String javaClassValue() {
        return this.javaClassValue;
    }
    /**
     * @return The key identifying the display data. This is intended to be used as a label for the display data when viewed in a dax monitoring system.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return An optional label to display in a dax UI for the element.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The namespace for the key. This is usually a class name or programming language namespace (i.e. python module) which defines the display data. This allows a dax monitoring system to specially handle the data and perform custom rendering.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return A possible additional shorter value to display. For example a java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn as the java_class_name value. short_str_value can be displayed and java_class_name_value will be displayed as a tooltip.
     * 
     */
    public String shortStrValue() {
        return this.shortStrValue;
    }
    /**
     * @return Contains value if the data is of string type.
     * 
     */
    public String strValue() {
        return this.strValue;
    }
    /**
     * @return Contains value if the data is of timestamp type.
     * 
     */
    public String timestampValue() {
        return this.timestampValue;
    }
    /**
     * @return An optional full URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private String durationValue;
        private Double floatValue;
        private String int64Value;
        private String javaClassValue;
        private String key;
        private String label;
        private String namespace;
        private String shortStrValue;
        private String strValue;
        private String timestampValue;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.durationValue = defaults.durationValue;
    	      this.floatValue = defaults.floatValue;
    	      this.int64Value = defaults.int64Value;
    	      this.javaClassValue = defaults.javaClassValue;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.namespace = defaults.namespace;
    	      this.shortStrValue = defaults.shortStrValue;
    	      this.strValue = defaults.strValue;
    	      this.timestampValue = defaults.timestampValue;
    	      this.url = defaults.url;
        }

        public Builder boolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }
        public Builder durationValue(String durationValue) {
            this.durationValue = Objects.requireNonNull(durationValue);
            return this;
        }
        public Builder floatValue(Double floatValue) {
            this.floatValue = Objects.requireNonNull(floatValue);
            return this;
        }
        public Builder int64Value(String int64Value) {
            this.int64Value = Objects.requireNonNull(int64Value);
            return this;
        }
        public Builder javaClassValue(String javaClassValue) {
            this.javaClassValue = Objects.requireNonNull(javaClassValue);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder shortStrValue(String shortStrValue) {
            this.shortStrValue = Objects.requireNonNull(shortStrValue);
            return this;
        }
        public Builder strValue(String strValue) {
            this.strValue = Objects.requireNonNull(strValue);
            return this;
        }
        public Builder timestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public DisplayDataResponse build() {
            return new DisplayDataResponse(boolValue, durationValue, floatValue, int64Value, javaClassValue, key, label, namespace, shortStrValue, strValue, timestampValue, url);
        }
    }
}
