// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalogappregistry;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalogappregistry.inputs.GetApplicationArgs;
import com.pulumi.awsnative.servicecatalogappregistry.inputs.GetAttributeGroupArgs;
import com.pulumi.awsnative.servicecatalogappregistry.inputs.GetAttributeGroupAssociationArgs;
import com.pulumi.awsnative.servicecatalogappregistry.inputs.GetResourceAssociationArgs;
import com.pulumi.awsnative.servicecatalogappregistry.outputs.GetApplicationResult;
import com.pulumi.awsnative.servicecatalogappregistry.outputs.GetAttributeGroupAssociationResult;
import com.pulumi.awsnative.servicecatalogappregistry.outputs.GetAttributeGroupResult;
import com.pulumi.awsnative.servicecatalogappregistry.outputs.GetResourceAssociationResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicecatalogappregistryFunctions {
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::Application
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::Application
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroup.
     * 
     */
    public static CompletableFuture<GetAttributeGroupResult> getAttributeGroup(GetAttributeGroupArgs args) {
        return getAttributeGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroup.
     * 
     */
    public static CompletableFuture<GetAttributeGroupResult> getAttributeGroup(GetAttributeGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getAttributeGroup", TypeShape.of(GetAttributeGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroupAssociation.
     * 
     */
    public static CompletableFuture<GetAttributeGroupAssociationResult> getAttributeGroupAssociation(GetAttributeGroupAssociationArgs args) {
        return getAttributeGroupAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroupAssociation.
     * 
     */
    public static CompletableFuture<GetAttributeGroupAssociationResult> getAttributeGroupAssociation(GetAttributeGroupAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getAttributeGroupAssociation", TypeShape.of(GetAttributeGroupAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::ResourceAssociation
     * 
     */
    public static CompletableFuture<GetResourceAssociationResult> getResourceAssociation(GetResourceAssociationArgs args) {
        return getResourceAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalogAppRegistry::ResourceAssociation
     * 
     */
    public static CompletableFuture<GetResourceAssociationResult> getResourceAssociation(GetResourceAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getResourceAssociation", TypeShape.of(GetResourceAssociationResult.class), args, Utilities.withVersion(options));
    }
}
