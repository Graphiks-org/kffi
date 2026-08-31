@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPrintInfo
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPrintInfo(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPrintInfo") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedPrintInfo(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedPrintInfo")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setSharedPrintInfo(sharedPrintInfo: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setSharedPrintInfo:")
            ObjCRuntime.msgSend(null, _class, sel, sharedPrintInfo)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun defaultPrinter(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultPrinter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDictionary(attributes: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDictionary:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributes) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return NSMutableDictionary<NSPrintInfoAttributeKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dictionary(): MemorySegment {
        val sel = ObjCRuntime.sel("dictionary")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUpPrintOperationDefaultValues(): Unit {
        val sel = ObjCRuntime.sel("setUpPrintOperationDefaultValues")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun PMPrintSession(): MemorySegment {
        val sel = ObjCRuntime.sel("PMPrintSession")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun PMPageFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("PMPageFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun PMPrintSettings(): MemorySegment {
        val sel = ObjCRuntime.sel("PMPrintSettings")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun updateFromPMPageFormat(): Unit {
        val sel = ObjCRuntime.sel("updateFromPMPageFormat")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun updateFromPMPrintSettings(): Unit {
        val sel = ObjCRuntime.sel("updateFromPMPrintSettings")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun takeSettingsFromPDFInfo(inPDFInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeSettingsFromPDFInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, inPDFInfo)
    }

    // @property paperName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun paperName(): MemorySegment {
        val sel = ObjCRuntime.sel("paperName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPaperName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPaperName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property paperSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun paperSize(): NSSize {
        val sel = ObjCRuntime.sel("paperSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPaperSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setPaperSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property orientation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orientation(): NSPaperOrientation {
        val sel = ObjCRuntime.sel("orientation")
        return NSPaperOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOrientation(value: NSPaperOrientation) {
        val sel = ObjCRuntime.sel("setOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property scalingFactor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun scalingFactor(): Double {
        val sel = ObjCRuntime.sel("scalingFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setScalingFactor(value: Double) {
        val sel = ObjCRuntime.sel("setScalingFactor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property leftMargin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leftMargin(): Double {
        val sel = ObjCRuntime.sel("leftMargin")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLeftMargin(value: Double) {
        val sel = ObjCRuntime.sel("setLeftMargin:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rightMargin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rightMargin(): Double {
        val sel = ObjCRuntime.sel("rightMargin")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRightMargin(value: Double) {
        val sel = ObjCRuntime.sel("setRightMargin:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property topMargin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun topMargin(): Double {
        val sel = ObjCRuntime.sel("topMargin")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTopMargin(value: Double) {
        val sel = ObjCRuntime.sel("setTopMargin:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bottomMargin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bottomMargin(): Double {
        val sel = ObjCRuntime.sel("bottomMargin")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBottomMargin(value: Double) {
        val sel = ObjCRuntime.sel("setBottomMargin:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property horizontallyCentered
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isHorizontallyCentered(): Boolean {
        val sel = ObjCRuntime.sel("isHorizontallyCentered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontallyCentered(value: Boolean) {
        val sel = ObjCRuntime.sel("setHorizontallyCentered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticallyCentered
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isVerticallyCentered(): Boolean {
        val sel = ObjCRuntime.sel("isVerticallyCentered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticallyCentered(value: Boolean) {
        val sel = ObjCRuntime.sel("setVerticallyCentered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property horizontalPagination
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun horizontalPagination(): NSPrintingPaginationMode {
        val sel = ObjCRuntime.sel("horizontalPagination")
        return NSPrintingPaginationMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontalPagination(value: NSPrintingPaginationMode) {
        val sel = ObjCRuntime.sel("setHorizontalPagination:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property verticalPagination
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun verticalPagination(): NSPrintingPaginationMode {
        val sel = ObjCRuntime.sel("verticalPagination")
        return NSPrintingPaginationMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticalPagination(value: NSPrintingPaginationMode) {
        val sel = ObjCRuntime.sel("setVerticalPagination:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property jobDisposition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun jobDisposition(): MemorySegment {
        val sel = ObjCRuntime.sel("jobDisposition")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setJobDisposition(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setJobDisposition:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property printer
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun printer(): MemorySegment {
        val sel = ObjCRuntime.sel("printer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrinter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrinter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageablePageBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageablePageBounds(): NSRect {
        val sel = ObjCRuntime.sel("imageablePageBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property localizedPaperName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedPaperName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedPaperName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedPaperNameAsString(): String = ObjCRuntime.toJavaString(localizedPaperName())

    // @property printSettings
    /** @return NSMutableDictionary<NSPrintInfoSettingKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun printSettings(): MemorySegment {
        val sel = ObjCRuntime.sel("printSettings")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectionOnly
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun isSelectionOnly(): Boolean {
        val sel = ObjCRuntime.sel("isSelectionOnly")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setSelectionOnly(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectionOnly:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSPrintInfo.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSPrintInfo.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

// ── Category: NSDeprecated on NSPrintInfo ─────────────────────────────────────────

// Class method: +[NSPrintInfo setDefaultPrinter:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1, message = "NSPrintInfo's implementation has no effect")
fun NSPrintInfo_setDefaultPrinter(printer: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDefaultPrinter:")
    val cls = ObjCRuntime.getClass("NSPrintInfo")
    ObjCRuntime.msgSend(null, cls, sel, printer)
}

// Class method: +[NSPrintInfo sizeForPaperName:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 2, deprecatedSubminor = -1, message = "Use -[NSPrinter pageSizeForPaper:] instead")
fun NSPrintInfo_sizeForPaperName(name: MemorySegment): NSSize {
    val sel = ObjCRuntime.sel("sizeForPaperName:")
    val cls = ObjCRuntime.getClass("NSPrintInfo")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, cls, sel, name))
}
