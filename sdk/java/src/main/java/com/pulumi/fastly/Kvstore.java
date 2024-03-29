// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.fastly.KvstoreArgs;
import com.pulumi.fastly.Utilities;
import com.pulumi.fastly.inputs.KvstoreState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.fastly.Kvstore;
 * import com.pulumi.fastly.FastlyFunctions;
 * import com.pulumi.fastly.inputs.GetPackageHashArgs;
 * import com.pulumi.fastly.ServiceCompute;
 * import com.pulumi.fastly.ServiceComputeArgs;
 * import com.pulumi.fastly.inputs.ServiceComputeDomainArgs;
 * import com.pulumi.fastly.inputs.ServiceComputePackageArgs;
 * import com.pulumi.fastly.inputs.ServiceComputeResourceLinkArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleKvstore = new Kvstore(&#34;exampleKvstore&#34;);
 * 
 *         final var examplePackageHash = FastlyFunctions.getPackageHash(GetPackageHashArgs.builder()
 *             .filename(&#34;package.tar.gz&#34;)
 *             .build());
 * 
 *         var exampleServiceCompute = new ServiceCompute(&#34;exampleServiceCompute&#34;, ServiceComputeArgs.builder()        
 *             .domains(ServiceComputeDomainArgs.builder()
 *                 .name(&#34;demo.example.com&#34;)
 *                 .build())
 *             .package_(ServiceComputePackageArgs.builder()
 *                 .filename(&#34;package.tar.gz&#34;)
 *                 .sourceCodeHash(examplePackageHash.applyValue(getPackageHashResult -&gt; getPackageHashResult.hash()))
 *                 .build())
 *             .resourceLinks(ServiceComputeResourceLinkArgs.builder()
 *                 .name(&#34;my_resource_link&#34;)
 *                 .resourceId(exampleKvstore.id())
 *                 .build())
 *             .forceDestroy(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Fastly KV Stores can be imported using their Store ID, e.g.
 * 
 * ```sh
 * $ pulumi import fastly:index/kvstore:Kvstore example xxxxxxxxxxxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="fastly:index/kvstore:Kvstore")
public class Kvstore extends com.pulumi.resources.CustomResource {
    /**
     * Allow the KV Store to be deleted, even if it contains entries. Defaults to false.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Allow the KV Store to be deleted, even if it contains entries. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * A unique name to identify the KV Store. It is important to note that changing this attribute will delete and recreate the KV Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name to identify the KV Store. It is important to note that changing this attribute will delete and recreate the KV Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Kvstore(String name) {
        this(name, KvstoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Kvstore(String name, @Nullable KvstoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Kvstore(String name, @Nullable KvstoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/kvstore:Kvstore", name, args == null ? KvstoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Kvstore(String name, Output<String> id, @Nullable KvstoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("fastly:index/kvstore:Kvstore", name, state, makeResourceOptions(options, id));
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
    public static Kvstore get(String name, Output<String> id, @Nullable KvstoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Kvstore(name, id, state, options);
    }
}
