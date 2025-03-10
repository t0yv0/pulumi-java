// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.outputs;

import com.pulumi.awsnative.cloudformation.enums.HookVersionVisibility;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHookVersionResult {
    /**
     * @return The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    private final @Nullable String arn;
    /**
     * @return Indicates if this type version is the current default version
     * 
     */
    private final @Nullable Boolean isDefaultVersion;
    /**
     * @return The Amazon Resource Name (ARN) of the type without the versionID.
     * 
     */
    private final @Nullable String typeArn;
    /**
     * @return The ID of the version of the type represented by this hook instance.
     * 
     */
    private final @Nullable String versionId;
    /**
     * @return The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
     */
    private final @Nullable HookVersionVisibility visibility;

    @CustomType.Constructor
    private GetHookVersionResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("isDefaultVersion") @Nullable Boolean isDefaultVersion,
        @CustomType.Parameter("typeArn") @Nullable String typeArn,
        @CustomType.Parameter("versionId") @Nullable String versionId,
        @CustomType.Parameter("visibility") @Nullable HookVersionVisibility visibility) {
        this.arn = arn;
        this.isDefaultVersion = isDefaultVersion;
        this.typeArn = typeArn;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Indicates if this type version is the current default version
     * 
     */
    public Optional<Boolean> isDefaultVersion() {
        return Optional.ofNullable(this.isDefaultVersion);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the type without the versionID.
     * 
     */
    public Optional<String> typeArn() {
        return Optional.ofNullable(this.typeArn);
    }
    /**
     * @return The ID of the version of the type represented by this hook instance.
     * 
     */
    public Optional<String> versionId() {
        return Optional.ofNullable(this.versionId);
    }
    /**
     * @return The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
     */
    public Optional<HookVersionVisibility> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHookVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean isDefaultVersion;
        private @Nullable String typeArn;
        private @Nullable String versionId;
        private @Nullable HookVersionVisibility visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHookVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.typeArn = defaults.typeArn;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder isDefaultVersion(@Nullable Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }
        public Builder typeArn(@Nullable String typeArn) {
            this.typeArn = typeArn;
            return this;
        }
        public Builder versionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder visibility(@Nullable HookVersionVisibility visibility) {
            this.visibility = visibility;
            return this;
        }        public GetHookVersionResult build() {
            return new GetHookVersionResult(arn, isDefaultVersion, typeArn, versionId, visibility);
        }
    }
}
