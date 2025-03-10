// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayState Empty = new CustomerGatewayState();

    /**
     * The ARN of the customer gateway.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the customer gateway.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @Import(name="bgpAsn")
    private @Nullable Output<String> bgpAsn;

    /**
     * @return The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    public Optional<Output<String>> bgpAsn() {
        return Optional.ofNullable(this.bgpAsn);
    }

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    /**
     * @return The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * A name for the customer gateway device.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return A name for the customer gateway device.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * The IP address of the gateway&#39;s Internet-routable external interface.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address of the gateway&#39;s Internet-routable external interface.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is &#34;ipsec.1&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of customer gateway. The only type AWS
     * supports at this time is &#34;ipsec.1&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CustomerGatewayState() {}

    private CustomerGatewayState(CustomerGatewayState $) {
        this.arn = $.arn;
        this.bgpAsn = $.bgpAsn;
        this.certificateArn = $.certificateArn;
        this.deviceName = $.deviceName;
        this.ipAddress = $.ipAddress;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerGatewayState $;

        public Builder() {
            $ = new CustomerGatewayState();
        }

        public Builder(CustomerGatewayState defaults) {
            $ = new CustomerGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param bgpAsn The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
         * 
         * @return builder
         * 
         */
        public Builder bgpAsn(@Nullable Output<String> bgpAsn) {
            $.bgpAsn = bgpAsn;
            return this;
        }

        /**
         * @param bgpAsn The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
         * 
         * @return builder
         * 
         */
        public Builder bgpAsn(String bgpAsn) {
            return bgpAsn(Output.of(bgpAsn));
        }

        /**
         * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        /**
         * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        /**
         * @param deviceName A name for the customer gateway device.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName A name for the customer gateway device.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param ipAddress The IP address of the gateway&#39;s Internet-routable external interface.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the gateway&#39;s Internet-routable external interface.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param tags Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param type The type of customer gateway. The only type AWS
         * supports at this time is &#34;ipsec.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of customer gateway. The only type AWS
         * supports at this time is &#34;ipsec.1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomerGatewayState build() {
            return $;
        }
    }

}
