package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPathCell
 * Superclass: NSActionCell
 * Protocols: NSMenuItemValidation, NSOpenSavePanelDelegate
 */
open class NSPathCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPathCell") }

        fun pathComponentCellClass(): MemorySegment {
            val sel = ObjCRuntime.sel("pathComponentCellClass")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    override fun setObjectValue(obj: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, obj)
    }

    open fun rectOfPathComponentCell_withFrame_inView(cell: MemorySegment, frame: NSRect, view: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("rectOfPathComponentCell:withFrame:inView:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, cell, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view))
    }

    open fun pathComponentCellAtPoint_withFrame_inView(point: NSPoint, frame: NSRect, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("pathComponentCellAtPoint:withFrame:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view) as MemorySegment
    }

    open fun mouseEntered_withFrame_inView(event: MemorySegment, frame: NSRect, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseEntered:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, event, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view)
    }

    open fun mouseExited_withFrame_inView(event: MemorySegment, frame: NSRect, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseExited:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, event, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), view)
    }

    // @property pathStyle
    open fun pathStyle(): NSPathStyle {
        val sel = ObjCRuntime.sel("pathStyle")
        return NSPathStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPathStyle(value: NSPathStyle) {
        val sel = ObjCRuntime.sel("setPathStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property URL
    open fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowedTypes
    /** @return NSArray<NSString *> * */
    open fun allowedTypes(): MemorySegment {
        val sel = ObjCRuntime.sel("allowedTypes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAllowedTypes(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAllowedTypes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSPathCellDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pathComponentCellClass
    open fun pathComponentCellClass(): MemorySegment {
        val sel = ObjCRuntime.sel("pathComponentCellClass")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property pathComponentCells
    /** @return NSArray<__kindof NSPathComponentCell *> * */
    open fun pathComponentCells(): MemorySegment {
        val sel = ObjCRuntime.sel("pathComponentCells")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPathComponentCells(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPathComponentCells:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property clickedPathComponentCell
    open fun clickedPathComponentCell(): MemorySegment {
        val sel = ObjCRuntime.sel("clickedPathComponentCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property doubleAction
    open fun doubleAction(): MemorySegment {
        val sel = ObjCRuntime.sel("doubleAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDoubleAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDoubleAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property placeholderString
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
