// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleSourceIpConfig {
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ListenerRuleSourceIpConfig(@CustomType.Parameter("values") @Nullable List<String> values) {
        this.values = values;
    }

    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleSourceIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleSourceIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ListenerRuleSourceIpConfig build() {
            return new ListenerRuleSourceIpConfig(values);
        }
    }
}
