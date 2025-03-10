// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb.inputs;

import com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterParameterGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupState Empty = new ClusterParameterGroupState();

    /**
     * The ARN of the documentDB cluster parameter group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the documentDB cluster parameter group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The description of the documentDB cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the documentDB cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The family of the documentDB cluster parameter group.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The family of the documentDB cluster parameter group.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the documentDB parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the documentDB parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters;

    /**
     * @return A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * 
     */
    public Optional<Output<List<ClusterParameterGroupParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ClusterParameterGroupState() {}

    private ClusterParameterGroupState(ClusterParameterGroupState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.family = $.family;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.parameters = $.parameters;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterParameterGroupState $;

        public Builder() {
            $ = new ClusterParameterGroupState();
        }

        public Builder(ClusterParameterGroupState defaults) {
            $ = new ClusterParameterGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the documentDB cluster parameter group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the documentDB cluster parameter group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description The description of the documentDB cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the documentDB cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param family The family of the documentDB cluster parameter group.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The family of the documentDB cluster parameter group.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name The name of the documentDB parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the documentDB parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param parameters A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<ClusterParameterGroupParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ClusterParameterGroupParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters A list of documentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
         * 
         * @return builder
         * 
         */
        public Builder parameters(ClusterParameterGroupParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ClusterParameterGroupState build() {
            return $;
        }
    }

}
