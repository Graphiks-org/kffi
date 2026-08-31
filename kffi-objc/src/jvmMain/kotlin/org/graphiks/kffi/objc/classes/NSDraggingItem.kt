@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDraggingItem
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSDraggingItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDraggingItem") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithPasteboardWriter(pasteboardWriter: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPasteboardWriter:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pasteboardWriter) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingFrame_contents(frame: NSRect, contents: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDraggingFrame:contents:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), contents)
    }

    // @property item
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun item(): MemorySegment {
        val sel = ObjCRuntime.sel("item")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property draggingFrame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingFrame(): NSRect {
        val sel = ObjCRuntime.sel("draggingFrame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setDraggingFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property imageComponentsProvider
    /** @return NSArray<NSDraggingImageComponent *> * _Nonnull (^)(void) */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageComponentsProvider(): MemorySegment {
        val sel = ObjCRuntime.sel("imageComponentsProvider")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageComponentsProvider(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImageComponentsProvider:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageComponents
    /** @return NSArray<NSDraggingImageComponent *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageComponents(): MemorySegment {
        val sel = ObjCRuntime.sel("imageComponents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
