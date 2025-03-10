// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTagArgs Empty = new PolicyTagArgs();

    /**
     * Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
     * 
     */
    @Import(name="parentPolicyTag")
    private @Nullable Output<String> parentPolicyTag;

    /**
     * @return Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
     * 
     */
    public Optional<Output<String>> parentPolicyTag() {
        return Optional.ofNullable(this.parentPolicyTag);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="taxonomyId", required=true)
    private Output<String> taxonomyId;

    public Output<String> taxonomyId() {
        return this.taxonomyId;
    }

    private PolicyTagArgs() {}

    private PolicyTagArgs(PolicyTagArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.parentPolicyTag = $.parentPolicyTag;
        this.project = $.project;
        this.taxonomyId = $.taxonomyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagArgs $;

        public Builder() {
            $ = new PolicyTagArgs();
        }

        public Builder(PolicyTagArgs defaults) {
            $ = new PolicyTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parentPolicyTag Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
         * 
         * @return builder
         * 
         */
        public Builder parentPolicyTag(@Nullable Output<String> parentPolicyTag) {
            $.parentPolicyTag = parentPolicyTag;
            return this;
        }

        /**
         * @param parentPolicyTag Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
         * 
         * @return builder
         * 
         */
        public Builder parentPolicyTag(String parentPolicyTag) {
            return parentPolicyTag(Output.of(parentPolicyTag));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder taxonomyId(Output<String> taxonomyId) {
            $.taxonomyId = taxonomyId;
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            return taxonomyId(Output.of(taxonomyId));
        }

        public PolicyTagArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.taxonomyId = Objects.requireNonNull($.taxonomyId, "expected parameter 'taxonomyId' to be non-null");
            return $;
        }
    }

}
