// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by APT. - install: `apt-get update &amp;&amp; apt-get -y install [name]` - remove: `apt-get -y remove [name]`
 * 
 */
public final class OSPolicyResourcePackageResourceAPTArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceAPTArgs Empty = new OSPolicyResourcePackageResourceAPTArgs();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Package name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceAPTArgs() {}

    private OSPolicyResourcePackageResourceAPTArgs(OSPolicyResourcePackageResourceAPTArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceAPTArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceAPTArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceAPTArgs();
        }

        public Builder(OSPolicyResourcePackageResourceAPTArgs defaults) {
            $ = new OSPolicyResourcePackageResourceAPTArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OSPolicyResourcePackageResourceAPTArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
