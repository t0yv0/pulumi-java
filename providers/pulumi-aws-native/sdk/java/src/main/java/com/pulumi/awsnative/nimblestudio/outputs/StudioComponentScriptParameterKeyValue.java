// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StudioComponentScriptParameterKeyValue {
    /**
     * @return &lt;p&gt;A script parameter key.&lt;/p&gt;
     * 
     */
    private final @Nullable String key;
    /**
     * @return &lt;p&gt;A script parameter value.&lt;/p&gt;
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private StudioComponentScriptParameterKeyValue(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return &lt;p&gt;A script parameter key.&lt;/p&gt;
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return &lt;p&gt;A script parameter value.&lt;/p&gt;
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentScriptParameterKeyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentScriptParameterKeyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public StudioComponentScriptParameterKeyValue build() {
            return new StudioComponentScriptParameterKeyValue(key, value);
        }
    }
}
