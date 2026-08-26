package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableURLRequest
 * Superclass: NSURLRequest
 */
open class NSMutableURLRequest(override val ptr: MemorySegment) : NSURLRequest(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMutableURLRequest") }

    }

    // @property URL
    override fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cachePolicy
    override fun cachePolicy(): NSURLRequestCachePolicy {
        val sel = ObjCRuntime.sel("cachePolicy")
        return NSURLRequestCachePolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setCachePolicy(value: NSURLRequestCachePolicy) {
        val sel = ObjCRuntime.sel("setCachePolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property timeoutInterval
    override fun timeoutInterval(): Double {
        val sel = ObjCRuntime.sel("timeoutInterval")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setTimeoutInterval(value: Double) {
        val sel = ObjCRuntime.sel("setTimeoutInterval:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mainDocumentURL
    override fun mainDocumentURL(): MemorySegment {
        val sel = ObjCRuntime.sel("mainDocumentURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMainDocumentURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMainDocumentURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property networkServiceType
    override fun networkServiceType(): NSURLRequestNetworkServiceType {
        val sel = ObjCRuntime.sel("networkServiceType")
        return NSURLRequestNetworkServiceType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setNetworkServiceType(value: NSURLRequestNetworkServiceType) {
        val sel = ObjCRuntime.sel("setNetworkServiceType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property allowsCellularAccess
    override fun allowsCellularAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsCellularAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsCellularAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsCellularAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsExpensiveNetworkAccess
    override fun allowsExpensiveNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsExpensiveNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsExpensiveNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsExpensiveNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsConstrainedNetworkAccess
    override fun allowsConstrainedNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsConstrainedNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsConstrainedNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsConstrainedNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsUltraConstrainedNetworkAccess
    override fun allowsUltraConstrainedNetworkAccess(): Boolean {
        val sel = ObjCRuntime.sel("allowsUltraConstrainedNetworkAccess")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsUltraConstrainedNetworkAccess(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsUltraConstrainedNetworkAccess:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property assumesHTTP3Capable
    override fun assumesHTTP3Capable(): Boolean {
        val sel = ObjCRuntime.sel("assumesHTTP3Capable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAssumesHTTP3Capable(value: Boolean) {
        val sel = ObjCRuntime.sel("setAssumesHTTP3Capable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property attribution
    override fun attribution(): NSURLRequestAttribution {
        val sel = ObjCRuntime.sel("attribution")
        return NSURLRequestAttribution(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setAttribution(value: NSURLRequestAttribution) {
        val sel = ObjCRuntime.sel("setAttribution:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property requiresDNSSECValidation
    override fun requiresDNSSECValidation(): Boolean {
        val sel = ObjCRuntime.sel("requiresDNSSECValidation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setRequiresDNSSECValidation(value: Boolean) {
        val sel = ObjCRuntime.sel("setRequiresDNSSECValidation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsPersistentDNS
    override fun allowsPersistentDNS(): Boolean {
        val sel = ObjCRuntime.sel("allowsPersistentDNS")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsPersistentDNS(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsPersistentDNS:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cookiePartitionIdentifier
    override fun cookiePartitionIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("cookiePartitionIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCookiePartitionIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCookiePartitionIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSMutableHTTPURLRequest on NSMutableURLRequest ─────────────────────────────────────────

fun NSMutableURLRequest.setValue_forHTTPHeaderField(value: MemorySegment, field: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setValue:forHTTPHeaderField:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, field)
}

fun NSMutableURLRequest.addValue_forHTTPHeaderField(value: MemorySegment, field: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addValue:forHTTPHeaderField:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, field)
}

fun NSMutableURLRequest.setHTTPMethod(HTTPMethod: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPMethod:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPMethod)
}

fun NSMutableURLRequest.setAllHTTPHeaderFields(allHTTPHeaderFields: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAllHTTPHeaderFields:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allHTTPHeaderFields)
}

fun NSMutableURLRequest.setHTTPBody(HTTPBody: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPBody:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPBody)
}

fun NSMutableURLRequest.setHTTPBodyStream(HTTPBodyStream: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHTTPBodyStream:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPBodyStream)
}

fun NSMutableURLRequest.setHTTPShouldHandleCookies(HTTPShouldHandleCookies: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHTTPShouldHandleCookies:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPShouldHandleCookies)
}

fun NSMutableURLRequest.setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHTTPShouldUsePipelining:")
    ObjCRuntime.msgSend(null, this.ptr, sel, HTTPShouldUsePipelining)
}
