// Copyright 2022, Pulumi Corporation.  All rights reserved.

package java

import (
	"fmt"

	"github.com/pulumi/pulumi/pkg/v3/codegen"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"

	"github.com/pulumi/pulumi-java/pkg/codegen/java/names"
)

// DocLanguageHelper is the Java-specific implementation of the
// similarly named codegen interface.
type DocLanguageHelper struct{}

var _ codegen.DocLanguageHelper = DocLanguageHelper{}

func (d DocLanguageHelper) GetLanguageTypeString(
	pkg *schema.Package, moduleName string, t schema.Type, input bool) string {

	modCtx := &modContext{pkg: pkg, mod: moduleName}
	ctx := newPseudoClassFileContext()

	typeShape := modCtx.typeString(
		ctx,
		t,
		noQualifier,
		input,
		false, // requireInitializers
		false, // outerOptional
		false, // inputlessOverload bool
	)

	code := typeShape.ToCodeWithOptions(ctx.imports, TypeShapeStringOptions{
		// Make sure @Nullable is not printed out.
		SkipAnnotations: true,
	})

	return code
}

func (d DocLanguageHelper) GetPropertyName(p *schema.Property) (string, error) {
	return names.Ident(p.Name).AsProperty().Getter(), nil
}

func (d DocLanguageHelper) GetFunctionName(modName string, f *schema.Function) string {
	return tokenToFunctionName(f.Token)
}

func (d DocLanguageHelper) GetResourceFunctionResultName(modName string, f *schema.Function) string {
	return tokenToFunctionResultClassName(f.Token).String()
}

func (d DocLanguageHelper) GetMethodName(m *schema.Method) string {
	// TODO revise when method support is built, revise when output-versioned functions are built
	return tokenToFunctionName(m.Function.Token)
}

func (d DocLanguageHelper) GetMethodResultName(
	pkg *schema.Package, modName string, r *schema.Resource, m *schema.Method) string {
	// TODO revise when method support is built, revise when output-versioned functions are built
	return tokenToFunctionResultClassName(m.Function.Token).String()
}

func (d DocLanguageHelper) GetEnumName(e *schema.Enum, typeName string) (string, error) {
	name := e.Name
	if name == "" {
		name = fmt.Sprintf("%v", e.Value)
	}
	return names.MakeSafeEnumName(name, typeName)
}

// TODO revisit once javadocs are published.
//
// Not every language currently supports this. For Python docsgen the
// implementation returns "" also.
//
// For an example of a language that supports this, check out Go.
//
// When visiting https://www.pulumi.com/registry/packages/aws/api-docs/s3/bucket/ see:
//
//     func NewBucket(ctx *Context, name string, args *BucketArgs, opts ...ResourceOption)
//
// Context, BucketARgs and ResourceOption get linked to Go API docs.
//
// For Java we could link to JavaDoc when appropriate.
func (d DocLanguageHelper) GetDocLinkForPulumiType(pkg *schema.Package, typeName string) string {
	return ""
}

func (d DocLanguageHelper) GetDocLinkForResourceType(pkg *schema.Package, modName, typeName string) string {
	panic("Not implemented")
}

func (d DocLanguageHelper) GetDocLinkForResourceInputOrOutputType(
	pkg *schema.Package, modName, typeName string, input bool) string {
	panic("Not implemented")
}

func (d DocLanguageHelper) GetDocLinkForFunctionInputOrOutputType(
	pkg *schema.Package, modName, typeName string, input bool) string {

	panic("Not implemented")
}

func (d DocLanguageHelper) GetModuleDocLink(pkg *schema.Package, modName string) (string, string) {
	panic("Not implemented")
}
