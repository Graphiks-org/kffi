@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSNib
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSNib(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSNib") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithNibNamed_bundle(nibName: MemorySegment, bundle: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithNibNamed:bundle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, nibName, bundle) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun initWithNibData_bundle(nibData: MemorySegment, bundle: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithNibData:bundle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, nibData, bundle) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun instantiateWithOwner_topLevelObjects(owner: MemorySegment, topLevelObjects: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("instantiateWithOwner:topLevelObjects:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, owner, topLevelObjects) as Boolean
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSNib.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSNib.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

// ── Category: NSDeprecated on NSNib ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
fun NSNib.initWithContentsOfURL(nibFileURL: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, nibFileURL) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
fun NSNib.instantiateNibWithExternalNameTable(externalNameTable: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("instantiateNibWithExternalNameTable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, externalNameTable) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
fun NSNib.instantiateNibWithOwner_topLevelObjects(owner: MemorySegment, topLevelObjects: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("instantiateNibWithOwner:topLevelObjects:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, owner, topLevelObjects) as Boolean
}
