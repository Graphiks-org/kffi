@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImage
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
open class NSImage(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSImage") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageNamed(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageNamed:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSystemSymbolName_accessibilityDescription(name: MemorySegment, description: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithSystemSymbolName:accessibilityDescription:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, description) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSystemSymbolName_accessibilityDescription(name: String, description: String): MemorySegment = imageWithSystemSymbolName_accessibilityDescription(ObjCRuntime.newNSString(Arena.global(), name), ObjCRuntime.newNSString(Arena.global(), description))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSystemSymbolName_variableValue_accessibilityDescription(name: MemorySegment, value: Double, description: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithSystemSymbolName:variableValue:accessibilityDescription:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, value, description) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSystemSymbolName_variableValue_accessibilityDescription(name: String, value: Double, description: String): MemorySegment = imageWithSystemSymbolName_variableValue_accessibilityDescription(ObjCRuntime.newNSString(Arena.global(), name), value, ObjCRuntime.newNSString(Arena.global(), description))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSymbolName_variableValue(name: MemorySegment, value: Double): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithSymbolName:variableValue:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, value) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSymbolName_variableValue(name: String, value: Double): MemorySegment = imageWithSymbolName_variableValue(ObjCRuntime.newNSString(Arena.global(), name), value)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSymbolName_bundle_variableValue(name: MemorySegment, bundle: MemorySegment, value: Double): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithSymbolName:bundle:variableValue:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, bundle, value) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun imageWithSymbolName_bundle_variableValue(name: String, bundle: MemorySegment, value: Double): MemorySegment = imageWithSymbolName_bundle_variableValue(ObjCRuntime.newNSString(Arena.global(), name), bundle, value)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        fun imageWithSize_flipped_drawingHandler(size: NSSize, drawingHandlerShouldBeCalledWithFlippedContext: Boolean, drawingHandler: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageWithSize:flipped:drawingHandler:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), drawingHandlerShouldBeCalledWithFlippedContext, drawingHandler) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun canInitWithPasteboard(pasteboard: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, pasteboard) as Boolean
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageUnfilteredTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithSize(size: NSSize): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSize:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentsOfFile(fileName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfFile:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fileName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithContentsOfFile(fileName: String): MemorySegment = initWithContentsOfFile(ObjCRuntime.newNSString(Arena.global(), fileName))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentsOfURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentsOfURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initByReferencingFile(fileName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initByReferencingFile:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fileName) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initByReferencingFile(fileName: String): MemorySegment = initByReferencingFile(ObjCRuntime.newNSString(Arena.global(), fileName))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initByReferencingURL(url: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initByReferencingURL:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithPasteboard(pasteboard: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPasteboard:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pasteboard) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithDataIgnoringOrientation(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDataIgnoringOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setName(string: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setName:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawAtPoint_fromRect_operation_fraction(point: NSPoint, fromRect: NSRect, op: NSCompositingOperation, delta: Double): Unit {
        val sel = ObjCRuntime.sel("drawAtPoint:fromRect:operation:fraction:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(fromRect.segment, NSRect.layout), op.rawValue, delta)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawInRect_fromRect_operation_fraction(rect: NSRect, fromRect: NSRect, op: NSCompositingOperation, delta: Double): Unit {
        val sel = ObjCRuntime.sel("drawInRect:fromRect:operation:fraction:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(fromRect.segment, NSRect.layout), op.rawValue, delta)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun drawInRect_fromRect_operation_fraction_respectFlipped_hints(dstSpacePortionRect: NSRect, srcSpacePortionRect: NSRect, op: NSCompositingOperation, requestedAlpha: Double, respectContextIsFlipped: Boolean, hints: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawInRect:fromRect:operation:fraction:respectFlipped:hints:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dstSpacePortionRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(srcSpacePortionRect.segment, NSRect.layout), op.rawValue, requestedAlpha, respectContextIsFlipped, hints)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawRepresentation_inRect(imageRep: MemorySegment, rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("drawRepresentation:inRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, imageRep, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun drawInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun recache(): Unit {
        val sel = ObjCRuntime.sel("recache")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun TIFFRepresentationUsingCompression_factor(comp: NSTIFFCompression, factor: Float): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentationUsingCompression:factor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, comp.rawValue, factor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRepresentations(imageReps: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addRepresentations:")
        ObjCRuntime.msgSend(null, ptr, sel, imageReps)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRepresentation(imageRep: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addRepresentation:")
        ObjCRuntime.msgSend(null, ptr, sel, imageRep)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeRepresentation(imageRep: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeRepresentation:")
        ObjCRuntime.msgSend(null, ptr, sel, imageRep)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithCGImage_size(cgImage: CGImageRef, size: NSSize): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImage:size:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cgImage.segment, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun CGImageForProposedRect_context_hints(proposedDestRect: NSRectPointer, referenceContext: MemorySegment, hints: MemorySegment): CGImageRef {
        val sel = ObjCRuntime.sel("CGImageForProposedRect:context:hints:")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, proposedDestRect.segment, referenceContext, hints) as MemorySegment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun bestRepresentationForRect_context_hints(rect: NSRect, referenceContext: MemorySegment, hints: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bestRepresentationForRect:context:hints:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), referenceContext, hints) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun hitTestRect_withImageDestinationRect_context_hints_flipped(testRectDestSpace: NSRect, imageRectDestSpace: NSRect, context: MemorySegment, hints: MemorySegment, flipped: Boolean): Boolean {
        val sel = ObjCRuntime.sel("hitTestRect:withImageDestinationRect:context:hints:flipped:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(testRectDestSpace.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(imageRectDestSpace.segment, NSRect.layout), context, hints, flipped) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun recommendedLayerContentsScale(preferredContentsScale: Double): Double {
        val sel = ObjCRuntime.sel("recommendedLayerContentsScale:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, preferredContentsScale) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun layerContentsForContentsScale(layerContentsScale: Double): MemorySegment {
        val sel = ObjCRuntime.sel("layerContentsForContentsScale:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, layerContentsScale) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun imageWithSymbolConfiguration(configuration: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageWithSymbolConfiguration:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, configuration) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun imageWithLocale(locale: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("imageWithLocale:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, locale) as MemorySegment
    }

    // @property size
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun size(): NSSize {
        val sel = ObjCRuntime.sel("size")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesEPSOnResolutionMismatch
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesEPSOnResolutionMismatch(): Boolean {
        val sel = ObjCRuntime.sel("usesEPSOnResolutionMismatch")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesEPSOnResolutionMismatch(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesEPSOnResolutionMismatch:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property prefersColorMatch
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prefersColorMatch(): Boolean {
        val sel = ObjCRuntime.sel("prefersColorMatch")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrefersColorMatch(value: Boolean) {
        val sel = ObjCRuntime.sel("setPrefersColorMatch:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property matchesOnMultipleResolution
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchesOnMultipleResolution(): Boolean {
        val sel = ObjCRuntime.sel("matchesOnMultipleResolution")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMatchesOnMultipleResolution(value: Boolean) {
        val sel = ObjCRuntime.sel("setMatchesOnMultipleResolution:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property matchesOnlyOnBestFittingAxis
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun matchesOnlyOnBestFittingAxis(): Boolean {
        val sel = ObjCRuntime.sel("matchesOnlyOnBestFittingAxis")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setMatchesOnlyOnBestFittingAxis(value: Boolean) {
        val sel = ObjCRuntime.sel("setMatchesOnlyOnBestFittingAxis:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property TIFFRepresentation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun TIFFRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property representations
    /** @return NSArray<NSImageRep *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun representations(): MemorySegment {
        val sel = ObjCRuntime.sel("representations")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property valid
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isValid(): Boolean {
        val sel = ObjCRuntime.sel("isValid")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property delegate
    /** @return id<NSImageDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cacheMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cacheMode(): NSImageCacheMode {
        val sel = ObjCRuntime.sel("cacheMode")
        return NSImageCacheMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCacheMode(value: NSImageCacheMode) {
        val sel = ObjCRuntime.sel("setCacheMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property alignmentRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun alignmentRect(): NSRect {
        val sel = ObjCRuntime.sel("alignmentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAlignmentRect(value: NSRect) {
        val sel = ObjCRuntime.sel("setAlignmentRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property template
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun isTemplate(): Boolean {
        val sel = ObjCRuntime.sel("isTemplate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setTemplate(value: Boolean) {
        val sel = ObjCRuntime.sel("setTemplate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property accessibilityDescription
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun accessibilityDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("accessibilityDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setAccessibilityDescription(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessibilityDescription:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun accessibilityDescriptionAsString(): String = ObjCRuntime.toJavaString(accessibilityDescription())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setAccessibilityDescription(value: String) = setAccessibilityDescription(ObjCRuntime.newNSString(Arena.global(), value))

    // @property capInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun capInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("capInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setCapInsets(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setCapInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property resizingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun resizingMode(): NSImageResizingMode {
        val sel = ObjCRuntime.sel("resizingMode")
        return NSImageResizingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setResizingMode(value: NSImageResizingMode) {
        val sel = ObjCRuntime.sel("setResizingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property symbolConfiguration
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun symbolConfiguration(): MemorySegment {
        val sel = ObjCRuntime.sel("symbolConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property locale
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun locale(): MemorySegment {
        val sel = ObjCRuntime.sel("locale")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category:  on NSImage ─────────────────────────────────────────

// ── Category: Deprecated on NSImage ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -[NSWorkspace iconForFile:], -[NSWorkspace iconForFiles:], -[NSWorkspace iconForFileType:], or +[NSImage imageNamed:] instead.")
fun NSImage.initWithIconRef(iconRef: IconRef): MemorySegment {
    val sel = ObjCRuntime.sel("initWithIconRef:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, iconRef.segment) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -[NSImage bestRepresentationForRect:context:hints:] instead.  Any deviceDescription dictionary is also a valid hints dictionary.")
fun NSImage.bestRepresentationForDevice(deviceDescription: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("bestRepresentationForDevice:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, deviceDescription) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This method is incompatible with resolution-independent drawing and should not be used. Instead, use +[NSImage imageWithSize:flipped:drawingHandler:] to create a block-based image describing the desired image drawing, or use +[NSGraphicsContext graphicsContextWithBitmapImageRep:] to manipulate specific bitmap image representations.")
fun NSImage.lockFocus(): Unit {
    val sel = ObjCRuntime.sel("lockFocus")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This method is incompatible with resolution-independent drawing and should not be used. Instead, use +[NSImage imageWithSize:flipped:drawingHandler:] to create a block-based image describing the desired image drawing, or use +[NSGraphicsContext graphicsContextWithBitmapImageRep:] to manipulate specific bitmap image representations.")
fun NSImage.lockFocusFlipped(flipped: Boolean): Unit {
    val sel = ObjCRuntime.sel("lockFocusFlipped:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flipped)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This method is incompatible with resolution-independent drawing and should not be used. Instead, use +[NSImage imageWithSize:flipped:drawingHandler:] to create a block-based image describing the desired image drawing, or use +[NSGraphicsContext graphicsContextWithBitmapImageRep:] to manipulate specific bitmap image representations.")
fun NSImage.unlockFocus(): Unit {
    val sel = ObjCRuntime.sel("unlockFocus")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "The concept of flippedness for NSImage is deprecated.  Please see the AppKit 10.6 release notes for a discussion of why and for how to replace existing usage.")
fun NSImage.setFlipped(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setFlipped:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "The concept of flippedness for NSImage is deprecated.  Please see the AppKit 10.6 release notes for a discussion of why and for how to replace existing usage.")
fun NSImage.isFlipped(): Boolean {
    val sel = ObjCRuntime.sel("isFlipped")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.setScalesWhenResized(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setScalesWhenResized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.scalesWhenResized(): Boolean {
    val sel = ObjCRuntime.sel("scalesWhenResized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.setDataRetained(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setDataRetained:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.isDataRetained(): Boolean {
    val sel = ObjCRuntime.sel("isDataRetained")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.setCachedSeparately(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCachedSeparately:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.isCachedSeparately(): Boolean {
    val sel = ObjCRuntime.sel("isCachedSeparately")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.setCacheDepthMatchesImageDepth(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCacheDepthMatchesImageDepth:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "You should be able to remove use of this method without any replacement.  See 10.6 AppKit release notes for details.")
fun NSImage.cacheDepthMatchesImageDepth(): Boolean {
    val sel = ObjCRuntime.sel("cacheDepthMatchesImageDepth")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.dissolveToPoint_fraction(point: NSPoint, fraction: Double): Unit {
    val sel = ObjCRuntime.sel("dissolveToPoint:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), fraction)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.dissolveToPoint_fromRect_fraction(point: NSPoint, rect: NSRect, fraction: Double): Unit {
    val sel = ObjCRuntime.sel("dissolveToPoint:fromRect:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), fraction)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.compositeToPoint_operation(point: NSPoint, operation: NSCompositingOperation): Unit {
    val sel = ObjCRuntime.sel("compositeToPoint:operation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), operation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.compositeToPoint_fromRect_operation(point: NSPoint, rect: NSRect, operation: NSCompositingOperation): Unit {
    val sel = ObjCRuntime.sel("compositeToPoint:fromRect:operation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), operation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.compositeToPoint_operation_fraction(point: NSPoint, operation: NSCompositingOperation, fraction: Double): Unit {
    val sel = ObjCRuntime.sel("compositeToPoint:operation:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), operation.rawValue, fraction)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -drawAtPoint:... or -drawInRect:... methods instead")
fun NSImage.compositeToPoint_fromRect_operation_fraction(point: NSPoint, rect: NSRect, operation: NSCompositingOperation, fraction: Double): Unit {
    val sel = ObjCRuntime.sel("compositeToPoint:fromRect:operation:fraction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), operation.rawValue, fraction)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Create an image using +[NSImage imageWithSize:flipped:drawingHandler:], and begin your custom drawing with -[NSImageRep drawInRect:] instead.")
fun NSImage.lockFocusOnRepresentation(imageRepresentation: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("lockFocusOnRepresentation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, imageRepresentation)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "This method does not perform any operation on 10.4 or later.")
fun NSImage.cancelIncrementalLoad(): Unit {
    val sel = ObjCRuntime.sel("cancelIncrementalLoad")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// Class method: +[NSImage imageUnfilteredFileTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageUnfilteredTypes instead")
fun NSImage_imageUnfilteredFileTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("imageUnfilteredFileTypes")
    val cls = ObjCRuntime.getClass("NSImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSImage imageUnfilteredPasteboardTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageUnfilteredTypes instead")
fun NSImage_imageUnfilteredPasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("imageUnfilteredPasteboardTypes")
    val cls = ObjCRuntime.getClass("NSImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSImage imageFileTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageTypes instead")
fun NSImage_imageFileTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("imageFileTypes")
    val cls = ObjCRuntime.getClass("NSImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSImage imagePasteboardTypes]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageTypes instead")
fun NSImage_imagePasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("imagePasteboardTypes")
    val cls = ObjCRuntime.getClass("NSImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
