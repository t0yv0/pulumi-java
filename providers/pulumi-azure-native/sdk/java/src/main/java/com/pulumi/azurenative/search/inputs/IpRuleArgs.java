// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IP restriction rule of the Azure Cognitive Search service.
 * 
 */
public final class IpRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpRuleArgs Empty = new IpRuleArgs();

    /**
     * Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private IpRuleArgs() {}

    private IpRuleArgs(IpRuleArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpRuleArgs $;

        public Builder() {
            $ = new IpRuleArgs();
        }

        public Builder(IpRuleArgs defaults) {
            $ = new IpRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IpRuleArgs build() {
            return $;
        }
    }

}
