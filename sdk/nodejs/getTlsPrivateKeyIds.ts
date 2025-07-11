// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get the list of TLS private key identifiers in Fastly.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const demo = fastly.getTlsPrivateKeyIds({});
 * const example = fastly.getTlsPrivateKey({
 *     id: demoFastlyTlsPrivateKeyIds.ids[0],
 * });
 * ```
 */
export function getTlsPrivateKeyIds(opts?: pulumi.InvokeOptions): Promise<GetTlsPrivateKeyIdsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fastly:index/getTlsPrivateKeyIds:getTlsPrivateKeyIds", {
    }, opts);
}

/**
 * A collection of values returned by getTlsPrivateKeyIds.
 */
export interface GetTlsPrivateKeyIdsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of IDs of the TLS private keys.
     */
    readonly ids: string[];
}
/**
 * Use this data source to get the list of TLS private key identifiers in Fastly.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 *
 * const demo = fastly.getTlsPrivateKeyIds({});
 * const example = fastly.getTlsPrivateKey({
 *     id: demoFastlyTlsPrivateKeyIds.ids[0],
 * });
 * ```
 */
export function getTlsPrivateKeyIdsOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTlsPrivateKeyIdsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("fastly:index/getTlsPrivateKeyIds:getTlsPrivateKeyIds", {
    }, opts);
}
