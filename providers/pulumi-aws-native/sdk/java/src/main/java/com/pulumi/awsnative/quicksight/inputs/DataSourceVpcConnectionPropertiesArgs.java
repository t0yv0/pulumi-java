// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;VPC connection properties.&lt;/p&gt;
 * 
 */
public final class DataSourceVpcConnectionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceVpcConnectionPropertiesArgs Empty = new DataSourceVpcConnectionPropertiesArgs();

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
     * 
     */
    @Import(name="vpcConnectionArn", required=true)
    private Output<String> vpcConnectionArn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
     * 
     */
    public Output<String> vpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    private DataSourceVpcConnectionPropertiesArgs() {}

    private DataSourceVpcConnectionPropertiesArgs(DataSourceVpcConnectionPropertiesArgs $) {
        this.vpcConnectionArn = $.vpcConnectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceVpcConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceVpcConnectionPropertiesArgs $;

        public Builder() {
            $ = new DataSourceVpcConnectionPropertiesArgs();
        }

        public Builder(DataSourceVpcConnectionPropertiesArgs defaults) {
            $ = new DataSourceVpcConnectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpcConnectionArn &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectionArn(Output<String> vpcConnectionArn) {
            $.vpcConnectionArn = vpcConnectionArn;
            return this;
        }

        /**
         * @param vpcConnectionArn &lt;p&gt;The Amazon Resource Name (ARN) for the VPC connection.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectionArn(String vpcConnectionArn) {
            return vpcConnectionArn(Output.of(vpcConnectionArn));
        }

        public DataSourceVpcConnectionPropertiesArgs build() {
            $.vpcConnectionArn = Objects.requireNonNull($.vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
            return $;
        }
    }

}
