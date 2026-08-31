@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOpenGLPixelFormat
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Please use Metal or MetalKit.")
open class NSOpenGLPixelFormat(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSOpenGLPixelFormat") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithCGLPixelFormatObj(format: CGLPixelFormatObj): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGLPixelFormatObj:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, format.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithAttributes(attribs: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAttributes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attribs) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -initWithAttributes: instead")
    open fun initWithData(attribs: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attribs) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    open fun attributes(): MemorySegment {
        val sel = ObjCRuntime.sel("attributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    open fun setAttributes(attribs: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, attribs)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getValues_forAttribute_forVirtualScreen(vals: MemorySegment, attrib: Int, screen: Int): Unit {
        val sel = ObjCRuntime.sel("getValues:forAttribute:forVirtualScreen:")
        ObjCRuntime.msgSend(null, ptr, sel, vals, attrib, screen)
    }

    // @property numberOfVirtualScreens
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfVirtualScreens(): Int {
        val sel = ObjCRuntime.sel("numberOfVirtualScreens")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

    // @property CGLPixelFormatObj
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun CGLPixelFormatObj(): CGLPixelFormatObj {
        val sel = ObjCRuntime.sel("CGLPixelFormatObj")
        return CGLPixelFormatObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSOpenGLPixelFormat.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSOpenGLPixelFormat.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
