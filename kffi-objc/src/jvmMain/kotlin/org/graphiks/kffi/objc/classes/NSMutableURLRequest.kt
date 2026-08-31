@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableURLRequest
 * Superclass: NSURLRequest
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSMutableURLRequest(override val ptr: MemorySegment) : NSURLRequest(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMutableURLRequest") } }

    }

    // @property URL
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cachePolicy
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun cachePolicy(): NSURLRequestCachePolicy {
        val sel = ObjCRuntime.sel("cachePolicy")
        return NSURLRequestCachePolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCachePolicy(value: NSURLRequestCachePolicy) {
        val sel = ObjCRuntime.sel("setCachePolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property timeoutInterval
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun timeoutInterval(): Double {
        val sel = ObjCRuntime.sel("timeoutInterval")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setTimeoutInterval(value: Double) {
        val sel = ObjCRuntime.sel("setTimeoutInterval:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mainDocumentURL
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun mainDocumentURL(): MemorySegment {
        val sel = ObjCRuntime.sel("mainDocumentURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setMainDocumentURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMainDocumentURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property networkServiceType
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun networkServiceType(): NSURLRequestNetworkServiceType {
        val sel = ObjCRuntime.sel("networkServiceType")
        return NSURLRequestNetworkServiceType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setNetworkServiceType(value: NSURLRequestNetworkServiceType) {
        val sel = ObjCRuntime.sel("setNetworkServiceType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property allowsCellularAccess
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun allowsCellularAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsCellularAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsCellularAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsCellularAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsExpensiveNetworkAccess
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    override fun allowsExpensiveNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsExpensiveNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsExpensiveNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsExpensiveNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsConstrainedNetworkAccess
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    override fun allowsConstrainedNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsConstrainedNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsConstrainedNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsConstrainedNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsUltraConstrainedNetworkAccess
    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    override fun allowsUltraConstrainedNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsUltraConstrainedNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    open fun setAllowsUltraConstrainedNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsUltraConstrainedNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property assumesHTTP3Capable
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 4, introducedSubminor = -1)
    override fun assumesHTTP3Capable(): Boolean {
        val sel = ObjCRuntime.sel("assumesHTTP3Capable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 4, introducedSubminor = -1)
    open fun setAssumesHTTP3Capable(value: Boolean) {
        val sel = ObjCRuntime.sel("setAssumesHTTP3Capable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property attribution
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    override fun attribution(): NSURLRequestAttribution {
        val sel = ObjCRuntime.sel("attribution")
        return NSURLRequestAttribution(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    open fun setAttribution(value: NSURLRequestAttribution) {
        val sel = ObjCRuntime.sel("setAttribution:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property requiresDNSSECValidation
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 1, introducedSubminor = -1)
    override fun requiresDNSSECValidation(): Boolean {
        val sel = ObjCRuntime.sel("requiresDNSSECValidation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 1, introducedSubminor = -1)
    open fun setRequiresDNSSECValidation(value: Boolean) {
        val sel = ObjCRuntime.sel("setRequiresDNSSECValidation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsPersistentDNS
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun allowsPersistentDNS(): Boolean {
        val sel = ObjCRuntime.sel("allowsPersistentDNS")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsPersistentDNS(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsPersistentDNS:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cookiePartitionIdentifier
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 2, introducedSubminor = -1)
    override fun cookiePartitionIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("cookiePartitionIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 2, introducedSubminor = -1)
    open fun setCookiePartitionIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCookiePartitionIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSMutableHTTPURLRequest on NSMutableURLRequest ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setValue_forHTTPHeaderField(value: MemorySegment, field: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValue:forHTTPHeaderField:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, field)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.addValue_forHTTPHeaderField(value: MemorySegment, field: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addValue:forHTTPHeaderField:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, field)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setHTTPMethod(HTTPMethod: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPMethod:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPMethod)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setAllHTTPHeaderFields(allHTTPHeaderFields: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAllHTTPHeaderFields:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allHTTPHeaderFields)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setHTTPBody(HTTPBody: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPBody:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPBody)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setHTTPBodyStream(HTTPBodyStream: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPBodyStream:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPBodyStream)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableURLRequest.setHTTPShouldHandleCookies(HTTPShouldHandleCookies: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHTTPShouldHandleCookies:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPShouldHandleCookies)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Only supported in the classic loader, please adopt HTTP/2 and HTTP/3 instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Only supported in the classic loader, please adopt HTTP/2 and HTTP/3 instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 18, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Only supported in the classic loader, please adopt HTTP/2 and HTTP/3 instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Only supported in the classic loader, please adopt HTTP/2 and HTTP/3 instead")
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Only supported in the classic loader, please adopt HTTP/2 and HTTP/3 instead")
fun NSMutableURLRequest.setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHTTPShouldUsePipelining:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPShouldUsePipelining)
}
