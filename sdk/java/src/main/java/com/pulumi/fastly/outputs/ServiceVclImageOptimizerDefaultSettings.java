// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceVclImageOptimizerDefaultSettings {
    /**
     * @return Enables GIF to MP4 transformations on this service.
     * 
     */
    private @Nullable Boolean allowVideo;
    /**
     * @return The default quality to use with JPEG output. This can be overridden with the &#34;quality&#34; parameter on specific image optimizer requests.
     * 
     */
    private @Nullable Integer jpegQuality;
    /**
     * @return The default type of JPEG output to use. This can be overridden with &#34;format=bjpeg&#34; and &#34;format=pjpeg&#34; on specific image optimizer requests. Valid values are `auto`, `baseline` and `progressive`.
     * 	- auto: Match the input JPEG type, or baseline if transforming from a non-JPEG input.
     * 	- baseline: Output baseline JPEG images
     * 	- progressive: Output progressive JPEG images
     * 
     */
    private @Nullable String jpegType;
    /**
     * @return Used by the provider to identify modified settings. Changing this value will force the entire block to be deleted, then recreated.
     * 
     */
    private @Nullable String name;
    /**
     * @return The type of filter to use while resizing an image. Valid values are `lanczos3`, `lanczos2`, `bicubic`, `bilinear` and `nearest`.
     * 	- lanczos3: A Lanczos filter with a kernel size of 3. Lanczos filters can detect edges and linear features within an image, providing the best possible reconstruction.
     * 	- lanczos2: A Lanczos filter with a kernel size of 2.
     * 	- bicubic: A filter using an average of a 4x4 environment of pixels, weighing the innermost pixels higher.
     * 	- bilinear: A filter using an average of a 2x2 environment of pixels.
     * 	- nearest: A filter using the value of nearby translated pixel values. Preserves hard edges.
     * 
     */
    private @Nullable String resizeFilter;
    /**
     * @return Whether or not we should allow output images to render at sizes larger than input.
     * 
     */
    private @Nullable Boolean upscale;
    /**
     * @return Controls whether or not to default to WebP output when the client supports it. This is equivalent to adding &#34;auto=webp&#34; to all image optimizer requests.
     * 
     */
    private @Nullable Boolean webp;
    /**
     * @return The default quality to use with WebP output. This can be overridden with the second option in the &#34;quality&#34; URL parameter on specific image optimizer requests.
     * 
     */
    private @Nullable Integer webpQuality;

    private ServiceVclImageOptimizerDefaultSettings() {}
    /**
     * @return Enables GIF to MP4 transformations on this service.
     * 
     */
    public Optional<Boolean> allowVideo() {
        return Optional.ofNullable(this.allowVideo);
    }
    /**
     * @return The default quality to use with JPEG output. This can be overridden with the &#34;quality&#34; parameter on specific image optimizer requests.
     * 
     */
    public Optional<Integer> jpegQuality() {
        return Optional.ofNullable(this.jpegQuality);
    }
    /**
     * @return The default type of JPEG output to use. This can be overridden with &#34;format=bjpeg&#34; and &#34;format=pjpeg&#34; on specific image optimizer requests. Valid values are `auto`, `baseline` and `progressive`.
     * 	- auto: Match the input JPEG type, or baseline if transforming from a non-JPEG input.
     * 	- baseline: Output baseline JPEG images
     * 	- progressive: Output progressive JPEG images
     * 
     */
    public Optional<String> jpegType() {
        return Optional.ofNullable(this.jpegType);
    }
    /**
     * @return Used by the provider to identify modified settings. Changing this value will force the entire block to be deleted, then recreated.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The type of filter to use while resizing an image. Valid values are `lanczos3`, `lanczos2`, `bicubic`, `bilinear` and `nearest`.
     * 	- lanczos3: A Lanczos filter with a kernel size of 3. Lanczos filters can detect edges and linear features within an image, providing the best possible reconstruction.
     * 	- lanczos2: A Lanczos filter with a kernel size of 2.
     * 	- bicubic: A filter using an average of a 4x4 environment of pixels, weighing the innermost pixels higher.
     * 	- bilinear: A filter using an average of a 2x2 environment of pixels.
     * 	- nearest: A filter using the value of nearby translated pixel values. Preserves hard edges.
     * 
     */
    public Optional<String> resizeFilter() {
        return Optional.ofNullable(this.resizeFilter);
    }
    /**
     * @return Whether or not we should allow output images to render at sizes larger than input.
     * 
     */
    public Optional<Boolean> upscale() {
        return Optional.ofNullable(this.upscale);
    }
    /**
     * @return Controls whether or not to default to WebP output when the client supports it. This is equivalent to adding &#34;auto=webp&#34; to all image optimizer requests.
     * 
     */
    public Optional<Boolean> webp() {
        return Optional.ofNullable(this.webp);
    }
    /**
     * @return The default quality to use with WebP output. This can be overridden with the second option in the &#34;quality&#34; URL parameter on specific image optimizer requests.
     * 
     */
    public Optional<Integer> webpQuality() {
        return Optional.ofNullable(this.webpQuality);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceVclImageOptimizerDefaultSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowVideo;
        private @Nullable Integer jpegQuality;
        private @Nullable String jpegType;
        private @Nullable String name;
        private @Nullable String resizeFilter;
        private @Nullable Boolean upscale;
        private @Nullable Boolean webp;
        private @Nullable Integer webpQuality;
        public Builder() {}
        public Builder(ServiceVclImageOptimizerDefaultSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVideo = defaults.allowVideo;
    	      this.jpegQuality = defaults.jpegQuality;
    	      this.jpegType = defaults.jpegType;
    	      this.name = defaults.name;
    	      this.resizeFilter = defaults.resizeFilter;
    	      this.upscale = defaults.upscale;
    	      this.webp = defaults.webp;
    	      this.webpQuality = defaults.webpQuality;
        }

        @CustomType.Setter
        public Builder allowVideo(@Nullable Boolean allowVideo) {

            this.allowVideo = allowVideo;
            return this;
        }
        @CustomType.Setter
        public Builder jpegQuality(@Nullable Integer jpegQuality) {

            this.jpegQuality = jpegQuality;
            return this;
        }
        @CustomType.Setter
        public Builder jpegType(@Nullable String jpegType) {

            this.jpegType = jpegType;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resizeFilter(@Nullable String resizeFilter) {

            this.resizeFilter = resizeFilter;
            return this;
        }
        @CustomType.Setter
        public Builder upscale(@Nullable Boolean upscale) {

            this.upscale = upscale;
            return this;
        }
        @CustomType.Setter
        public Builder webp(@Nullable Boolean webp) {

            this.webp = webp;
            return this;
        }
        @CustomType.Setter
        public Builder webpQuality(@Nullable Integer webpQuality) {

            this.webpQuality = webpQuality;
            return this;
        }
        public ServiceVclImageOptimizerDefaultSettings build() {
            final var _resultValue = new ServiceVclImageOptimizerDefaultSettings();
            _resultValue.allowVideo = allowVideo;
            _resultValue.jpegQuality = jpegQuality;
            _resultValue.jpegType = jpegType;
            _resultValue.name = name;
            _resultValue.resizeFilter = resizeFilter;
            _resultValue.upscale = upscale;
            _resultValue.webp = webp;
            _resultValue.webpQuality = webpQuality;
            return _resultValue;
        }
    }
}