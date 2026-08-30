@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFilePromiseProvider
 * Superclass: NSObject
 * Protocols: NSPasteboardWriting
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSFilePromiseProvider(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFilePromiseProvider") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFileType_delegate(fileType: MemorySegment, delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFileType:delegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fileType, delegate) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithFileType_delegate(fileType: String, delegate: MemorySegment): MemorySegment = initWithFileType_delegate(ObjCRuntime.newNSString(Arena.global(), fileType), delegate)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property fileType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileType(): MemorySegment {
        val sel = ObjCRuntime.sel("fileType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileType(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileType:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileTypeAsString(): String = ObjCRuntime.toJavaString(fileType())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFileType(value: String) = setFileType(ObjCRuntime.newNSString(Arena.global(), value))

    // @property delegate
    /** @return id<NSFilePromiseProviderDelegate> */
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

    // @property userInfo
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUserInfo(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setUserInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSFilePromiseProvider.writableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("writableTypesForPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSFilePromiseProvider.pasteboardPropertyListForType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pasteboardPropertyListForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}
