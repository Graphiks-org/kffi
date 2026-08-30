@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBrowserCell
 * Superclass: NSCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSBrowserCell(override val ptr: MemorySegment) : NSCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSBrowserCell") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun branchImage(): MemorySegment {
            val sel = ObjCRuntime.sel("branchImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun highlightedBranchImage(): MemorySegment {
            val sel = ObjCRuntime.sel("highlightedBranchImage")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightColorInView(controlView: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("highlightColorInView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, controlView) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reset(): Unit {
        val sel = ObjCRuntime.sel("reset")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property leaf
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isLeaf(): Boolean {
        val sel = ObjCRuntime.sel("isLeaf")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLeaf(value: Boolean) {
        val sel = ObjCRuntime.sel("setLeaf:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property loaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLoaded(value: Boolean) {
        val sel = ObjCRuntime.sel("setLoaded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alternateImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateImage(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAlternateImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
