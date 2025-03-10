// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.ParticipantRole;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ParticipantArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParticipantArgs Empty = new ParticipantArgs();

    @Import(name="conversationId", required=true)
    private Output<String> conversationId;

    public Output<String> conversationId() {
        return this.conversationId;
    }

    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have &#39;US&#39; or &#39;CA&#39; in their market metadata values and &#39;agent&#39; in their user metadata values will be ```documents_metadata_filters { key: &#34;market&#34; value: &#34;US,CA&#34; } documents_metadata_filters { key: &#34;user&#34; value: &#34;agent&#34; }```
     * 
     */
    @Import(name="documentsMetadataFilters")
    private @Nullable Output<Map<String,String>> documentsMetadataFilters;

    /**
     * @return Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have &#39;US&#39; or &#39;CA&#39; in their market metadata values and &#39;agent&#39; in their user metadata values will be ```documents_metadata_filters { key: &#34;market&#34; value: &#34;US,CA&#34; } documents_metadata_filters { key: &#34;user&#34; value: &#34;agent&#34; }```
     * 
     */
    public Optional<Output<Map<String,String>>> documentsMetadataFilters() {
        return Optional.ofNullable(this.documentsMetadataFilters);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it&#39;s the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be &lt;= 256 characters.
     * 
     */
    @Import(name="obfuscatedExternalUserId")
    private @Nullable Output<String> obfuscatedExternalUserId;

    /**
     * @return Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it&#39;s the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be &lt;= 256 characters.
     * 
     */
    public Optional<Output<String>> obfuscatedExternalUserId() {
        return Optional.ofNullable(this.obfuscatedExternalUserId);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    @Import(name="role")
    private @Nullable Output<ParticipantRole> role;

    /**
     * @return Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    public Optional<Output<ParticipantRole>> role() {
        return Optional.ofNullable(this.role);
    }

    private ParticipantArgs() {}

    private ParticipantArgs(ParticipantArgs $) {
        this.conversationId = $.conversationId;
        this.documentsMetadataFilters = $.documentsMetadataFilters;
        this.location = $.location;
        this.name = $.name;
        this.obfuscatedExternalUserId = $.obfuscatedExternalUserId;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParticipantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParticipantArgs $;

        public Builder() {
            $ = new ParticipantArgs();
        }

        public Builder(ParticipantArgs defaults) {
            $ = new ParticipantArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationId(Output<String> conversationId) {
            $.conversationId = conversationId;
            return this;
        }

        public Builder conversationId(String conversationId) {
            return conversationId(Output.of(conversationId));
        }

        /**
         * @param documentsMetadataFilters Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have &#39;US&#39; or &#39;CA&#39; in their market metadata values and &#39;agent&#39; in their user metadata values will be ```documents_metadata_filters { key: &#34;market&#34; value: &#34;US,CA&#34; } documents_metadata_filters { key: &#34;user&#34; value: &#34;agent&#34; }```
         * 
         * @return builder
         * 
         */
        public Builder documentsMetadataFilters(@Nullable Output<Map<String,String>> documentsMetadataFilters) {
            $.documentsMetadataFilters = documentsMetadataFilters;
            return this;
        }

        /**
         * @param documentsMetadataFilters Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have &#39;US&#39; or &#39;CA&#39; in their market metadata values and &#39;agent&#39; in their user metadata values will be ```documents_metadata_filters { key: &#34;market&#34; value: &#34;US,CA&#34; } documents_metadata_filters { key: &#34;user&#34; value: &#34;agent&#34; }```
         * 
         * @return builder
         * 
         */
        public Builder documentsMetadataFilters(Map<String,String> documentsMetadataFilters) {
            return documentsMetadataFilters(Output.of(documentsMetadataFilters));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param obfuscatedExternalUserId Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it&#39;s the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be &lt;= 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder obfuscatedExternalUserId(@Nullable Output<String> obfuscatedExternalUserId) {
            $.obfuscatedExternalUserId = obfuscatedExternalUserId;
            return this;
        }

        /**
         * @param obfuscatedExternalUserId Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it&#39;s the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be &lt;= 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder obfuscatedExternalUserId(String obfuscatedExternalUserId) {
            return obfuscatedExternalUserId(Output.of(obfuscatedExternalUserId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<ParticipantRole> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
         * 
         * @return builder
         * 
         */
        public Builder role(ParticipantRole role) {
            return role(Output.of(role));
        }

        public ParticipantArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            return $;
        }
    }

}
