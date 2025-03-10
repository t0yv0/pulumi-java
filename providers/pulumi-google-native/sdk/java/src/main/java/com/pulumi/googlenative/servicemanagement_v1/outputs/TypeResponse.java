// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement_v1.outputs.FieldResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TypeResponse {
    /**
     * @return The list of fields.
     * 
     */
    private final List<FieldResponse> fields;
    /**
     * @return The fully qualified message name.
     * 
     */
    private final String name;
    /**
     * @return The list of types appearing in `oneof` definitions in this type.
     * 
     */
    private final List<String> oneofs;
    /**
     * @return The protocol buffer options.
     * 
     */
    private final List<OptionResponse> options;
    /**
     * @return The source context.
     * 
     */
    private final SourceContextResponse sourceContext;
    /**
     * @return The source syntax.
     * 
     */
    private final String syntax;

    @CustomType.Constructor
    private TypeResponse(
        @CustomType.Parameter("fields") List<FieldResponse> fields,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("oneofs") List<String> oneofs,
        @CustomType.Parameter("options") List<OptionResponse> options,
        @CustomType.Parameter("sourceContext") SourceContextResponse sourceContext,
        @CustomType.Parameter("syntax") String syntax) {
        this.fields = fields;
        this.name = name;
        this.oneofs = oneofs;
        this.options = options;
        this.sourceContext = sourceContext;
        this.syntax = syntax;
    }

    /**
     * @return The list of fields.
     * 
     */
    public List<FieldResponse> fields() {
        return this.fields;
    }
    /**
     * @return The fully qualified message name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of types appearing in `oneof` definitions in this type.
     * 
     */
    public List<String> oneofs() {
        return this.oneofs;
    }
    /**
     * @return The protocol buffer options.
     * 
     */
    public List<OptionResponse> options() {
        return this.options;
    }
    /**
     * @return The source context.
     * 
     */
    public SourceContextResponse sourceContext() {
        return this.sourceContext;
    }
    /**
     * @return The source syntax.
     * 
     */
    public String syntax() {
        return this.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldResponse> fields;
        private String name;
        private List<String> oneofs;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.oneofs = defaults.oneofs;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder fields(List<FieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(FieldResponse... fields) {
            return fields(List.of(fields));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder oneofs(List<String> oneofs) {
            this.oneofs = Objects.requireNonNull(oneofs);
            return this;
        }
        public Builder oneofs(String... oneofs) {
            return oneofs(List.of(oneofs));
        }
        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }
        public Builder sourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }
        public Builder syntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }        public TypeResponse build() {
            return new TypeResponse(fields, name, oneofs, options, sourceContext, syntax);
        }
    }
}
