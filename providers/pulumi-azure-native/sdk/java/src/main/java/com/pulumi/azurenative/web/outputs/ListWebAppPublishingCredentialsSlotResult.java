// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppPublishingCredentialsSlotResult {
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return Password used for publishing.
     * 
     */
    private final @Nullable String publishingPassword;
    /**
     * @return Password hash used for publishing.
     * 
     */
    private final @Nullable String publishingPasswordHash;
    /**
     * @return Password hash salt used for publishing.
     * 
     */
    private final @Nullable String publishingPasswordHashSalt;
    /**
     * @return Username used for publishing.
     * 
     */
    private final String publishingUserName;
    /**
     * @return Url of SCM site.
     * 
     */
    private final @Nullable String scmUri;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListWebAppPublishingCredentialsSlotResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publishingPassword") @Nullable String publishingPassword,
        @CustomType.Parameter("publishingPasswordHash") @Nullable String publishingPasswordHash,
        @CustomType.Parameter("publishingPasswordHashSalt") @Nullable String publishingPasswordHashSalt,
        @CustomType.Parameter("publishingUserName") String publishingUserName,
        @CustomType.Parameter("scmUri") @Nullable String scmUri,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.publishingPassword = publishingPassword;
        this.publishingPasswordHash = publishingPasswordHash;
        this.publishingPasswordHashSalt = publishingPasswordHashSalt;
        this.publishingUserName = publishingUserName;
        this.scmUri = scmUri;
        this.type = type;
    }

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Password used for publishing.
     * 
     */
    public Optional<String> publishingPassword() {
        return Optional.ofNullable(this.publishingPassword);
    }
    /**
     * @return Password hash used for publishing.
     * 
     */
    public Optional<String> publishingPasswordHash() {
        return Optional.ofNullable(this.publishingPasswordHash);
    }
    /**
     * @return Password hash salt used for publishing.
     * 
     */
    public Optional<String> publishingPasswordHashSalt() {
        return Optional.ofNullable(this.publishingPasswordHashSalt);
    }
    /**
     * @return Username used for publishing.
     * 
     */
    public String publishingUserName() {
        return this.publishingUserName;
    }
    /**
     * @return Url of SCM site.
     * 
     */
    public Optional<String> scmUri() {
        return Optional.ofNullable(this.scmUri);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppPublishingCredentialsSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String publishingPassword;
        private @Nullable String publishingPasswordHash;
        private @Nullable String publishingPasswordHashSalt;
        private String publishingUserName;
        private @Nullable String scmUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppPublishingCredentialsSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publishingPassword = defaults.publishingPassword;
    	      this.publishingPasswordHash = defaults.publishingPasswordHash;
    	      this.publishingPasswordHashSalt = defaults.publishingPasswordHashSalt;
    	      this.publishingUserName = defaults.publishingUserName;
    	      this.scmUri = defaults.scmUri;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publishingPassword(@Nullable String publishingPassword) {
            this.publishingPassword = publishingPassword;
            return this;
        }
        public Builder publishingPasswordHash(@Nullable String publishingPasswordHash) {
            this.publishingPasswordHash = publishingPasswordHash;
            return this;
        }
        public Builder publishingPasswordHashSalt(@Nullable String publishingPasswordHashSalt) {
            this.publishingPasswordHashSalt = publishingPasswordHashSalt;
            return this;
        }
        public Builder publishingUserName(String publishingUserName) {
            this.publishingUserName = Objects.requireNonNull(publishingUserName);
            return this;
        }
        public Builder scmUri(@Nullable String scmUri) {
            this.scmUri = scmUri;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListWebAppPublishingCredentialsSlotResult build() {
            return new ListWebAppPublishingCredentialsSlotResult(id, kind, name, publishingPassword, publishingPasswordHash, publishingPasswordHashSalt, publishingUserName, scmUri, type);
        }
    }
}
