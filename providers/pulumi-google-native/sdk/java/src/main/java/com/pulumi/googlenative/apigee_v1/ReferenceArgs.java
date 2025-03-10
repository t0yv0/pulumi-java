// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReferenceArgs Empty = new ReferenceArgs();

    /**
     * Optional. A human-readable description of this reference.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A human-readable description of this reference.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
     */
    @Import(name="refers", required=true)
    private Output<String> refers;

    /**
     * @return The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
     */
    public Output<String> refers() {
        return this.refers;
    }

    /**
     * The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private ReferenceArgs() {}

    private ReferenceArgs(ReferenceArgs $) {
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.refers = $.refers;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceArgs $;

        public Builder() {
            $ = new ReferenceArgs();
        }

        public Builder(ReferenceArgs defaults) {
            $ = new ReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. A human-readable description of this reference.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A human-readable description of this reference.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param name The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param refers The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
         * 
         * @return builder
         * 
         */
        public Builder refers(Output<String> refers) {
            $.refers = refers;
            return this;
        }

        /**
         * @param refers The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
         * 
         * @return builder
         * 
         */
        public Builder refers(String refers) {
            return refers(Output.of(refers));
        }

        /**
         * @param resourceType The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of resource referred to by this reference. Valid values are &#39;KeyStore&#39; or &#39;TrustStore&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public ReferenceArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.refers = Objects.requireNonNull($.refers, "expected parameter 'refers' to be non-null");
            return $;
        }
    }

}
