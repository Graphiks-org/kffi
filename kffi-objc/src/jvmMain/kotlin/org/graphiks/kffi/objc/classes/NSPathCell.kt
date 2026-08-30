@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPathCell
 * Superclass: NSActionCell
 * Protocols: NSMenuItemValidation, NSOpenSavePanelDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSPathCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPathCell") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun pathComponentCellClass(): MemorySegment {
            val sel = ObjCRuntime.sel("pathComponentCellClass")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setObjectValue(obj: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, obj)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rectOfPathComponentCell_withFrame_inView(cell: MemorySegment, frame: NSRect, view: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("rectOfPathComponentCell:withFrame:inView:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, cell, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathComponentCellAtPoint_withFrame_inView(point: NSPoint, frame: NSRect, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("pathComponentCellAtPoint:withFrame:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mouseEntered_withFrame_inView(event: MemorySegment, frame: NSRect, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseEntered:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, event, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mouseExited_withFrame_inView(event: MemorySegment, frame: NSRect, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseExited:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, event, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view)
    }

    // @property pathStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathStyle(): NSPathStyle {
        val sel = ObjCRuntime.sel("pathStyle")
        return NSPathStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPathStyle(value: NSPathStyle) {
        val sel = ObjCRuntime.sel("setPathStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property URL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowedTypes
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowedTypes(): MemorySegment {
        val sel = ObjCRuntime.sel("allowedTypes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowedTypes(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAllowedTypes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSPathCellDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pathComponentCells
    /** @return NSArray<__kindof NSPathComponentCell *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathComponentCells(): MemorySegment {
        val sel = ObjCRuntime.sel("pathComponentCells")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPathComponentCells(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPathComponentCells:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property clickedPathComponentCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clickedPathComponentCell(): MemorySegment {
        val sel = ObjCRuntime.sel("clickedPathComponentCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property doubleAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doubleAction(): MemorySegment {
        val sel = ObjCRuntime.sel("doubleAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDoubleAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDoubleAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property placeholderString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
