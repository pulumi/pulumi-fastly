// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Enables TLS on a domain using a specified custom TLS certificate.
 *
 * > **Note:** The Fastly service must be provisioned _prior_ to enabling TLS on it. This can be achieved in Pulumi using `dependsOn`.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const demo = new fastly.ServiceVcl("demo", {
 *     name: "my-service",
 *     domains: [{
 *         name: "example.com",
 *     }],
 *     backends: [{
 *         address: "127.0.0.1",
 *         name: "localhost",
 *     }],
 *     forceDestroy: true,
 * });
 * const demoTlsPrivateKey = new fastly.TlsPrivateKey("demo", {
 *     keyPem: "...",
 *     name: "demo-key",
 * });
 * const demoTlsCertificate = new fastly.TlsCertificate("demo", {
 *     certificateBody: "...",
 *     name: "demo-cert",
 * }, {
 *     dependsOn: [demoTlsPrivateKey],
 * });
 * const test = new fastly.TlsActivation("test", {
 *     certificateId: demoTlsCertificate.id,
 *     domain: "example.com",
 * }, {
 *     dependsOn: [demo],
 * });
 * ```
 *
 * > **Warning:** Updating the `fastly.TlsPrivateKey`/`fastly.TlsCertificate` resources should be done in multiple plan/apply steps to avoid potential downtime. The new certificate and associated private key must first be created so they exist alongside the currently active resources. Once the new resources have been created, then the `fastly.TlsActivation` can be updated to point to the new certificate. Finally, the original key/certificate resources can be deleted.
 *
 * ## Import
 *
 * A TLS activation can be imported using its ID, e.g.
 *
 * ```sh
 * $ pulumi import fastly:index/tlsActivation:TlsActivation demo xxxxxxxx
 * ```
 */
export class TlsActivation extends pulumi.CustomResource {
    /**
     * Get an existing TlsActivation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TlsActivationState, opts?: pulumi.CustomResourceOptions): TlsActivation {
        return new TlsActivation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fastly:index/tlsActivation:TlsActivation';

    /**
     * Returns true if the given object is an instance of TlsActivation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TlsActivation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TlsActivation.__pulumiType;
    }

    /**
     * ID of certificate to use. Must have the `domain` specified in the certificate's Subject Alternative Names.
     */
    public readonly certificateId!: pulumi.Output<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
     */
    public readonly configurationId!: pulumi.Output<string>;
    /**
     * Time-stamp (GMT) when TLS was enabled.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Domain to enable TLS on. Must be assigned to an existing Fastly Service.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * An alphanumeric string identifying a mutual authentication.
     */
    public readonly mutualAuthenticationId!: pulumi.Output<string>;

    /**
     * Create a TlsActivation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TlsActivationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TlsActivationArgs | TlsActivationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TlsActivationState | undefined;
            resourceInputs["certificateId"] = state ? state.certificateId : undefined;
            resourceInputs["configurationId"] = state ? state.configurationId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["mutualAuthenticationId"] = state ? state.mutualAuthenticationId : undefined;
        } else {
            const args = argsOrState as TlsActivationArgs | undefined;
            if ((!args || args.certificateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateId'");
            }
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            resourceInputs["certificateId"] = args ? args.certificateId : undefined;
            resourceInputs["configurationId"] = args ? args.configurationId : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["mutualAuthenticationId"] = args ? args.mutualAuthenticationId : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TlsActivation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TlsActivation resources.
 */
export interface TlsActivationState {
    /**
     * ID of certificate to use. Must have the `domain` specified in the certificate's Subject Alternative Names.
     */
    certificateId?: pulumi.Input<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
     */
    configurationId?: pulumi.Input<string>;
    /**
     * Time-stamp (GMT) when TLS was enabled.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Domain to enable TLS on. Must be assigned to an existing Fastly Service.
     */
    domain?: pulumi.Input<string>;
    /**
     * An alphanumeric string identifying a mutual authentication.
     */
    mutualAuthenticationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TlsActivation resource.
 */
export interface TlsActivationArgs {
    /**
     * ID of certificate to use. Must have the `domain` specified in the certificate's Subject Alternative Names.
     */
    certificateId: pulumi.Input<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic, or use the default one if missing.
     */
    configurationId?: pulumi.Input<string>;
    /**
     * Domain to enable TLS on. Must be assigned to an existing Fastly Service.
     */
    domain: pulumi.Input<string>;
    /**
     * An alphanumeric string identifying a mutual authentication.
     */
    mutualAuthenticationId?: pulumi.Input<string>;
}
