// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Outputs
{

    [OutputType]
    public sealed class ServiceComputeImageOptimizerDefaultSettings
    {
        /// <summary>
        /// Enables GIF to MP4 transformations on this service.
        /// </summary>
        public readonly bool? AllowVideo;
        /// <summary>
        /// The default quality to use with JPEG output. This can be overridden with the "quality" parameter on specific image optimizer requests.
        /// </summary>
        public readonly int? JpegQuality;
        /// <summary>
        /// The default type of JPEG output to use. This can be overridden with "format=bjpeg" and "format=pjpeg" on specific image optimizer requests. Valid values are `auto`, `baseline` and `progressive`.
        /// 	- auto: Match the input JPEG type, or baseline if transforming from a non-JPEG input.
        /// 	- baseline: Output baseline JPEG images
        /// 	- progressive: Output progressive JPEG images
        /// </summary>
        public readonly string? JpegType;
        /// <summary>
        /// Used by the provider to identify modified settings. Changing this value will force the entire block to be deleted, then recreated.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The type of filter to use while resizing an image. Valid values are `lanczos3`, `lanczos2`, `bicubic`, `bilinear` and `nearest`.
        /// 	- lanczos3: A Lanczos filter with a kernel size of 3. Lanczos filters can detect edges and linear features within an image, providing the best possible reconstruction.
        /// 	- lanczos2: A Lanczos filter with a kernel size of 2.
        /// 	- bicubic: A filter using an average of a 4x4 environment of pixels, weighing the innermost pixels higher.
        /// 	- bilinear: A filter using an average of a 2x2 environment of pixels.
        /// 	- nearest: A filter using the value of nearby translated pixel values. Preserves hard edges.
        /// </summary>
        public readonly string? ResizeFilter;
        /// <summary>
        /// Whether or not we should allow output images to render at sizes larger than input.
        /// </summary>
        public readonly bool? Upscale;
        /// <summary>
        /// Controls whether or not to default to WebP output when the client supports it. This is equivalent to adding "auto=webp" to all image optimizer requests.
        /// </summary>
        public readonly bool? Webp;
        /// <summary>
        /// The default quality to use with WebP output. This can be overridden with the second option in the "quality" URL parameter on specific image optimizer requests.
        /// </summary>
        public readonly int? WebpQuality;

        [OutputConstructor]
        private ServiceComputeImageOptimizerDefaultSettings(
            bool? allowVideo,

            int? jpegQuality,

            string? jpegType,

            string? name,

            string? resizeFilter,

            bool? upscale,

            bool? webp,

            int? webpQuality)
        {
            AllowVideo = allowVideo;
            JpegQuality = jpegQuality;
            JpegType = jpegType;
            Name = name;
            ResizeFilter = resizeFilter;
            Upscale = upscale;
            Webp = webp;
            WebpQuality = webpQuality;
        }
    }
}
