package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextContainer
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
open class NSTextContainer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextContainer") }

    }

    open fun initWithSize(size: CGSize): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSize:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout)) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun lineFragmentRectForProposedRect_atIndex_writingDirection_remainingRect(proposedRect: CGRect, characterIndex: Long, baseWritingDirection: NSWritingDirection, remainingRect: CGRectPointer): CGRect {
        val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, CGRect.layout), characterIndex, baseWritingDirection.rawValue, remainingRect.segment))
    }

    // @property textLayoutManager
    open fun textLayoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("textLayoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property size
    open fun size(): CGSize {
        val sel = ObjCRuntime.sel("size")
        return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, ptr, sel))
    }
    open fun setSize(value: CGSize) {
        val sel = ObjCRuntime.sel("setSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGSize.layout))
    }

    // @property lineBreakMode
    open fun lineBreakMode(): NSLineBreakMode {
        val sel = ObjCRuntime.sel("lineBreakMode")
        return NSLineBreakMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLineBreakMode(value: NSLineBreakMode) {
        val sel = ObjCRuntime.sel("setLineBreakMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property lineFragmentPadding
    open fun lineFragmentPadding(): Double {
        val sel = ObjCRuntime.sel("lineFragmentPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setLineFragmentPadding(value: Double) {
        val sel = ObjCRuntime.sel("setLineFragmentPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfLines
    open fun maximumNumberOfLines(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfLines")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumNumberOfLines(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfLines:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property simpleRectangularTextContainer
    open fun isSimpleRectangularTextContainer(): Boolean {
        val sel = ObjCRuntime.sel("isSimpleRectangularTextContainer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property widthTracksTextView
    open fun widthTracksTextView(): Boolean {
        val sel = ObjCRuntime.sel("widthTracksTextView")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWidthTracksTextView(value: Boolean) {
        val sel = ObjCRuntime.sel("setWidthTracksTextView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property heightTracksTextView
    open fun heightTracksTextView(): Boolean {
        val sel = ObjCRuntime.sel("heightTracksTextView")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHeightTracksTextView(value: Boolean) {
        val sel = ObjCRuntime.sel("setHeightTracksTextView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category:  on NSTextContainer ─────────────────────────────────────────

fun NSTextContainer.layoutManager(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutManager")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextContainer.setLayoutManager(layoutManager: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setLayoutManager:")
    ObjCRuntime.msgSend(null, this.ptr, sel, layoutManager)
}

fun NSTextContainer.replaceLayoutManager(newLayoutManager: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceLayoutManager:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newLayoutManager)
}

/** @return NSArray<NSBezierPath *> * */
fun NSTextContainer.exclusionPaths(): MemorySegment {
    val sel = ObjCRuntime.sel("exclusionPaths")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextContainer.setExclusionPaths(exclusionPaths: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setExclusionPaths:")
    ObjCRuntime.msgSend(null, this.ptr, sel, exclusionPaths)
}

fun NSTextContainer.textView(): MemorySegment {
    val sel = ObjCRuntime.sel("textView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextContainer.setTextView(textView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTextView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textView)
}

// ── Category: NSTextContainerDeprecated on NSTextContainer ─────────────────────────────────────────

fun NSTextContainer.initWithContainerSize(aContainerSize: NSSize): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContainerSize:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(aContainerSize.segment, NSSize.layout)) as MemorySegment
}

fun NSTextContainer.lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect(proposedRect: NSRect, sweepDirection: NSLineSweepDirection, movementDirection: NSLineMovementDirection, remainingRect: NSRectPointer): NSRect {
    val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:sweepDirection:movementDirection:remainingRect:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), sweepDirection.rawValue, movementDirection.rawValue, remainingRect.segment))
}

fun NSTextContainer.containsPoint(point: NSPoint): Boolean {
    val sel = ObjCRuntime.sel("containsPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
}

fun NSTextContainer.containerSize(): NSSize {
    val sel = ObjCRuntime.sel("containerSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

fun NSTextContainer.setContainerSize(containerSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("setContainerSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(containerSize.segment, NSSize.layout))
}
