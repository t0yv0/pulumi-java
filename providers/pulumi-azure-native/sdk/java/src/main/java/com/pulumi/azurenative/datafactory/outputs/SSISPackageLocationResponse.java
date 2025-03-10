// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.SSISAccessCredentialResponse;
import com.pulumi.azurenative.datafactory.outputs.SSISChildPackageResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SSISPackageLocationResponse {
    /**
     * @return The package access credential.
     * 
     */
    private final @Nullable SSISAccessCredentialResponse accessCredential;
    /**
     * @return The embedded child package list.
     * 
     */
    private final @Nullable List<SSISChildPackageResponse> childPackages;
    /**
     * @return The configuration file access credential.
     * 
     */
    private final @Nullable SSISAccessCredentialResponse configurationAccessCredential;
    /**
     * @return The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object configurationPath;
    /**
     * @return The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object packageContent;
    /**
     * @return The embedded package last modified date.
     * 
     */
    private final @Nullable String packageLastModifiedDate;
    /**
     * @return The package name.
     * 
     */
    private final @Nullable String packageName;
    /**
     * @return Password of the package.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword;
    /**
     * @return The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object packagePath;
    /**
     * @return The type of SSIS package location.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private SSISPackageLocationResponse(
        @CustomType.Parameter("accessCredential") @Nullable SSISAccessCredentialResponse accessCredential,
        @CustomType.Parameter("childPackages") @Nullable List<SSISChildPackageResponse> childPackages,
        @CustomType.Parameter("configurationAccessCredential") @Nullable SSISAccessCredentialResponse configurationAccessCredential,
        @CustomType.Parameter("configurationPath") @Nullable Object configurationPath,
        @CustomType.Parameter("packageContent") @Nullable Object packageContent,
        @CustomType.Parameter("packageLastModifiedDate") @Nullable String packageLastModifiedDate,
        @CustomType.Parameter("packageName") @Nullable String packageName,
        @CustomType.Parameter("packagePassword") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword,
        @CustomType.Parameter("packagePath") @Nullable Object packagePath,
        @CustomType.Parameter("type") @Nullable String type) {
        this.accessCredential = accessCredential;
        this.childPackages = childPackages;
        this.configurationAccessCredential = configurationAccessCredential;
        this.configurationPath = configurationPath;
        this.packageContent = packageContent;
        this.packageLastModifiedDate = packageLastModifiedDate;
        this.packageName = packageName;
        this.packagePassword = packagePassword;
        this.packagePath = packagePath;
        this.type = type;
    }

    /**
     * @return The package access credential.
     * 
     */
    public Optional<SSISAccessCredentialResponse> accessCredential() {
        return Optional.ofNullable(this.accessCredential);
    }
    /**
     * @return The embedded child package list.
     * 
     */
    public List<SSISChildPackageResponse> childPackages() {
        return this.childPackages == null ? List.of() : this.childPackages;
    }
    /**
     * @return The configuration file access credential.
     * 
     */
    public Optional<SSISAccessCredentialResponse> configurationAccessCredential() {
        return Optional.ofNullable(this.configurationAccessCredential);
    }
    /**
     * @return The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> configurationPath() {
        return Optional.ofNullable(this.configurationPath);
    }
    /**
     * @return The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> packageContent() {
        return Optional.ofNullable(this.packageContent);
    }
    /**
     * @return The embedded package last modified date.
     * 
     */
    public Optional<String> packageLastModifiedDate() {
        return Optional.ofNullable(this.packageLastModifiedDate);
    }
    /**
     * @return The package name.
     * 
     */
    public Optional<String> packageName() {
        return Optional.ofNullable(this.packageName);
    }
    /**
     * @return Password of the package.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> packagePassword() {
        return Optional.ofNullable(this.packagePassword);
    }
    /**
     * @return The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> packagePath() {
        return Optional.ofNullable(this.packagePath);
    }
    /**
     * @return The type of SSIS package location.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPackageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SSISAccessCredentialResponse accessCredential;
        private @Nullable List<SSISChildPackageResponse> childPackages;
        private @Nullable SSISAccessCredentialResponse configurationAccessCredential;
        private @Nullable Object configurationPath;
        private @Nullable Object packageContent;
        private @Nullable String packageLastModifiedDate;
        private @Nullable String packageName;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword;
        private @Nullable Object packagePath;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPackageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCredential = defaults.accessCredential;
    	      this.childPackages = defaults.childPackages;
    	      this.configurationAccessCredential = defaults.configurationAccessCredential;
    	      this.configurationPath = defaults.configurationPath;
    	      this.packageContent = defaults.packageContent;
    	      this.packageLastModifiedDate = defaults.packageLastModifiedDate;
    	      this.packageName = defaults.packageName;
    	      this.packagePassword = defaults.packagePassword;
    	      this.packagePath = defaults.packagePath;
    	      this.type = defaults.type;
        }

        public Builder accessCredential(@Nullable SSISAccessCredentialResponse accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }
        public Builder childPackages(@Nullable List<SSISChildPackageResponse> childPackages) {
            this.childPackages = childPackages;
            return this;
        }
        public Builder childPackages(SSISChildPackageResponse... childPackages) {
            return childPackages(List.of(childPackages));
        }
        public Builder configurationAccessCredential(@Nullable SSISAccessCredentialResponse configurationAccessCredential) {
            this.configurationAccessCredential = configurationAccessCredential;
            return this;
        }
        public Builder configurationPath(@Nullable Object configurationPath) {
            this.configurationPath = configurationPath;
            return this;
        }
        public Builder packageContent(@Nullable Object packageContent) {
            this.packageContent = packageContent;
            return this;
        }
        public Builder packageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }
        public Builder packageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }
        public Builder packagePassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword) {
            this.packagePassword = packagePassword;
            return this;
        }
        public Builder packagePath(@Nullable Object packagePath) {
            this.packagePath = packagePath;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public SSISPackageLocationResponse build() {
            return new SSISPackageLocationResponse(accessCredential, childPackages, configurationAccessCredential, configurationPath, packageContent, packageLastModifiedDate, packageName, packagePassword, packagePath, type);
        }
    }
}
