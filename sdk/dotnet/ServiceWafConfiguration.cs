// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly
{
    public partial class ServiceWafConfiguration : Pulumi.CustomResource
    {
        /// <summary>
        /// Allowed HTTP versions.
        /// </summary>
        [Output("allowedHttpVersions")]
        public Output<string> AllowedHttpVersions { get; private set; } = null!;

        /// <summary>
        /// A space-separated list of HTTP method names.
        /// </summary>
        [Output("allowedMethods")]
        public Output<string> AllowedMethods { get; private set; } = null!;

        /// <summary>
        /// Allowed request content types.
        /// </summary>
        [Output("allowedRequestContentType")]
        public Output<string> AllowedRequestContentType { get; private set; } = null!;

        /// <summary>
        /// Allowed request content type charset.
        /// </summary>
        [Output("allowedRequestContentTypeCharset")]
        public Output<string> AllowedRequestContentTypeCharset { get; private set; } = null!;

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Output("argLength")]
        public Output<int> ArgLength { get; private set; } = null!;

        /// <summary>
        /// The maximum allowed argument name length.
        /// </summary>
        [Output("argNameLength")]
        public Output<int> ArgNameLength { get; private set; } = null!;

        /// <summary>
        /// The maximum allowed size of all files.
        /// </summary>
        [Output("combinedFileSizes")]
        public Output<int> CombinedFileSizes { get; private set; } = null!;

        /// <summary>
        /// Score value to add for critical anomalies.
        /// </summary>
        [Output("criticalAnomalyScore")]
        public Output<int> CriticalAnomalyScore { get; private set; } = null!;

        /// <summary>
        /// CRS validate UTF8 encoding.
        /// </summary>
        [Output("crsValidateUtf8Encoding")]
        public Output<bool> CrsValidateUtf8Encoding { get; private set; } = null!;

        /// <summary>
        /// Score value to add for error anomalies.
        /// </summary>
        [Output("errorAnomalyScore")]
        public Output<int> ErrorAnomalyScore { get; private set; } = null!;

        /// <summary>
        /// A space-separated list of country codes in ISO 3166-1 (two-letter) format.
        /// </summary>
        [Output("highRiskCountryCodes")]
        public Output<string> HighRiskCountryCodes { get; private set; } = null!;

        /// <summary>
        /// HTTP violation threshold.
        /// </summary>
        [Output("httpViolationScoreThreshold")]
        public Output<int> HttpViolationScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// Inbound anomaly threshold.
        /// </summary>
        [Output("inboundAnomalyScoreThreshold")]
        public Output<int> InboundAnomalyScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// Local file inclusion attack threshold.
        /// </summary>
        [Output("lfiScoreThreshold")]
        public Output<int> LfiScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// The maximum allowed file size, in bytes.
        /// </summary>
        [Output("maxFileSize")]
        public Output<int> MaxFileSize { get; private set; } = null!;

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Output("maxNumArgs")]
        public Output<int> MaxNumArgs { get; private set; } = null!;

        /// <summary>
        /// Score value to add for notice anomalies.
        /// </summary>
        [Output("noticeAnomalyScore")]
        public Output<int> NoticeAnomalyScore { get; private set; } = null!;

        /// <summary>
        /// The configured paranoia level.
        /// </summary>
        [Output("paranoiaLevel")]
        public Output<int> ParanoiaLevel { get; private set; } = null!;

        /// <summary>
        /// PHP injection threshold.
        /// </summary>
        [Output("phpInjectionScoreThreshold")]
        public Output<int> PhpInjectionScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// Remote code execution threshold.
        /// </summary>
        [Output("rceScoreThreshold")]
        public Output<int> RceScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// A space-separated list of allowed file extensions.
        /// </summary>
        [Output("restrictedExtensions")]
        public Output<string> RestrictedExtensions { get; private set; } = null!;

        /// <summary>
        /// A space-separated list of allowed header names.
        /// </summary>
        [Output("restrictedHeaders")]
        public Output<string> RestrictedHeaders { get; private set; } = null!;

        /// <summary>
        /// Remote file inclusion attack threshold.
        /// </summary>
        [Output("rfiScoreThreshold")]
        public Output<int> RfiScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// The Web Application Firewall's active rules.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.ServiceWafConfigurationRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Session fixation attack threshold.
        /// </summary>
        [Output("sessionFixationScoreThreshold")]
        public Output<int> SessionFixationScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// SQL injection attack threshold.
        /// </summary>
        [Output("sqlInjectionScoreThreshold")]
        public Output<int> SqlInjectionScoreThreshold { get; private set; } = null!;

        /// <summary>
        /// The maximum size of argument names and values.
        /// </summary>
        [Output("totalArgLength")]
        public Output<int> TotalArgLength { get; private set; } = null!;

        /// <summary>
        /// The ID of the Web Application Firewall that the configuration belongs to.
        /// </summary>
        [Output("wafId")]
        public Output<string> WafId { get; private set; } = null!;

        /// <summary>
        /// Score value to add for warning anomalies.
        /// </summary>
        [Output("warningAnomalyScore")]
        public Output<int> WarningAnomalyScore { get; private set; } = null!;

        /// <summary>
        /// XSS attack threshold.
        /// </summary>
        [Output("xssScoreThreshold")]
        public Output<int> XssScoreThreshold { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceWafConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceWafConfiguration(string name, ServiceWafConfigurationArgs args, CustomResourceOptions? options = null)
            : base("fastly:index/serviceWafConfiguration:ServiceWafConfiguration", name, args ?? new ServiceWafConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceWafConfiguration(string name, Input<string> id, ServiceWafConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("fastly:index/serviceWafConfiguration:ServiceWafConfiguration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServiceWafConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceWafConfiguration Get(string name, Input<string> id, ServiceWafConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceWafConfiguration(name, id, state, options);
        }
    }

    public sealed class ServiceWafConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allowed HTTP versions.
        /// </summary>
        [Input("allowedHttpVersions")]
        public Input<string>? AllowedHttpVersions { get; set; }

        /// <summary>
        /// A space-separated list of HTTP method names.
        /// </summary>
        [Input("allowedMethods")]
        public Input<string>? AllowedMethods { get; set; }

        /// <summary>
        /// Allowed request content types.
        /// </summary>
        [Input("allowedRequestContentType")]
        public Input<string>? AllowedRequestContentType { get; set; }

        /// <summary>
        /// Allowed request content type charset.
        /// </summary>
        [Input("allowedRequestContentTypeCharset")]
        public Input<string>? AllowedRequestContentTypeCharset { get; set; }

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Input("argLength")]
        public Input<int>? ArgLength { get; set; }

        /// <summary>
        /// The maximum allowed argument name length.
        /// </summary>
        [Input("argNameLength")]
        public Input<int>? ArgNameLength { get; set; }

        /// <summary>
        /// The maximum allowed size of all files.
        /// </summary>
        [Input("combinedFileSizes")]
        public Input<int>? CombinedFileSizes { get; set; }

        /// <summary>
        /// Score value to add for critical anomalies.
        /// </summary>
        [Input("criticalAnomalyScore")]
        public Input<int>? CriticalAnomalyScore { get; set; }

        /// <summary>
        /// CRS validate UTF8 encoding.
        /// </summary>
        [Input("crsValidateUtf8Encoding")]
        public Input<bool>? CrsValidateUtf8Encoding { get; set; }

        /// <summary>
        /// Score value to add for error anomalies.
        /// </summary>
        [Input("errorAnomalyScore")]
        public Input<int>? ErrorAnomalyScore { get; set; }

        /// <summary>
        /// A space-separated list of country codes in ISO 3166-1 (two-letter) format.
        /// </summary>
        [Input("highRiskCountryCodes")]
        public Input<string>? HighRiskCountryCodes { get; set; }

        /// <summary>
        /// HTTP violation threshold.
        /// </summary>
        [Input("httpViolationScoreThreshold")]
        public Input<int>? HttpViolationScoreThreshold { get; set; }

        /// <summary>
        /// Inbound anomaly threshold.
        /// </summary>
        [Input("inboundAnomalyScoreThreshold")]
        public Input<int>? InboundAnomalyScoreThreshold { get; set; }

        /// <summary>
        /// Local file inclusion attack threshold.
        /// </summary>
        [Input("lfiScoreThreshold")]
        public Input<int>? LfiScoreThreshold { get; set; }

        /// <summary>
        /// The maximum allowed file size, in bytes.
        /// </summary>
        [Input("maxFileSize")]
        public Input<int>? MaxFileSize { get; set; }

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Input("maxNumArgs")]
        public Input<int>? MaxNumArgs { get; set; }

        /// <summary>
        /// Score value to add for notice anomalies.
        /// </summary>
        [Input("noticeAnomalyScore")]
        public Input<int>? NoticeAnomalyScore { get; set; }

        /// <summary>
        /// The configured paranoia level.
        /// </summary>
        [Input("paranoiaLevel")]
        public Input<int>? ParanoiaLevel { get; set; }

        /// <summary>
        /// PHP injection threshold.
        /// </summary>
        [Input("phpInjectionScoreThreshold")]
        public Input<int>? PhpInjectionScoreThreshold { get; set; }

        /// <summary>
        /// Remote code execution threshold.
        /// </summary>
        [Input("rceScoreThreshold")]
        public Input<int>? RceScoreThreshold { get; set; }

        /// <summary>
        /// A space-separated list of allowed file extensions.
        /// </summary>
        [Input("restrictedExtensions")]
        public Input<string>? RestrictedExtensions { get; set; }

        /// <summary>
        /// A space-separated list of allowed header names.
        /// </summary>
        [Input("restrictedHeaders")]
        public Input<string>? RestrictedHeaders { get; set; }

        /// <summary>
        /// Remote file inclusion attack threshold.
        /// </summary>
        [Input("rfiScoreThreshold")]
        public Input<int>? RfiScoreThreshold { get; set; }

        [Input("rules")]
        private InputList<Inputs.ServiceWafConfigurationRuleArgs>? _rules;

        /// <summary>
        /// The Web Application Firewall's active rules.
        /// </summary>
        public InputList<Inputs.ServiceWafConfigurationRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.ServiceWafConfigurationRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Session fixation attack threshold.
        /// </summary>
        [Input("sessionFixationScoreThreshold")]
        public Input<int>? SessionFixationScoreThreshold { get; set; }

        /// <summary>
        /// SQL injection attack threshold.
        /// </summary>
        [Input("sqlInjectionScoreThreshold")]
        public Input<int>? SqlInjectionScoreThreshold { get; set; }

        /// <summary>
        /// The maximum size of argument names and values.
        /// </summary>
        [Input("totalArgLength")]
        public Input<int>? TotalArgLength { get; set; }

        /// <summary>
        /// The ID of the Web Application Firewall that the configuration belongs to.
        /// </summary>
        [Input("wafId", required: true)]
        public Input<string> WafId { get; set; } = null!;

        /// <summary>
        /// Score value to add for warning anomalies.
        /// </summary>
        [Input("warningAnomalyScore")]
        public Input<int>? WarningAnomalyScore { get; set; }

        /// <summary>
        /// XSS attack threshold.
        /// </summary>
        [Input("xssScoreThreshold")]
        public Input<int>? XssScoreThreshold { get; set; }

        public ServiceWafConfigurationArgs()
        {
        }
    }

    public sealed class ServiceWafConfigurationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allowed HTTP versions.
        /// </summary>
        [Input("allowedHttpVersions")]
        public Input<string>? AllowedHttpVersions { get; set; }

        /// <summary>
        /// A space-separated list of HTTP method names.
        /// </summary>
        [Input("allowedMethods")]
        public Input<string>? AllowedMethods { get; set; }

        /// <summary>
        /// Allowed request content types.
        /// </summary>
        [Input("allowedRequestContentType")]
        public Input<string>? AllowedRequestContentType { get; set; }

        /// <summary>
        /// Allowed request content type charset.
        /// </summary>
        [Input("allowedRequestContentTypeCharset")]
        public Input<string>? AllowedRequestContentTypeCharset { get; set; }

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Input("argLength")]
        public Input<int>? ArgLength { get; set; }

        /// <summary>
        /// The maximum allowed argument name length.
        /// </summary>
        [Input("argNameLength")]
        public Input<int>? ArgNameLength { get; set; }

        /// <summary>
        /// The maximum allowed size of all files.
        /// </summary>
        [Input("combinedFileSizes")]
        public Input<int>? CombinedFileSizes { get; set; }

        /// <summary>
        /// Score value to add for critical anomalies.
        /// </summary>
        [Input("criticalAnomalyScore")]
        public Input<int>? CriticalAnomalyScore { get; set; }

        /// <summary>
        /// CRS validate UTF8 encoding.
        /// </summary>
        [Input("crsValidateUtf8Encoding")]
        public Input<bool>? CrsValidateUtf8Encoding { get; set; }

        /// <summary>
        /// Score value to add for error anomalies.
        /// </summary>
        [Input("errorAnomalyScore")]
        public Input<int>? ErrorAnomalyScore { get; set; }

        /// <summary>
        /// A space-separated list of country codes in ISO 3166-1 (two-letter) format.
        /// </summary>
        [Input("highRiskCountryCodes")]
        public Input<string>? HighRiskCountryCodes { get; set; }

        /// <summary>
        /// HTTP violation threshold.
        /// </summary>
        [Input("httpViolationScoreThreshold")]
        public Input<int>? HttpViolationScoreThreshold { get; set; }

        /// <summary>
        /// Inbound anomaly threshold.
        /// </summary>
        [Input("inboundAnomalyScoreThreshold")]
        public Input<int>? InboundAnomalyScoreThreshold { get; set; }

        /// <summary>
        /// Local file inclusion attack threshold.
        /// </summary>
        [Input("lfiScoreThreshold")]
        public Input<int>? LfiScoreThreshold { get; set; }

        /// <summary>
        /// The maximum allowed file size, in bytes.
        /// </summary>
        [Input("maxFileSize")]
        public Input<int>? MaxFileSize { get; set; }

        /// <summary>
        /// The maximum number of arguments allowed.
        /// </summary>
        [Input("maxNumArgs")]
        public Input<int>? MaxNumArgs { get; set; }

        /// <summary>
        /// Score value to add for notice anomalies.
        /// </summary>
        [Input("noticeAnomalyScore")]
        public Input<int>? NoticeAnomalyScore { get; set; }

        /// <summary>
        /// The configured paranoia level.
        /// </summary>
        [Input("paranoiaLevel")]
        public Input<int>? ParanoiaLevel { get; set; }

        /// <summary>
        /// PHP injection threshold.
        /// </summary>
        [Input("phpInjectionScoreThreshold")]
        public Input<int>? PhpInjectionScoreThreshold { get; set; }

        /// <summary>
        /// Remote code execution threshold.
        /// </summary>
        [Input("rceScoreThreshold")]
        public Input<int>? RceScoreThreshold { get; set; }

        /// <summary>
        /// A space-separated list of allowed file extensions.
        /// </summary>
        [Input("restrictedExtensions")]
        public Input<string>? RestrictedExtensions { get; set; }

        /// <summary>
        /// A space-separated list of allowed header names.
        /// </summary>
        [Input("restrictedHeaders")]
        public Input<string>? RestrictedHeaders { get; set; }

        /// <summary>
        /// Remote file inclusion attack threshold.
        /// </summary>
        [Input("rfiScoreThreshold")]
        public Input<int>? RfiScoreThreshold { get; set; }

        [Input("rules")]
        private InputList<Inputs.ServiceWafConfigurationRuleGetArgs>? _rules;

        /// <summary>
        /// The Web Application Firewall's active rules.
        /// </summary>
        public InputList<Inputs.ServiceWafConfigurationRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.ServiceWafConfigurationRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Session fixation attack threshold.
        /// </summary>
        [Input("sessionFixationScoreThreshold")]
        public Input<int>? SessionFixationScoreThreshold { get; set; }

        /// <summary>
        /// SQL injection attack threshold.
        /// </summary>
        [Input("sqlInjectionScoreThreshold")]
        public Input<int>? SqlInjectionScoreThreshold { get; set; }

        /// <summary>
        /// The maximum size of argument names and values.
        /// </summary>
        [Input("totalArgLength")]
        public Input<int>? TotalArgLength { get; set; }

        /// <summary>
        /// The ID of the Web Application Firewall that the configuration belongs to.
        /// </summary>
        [Input("wafId")]
        public Input<string>? WafId { get; set; }

        /// <summary>
        /// Score value to add for warning anomalies.
        /// </summary>
        [Input("warningAnomalyScore")]
        public Input<int>? WarningAnomalyScore { get; set; }

        /// <summary>
        /// XSS attack threshold.
        /// </summary>
        [Input("xssScoreThreshold")]
        public Input<int>? XssScoreThreshold { get; set; }

        public ServiceWafConfigurationState()
        {
        }
    }
}