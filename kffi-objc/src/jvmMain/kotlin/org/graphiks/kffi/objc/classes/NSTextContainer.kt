@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextContainer
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
open class NSTextContainer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextContainer") }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithSize(size: CGSize): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSize:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentRectForProposedRect_atIndex_writingDirection_remainingRect(proposedRect: CGRect, characterIndex: Long, baseWritingDirection: NSWritingDirection, remainingRect: CGRectPointer): CGRect {
        val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, CGRect.layout), characterIndex, baseWritingDirection.rawValue, remainingRect.segment))
    }

    // @property textLayoutManager
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun textLayoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("textLayoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property size
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun size(): CGSize {
        val sel = ObjCRuntime.sel("size")
        return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setSize(value: CGSize) {
        val sel = ObjCRuntime.sel("setSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGSize.layout))
    }

    // @property lineBreakMode
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun lineBreakMode(): NSLineBreakMode {
        val sel = ObjCRuntime.sel("lineBreakMode")
        return NSLineBreakMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setLineBreakMode(value: NSLineBreakMode) {
        val sel = ObjCRuntime.sel("setLineBreakMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property lineFragmentPadding
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentPadding(): Double {
        val sel = ObjCRuntime.sel("lineFragmentPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setLineFragmentPadding(value: Double) {
        val sel = ObjCRuntime.sel("setLineFragmentPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfLines
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun maximumNumberOfLines(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfLines")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setMaximumNumberOfLines(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfLines:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property simpleRectangularTextContainer
    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun isSimpleRectangularTextContainer(): Boolean {
        val sel = ObjCRuntime.sel("isSimpleRectangularTextContainer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property widthTracksTextView
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun widthTracksTextView(): Boolean {
        val sel = ObjCRuntime.sel("widthTracksTextView")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setWidthTracksTextView(value: Boolean) {
        val sel = ObjCRuntime.sel("setWidthTracksTextView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property heightTracksTextView
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun heightTracksTextView(): Boolean {
        val sel = ObjCRuntime.sel("heightTracksTextView")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    open fun setHeightTracksTextView(value: Boolean) {
        val sel = ObjCRuntime.sel("setHeightTracksTextView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSTextContainer.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextContainer_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextContainer")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category:  on NSTextContainer ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.layoutManager(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutManager")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.setLayoutManager(layoutManager: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setLayoutManager:")
    ObjCRuntime.msgSend(null, this.ptr, sel, layoutManager)
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.replaceLayoutManager(newLayoutManager: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceLayoutManager:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newLayoutManager)
}

/** @return NSArray<NSBezierPath *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.exclusionPaths(): MemorySegment {
    val sel = ObjCRuntime.sel("exclusionPaths")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.setExclusionPaths(exclusionPaths: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setExclusionPaths:")
    ObjCRuntime.msgSend(null, this.ptr, sel, exclusionPaths)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.textView(): MemorySegment {
    val sel = ObjCRuntime.sel("textView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.setTextView(textView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTextView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textView)
}

// ── Category: NSTextContainerDeprecated on NSTextContainer ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.initWithContainerSize(aContainerSize: NSSize): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContainerSize:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(aContainerSize.segment, NSSize.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect(proposedRect: NSRect, sweepDirection: NSLineSweepDirection, movementDirection: NSLineMovementDirection, remainingRect: NSRectPointer): NSRect {
    val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:sweepDirection:movementDirection:remainingRect:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), sweepDirection.rawValue, movementDirection.rawValue, remainingRect.segment))
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
fun NSTextContainer.containsPoint(point: NSPoint): Boolean {
    val sel = ObjCRuntime.sel("containsPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.containerSize(): NSSize {
    val sel = ObjCRuntime.sel("containerSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSTextContainer.setContainerSize(containerSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("setContainerSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(containerSize.segment, NSSize.layout))
}
