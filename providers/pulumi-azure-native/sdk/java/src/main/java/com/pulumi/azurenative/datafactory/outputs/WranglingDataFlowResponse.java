// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import com.pulumi.azurenative.datafactory.outputs.PowerQuerySourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WranglingDataFlowResponse {
    /**
     * @return List of tags that can be used for describing the data flow.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The description of the data flow.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Locale of the Power query mashup document.
     * 
     */
    private final @Nullable String documentLocale;
    /**
     * @return The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    private final @Nullable DataFlowResponseFolder folder;
    /**
     * @return Power query mashup script.
     * 
     */
    private final @Nullable String script;
    /**
     * @return List of sources in Power Query.
     * 
     */
    private final @Nullable List<PowerQuerySourceResponse> sources;
    /**
     * @return Type of data flow.
     * Expected value is &#39;WranglingDataFlow&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private WranglingDataFlowResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("documentLocale") @Nullable String documentLocale,
        @CustomType.Parameter("folder") @Nullable DataFlowResponseFolder folder,
        @CustomType.Parameter("script") @Nullable String script,
        @CustomType.Parameter("sources") @Nullable List<PowerQuerySourceResponse> sources,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.description = description;
        this.documentLocale = documentLocale;
        this.folder = folder;
        this.script = script;
        this.sources = sources;
        this.type = type;
    }

    /**
     * @return List of tags that can be used for describing the data flow.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The description of the data flow.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Locale of the Power query mashup document.
     * 
     */
    public Optional<String> documentLocale() {
        return Optional.ofNullable(this.documentLocale);
    }
    /**
     * @return The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    public Optional<DataFlowResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return Power query mashup script.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    /**
     * @return List of sources in Power Query.
     * 
     */
    public List<PowerQuerySourceResponse> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Type of data flow.
     * Expected value is &#39;WranglingDataFlow&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WranglingDataFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable String documentLocale;
        private @Nullable DataFlowResponseFolder folder;
        private @Nullable String script;
        private @Nullable List<PowerQuerySourceResponse> sources;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WranglingDataFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.documentLocale = defaults.documentLocale;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.sources = defaults.sources;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder documentLocale(@Nullable String documentLocale) {
            this.documentLocale = documentLocale;
            return this;
        }
        public Builder folder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }
        public Builder sources(@Nullable List<PowerQuerySourceResponse> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(PowerQuerySourceResponse... sources) {
            return sources(List.of(sources));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public WranglingDataFlowResponse build() {
            return new WranglingDataFlowResponse(annotations, description, documentLocale, folder, script, sources, type);
        }
    }
}
