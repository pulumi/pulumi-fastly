// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get the IDs of activations, certificates and subscriptions associated with a domain.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const domain = fastly.getTlsDomain({
 *     domain: "example.com",
 * });
 * ```
 */
export function getTlsDomain(args: GetTlsDomainArgs, opts?: pulumi.InvokeOptions): Promise<GetTlsDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fastly:index/getTlsDomain:getTlsDomain", {
        "domain": args.domain,
    }, opts);
}

/**
 * A collection of arguments for invoking getTlsDomain.
 */
export interface GetTlsDomainArgs {
    /**
     * Domain name to look up activations, certificates and subscriptions for.
     */
    domain: string;
}

/**
 * A collection of values returned by getTlsDomain.
 */
export interface GetTlsDomainResult {
    /**
     * Domain name to look up activations, certificates and subscriptions for.
     */
    readonly domain: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IDs of the activations associated with the domain.
     */
    readonly tlsActivationIds: string[];
    /**
     * IDs of the certificates associated with the domain.
     */
    readonly tlsCertificateIds: string[];
    /**
     * IDs of the subscriptions associated with the domain.
     */
    readonly tlsSubscriptionIds: string[];
}
/**
 * Use this data source to get the IDs of activations, certificates and subscriptions associated with a domain.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const domain = fastly.getTlsDomain({
 *     domain: "example.com",
 * });
 * ```
 */
export function getTlsDomainOutput(args: GetTlsDomainOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTlsDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fastly:index/getTlsDomain:getTlsDomain", {
        "domain": args.domain,
    }, opts);
}

/**
 * A collection of arguments for invoking getTlsDomain.
 */
export interface GetTlsDomainOutputArgs {
    /**
     * Domain name to look up activations, certificates and subscriptions for.
     */
    domain: pulumi.Input<string>;
}
