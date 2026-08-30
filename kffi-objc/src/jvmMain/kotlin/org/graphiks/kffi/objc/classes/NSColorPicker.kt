@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorPicker
 * Superclass: NSObject
 * Protocols: NSColorPickingDefault
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSColorPicker(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSColorPicker") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithPickerMask_colorPanel(mask: Long, owningColorPanel: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPickerMask:colorPanel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mask, owningColorPanel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertNewButtonImage_in(newButtonImage: MemorySegment, buttonCell: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertNewButtonImage:in:")
        ObjCRuntime.msgSend(null, ptr, sel, newButtonImage, buttonCell)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewSizeChanged(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewSizeChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attachColorList(colorList: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("attachColorList:")
        ObjCRuntime.msgSend(null, ptr, sel, colorList)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun detachColorList(colorList: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("detachColorList:")
        ObjCRuntime.msgSend(null, ptr, sel, colorList)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMode(mode: NSColorPanelMode): Unit {
        val sel = ObjCRuntime.sel("setMode:")
        ObjCRuntime.msgSend(null, ptr, sel, mode.rawValue)
    }

    // @property colorPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("colorPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property provideNewButtonImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun provideNewButtonImage(): MemorySegment {
        val sel = ObjCRuntime.sel("provideNewButtonImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property buttonToolTip
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttonToolTip(): MemorySegment {
        val sel = ObjCRuntime.sel("buttonToolTip")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttonToolTipAsString(): String = ObjCRuntime.toJavaString(buttonToolTip())

    // @property minContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minContentSize(): NSSize {
        val sel = ObjCRuntime.sel("minContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

}

/** Required by Objective-C protocol NSColorPickingDefault. */
fun NSColorPicker.alphaControlAddedOrRemoved(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("alphaControlAddedOrRemoved:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}
