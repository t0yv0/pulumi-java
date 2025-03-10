// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddonVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddonVersionArgs Empty = new GetAddonVersionArgs();

    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    @Import(name="addonName", required=true)
    private String addonName;

    /**
     * @return Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    public String addonName() {
        return this.addonName;
    }

    /**
     * Version of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="kubernetesVersion", required=true)
    private String kubernetesVersion;

    /**
     * @return Version of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Determines if the most recent or default version of the addon should be returned.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return Determines if the most recent or default version of the addon should be returned.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    private GetAddonVersionArgs() {}

    private GetAddonVersionArgs(GetAddonVersionArgs $) {
        this.addonName = $.addonName;
        this.kubernetesVersion = $.kubernetesVersion;
        this.mostRecent = $.mostRecent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddonVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddonVersionArgs $;

        public Builder() {
            $ = new GetAddonVersionArgs();
        }

        public Builder(GetAddonVersionArgs defaults) {
            $ = new GetAddonVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addonName Name of the EKS add-on. The name must match one of
         * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
         * 
         * @return builder
         * 
         */
        public Builder addonName(String addonName) {
            $.addonName = addonName;
            return this;
        }

        /**
         * @param kubernetesVersion Version of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param mostRecent Determines if the most recent or default version of the addon should be returned.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        public GetAddonVersionArgs build() {
            $.addonName = Objects.requireNonNull($.addonName, "expected parameter 'addonName' to be non-null");
            $.kubernetesVersion = Objects.requireNonNull($.kubernetesVersion, "expected parameter 'kubernetesVersion' to be non-null");
            return $;
        }
    }

}
