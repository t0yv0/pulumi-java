// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.StandardSqlDataTypeResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ArgumentResponse {
    /**
     * @return Optional. Defaults to FIXED_TYPE.
     * 
     */
    private final String argumentKind;
    /**
     * @return Required unless argument_kind = ANY_TYPE.
     * 
     */
    private final StandardSqlDataTypeResponse dataType;
    /**
     * @return Optional. Specifies whether the argument is input or output. Can be set for procedures only.
     * 
     */
    private final String mode;
    /**
     * @return Optional. The name of this argument. Can be absent for function return argument.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ArgumentResponse(
        @CustomType.Parameter("argumentKind") String argumentKind,
        @CustomType.Parameter("dataType") StandardSqlDataTypeResponse dataType,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("name") String name) {
        this.argumentKind = argumentKind;
        this.dataType = dataType;
        this.mode = mode;
        this.name = name;
    }

    /**
     * @return Optional. Defaults to FIXED_TYPE.
     * 
     */
    public String argumentKind() {
        return this.argumentKind;
    }
    /**
     * @return Required unless argument_kind = ANY_TYPE.
     * 
     */
    public StandardSqlDataTypeResponse dataType() {
        return this.dataType;
    }
    /**
     * @return Optional. Specifies whether the argument is input or output. Can be set for procedures only.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Optional. The name of this argument. Can be absent for function return argument.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String argumentKind;
        private StandardSqlDataTypeResponse dataType;
        private String mode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argumentKind = defaults.argumentKind;
    	      this.dataType = defaults.dataType;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
        }

        public Builder argumentKind(String argumentKind) {
            this.argumentKind = Objects.requireNonNull(argumentKind);
            return this;
        }
        public Builder dataType(StandardSqlDataTypeResponse dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ArgumentResponse build() {
            return new ArgumentResponse(argumentKind, dataType, mode, name);
        }
    }
}
