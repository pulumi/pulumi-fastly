// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.fastly.ServiceDynamicSnippetContentArgs;
import com.pulumi.fastly.Utilities;
import com.pulumi.fastly.inputs.ServiceDynamicSnippetContentState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * This is an example of the import command being applied to the resource named `fastly_service_dynamic_snippet_content.content`
 * 
 * The resource ID is a combined value of the `service_id` and `snippet_id` separated by a forward slash.
 * 
 * ```sh
 * $ pulumi import fastly:index/serviceDynamicSnippetContent:ServiceDynamicSnippetContent content xxxxxxxxxxxxxxxxxxxx/xxxxxxxxxxxxxxxxxxxx
 * ```
 * 
 * If Terraform is already managing remote content against a resource being imported then the user will be asked to remove it from the existing Terraform state.
 * 
 * The following is an example of the Terraform state command to remove the resource named `fastly_service_dynamic_snippet_content.content` from the Terraform state file.
 * 
 * $ terraform state rm fastly_service_dynamic_snippet_content.content
 * 
 */
@ResourceType(type="fastly:index/serviceDynamicSnippetContent:ServiceDynamicSnippetContent")
public class ServiceDynamicSnippetContent extends com.pulumi.resources.CustomResource {
    /**
     * The VCL code that specifies exactly what the snippet does
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The VCL code that specifies exactly what the snippet does
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * Whether to reapply changes if the state of the snippets drifts, i.e. if snippets are managed externally
     * 
     */
    @Export(name="manageSnippets", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> manageSnippets;

    /**
     * @return Whether to reapply changes if the state of the snippets drifts, i.e. if snippets are managed externally
     * 
     */
    public Output<Optional<Boolean>> manageSnippets() {
        return Codegen.optional(this.manageSnippets);
    }
    /**
     * The ID of the service that the dynamic snippet belongs to
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The ID of the service that the dynamic snippet belongs to
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The ID of the dynamic snippet that the content belong to
     * 
     */
    @Export(name="snippetId", refs={String.class}, tree="[0]")
    private Output<String> snippetId;

    /**
     * @return The ID of the dynamic snippet that the content belong to
     * 
     */
    public Output<String> snippetId() {
        return this.snippetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceDynamicSnippetContent(String name) {
        this(name, ServiceDynamicSnippetContentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceDynamicSnippetContent(String name, ServiceDynamicSnippetContentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceDynamicSnippetContent(String name, ServiceDynamicSnippetContentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/serviceDynamicSnippetContent:ServiceDynamicSnippetContent", name, args == null ? ServiceDynamicSnippetContentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceDynamicSnippetContent(String name, Output<String> id, @Nullable ServiceDynamicSnippetContentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/serviceDynamicSnippetContent:ServiceDynamicSnippetContent", name, state, makeResourceOptions(options, id));
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
    public static ServiceDynamicSnippetContent get(String name, Output<String> id, @Nullable ServiceDynamicSnippetContentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceDynamicSnippetContent(name, id, state, options);
    }
}
