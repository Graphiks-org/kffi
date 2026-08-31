@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFontCollection
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSFontCollection(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSFontCollection") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontCollectionWithDescriptors(queryDescriptors: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontCollectionWithDescriptors:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, queryDescriptors) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontCollectionWithLocale(locale: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontCollectionWithLocale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, locale) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun showFontCollection_withName_visibility_error(collection: MemorySegment, name: MemorySegment, visibility: NSFontCollectionVisibility, error: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("showFontCollection:withName:visibility:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, collection, name, visibility.rawValue, error) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun hideFontCollectionWithName_visibility_error(name: MemorySegment, visibility: NSFontCollectionVisibility, error: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("hideFontCollectionWithName:visibility:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, name, visibility.rawValue, error) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun renameFontCollectionWithName_visibility_toName_error(oldName: MemorySegment, visibility: NSFontCollectionVisibility, newName: MemorySegment, outError: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("renameFontCollectionWithName:visibility:toName:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, oldName, visibility.rawValue, newName, outError) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontCollectionWithName(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontCollectionWithName:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontCollectionWithName_visibility(name: MemorySegment, visibility: NSFontCollectionVisibility): MemorySegment {
            val sel = ObjCRuntime.sel("fontCollectionWithName:visibility:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, visibility.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontCollectionWithAllAvailableDescriptors(): MemorySegment {
            val sel = ObjCRuntime.sel("fontCollectionWithAllAvailableDescriptors")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSFontCollectionName> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun allFontCollectionNames(): MemorySegment {
            val sel = ObjCRuntime.sel("allFontCollectionNames")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchingDescriptorsWithOptions(options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("matchingDescriptorsWithOptions:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, options) as MemorySegment
    }

    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchingDescriptorsForFamily(family: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("matchingDescriptorsForFamily:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, family) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun matchingDescriptorsForFamily(family: String): MemorySegment = matchingDescriptorsForFamily(ObjCRuntime.newNSString(Arena.global(), family))

    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchingDescriptorsForFamily_options(family: MemorySegment, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("matchingDescriptorsForFamily:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, family, options) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun matchingDescriptorsForFamily_options(family: String, options: MemorySegment): MemorySegment = matchingDescriptorsForFamily_options(ObjCRuntime.newNSString(Arena.global(), family), options)

    // @property queryDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun queryDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("queryDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property exclusionDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun exclusionDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("exclusionDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property matchingDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchingDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("matchingDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSFontCollection.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSFontCollection.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSFontCollection.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSFontCollection.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
