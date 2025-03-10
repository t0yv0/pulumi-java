// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetBinaryAzureBlobStorageLocation {
    /**
     * @return The container on the Azure Blob Storage Account hosting the file.
     * 
     */
    private final String container;
    /**
     * @return Is the `container` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean dynamicContainerEnabled;
    /**
     * @return Is the `filename` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean dynamicFilenameEnabled;
    /**
     * @return Is the `path` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean dynamicPathEnabled;
    /**
     * @return The filename of the file in the blob container.
     * 
     */
    private final @Nullable String filename;
    /**
     * @return The folder path to the file in the blob container.
     * 
     */
    private final @Nullable String path;

    @CustomType.Constructor
    private DatasetBinaryAzureBlobStorageLocation(
        @CustomType.Parameter("container") String container,
        @CustomType.Parameter("dynamicContainerEnabled") @Nullable Boolean dynamicContainerEnabled,
        @CustomType.Parameter("dynamicFilenameEnabled") @Nullable Boolean dynamicFilenameEnabled,
        @CustomType.Parameter("dynamicPathEnabled") @Nullable Boolean dynamicPathEnabled,
        @CustomType.Parameter("filename") @Nullable String filename,
        @CustomType.Parameter("path") @Nullable String path) {
        this.container = container;
        this.dynamicContainerEnabled = dynamicContainerEnabled;
        this.dynamicFilenameEnabled = dynamicFilenameEnabled;
        this.dynamicPathEnabled = dynamicPathEnabled;
        this.filename = filename;
        this.path = path;
    }

    /**
     * @return The container on the Azure Blob Storage Account hosting the file.
     * 
     */
    public String container() {
        return this.container;
    }
    /**
     * @return Is the `container` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicContainerEnabled() {
        return Optional.ofNullable(this.dynamicContainerEnabled);
    }
    /**
     * @return Is the `filename` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicFilenameEnabled() {
        return Optional.ofNullable(this.dynamicFilenameEnabled);
    }
    /**
     * @return Is the `path` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicPathEnabled() {
        return Optional.ofNullable(this.dynamicPathEnabled);
    }
    /**
     * @return The filename of the file in the blob container.
     * 
     */
    public Optional<String> filename() {
        return Optional.ofNullable(this.filename);
    }
    /**
     * @return The folder path to the file in the blob container.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetBinaryAzureBlobStorageLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private @Nullable Boolean dynamicContainerEnabled;
        private @Nullable Boolean dynamicFilenameEnabled;
        private @Nullable Boolean dynamicPathEnabled;
        private @Nullable String filename;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetBinaryAzureBlobStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dynamicContainerEnabled = defaults.dynamicContainerEnabled;
    	      this.dynamicFilenameEnabled = defaults.dynamicFilenameEnabled;
    	      this.dynamicPathEnabled = defaults.dynamicPathEnabled;
    	      this.filename = defaults.filename;
    	      this.path = defaults.path;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder dynamicContainerEnabled(@Nullable Boolean dynamicContainerEnabled) {
            this.dynamicContainerEnabled = dynamicContainerEnabled;
            return this;
        }
        public Builder dynamicFilenameEnabled(@Nullable Boolean dynamicFilenameEnabled) {
            this.dynamicFilenameEnabled = dynamicFilenameEnabled;
            return this;
        }
        public Builder dynamicPathEnabled(@Nullable Boolean dynamicPathEnabled) {
            this.dynamicPathEnabled = dynamicPathEnabled;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }        public DatasetBinaryAzureBlobStorageLocation build() {
            return new DatasetBinaryAzureBlobStorageLocation(container, dynamicContainerEnabled, dynamicFilenameEnabled, dynamicPathEnabled, filename, path);
        }
    }
}
