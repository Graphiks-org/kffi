@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableFontCollection
 * Superclass: NSFontCollection
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSMutableFontCollection(override val ptr: MemorySegment) : NSFontCollection(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMutableFontCollection") } }

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

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addQueryForDescriptors(descriptors: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addQueryForDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, descriptors)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeQueryForDescriptors(descriptors: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeQueryForDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, descriptors)
    }

    // @property queryDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun queryDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("queryDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setQueryDescriptors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setQueryDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property exclusionDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun exclusionDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("exclusionDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setExclusionDescriptors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setExclusionDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
