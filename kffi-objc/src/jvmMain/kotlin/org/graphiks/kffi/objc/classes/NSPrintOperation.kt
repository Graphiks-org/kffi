@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPrintOperation
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPrintOperation(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPrintOperation") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printOperationWithView_printInfo(view: MemorySegment, printInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("printOperationWithView:printInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, printInfo) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun PDFOperationWithView_insideRect_toData_printInfo(view: MemorySegment, rect: NSRect, `data`: MemorySegment, printInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("PDFOperationWithView:insideRect:toData:printInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `data`, printInfo) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun PDFOperationWithView_insideRect_toPath_printInfo(view: MemorySegment, rect: NSRect, path: MemorySegment, printInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("PDFOperationWithView:insideRect:toPath:printInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), path, printInfo) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun PDFOperationWithView_insideRect_toPath_printInfo(view: MemorySegment, rect: NSRect, path: String, printInfo: MemorySegment): MemorySegment = PDFOperationWithView_insideRect_toPath_printInfo(view, rect, ObjCRuntime.newNSString(Arena.global(), path), printInfo)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun EPSOperationWithView_insideRect_toData_printInfo(view: MemorySegment, rect: NSRect, `data`: MemorySegment, printInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("EPSOperationWithView:insideRect:toData:printInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `data`, printInfo) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun EPSOperationWithView_insideRect_toPath_printInfo(view: MemorySegment, rect: NSRect, path: MemorySegment, printInfo: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("EPSOperationWithView:insideRect:toPath:printInfo:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), path, printInfo) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun EPSOperationWithView_insideRect_toPath_printInfo(view: MemorySegment, rect: NSRect, path: String, printInfo: MemorySegment): MemorySegment = EPSOperationWithView_insideRect_toPath_printInfo(view, rect, ObjCRuntime.newNSString(Arena.global(), path), printInfo)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printOperationWithView(view: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("printOperationWithView:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun PDFOperationWithView_insideRect_toData(view: MemorySegment, rect: NSRect, `data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("PDFOperationWithView:insideRect:toData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun EPSOperationWithView_insideRect_toData(view: MemorySegment, rect: NSRect, `data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("EPSOperationWithView:insideRect:toData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentOperation(): MemorySegment {
            val sel = ObjCRuntime.sel("currentOperation")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setCurrentOperation(currentOperation: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setCurrentOperation:")
            ObjCRuntime.msgSend(null, _class, sel, currentOperation)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runOperationModalForWindow_delegate_didRunSelector_contextInfo(docWindow: MemorySegment, delegate: MemorySegment, didRunSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runOperationModalForWindow:delegate:didRunSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, docWindow, delegate, didRunSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runOperation(): Boolean {
        val sel = ObjCRuntime.sel("runOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun createContext(): MemorySegment {
        val sel = ObjCRuntime.sel("createContext")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun destroyContext(): Unit {
        val sel = ObjCRuntime.sel("destroyContext")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deliverResult(): Boolean {
        val sel = ObjCRuntime.sel("deliverResult")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cleanUpOperation(): Unit {
        val sel = ObjCRuntime.sel("cleanUpOperation")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property copyingOperation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isCopyingOperation(): Boolean {
        val sel = ObjCRuntime.sel("isCopyingOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preferredRenderingQuality
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun preferredRenderingQuality(): NSPrintRenderingQuality {
        val sel = ObjCRuntime.sel("preferredRenderingQuality")
        return NSPrintRenderingQuality(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property jobTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun jobTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("jobTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setJobTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setJobTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun jobTitleAsString(): String = ObjCRuntime.toJavaString(jobTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setJobTitle(value: String) = setJobTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property showsPrintPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsPrintPanel(): Boolean {
        val sel = ObjCRuntime.sel("showsPrintPanel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsPrintPanel(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsPrintPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsProgressPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsProgressPanel(): Boolean {
        val sel = ObjCRuntime.sel("showsProgressPanel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsProgressPanel(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsProgressPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property printPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("printPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrintPanel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrintPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property PDFPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun PDFPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("PDFPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun setPDFPanel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPDFPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canSpawnSeparateThread
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canSpawnSeparateThread(): Boolean {
        val sel = ObjCRuntime.sel("canSpawnSeparateThread")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanSpawnSeparateThread(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanSpawnSeparateThread:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pageOrder
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pageOrder(): NSPrintingPageOrder {
        val sel = ObjCRuntime.sel("pageOrder")
        return NSPrintingPageOrder(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPageOrder(value: NSPrintingPageOrder) {
        val sel = ObjCRuntime.sel("setPageOrder:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property printInfo
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("printInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrintInfo(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrintInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property context
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun context(): MemorySegment {
        val sel = ObjCRuntime.sel("context")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property pageRange
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun pageRange(): NSRange {
        val sel = ObjCRuntime.sel("pageRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property currentPage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentPage(): Long {
        val sel = ObjCRuntime.sel("currentPage")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

// ── Category: NSDeprecated on NSPrintOperation ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Use -[NSPrintPanel addAccessoryController:] and -[NSPrintPanel removeAccessoryController:] instead")
fun NSPrintOperation.setAccessoryView(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAccessoryView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Use -[NSPrintPanel accessoryControllers] instead")
fun NSPrintOperation.accessoryView(): MemorySegment {
    val sel = ObjCRuntime.sel("accessoryView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSPrintOperation.setJobStyleHint(hint: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setJobStyleHint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hint)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSPrintOperation.jobStyleHint(): MemorySegment {
    val sel = ObjCRuntime.sel("jobStyleHint")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -setShowsPrintPanel: and -setShowsProgressPanel: instead")
fun NSPrintOperation.setShowPanels(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShowPanels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -showsPrintPanel and -showsProgressPanel instead")
fun NSPrintOperation.showPanels(): Boolean {
    val sel = ObjCRuntime.sel("showPanels")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
