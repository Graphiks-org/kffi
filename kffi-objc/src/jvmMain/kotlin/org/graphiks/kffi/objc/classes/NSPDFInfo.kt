@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPDFInfo
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
open class NSPDFInfo(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPDFInfo") } }

    }

    // @property URL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fileExtensionHidden
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFileExtensionHidden(): Boolean {
        val sel = ObjCRuntime.sel("isFileExtensionHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileExtensionHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setFileExtensionHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tagNames
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tagNames(): MemorySegment {
        val sel = ObjCRuntime.sel("tagNames")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTagNames(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTagNames:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property orientation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orientation(): NSPaperOrientation {
        val sel = ObjCRuntime.sel("orientation")
        return NSPaperOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOrientation(value: NSPaperOrientation) {
        val sel = ObjCRuntime.sel("setOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property paperSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun paperSize(): NSSize {
        val sel = ObjCRuntime.sel("paperSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPaperSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setPaperSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property attributes
    /** @return NSMutableDictionary<NSPrintInfoAttributeKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributes(): MemorySegment {
        val sel = ObjCRuntime.sel("attributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSPDFInfo.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSPDFInfo.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPDFInfo.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
