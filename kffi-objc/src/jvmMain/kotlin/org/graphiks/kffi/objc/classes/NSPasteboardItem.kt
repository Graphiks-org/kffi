@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPasteboardItem
 * Superclass: NSObject
 * Protocols: NSPasteboardWriting, NSPasteboardReading
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
open class NSPasteboardItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPasteboardItem") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun availableTypeFromArray(types: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("availableTypeFromArray:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, types) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDataProvider_forTypes(dataProvider: MemorySegment, types: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setDataProvider:forTypes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, dataProvider, types) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setData_forType(`data`: MemorySegment, type: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setData:forType:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `data`, type) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setString_forType(string: MemorySegment, type: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setString:forType:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string, type) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setString_forType(string: String, type: MemorySegment): Boolean = setString_forType(ObjCRuntime.newNSString(Arena.global(), string), type)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPropertyList_forType(propertyList: MemorySegment, type: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setPropertyList:forType:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, propertyList, type) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dataForType(type: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("dataForType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, type) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringForType(type: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("stringForType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, type) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun stringForTypeAsString(type: MemorySegment): String = ObjCRuntime.toJavaString(stringForType(type))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun propertyListForType(type: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("propertyListForType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, type) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun detectPatternsForPatterns_completionHandler(patterns: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("detectPatternsForPatterns:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, patterns, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun detectValuesForPatterns_completionHandler(patterns: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("detectValuesForPatterns:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, patterns, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun detectMetadataForTypes_completionHandler(types: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("detectMetadataForTypes:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, types, completionHandler)
    }

    // @property types
    /** @return NSArray<NSPasteboardType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun types(): MemorySegment {
        val sel = ObjCRuntime.sel("types")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSPasteboardItem.writableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("writableTypesForPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSPasteboardItem.pasteboardPropertyListForType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pasteboardPropertyListForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardReading. */
fun NSPasteboardItem_readableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("readableTypesForPasteboard:")
    val cls = ObjCRuntime.getClass("NSPasteboardItem")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pasteboard) as MemorySegment
}
