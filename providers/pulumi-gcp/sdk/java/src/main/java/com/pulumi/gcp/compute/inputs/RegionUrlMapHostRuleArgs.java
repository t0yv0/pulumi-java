// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapHostRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapHostRuleArgs Empty = new RegionUrlMapHostRuleArgs();

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this test case.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of host patterns to match. They must be valid
     * hostnames, except * will match any string of ([a-z0-9-.]*). In
     * that case, * must be the first character and must be followed in
     * the pattern by either - or ..
     * 
     */
    @Import(name="hosts", required=true)
    private Output<List<String>> hosts;

    /**
     * @return The list of host patterns to match. They must be valid
     * hostnames, except * will match any string of ([a-z0-9-.]*). In
     * that case, * must be the first character and must be followed in
     * the pattern by either - or ..
     * 
     */
    public Output<List<String>> hosts() {
        return this.hosts;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL&#39;s host portion.
     * 
     */
    @Import(name="pathMatcher", required=true)
    private Output<String> pathMatcher;

    /**
     * @return The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL&#39;s host portion.
     * 
     */
    public Output<String> pathMatcher() {
        return this.pathMatcher;
    }

    private RegionUrlMapHostRuleArgs() {}

    private RegionUrlMapHostRuleArgs(RegionUrlMapHostRuleArgs $) {
        this.description = $.description;
        this.hosts = $.hosts;
        this.pathMatcher = $.pathMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapHostRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapHostRuleArgs $;

        public Builder() {
            $ = new RegionUrlMapHostRuleArgs();
        }

        public Builder(RegionUrlMapHostRuleArgs defaults) {
            $ = new RegionUrlMapHostRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of this test case.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this test case.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hosts The list of host patterns to match. They must be valid
         * hostnames, except * will match any string of ([a-z0-9-.]*). In
         * that case, * must be the first character and must be followed in
         * the pattern by either - or ..
         * 
         * @return builder
         * 
         */
        public Builder hosts(Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts The list of host patterns to match. They must be valid
         * hostnames, except * will match any string of ([a-z0-9-.]*). In
         * that case, * must be the first character and must be followed in
         * the pattern by either - or ..
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts The list of host patterns to match. They must be valid
         * hostnames, except * will match any string of ([a-z0-9-.]*). In
         * that case, * must be the first character and must be followed in
         * the pattern by either - or ..
         * 
         * @return builder
         * 
         */
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param pathMatcher The name of the PathMatcher to use to match the path portion of
         * the URL if the hostRule matches the URL&#39;s host portion.
         * 
         * @return builder
         * 
         */
        public Builder pathMatcher(Output<String> pathMatcher) {
            $.pathMatcher = pathMatcher;
            return this;
        }

        /**
         * @param pathMatcher The name of the PathMatcher to use to match the path portion of
         * the URL if the hostRule matches the URL&#39;s host portion.
         * 
         * @return builder
         * 
         */
        public Builder pathMatcher(String pathMatcher) {
            return pathMatcher(Output.of(pathMatcher));
        }

        public RegionUrlMapHostRuleArgs build() {
            $.hosts = Objects.requireNonNull($.hosts, "expected parameter 'hosts' to be non-null");
            $.pathMatcher = Objects.requireNonNull($.pathMatcher, "expected parameter 'pathMatcher' to be non-null");
            return $;
        }
    }

}
