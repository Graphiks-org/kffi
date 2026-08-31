@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSException
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSException(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSException") } }

        fun exceptionWithName_reason_userInfo(name: MemorySegment, reason: MemorySegment, userInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("exceptionWithName:reason:userInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, reason, userInfo) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun exceptionWithName_reason_userInfo(name: MemorySegment, reason: String, userInfo: MemorySegment): MemorySegment = exceptionWithName_reason_userInfo(name, ObjCRuntime.newNSString(Arena.global(), reason), userInfo)

    }

    open fun initWithName_reason_userInfo(aName: MemorySegment, aReason: MemorySegment, aUserInfo: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithName:reason:userInfo:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, aName, aReason, aUserInfo) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithName_reason_userInfo(aName: MemorySegment, aReason: String, aUserInfo: MemorySegment): MemorySegment = initWithName_reason_userInfo(aName, ObjCRuntime.newNSString(Arena.global(), aReason), aUserInfo)

    open fun raise(): Unit {
        val sel = ObjCRuntime.sel("raise")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property name
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property reason
    open fun reason(): MemorySegment {
        val sel = ObjCRuntime.sel("reason")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun reasonAsString(): String = ObjCRuntime.toJavaString(reason())

    // @property userInfo
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property callStackReturnAddresses
    /** @return NSArray<NSNumber *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun callStackReturnAddresses(): MemorySegment {
        val sel = ObjCRuntime.sel("callStackReturnAddresses")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property callStackSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun callStackSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("callStackSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: name: MemorySegment
    // ivar: reason: MemorySegment
    // ivar: userInfo: MemorySegment
    // ivar: reserved: MemorySegment
}

/** Required by Objective-C protocol NSCopying. */
fun NSException.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSException.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSException.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSException_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSException")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSExceptionRaisingConveniences on NSException ─────────────────────────────────────────

// Class method: +[NSException raise:format:]
fun NSException_raise_format(name: MemorySegment, format: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("raise:format:")
    val cls = ObjCRuntime.getClass("NSException")
    ObjCRuntime.msgSend(null, cls, sel, name, format)
}

// Class method: +[NSException raise:format:arguments:]
fun NSException_raise_format_arguments(name: MemorySegment, format: MemorySegment, argList: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("raise:format:arguments:")
    val cls = ObjCRuntime.getClass("NSException")
    ObjCRuntime.msgSend(null, cls, sel, name, format, argList)
}
