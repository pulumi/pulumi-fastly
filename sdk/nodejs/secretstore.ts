// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * // IMPORTANT: Deleting a Secret Store requires first deleting its resource_link.
 * // This requires a two-step `pulumi up` as we can't guarantee deletion order.
 * // e.g. resource_link deletion within fastly_service_compute might not finish first.
 * const exampleSecretstore = new fastly.Secretstore("example", {name: "my_secret_store"});
 * const example = fastly.getPackageHash({
 *     filename: "package.tar.gz",
 * });
 * const exampleServiceCompute = new fastly.ServiceCompute("example", {
 *     name: "my_compute_service",
 *     domains: [{
 *         name: "demo.example.com",
 *     }],
 *     "package": {
 *         filename: "package.tar.gz",
 *         sourceCodeHash: example.then(example => example.hash),
 *     },
 *     resourceLinks: [{
 *         name: "my_resource_link",
 *         resourceId: exampleSecretstore.id,
 *     }],
 *     forceDestroy: true,
 * });
 * ```
 *
 * ## Import
 *
 * Fastly Secret Stores can be imported using their Store ID, e.g.
 *
 * ```sh
 * $ pulumi import fastly:index/secretstore:Secretstore example xxxxxxxxxxxxxxxxxxxx
 * ```
 */
export class Secretstore extends pulumi.CustomResource {
    /**
     * Get an existing Secretstore resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretstoreState, opts?: pulumi.CustomResourceOptions): Secretstore {
        return new Secretstore(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fastly:index/secretstore:Secretstore';

    /**
     * Returns true if the given object is an instance of Secretstore.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Secretstore {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Secretstore.__pulumiType;
    }

    /**
     * A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Secretstore resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecretstoreArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretstoreArgs | SecretstoreState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretstoreState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as SecretstoreArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Secretstore.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Secretstore resources.
 */
export interface SecretstoreState {
    /**
     * A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Secretstore resource.
 */
export interface SecretstoreArgs {
    /**
     * A human-readable name for the Secret Store. The value must contain only letters, numbers, dashes (-), underscores (*), or periods (.). It is important to note that changing this attribute will delete and recreate the Secret Store, and discard the current entries. You MUST first delete the associated resource*link block from your service before modifying this field.
     */
    name?: pulumi.Input<string>;
}
