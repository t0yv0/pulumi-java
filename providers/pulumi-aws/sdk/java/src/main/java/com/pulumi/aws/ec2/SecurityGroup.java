// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SecurityGroupArgs;
import com.pulumi.aws.ec2.inputs.SecurityGroupState;
import com.pulumi.aws.ec2.outputs.SecurityGroupEgress;
import com.pulumi.aws.ec2.outputs.SecurityGroupIngress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a security group resource.
 * 
 * &gt; **NOTE on Security Groups and Security Group Rules:** This provider currently
 * provides both a standalone Security Group Rule resource (a single `ingress` or
 * `egress` rule), and a Security Group resource with `ingress` and `egress` rules
 * defined in-line. At this time you cannot use a Security Group with in-line rules
 * in conjunction with any Security Group Rule resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
 * 
 * &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), security groups associated with Lambda Functions can take up to 45 minutes to successfully delete.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var allowTls = new SecurityGroup(&#34;allowTls&#34;, SecurityGroupArgs.builder()        
 *             .description(&#34;Allow TLS inbound traffic&#34;)
 *             .vpcId(aws_vpc.getMain().getId())
 *             .ingress(SecurityGroupIngress.builder()
 *                 .description(&#34;TLS from VPC&#34;)
 *                 .fromPort(443)
 *                 .toPort(443)
 *                 .protocol(&#34;tcp&#34;)
 *                 .cidrBlocks(aws_vpc.getMain().getCidr_block())
 *                 .ipv6CidrBlocks(aws_vpc.getMain().getIpv6_cidr_block())
 *                 .build())
 *             .egress(SecurityGroupEgress.builder()
 *                 .fromPort(0)
 *                 .toPort(0)
 *                 .protocol(&#34;-1&#34;)
 *                 .cidrBlocks(&#34;0.0.0.0/0&#34;)
 *                 .ipv6CidrBlocks(&#34;::/0&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;allow_tls&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * &gt; **NOTE on Egress rules:** By default, AWS creates an `ALLOW ALL` egress rule when creating a new Security Group inside of a VPC. When creating a new Security Group inside a VPC, **this provider will remove this default rule**, and require you specifically re-create it if you desire that rule. We feel this leads to fewer surprises in terms of controlling your egress rules. If you desire this rule to be in place, you can use this `egress` block:
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SecurityGroup(&#34;example&#34;, SecurityGroupArgs.builder()        
 *             .egress(SecurityGroupEgress.builder()
 *                 .cidrBlocks(&#34;0.0.0.0/0&#34;)
 *                 .fromPort(0)
 *                 .ipv6CidrBlocks(&#34;::/0&#34;)
 *                 .protocol(&#34;-1&#34;)
 *                 .toPort(0)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Usage With Prefix List IDs
 * 
 * Prefix Lists are either managed by AWS internally, or created by the customer using a
 * Prefix List resource. Prefix Lists provided by
 * AWS are associated with a prefix list name, or service name, that is linked to a specific region.
 * Prefix list IDs are exported on VPC Endpoints, so you can use this format:
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myEndpoint = new VpcEndpoint(&#34;myEndpoint&#34;);
 * 
 *         var example = new SecurityGroup(&#34;example&#34;, SecurityGroupArgs.builder()        
 *             .egress(SecurityGroupEgress.builder()
 *                 .fromPort(0)
 *                 .toPort(0)
 *                 .protocol(&#34;-1&#34;)
 *                 .prefixListIds(myEndpoint.getPrefixListId())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * You can also find a specific Prefix List using the `aws.ec2.getPrefixList` data source.
 * 
 * ## Import
 * 
 * Security Groups can be imported using the `security group id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/securityGroup:SecurityGroup elb_sg sg-903004f8
 * ```
 * 
 */
@ResourceType(type="aws:ec2/securityGroup:SecurityGroup")
public class SecurityGroup extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the security group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the security group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of this egress rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of this egress rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    @Export(name="egress", type=List.class, parameters={SecurityGroupEgress.class})
    private Output<List<SecurityGroupEgress>> egress;

    /**
     * @return Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    public Output<List<SecurityGroupEgress>> egress() {
        return this.egress;
    }
    /**
     * Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    @Export(name="ingress", type=List.class, parameters={SecurityGroupIngress.class})
    private Output<List<SecurityGroupIngress>> ingress;

    /**
     * @return Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    public Output<List<SecurityGroupIngress>> ingress() {
        return this.ingress;
    }
    /**
     * Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Owner ID.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Owner ID.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    @Export(name="revokeRulesOnDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> revokeRulesOnDelete;

    /**
     * @return Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    public Output<Optional<Boolean>> revokeRulesOnDelete() {
        return Codegen.optional(this.revokeRulesOnDelete);
    }
    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * VPC ID.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroup(String name) {
        this(name, SecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroup(String name, @Nullable SecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroup(String name, @Nullable SecurityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroup:SecurityGroup", name, args == null ? SecurityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityGroup(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroup:SecurityGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecurityGroup get(String name, Output<String> id, @Nullable SecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroup(name, id, state, options);
    }
}
