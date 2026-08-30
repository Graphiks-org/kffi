@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewCompositionalLayout
 * Superclass: NSCollectionViewLayout
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionViewCompositionalLayout(override val ptr: MemorySegment) : NSCollectionViewLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewCompositionalLayout") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithSection(section: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSection:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, section) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithSection_configuration(section: MemorySegment, configuration: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSection:configuration:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, section, configuration) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithSectionProvider(sectionProvider: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSectionProvider:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sectionProvider) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithSectionProvider_configuration(sectionProvider: MemorySegment, configuration: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSectionProvider:configuration:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sectionProvider, configuration) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property configuration
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun configuration(): MemorySegment {
        val sel = ObjCRuntime.sel("configuration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setConfiguration(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
