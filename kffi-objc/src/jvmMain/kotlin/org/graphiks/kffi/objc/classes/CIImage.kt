@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CIImage
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
open class CIImage(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("CIImage") }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithCGImage(image: CGImageRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCGImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithCGImage_options(image: CGImageRef, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCGImage:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image.segment, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun imageWithCGImageSource_index_options(source: CGImageSourceRef, index: Long, dict: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCGImageSource:index:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, source.segment, index, dict) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
        fun imageWithCGLayer(layer: CGLayerRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCGLayer:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layer.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
        fun imageWithCGLayer_options(layer: CGLayerRef, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCGLayer:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layer.segment, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithBitmapData_bytesPerRow_size_format_colorSpace(`data`: MemorySegment, bytesPerRow: Long, size: CGSize, format: Int, colorSpace: CGColorSpaceRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, bytesPerRow, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), format, colorSpace.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)")
        fun imageWithTexture_size_flipped_colorSpace(name: Int, size: CGSize, flipped: Boolean, colorSpace: CGColorSpaceRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithTexture:size:flipped:colorSpace:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), flipped, colorSpace.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)")
        fun imageWithTexture_size_flipped_options(name: Int, size: CGSize, flipped: Boolean, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithTexture:size:flipped:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), flipped, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun imageWithMTLTexture_options(texture: MemorySegment, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithMTLTexture:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, texture, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithContentsOfURL(url: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithContentsOfURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithContentsOfURL_options(url: MemorySegment, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithContentsOfURL:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithData_options(`data`: MemorySegment, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithData:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithCVImageBuffer(imageBuffer: CVImageBufferRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCVImageBuffer:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, imageBuffer.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithCVImageBuffer_options(imageBuffer: CVImageBufferRef, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCVImageBuffer:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, imageBuffer.segment, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun imageWithCVPixelBuffer(pixelBuffer: CVPixelBufferRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCVPixelBuffer:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pixelBuffer.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun imageWithCVPixelBuffer_options(pixelBuffer: CVPixelBufferRef, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithCVPixelBuffer:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pixelBuffer.segment, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun imageWithIOSurface(surface: IOSurfaceRef): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithIOSurface:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, surface.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun imageWithIOSurface_options(surface: IOSurfaceRef, options: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithIOSurface:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, surface.segment, options) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun imageWithColor(color: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, color) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun emptyImage(): MemorySegment {
            val sel = ObjCRuntime.sel("emptyImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun blackImage(): MemorySegment {
            val sel = ObjCRuntime.sel("blackImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun whiteImage(): MemorySegment {
            val sel = ObjCRuntime.sel("whiteImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun grayImage(): MemorySegment {
            val sel = ObjCRuntime.sel("grayImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun redImage(): MemorySegment {
            val sel = ObjCRuntime.sel("redImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun greenImage(): MemorySegment {
            val sel = ObjCRuntime.sel("greenImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun blueImage(): MemorySegment {
            val sel = ObjCRuntime.sel("blueImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun cyanImage(): MemorySegment {
            val sel = ObjCRuntime.sel("cyanImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun magentaImage(): MemorySegment {
            val sel = ObjCRuntime.sel("magentaImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun yellowImage(): MemorySegment {
            val sel = ObjCRuntime.sel("yellowImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun clearImage(): MemorySegment {
            val sel = ObjCRuntime.sel("clearImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithCGImage(image: CGImageRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithCGImage_options(image: CGImageRef, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImage:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image.segment, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun initWithCGImageSource_index_options(source: CGImageSourceRef, index: Long, dict: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImageSource:index:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, source.segment, index, dict) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use initWithCGImage: instead.")
    open fun initWithCGLayer(layer: CGLayerRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGLayer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, layer.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use initWithCGImage:options instead.")
    open fun initWithCGLayer_options(layer: CGLayerRef, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGLayer:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, layer.segment, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithData_options(`data`: MemorySegment, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithBitmapData_bytesPerRow_size_format_colorSpace(`data`: MemorySegment, bytesPerRow: Long, size: CGSize, format: Int, colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBitmapData:bytesPerRow:size:format:colorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`, bytesPerRow, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), format, colorSpace.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)")
    open fun initWithTexture_size_flipped_colorSpace(name: Int, size: CGSize, flipped: Boolean, colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTexture:size:flipped:colorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), flipped, colorSpace.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Core Image OpenGL API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)")
    open fun initWithTexture_size_flipped_options(name: Int, size: CGSize, flipped: Boolean, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTexture:size:flipped:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), flipped, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun initWithMTLTexture_options(texture: MemorySegment, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithMTLTexture:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, texture, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithContentsOfURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithContentsOfURL_options(url: MemorySegment, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithIOSurface(surface: IOSurfaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIOSurface:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, surface.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithIOSurface_options(surface: IOSurfaceRef, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIOSurface:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, surface.segment, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
    open fun initWithIOSurface_plane_format_options(surface: IOSurfaceRef, plane: Long, format: Int, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIOSurface:plane:format:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, surface.segment, plane, format, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithCVImageBuffer(imageBuffer: CVImageBufferRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCVImageBuffer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, imageBuffer.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithCVImageBuffer_options(imageBuffer: CVImageBufferRef, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCVImageBuffer:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, imageBuffer.segment, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun initWithCVPixelBuffer(pixelBuffer: CVPixelBufferRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCVPixelBuffer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pixelBuffer.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun initWithCVPixelBuffer_options(pixelBuffer: CVPixelBufferRef, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCVPixelBuffer:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pixelBuffer.segment, options) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithColor(color: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithColor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, color) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun imageByApplyingTransform(matrix: CGAffineTransform): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingTransform:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(matrix.segment, CGAffineTransform.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByApplyingTransform_highQualityDownsample(matrix: CGAffineTransform, highQualityDownsample: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingTransform:highQualityDownsample:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(matrix.segment, CGAffineTransform.layout), highQualityDownsample) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun imageByApplyingOrientation(orientation: Int): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, orientation) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun imageTransformForOrientation(orientation: Int): CGAffineTransform {
        val sel = ObjCRuntime.sel("imageTransformForOrientation:")
        return CGAffineTransform(ObjCRuntime.msgSendStruct(CGAffineTransform.layout, ptr, sel, orientation))
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun imageByApplyingCGOrientation(orientation: CGImagePropertyOrientation): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingCGOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, orientation.rawValue.toInt()) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun imageTransformForCGOrientation(orientation: CGImagePropertyOrientation): CGAffineTransform {
        val sel = ObjCRuntime.sel("imageTransformForCGOrientation:")
        return CGAffineTransform(ObjCRuntime.msgSendStruct(CGAffineTransform.layout, ptr, sel, orientation.rawValue.toInt()))
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun imageByCompositingOverImage(dest: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageByCompositingOverImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, dest) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun imageByCroppingToRect(rect: CGRect): MemorySegment {
        val sel = ObjCRuntime.sel("imageByCroppingToRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun imageByClampingToExtent(): MemorySegment {
        val sel = ObjCRuntime.sel("imageByClampingToExtent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByClampingToRect(rect: CGRect): MemorySegment {
        val sel = ObjCRuntime.sel("imageByClampingToRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun imageByApplyingFilter_withInputParameters(filterName: MemorySegment, params: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingFilter:withInputParameters:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, filterName, params) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    fun imageByApplyingFilter_withInputParameters(filterName: String, params: MemorySegment): MemorySegment = imageByApplyingFilter_withInputParameters(ObjCRuntime.newNSString(Arena.global(), filterName), params)

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun imageByApplyingFilter(filterName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingFilter:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, filterName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    fun imageByApplyingFilter(filterName: String): MemorySegment = imageByApplyingFilter(ObjCRuntime.newNSString(Arena.global(), filterName))

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByColorMatchingColorSpaceToWorkingSpace(colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("imageByColorMatchingColorSpaceToWorkingSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, colorSpace.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByColorMatchingWorkingSpaceToColorSpace(colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("imageByColorMatchingWorkingSpaceToColorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, colorSpace.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByPremultiplyingAlpha(): MemorySegment {
        val sel = ObjCRuntime.sel("imageByPremultiplyingAlpha")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByUnpremultiplyingAlpha(): MemorySegment {
        val sel = ObjCRuntime.sel("imageByUnpremultiplyingAlpha")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageBySettingAlphaOneInExtent(extent: CGRect): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySettingAlphaOneInExtent:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(extent.segment, CGRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageByApplyingGaussianBlurWithSigma(sigma: Double): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingGaussianBlurWithSigma:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sigma) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageBySettingProperties(properties: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySettingProperties:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, properties) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun imageBySamplingLinear(): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySamplingLinear")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun imageBySamplingNearest(): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySamplingNearest")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun imageByInsertingIntermediate(): MemorySegment {
        val sel = ObjCRuntime.sel("imageByInsertingIntermediate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun imageByInsertingIntermediate(cache: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("imageByInsertingIntermediate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cache) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun imageByInsertingTiledIntermediate(): MemorySegment {
        val sel = ObjCRuntime.sel("imageByInsertingTiledIntermediate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun imageByApplyingGainMap(gainmap: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingGainMap:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, gainmap) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun imageByApplyingGainMap_headroom(gainmap: MemorySegment, headroom: Float): MemorySegment {
        val sel = ObjCRuntime.sel("imageByApplyingGainMap:headroom:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, gainmap, headroom) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun imageBySettingContentHeadroom(headroom: Float): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySettingContentHeadroom:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, headroom) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun imageBySettingContentAverageLightLevel(average: Float): MemorySegment {
        val sel = ObjCRuntime.sel("imageBySettingContentAverageLightLevel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, average) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun regionOfInterestForImage_inRect(image: MemorySegment, rect: CGRect): CGRect {
        val sel = ObjCRuntime.sel("regionOfInterestForImage:inRect:")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel, image, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout)))
    }

    // @property extent
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun extent(): CGRect {
        val sel = ObjCRuntime.sel("extent")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

    // @property opaque
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property properties
    /** @return NSDictionary<NSString *,id> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun properties(): MemorySegment {
        val sel = ObjCRuntime.sel("properties")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property definition
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun definition(): MemorySegment {
        val sel = ObjCRuntime.sel("definition")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property url
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun url(): MemorySegment {
        val sel = ObjCRuntime.sel("url")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property colorSpace
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun colorSpace(): CGColorSpaceRef {
        val sel = ObjCRuntime.sel("colorSpace")
        return CGColorSpaceRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property contentHeadroom
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun contentHeadroom(): Float {
        val sel = ObjCRuntime.sel("contentHeadroom")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property contentAverageLightLevel
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun contentAverageLightLevel(): Float {
        val sel = ObjCRuntime.sel("contentAverageLightLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property pixelBuffer
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun pixelBuffer(): CVPixelBufferRef {
        val sel = ObjCRuntime.sel("pixelBuffer")
        return CVPixelBufferRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property CGImage
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun CGImage(): CGImageRef {
        val sel = ObjCRuntime.sel("CGImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property metalTexture
    /** @return id<MTLTexture> */
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun metalTexture(): MemorySegment {
        val sel = ObjCRuntime.sel("metalTexture")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _state: MemorySegment
    // ivar: _priv: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun CIImage.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun CIImage.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun CIImage_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun CIImage.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: AutoAdjustment on CIImage ─────────────────────────────────────────

/** @return NSArray<CIFilter *> * */
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun CIImage.autoAdjustmentFilters(): MemorySegment {
    val sel = ObjCRuntime.sel("autoAdjustmentFilters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<CIFilter *> * */
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun CIImage.autoAdjustmentFiltersWithOptions(options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("autoAdjustmentFiltersWithOptions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, options) as MemorySegment
}

// ── Category: LabConversion on CIImage ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CIImage.imageByConvertingWorkingSpaceToLab(): MemorySegment {
    val sel = ObjCRuntime.sel("imageByConvertingWorkingSpaceToLab")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CIImage.imageByConvertingLabToWorkingSpace(): MemorySegment {
    val sel = ObjCRuntime.sel("imageByConvertingLabToWorkingSpace")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: AVDepthData on CIImage ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage.initWithDepthData_options(`data`: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDepthData:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, options) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage.initWithDepthData(`data`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDepthData:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage.depthData(): MemorySegment {
    val sel = ObjCRuntime.sel("depthData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[CIImage imageWithDepthData:options:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage_imageWithDepthData_options(`data`: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithDepthData:options:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `data`, options) as MemorySegment
}

// Class method: +[CIImage imageWithDepthData:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage_imageWithDepthData(`data`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithDepthData:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `data`) as MemorySegment
}

// ── Category: AVPortraitEffectsMatte on CIImage ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CIImage.initWithPortaitEffectsMatte_options(matte: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithPortaitEffectsMatte:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, matte, options) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CIImage.initWithPortaitEffectsMatte(matte: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithPortaitEffectsMatte:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, matte) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CIImage.portraitEffectsMatte(): MemorySegment {
    val sel = ObjCRuntime.sel("portraitEffectsMatte")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[CIImage imageWithPortaitEffectsMatte:options:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CIImage_imageWithPortaitEffectsMatte_options(matte: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithPortaitEffectsMatte:options:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, matte, options) as MemorySegment
}

// Class method: +[CIImage imageWithPortaitEffectsMatte:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CIImage_imageWithPortaitEffectsMatte(matte: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithPortaitEffectsMatte:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, matte) as MemorySegment
}

// ── Category: AVSemanticSegmentationMatte on CIImage ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CIImage.initWithSemanticSegmentationMatte_options(matte: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSemanticSegmentationMatte:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, matte, options) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CIImage.initWithSemanticSegmentationMatte(matte: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSemanticSegmentationMatte:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, matte) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CIImage.semanticSegmentationMatte(): MemorySegment {
    val sel = ObjCRuntime.sel("semanticSegmentationMatte")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[CIImage imageWithSemanticSegmentationMatte:options:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CIImage_imageWithSemanticSegmentationMatte_options(matte: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithSemanticSegmentationMatte:options:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, matte, options) as MemorySegment
}

// Class method: +[CIImage imageWithSemanticSegmentationMatte:]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CIImage_imageWithSemanticSegmentationMatte(matte: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("imageWithSemanticSegmentationMatte:")
    val cls = ObjCRuntime.getClass("CIImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, matte) as MemorySegment
}

// ── Category: NSAppKitAdditions on CIImage ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun CIImage.initWithBitmapImageRep(bitmapImageRep: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBitmapImageRep:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bitmapImageRep) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun CIImage.drawInRect_fromRect_operation_fraction(rect: NSRect, fromRect: NSRect, op: NSCompositingOperation, delta: Double): Unit {
    val sel = ObjCRuntime.sel("drawInRect:fromRect:operation:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(fromRect.segment, NSRect.layout), op.rawValue, delta)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun CIImage.drawAtPoint_fromRect_operation_fraction(point: NSPoint, fromRect: NSRect, op: NSCompositingOperation, delta: Double): Unit {
    val sel = ObjCRuntime.sel("drawAtPoint:fromRect:operation:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(fromRect.segment, NSRect.layout), op.rawValue, delta)
}
