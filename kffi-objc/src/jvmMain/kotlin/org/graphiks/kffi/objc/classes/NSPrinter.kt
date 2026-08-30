@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPrinter
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPrinter(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPrinter") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printerWithName(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("printerWithName:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printerWithName(name: String): MemorySegment = printerWithName(ObjCRuntime.newNSString(Arena.global(), name))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printerWithType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("printerWithType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printerNames(): MemorySegment {
            val sel = ObjCRuntime.sel("printerNames")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSPrinterTypeName> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printerTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("printerTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pageSizeForPaper(paperName: MemorySegment): NSSize {
        val sel = ObjCRuntime.sel("pageSizeForPaper:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, paperName))
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property type
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun type(): MemorySegment {
        val sel = ObjCRuntime.sel("type")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property languageLevel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun languageLevel(): Long {
        val sel = ObjCRuntime.sel("languageLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property deviceDescription
    /** @return NSDictionary<NSDeviceDescriptionKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deviceDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("deviceDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSPrinter.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSPrinter.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPrinter.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

// ── Category: NSDeprecated on NSPrinter ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.statusForTable(tableName: MemorySegment): NSPrinterTableStatus {
    val sel = ObjCRuntime.sel("statusForTable:")
    return NSPrinterTableStatus(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, tableName) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.isKey_inTable(key: MemorySegment, table: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, key, table) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.booleanForKey_inTable(key: MemorySegment, table: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("booleanForKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, key, table) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.floatForKey_inTable(key: MemorySegment, table: MemorySegment): Float {
    val sel = ObjCRuntime.sel("floatForKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel, key, table) as Float
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.intForKey_inTable(key: MemorySegment, table: MemorySegment): Int {
    val sel = ObjCRuntime.sel("intForKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, key, table) as Int
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.rectForKey_inTable(key: MemorySegment, table: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("rectForKey:inTable:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, key, table))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.sizeForKey_inTable(key: MemorySegment, table: MemorySegment): NSSize {
    val sel = ObjCRuntime.sel("sizeForKey:inTable:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, key, table))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.stringForKey_inTable(key: MemorySegment, table: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringForKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key, table) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1)
fun NSPrinter.stringListForKey_inTable(key: MemorySegment, table: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringListForKey:inTable:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key, table) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.imageRectForPaper(paperName: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("imageRectForPaper:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, paperName))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.acceptsBinary(): Boolean {
    val sel = ObjCRuntime.sel("acceptsBinary")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.isColor(): Boolean {
    val sel = ObjCRuntime.sel("isColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.isFontAvailable(faceName: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isFontAvailable:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, faceName) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.isOutputStackInReverseOrder(): Boolean {
    val sel = ObjCRuntime.sel("isOutputStackInReverseOrder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.domain(): MemorySegment {
    val sel = ObjCRuntime.sel("domain")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.host(): MemorySegment {
    val sel = ObjCRuntime.sel("host")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter.note(): MemorySegment {
    val sel = ObjCRuntime.sel("note")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSPrinter printerWithName:domain:includeUnavailable:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1)
fun NSPrinter_printerWithName_domain_includeUnavailable(name: MemorySegment, domain: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("printerWithName:domain:includeUnavailable:")
    val cls = ObjCRuntime.getClass("NSPrinter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, name, domain, flag) as MemorySegment
}
