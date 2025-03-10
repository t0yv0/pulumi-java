// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import com.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import com.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublishedBlueprintArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublishedBlueprintArgs Empty = new PublishedBlueprintArgs();

    /**
     * Name of the published blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
    private Output<String> blueprintName;

    /**
     * @return Name of the published blueprint definition.
     * 
     */
    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * Version-specific change notes.
     * 
     */
    @Import(name="changeNotes")
    private @Nullable Output<String> changeNotes;

    /**
     * @return Version-specific change notes.
     * 
     */
    public Optional<Output<String>> changeNotes() {
        return Optional.ofNullable(this.changeNotes);
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;

    /**
     * @return Parameters required by this blueprint definition.
     * 
     */
    public Optional<Output<Map<String,ParameterDefinitionArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @Import(name="resourceGroups")
    private @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    /**
     * @return Resource group placeholders defined by this blueprint definition.
     * 
     */
    public Optional<Output<Map<String,ResourceGroupDefinitionArgs>>> resourceGroups() {
        return Optional.ofNullable(this.resourceGroups);
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
    private Output<String> resourceScope;

    /**
     * @return The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @Import(name="targetScope")
    private @Nullable Output<Either<String,BlueprintTargetScope>> targetScope;

    /**
     * @return The scope where this blueprint definition can be assigned.
     * 
     */
    public Optional<Output<Either<String,BlueprintTargetScope>>> targetScope() {
        return Optional.ofNullable(this.targetScope);
    }

    /**
     * Version of the published blueprint definition.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return Version of the published blueprint definition.
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private PublishedBlueprintArgs() {}

    private PublishedBlueprintArgs(PublishedBlueprintArgs $) {
        this.blueprintName = $.blueprintName;
        this.changeNotes = $.changeNotes;
        this.description = $.description;
        this.displayName = $.displayName;
        this.parameters = $.parameters;
        this.resourceGroups = $.resourceGroups;
        this.resourceScope = $.resourceScope;
        this.targetScope = $.targetScope;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublishedBlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublishedBlueprintArgs $;

        public Builder() {
            $ = new PublishedBlueprintArgs();
        }

        public Builder(PublishedBlueprintArgs defaults) {
            $ = new PublishedBlueprintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprintName Name of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(Output<String> blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param blueprintName Name of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            return blueprintName(Output.of(blueprintName));
        }

        /**
         * @param changeNotes Version-specific change notes.
         * 
         * @return builder
         * 
         */
        public Builder changeNotes(@Nullable Output<String> changeNotes) {
            $.changeNotes = changeNotes;
            return this;
        }

        /**
         * @param changeNotes Version-specific change notes.
         * 
         * @return builder
         * 
         */
        public Builder changeNotes(String changeNotes) {
            return changeNotes(Output.of(changeNotes));
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param parameters Parameters required by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters required by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterDefinitionArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroups Resource group placeholders defined by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(@Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            $.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * @param resourceGroups Resource group placeholders defined by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            return resourceGroups(Output.of(resourceGroups));
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(Output<String> resourceScope) {
            $.resourceScope = resourceScope;
            return this;
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(String resourceScope) {
            return resourceScope(Output.of(resourceScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(@Nullable Output<Either<String,BlueprintTargetScope>> targetScope) {
            $.targetScope = targetScope;
            return this;
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(Either<String,BlueprintTargetScope> targetScope) {
            return targetScope(Output.of(targetScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(String targetScope) {
            return targetScope(Either.ofLeft(targetScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(BlueprintTargetScope targetScope) {
            return targetScope(Either.ofRight(targetScope));
        }

        /**
         * @param versionId Version of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Version of the published blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public PublishedBlueprintArgs build() {
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.resourceScope = Objects.requireNonNull($.resourceScope, "expected parameter 'resourceScope' to be non-null");
            return $;
        }
    }

}
