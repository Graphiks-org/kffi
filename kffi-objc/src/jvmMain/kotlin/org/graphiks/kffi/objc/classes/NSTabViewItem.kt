package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTabViewItem
 * Superclass: NSObject
 * Protocols: NSCoding
 */
open class NSTabViewItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTabViewItem") }

        fun tabViewItemWithViewController(viewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tabViewItemWithViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, viewController) as MemorySegment
        }

    }

    open fun initWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    open fun drawLabel_inRect(shouldTruncateLabel: Boolean, labelRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawLabel:inRect:")
        ObjCRuntime.msgSend(null, ptr, sel, shouldTruncateLabel, ObjCRuntime.ObjCStructArg(labelRect.segment, NSRect.layout))
    }

    open fun sizeOfLabel(computeMin: Boolean): NSSize {
        val sel = ObjCRuntime.sel("sizeOfLabel:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, computeMin))
    }

    // @property identifier
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property color
    open fun color(): MemorySegment {
        val sel = ObjCRuntime.sel("color")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property label
    open fun label(): MemorySegment {
        val sel = ObjCRuntime.sel("label")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun labelAsString(): String = ObjCRuntime.toJavaString(label())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setLabel(value: String) = setLabel(ObjCRuntime.newNSString(Arena.global(), value))

    // @property image
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property view
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property viewController
    open fun viewController(): MemorySegment {
        val sel = ObjCRuntime.sel("viewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tabState
    open fun tabState(): NSTabState {
        val sel = ObjCRuntime.sel("tabState")
        return NSTabState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property tabView
    open fun tabView(): MemorySegment {
        val sel = ObjCRuntime.sel("tabView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property initialFirstResponder
    open fun initialFirstResponder(): MemorySegment {
        val sel = ObjCRuntime.sel("initialFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setInitialFirstResponder(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInitialFirstResponder:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property toolTip
    open fun toolTip(): MemorySegment {
        val sel = ObjCRuntime.sel("toolTip")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setToolTip(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setToolTip:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun toolTipAsString(): String = ObjCRuntime.toJavaString(toolTip())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setToolTip(value: String) = setToolTip(ObjCRuntime.newNSString(Arena.global(), value))

}

/** Required by Objective-C protocol NSCoding. */
fun NSTabViewItem.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTabViewItem.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
