package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAttributedStringMarkdownSourcePosition
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSAttributedStringMarkdownSourcePosition(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAttributedStringMarkdownSourcePosition") }

    }

    open fun initWithStartLine_startColumn_endLine_endColumn(startLine: Long, startColumn: Long, endLine: Long, endColumn: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithStartLine:startColumn:endLine:endColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, startLine, startColumn, endLine, endColumn) as MemorySegment
    }

    open fun rangeInString(string: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("rangeInString:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, string))
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun rangeInString(string: String): NSRange = rangeInString(ObjCRuntime.newNSString(Arena.global(), string))

    // @property startLine
    open fun startLine(): Long {
        val sel = ObjCRuntime.sel("startLine")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property startColumn
    open fun startColumn(): Long {
        val sel = ObjCRuntime.sel("startColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property endLine
    open fun endLine(): Long {
        val sel = ObjCRuntime.sel("endLine")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property endColumn
    open fun endColumn(): Long {
        val sel = ObjCRuntime.sel("endColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSAttributedStringMarkdownSourcePosition.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSAttributedStringMarkdownSourcePosition.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSAttributedStringMarkdownSourcePosition.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSAttributedStringMarkdownSourcePosition_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSAttributedStringMarkdownSourcePosition")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
