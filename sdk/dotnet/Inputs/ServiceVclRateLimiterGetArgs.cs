// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class ServiceVclRateLimiterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take when a rate limiter violation is detected (one of: log_only, response, response_object)
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Comma-separated list of VCL variables used to generate a counter key to identify a client
        /// </summary>
        [Input("clientKey", required: true)]
        public Input<string> ClientKey { get; set; } = null!;

        /// <summary>
        /// Revision number of the rate limiting feature implementation
        /// </summary>
        [Input("featureRevision")]
        public Input<int>? FeatureRevision { get; set; }

        /// <summary>
        /// Comma-separated list of HTTP methods to apply rate limiting to
        /// </summary>
        [Input("httpMethods", required: true)]
        public Input<string> HttpMethods { get; set; } = null!;

        /// <summary>
        /// Name of the type of logging endpoint to be used when action is log_only (one of: azureblob, bigquery, cloudfiles, datadog, digitalocean, elasticsearch, ftp, gcs, googleanalytics, heroku, honeycomb, http, https, kafka, kinesis, logentries, loggly, logshuttle, newrelic, openstack, papertrail, pubsub, s3, scalyr, sftp, splunk, stackdriver, sumologic, syslog)
        /// </summary>
        [Input("loggerType")]
        public Input<string>? LoggerType { get; set; }

        /// <summary>
        /// A unique human readable name for the rate limiting rule
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Length of time in minutes that the rate limiter is in effect after the initial violation is detected
        /// </summary>
        [Input("penaltyBoxDuration", required: true)]
        public Input<int> PenaltyBoxDuration { get; set; } = null!;

        /// <summary>
        /// Alphanumeric string identifying the rate limiter
        /// </summary>
        [Input("ratelimiterId")]
        public Input<string>? RatelimiterId { get; set; }

        /// <summary>
        /// Custom response to be sent when the rate limit is exceeded. Required if action is response
        /// </summary>
        [Input("response")]
        public Input<Inputs.ServiceVclRateLimiterResponseGetArgs>? Response { get; set; }

        /// <summary>
        /// Name of existing response object. Required if action is response_object
        /// </summary>
        [Input("responseObjectName")]
        public Input<string>? ResponseObjectName { get; set; }

        /// <summary>
        /// Upper limit of requests per second allowed by the rate limiter
        /// </summary>
        [Input("rpsLimit", required: true)]
        public Input<int> RpsLimit { get; set; } = null!;

        /// <summary>
        /// The name of an Edge Dictionary containing URIs as keys. If not defined or null, all origin URIs will be rate limited
        /// </summary>
        [Input("uriDictionaryName")]
        public Input<string>? UriDictionaryName { get; set; }

        /// <summary>
        /// Number of seconds during which the RPS limit must be exceeded in order to trigger a violation (one of: 1, 10, 60)
        /// </summary>
        [Input("windowSize", required: true)]
        public Input<int> WindowSize { get; set; } = null!;

        public ServiceVclRateLimiterGetArgs()
        {
        }
        public static new ServiceVclRateLimiterGetArgs Empty => new ServiceVclRateLimiterGetArgs();
    }
}
