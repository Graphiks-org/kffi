@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUserInterfaceCompressionOptions
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSUserInterfaceCompressionOptions(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSUserInterfaceCompressionOptions") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun hideImagesOption(): MemorySegment {
            val sel = ObjCRuntime.sel("hideImagesOption")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun hideTextOption(): MemorySegment {
            val sel = ObjCRuntime.sel("hideTextOption")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun reduceMetricsOption(): MemorySegment {
            val sel = ObjCRuntime.sel("reduceMetricsOption")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun breakEqualWidthsOption(): MemorySegment {
            val sel = ObjCRuntime.sel("breakEqualWidthsOption")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun standardOptions(): MemorySegment {
            val sel = ObjCRuntime.sel("standardOptions")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithIdentifier(identifier: String): MemorySegment = initWithIdentifier(ObjCRuntime.newNSString(Arena.global(), identifier))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCompressionOptions(options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCompressionOptions:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, options) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun containsOptions(options: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("containsOptions:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, options) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun intersectsOptions(options: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("intersectsOptions:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, options) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun optionsByAddingOptions(options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("optionsByAddingOptions:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, options) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun optionsByRemovingOptions(options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("optionsByRemovingOptions:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, options) as MemorySegment
    }

    // @property empty
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEmpty(): Boolean {
        val sel = ObjCRuntime.sel("isEmpty")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSUserInterfaceCompressionOptions.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSUserInterfaceCompressionOptions.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}
