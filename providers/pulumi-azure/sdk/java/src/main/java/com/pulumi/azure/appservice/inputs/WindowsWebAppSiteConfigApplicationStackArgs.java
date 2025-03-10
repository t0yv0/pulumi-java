// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsWebAppSiteConfigApplicationStackArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsWebAppSiteConfigApplicationStackArgs Empty = new WindowsWebAppSiteConfigApplicationStackArgs();

    /**
     * The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
     * 
     */
    @Import(name="currentStack")
    private @Nullable Output<String> currentStack;

    /**
     * @return The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
     * 
     */
    public Optional<Output<String>> currentStack() {
        return Optional.ofNullable(this.currentStack);
    }

    /**
     * The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
     * 
     */
    @Import(name="dockerContainerName")
    private @Nullable Output<String> dockerContainerName;

    /**
     * @return The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
     * 
     */
    public Optional<Output<String>> dockerContainerName() {
        return Optional.ofNullable(this.dockerContainerName);
    }

    /**
     * The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
     * 
     */
    @Import(name="dockerContainerRegistry")
    private @Nullable Output<String> dockerContainerRegistry;

    /**
     * @return The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
     * 
     */
    public Optional<Output<String>> dockerContainerRegistry() {
        return Optional.ofNullable(this.dockerContainerRegistry);
    }

    /**
     * The Image Tag of the specified Docker Container to use. For example `latest`
     * 
     */
    @Import(name="dockerContainerTag")
    private @Nullable Output<String> dockerContainerTag;

    /**
     * @return The Image Tag of the specified Docker Container to use. For example `latest`
     * 
     */
    public Optional<Output<String>> dockerContainerTag() {
        return Optional.ofNullable(this.dockerContainerTag);
    }

    /**
     * The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include `v3.0`, `v4.0`, `v5.0`, and `v6.0`.
     * 
     */
    @Import(name="dotnetVersion")
    private @Nullable Output<String> dotnetVersion;

    /**
     * @return The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include `v3.0`, `v4.0`, `v5.0`, and `v6.0`.
     * 
     */
    public Optional<Output<String>> dotnetVersion() {
        return Optional.ofNullable(this.dotnetVersion);
    }

    /**
     * The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
     * 
     */
    @Import(name="javaContainer")
    private @Nullable Output<String> javaContainer;

    /**
     * @return The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
     * 
     */
    public Optional<Output<String>> javaContainer() {
        return Optional.ofNullable(this.javaContainer);
    }

    /**
     * The Version of the `java_container` to use. Required with `java_version` and `java_container`.
     * 
     */
    @Import(name="javaContainerVersion")
    private @Nullable Output<String> javaContainerVersion;

    /**
     * @return The Version of the `java_container` to use. Required with `java_version` and `java_container`.
     * 
     */
    public Optional<Output<String>> javaContainerVersion() {
        return Optional.ofNullable(this.javaContainerVersion);
    }

    /**
     * The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
     * 
     */
    @Import(name="javaVersion")
    private @Nullable Output<String> javaVersion;

    /**
     * @return The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
     * 
     */
    public Optional<Output<String>> javaVersion() {
        return Optional.ofNullable(this.javaVersion);
    }

    /**
     * The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
     * 
     */
    @Import(name="nodeVersion")
    private @Nullable Output<String> nodeVersion;

    /**
     * @return The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
     * 
     */
    public Optional<Output<String>> nodeVersion() {
        return Optional.ofNullable(this.nodeVersion);
    }

    /**
     * The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
     * 
     */
    @Import(name="phpVersion")
    private @Nullable Output<String> phpVersion;

    /**
     * @return The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
     * 
     */
    public Optional<Output<String>> phpVersion() {
        return Optional.ofNullable(this.phpVersion);
    }

    /**
     * The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
     * 
     */
    @Import(name="pythonVersion")
    private @Nullable Output<String> pythonVersion;

    /**
     * @return The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
     * 
     */
    public Optional<Output<String>> pythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }

    private WindowsWebAppSiteConfigApplicationStackArgs() {}

    private WindowsWebAppSiteConfigApplicationStackArgs(WindowsWebAppSiteConfigApplicationStackArgs $) {
        this.currentStack = $.currentStack;
        this.dockerContainerName = $.dockerContainerName;
        this.dockerContainerRegistry = $.dockerContainerRegistry;
        this.dockerContainerTag = $.dockerContainerTag;
        this.dotnetVersion = $.dotnetVersion;
        this.javaContainer = $.javaContainer;
        this.javaContainerVersion = $.javaContainerVersion;
        this.javaVersion = $.javaVersion;
        this.nodeVersion = $.nodeVersion;
        this.phpVersion = $.phpVersion;
        this.pythonVersion = $.pythonVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsWebAppSiteConfigApplicationStackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSiteConfigApplicationStackArgs $;

        public Builder() {
            $ = new WindowsWebAppSiteConfigApplicationStackArgs();
        }

        public Builder(WindowsWebAppSiteConfigApplicationStackArgs defaults) {
            $ = new WindowsWebAppSiteConfigApplicationStackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentStack The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
         * 
         * @return builder
         * 
         */
        public Builder currentStack(@Nullable Output<String> currentStack) {
            $.currentStack = currentStack;
            return this;
        }

        /**
         * @param currentStack The Application Stack for the Windows Web App. Possible values include `dotnet`, `dotnetcore`, `node`, `python`, `php`, and `java`.
         * 
         * @return builder
         * 
         */
        public Builder currentStack(String currentStack) {
            return currentStack(Output.of(currentStack));
        }

        /**
         * @param dockerContainerName The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerName(@Nullable Output<String> dockerContainerName) {
            $.dockerContainerName = dockerContainerName;
            return this;
        }

        /**
         * @param dockerContainerName The name of the Docker Container. For example `azure-app-service/samples/aspnethelloworld`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerName(String dockerContainerName) {
            return dockerContainerName(Output.of(dockerContainerName));
        }

        /**
         * @param dockerContainerRegistry The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerRegistry(@Nullable Output<String> dockerContainerRegistry) {
            $.dockerContainerRegistry = dockerContainerRegistry;
            return this;
        }

        /**
         * @param dockerContainerRegistry The registry Host on which the specified Docker Container can be located. For example `mcr.microsoft.com`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerRegistry(String dockerContainerRegistry) {
            return dockerContainerRegistry(Output.of(dockerContainerRegistry));
        }

        /**
         * @param dockerContainerTag The Image Tag of the specified Docker Container to use. For example `latest`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerTag(@Nullable Output<String> dockerContainerTag) {
            $.dockerContainerTag = dockerContainerTag;
            return this;
        }

        /**
         * @param dockerContainerTag The Image Tag of the specified Docker Container to use. For example `latest`
         * 
         * @return builder
         * 
         */
        public Builder dockerContainerTag(String dockerContainerTag) {
            return dockerContainerTag(Output.of(dockerContainerTag));
        }

        /**
         * @param dotnetVersion The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include `v3.0`, `v4.0`, `v5.0`, and `v6.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetVersion(@Nullable Output<String> dotnetVersion) {
            $.dotnetVersion = dotnetVersion;
            return this;
        }

        /**
         * @param dotnetVersion The version of .NET to use when `current_stack` is set to `dotnet`. Possible values include `v3.0`, `v4.0`, `v5.0`, and `v6.0`.
         * 
         * @return builder
         * 
         */
        public Builder dotnetVersion(String dotnetVersion) {
            return dotnetVersion(Output.of(dotnetVersion));
        }

        /**
         * @param javaContainer The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
         * 
         * @return builder
         * 
         */
        public Builder javaContainer(@Nullable Output<String> javaContainer) {
            $.javaContainer = javaContainer;
            return this;
        }

        /**
         * @param javaContainer The Java container type to use when `current_stack` is set to `java`. Possible values include `JAVA`, `JETTY`, and `TOMCAT`. Required with `java_version` and `java_container_version`.
         * 
         * @return builder
         * 
         */
        public Builder javaContainer(String javaContainer) {
            return javaContainer(Output.of(javaContainer));
        }

        /**
         * @param javaContainerVersion The Version of the `java_container` to use. Required with `java_version` and `java_container`.
         * 
         * @return builder
         * 
         */
        public Builder javaContainerVersion(@Nullable Output<String> javaContainerVersion) {
            $.javaContainerVersion = javaContainerVersion;
            return this;
        }

        /**
         * @param javaContainerVersion The Version of the `java_container` to use. Required with `java_version` and `java_container`.
         * 
         * @return builder
         * 
         */
        public Builder javaContainerVersion(String javaContainerVersion) {
            return javaContainerVersion(Output.of(javaContainerVersion));
        }

        /**
         * @param javaVersion The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
         * 
         * @return builder
         * 
         */
        public Builder javaVersion(@Nullable Output<String> javaVersion) {
            $.javaVersion = javaVersion;
            return this;
        }

        /**
         * @param javaVersion The version of Java to use when `current_stack` is set to `java`. Possible values include `1.7`, `1.8` and `11`. Required with `java_container` and `java_container_version`.
         * 
         * @return builder
         * 
         */
        public Builder javaVersion(String javaVersion) {
            return javaVersion(Output.of(javaVersion));
        }

        /**
         * @param nodeVersion The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(@Nullable Output<String> nodeVersion) {
            $.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * @param nodeVersion The version of node to use when `current_stack` is set to `node`. Possible values include `12-LTS`, `14-LTS`, and `16-LTS`.
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(String nodeVersion) {
            return nodeVersion(Output.of(nodeVersion));
        }

        /**
         * @param phpVersion The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
         * 
         * @return builder
         * 
         */
        public Builder phpVersion(@Nullable Output<String> phpVersion) {
            $.phpVersion = phpVersion;
            return this;
        }

        /**
         * @param phpVersion The version of PHP to use when `current_stack` is set to `php`. Possible values include `v7.4`.
         * 
         * @return builder
         * 
         */
        public Builder phpVersion(String phpVersion) {
            return phpVersion(Output.of(phpVersion));
        }

        /**
         * @param pythonVersion The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        /**
         * @param pythonVersion The version of Python to use when `current_stack` is set to `python`. Possible values include `2.7` and `3.4.0`.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(String pythonVersion) {
            return pythonVersion(Output.of(pythonVersion));
        }

        public WindowsWebAppSiteConfigApplicationStackArgs build() {
            return $;
        }
    }

}
