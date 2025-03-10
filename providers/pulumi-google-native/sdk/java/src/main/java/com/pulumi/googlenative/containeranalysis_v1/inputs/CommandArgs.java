// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Command describes a step performed as part of the build pipeline.
 * 
 */
public final class CommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    /**
     * Command-line arguments used when executing this command.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Command-line arguments used when executing this command.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Working directory (relative to project source root) used when running this command.
     * 
     */
    @Import(name="dir")
    private @Nullable Output<String> dir;

    /**
     * @return Working directory (relative to project source root) used when running this command.
     * 
     */
    public Optional<Output<String>> dir() {
        return Optional.ofNullable(this.dir);
    }

    /**
     * Environment variables set before running this command.
     * 
     */
    @Import(name="env")
    private @Nullable Output<List<String>> env;

    /**
     * @return Environment variables set before running this command.
     * 
     */
    public Optional<Output<List<String>>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * Optional unique identifier for this command, used in wait_for to reference this command as a dependency.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Optional unique identifier for this command, used in wait_for to reference this command as a dependency.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The ID(s) of the command(s) that this command depends on.
     * 
     */
    @Import(name="waitFor")
    private @Nullable Output<List<String>> waitFor;

    /**
     * @return The ID(s) of the command(s) that this command depends on.
     * 
     */
    public Optional<Output<List<String>>> waitFor() {
        return Optional.ofNullable(this.waitFor);
    }

    private CommandArgs() {}

    private CommandArgs(CommandArgs $) {
        this.args = $.args;
        this.dir = $.dir;
        this.env = $.env;
        this.id = $.id;
        this.name = $.name;
        this.waitFor = $.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandArgs $;

        public Builder() {
            $ = new CommandArgs();
        }

        public Builder(CommandArgs defaults) {
            $ = new CommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Command-line arguments used when executing this command.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Command-line arguments used when executing this command.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Command-line arguments used when executing this command.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param dir Working directory (relative to project source root) used when running this command.
         * 
         * @return builder
         * 
         */
        public Builder dir(@Nullable Output<String> dir) {
            $.dir = dir;
            return this;
        }

        /**
         * @param dir Working directory (relative to project source root) used when running this command.
         * 
         * @return builder
         * 
         */
        public Builder dir(String dir) {
            return dir(Output.of(dir));
        }

        /**
         * @param env Environment variables set before running this command.
         * 
         * @return builder
         * 
         */
        public Builder env(@Nullable Output<List<String>> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env Environment variables set before running this command.
         * 
         * @return builder
         * 
         */
        public Builder env(List<String> env) {
            return env(Output.of(env));
        }

        /**
         * @param env Environment variables set before running this command.
         * 
         * @return builder
         * 
         */
        public Builder env(String... env) {
            return env(List.of(env));
        }

        /**
         * @param id Optional unique identifier for this command, used in wait_for to reference this command as a dependency.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Optional unique identifier for this command, used in wait_for to reference this command as a dependency.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param waitFor The ID(s) of the command(s) that this command depends on.
         * 
         * @return builder
         * 
         */
        public Builder waitFor(@Nullable Output<List<String>> waitFor) {
            $.waitFor = waitFor;
            return this;
        }

        /**
         * @param waitFor The ID(s) of the command(s) that this command depends on.
         * 
         * @return builder
         * 
         */
        public Builder waitFor(List<String> waitFor) {
            return waitFor(Output.of(waitFor));
        }

        /**
         * @param waitFor The ID(s) of the command(s) that this command depends on.
         * 
         * @return builder
         * 
         */
        public Builder waitFor(String... waitFor) {
            return waitFor(List.of(waitFor));
        }

        public CommandArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
