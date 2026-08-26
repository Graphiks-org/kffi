package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCachedURLResponse
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSCachedURLResponse(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCachedURLResponse") }

    }

    open fun initWithResponse_data(response: MemorySegment, `data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithResponse:data:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, response, `data`) as MemorySegment
    }

    open fun initWithResponse_data_userInfo_storagePolicy(response: MemorySegment, `data`: MemorySegment, userInfo: MemorySegment, storagePolicy: NSURLCacheStoragePolicy): MemorySegment {
        val sel = ObjCRuntime.sel("initWithResponse:data:userInfo:storagePolicy:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, response, `data`, userInfo, storagePolicy.rawValue) as MemorySegment
    }

    // @property response
    open fun response(): MemorySegment {
        val sel = ObjCRuntime.sel("response")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property data
    open fun `data`(): MemorySegment {
        val sel = ObjCRuntime.sel("data")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userInfo
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property storagePolicy
    open fun storagePolicy(): NSURLCacheStoragePolicy {
        val sel = ObjCRuntime.sel("storagePolicy")
        return NSURLCacheStoragePolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSCachedURLResponse.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSCachedURLResponse.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSCachedURLResponse_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSCachedURLResponse")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSCachedURLResponse.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
