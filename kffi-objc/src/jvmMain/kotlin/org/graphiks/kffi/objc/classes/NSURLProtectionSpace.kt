package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLProtectionSpace
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSURLProtectionSpace(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSURLProtectionSpace") }

    }

    open fun initWithHost_port_protocol_realm_authenticationMethod(host: MemorySegment, port: Long, protocol: MemorySegment, realm: MemorySegment, authenticationMethod: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithHost:port:protocol:realm:authenticationMethod:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, host, port, protocol, realm, authenticationMethod) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithHost_port_protocol_realm_authenticationMethod(host: String, port: Long, protocol: String, realm: String, authenticationMethod: String): MemorySegment = initWithHost_port_protocol_realm_authenticationMethod(ObjCRuntime.newNSString(Arena.global(), host), port, ObjCRuntime.newNSString(Arena.global(), protocol), ObjCRuntime.newNSString(Arena.global(), realm), ObjCRuntime.newNSString(Arena.global(), authenticationMethod))

    open fun initWithProxyHost_port_type_realm_authenticationMethod(host: MemorySegment, port: Long, type: MemorySegment, realm: MemorySegment, authenticationMethod: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithProxyHost:port:type:realm:authenticationMethod:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, host, port, type, realm, authenticationMethod) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithProxyHost_port_type_realm_authenticationMethod(host: String, port: Long, type: String, realm: String, authenticationMethod: String): MemorySegment = initWithProxyHost_port_type_realm_authenticationMethod(ObjCRuntime.newNSString(Arena.global(), host), port, ObjCRuntime.newNSString(Arena.global(), type), ObjCRuntime.newNSString(Arena.global(), realm), ObjCRuntime.newNSString(Arena.global(), authenticationMethod))

    // @property realm
    open fun realm(): MemorySegment {
        val sel = ObjCRuntime.sel("realm")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun realmAsString(): String = ObjCRuntime.toJavaString(realm())

    // @property receivesCredentialSecurely
    open fun receivesCredentialSecurely(): Boolean {
        val sel = ObjCRuntime.sel("receivesCredentialSecurely")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isProxy
    open fun isProxy(): Boolean {
        val sel = ObjCRuntime.sel("isProxy")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property host
    open fun host(): MemorySegment {
        val sel = ObjCRuntime.sel("host")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun hostAsString(): String = ObjCRuntime.toJavaString(host())

    // @property port
    open fun port(): Long {
        val sel = ObjCRuntime.sel("port")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property proxyType
    open fun proxyType(): MemorySegment {
        val sel = ObjCRuntime.sel("proxyType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun proxyTypeAsString(): String = ObjCRuntime.toJavaString(proxyType())

    // @property protocol
    open fun protocol(): MemorySegment {
        val sel = ObjCRuntime.sel("protocol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun protocolAsString(): String = ObjCRuntime.toJavaString(protocol())

    // @property authenticationMethod
    open fun authenticationMethod(): MemorySegment {
        val sel = ObjCRuntime.sel("authenticationMethod")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun authenticationMethodAsString(): String = ObjCRuntime.toJavaString(authenticationMethod())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSURLProtectionSpace.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSURLProtectionSpace.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSURLProtectionSpace_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSURLProtectionSpace")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSURLProtectionSpace.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSClientCertificateSpace on NSURLProtectionSpace ─────────────────────────────────────────

/** @return NSArray<NSData *> * */
fun NSURLProtectionSpace.distinguishedNames(): MemorySegment {
    val sel = ObjCRuntime.sel("distinguishedNames")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSServerTrustValidationSpace on NSURLProtectionSpace ─────────────────────────────────────────

fun NSURLProtectionSpace.serverTrust(): SecTrustRef {
    val sel = ObjCRuntime.sel("serverTrust")
    return SecTrustRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment)
}
