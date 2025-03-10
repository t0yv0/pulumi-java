// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetState extends com.pulumi.resources.ResourceArgs {

    public static final TargetState Empty = new TargetState();

    /**
     * The max capacity of the scalable target.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<Integer> maxCapacity;

    /**
     * @return The max capacity of the scalable target.
     * 
     */
    public Optional<Output<Integer>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * The min capacity of the scalable target.
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<Integer> minCapacity;

    /**
     * @return The min capacity of the scalable target.
     * 
     */
    public Optional<Output<Integer>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    /**
     * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="scalableDimension")
    private @Nullable Output<String> scalableDimension;

    /**
     * @return The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Optional<Output<String>> scalableDimension() {
        return Optional.ofNullable(this.scalableDimension);
    }

    /**
     * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="serviceNamespace")
    private @Nullable Output<String> serviceNamespace;

    /**
     * @return The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Optional<Output<String>> serviceNamespace() {
        return Optional.ofNullable(this.serviceNamespace);
    }

    private TargetState() {}

    private TargetState(TargetState $) {
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
        this.resourceId = $.resourceId;
        this.roleArn = $.roleArn;
        this.scalableDimension = $.scalableDimension;
        this.serviceNamespace = $.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetState $;

        public Builder() {
            $ = new TargetState();
        }

        public Builder(TargetState defaults) {
            $ = new TargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxCapacity The max capacity of the scalable target.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity The max capacity of the scalable target.
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(Integer maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity The min capacity of the scalable target.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(@Nullable Output<Integer> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity The min capacity of the scalable target.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Integer minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        /**
         * @param resourceId The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param roleArn The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param scalableDimension The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(@Nullable Output<String> scalableDimension) {
            $.scalableDimension = scalableDimension;
            return this;
        }

        /**
         * @param scalableDimension The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder scalableDimension(String scalableDimension) {
            return scalableDimension(Output.of(scalableDimension));
        }

        /**
         * @param serviceNamespace The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(@Nullable Output<String> serviceNamespace) {
            $.serviceNamespace = serviceNamespace;
            return this;
        }

        /**
         * @param serviceNamespace The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
         * 
         * @return builder
         * 
         */
        public Builder serviceNamespace(String serviceNamespace) {
            return serviceNamespace(Output.of(serviceNamespace));
        }

        public TargetState build() {
            return $;
        }
    }

}
