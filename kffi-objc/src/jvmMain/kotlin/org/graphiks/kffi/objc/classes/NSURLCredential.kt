package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLCredential
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSURLCredential(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSURLCredential") }

    }

    // @property persistence
    open fun persistence(): NSURLCredentialPersistence {
        val sel = ObjCRuntime.sel("persistence")
        return NSURLCredentialPersistence(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSURLCredential.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSURLCredential.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSURLCredential_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSURLCredential")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSURLCredential.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSInternetPassword on NSURLCredential ─────────────────────────────────────────

fun NSURLCredential.initWithUser_password_persistence(user: MemorySegment, password: MemorySegment, persistence: NSURLCredentialPersistence): MemorySegment {
    val sel = ObjCRuntime.sel("initWithUser:password:persistence:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, user, password, persistence.rawValue) as MemorySegment
}

fun NSURLCredential.user(): MemorySegment {
    val sel = ObjCRuntime.sel("user")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSURLCredential.password(): MemorySegment {
    val sel = ObjCRuntime.sel("password")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSURLCredential.hasPassword(): Boolean {
    val sel = ObjCRuntime.sel("hasPassword")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// Class method: +[NSURLCredential credentialWithUser:password:persistence:]
fun NSURLCredential_credentialWithUser_password_persistence(user: MemorySegment, password: MemorySegment, persistence: NSURLCredentialPersistence): MemorySegment {
    val sel = ObjCRuntime.sel("credentialWithUser:password:persistence:")
    val cls = ObjCRuntime.getClass("NSURLCredential")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, user, password, persistence.rawValue) as MemorySegment
}

// ── Category: NSClientCertificate on NSURLCredential ─────────────────────────────────────────

fun NSURLCredential.initWithIdentity_certificates_persistence(identity: SecIdentityRef, certArray: MemorySegment, persistence: NSURLCredentialPersistence): MemorySegment {
    val sel = ObjCRuntime.sel("initWithIdentity:certificates:persistence:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, identity.segment, certArray, persistence.rawValue) as MemorySegment
}

fun NSURLCredential.identity(): SecIdentityRef {
    val sel = ObjCRuntime.sel("identity")
    return SecIdentityRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment)
}

fun NSURLCredential.certificates(): MemorySegment {
    val sel = ObjCRuntime.sel("certificates")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSURLCredential credentialWithIdentity:certificates:persistence:]
fun NSURLCredential_credentialWithIdentity_certificates_persistence(identity: SecIdentityRef, certArray: MemorySegment, persistence: NSURLCredentialPersistence): MemorySegment {
    val sel = ObjCRuntime.sel("credentialWithIdentity:certificates:persistence:")
    val cls = ObjCRuntime.getClass("NSURLCredential")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, identity.segment, certArray, persistence.rawValue) as MemorySegment
}

// ── Category: NSServerTrust on NSURLCredential ─────────────────────────────────────────

fun NSURLCredential.initWithTrust(trust: SecTrustRef): MemorySegment {
    val sel = ObjCRuntime.sel("initWithTrust:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, trust.segment) as MemorySegment
}

// Class method: +[NSURLCredential credentialForTrust:]
fun NSURLCredential_credentialForTrust(trust: SecTrustRef): MemorySegment {
    val sel = ObjCRuntime.sel("credentialForTrust:")
    val cls = ObjCRuntime.getClass("NSURLCredential")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, trust.segment) as MemorySegment
}
