// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.enums.TemplateContentsInterpreter;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.ImportFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Files that make up the template contents of a template type.
 * 
 */
public final class TemplateContentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateContentsArgs Empty = new TemplateContentsArgs();

    /**
     * Import files referenced by the main template.
     * 
     */
    @Import(name="imports")
    private @Nullable Output<List<ImportFileArgs>> imports;

    /**
     * @return Import files referenced by the main template.
     * 
     */
    public Optional<Output<List<ImportFileArgs>>> imports() {
        return Optional.ofNullable(this.imports);
    }

    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    @Import(name="interpreter")
    private @Nullable Output<TemplateContentsInterpreter> interpreter;

    /**
     * @return Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    public Optional<Output<TemplateContentsInterpreter>> interpreter() {
        return Optional.ofNullable(this.interpreter);
    }

    /**
     * The filename of the mainTemplate
     * 
     */
    @Import(name="mainTemplate")
    private @Nullable Output<String> mainTemplate;

    /**
     * @return The filename of the mainTemplate
     * 
     */
    public Optional<Output<String>> mainTemplate() {
        return Optional.ofNullable(this.mainTemplate);
    }

    /**
     * The contents of the template schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The contents of the template schema.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The contents of the main template file.
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The contents of the main template file.
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    private TemplateContentsArgs() {}

    private TemplateContentsArgs(TemplateContentsArgs $) {
        this.imports = $.imports;
        this.interpreter = $.interpreter;
        this.mainTemplate = $.mainTemplate;
        this.schema = $.schema;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateContentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateContentsArgs $;

        public Builder() {
            $ = new TemplateContentsArgs();
        }

        public Builder(TemplateContentsArgs defaults) {
            $ = new TemplateContentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imports Import files referenced by the main template.
         * 
         * @return builder
         * 
         */
        public Builder imports(@Nullable Output<List<ImportFileArgs>> imports) {
            $.imports = imports;
            return this;
        }

        /**
         * @param imports Import files referenced by the main template.
         * 
         * @return builder
         * 
         */
        public Builder imports(List<ImportFileArgs> imports) {
            return imports(Output.of(imports));
        }

        /**
         * @param imports Import files referenced by the main template.
         * 
         * @return builder
         * 
         */
        public Builder imports(ImportFileArgs... imports) {
            return imports(List.of(imports));
        }

        /**
         * @param interpreter Which interpreter (python or jinja) should be used during expansion.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(@Nullable Output<TemplateContentsInterpreter> interpreter) {
            $.interpreter = interpreter;
            return this;
        }

        /**
         * @param interpreter Which interpreter (python or jinja) should be used during expansion.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(TemplateContentsInterpreter interpreter) {
            return interpreter(Output.of(interpreter));
        }

        /**
         * @param mainTemplate The filename of the mainTemplate
         * 
         * @return builder
         * 
         */
        public Builder mainTemplate(@Nullable Output<String> mainTemplate) {
            $.mainTemplate = mainTemplate;
            return this;
        }

        /**
         * @param mainTemplate The filename of the mainTemplate
         * 
         * @return builder
         * 
         */
        public Builder mainTemplate(String mainTemplate) {
            return mainTemplate(Output.of(mainTemplate));
        }

        /**
         * @param schema The contents of the template schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The contents of the template schema.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param template The contents of the main template file.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The contents of the main template file.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        public TemplateContentsArgs build() {
            return $;
        }
    }

}
