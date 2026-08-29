@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRelativeDateTimeFormatter
 * Superclass: NSFormatter
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
open class NSRelativeDateTimeFormatter(override val ptr: MemorySegment) : NSFormatter(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSRelativeDateTimeFormatter") }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun localizedStringFromDateComponents(dateComponents: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("localizedStringFromDateComponents:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, dateComponents) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    fun localizedStringFromDateComponentsAsString(dateComponents: MemorySegment): String = ObjCRuntime.toJavaString(localizedStringFromDateComponents(dateComponents))

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun localizedStringFromTimeInterval(timeInterval: Double): MemorySegment {
        val sel = ObjCRuntime.sel("localizedStringFromTimeInterval:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, timeInterval) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    fun localizedStringFromTimeIntervalAsString(timeInterval: Double): String = ObjCRuntime.toJavaString(localizedStringFromTimeInterval(timeInterval))

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun localizedStringForDate_relativeToDate(date: MemorySegment, referenceDate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("localizedStringForDate:relativeToDate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, date, referenceDate) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    fun localizedStringForDate_relativeToDateAsString(date: MemorySegment, referenceDate: MemorySegment): String = ObjCRuntime.toJavaString(localizedStringForDate_relativeToDate(date, referenceDate))

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    override fun stringForObjectValue(obj: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("stringForObjectValue:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, obj) as MemorySegment
    }

    // @property dateTimeStyle
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun dateTimeStyle(): NSRelativeDateTimeFormatterStyle {
        val sel = ObjCRuntime.sel("dateTimeStyle")
        return NSRelativeDateTimeFormatterStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setDateTimeStyle(value: NSRelativeDateTimeFormatterStyle) {
        val sel = ObjCRuntime.sel("setDateTimeStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property unitsStyle
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun unitsStyle(): NSRelativeDateTimeFormatterUnitsStyle {
        val sel = ObjCRuntime.sel("unitsStyle")
        return NSRelativeDateTimeFormatterUnitsStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setUnitsStyle(value: NSRelativeDateTimeFormatterUnitsStyle) {
        val sel = ObjCRuntime.sel("setUnitsStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property formattingContext
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun formattingContext(): NSFormattingContext {
        val sel = ObjCRuntime.sel("formattingContext")
        return NSFormattingContext(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setFormattingContext(value: NSFormattingContext) {
        val sel = ObjCRuntime.sel("setFormattingContext:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property calendar
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun calendar(): MemorySegment {
        val sel = ObjCRuntime.sel("calendar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setCalendar(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCalendar:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property locale
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun locale(): MemorySegment {
        val sel = ObjCRuntime.sel("locale")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setLocale(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLocale:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
