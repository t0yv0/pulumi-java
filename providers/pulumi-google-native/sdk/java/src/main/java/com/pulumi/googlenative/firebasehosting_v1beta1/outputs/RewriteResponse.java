// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebasehosting_v1beta1.outputs.CloudRunRewriteResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RewriteResponse {
    /**
     * @return The request will be forwarded to Firebase Dynamic Links.
     * 
     */
    private final Boolean dynamicLinks;
    /**
     * @return The function to proxy requests to. Must match the exported function name exactly.
     * 
     */
    private final String function;
    /**
     * @return The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    private final String glob;
    /**
     * @return The URL path to rewrite the request to.
     * 
     */
    private final String path;
    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    private final String regex;
    /**
     * @return The request will be forwarded to Cloud Run.
     * 
     */
    private final CloudRunRewriteResponse run;

    @CustomType.Constructor
    private RewriteResponse(
        @CustomType.Parameter("dynamicLinks") Boolean dynamicLinks,
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("glob") String glob,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("regex") String regex,
        @CustomType.Parameter("run") CloudRunRewriteResponse run) {
        this.dynamicLinks = dynamicLinks;
        this.function = function;
        this.glob = glob;
        this.path = path;
        this.regex = regex;
        this.run = run;
    }

    /**
     * @return The request will be forwarded to Firebase Dynamic Links.
     * 
     */
    public Boolean dynamicLinks() {
        return this.dynamicLinks;
    }
    /**
     * @return The function to proxy requests to. Must match the exported function name exactly.
     * 
     */
    public String function() {
        return this.function;
    }
    /**
     * @return The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    public String glob() {
        return this.glob;
    }
    /**
     * @return The URL path to rewrite the request to.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    public String regex() {
        return this.regex;
    }
    /**
     * @return The request will be forwarded to Cloud Run.
     * 
     */
    public CloudRunRewriteResponse run() {
        return this.run;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RewriteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean dynamicLinks;
        private String function;
        private String glob;
        private String path;
        private String regex;
        private CloudRunRewriteResponse run;

        public Builder() {
    	      // Empty
        }

        public Builder(RewriteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicLinks = defaults.dynamicLinks;
    	      this.function = defaults.function;
    	      this.glob = defaults.glob;
    	      this.path = defaults.path;
    	      this.regex = defaults.regex;
    	      this.run = defaults.run;
        }

        public Builder dynamicLinks(Boolean dynamicLinks) {
            this.dynamicLinks = Objects.requireNonNull(dynamicLinks);
            return this;
        }
        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder glob(String glob) {
            this.glob = Objects.requireNonNull(glob);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder regex(String regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        public Builder run(CloudRunRewriteResponse run) {
            this.run = Objects.requireNonNull(run);
            return this;
        }        public RewriteResponse build() {
            return new RewriteResponse(dynamicLinks, function, glob, path, regex, run);
        }
    }
}
