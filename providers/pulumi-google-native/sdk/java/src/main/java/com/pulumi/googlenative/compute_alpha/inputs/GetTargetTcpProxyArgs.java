// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetTcpProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetTcpProxyArgs Empty = new GetTargetTcpProxyArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetTcpProxy", required=true)
    private String targetTcpProxy;

    public String targetTcpProxy() {
        return this.targetTcpProxy;
    }

    private GetTargetTcpProxyArgs() {}

    private GetTargetTcpProxyArgs(GetTargetTcpProxyArgs $) {
        this.project = $.project;
        this.targetTcpProxy = $.targetTcpProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetTcpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetTcpProxyArgs $;

        public Builder() {
            $ = new GetTargetTcpProxyArgs();
        }

        public Builder(GetTargetTcpProxyArgs defaults) {
            $ = new GetTargetTcpProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetTcpProxy(String targetTcpProxy) {
            $.targetTcpProxy = targetTcpProxy;
            return this;
        }

        public GetTargetTcpProxyArgs build() {
            $.targetTcpProxy = Objects.requireNonNull($.targetTcpProxy, "expected parameter 'targetTcpProxy' to be non-null");
            return $;
        }
    }

}
