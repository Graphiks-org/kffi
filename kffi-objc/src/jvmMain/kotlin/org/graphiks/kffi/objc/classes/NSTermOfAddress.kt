package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTermOfAddress
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSTermOfAddress(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTermOfAddress") }

        fun neutral(): MemorySegment {
            val sel = ObjCRuntime.sel("neutral")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun feminine(): MemorySegment {
            val sel = ObjCRuntime.sel("feminine")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun masculine(): MemorySegment {
            val sel = ObjCRuntime.sel("masculine")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun currentUser(): MemorySegment {
            val sel = ObjCRuntime.sel("currentUser")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun localizedForLanguageIdentifier_withPronouns(language: MemorySegment, pronouns: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("localizedForLanguageIdentifier:withPronouns:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, language, pronouns) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun localizedForLanguageIdentifier_withPronouns(language: String, pronouns: MemorySegment): MemorySegment = localizedForLanguageIdentifier_withPronouns(ObjCRuntime.newNSString(Arena.global(), language), pronouns)

        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property languageIdentifier
    open fun languageIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("languageIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun languageIdentifierAsString(): String = ObjCRuntime.toJavaString(languageIdentifier())

    // @property pronouns
    /** @return NSArray<NSMorphologyPronoun *> * */
    open fun pronouns(): MemorySegment {
        val sel = ObjCRuntime.sel("pronouns")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTermOfAddress.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSTermOfAddress.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTermOfAddress.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTermOfAddress_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTermOfAddress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
