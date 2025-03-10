// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Test targets for a shard.
 * 
 */
public final class TestTargetsForShardArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestTargetsForShardArgs Empty = new TestTargetsForShardArgs();

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, &#34;package com.my.packages&#34; &#34;class com.my.package.MyClass&#34;. The number of test_targets must be greater than 0.
     * 
     */
    @Import(name="testTargets")
    private @Nullable Output<List<String>> testTargets;

    /**
     * @return Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, &#34;package com.my.packages&#34; &#34;class com.my.package.MyClass&#34;. The number of test_targets must be greater than 0.
     * 
     */
    public Optional<Output<List<String>>> testTargets() {
        return Optional.ofNullable(this.testTargets);
    }

    private TestTargetsForShardArgs() {}

    private TestTargetsForShardArgs(TestTargetsForShardArgs $) {
        this.testTargets = $.testTargets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestTargetsForShardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestTargetsForShardArgs $;

        public Builder() {
            $ = new TestTargetsForShardArgs();
        }

        public Builder(TestTargetsForShardArgs defaults) {
            $ = new TestTargetsForShardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param testTargets Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, &#34;package com.my.packages&#34; &#34;class com.my.package.MyClass&#34;. The number of test_targets must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder testTargets(@Nullable Output<List<String>> testTargets) {
            $.testTargets = testTargets;
            return this;
        }

        /**
         * @param testTargets Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, &#34;package com.my.packages&#34; &#34;class com.my.package.MyClass&#34;. The number of test_targets must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder testTargets(List<String> testTargets) {
            return testTargets(Output.of(testTargets));
        }

        /**
         * @param testTargets Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, &#34;package com.my.packages&#34; &#34;class com.my.package.MyClass&#34;. The number of test_targets must be greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder testTargets(String... testTargets) {
            return testTargets(List.of(testTargets));
        }

        public TestTargetsForShardArgs build() {
            return $;
        }
    }

}
