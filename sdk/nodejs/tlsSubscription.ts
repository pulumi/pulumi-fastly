// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Enables TLS on a domain using a certificate managed by Fastly.
 *
 * DNS records need to be modified on the domain being secured, in order to respond to the ACME domain ownership challenge.
 *
 * There are two options for doing this: the `managedDnsChallenge`, which is the default method; and the `managedHttpChallenges`, which points production traffic to Fastly.
 *
 * > See the [Fastly documentation](https://docs.fastly.com/en/guides/serving-https-traffic-using-fastly-managed-certificates#verifying-domain-ownership) for more information on verifying domain ownership.
 *
 * The example below demonstrates usage with AWS Route53 to configure DNS, and the `fastly.TlsSubscriptionValidation` resource to wait for validation to complete.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const exampleServicev1 = new fastly.Servicev1("exampleServicev1", {
 *     domains: [{
 *         name: "example.com",
 *     }],
 *     backends: [{
 *         address: "127.0.0.1",
 *         name: "localhost",
 *     }],
 *     forceDestroy: true,
 * });
 * const exampleTlsSubscription = new fastly.TlsSubscription("exampleTlsSubscription", {
 *     domains: exampleServicev1.domains.apply(domains => domains.map(domain => domain.name)),
 *     certificateAuthority: "lets-encrypt",
 * });
 * ```
 *
 * Usage with AWS Route 53:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as fastly from "@pulumi/fastly";
 *
 * const domainName = "example.com";
 * const exampleServicev1 = new fastly.Servicev1("exampleServicev1", {
 *     domains: [{
 *         name: domainName,
 *     }],
 *     backends: [{
 *         address: "127.0.0.1",
 *         name: "localhost",
 *     }],
 *     forceDestroy: true,
 * });
 * const exampleTlsSubscription = new fastly.TlsSubscription("exampleTlsSubscription", {
 *     domains: exampleServicev1.domains.apply(domains => domains.map(domain => domain.name)),
 *     certificateAuthority: "lets-encrypt",
 * });
 * const demo = aws.route53.getZone({
 *     name: domainName,
 *     privateZone: false,
 * });
 * // Set up DNS record for managed DNS domain validation method
 * const domainValidation = new aws.route53.Record("domainValidation", {
 *     name: exampleTlsSubscription.managedDnsChallenge.recordName,
 *     type: exampleTlsSubscription.managedDnsChallenge.recordType,
 *     zoneId: demo.then(demo => demo.id),
 *     allowOverwrite: true,
 *     records: [exampleTlsSubscription.managedDnsChallenge.recordValue],
 *     ttl: 60,
 * });
 * // Resource that other resources can depend on if they require the certificate to be issued
 * const exampleTlsSubscriptionValidation = new fastly.TlsSubscriptionValidation("exampleTlsSubscriptionValidation", {subscriptionId: exampleTlsSubscription.id}, {
 *     dependsOn: [domainValidation],
 * });
 * ```
 *
 * ## Import
 *
 * A subscription can be imported using its Fastly subscription ID, e.g.
 *
 * ```sh
 *  $ pulumi import fastly:index/tlsSubscription:TlsSubscription demo xxxxxxxxxxx
 * ```
 */
export class TlsSubscription extends pulumi.CustomResource {
    /**
     * Get an existing TlsSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TlsSubscriptionState, opts?: pulumi.CustomResourceOptions): TlsSubscription {
        return new TlsSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fastly:index/tlsSubscription:TlsSubscription';

    /**
     * Returns true if the given object is an instance of TlsSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TlsSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TlsSubscription.__pulumiType;
    }

    /**
     * The entity that issues and certifies the TLS certificates for your subscription. Valid values are `lets-encrypt` or `globalsign`.
     */
    public readonly certificateAuthority!: pulumi.Output<string>;
    /**
     * The common name associated with the subscription generated by Fastly TLS. If you do not pass a common name on create, we will default to the first TLS domain included. If provided, the domain chosen as the common name must be included in TLS domains.
     */
    public readonly commonName!: pulumi.Output<string>;
    /**
     * The ID of the set of TLS configuration options that apply to the enabled domains on this subscription.
     */
    public readonly configurationId!: pulumi.Output<string>;
    /**
     * Timestamp (GMT) when the subscription was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * List of domains on which to enable TLS.
     */
    public readonly domains!: pulumi.Output<string[]>;
    /**
     * Always delete subscription, even when active domains are present. Defaults to false.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Always update subscription, even when active domains are present. Defaults to false.
     */
    public readonly forceUpdate!: pulumi.Output<boolean | undefined>;
    /**
     * The details required to configure DNS to respond to ACME DNS challenge in order to verify domain ownership.
     */
    public /*out*/ readonly managedDnsChallenge!: pulumi.Output<{[key: string]: string}>;
    /**
     * A list of options for configuring DNS to respond to ACME HTTP challenge in order to verify domain ownership. Best accessed through a `for` expression to filter the relevant record.
     */
    public /*out*/ readonly managedHttpChallenges!: pulumi.Output<outputs.TlsSubscriptionManagedHttpChallenge[]>;
    /**
     * The current state of the subscription. The list of possible states are: `pending`, `processing`, `issued`, and `renewing`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Timestamp (GMT) when the subscription was updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a TlsSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TlsSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TlsSubscriptionArgs | TlsSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TlsSubscriptionState | undefined;
            inputs["certificateAuthority"] = state ? state.certificateAuthority : undefined;
            inputs["commonName"] = state ? state.commonName : undefined;
            inputs["configurationId"] = state ? state.configurationId : undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["domains"] = state ? state.domains : undefined;
            inputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            inputs["forceUpdate"] = state ? state.forceUpdate : undefined;
            inputs["managedDnsChallenge"] = state ? state.managedDnsChallenge : undefined;
            inputs["managedHttpChallenges"] = state ? state.managedHttpChallenges : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as TlsSubscriptionArgs | undefined;
            if ((!args || args.certificateAuthority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateAuthority'");
            }
            if ((!args || args.domains === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domains'");
            }
            inputs["certificateAuthority"] = args ? args.certificateAuthority : undefined;
            inputs["commonName"] = args ? args.commonName : undefined;
            inputs["configurationId"] = args ? args.configurationId : undefined;
            inputs["domains"] = args ? args.domains : undefined;
            inputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            inputs["forceUpdate"] = args ? args.forceUpdate : undefined;
            inputs["createdAt"] = undefined /*out*/;
            inputs["managedDnsChallenge"] = undefined /*out*/;
            inputs["managedHttpChallenges"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
            inputs["updatedAt"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(TlsSubscription.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TlsSubscription resources.
 */
export interface TlsSubscriptionState {
    /**
     * The entity that issues and certifies the TLS certificates for your subscription. Valid values are `lets-encrypt` or `globalsign`.
     */
    readonly certificateAuthority?: pulumi.Input<string>;
    /**
     * The common name associated with the subscription generated by Fastly TLS. If you do not pass a common name on create, we will default to the first TLS domain included. If provided, the domain chosen as the common name must be included in TLS domains.
     */
    readonly commonName?: pulumi.Input<string>;
    /**
     * The ID of the set of TLS configuration options that apply to the enabled domains on this subscription.
     */
    readonly configurationId?: pulumi.Input<string>;
    /**
     * Timestamp (GMT) when the subscription was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * List of domains on which to enable TLS.
     */
    readonly domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Always delete subscription, even when active domains are present. Defaults to false.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * Always update subscription, even when active domains are present. Defaults to false.
     */
    readonly forceUpdate?: pulumi.Input<boolean>;
    /**
     * The details required to configure DNS to respond to ACME DNS challenge in order to verify domain ownership.
     */
    readonly managedDnsChallenge?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A list of options for configuring DNS to respond to ACME HTTP challenge in order to verify domain ownership. Best accessed through a `for` expression to filter the relevant record.
     */
    readonly managedHttpChallenges?: pulumi.Input<pulumi.Input<inputs.TlsSubscriptionManagedHttpChallenge>[]>;
    /**
     * The current state of the subscription. The list of possible states are: `pending`, `processing`, `issued`, and `renewing`.
     */
    readonly state?: pulumi.Input<string>;
    /**
     * Timestamp (GMT) when the subscription was updated.
     */
    readonly updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TlsSubscription resource.
 */
export interface TlsSubscriptionArgs {
    /**
     * The entity that issues and certifies the TLS certificates for your subscription. Valid values are `lets-encrypt` or `globalsign`.
     */
    readonly certificateAuthority: pulumi.Input<string>;
    /**
     * The common name associated with the subscription generated by Fastly TLS. If you do not pass a common name on create, we will default to the first TLS domain included. If provided, the domain chosen as the common name must be included in TLS domains.
     */
    readonly commonName?: pulumi.Input<string>;
    /**
     * The ID of the set of TLS configuration options that apply to the enabled domains on this subscription.
     */
    readonly configurationId?: pulumi.Input<string>;
    /**
     * List of domains on which to enable TLS.
     */
    readonly domains: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Always delete subscription, even when active domains are present. Defaults to false.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * Always update subscription, even when active domains are present. Defaults to false.
     */
    readonly forceUpdate?: pulumi.Input<boolean>;
}